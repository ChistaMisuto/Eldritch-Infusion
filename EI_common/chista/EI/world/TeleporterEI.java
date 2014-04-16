package chista.EI.world;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
//import net.minecraft.world.PortalPosition;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import chista.EI.block.BlockDreamBed;
import chista.EI.block.ModBlocks;
import chista.EI.item.ModItems;
import cpw.mods.fml.common.FMLLog;

public class TeleporterEI extends Teleporter {
	private final WorldServer worldServerInstance;
	/** A private Random() function in Teleporter */
	private final Random random;
	
	/** Stores successful portal placement locations for rapid lookup. */
	private final LongHashMap destinationCoordinateCache = new LongHashMap();

	/**
	 * A list of valid keys for the destinationCoordainteCache. These are based
	 * on the X & Z of the players initial location.
	 */
	private final List destinationCoordinateKeys = new ArrayList();

	public TeleporterEI(WorldServer par1WorldServer) {
		super(par1WorldServer);
		this.worldServerInstance = par1WorldServer;
		this.random = new Random(par1WorldServer.getSeed());
	}

	/**
	 * Place an entity in a nearby portal, creating one if necessary.
	 */
	public void placeInPortal(Entity player, double x, double y, double z, float rotationYaw) {
		
//		FMLLog.info("x: "+x+ "  y:"+y+ "  z: "+z, new Object[0]);
		
		if (this.worldServerInstance.provider.dimensionId != 0) {
			
			// Dimension spawn
			if (!this.placeInExistingPortal(player, x, y, z, rotationYaw)) {
				this.makePortal(player);
				this.placeInExistingPortal(player, x, y, z, rotationYaw);
			}
			
		} else {
			
			// Check if there is enough height to spawn
			
			player.setLocationAndAngles((double) x, (double) y, (double) z, player.rotationYaw, 0.0F);
			player.motionX = player.motionY = player.motionZ = 0.0D;
		}
	}

