package chista.EI.block;

import chista.EI.lib.Strings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks {
	
	// Testing blocks
	public static Block glowGrass;
	public static Block gravusbloomFlower;
	public static Block fairyCap;
	public static Block honeyFungus;
	
	// Work in progress
	public static Block portalEI;
	public static Block dreamBed;
	
	// Ore storage blocks
	public static Block amethystBlock;
	public static Block aquamarineBlock;
	public static Block carnelianBlock;
	public static Block garnetBlock;
	public static Block hematiteBlock;
	public static Block howliteBlock;
	public static Block mountainCrystalBlock;
	public static Block onyxBlock;
	public static Block opalBlock;
	public static Block peridotBlock;
	public static Block rhodochrositeBlock;
	public static Block spheneBlock;
	public static Block spinelBlock;
	public static Block tigersEyeBlock;
	public static Block topazBlock;
	public static Block tourmalineBlock;
	
	public static void init() {
		portalEI = new PortalBlockEI();
		dreamBed = new BlockDreamBed();
		
		glowGrass = new BlockGlowGrass();
		GameRegistry.registerBlock(glowGrass, Strings.GLOWGRASS_NAME);
		
		gravusbloomFlower = new BlockGravusbloom();
		GameRegistry.registerBlock(gravusbloomFlower, Strings.GRAVUSBLOOM_NAME);
		
		fairyCap = new BlockFairyCap();
		GameRegistry.registerBlock(fairyCap, Strings.FAIRYCAP_NAME);
		
		honeyFungus = new BlockHoneyFungus();
		GameRegistry.registerBlock(honeyFungus, Strings.HONEYFUNGUS_NAME);
		
		
		loadGemStorage();
		registerBlocks();
	}
	
	public static void loadGemStorage() {
		amethystBlock = new BlockGemStorage(true).setBlockName(Strings.AMETHYSTSTORAGEBLOCK_NAME);
		aquamarineBlock = new BlockGemStorage(true).setBlockName(Strings.AQUAMARINEORAGEBLOCK_NAME);
		carnelianBlock = new BlockGemStorage(false).setBlockName(Strings.CARNELIANORAGEBLOCK_NAME);
		garnetBlock = new BlockGemStorage(true).setBlockName(Strings.GARNETSTORAGEBLOCK_NAME);
		hematiteBlock = new BlockGemStorage(false).setBlockName(Strings.HEMATITESTORAGEBLOCK_NAME);
		howliteBlock = new BlockGemStorage(false).setBlockName(Strings.HOWLITESTORAGEBLOCK_NAME);
		mountainCrystalBlock = new BlockGemStorage(true).setBlockName(Strings.MOUNTAINCRYSTALSTORAGEBLOCK_NAME);
		onyxBlock = new BlockGemStorage(false).setBlockName(Strings.ONYXSTORAGEBLOCK_NAME);
		opalBlock = new BlockGemStorage(false).setBlockName(Strings.OPALSTORAGEBLOCK_NAME);
		peridotBlock = new BlockGemStorage(true).setBlockName(Strings.PERIDOTSTORAGEBLOCK_NAME);
		rhodochrositeBlock = new BlockGemStorage(false).setBlockName(Strings.RHODOCHROSITESTORAGEBLOCK_NAME);
		spheneBlock = new BlockGemStorage(true).setBlockName(Strings.SPHENESTORAGEBLOCK_NAME);
		spinelBlock = new BlockGemStorage(true).setBlockName(Strings.SPINELSTORAGEBLOCK_NAME);
		tigersEyeBlock = new BlockGemStorage(true).setBlockName(Strings.TIGERSEYESTORAGEBLOCK_NAME);
		topazBlock = new BlockGemStorage(true).setBlockName(Strings.TOPAZSTORAGEBLOCK_NAME);
		tourmalineBlock = new BlockGemStorage(true).setBlockName(Strings.TOURMALINESTORAGEBLOCK_NAME);
	}
	
	public static void registerBlocks() {
		// Blocks
		GameRegistry.registerBlock(portalEI, "portalBlockEI");
		GameRegistry.registerBlock(dreamBed, Strings.DREAMBED_NAME);
		
		// Storage blocks
		GameRegistry.registerBlock(amethystBlock, Strings.AMETHYSTSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(aquamarineBlock, Strings.AQUAMARINEORAGEBLOCK_NAME);
		GameRegistry.registerBlock(carnelianBlock, Strings.CARNELIANORAGEBLOCK_NAME);
		GameRegistry.registerBlock(garnetBlock, Strings.GARNETSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(hematiteBlock, Strings.HEMATITESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(howliteBlock, Strings.HOWLITESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(mountainCrystalBlock, Strings.MOUNTAINCRYSTALSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(onyxBlock, Strings.ONYXSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(opalBlock, Strings.OPALSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(peridotBlock, Strings.PERIDOTSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(rhodochrositeBlock, Strings.RHODOCHROSITESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(spheneBlock, Strings.SPHENESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(spinelBlock, Strings.SPINELSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(tigersEyeBlock, Strings.TIGERSEYESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(topazBlock, Strings.TOPAZSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(tourmalineBlock, Strings.TOURMALINESTORAGEBLOCK_NAME);
	}
}
