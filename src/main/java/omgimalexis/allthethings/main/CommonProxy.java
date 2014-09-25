package omgimalexis.allthethings.main;

import omgimalexis.allthethings.tile_entity.TileEntityBattery;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	// Client stuff
	public void registerRenderers() {
		// Nothing here as the server doesn't render graphics or entities!
	}

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityBattery.class, "battery");
	}
}