	/**
	 * Place an entity in a nearby portal which already exists.
	 */
	public boolean placeInExistingPortal(Entity player, double x, double y, double z, float rotationYaw) {
		short short1 = 128;
		double d3 = -1.0D;
		
		int portalStartX = 0;
		int portalStartY = 0;
		int portalStartZ = 0;
		
		int playerPosX = MathHelper.floor_double(player.posX);
		int playerPosY = MathHelper.floor_double(player.posZ);
		
		long chunkCoordIntPair = ChunkCoordIntPair.chunkXZ2Int(playerPosX, playerPosY);
		
		boolean flag = true;
		double chunkY;
		int posX;
		
		// Check if the portal position has been saved in the coordination cache
		if (this.destinationCoordinateCache.containsItem(chunkCoordIntPair)) {
			
			PortalPositionEI portalposition = (PortalPositionEI) this.destinationCoordinateCache.getValueByKey(chunkCoordIntPair);
			d3 = 0.0D;
			portalStartX = portalposition.posX;
			portalStartY = portalposition.posY;
			portalStartZ = portalposition.posZ;
			portalposition.lastUpdateTime = this.worldServerInstance.getTotalWorldTime();
			flag = false;
			
		} else {
			// Checks if the portal exists in the chunk
			
			for (posX = playerPosX - short1; posX <= playerPosX + short1; ++posX) {
				// original D5
				double chunkX = (double) posX + 0.5D - player.posX;
				
				for (int posY = playerPosY - short1; posY <= playerPosY + short1; ++posY) {
					// origianl D6
					double chunkZ = (double) posY + 0.5D - player.posZ;
					
					for (int height = this.worldServerInstance.getActualHeight() - 1; height >= 0; --height) {
						
						
						if (this.worldServerInstance.getBlock(posX, height, posY) == Blocks.redstone_block) {
							
							while (this.worldServerInstance.getBlock(posX, height - 1, posY) == Blocks.redstone_block) {
								--height;
							}
							
							// original D4
							chunkY = (double) height + 0.5D - player.posY;
							double d7 = chunkX * chunkX + chunkY * chunkY + chunkZ * chunkZ;
							if (d3 < 0.0D || d7 < d3) {
								d3 = d7;
								portalStartX = posX;
								portalStartY = height;
								portalStartZ = posY;
							}
						}
					}
				}
			}
		}
		
		
		if (d3 >= 0.0D) {
			
			// if flag, add portal position to coordinate cache
			if (flag) {
				this.destinationCoordinateCache.add(chunkCoordIntPair, new PortalPositionEI(this, portalStartX, portalStartY, portalStartZ, this.worldServerInstance.getTotalWorldTime()));
				this.destinationCoordinateKeys.add(Long.valueOf(chunkCoordIntPair));
			}
			
			
			double d8 = (double) portalStartX + 0.5D;
			double d9 = (double) portalStartY + 0.5D;
			chunkY = (double) portalStartZ + 0.5D;
			int j2 = -1;
			
			if (this.worldServerInstance.getBlock(portalStartX - 1, portalStartY, portalStartZ) == Blocks.redstone_block) {
				j2 = 2;
			}
			
			if (this.worldServerInstance.getBlock(portalStartX + 1, portalStartY, portalStartZ) == Blocks.redstone_block) {
				j2 = 0;
			}
			
			if (this.worldServerInstance.getBlock(portalStartX, portalStartY, portalStartZ - 1) == Blocks.redstone_block) {
				j2 = 3;
			}
			
			if (this.worldServerInstance.getBlock(portalStartX, portalStartY, portalStartZ + 1) == Blocks.redstone_block) {
				j2 = 1;
			}
			int k2 = player.getTeleportDirection();
			if (j2 > -1) {
				int l2 = Direction.rotateLeft[j2];
				int i3 = Direction.offsetX[j2];
				int j3 = Direction.offsetZ[j2];
				int k3 = Direction.offsetX[l2];
				int l3 = Direction.offsetZ[l2];
				boolean flag1 = !this.worldServerInstance.isAirBlock(portalStartX + i3 + k3, portalStartY, portalStartZ + j3 + l3) || !this.worldServerInstance.isAirBlock(portalStartX + i3 + k3, portalStartY + 1, portalStartZ + j3 + l3);
				boolean flag2 = !this.worldServerInstance.isAirBlock(portalStartX + i3, portalStartY, portalStartZ + j3) || !this.worldServerInstance.isAirBlock(portalStartX + i3, portalStartY + 1, portalStartZ + j3);
				if (flag1 && flag2) {
					j2 = Direction.rotateOpposite[j2];
					l2 = Direction.rotateOpposite[l2];
					i3 = Direction.offsetX[j2];
					j3 = Direction.offsetZ[j2];
					k3 = Direction.offsetX[l2];
					l3 = Direction.offsetZ[l2];
					posX = portalStartX - k3;
					d8 -= (double) k3;
					int i4 = portalStartZ - l3;
					chunkY -= (double) l3;
					flag1 = !this.worldServerInstance.isAirBlock(posX + i3 + k3, portalStartY, i4 + j3 + l3) || !this.worldServerInstance.isAirBlock(posX + i3 + k3, portalStartY + 1, i4 + j3 + l3);
					flag2 = !this.worldServerInstance.isAirBlock(posX + i3, portalStartY, i4 + j3) || !this.worldServerInstance.isAirBlock(posX + i3, portalStartY + 1, i4 + j3);
				}
				float f1 = 0.5F;
				float f2 = 0.5F;
				if (!flag1 && flag2) {
					f1 = 1.0F;
				} else if (flag1 && !flag2) {
					f1 = 0.0F;
				} else if (flag1 && flag2) {
					f2 = 0.0F;
				}
				d8 += (double) ((float) k3 * f1 + f2 * (float) i3);
				chunkY += (double) ((float) l3 * f1 + f2 * (float) j3);
				float f3 = 0.0F;
				float f4 = 0.0F;
				float f5 = 0.0F;
				float f6 = 0.0F;
				if (j2 == k2) {
					f3 = 1.0F;
					f4 = 1.0F;
				} else if (j2 == Direction.rotateOpposite[k2]) {
					f3 = -1.0F;
					f4 = -1.0F;
				} else if (j2 == Direction.rotateRight[k2]) {
					f5 = 1.0F;
					f6 = -1.0F;
				} else {
					f5 = -1.0F;
					f6 = 1.0F;
				}
				double d10 = player.motionX;
				double d11 = player.motionZ;
				player.motionX = d10 * (double) f3 + d11 * (double) f6;
				player.motionZ = d10 * (double) f5 + d11 * (double) f4;
				player.rotationYaw = rotationYaw - (float) (k2 * 90) + (float) (j2 * 90);
			} else {
				player.motionX = player.motionY = player.motionZ = 0.0D;
			}
			player.setLocationAndAngles(d8, d9, chunkY, player.rotationYaw, player.rotationPitch);
			return true;
		} else {
			return false;
		}
	}

