package com.omgimalexis.allthethings;

import net.minecraftforge.common.MinecraftForge;

import com.omgimalexis.allthethings.handler.AchievementHandler;
import com.omgimalexis.allthethings.handler.BucketHandler;
import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.handler.FuelHandler;
import com.omgimalexis.allthethings.handler.PlayerLogin;
import com.omgimalexis.allthethings.handler.TMGuiHandler;
import com.omgimalexis.allthethings.init.ModAchievements;
import com.omgimalexis.allthethings.init.ModArmour;
import com.omgimalexis.allthethings.init.ModBiomes;
import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.init.ModBuckets;
import com.omgimalexis.allthethings.init.ModFluids;
import com.omgimalexis.allthethings.init.ModItems;
import com.omgimalexis.allthethings.init.ModOreDictRegister;
import com.omgimalexis.allthethings.init.ModRecipes;
import com.omgimalexis.allthethings.init.ModRings;
import com.omgimalexis.allthethings.init.ModRingsBaubles;
import com.omgimalexis.allthethings.init.ModTileEntities;
import com.omgimalexis.allthethings.init.ModTools;
import com.omgimalexis.allthethings.init.ModWorldGen;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.main.CommonProxy;
import com.omgimalexis.allthethings.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class allthethings {
	@Mod.Instance(Reference.MOD_ID)
	public static allthethings instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new PlayerLogin());

		if(Loader.isModLoaded("Baubles")) {
			ModRingsBaubles.init();
		} else {
			ModRings.init();
		}
		
		ModItems.init();
		ModFluids.init();
		ModBlocks.init();
		ModBuckets.init();
		ModTools.init();
		ModArmour.init();
		ModRecipes.init();

		if (Reference.DEBUG_MODE) {
			// ModDebug.init();
			LogHelper.info("Debug Mode is on! This means you're in a development environment, or we forgot something...");
			LogHelper.info("That means there'll be an extra tab and extra items not normally available.");
		}
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModOreDictRegister.init();
		ModTileEntities.init();
		ModAchievements.init();
		ModBiomes.init();
		proxy.registerRenderers();
		proxy.registerTileEntities();
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		LogHelper.info("World Gen initialised successfully!");
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new TMGuiHandler());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new AchievementHandler());
		LogHelper.info(Reference.BLOCKS_ADDED+" blocks added.");
		LogHelper.info(Reference.ITEMS_ADDED+" items added.");
	}
}