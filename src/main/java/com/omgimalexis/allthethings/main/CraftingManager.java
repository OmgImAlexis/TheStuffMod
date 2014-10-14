package com.omgimalexis.allthethings.main;

public class CraftingManager {

	public static void mainRegistry() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}

	public static void addCraftingRecipes() {
		// Shaped Recipe
//		GameRegistry.addRecipe(new ItemStack(Items.tutPickaxe, 1), new Object[] { "###", " S ", " S ", '#', Items.tutItem, 'S', Items.stick });
//		
//		//Shapeless Recipe
//		GameRegistry.addShapelessRecipe(new ItemStack(Items.tutItem, 10), new Object[]{Blocks.dirt , Blocks.cobblestone});
	}

	public static void addSmeltingRecipes() {
		//GameRegistry.addSmelting(Items.tutItem, new ItemStack(Blocks.diamond_block, 5), 20.0F);
	}
}
