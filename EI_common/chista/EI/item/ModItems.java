package chista.EI.item;

import net.minecraft.item.Item;
import chista.EI.item.gem.ModGems;
import chista.EI.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item dreamBedItem;
	
	
	public static void init() {
		// Load other items
		ModGems.init();	  // Initialize gems
		
		
		dreamBedItem = new ItemDreamBed();
		
		GameRegistry.registerItem(dreamBedItem, Strings.DREAMBED_ITEM_NAME);
	}
}
