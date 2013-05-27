package chista.EI.world;

import net.minecraftforge.common.DimensionManager;

public class ModWorlds {
	
	public static int eiDimensionId = 20;
	
	public static void init() {
		DimensionManager.registerProviderType(eiDimensionId, WorldProviderEI.class, true);
		DimensionManager.registerDimension(eiDimensionId, eiDimensionId);
	}
}