package chista.EI.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolForest extends BiomeGenBase {

	public BiomeGenAncBiolForest(int id) {
		super(id);
		this.setBiomeName("Ancient Bioluminescent Forest");
		this.setTemperatureRainfall(0.7F, 0.8F);
		topBlock = (byte) Block.blockIron.blockID;
		fillerBlock = (byte) Block.dirt.blockID;
	}

}
