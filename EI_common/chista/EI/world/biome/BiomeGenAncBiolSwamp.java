package chista.EI.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolSwamp extends BiomeGenBase {

	public BiomeGenAncBiolSwamp(int id) {
		super(id);
		this.setBiomeName("Ancient Bioluminescent Swamp");
		this.setTemperatureRainfall(0.7F, 0.8F);
		topBlock = Blocks.gold_block;
		fillerBlock = Blocks.dirt;
	}

}
