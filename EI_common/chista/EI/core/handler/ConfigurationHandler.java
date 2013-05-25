package chista.EI.core.handler;

import java.io.File;
import java.util.logging.Level;

import chista.EI.lib.BlockIds;
import chista.EI.lib.ItemIds;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	public static Configuration config;
	
	public static void init(File file) {
		config = new Configuration(file);
		
		try {
			config.load();
			
			BlockIds.AMETHYSTOREBLOCK = config.getBlock(Strings.AMETHYSTORE_NAME, BlockIds.AMETHYSTOREBLOCK).getInt(BlockIds.AMETHYSTOREBLOCK_DEFAULT);
			BlockIds.AQUAMARINEOREBLOCK = config.getBlock(Strings.AQUAMARINEORE_NAME, BlockIds.AQUAMARINEOREBLOCK).getInt(BlockIds.AQUAMARINEOREBLOCK_DEFAULT);
			BlockIds.CARNELIAOREBLOCK = config.getBlock(Strings.CARNELIANORE_NAME, BlockIds.CARNELIAOREBLOCK).getInt(BlockIds.CARNELIAOREBLOCK_DEFAULT);
			BlockIds.GARNETOREBLOCK = config.getBlock(Strings.GARNETORE_NAME, BlockIds.GARNETOREBLOCK).getInt(BlockIds.GARNETOREBLOCK_DEFAULT);
			BlockIds.HEMATITEOREBLOCK = config.getBlock(Strings.HEMATITEORE_NAME, BlockIds.HEMATITEOREBLOCK).getInt(BlockIds.HEMATITEOREBLOCK_DEFAULT);
			BlockIds.HOWLITEOREBLOCK = config.getBlock(Strings.HOWLITEORE_NAME, BlockIds.HOWLITEOREBLOCK).getInt(BlockIds.HOWLITEOREBLOCK_DEFAULT);
			BlockIds.MOUNTAINCRYSTALOREBLOCK = config.getBlock(Strings.MOUNTAINCRYSTALORE_NAME, BlockIds.MOUNTAINCRYSTALOREBLOCK).getInt(BlockIds.MOUNTAINCRYSTALOREBLOCK_DEFAULT);
			BlockIds.ONYXOREBLOCK = config.getBlock(Strings.ONYXORE_NAME, BlockIds.ONYXOREBLOCK).getInt(BlockIds.ONYXOREBLOCK_DEFAULT);
			BlockIds.OPALOREBLOCK = config.getBlock(Strings.OPALORE_NAME, BlockIds.OPALOREBLOCK).getInt(BlockIds.OPALOREBLOCK_DEFAULT);
			BlockIds.PERIDOTOREBLOCK = config.getBlock(Strings.PERIDOTORE_NAME, BlockIds.PERIDOTOREBLOCK).getInt(BlockIds.PERIDOTOREBLOCK_DEFAULT);
			BlockIds.RHODOCHROSITEOREBLOCK = config.getBlock(Strings.RHODOCHROSITEORE_NAME, BlockIds.RHODOCHROSITEOREBLOCK).getInt(BlockIds.RHODOCHROSITEOREBLOCK_DEFAULT);
			BlockIds.SPHENEOREBLOCK = config.getBlock(Strings.SPHENEORE_NAME, BlockIds.SPHENEOREBLOCK).getInt(BlockIds.SPHENEOREBLOCK_DEFAULT);
			BlockIds.SPINELOREBLOCK = config.getBlock(Strings.SPINELORE_NAME, BlockIds.SPINELOREBLOCK).getInt(BlockIds.SPINELOREBLOCK_DEFAULT);
			BlockIds.TIGERSEYEOREBLOCK = config.getBlock(Strings.TIGERSEYEORE_NAME, BlockIds.TIGERSEYEOREBLOCK).getInt(BlockIds.TIGERSEYEOREBLOCK_DEFAULT);
			BlockIds.TOPAZOREBLOCK = config.getBlock(Strings.TOPAZORE_NAME, BlockIds.TOPAZOREBLOCK).getInt(BlockIds.TOPAZOREBLOCK_DEFAULT);
			BlockIds.TOURMALINEOREBLOCK = config.getBlock(Strings.TOURMALINEORE_NAME, BlockIds.TOURMALINEOREBLOCK).getInt(BlockIds.TOURMALINEOREBLOCK_DEFAULT);
			
			ItemIds.AMETHYSTGEM = config.getItem(Strings.amethystGem, ItemIds.AMETHYSTGEM).getInt(ItemIds.AMETHYSTGEM_DEFAULT);
			ItemIds.AQUAMARINEGEM = config.getItem(Strings.aquamarineGem, ItemIds.AQUAMARINEGEM).getInt(ItemIds.AQUAMARINEGEM_DEFAULT);
			ItemIds.CARNELIANGEM = config.getItem(Strings.carnelianGem, ItemIds.CARNELIANGEM).getInt(ItemIds.CARNELIANGEM_DEFAULT);
			ItemIds.GARNETGEM = config.getItem(Strings.garnetGem, ItemIds.GARNETGEM).getInt(ItemIds.GARNETGEM_DEFAULT);
			ItemIds.HEMATITEGEM = config.getItem(Strings.hematiteGem, ItemIds.HEMATITEGEM).getInt(ItemIds.HEMATITEGEM_DEFAULT);
			ItemIds.HOWLITEGEM = config.getItem(Strings.howliteGem, ItemIds.HOWLITEGEM).getInt(ItemIds.HOWLITEGEM_DEFAULT);
			ItemIds.MOUNTAINCRYSTALGEM = config.getItem(Strings.mountainCrystalGem, ItemIds.MOUNTAINCRYSTALGEM).getInt(ItemIds.MOUNTAINCRYSTALGEM_DEFAULT);
			ItemIds.ONYXGEM = config.getItem(Strings.onyxGem, ItemIds.ONYXGEM).getInt(ItemIds.ONYXGEM_DEFAULT);
			ItemIds.OPALGEM = config.getItem(Strings.opalGem, ItemIds.OPALGEM).getInt(ItemIds.OPALGEM_DEFAULT);
			ItemIds.PERIDOTGEM = config.getItem(Strings.peridotGem, ItemIds.PERIDOTGEM).getInt(ItemIds.PERIDOTGEM_DEFAULT);
			ItemIds.RHODOCHROSITEGEM = config.getItem(Strings.rhodochrositeGem, ItemIds.RHODOCHROSITEGEM).getInt(ItemIds.RHODOCHROSITEGEM_DEFAULT);
			ItemIds.SPHENEGEM = config.getItem(Strings.spheneGem, ItemIds.SPHENEGEM).getInt(ItemIds.SPHENEGEM_DEFAULT);
			ItemIds.SPINELGEM = config.getItem(Strings.spinelGem, ItemIds.SPINELGEM).getInt(ItemIds.SPINELGEM_DEFAULT);
			ItemIds.TIGERSEYEGEM = config.getItem(Strings.tigersEyeGem, ItemIds.TIGERSEYEGEM).getInt(ItemIds.TIGERSEYEGEM_DEFAULT);
			ItemIds.TOPAZGEM = config.getItem(Strings.topazGem, ItemIds.TOPAZGEM).getInt(ItemIds.TOPAZGEM_DEFAULT);
			ItemIds.TOURMALINEGEM = config.getItem(Strings.tourmalineGem, ItemIds.TOURMALINEGEM).getInt(ItemIds.TOURMALINEGEM_DEFAULT);
			
		}
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " Has a problem loading the config file");
		}
		finally {
			config.save();
		}
	}
}
