package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.item.ModItems;
import chista.EI.lib.Strings;

public class OreGarnet extends ModOreBase {
	public OreGarnet(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.GARNETORE_NAME);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModItems.garnetGem.itemID;
	}
}
