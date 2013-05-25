package chista.EI.world.biome;

import chista.EI.lib.BiomeIds;
import net.minecraft.world.biome.BiomeGenBase;

public class ModBiomes
{
	public static BiomeGenBase ancientBioluminescentForest;
//	public static BiomeGenBase ancientBioluminescentJungle;
//	public static BiomeGenBase ancientBioluminescentPlains;
//	public static BiomeGenBase ancientBioluminescentSwamp;
//	public static BiomeGenBase bioluminescentSwamp;
//	public static BiomeGenBase bioluminescentJungle;
//	public static BiomeGenBase coralReef;
	
	
	public static void init()
	{
		ancientBioluminescentForest = new BiomeGenAncBiolForest(BiomeIds.ABIOFOREST);
	}
	
}
