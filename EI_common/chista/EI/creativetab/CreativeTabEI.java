package chista.EI.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chista.EI.item.gem.ModGems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEI extends CreativeTabs {
	
	public CreativeTabEI(int id, String modID) {
		super(id, modID);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ModGems.topazGem;
	}
}