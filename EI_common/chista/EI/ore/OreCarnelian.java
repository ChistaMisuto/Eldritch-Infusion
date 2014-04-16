package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import chista.EI.EI;
import chista.EI.item.gem.ModGems;
import chista.EI.lib.Strings;

public class OreCarnelian extends ModOreBase {
	public OreCarnelian() {
		super(Material.rock);
		this.setBlockName(Strings.CARNELIANORE_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int par2) {
		return ModGems.carnelianGem;
	}
}
