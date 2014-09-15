package omgimalexis.allthethings.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import omgimalexis.allthethings.item.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void mainRegistry() {
		addCraftingRecipies();
		addSmeltingRecipies();
	}

	public static void addCraftingRecipies() {
		// Shaped Recipie
		GameRegistry.addRecipe(new ItemStack(Items.tutPickaxe, 1), new Object[] { "###", " S ", " S ", '#', Items.tutItem, 'S', Items.stick });
		
		//Shapeless Recipie
		GameRegistry.addShapelessRecipe(new ItemStack(Items.tutItem, 10), new Object[]{Blocks.dirt , Blocks.cobblestone});
	}

	public static void addSmeltingRecipies() {
		GameRegistry.addSmelting(Items.tutItem, new ItemStack(Blocks.diamond_block, 5), 20.0F);
	}
}
