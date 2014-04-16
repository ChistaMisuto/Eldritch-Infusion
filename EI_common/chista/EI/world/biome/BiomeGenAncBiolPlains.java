package chista.EI.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolPlains extends BiomeGenBase {

	public BiomeGenAncBiolPlains(int id) {
		super(id);
		this.setBiomeName("Ancient Bioluminescent Plains");
		this.setTemperatureRainfall(0.7F, 0.8F);
		topBlock = Blocks.emerald_block;
		fillerBlock = Blocks.dirt;
	}
}
