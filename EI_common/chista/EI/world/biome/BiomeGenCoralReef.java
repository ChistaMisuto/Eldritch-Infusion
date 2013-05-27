package chista.EI.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenCoralReef extends BiomeGenBase {
	public BiomeGenCoralReef(int par1) {
		super(par1);
		spawnableCreatureList.clear();
		this.setBiomeName("Coral Reef");
		this.setMinMaxHeight(-1.0F, 0.4F);
	}
}
