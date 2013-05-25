package chista.EI.item;

import net.minecraft.item.Item;
import chista.EI.lib.ItemIds;
import chista.EI.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

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
		GameRegistry.registerItem(amethystGem, Strings.amethystGem);
		GameRegistry.registerItem(aquamarineGem, Strings.aquamarineGem);
		GameRegistry.registerItem(carnelianGem, Strings.carnelianGem);
		GameRegistry.registerItem(garnetGem, Strings.garnetGem);
		GameRegistry.registerItem(hematiteGem, Strings.hematiteGem);
		GameRegistry.registerItem(howliteGem, Strings.howliteGem);
		GameRegistry.registerItem(mountainCrystalGem, Strings.mountainCrystalGem);
		GameRegistry.registerItem(onyxGem, Strings.onyxGem);
		GameRegistry.registerItem(opalGem, Strings.opalGem);
		GameRegistry.registerItem(peridotGem, Strings.peridotGem);
		GameRegistry.registerItem(rhodochrositeGem, Strings.rhodochrositeGem);
		GameRegistry.registerItem(spheneGem, Strings.spheneGem);
		GameRegistry.registerItem(spinelGem, Strings.spinelGem);
		GameRegistry.registerItem(tigersEyeGem, Strings.tigersEyeGem);
		GameRegistry.registerItem(topazGem, Strings.topazGem);
		GameRegistry.registerItem(tourmalineGem, Strings.tourmalineGem);
	}
}
