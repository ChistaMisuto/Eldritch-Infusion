package chista.EI.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chista.EI.EI;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockGlowGrass extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconGrassTop;

	public BlockGlowGrass() {
		super(Material.ground);
		this.setBlockName(Strings.GLOWGRASS_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int par1, int par2) {
		return par1 == 1 ? this.iconGrassTop : (par1 == 0 ? Blocks.dirt.getBlockTextureFromSide(par1) : blockIcon);
	}

	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return Item.getItemFromBlock(Blocks.dirt);
	}

	/**
	 * Retrieves the block texture to use based on the display side. Args:
	 * iBlockAccess, x, y, z, side
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getBlockTexture(IBlockAccess block, int x, int y, int z, int side) {
		if (side == 1) {
			return this.iconGrassTop;
		} else if (side == 0) {
			return Blocks.dirt.getBlockTextureFromSide(side);
		} else {
			return this.blockIcon;
		}
	}

	/**
	 * When this method is called, your block should register all the icons it
	 * needs with the given IconRegister. This is the only chance you get to
	 * register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":glowGrass_Side");
		this.iconGrassTop = iconRegister.registerIcon(Reference.MOD_ID + ":glowGrass_Top");
	}
}
