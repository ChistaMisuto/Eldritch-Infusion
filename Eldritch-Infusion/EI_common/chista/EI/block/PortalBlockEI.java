package chista.EI.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import chista.EI.EI;
import chista.EI.world.ModWorlds;
import chista.EI.world.TeleporterEI;

public class PortalBlockEI extends BlockPortal {
	public PortalBlockEI(int id) {
		super(id);
		this.setUnlocalizedName("portalBlockEI");
		this.setCreativeTab(EI.creativeTabEI);
		this.setTickRandomly(true);
	}

	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity instanceof EntityPlayerMP) {
			EntityPlayerMP thePlayer = (EntityPlayerMP) entity;
			if (entity.dimension != ModWorlds.eiDimensionId) {
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ModWorlds.eiDimensionId, new TeleporterEI(thePlayer.mcServer.worldServerForDimension(ModWorlds.eiDimensionId)));
			} else {
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterEI(thePlayer.mcServer.worldServerForDimension(0)));
			}
		}
	}

	public void updateTick(World world, int x, int y, int z, Random random) {
		// Disable zombie pigman spawn
	}

	public boolean tryToCreatePortal(World world, int x, int y, int z) {
		byte b0 = 0;
		byte b1 = 0;

		if (world.getBlockId(x - 1, y, z) == Block.blockRedstone.blockID || world.getBlockId(x + 1, y, z) == Block.blockRedstone.blockID) {
			b0 = 1;
		}

		if (world.getBlockId(x, y, z - 1) == Block.blockRedstone.blockID || world.getBlockId(x, y, z + 1) == Block.blockRedstone.blockID) {
			b1 = 1;
		}

		if (b0 == b1) {
			return false;
		} else {
			if (world.getBlockId(x - b0, y, z - b1) == 0) {
				x -= b0;
				z -= b1;
			}

			int l;
			int i1;

			for (l = -1; l <= 2; ++l) {
				for (i1 = -1; i1 <= 3; ++i1) {
					boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;

					if (l != -1 && l != 2 || i1 != -1 && i1 != 3) {
						int j1 = world.getBlockId(x + b0 * l, y + i1, z + b1 * l);

						if (flag) {
							if (j1 != Block.blockRedstone.blockID) {
								return false;
							}
						} else if (j1 != 0 && j1 != Block.fire.blockID) {
							return false;
						}
					}
				}
			}

			for (l = 0; l < 2; ++l) {
				for (i1 = 0; i1 < 3; ++i1) {
					world.setBlock(x + b0 * l, y + i1, z + b1 * l, ModBlocks.portalEI.blockID, 0, 2);
				}
			}

			return true;
		}
	}

	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		// Disable particles
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	public void onNeighborBlockChange(World world, int x, int y, int z, int neighborBlockID) {
		byte b0 = 0;
		byte b1 = 1;

		if (world.getBlockId(x - 1, y, z) == this.blockID || world.getBlockId(x + 1, y, z) == this.blockID) {
			b0 = 1;
			b1 = 0;
		}

		int i1;

		for (i1 = y; world.getBlockId(x, i1 - 1, z) == this.blockID; --i1) {
			;
		}

		if (world.getBlockId(x, i1 - 1, z) != Block.blockRedstone.blockID) {
			world.setBlockToAir(x, y, z);
		} else {
			int j1;

			for (j1 = 1; j1 < 4 && world.getBlockId(x, i1 + j1, z) == this.blockID; ++j1) {
				;
			}

			if (j1 == 3 && world.getBlockId(x, i1 + j1, z) == Block.blockRedstone.blockID) {
				boolean flag = world.getBlockId(x - 1, y, z) == this.blockID || world.getBlockId(x + 1, y, z) == this.blockID;
				boolean flag1 = world.getBlockId(x, y, z - 1) == this.blockID || world.getBlockId(x, y, z + 1) == this.blockID;

				if (flag && flag1) {
					world.setBlockToAir(x, y, z);
				} else {
					if ((world.getBlockId(x + b0, y, z + b1) != Block.blockRedstone.blockID || world.getBlockId(x - b0, y, z - b1) != this.blockID) && (world.getBlockId(x - b0, y, z - b1) != Block.blockRedstone.blockID || world.getBlockId(x + b0, y, z + b1) != this.blockID)) {
						world.setBlockToAir(x, y, z);
					}
				}
			} else {
				world.setBlockToAir(x, y, z);
			}
		}
	}
}
