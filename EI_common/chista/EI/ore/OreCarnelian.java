package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.material.Material;
import chista.EI.item.ModItems;
import chista.EI.lib.Strings;

public class OreCarnelian extends ModOreBase {
	public OreCarnelian(int id) {
		super(id, Material.rock);
<<<<<<< HEAD:EI_common/chista/EI/ore/OreCarnelia.java
		this.setUnlocalizedName(Strings.CARNELIAORE_NAME);
=======
		this.setUnlocalizedName(Strings.CARNELIANORE_NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
>>>>>>> ba0838478c83d69efb9321f213c5f739610c6a3d:EI_common/chista/EI/ore/OreCarnelian.java
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return ModItems.carnelianGem.itemID;
	}
}