	public boolean makePortal(Entity entity) {
		byte b0 = 16;
		double d0 = -1.0D;
		
		int entityPosX = MathHelper.floor_double(entity.posX);
		int entityPosY = MathHelper.floor_double(entity.posY);
		int entityPosZ = MathHelper.floor_double(entity.posZ);
		
		int posX = entityPosX;
		int posY = entityPosY;
		int posZ = entityPosZ;
		
		int k1 = 0;
		int random = this.random.nextInt(4);
		int xPosCounter;
		int zPosCounter;
		int worldHeight;
		int l2;
		int count;
		int j3;
		int k3;
		int i4;
		
		double chunkX;
		double chunkZ;
		double d3;
		double posYFinal;

		for (xPosCounter = entityPosX - b0; xPosCounter <= entityPosX + b0; ++xPosCounter) {
			
			chunkX = (double) xPosCounter + 0.5D - entity.posX;

			for (zPosCounter = entityPosZ - b0; zPosCounter <= entityPosZ + b0; ++zPosCounter) {
				chunkZ = (double) zPosCounter + 0.5D - entity.posZ;

				worldHeight = this.worldServerInstance.getActualHeight() - 1;
				
				if (this.worldServerInstance.isAirBlock(xPosCounter, worldHeight, zPosCounter)) {
					while (worldHeight > 0 && this.worldServerInstance.isAirBlock(xPosCounter, worldHeight - 1, zPosCounter)) {
						--worldHeight;
					}

					for (count = random; count < random + 4; ++count) {
						l2 = count % 2;
						k3 = 1 - l2;

						if (count % 4 >= 2) {
							l2 = -l2;
							k3 = -k3;
						}

						posYFinal = (double) worldHeight + 0.5D - entity.posY;
						d3 = chunkX * chunkX + posYFinal * posYFinal + chunkZ * chunkZ;

						if (d0 < 0.0D || d3 < d0) {
							d0 = d3;
							posX = xPosCounter;
							posY = worldHeight;
							posZ = zPosCounter;
							k1 = count % 4;
						}
					}
				}
			}
		}

		if (d0 < 0.0D) {
			for (xPosCounter = entityPosX - b0; xPosCounter <= entityPosX + b0; ++xPosCounter) {
				chunkX = (double) xPosCounter + 0.5D - entity.posX;

				for (zPosCounter = entityPosZ - b0; zPosCounter <= entityPosZ + b0; ++zPosCounter) {
					chunkZ = (double) zPosCounter + 0.5D - entity.posZ;

					worldHeight = this.worldServerInstance.getActualHeight() - 1;
					if (this.worldServerInstance.isAirBlock(xPosCounter, worldHeight, zPosCounter)) {
						while (worldHeight > 0 && this.worldServerInstance.isAirBlock(xPosCounter, worldHeight - 1, zPosCounter)) {
							--worldHeight;
						}

						for (count = random; count < random + 2; ++count) {
							l2 = count % 2;
							k3 = 1 - l2;

							posYFinal = (double) worldHeight + 0.5D - entity.posY;
							d3 = chunkX * chunkX + posYFinal * posYFinal + chunkZ * chunkZ;

							if (d0 < 0.0D || d3 < d0) {
								d0 = d3;
								posX = xPosCounter;
								posY = worldHeight;
								posZ = zPosCounter;
								k1 = count % 2;
							}
						}
					}
				}
			}
		}

		int i5 = posX;
		int j5 = posY;
		zPosCounter = posZ;
		int k5 = k1 % 2;
		int l5 = 1 - k5;

		if (k1 % 4 >= 2) {
			k5 = -k5;
			l5 = -l5;
		}

		boolean flag;

		if (d0 < 0.0D) {
			if (posY < 138) {
				posY = 138;
			}

			if (posY > this.worldServerInstance.getActualHeight() - 10) {
				posY = this.worldServerInstance.getActualHeight() - 10;
			}

			j5 = posY;

			for (worldHeight = -1; worldHeight <= 1; ++worldHeight) {
				for (count = 1; count < 3; ++count) {
					for (l2 = -1; l2 < 3; ++l2) {
						k3 = i5 + (count - 1) * k5 + worldHeight * l5;
						j3 = j5 + l2;
						i4 = zPosCounter + (count - 1) * l5 - worldHeight * k5;
						flag = l2 < 0;
						this.worldServerInstance.setBlock(k3, j3, i4, flag ? Blocks.bedrock : Blocks.air);
					}
				}
			}
		}

		for (worldHeight = 0; worldHeight < 4; ++worldHeight) {
			for (count = 0; count < 4; ++count) {
				for (l2 = -1; l2 < 4; ++l2) {
					k3 = i5 + (count - 1) * k5;
					j3 = j5 + l2;
					i4 = zPosCounter + (count - 1) * l5;
					flag = count == 0 || count == 3 || l2 == -1 || l2 == 3;
					this.worldServerInstance.setBlock(k3, j3, i4, flag ? Blocks.bedrock : ModBlocks.portalEI, 0, 2);
				}
			}

			for (count = 0; count < 4; ++count) {
				for (l2 = -1; l2 < 4; ++l2) {
					k3 = i5 + (count - 1) * k5;
					j3 = j5 + l2;
					i4 = zPosCounter + (count - 1) * l5;
					this.worldServerInstance.notifyBlocksOfNeighborChange(k3, j3, i4, this.worldServerInstance.getBlock(k3, j3, i4));
				}
			}
		}

		return true;
	}

	
	/**
	 * called periodically to remove out-of-date portal locations from the cache
	 * list. Argument par1 is a WorldServer.getTotalWorldTime() value.
	 */
	public void removeStalePortalLocations(long par1) {
		if (par1 % 100L == 0L) {
			Iterator iterator = this.destinationCoordinateKeys.iterator();
			long j = par1 - 600L;
			while (iterator.hasNext()) {
				Long olong = (Long) iterator.next();
				PortalPosition portalposition = (PortalPosition) this.destinationCoordinateCache.getValueByKey(olong.longValue());
				if (portalposition == null || portalposition.lastUpdateTime < j) {
					iterator.remove();
					this.destinationCoordinateCache.remove(olong.longValue());
				}
			}
		}
	}
}
