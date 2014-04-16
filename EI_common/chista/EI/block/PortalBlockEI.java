package chista.EI.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import chista.EI.EI;
import chista.EI.world.ModWorlds;
import chista.EI.world.TeleporterEI;

public class PortalBlockEI extends BlockPortal {
	public PortalBlockEI() {
		super();
		this.setBlockName("portalBlockEI");
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

		if (world.getBlock(x - 1, y, z) == Blocks.redstone_block || world.getBlock(x + 1, y, z) == Blocks.redstone_block) {
			b0 = 1;
		}

		if (world.getBlock(x, y, z - 1) == Blocks.redstone_block || world.getBlock(x, y, z + 1) == Blocks.redstone_block) {
			b1 = 1;
		}

		if (b0 == b1) {
			return false;
		} else {
			if (world.getBlock(x - b0, y, z - b1) == Blocks.air) {
				x -= b0;
				z -= b1;
			}

			int l;
			int i1;

			for (l = -1; l <= 2; ++l) {
				for (i1 = -1; i1 <= 3; ++i1) {
					boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;

					if (l != -1 && l != 2 || i1 != -1 && i1 != 3) {
						Block j1 = world.getBlock(x + b0 * l, y + i1, z + b1 * l);

						if (flag) {
							if (j1 != Blocks.redstone_block) {
								return false;
							}
						} else if (j1 != Blocks.air && j1 != Blocks.fire) {
							return false;
						}
					}
				}
			}

			for (l = 0; l < 2; ++l) {
				for (i1 = 0; i1 < 3; ++i1) {
					world.setBlock(x + b0 * l, y + i1, z + b1 * l, ModBlocks.portalEI, 0, 2);
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

		if (world.getBlock(x - 1, y, z) == this || world.getBlock(x + 1, y, z) == this) {
			b0 = 1;
			b1 = 0;
		}

		int i1;

		for (i1 = y; world.getBlock(x, i1 - 1, z) == this; --i1) {
			;
		}

		if (world.getBlock(x, i1 - 1, z) != Blocks.redstone_block) {
			world.setBlockToAir(x, y, z);
		} else {
			int j1;

			for (j1 = 1; j1 < 4 && world.getBlock(x, i1 + j1, z) == this; ++j1) {
				;
			}

			if (j1 == 3 && world.getBlock(x, i1 + j1, z) == Blocks.redstone_block) {
				boolean flag = world.getBlock(x - 1, y, z) == this || world.getBlock(x + 1, y, z) == this;
				boolean flag1 = world.getBlock(x, y, z - 1) == this || world.getBlock(x, y, z + 1) == this;

				if (flag && flag1) {
					world.setBlockToAir(x, y, z);
				} else {
					if ((world.getBlock(x + b0, y, z + b1) != Blocks.redstone_block || world.getBlock(x - b0, y, z - b1) != this) && (world.getBlock(x - b0, y, z - b1) != Blocks.redstone_block || world.getBlock(x + b0, y, z + b1) != this)) {
						world.setBlockToAir(x, y, z);
					}
				}
			} else {
				world.setBlockToAir(x, y, z);
			}
		}
	}
}
