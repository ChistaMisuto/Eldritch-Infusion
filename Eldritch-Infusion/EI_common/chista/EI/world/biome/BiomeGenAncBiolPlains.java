package chista.EI.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAncBiolPlains extends BiomeGenBase {

	public BiomeGenAncBiolPlains(int id) {
		super(id);
		this.setBiomeName("Ancient Bioluminescent Plains");
		this.setTemperatureRainfall(0.7F, 0.8F);
		topBlock = (byte) Block.blockEmerald.blockID;
		fillerBlock = (byte) Block.dirt.blockID;
	}
}
