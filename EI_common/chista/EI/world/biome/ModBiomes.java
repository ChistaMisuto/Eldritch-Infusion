package chista.EI.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import chista.EI.lib.BiomeIds;

public class ModBiomes {
	public static BiomeGenBase ancientBioluminescentForest;
	public static BiomeGenBase ancientBioluminescentJungle;
	public static BiomeGenBase ancientBioluminescentPlains;
	public static BiomeGenBase ancientBioluminescentSwamp;
	public static BiomeGenBase bioluminescentSwamp;
	public static BiomeGenBase bioluminescentJungle;
	public static BiomeGenBase coralReef;

	public static void init() {
		// Ancient biomes (have temporary top blocks for easy recognition)
		ancientBioluminescentForest = new BiomeGenAncBiolForest(BiomeIds.ABIOFOREST);	// Iron
		ancientBioluminescentJungle = new BiomeGenAncBiolJungle(BiomeIds.ABIOJUNGLE);	// Diamond
		ancientBioluminescentPlains = new BiomeGenAncBiolPlains(BiomeIds.ABIOPLAINS);	// Emerald
		ancientBioluminescentSwamp = new BiomeGenAncBiolSwamp(BiomeIds.ABIOSWAMP);		// Gold
		
		// Normal biomes
		bioluminescentSwamp = new BiomeGenBiolSwamp(BiomeIds.BIOSWAMP);
		bioluminescentJungle = new BiomeGenBiolJungle(BiomeIds.BIOJUNGLE);
		coralReef = new BiomeGenCoralReef(BiomeIds.CORALREEF);

		// addBiome is overworld only
//		GameRegistry.addBiome(ancientBioluminescentForest);
//		GameRegistry.addBiome(ancientBioluminescentJungle);
//		GameRegistry.addBiome(ancientBioluminescentPlains);
//		GameRegistry.addBiome(ancientBioluminescentSwamp);
		
		BiomeDictionary.registerBiomeType(bioluminescentJungle, Type.JUNGLE);
		BiomeDictionary.registerBiomeType(bioluminescentSwamp, Type.SWAMP);
		BiomeDictionary.registerBiomeType(coralReef, Type.WATER);
		
		

		// Remove all non essential biomes for testing!
		// TODO: Remove on publishing
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.iceMountains);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.extremeHillsEdge);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.extremeHills);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.taiga);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.ocean);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.desert);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.jungle);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.jungleHills);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.swampland);
		WorldChunkManager.allowedBiomes.remove(BiomeGenBase.icePlains);
	}

}
