package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.*;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityCompressor.class, Reference.MOD_ID + "compressor");
		GameRegistry.registerTileEntity(TileEntityOven.class, Reference.MOD_ID + "oven");
		GameRegistry.registerTileEntity(TileEntityPulverizer.class, Reference.MOD_ID + "pulverizer");
		GameRegistry.registerTileEntity(TileEntityBattery.class, Reference.MOD_ID + "battery");
		GameRegistry.registerTileEntity(TileEntityGenerator.class, Reference.MOD_ID + "generator");
		GameRegistry.registerTileEntity(TileEntityCable.class, Reference.MOD_ID + "cable");
		GameRegistry.registerTileEntity(TileEntityPipe.class, Reference.MOD_ID + "pipe");
		GameRegistry.registerTileEntity(TileEntityTank.class, Reference.MOD_ID + "tank");
		
		LogHelper.info("Tile Entities initialised successfully!");
	}
}
