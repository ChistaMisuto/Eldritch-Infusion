package chista.EI.item;

import net.minecraft.item.Item;
import chista.EI.lib.ItemIds;
import chista.EI.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
	// Mod item instances
	public static Item amethystGem;
	public static Item aquamarineGem;
	public static Item carnelianGem;
	public static Item garnetGem;
	public static Item hematiteGem;
	public static Item howliteGem;
	public static Item mountainCrystalGem;
	public static Item onyxGem;
	public static Item opalGem;
	public static Item peridotGem;
	public static Item rhodochrositeGem;
	public static Item spheneGem;
	public static Item spinelGem;
	public static Item tigersEyeGem;
	public static Item topazGem;
	public static Item tourmalineGem;

	public static void init() {
		// Load items
		amethystGem = new ItemAmethystGem(ItemIds.amethystGem);
		aquamarineGem = new ItemAquamarineGem(ItemIds.aquamarineGem);
		carnelianGem = new ItemCarnelianGem(ItemIds.carnelianGem);
		garnetGem = new ItemGarnetGem(ItemIds.garnetGem);
		hematiteGem = new ItemHematiteGem(ItemIds.hematiteGem);
		howliteGem = new ItemHowliteGem(ItemIds.howliteGem);
		mountainCrystalGem = new ItemMountainCrystalGem(
				ItemIds.mountainCrystalGem);
		onyxGem = new ItemOnyxGem(ItemIds.onyxGem);
		opalGem = new ItemOpalGem(ItemIds.opalGem);
		peridotGem = new ItemPeridotGem(ItemIds.peridotGem);
		rhodochrositeGem = new ItemRhodochrositeGem(ItemIds.rhodochrositeGem);
		spheneGem = new ItemSpheneGem(ItemIds.spheneGem);
		spinelGem = new ItemSpinelGem(ItemIds.spinelGem);
		tigersEyeGem = new ItemTigersEyeGem(ItemIds.tigersEyeGem);
		topazGem = new ItemTopazGem(ItemIds.topazGem);
		tourmalineGem = new ItemTourmalineGem(ItemIds.tourmalineGem);

		// Register items
		GameRegistry.registerItem(amethystGem, Strings.amethystGem);
		GameRegistry.registerItem(aquamarineGem, Strings.aquamarineGem);
		GameRegistry.registerItem(carnelianGem, Strings.carnelianGem);
		GameRegistry.registerItem(garnetGem, Strings.garnetGem);
		GameRegistry.registerItem(hematiteGem, Strings.hematiteGem);
		GameRegistry.registerItem(howliteGem, Strings.howliteGem);
		GameRegistry.registerItem(mountainCrystalGem,
				Strings.mountainCrystalGem);
		GameRegistry.registerItem(onyxGem, Strings.onyxGem);
		GameRegistry.registerItem(opalGem, Strings.opalGem);
		GameRegistry.registerItem(peridotGem, Strings.peridotGem);
		GameRegistry.registerItem(rhodochrositeGem, Strings.rhodochrositeGem);
		GameRegistry.registerItem(spheneGem, Strings.spheneGem);
		GameRegistry.registerItem(spinelGem, Strings.spinelGem);
		GameRegistry.registerItem(tigersEyeGem, Strings.tigersEyeGem);
		GameRegistry.registerItem(topazGem, Strings.topazGem);
		GameRegistry.registerItem(tourmalineGem, Strings.tourmalineGem);

		// Language registry
		LanguageRegistry.addName(amethystGem, "Amethyst");
		LanguageRegistry.addName(aquamarineGem, "Aquamarine");
		LanguageRegistry.addName(carnelianGem, "Carnelian Gem");
		LanguageRegistry.addName(garnetGem, "Garnet Gem");
		LanguageRegistry.addName(hematiteGem, "Hematite Gem");
		LanguageRegistry.addName(howliteGem, "Howlite Gem");
		LanguageRegistry.addName(mountainCrystalGem, "Mountain Crystal");
		LanguageRegistry.addName(onyxGem, "Onyx Gem");
		LanguageRegistry.addName(opalGem, "Opal Gem");
		LanguageRegistry.addName(peridotGem, "Peridot Gem");
		LanguageRegistry.addName(rhodochrositeGem, "Rhodochrosite Gem");
		LanguageRegistry.addName(spheneGem, "Sphene Gem");
		LanguageRegistry.addName(spinelGem, "Spinel Gem");
		LanguageRegistry.addName(tigersEyeGem, "Tigers eye");
		LanguageRegistry.addName(topazGem, "Topaz Gem");
		LanguageRegistry.addName(tourmalineGem, "Tourmaline Gem");
	}
}
