package chista.EI.ore;

import net.minecraft.block.Block;

import chista.EI.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModOres {

	// Mod block instances
	public static Block amethystOre;
	public static Block aquamarineOre;
	public static Block carnelianOre;
	public static Block garnetOre;
	public static Block hematiteOre;
	public static Block howliteOre;
	public static Block mountainCrystalOre;
	public static Block onyxOre;
	public static Block opalOre;
	public static Block peridotOre;
	public static Block rhodocrositeOre;
	public static Block spheneOre;
	public static Block spinelOre;
	public static Block tigersEyeOre;
	public static Block topazOre;
	public static Block tourmalineOre;

	public static void init() {

		// Load blocks
		amethystOre = new OreAmethyst();
		aquamarineOre = new OreAquamarine();
		carnelianOre = new OreCarnelian();
		garnetOre = new OreGarnet();
		hematiteOre = new OreHematite();
		howliteOre = new OreHowlite();
		mountainCrystalOre = new OreMountainCrystal();
		onyxOre = new OreOnyx();
		opalOre = new OreOpal();
		peridotOre = new OrePeridot();
		rhodocrositeOre = new OreRhodochrosite();
		spheneOre = new OreSphene();
		spinelOre = new OreSpinel();
		tigersEyeOre = new OreTigersEye();
		topazOre = new OreTopaz();
		tourmalineOre = new OreTourmaline();

		// Register blocks
		GameRegistry.registerBlock(amethystOre, Strings.AMETHYSTORE_NAME);
		GameRegistry.registerBlock(aquamarineOre, Strings.AQUAMARINEORE_NAME);
		GameRegistry.registerBlock(carnelianOre, Strings.CARNELIANORE_NAME);
		GameRegistry.registerBlock(garnetOre, Strings.GARNETORE_NAME);
		GameRegistry.registerBlock(hematiteOre, Strings.HEMATITEORE_NAME);
		GameRegistry.registerBlock(howliteOre, Strings.HOWLITEORE_NAME);
		GameRegistry.registerBlock(mountainCrystalOre, Strings.MOUNTAINCRYSTALORE_NAME);
		GameRegistry.registerBlock(onyxOre, Strings.ONYXORE_NAME);
		GameRegistry.registerBlock(opalOre, Strings.OPALORE_NAME);
		GameRegistry.registerBlock(peridotOre, Strings.PERIDOTORE_NAME);
		GameRegistry.registerBlock(rhodocrositeOre, Strings.RHODOCHROSITEORE_NAME);
		GameRegistry.registerBlock(spheneOre, Strings.SPHENEORE_NAME);
		GameRegistry.registerBlock(spinelOre, Strings.SPINELORE_NAME);
		GameRegistry.registerBlock(tigersEyeOre, Strings.TIGERSEYEORE_NAME);
		GameRegistry.registerBlock(topazOre, Strings.TOPAZORE_NAME);
		GameRegistry.registerBlock(tourmalineOre, Strings.TOURMALINEORE_NAME);
	}
}
