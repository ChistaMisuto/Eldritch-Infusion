package chista.EI.block;

import java.util.Random;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import chista.EI.item.ModItems;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import chista.EI.world.ModWorlds;
import chista.EI.world.TeleporterEI;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDreamBed extends BlockDirectional {

	/** Maps the foot-of-bed block to the head-of-bed block. */
	public static final int[][] footBlockToHeadBlockMap = new int[][] { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };

	@SideOnly(Side.CLIENT)
	private IIcon[] bedSideIcons;
	@SideOnly(Side.CLIENT)
	private IIcon[] bedTopIcons;
	@SideOnly(Side.CLIENT)
	private IIcon[] bedFrontEndIcons;

	protected BlockDreamBed() {
		super(Material.cloth);
		this.setBounds();
		this.setBlockName(Strings.DREAMBED_NAME);
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (player instanceof EntityPlayerMP) {
			EntityPlayerMP thePlayer = (EntityPlayerMP) player;
			if (player.dimension != ModWorlds.eiDimensionId) {
				// Teleports player to the dimension
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ModWorlds.eiDimensionId, new TeleporterEI(thePlayer.mcServer.worldServerForDimension(ModWorlds.eiDimensionId)));
			} else {
				// Teleports the player back to the overworld
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterEI(thePlayer.mcServer.worldServerForDimension(0)));
			}
		}
		return true;
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		if (side == 0) {
			return Blocks.planks.getBlockTextureFromSide(side);
		} else {
			int k = getDirection(metadata);
			int l = Direction.bedDirection[k][side];
			int i1 = isBlockHeadOfBed(metadata) ? 1 : 0;
			return (i1 != 1 || l != 2) && (i1 != 0 || l != 3) ? (l != 5 && l != 4 ? this.bedTopIcons[i1] : this.bedSideIcons[i1]) : this.bedFrontEndIcons[i1];
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.bedTopIcons = new IIcon[] { icon.registerIcon(Reference.MOD_ID + ":dreamBed_feet_top"), icon.registerIcon(Reference.MOD_ID + ":dreamBed_head_top") };
		this.bedFrontEndIcons = new IIcon[] { icon.registerIcon(Reference.MOD_ID + ":dreamBed_feet_end"), icon.registerIcon(Reference.MOD_ID + ":dreamBed_head_end") };
		this.bedSideIcons = new IIcon[] { icon.registerIcon(Reference.MOD_ID + ":dreamBed_feet_side"), icon.registerIcon(Reference.MOD_ID + ":dreamBed_head_side") };
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType() {
		return 14;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y,
	 * z
	 */
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z) {
		this.setBounds();
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	public void onNeighborBlockChange(World par1World, int x, int y, int z, int neighborBlockId) {
		int i1 = par1World.getBlockMetadata(x, y, z);
		int j1 = getDirection(i1);

		if (isBlockHeadOfBed(i1)) {
			if (par1World.getBlock(x - footBlockToHeadBlockMap[j1][0], y, z - footBlockToHeadBlockMap[j1][1]) != this) {
				par1World.setBlockToAir(x, y, z);
			}
		} else if (par1World.getBlock(x + footBlockToHeadBlockMap[j1][0], y, z + footBlockToHeadBlockMap[j1][1]) != this) {
			par1World.setBlockToAir(x, y, z);

			if (!par1World.isRemote) {
				this.dropBlockAsItem(par1World, x, y, z, i1, 0);
			}
		}
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return (Item) (isBlockHeadOfBed(par1) ? 0 : ModItems.dreamBedItem);
	}

	/**
	 * Set the bounds of the bed block.
	 */
	private void setBounds() {
		// minX, minY, minZ, maxX, maxY, maxZ
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
	}

	/**
	 * Returns whether or not this bed block is the head of the bed.
	 */
	public static boolean isBlockHeadOfBed(int par0) {
		return (par0 & 8) != 0;
	}

	/**
	 * Return whether or not the bed is occupied.
	 */
	public static boolean isBedOccupied(int par0) {
		return (par0 & 4) != 0;
	}

	/**
	 * Sets whether or not the bed is occupied.
	 */
	public static void setBedOccupied(World world, int x, int y, int z, boolean bedOccupied) {
		int l = world.getBlockMetadata(x, y, z);

		if (bedOccupied) {
			l |= 4;
		} else {
			l &= -5;
		}

		world.setBlockMetadataWithNotify(x, y, z, l, 4);
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified
	 * items
	 */
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
		if (!isBlockHeadOfBed(par5)) {
			super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
		}
	}

	/**
	 * Returns the mobility information of the block, 0 = free, 1 = can't push
	 * but can move over, 2 = total immobility and stop pistons
	 */
	public int getMobilityFlag() {
		return 1;
	}

	/**
	 * only called by clickMiddleMouseButton , and passed to
	 * inventory.setCurrentItem (along with isCreative)
	 */
	@SideOnly(Side.CLIENT)
	public Item idPicked(World par1World, int par2, int par3, int par4) {
		return ModItems.dreamBedItem;
	}

	/**
	 * Called when the block is attempted to be harvested
	 */
	public void onBlockHarvested(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer) {
		if (par6EntityPlayer.capabilities.isCreativeMode && isBlockHeadOfBed(par5)) {
			int i1 = getDirection(par5);
			par2 -= footBlockToHeadBlockMap[i1][0];
			par4 -= footBlockToHeadBlockMap[i1][1];

			if (par1World.getBlock(par2, par3, par4) == this) {
				par1World.setBlockToAir(par2, par3, par4);
			}
		}
	}
}
