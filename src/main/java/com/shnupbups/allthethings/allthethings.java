package com.shnupbups.allthethings;

import com.shnupbups.allthethings.command.CommandAtt;
import com.shnupbups.allthethings.handler.*;
import com.shnupbups.allthethings.init.*;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.lib.Strings;
import com.shnupbups.allthethings.main.CommonProxy;
import com.shnupbups.allthethings.utility.LogHelper;
import com.shnupbups.allthethings.world.village.VillageStructureHouse;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class allthethings {
	@Mod.Instance(Reference.MOD_ID)
	public static allthethings instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Strings strings = new Strings();
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new PlayerLogin());
		MinecraftForge.EVENT_BUS.register(new PotionHandler());
		MinecraftForge.EVENT_BUS.register(new BlockBreakHandler());
		MinecraftForge.EVENT_BUS.register(new FoodHandler());
		//MinecraftForge.EVENT_BUS.register(new HUDHandler(Minecraft.getMinecraft()));
		
		ModBlocksPreItems.preInit();
		ModItems.init();

		if(Loader.isModLoaded("Baubles")) {
			ModRingsBaubles.init();
		} else {
			ModRings.init();
		}

		ModFluids.init();
		ModBlocks.init();
		ModBuckets.init();
		ModTools.init();
		ModArmour.init();
		ModRecipes.init();
		ModCustomRecipes.init();
		ModPotions.preInit();
		ModDimensions.init();

		if (Reference.DEBUG_MODE) {
			// ModDebug.init();
			LogHelper.info("Debug Mode is on! This means you're in a development environment, or we forgot something...");
			LogHelper.info("That means there'll be an extra tab and extra items not normally available.");
		}
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModBlocksPreItems.init();
		ModMisc.init();
		ModOreDictRegister.init();
		ModTileEntities.init();
		ModAchievements.init();
		ModBiomes.init();
		ModEntities.init();
		ModPotions.init();
		ModDungeonLoot.init();
		proxy.registerRenderers();
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		VillagerRegistry.instance().registerVillageCreationHandler(new VillageHouseHandler());
		MapGenStructureIO.func_143031_a(VillageStructureHouse.class, Reference.MOD_ID+":HouseStructure");
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(new ChatHandler());
		MinecraftForge.TERRAIN_GEN_BUS.register(new FlowerHandler());
		LogHelper.info("World Gen initialised successfully!");
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new AchievementHandler());
		LogHelper.info(Reference.BLOCKS_ADDED+" blocks added.");
		LogHelper.info(Reference.ITEMS_ADDED+" items added.");
	}
	
	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandAtt());
	}
}