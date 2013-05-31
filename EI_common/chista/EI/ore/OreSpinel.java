package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.item.gem.ModGems;
import chista.EI.lib.Strings;

public class OreSpinel extends ModOreBase {
	public OreSpinel(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.SPINELORE_NAME);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModGems.spinelGem.itemID;
	}
}
