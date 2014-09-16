package omgimalexis.allthethings.main;

import omgimalexis.allthethings.block.ModBlocks;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.entity.TMEntity;
import omgimalexis.allthethings.handler.CraftingManager;
import omgimalexis.allthethings.item.Items;
import omgimalexis.allthethings.lib.Strings;
import omgimalexis.allthethings.world.ModWorld;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MainRegistry {
	
	@SidedProxy(clientSide = "omgimalexis.allthethings.main.ClientProxy", serverSide = "omgimalexis.allthethings.main.ServerProxy") 
	public static ServerProxy proxy;
	
	
	@Instance(Strings.MODID)
	public static MainRegistry modInstance;
	
	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		TMCreativeTabs.initialiseTabs();
		ModBlocks.mainRegistry();
		Items.mainRegistry();
		TMEntity.mainRegistry();
		CraftingManager.mainRegistry();
		ModWorld.mainRegistry();
		TMHooks.mainRegistry();
		
		proxy.registerTileEntities();
		proxy.registerRenderThings();
	}
	
	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public static void load(FMLInitializationEvent event){
		proxy.registerNetworkStuff();
	}
	
	/**
	 * Loads after
	 * @param PostEvent
	 */
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
	
}
