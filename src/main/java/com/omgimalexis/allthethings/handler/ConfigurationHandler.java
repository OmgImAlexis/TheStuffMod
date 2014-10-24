package com.omgimalexis.allthethings.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static boolean displayAmount = false;
	public static boolean beaconBase = true;
	public static boolean beaconFood = true;
	
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
		
		if (configuration.hasChanged()) {
			configuration.save();
			LogHelper.info("Config updated successfully!");
		}
		LogHelper.info("Config loaded successfully!");
	}
}
