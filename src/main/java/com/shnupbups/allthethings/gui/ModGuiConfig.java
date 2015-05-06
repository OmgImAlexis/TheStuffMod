package com.shnupbups.allthethings.gui;

import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {
	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen,
					new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
					Reference.MOD_ID,
					false,
					false,
					GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}
}
