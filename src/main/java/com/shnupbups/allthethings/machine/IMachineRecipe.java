package com.shnupbups.allthethings.machine;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IMachineRecipe {
	/**
     * Used to check if a recipe matches current crafting inventory
     */
    boolean matches(IInventory p_77569_1_, World p_77569_2_);

    /**
     * Returns an Item that is the result of this recipe
     */
    ItemStack getCraftingResult(IInventory p_77572_1_);

    /**
     * Returns the size of the recipe area
     */
    int getRecipeSize();

    ItemStack getRecipeOutput();
    ItemStack[] getInputs();
	
	public int getEnergyUsed();
	public boolean hasSecondOutput();
	public ItemStack getSecondOutput();
	public int chanceOfSecondOutput();
	public int getTimeToCraft();
}
