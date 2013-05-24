package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.item.ModItems;
import chista.EI.lib.Strings;

public class OreCarnelia extends ModOreBase {
	public OreCarnelia(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.CARNELIAORE_NAME);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModItems.carnelianGem.itemID;
	}
}
