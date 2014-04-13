package chista.EI.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolJungle extends BiomeGenBase {
	public BiomeGenAncBiolJungle(int id) {
		super(id);
		spawnableCreatureList.clear();
		this.setBiomeName("Ancient Bioluminescent Jungle");
		this.setTemperatureRainfall(1.2F, 0.9F);
		this.setMinMaxHeight(0.2F, 0.4F);
		topBlock = (byte) Block.blockDiamond.blockID;
		fillerBlock = (byte) Block.dirt.blockID;
		
	}
}
