package chista.EI.world;

import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.Teleporter;

public class PortalPositionEI extends ChunkCoordinates {
	/** The worldtime at which this PortalPosition was last verified */
	public long lastUpdateTime;

	/** The teleporter to which this PortalPosition applies */
	final Teleporter teleporterInstance;

	public PortalPositionEI(Teleporter par1Teleporter, int par2, int par3, int par4, long par5) {
		super(par2, par3, par4);
		this.teleporterInstance = par1Teleporter;
		this.lastUpdateTime = par5;
	}
}
