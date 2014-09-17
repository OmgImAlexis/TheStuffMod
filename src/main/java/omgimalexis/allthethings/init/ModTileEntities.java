package omgimalexis.allthethings.init;

import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.tile_entity.TileEntityCompressor;
import omgimalexis.allthethings.tile_entity.TileEntityPipe;
import omgimalexis.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityCompressor.class, Reference.MOD_ID + ":compressor");
		GameRegistry.registerTileEntity(TileEntityPipe.class, Reference.MOD_ID + ":pipe");
		
		LogHelper.info("Tile Entities initialised successfully!");
	}
}
