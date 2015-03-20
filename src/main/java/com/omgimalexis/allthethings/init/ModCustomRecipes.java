package com.omgimalexis.allthethings.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCustomRecipes {

	public static ItemStack[][] ovenRecipes = new ItemStack[17][9];
	public static ItemStack[][] ovenShapedRecipes = new ItemStack[0][9];
	
	public static ItemStack[] ovenResults = new ItemStack[17];
	public static ItemStack[] ovenShapedResults = new ItemStack[0];
	
	public static void init() {
		ItemStack[] caramelRecipe = new ItemStack[9];
		caramelRecipe[0] = new ItemStack(Items.sugar);
		caramelRecipe[1] = new ItemStack(Items.water_bucket);
		caramelRecipe[2] = new ItemStack(Items.milk_bucket);
		ItemStack[] toffeeRecipe = new ItemStack[9];
		toffeeRecipe[0] = new ItemStack(Items.sugar);
		toffeeRecipe[1] = new ItemStack(Items.water_bucket);
		ItemStack[] chickenRecipe = new ItemStack[9];
		chickenRecipe[0] = new ItemStack(Items.chicken);
		ItemStack[] porkchopRecipe = new ItemStack[9];
		porkchopRecipe[0] = new ItemStack(Items.porkchop);
		ItemStack[] beefRecipe = new ItemStack[9];
		beefRecipe[0] = new ItemStack(Items.beef);
		ItemStack[] fishRecipe = new ItemStack[9];
		fishRecipe[0] = new ItemStack(Items.fish,1,0);
		ItemStack[] salmonRecipe = new ItemStack[9];
		salmonRecipe[0] = new ItemStack(Items.fish,1,1);
		ItemStack[] mapleSyrupRecipe = new ItemStack[9];
		mapleSyrupRecipe[0] = new ItemStack(ModItems.mapleSap);
		mapleSyrupRecipe[1] = new ItemStack(Items.sugar);
		mapleSyrupRecipe[2] = new ItemStack(ModItems.glassJar);
		ItemStack[] pancakeRecipe = new ItemStack[9];
		pancakeRecipe[0] = new ItemStack(ModItems.flour);
		pancakeRecipe[1] = new ItemStack(Items.egg);
		pancakeRecipe[2] = new ItemStack(Items.milk_bucket);
		pancakeRecipe[3] = new ItemStack(Items.sugar);
		ItemStack[] breadRecipe = new ItemStack[9];
		breadRecipe[0] = new ItemStack(ModItems.flour);
		breadRecipe[1] = new ItemStack(Items.water_bucket);
		ItemStack[] cakeRecipe = new ItemStack[9];
		cakeRecipe[0] = new ItemStack(ModItems.flour);
		cakeRecipe[1] = new ItemStack(Items.egg);
		cakeRecipe[2] = new ItemStack(Items.milk_bucket);
		cakeRecipe[3] = new ItemStack(Items.sugar);
		cakeRecipe[4] = new ItemStack(Items.water_bucket);
		ItemStack[] chocCakeRecipe = new ItemStack[9];
		chocCakeRecipe[0] = new ItemStack(ModItems.flour);
		chocCakeRecipe[1] = new ItemStack(Items.egg);
		chocCakeRecipe[2] = new ItemStack(ModItems.chocolateMilk);
		chocCakeRecipe[3] = new ItemStack(Items.sugar);
		chocCakeRecipe[4] = new ItemStack(Items.water_bucket);
		ItemStack[] strawCakeRecipe = new ItemStack[9];
		strawCakeRecipe[0] = new ItemStack(ModItems.flour);
		strawCakeRecipe[1] = new ItemStack(Items.egg);
		strawCakeRecipe[2] = new ItemStack(ModItems.strawberryMilk);
		strawCakeRecipe[3] = new ItemStack(Items.sugar);
		strawCakeRecipe[4] = new ItemStack(Items.water_bucket);
		ItemStack[] pumpPieRecipe = new ItemStack[9];
		pumpPieRecipe[0] = new ItemStack(ModItems.flour);
		pumpPieRecipe[1] = new ItemStack(Items.egg);
		pumpPieRecipe[2] = new ItemStack(Blocks.pumpkin);
		pumpPieRecipe[3] = new ItemStack(Items.sugar);
		ItemStack[] applePieRecipe = new ItemStack[9];
		applePieRecipe[0] = new ItemStack(ModItems.flour);
		applePieRecipe[1] = new ItemStack(Items.egg);
		applePieRecipe[2] = new ItemStack(Items.apple);
		applePieRecipe[3] = new ItemStack(Items.sugar);
		ItemStack[] cherryPieRecipe = new ItemStack[9];
		cherryPieRecipe[0] = new ItemStack(ModItems.flour);
		cherryPieRecipe[1] = new ItemStack(Items.egg);
		cherryPieRecipe[2] = new ItemStack(ModItems.cherry);
		cherryPieRecipe[3] = new ItemStack(Items.sugar);
		ItemStack[] lemonTartRecipe = new ItemStack[9];
		lemonTartRecipe[0] = new ItemStack(ModItems.flour);
		lemonTartRecipe[1] = new ItemStack(Items.egg);
		lemonTartRecipe[2] = new ItemStack(ModItems.lemon);
		lemonTartRecipe[3] = new ItemStack(Items.sugar);
		lemonTartRecipe[4] = new ItemStack(Items.water_bucket);
		ovenRecipes[0] = caramelRecipe;
		ovenRecipes[1] = chickenRecipe;
		ovenRecipes[2] = porkchopRecipe;
		ovenRecipes[3] = beefRecipe;
		ovenRecipes[4] = fishRecipe;
		ovenRecipes[5] = salmonRecipe;
		ovenRecipes[6] = toffeeRecipe;
		ovenRecipes[7] = mapleSyrupRecipe;
		ovenRecipes[8] = pancakeRecipe;
		ovenRecipes[9] = breadRecipe;
		ovenRecipes[10] = cakeRecipe;
		ovenRecipes[11] = chocCakeRecipe;
		ovenRecipes[12] = strawCakeRecipe;
		ovenRecipes[13] = pumpPieRecipe;
		ovenRecipes[14] = applePieRecipe;
		ovenRecipes[15] = cherryPieRecipe;
		ovenRecipes[16] = lemonTartRecipe;
		ovenResults[0] = new ItemStack(ModItems.caramel);
		ovenResults[1] = new ItemStack(Items.cooked_chicken);
		ovenResults[2] = new ItemStack(Items.cooked_porkchop);
		ovenResults[3] = new ItemStack(Items.cooked_beef);
		ovenResults[4] = new ItemStack(Items.cooked_fished,1,0);
		ovenResults[5] = new ItemStack(Items.cooked_fished,1,1);
		ovenResults[6] = new ItemStack(ModItems.toffee);
		ovenResults[7] = new ItemStack(ModItems.mapleSyrup);
		ovenResults[8] = new ItemStack(ModItems.pancake);
		ovenResults[9] = new ItemStack(Items.bread);
		ovenResults[10] = new ItemStack(Items.cake);
		ovenResults[11] = new ItemStack(ModItems.chocolateCake);
		ovenResults[12] = new ItemStack(ModItems.strawberryCake);
		ovenResults[13] = new ItemStack(Items.pumpkin_pie);
		ovenResults[14] = new ItemStack(ModItems.applePie);
		ovenResults[15] = new ItemStack(ModItems.cherryPie);
		ovenResults[16] = new ItemStack(ModItems.lemonTart);
	}
}
