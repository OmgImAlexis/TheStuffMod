package omgimalexis.allthethings.main;


import omgimalexis.allthethings.handler.TMGuiHandler;
import omgimalexis.allthethings.lib.Strings;
import omgimalexis.allthethings.tile_entity.TileEntityDarkMatterFurnace;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {

	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new TMGuiHandler());
	}

	public void registerTileEntities(){
//		GameRegistry.registerTileEntity(TileEntityTutChest.class, Strings.MODID);
		GameRegistry.registerTileEntity(TileEntityDarkMatterFurnace.class, "TileEntityTutFurnace");
	}
}
