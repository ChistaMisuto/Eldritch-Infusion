package chista.EI.world;

import chista.EI.world.biome.ModBiomes;
import chista.EI.world.biome.WorldChunkManagerEI;
import chista.EI.world.gen.ChunkProviderEI;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderEI extends WorldProvider {
	
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerEI(ModBiomes.bioluminescentSwamp, 0.4F, 0.1F);
		this.hasNoSky = false;
	}
	
	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return "Ancient World";
	}
	
	public static WorldProvider getProviderForDimension(int id) {
		return DimensionManager.createProviderFor(ModWorlds.eiDimensionId);
	}
	
	public String getWelcomeMessage() {
		return "You fell asleep in an ancient bed and have awoken in a new world";
	}
	
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderEI(worldObj, worldObj.getSeed(), true);
	}
	
	public boolean canRespawnHere() {
		return true;
	}
}
