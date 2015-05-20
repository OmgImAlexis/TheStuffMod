package com.shnupbups.allthethings.init;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.shnupbups.allthethings.block.BlockBasicBush;
import com.shnupbups.allthethings.block.BlockBasicCake;
import com.shnupbups.allthethings.block.BlockBasicCrops;
import com.shnupbups.allthethings.block.BlockBasicSign;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocksPreItems {
	// Cake!
	public static final BlockBasicCake chocolateCake = new BlockBasicCake("chocolateCake", null);
	public static final BlockBasicCake strawberryCake = new BlockBasicCake("strawberryCake", null);
	
	// Crops
	public static final BlockBasicCrops lettuceCrop = new BlockBasicCrops("lettuceCrop");
	public static final BlockBasicCrops tomatoCrop = new BlockBasicCrops("tomatoCrop", true);
	
	// Signs
	public static final BlockBasicSign ironSign = new BlockBasicSign("ironSign", ModItems.ironSign, "iron", Material.iron, null, 2, 3, true);
	public static final BlockBasicSign ironSignWall = new BlockBasicSign("ironSignWall", ModItems.ironSign, "iron", Material.iron, null, 2, 3, false);
	public static final BlockBasicSign copperSign = new BlockBasicSign("copperSign", ModItems.copperSign, "copper", Material.iron, null, 2, 2, true);
	public static final BlockBasicSign copperSignWall = new BlockBasicSign("copperSignWall", ModItems.copperSign, "copper", Material.iron, null, 2, 2, false);
	public static final BlockBasicSign goldSign = new BlockBasicSign("goldSign", ModItems.goldSign, "gold", Material.iron, null, 3, 3, true);
	public static final BlockBasicSign goldSignWall = new BlockBasicSign("goldSignWall", ModItems.goldSign, "gold", Material.iron, null, 3, 3, false);
	public static final BlockBasicSign silverSign = new BlockBasicSign("silverSign", ModItems.silverSign, "silver", Material.iron, null, 3, 2, true);
	public static final BlockBasicSign silverSignWall = new BlockBasicSign("silverSignWall", ModItems.silverSign, "silver", Material.iron, null, 3, 2, false);
	
	public static void preInit() {
		// Cake!
		GameRegistry.registerBlock(chocolateCake, chocolateCake.getTrueUnlocalizedName());
		GameRegistry.registerBlock(strawberryCake, strawberryCake.getTrueUnlocalizedName());
		
		// Crops
		GameRegistry.registerBlock(lettuceCrop, lettuceCrop.getTrueUnlocalizedName());
		GameRegistry.registerBlock(tomatoCrop, tomatoCrop.getTrueUnlocalizedName());
	
		// Signs
		GameRegistry.registerBlock(ironSign, ironSign.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ironSignWall, ironSignWall.getTrueUnlocalizedName());
		GameRegistry.registerBlock(copperSign, copperSign.getTrueUnlocalizedName());
		GameRegistry.registerBlock(copperSignWall, copperSignWall.getTrueUnlocalizedName());
		GameRegistry.registerBlock(goldSign, goldSign.getTrueUnlocalizedName());
		GameRegistry.registerBlock(goldSignWall, goldSignWall.getTrueUnlocalizedName());
		GameRegistry.registerBlock(silverSign, silverSign.getTrueUnlocalizedName());
		GameRegistry.registerBlock(silverSignWall, silverSignWall.getTrueUnlocalizedName());
	}

	public static void init() {
		lettuceCrop.setDrop(ModItems.lettuce);
		tomatoCrop.setDrop(ModItems.tomato);
		
		ironSign.setTextureBase(Blocks.iron_block);
		ironSignWall.setTextureBase(Blocks.iron_block);
		copperSign.setTextureBase(ModBlocks.blockCopper);
		copperSignWall.setTextureBase(ModBlocks.blockCopper);
		goldSign.setTextureBase(Blocks.gold_block);
		goldSignWall.setTextureBase(Blocks.gold_block);
		silverSign.setTextureBase(ModBlocks.blockSilver);
		silverSignWall.setTextureBase(ModBlocks.blockSilver);
	}
}
