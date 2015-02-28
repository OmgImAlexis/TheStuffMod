package com.omgimalexis.allthethings.init;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.tileEntity.TileEntityBattery;
import com.omgimalexis.allthethings.tileEntity.TileEntityCable;
import com.omgimalexis.allthethings.tileEntity.TileEntityCompressor;
import com.omgimalexis.allthethings.tileEntity.TileEntityGenerator;
import com.omgimalexis.allthethings.tileEntity.TileEntityOven;
import com.omgimalexis.allthethings.tileEntity.TileEntityPipe;
import com.omgimalexis.allthethings.tileEntity.TileEntityPulverizer;
import com.omgimalexis.allthethings.utility.LogHelper;

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
		
		LogHelper.info("Tile Entities initialised successfully!");
	}
}
