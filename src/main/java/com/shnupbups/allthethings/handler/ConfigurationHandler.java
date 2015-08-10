package com.shnupbups.allthethings.handler;

import java.io.File;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

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
	
	public static int bleedingID = 32;
	public static int leadPoisonID = 33;
	public static int fluxCorruptionID = 34;
	public static int radioactivityID = 35;
	public static int lesseningID = 36;
	public static int flightID = 37;
	public static int anchorageID = 38;
	public static int monochromacyID = 39;
	
	public static int gemCollectorID = 56329;
	public static int mechanicID = 56330;
	
	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile, true);
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
		trytementiumBoom = configuration.getBoolean("trytementiumBoomDestroysBlocks", Configuration.CATEGORY_GENERAL, true, "Enables trytementium explosions breaking blocks. WARNING: ONLY HALF WORKS!");
		enableOzTransport = configuration.getBoolean("enableOzTransport", Configuration.CATEGORY_GENERAL, true, "Enables the use of Ruby Boots to teleport to a player's home with the magic words.");
		backpackSlots = configuration.getInt("backpackSlots", Configuration.CATEGORY_GENERAL, 15, Integer.MIN_VALUE, Integer.MAX_VALUE, "Number of slots the backpack has. Should be multiple of 3, else bad things may happen...");
		ConfigCategory ids = configuration.getCategory(Configuration.CATEGORY_GENERAL+".ids").setRequiresMcRestart(true);
		configuration.addCustomCategoryComment(ids.getQualifiedName(), "Set unique ids for various things, in case of conflicts.");
		ustherID = configuration.getInt("ustherID", ids.getQualifiedName(), 5, Integer.MIN_VALUE, Integer.MAX_VALUE, "Dimension ID of the Usther.");
		ConfigCategory potionIds = configuration.getCategory(ids.getQualifiedName()+".potionIds").setRequiresMcRestart(true);
		configuration.addCustomCategoryComment(potionIds.getQualifiedName(), "Set unique ids for potion effects, in case of conflicts.");
		bleedingID = configuration.getInt("bleedingID", potionIds.getQualifiedName(), 32, 32, Integer.MAX_VALUE, "Potion ID of the Bleeding effect.");
		leadPoisonID = configuration.getInt("leadPoisonID", potionIds.getQualifiedName(), 33, 32, Integer.MAX_VALUE, "Potion ID of the Lead Poisoning effect.");
		fluxCorruptionID = configuration.getInt("fluxCorruptionID", potionIds.getQualifiedName(), 34, 32, Integer.MAX_VALUE, "Potion ID of the Flux Corruption effect.");
		radioactivityID = configuration.getInt("radioactivityID", potionIds.getQualifiedName(), 35, 32, Integer.MAX_VALUE, "Potion ID of the Radioactivity effect.");
		lesseningID = configuration.getInt("lesseningID", potionIds.getQualifiedName(), 36, 32, Integer.MAX_VALUE, "Potion ID of the Lessening effect.");
		flightID = configuration.getInt("flightID", potionIds.getQualifiedName(), 37, 32, Integer.MAX_VALUE, "Potion ID of the Flight effect.");
		anchorageID = configuration.getInt("anchorageID", potionIds.getQualifiedName(), 38, 32, Integer.MAX_VALUE, "Potion ID of the Anchorage effect.");
		monochromacyID = configuration.getInt("monochromacyID", potionIds.getQualifiedName(), 39, 32, Integer.MAX_VALUE, "Potion ID of the Monochromacy effect.");
		ConfigCategory villagerIds = configuration.getCategory(ids.getQualifiedName()+".villagerIds").setRequiresMcRestart(true);
		configuration.addCustomCategoryComment(villagerIds.getQualifiedName(), "Set unique ids for villagers, in case of conflicts.");
		gemCollectorID = configuration.getInt("gemCollectorID", villagerIds.getQualifiedName(), 56329, 7, Integer.MAX_VALUE, "Villager ID of the Gem Collector");
		mechanicID = configuration.getInt("mechanicID", villagerIds.getQualifiedName(), 56330, 7, Integer.MAX_VALUE, "Villager ID of the Mechanic");
		ConfigCategory craftingDisablers = configuration.getCategory(Configuration.CATEGORY_GENERAL+".craftingDisablers").setRequiresMcRestart(true);
		configuration.addCustomCategoryComment(craftingDisablers.getQualifiedName(), "Disable/enable certain crafting recipes.");
		disableBreadVanilla = configuration.getBoolean("disableBreadVanilla", craftingDisablers.getQualifiedName(), true, "Disables the vanilla bread recipe, replacing it with a custom oven one.");
		disableCakeVanilla = configuration.getBoolean("disableCakeVanilla", craftingDisablers.getQualifiedName(), true, "Disables the vanilla cake recipes, replacing them with custom oven ones. (NOTE: on false, strawberry and chocolate cakes will be crafted in a crafting bench, too)");
		disablePieVanilla = configuration.getBoolean("disablePieVanilla", craftingDisablers.getQualifiedName(), true, "Disables the vanilla pumpkin pie recipe, replacing it with a custom oven one. (NOTE: on false, all other pies will be crafted in a crafting bench, too)");
		ConfigCategory ores = configuration.getCategory(Configuration.CATEGORY_GENERAL+".ores");
		configuration.addCustomCategoryComment(ores.getQualifiedName(), "Disable/enable generation of individual ores.");
		emeraldSpawn = configuration.getBoolean("spawnEmeraldsInAllBiomes", ores.getQualifiedName(), true, "Enables emerald ore to spawn in all biomes.");
		
		if (configuration.hasChanged()) {
			configuration.save();
			LogHelper.info("Config updated successfully!");
		}
		LogHelper.info("Config loaded successfully!");
	}
}
