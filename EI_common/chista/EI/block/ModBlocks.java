package chista.EI.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;


public class ModBlocks {
	
	public static Block portalEI;
	
	public static void init() {
		portalEI = new PortalBlockEI(600);
		
		GameRegistry.registerBlock(portalEI, "portalBlockEI");
	}
}
