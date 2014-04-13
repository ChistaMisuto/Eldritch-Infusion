package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.item.gem.ModGems;
import chista.EI.lib.Strings;

public class OrePeridot extends ModOreBase {
	public OrePeridot(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.PERIDOTORE_NAME);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModGems.peridotGem.itemID;
	}
}
