package omgimalexis.allthethings.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.utility.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	public static  Configuration configuration;
	public static boolean testValue = false;
	
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
		//testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "test config value");
		
		if (configuration.hasChanged()) {
			configuration.save();
			LogHelper.info("Config updated successfully!");
		}
		LogHelper.info("Config loaded successfully!");
	}
}
