package chista.EI.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import chista.EI.lib.BiomeIds;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBiomes {
	public static BiomeGenBase ancientBioluminescentForest;
	public static BiomeGenBase ancientBioluminescentJungle;
	public static BiomeGenBase ancientBioluminescentPlains;
	public static BiomeGenBase ancientBioluminescentSwamp;
	public static BiomeGenBase bioluminescentSwamp;
	public static BiomeGenBase bioluminescentJungle;
	public static BiomeGenBase coralReef;

	public static void init() {
		ancientBioluminescentForest = new BiomeGenAncBiolForest(BiomeIds.ABIOFOREST);
		bioluminescentSwamp = new BiomeGenBiolSwamp(BiomeIds.BIOSWAMP);
		bioluminescentJungle = new BiomeGenBiolJungle(BiomeIds.BIOJUNGLE);
		coralReef = new BiomeGenCoralReef(BiomeIds.CORALREEF);

		GameRegistry.addBiome(bioluminescentJungle);
		GameRegistry.addBiome(bioluminescentSwamp);
		GameRegistry.addBiome(coralReef);

		// Remove all non essential biomes for testing!
		// TODO: Remove on publishing
		GameRegistry.removeBiome(BiomeGenBase.iceMountains);
		GameRegistry.removeBiome(BiomeGenBase.extremeHillsEdge);
		GameRegistry.removeBiome(BiomeGenBase.extremeHills);
		GameRegistry.removeBiome(BiomeGenBase.taiga);
		GameRegistry.removeBiome(BiomeGenBase.ocean);
		GameRegistry.removeBiome(BiomeGenBase.desert);
		GameRegistry.removeBiome(BiomeGenBase.jungle);
		GameRegistry.removeBiome(BiomeGenBase.jungleHills);
		GameRegistry.removeBiome(BiomeGenBase.swampland);
		GameRegistry.removeBiome(BiomeGenBase.icePlains);

	}

}
