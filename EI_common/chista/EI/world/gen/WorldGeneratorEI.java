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
		this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
		this.addOres(ModOres.aquamarineOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
		this.addOres(ModOres.carnelianOre, world, random, chunkX, chunkZ, 10, 20, 0, 20);
		this.addOres(ModOres.garnetOre, world, random, chunkX, chunkZ, 10, 20, 15, 60);
		this.addOres(ModOres.hematiteOre, world, random, chunkX, chunkZ, 9, 20, 20, 60);
		this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
		this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
		this.addOres(ModOres.onyxOre, world, random, chunkX, chunkZ, 8, 20, 0, 30);
		this.addOres(ModOres.opalOre, world, random, chunkX, chunkZ, 5, 20, 0, 35);
		this.addOres(ModOres.peridotOre, world, random, chunkX, chunkZ, 8, 20, 35, 60);
		this.addOres(ModOres.rhodocrositeOre, world, random, chunkX, chunkZ, 3, 20, 30, 50);
		this.addOres(ModOres.spheneOre, world, random, chunkX, chunkZ, 6, 20, 20, 40);
		this.addOres(ModOres.spinelOre, world, random, chunkX, chunkZ, 9, 20, 20, 50);
		this.addOres(ModOres.tigersEyeOre, world, random, chunkX, chunkZ, 8, 5, 0, 20);
		this.addOres(ModOres.topazOre, world, random, chunkX, chunkZ, 10, 20, 20, 50);
		this.addOres(ModOres.tourmalineOre, world, random, chunkX, chunkZ, 8, 20, 40, 200);
	}

	private void overWorldGeneration(World world, Random random, int chunkX, int chunkZ) {
		BiomeGenBase biome = world.getBiomeGenForCoords(chunkX, chunkZ);
		// Select the right biome for the ores to spawn in
		//? WORKS ONLY IN JAVA 1.7 WILL BREAK JAVA 1.6
		switch (biome.biomeName) {
			case "Ocean":
				// Aquamarine
				this.addOres(ModOres.aquamarineOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "Plains":
				// Opal
				this.addOres(ModOres.opalOre, world, random, chunkX, chunkZ, 5, 20, 0, 35);
				// Hematite
				this.addOres(ModOres.hematiteOre, world, random, chunkX, chunkZ, 9, 20, 20, 60);
				break;
			case "Desert":
				// Sphene
				this.addOres(ModOres.spheneOre, world, random, chunkX, chunkZ, 6, 20, 20, 40);
				// Tigers eye
				this.addOres(ModOres.tigersEyeOre, world, random, chunkX, chunkZ, 8, 5, 0, 20);
				break;
			case "Extreme Hills":
				// Mountain crystal
				this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
				break;
			case "Forest":
				// Carnelian
				this.addOres(ModOres.carnelianOre, world, random, chunkX, chunkZ, 10, 20, 0, 20);
				break;
			case "Taiga":
				// Rhodochrosite
				this.addOres(ModOres.rhodocrositeOre, world, random, chunkX, chunkZ, 3, 20, 30, 50);
				// Howlite
				this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
				// Amethyst
				this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "Swampland":
				// Onyx
				this.addOres(ModOres.onyxOre, world, random, chunkX, chunkZ, 8, 20, 0, 30);
				break;
			case "River":
				break;
			case "FrozenOcean":
				// Howlite
				this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
				// Amethyst
				this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "FrozenRiver":
				// Howlite
				this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
				// Amethyst
				this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "Ice Plains":
				// Howlite
				this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
				// Amethyst
				this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "Ice Mountains":
				// Howlite
				this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
				// Amethyst
				this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "MushroomIsland":
				// Garnet
				this.addOres(ModOres.garnetOre, world, random, chunkX, chunkZ, 10, 20, 15, 60);
				break;
			case "MushroomIslandShore":
				// Garnet
				this.addOres(ModOres.garnetOre, world, random, chunkX, chunkZ, 10, 20, 15, 60);
				break;
			case "Beach":
				break;
			case "DesertHills":
				// Mountain crystal
				this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
				// Tigers eye
				break;
			case "ForestHills":
				// Mountain crystal
				this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
				// Carnelian
				this.addOres(ModOres.carnelianOre, world, random, chunkX, chunkZ, 10, 20, 0, 20);
				break;
			case "TaigaHills":
				// Rhodochrosite
				this.addOres(ModOres.rhodocrositeOre, world, random, chunkX, chunkZ, 3, 20, 30, 50);
				// Mountain crystal
				this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
				// Howlite
				this.addOres(ModOres.howliteOre, world, random, chunkX, chunkZ, 7, 20, 15, 45);
				// Amethyst
				this.addOres(ModOres.amethystOre, world, random, chunkX, chunkZ, 5, 20, 15, 60);
				break;
			case "Extreme Hills Edge":
				// Mountain crystal
				this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
				break;
			case "Jungle":
				// Tourmaline
				this.addOres(ModOres.tourmalineOre, world, random, chunkX, chunkZ, 8, 20, 40, 200);
				break;
			case "JungleHills":
				// Mountain crystal
				this.addOres(ModOres.mountainCrystalOre, world, random, chunkX, chunkZ, 7, 20, 40, 100);
				// Tourmaline
				this.addOres(ModOres.tourmalineOre, world, random, chunkX, chunkZ, 8, 20, 40, 200);
				break;
			case "Coral Reef":
				// Topaz
				this.addOres(ModOres.topazOre, world, random, chunkX, chunkZ, 10, 20, 20, 50);
				break;
			case "Bioluminescent Swamp":
				// Spinel
				this.addOres(ModOres.spinelOre, world, random, chunkX, chunkZ, 9, 20, 20, 50);
				break;
			case "Bioluminescent Jungle":
				// Peridot
				this.addOres(ModOres.peridotOre, world, random, chunkX, chunkZ, 8, 20, 35, 60);
				break;
		}
	}

	public void addOres(Block block, World world, Random random, int chunkX, int chunkZ, int vainSize, int spawnChance, int minY, int maxY) {
		for (int i = 0; i < spawnChance; i++) {
			int posX = chunkX + random.nextInt(15);
			int posZ = chunkZ + random.nextInt(15);
			int posY = minY + random.nextInt(maxY - minY);
			(new WorldGenMinable(block, vainSize)).generate(world, random, posX, posY, posZ);
		}
	}
}
