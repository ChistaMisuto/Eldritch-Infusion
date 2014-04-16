package chista.EI.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import chista.EI.EI;
import chista.EI.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlock extends Block {
	public StorageBlock(int id, Material material) {
		super(material);
		this.setCreativeTab(EI.creativeTabEI);

		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
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