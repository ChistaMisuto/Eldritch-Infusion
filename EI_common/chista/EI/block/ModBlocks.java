package chista.EI.block;

import chista.EI.lib.BlockIds;
import chista.EI.lib.Strings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks {
	
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
	
	public static void init() {
		portalEI = new PortalBlockEI(559);
		dreamBed = new BlockDreamBed(BlockIds.DREAMBED);
		
		amethystBlock = new BlockGemStorage(BlockIds.AMETHYSTSTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.AMETHYSTSTORAGEBLOCK_NAME);
		aquamarineBlock = new BlockGemStorage(BlockIds.AQUAMARINEORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.AQUAMARINEORAGEBLOCK_NAME);
		carnelianBlock = new BlockGemStorage(BlockIds.CARNELIANORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.CARNELIANORAGEBLOCK_NAME);
		garnetBlock = new BlockGemStorage(BlockIds.GARNETSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.GARNETSTORAGEBLOCK_NAME);
		hematiteBlock = new BlockGemStorage(BlockIds.HEMATITESTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.HEMATITESTORAGEBLOCK_NAME);
		howliteBlock = new BlockGemStorage(BlockIds.HOWLITESTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.HOWLITESTORAGEBLOCK_NAME);
		mountainCrystalBlock = new BlockGemStorage(BlockIds.MOUNTAINCRYSTALSTORAGEBLOCK_DEFAULT, true).setUnlocalizedName(Strings.MOUNTAINCRYSTALSTORAGEBLOCK_NAME);
		onyxBlock = new BlockGemStorage(BlockIds.ONYXSTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.ONYXSTORAGEBLOCK_NAME);
		opalBlock = new BlockGemStorage(BlockIds.OPALSTORAGEBLOCK_DEFAULT, false).setUnlocalizedName(Strings.OPALSTORAGEBLOCK_NAME);
		
		
		GameRegistry.registerBlock(portalEI, "portalBlockEI");
		GameRegistry.registerBlock(dreamBed, Strings.DREAMBED_NAME);
		
		GameRegistry.registerBlock(amethystBlock, Strings.AMETHYSTSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(aquamarineBlock, Strings.AQUAMARINEORAGEBLOCK_NAME);
		GameRegistry.registerBlock(carnelianBlock, Strings.CARNELIANORAGEBLOCK_NAME);
		GameRegistry.registerBlock(garnetBlock, Strings.GARNETSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(hematiteBlock, Strings.HEMATITESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(howliteBlock, Strings.HOWLITESTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(mountainCrystalBlock, Strings.MOUNTAINCRYSTALSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(onyxBlock, Strings.ONYXSTORAGEBLOCK_NAME);
		GameRegistry.registerBlock(opalBlock, Strings.OPALSTORAGEBLOCK_NAME);
	}
}
