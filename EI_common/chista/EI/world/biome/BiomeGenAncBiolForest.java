package chista.EI.world.biome;

import chista.EI.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolForest extends BiomeGenBase {

	public BiomeGenAncBiolForest(int id) {
		super(id);
		this.setBiomeName("Ancient Bioluminescent Forest");
		this.setTemperatureRainfall(0.7F, 0.8F);
		topBlock = ModBlocks.glowGrass;
		fillerBlock = Blocks.dirt;
	}

}
