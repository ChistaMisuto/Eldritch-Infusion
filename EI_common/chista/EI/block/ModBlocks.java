package chista.EI.block;

import chista.EI.lib.BlockIds;
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
		portalEI = new PortalBlockEI(559);
		dreamBed = new BlockDreamBed(BlockIds.DREAMBED);
		
		glowGrass = new BlockGlowGrass(BlockIds.GLOWGRASS);
		GameRegistry.registerBlock(glowGrass, Strings.GLOWGRASS_NAME);
		
		gravusbloomFlower = new BlockGravusbloom(BlockIds.GRAVUSBLOOM);
		GameRegistry.registerBlock(gravusbloomFlower, Strings.GRAVUSBLOOM_NAME);
		
		fairyCap = new BlockFairyCap(BlockIds.FAIRYCAP);
		GameRegistry.registerBlock(fairyCap, Strings.FAIRYCAP_NAME);
		
		honeyFungus = new BlockHoneyFungus(BlockIds.HONEYFUNGUS);
		GameRegistry.registerBlock(honeyFungus, Strings.HONEYFUNGUS_NAME);
		
		
		loadGemStorage();
		registerBlocks();
	}
	
	public static void loadGemStorage() {
		amethystBlock = new BlockGemStorage(BlockIds.AMETHYSTSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.AMETHYSTSTORAGEBLOCK_NAME);
		aquamarineBlock = new BlockGemStorage(BlockIds.AQUAMARINEORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.AQUAMARINEORAGEBLOCK_NAME);
		carnelianBlock = new BlockGemStorage(BlockIds.CARNELIANORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.CARNELIANORAGEBLOCK_NAME);
		garnetBlock = new BlockGemStorage(BlockIds.GARNETSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.GARNETSTORAGEBLOCK_NAME);
		hematiteBlock = new BlockGemStorage(BlockIds.HEMATITESTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.HEMATITESTORAGEBLOCK_NAME);
		howliteBlock = new BlockGemStorage(BlockIds.HOWLITESTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.HOWLITESTORAGEBLOCK_NAME);
		mountainCrystalBlock = new BlockGemStorage(BlockIds.MOUNTAINCRYSTALSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.MOUNTAINCRYSTALSTORAGEBLOCK_NAME);
		onyxBlock = new BlockGemStorage(BlockIds.ONYXSTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.ONYXSTORAGEBLOCK_NAME);
		opalBlock = new BlockGemStorage(BlockIds.OPALSTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.OPALSTORAGEBLOCK_NAME);
		peridotBlock = new BlockGemStorage(BlockIds.PERIDOTSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.PERIDOTSTORAGEBLOCK_NAME);
		rhodochrositeBlock = new BlockGemStorage(BlockIds.RHODOCHROSITESTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.RHODOCHROSITESTORAGEBLOCK_NAME);
		spheneBlock = new BlockGemStorage(BlockIds.SPHENESTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.SPHENESTORAGEBLOCK_NAME);
		spinelBlock = new BlockGemStorage(BlockIds.SPINELSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.SPINELSTORAGEBLOCK_NAME);
		tigersEyeBlock = new BlockGemStorage(BlockIds.TIGERSEYESTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.TIGERSEYESTORAGEBLOCK_NAME);
		topazBlock = new BlockGemStorage(BlockIds.TOPAZSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.TOPAZSTORAGEBLOCK_NAME);
		tourmalineBlock = new BlockGemStorage(BlockIds.TOURMALINESTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.TOURMALINESTORAGEBLOCK_NAME);
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
