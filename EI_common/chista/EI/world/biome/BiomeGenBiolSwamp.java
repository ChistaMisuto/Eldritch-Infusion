package chista.EI.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBiolSwamp extends BiomeGenBase {
	public BiomeGenBiolSwamp(int par1) {
		super(par1);
		spawnableCreatureList.clear();
		this.setBiomeName("Bioluminescent Swamp");
		this.setMinMaxHeight(-0.2F, 0.1F);
		this.setTemperatureRainfall(0.8F, 0.9F);
		topBlock = (byte) Block.grass.blockID;
		fillerBlock = (byte) Block.dirt.blockID;

	}
}
