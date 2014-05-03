package chista.EI.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBiolSwamp extends BiomeGenBase {
	public BiomeGenBiolSwamp(int par1) {
		super(par1);
		spawnableCreatureList.clear();
		this.setBiomeName("Bioluminescent Swamp");
		this.rootHeight = 0F;
		this.heightVariation = 0.1F;
		this.setTemperatureRainfall(0.8F, 0.9F);
		topBlock = Blocks.grass;
		fillerBlock = Blocks.dirt;

	}
}
