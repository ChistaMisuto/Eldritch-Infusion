package chista.EI.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolJungle extends BiomeGenBase {
	public BiomeGenAncBiolJungle(int id) {
		super(id);
		spawnableCreatureList.clear();
		this.setBiomeName("Ancient Bioluminescent Jungle");
		this.setTemperatureRainfall(1.2F, 0.9F);
		this.rootHeight = 0F;
		this.heightVariation = 1F; //not sure if should be less...
		
		topBlock = Blocks.diamond_block;
		fillerBlock = Blocks.dirt;
		
	}
}
