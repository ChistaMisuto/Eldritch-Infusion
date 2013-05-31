package chista.EI.item;

import net.minecraft.item.Item;
import chista.EI.lib.ItemIds;
import chista.EI.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item dreamBedItem;
	
	
	public static void init() {
		dreamBedItem = new ItemDreamBed(ItemIds.DREAMBEDITEM);
		
		GameRegistry.registerItem(dreamBedItem, Strings.DREAMBED_ITEM_NAME);
	}
}
