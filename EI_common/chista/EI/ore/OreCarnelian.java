package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.EI;
import chista.EI.item.ModItems;
import chista.EI.lib.Strings;

public class OreCarnelian extends ModOreBase {
	public OreCarnelian(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.CARNELIANORE_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModItems.carnelianGem.itemID;
	}
}
