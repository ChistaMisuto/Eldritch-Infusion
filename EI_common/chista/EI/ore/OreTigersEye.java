package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import chista.EI.item.ModItems;
import chista.EI.lib.Strings;

public class OreTigersEye extends ModOreBase {
	public OreTigersEye(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.TIGERSEYEORE_NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModItems.tigersEyeGem.itemID;
	}
}
