package omgimalexis.allthethings;

import omgimalexis.allthethings.handler.AchievementHandler;
import omgimalexis.allthethings.handler.BucketHandler;
import omgimalexis.allthethings.handler.ConfigurationHandler;
import omgimalexis.allthethings.handler.FuelHandler;
import omgimalexis.allthethings.handler.TMGuiHandler;
import omgimalexis.allthethings.init.ModAchievements;
import omgimalexis.allthethings.init.ModArmour;
import omgimalexis.allthethings.init.ModBiomes;
import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.init.ModBuckets;
import omgimalexis.allthethings.init.ModFluids;
import omgimalexis.allthethings.init.ModItems;
import omgimalexis.allthethings.init.ModOreDictRegister;
import omgimalexis.allthethings.init.ModRecipes;
import omgimalexis.allthethings.init.ModTileEntities;
import omgimalexis.allthethings.init.ModTools;
import omgimalexis.allthethings.init.ModWorldGen;
import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.main.ClientProxy;
import omgimalexis.allthethings.main.IProxy;
import omgimalexis.allthethings.main.ServerProxy;
import omgimalexis.allthethings.utility.LogHelper;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.AchievementEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class allthethings {
	@Mod.Instance(Reference.MOD_ID)
	public static allthethings instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	public static ClientProxy clientProxy;
	public static ServerProxy serverPproxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		ModFluids.init();
		ModBlocks.init();
		ModBuckets.init();
		ModTools.init();
		ModArmour.init();
		ModRecipes.init();
		
		if(Reference.DEBUG_MODE) {
			//ModDebug.init();
			LogHelper.info("Debug Mode is on! This means you're in a development environment, or Shnupbups forgot something...");
			LogHelper.info("That means there'll be an extra tab and extra items not normally available.");
		}
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModOreDictRegister.init();
		ModTileEntities.init();
		ModAchievements.init();
		ModBiomes.init();
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		LogHelper.info("World Gen initialised successfully!");
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new TMGuiHandler());
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new AchievementHandler());
	}
}