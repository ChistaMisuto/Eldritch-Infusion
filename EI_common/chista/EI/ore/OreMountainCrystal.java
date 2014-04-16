package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import chista.EI.item.gem.ModGems;
import chista.EI.lib.Strings;

public class OreMountainCrystal extends ModOreBase {
	public OreMountainCrystal() {
		super(Material.rock);
		this.setBlockName(Strings.MOUNTAINCRYSTALORE_NAME);
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int par2) {
		return ModGems.mountainCrystalGem;
	}
}
