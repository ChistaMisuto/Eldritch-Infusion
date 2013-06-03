package chista.EI.world;

import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.Teleporter;

public class PortalPositionEI extends ChunkCoordinates {
	/** The worldtime at which this PortalPosition was last verified */
	public long lastUpdateTime;

	/** The teleporter to which this PortalPosition applies */
	final Teleporter teleporterInstance;

	public PortalPositionEI(Teleporter teleporter, int x, int y, int z, long worldTime) {
		super(x, y, z);
		this.teleporterInstance = teleporter;
		this.lastUpdateTime = worldTime;
	}
}
