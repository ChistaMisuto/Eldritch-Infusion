package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.item.gem.ModGems;
import chista.EI.lib.Strings;

public class OreOnyx extends ModOreBase {
	public OreOnyx(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.ONYXORE_NAME);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModGems.onyxGem.itemID;
	}
}
