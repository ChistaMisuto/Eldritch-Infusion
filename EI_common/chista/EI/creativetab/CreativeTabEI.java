package chista.EI.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chista.EI.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabEI extends CreativeTabs {
	
	public CreativeTabEI(int id, String modID) {
		super(id, modID);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return ModItems.topazGem.itemID;
	} 
}