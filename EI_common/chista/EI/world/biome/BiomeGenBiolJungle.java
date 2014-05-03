package chista.EI.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBiolJungle extends BiomeGenBase {
	public BiomeGenBiolJungle(int par1) {
		super(par1);
		spawnableCreatureList.clear();
		this.setBiomeName("Bioluminescent Jungle");
		this.setTemperatureRainfall(1.2F, 0.9F);
		this.rootHeight = 0F;
		this.heightVariation = 0.9F; //not sure if should change
		topBlock = Blocks.grass;
		fillerBlock = Blocks.dirt;
	}
}
