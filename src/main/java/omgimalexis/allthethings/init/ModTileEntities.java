package omgimalexis.allthethings.init;

import omgimalexis.allthethings.tile_entity.TileEntityCompressor;
import omgimalexis.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityCompressor.class, "Compressor");
		
		LogHelper.info("Tile Entities initialised successfully!");
	}
}
