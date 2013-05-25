package chista.EI;

import net.minecraft.creativetab.CreativeTabs;
import chista.EI.core.handler.LocalizationHandler;
import chista.EI.creativetab.CreativeTabEI;
import chista.EI.item.ModItems;
import chista.EI.lib.Reference;
import chista.EI.ore.ModOres;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
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
    modid= Reference.MOD_ID, //Find in Chista.EI.lib
    name = Reference.NAME, 
    version = Reference.VERSION
)
@NetworkMod(
	serverSideRequired = false,
	clientSideRequired = true
)
public class EI
{
	
	public static CreativeTabs creativeTabEI = new CreativeTabEI(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
    	LocalizationHandler.loadLanguages();
    	
    	
        ModOres.init();
        ModItems.init();
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
