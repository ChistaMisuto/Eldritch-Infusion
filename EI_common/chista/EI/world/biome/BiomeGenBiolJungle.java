package chista.EI.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBiolJungle extends BiomeGenBase {
	public BiomeGenBiolJungle(int par1) {
		super(par1);
		spawnableCreatureList.clear();
		this.setBiomeName("Bioluminescent Jungle");
		this.setTemperatureRainfall(1.2F, 0.9F);
		this.setMinMaxHeight(0.2F, 0.4F);
		topBlock = (byte) Block.grass.blockID;
		fillerBlock = (byte) Block.dirt.blockID;

	}
}
