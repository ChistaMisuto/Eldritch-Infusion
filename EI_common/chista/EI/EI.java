package chista.EI;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import chista.EI.block.ModBlocks;
import chista.EI.core.handler.ConfigurationHandler;
import chista.EI.core.handler.LocalizationHandler;
import chista.EI.core.proxy.CommonProxy;
import chista.EI.creativetab.CreativeTabEI;
import chista.EI.item.ModItems;
import chista.EI.lib.Reference;
import chista.EI.ore.ModOres;
import chista.EI.world.ModWorlds;
import chista.EI.world.biome.ModBiomes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * @mod class for EI 
 * 
 * @author Chista
 *
 */

@Mod(
    modid= Reference.MOD_ID, 
    name = Reference.MOD_NAME, 
    version = Reference.MOD_VERSION
)
@NetworkMod(
	channels = {Reference.CHANNEL_NAME},
	serverSideRequired = false,
	clientSideRequired = true
)
public class EI
{
	
	@SidedProxy(
		clientSide = Reference.CLIENT_PROXY_LOCATION,
		serverSide = Reference.COMMON_PROXY_LOCATION
	)
	public static CommonProxy proxy;
	
	// Create EI creative tab
	public static CreativeTabs creativeTabEI = new CreativeTabEI(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
    	// Initialize localization
    	LocalizationHandler.loadLanguages();
    	
    	// Initialize the configuration file
    	ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
    	
    	ModBlocks.init();	// Initialize blocks (portal)
        ModOres.init();		// Initialize ores
        ModItems.init();	// Initialize items
        ModBiomes.init();	// Initialize Biomes
        ModWorlds.init();	// Initialize Dimension
    }
    
    @Init
    public void init(FMLInitializationEvent event)
    {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
