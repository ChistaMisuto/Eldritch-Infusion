package chista.EI.item.gem;

import net.minecraft.item.Item;
import chista.EI.lib.ItemIds;
import chista.EI.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModGems {
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
		amethystGem = new ItemAmethystGem(ItemIds.AMETHYSTGEM);
		aquamarineGem = new ItemAquamarineGem(ItemIds.AQUAMARINEGEM);
		carnelianGem = new ItemCarnelianGem(ItemIds.CARNELIANGEM);
		garnetGem = new ItemGarnetGem(ItemIds.GARNETGEM);
		hematiteGem = new ItemHematiteGem(ItemIds.HEMATITEGEM);
		howliteGem = new ItemHowliteGem(ItemIds.HOWLITEGEM);
		mountainCrystalGem = new ItemMountainCrystalGem( ItemIds.MOUNTAINCRYSTALGEM);
		onyxGem = new ItemOnyxGem(ItemIds.ONYXGEM);
		opalGem = new ItemOpalGem(ItemIds.OPALGEM);
		peridotGem = new ItemPeridotGem(ItemIds.PERIDOTGEM);
		rhodochrositeGem = new ItemRhodochrositeGem(ItemIds.RHODOCHROSITEGEM);
		spheneGem = new ItemSpheneGem(ItemIds.SPHENEGEM);
		spinelGem = new ItemSpinelGem(ItemIds.SPINELGEM);
		tigersEyeGem = new ItemTigersEyeGem(ItemIds.TIGERSEYEGEM);
		topazGem = new ItemTopazGem(ItemIds.TOPAZGEM);
		tourmalineGem = new ItemTourmalineGem(ItemIds.TOURMALINEGEM);

		// Register items
		GameRegistry.registerItem(amethystGem, Strings.AMETHYSTGEM_NAME);
		GameRegistry.registerItem(aquamarineGem, Strings.AQUAMARINEGEM_NAME);
		GameRegistry.registerItem(carnelianGem, Strings.CARNELIANGEM_NAME);
		GameRegistry.registerItem(garnetGem, Strings.GARNETGEM_NAME);
		GameRegistry.registerItem(hematiteGem, Strings.HEMATITEGEM_NAME);
		GameRegistry.registerItem(howliteGem, Strings.HOWLITEGEM_NAME);
		GameRegistry.registerItem(mountainCrystalGem, Strings.MOUNTAINCRYSTELGEM_NAME);
		GameRegistry.registerItem(onyxGem, Strings.ONYXGEM_NAME);
		GameRegistry.registerItem(opalGem, Strings.OPALGEM_NAME);
		GameRegistry.registerItem(peridotGem, Strings.PERIDOTGEM_NAME);
		GameRegistry.registerItem(rhodochrositeGem, Strings.RHODOCHROSITEGEM_NAME);
		GameRegistry.registerItem(spheneGem, Strings.SPHENEGEM_NAME);
		GameRegistry.registerItem(spinelGem, Strings.SPINELGEM_NAME);
		GameRegistry.registerItem(tigersEyeGem, Strings.TIGERSEYEGEM_NAME);
		GameRegistry.registerItem(topazGem, Strings.TOPAZGEM_NAME);
		GameRegistry.registerItem(tourmalineGem, Strings.TOURMALINEGEM_NAME);
	}
}
