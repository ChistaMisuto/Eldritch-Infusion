package chista.EI.world.gen;

import java.util.Random;

import chista.EI.ore.ModOres;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorEI implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.dimensionId) {
			case -1:
				// Nether
				break;
			case 0:
				// Overworld
				this.overWorldGeneration(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				// The end
				break;
			case 20:
				// our dimension;
				this.dreamWorldGeneration(world, random, chunkX * 16, chunkZ * 16);
				break;
			default:
				// Nothing
		}
	}

	private void dreamWorldGeneration(World world, Random random, int chunkX, int chunkZ) {
		// All ores
	}

	private void overWorldGeneration(World world, Random random, int chunkX, int chunkZ) {
		BiomeGenBase biome = world.getBiomeGenForCoords(chunkX, chunkZ);
		switch (biome.biomeName) {
			case "Ocean":
				// Aquamarine
				break;
			case "Plains":
				// Hematite
				break;
			case "Desert":
				// Tigers eye
				break;
			case "Extreme Hills":
				break;
			case "Forest":
				// Carnelian
				break;
			case "Taiga":
				// Howlite
				// Amethyst
				break;
			case "Swampland":
				break;
			case "River":
				break;
			case "FrozenOcean":
				// Howlite
				// Amethyst
				break;
			case "FrozenRiver":
				// Howlite
				// Amethyst
				break;
			case "Ice Plains":
				// Howlite
				// Amethyst
				break;
			case "Ice Mountains":
				// Howlite
				// Amethyst
				break;
			case "MushroomIsland":
				break;
			case "MushroomIslandShore":
				break;
			case "Beach":
				break;
			case "DesertHills":
				// Tigers eye
				break;
			case "ForestHills":
				// Carnelian
				break;
			case "TaigaHills":
				// Howlite
				// Amethyst
				break;
			case "Extreme Hills Edge":
				break;
			case "Jungle":
				// Tourmaline
				break;
			case "JungleHills":
				// Tourmaline
				break;
			case "Coral Reef":
				// Topaz
				break;
			case "Bioluminescent Swamp":
				// Spinel
				break;
		}
	}

	public void addOres(Block block, World world, Random random, int chunkX, int chunkZ, int vainSize, int spawnChance, int minY, int maxY) {
		for (int i = 0; i < spawnChance; i++) {
			int posX = chunkX + random.nextInt(15);
			int posZ = chunkZ + random.nextInt(15);
			int posY = minY + random.nextInt(maxY - minY);
			(new WorldGenMinable(block.blockID, vainSize)).generate(world, random, posX, posY, posZ);
		}
	}
}
