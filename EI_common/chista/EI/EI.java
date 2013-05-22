package chista.EI;

import chista.EI.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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

public class EI
{
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        
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
