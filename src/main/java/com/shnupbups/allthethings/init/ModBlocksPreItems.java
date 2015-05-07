package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.block.BlockBasicBush;
import com.shnupbups.allthethings.block.BlockBasicCake;
import com.shnupbups.allthethings.block.BlockBasicCrops;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocksPreItems {
	// Cake!
	public static final BlockBasicCake chocolateCake = new BlockBasicCake("chocolateCake", null);
	public static final BlockBasicCake strawberryCake = new BlockBasicCake("strawberryCake", null);
	
	// Crops
	public static final BlockBasicCrops lettuceCrop = new BlockBasicCrops("lettuceCrop");
	public static final BlockBasicCrops tomatoCrop = new BlockBasicCrops("tomatoCrop", true);
	
	public static void preInit() {
		// Cake!
		GameRegistry.registerBlock(chocolateCake, chocolateCake.getTrueUnlocalizedName());
		GameRegistry.registerBlock(strawberryCake, strawberryCake.getTrueUnlocalizedName());
		
		// Crops
		GameRegistry.registerBlock(lettuceCrop, lettuceCrop.getTrueUnlocalizedName());
		GameRegistry.registerBlock(tomatoCrop, tomatoCrop.getTrueUnlocalizedName());
	}

	public static void init() {
		lettuceCrop.setDrop(ModItems.lettuce);
		tomatoCrop.setDrop(ModItems.tomato);
	}
}
