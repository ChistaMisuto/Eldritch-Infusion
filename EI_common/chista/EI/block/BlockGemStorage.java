package chista.EI.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chista.EI.EI;
import chista.EI.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BlockGemStorage extends Block {

	private boolean blockTransparent;

	public BlockGemStorage(Boolean transparent) {
		super(Material.rock);
		this.setCreativeTab(EI.creativeTabEI);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.blockTransparent = transparent;
	}

	@Override
	public boolean renderAsNormalBlock() {
		if (this.blockTransparent) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isOpaqueCube() {
		if (this.blockTransparent) {
			return false;
		}
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		if (this.blockTransparent) {
			return 1;
		}
		return 0;
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int enchantLevel) {
		return Item.getItemFromBlock(this);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
