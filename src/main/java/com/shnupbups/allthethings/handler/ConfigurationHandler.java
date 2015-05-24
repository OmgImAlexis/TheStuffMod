package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static boolean displayAmount = false;
	public static boolean beaconBase = true;
	public static boolean beaconFood = true;
	public static boolean emeraldSpawn = true;
	public static boolean trytementiumBoom = true;
	public static boolean disableBreadVanilla = true;
	public static boolean disableCakeVanilla = true;
	public static boolean disablePieVanilla = true;
	public static boolean enableOzTransport = true;
	public static int ustherID = 5;
	public static int backpackSlots = 15;
	
	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		displayAmount = configuration.getBoolean("displayAmounts", Configuration.CATEGORY_GENERAL, false, "Display amounts of blocks and items upon world loadup.");
		beaconBase = configuration.getBoolean("useBlocksForBeaconBase", Configuration.CATEGORY_GENERAL, true, "Enables the use of material blocks to make a beacon's pyramid.");
		beaconFood = configuration.getBoolean("useItemsForBeaconFood", Configuration.CATEGORY_GENERAL, true, "Enables the use of materials to activate a beacon.");
		emeraldSpawn = configuration.getBoolean("spawnEmeraldsInAllBiomes", Configuration.CATEGORY_GENERAL, true, "Enables emerald ore to spawn in all biomes.");
		trytementiumBoom = configuration.getBoolean("trytementiumBoomDestroysBlocks", Configuration.CATEGORY_GENERAL, true, "Enables trytementium explosions breaking blocks. WARNING: ONLY HALF WORKS!");
		disableBreadVanilla = configuration.getBoolean("disableBreadVanilla", Configuration.CATEGORY_GENERAL, true, "Disables the vanilla bread recipe, replacing it with a custom oven one.");
		disableCakeVanilla = configuration.getBoolean("disableCakeVanilla", Configuration.CATEGORY_GENERAL, true, "Disables the vanilla cake recipes, replacing them with custom oven ones. (NOTE: on false, strawberry and chocolate cakes will be crafted in a crafting bench, too)");
		disablePieVanilla = configuration.getBoolean("disablePieVanilla", Configuration.CATEGORY_GENERAL, true, "Disables the vanilla pumpkin pie recipe, replacing it with a custom oven one. (NOTE: on false, all other pies will be crafted in a crafting bench, too)");
		enableOzTransport = configuration.getBoolean("enableOzTransport", Configuration.CATEGORY_GENERAL, true, "Enables the use of Ruby Boots to teleport to a player's home with the magic words.");
		ustherID = configuration.getInt("ustherID", Configuration.CATEGORY_GENERAL, 5, Integer.MIN_VALUE, Integer.MAX_VALUE, "Dimension ID of the Usther.");
		backpackSlots = configuration.getInt("backpackSlots", Configuration.CATEGORY_GENERAL, 15, Integer.MIN_VALUE, Integer.MAX_VALUE, "Number of slots the backpack has. Should be multiple of 3, else bad things may happen...");
		
		if (configuration.hasChanged()) {
			configuration.save();
			LogHelper.info("Config updated successfully!");
		}
		LogHelper.info("Config loaded successfully!");
	}
}
