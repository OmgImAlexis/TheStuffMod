package com.omgimalexis.allthethings.init;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.tileEntity.TileEntityCompressor;
import com.omgimalexis.allthethings.tileEntity.TileEntityPipe;
import com.omgimalexis.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityCompressor.class, Reference.MOD_ID + ":compressor");
		GameRegistry.registerTileEntity(TileEntityPipe.class, Reference.MOD_ID + ":pipe");
		
		LogHelper.info("Tile Entities initialised successfully!");
	}
}
