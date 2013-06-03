package chista.EI.world;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;
import chista.EI.world.biome.WorldChunkManagerEI;
import chista.EI.world.gen.ChunkProviderEI;

public class WorldProviderEI extends WorldProvider {
	
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerEI(worldObj.getSeed(), terrainType);
		this.hasNoSky = false;
	}
	
	@Override
	public String getDimensionName() {
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
		return false;
	}
}
