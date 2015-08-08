package com.shnupbups.allthethings.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;

public class OvenRecipeShapeless implements IMachineRecipe
{
    /** Is the ItemStack that you get when craft the recipe. */
    private final ItemStack recipeOutput;
    /** Is a secondary output ItemStack that isn't necessary to define. */
    private final ItemStack secondOutput;
    /** Is a List of ItemStack that composes the recipe. */
    public final List recipeItems;
    /** Is amount of RF consumed during the crafting process. Default 1600.*/
    public final int rfUsed;
    /** Is amount of ticks i takes to craft the recipe. Default 160.*/
    public final int craftTime;
    /** Is percentage chance of second output item being produced. Default 0.*/
    public final int secondChance;
    private static final String __OBFID = "CL_00000094";

    public OvenRecipeShapeless(ItemStack output, List recipe)
    {
        this.recipeOutput = output;
        this.recipeItems = recipe;
        this.secondOutput = null;
        this.rfUsed = 1600;
        this.craftTime = 160;
        this.secondChance = 0;
    }
    
    public OvenRecipeShapeless(ItemStack output, List recipe, int craftTime)
    {
    	this.recipeOutput = output;
        this.recipeItems = recipe;
        this.secondOutput = null;
        this.rfUsed = 1600;
        this.craftTime = craftTime;
        this.secondChance = 0;
    }
    
    public OvenRecipeShapeless(ItemStack output, List recipe, int craftTime, int rf)
    {
    	this.recipeOutput = output;
        this.recipeItems = recipe;
        this.secondOutput = null;
        this.rfUsed = rf;
        this.craftTime = craftTime;
        this.secondChance = 0;
    }

    public OvenRecipeShapeless(ItemStack output, List recipe, ItemStack secondOutput, int secondChance)
    {
    	this.recipeOutput = output;
        this.recipeItems = recipe;
        this.secondOutput = secondOutput;
        this.secondChance = secondChance;
        this.rfUsed = 1600;
        this.craftTime = 160;
    }
    
    public OvenRecipeShapeless(ItemStack output, List recipe, ItemStack secondOutput, int secondChance, int craftTime, int rf)
    {
    	this.recipeOutput = output;
        this.recipeItems = recipe;
        this.secondOutput = secondOutput;
        this.secondChance = secondChance;
        this.rfUsed = rf;
        this.craftTime = craftTime;
    }
    
    public ItemStack getRecipeOutput()
    {
        return this.recipeOutput;
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    public boolean matches(TileEntityOven p_77569_1_, World p_77569_2_)
    {
        ArrayList arraylist = new ArrayList(this.recipeItems);

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j)
            {
                ItemStack itemstack = p_77569_1_.getStackInRowAndColumn(j, i);

                if (itemstack != null)
                {
                    boolean flag = false;
                    Iterator iterator = arraylist.iterator();

                    while (iterator.hasNext())
                    {
                        ItemStack itemstack1 = (ItemStack)iterator.next();

                        if (itemstack.getItem() == itemstack1.getItem() && (itemstack1.getItemDamage() == 32767 || itemstack.getItemDamage() == itemstack1.getItemDamage()))
                        {
                            flag = true;
                            arraylist.remove(itemstack1);
                            break;
                        }
                    }

                    if (!flag)
                    {
                        return false;
                    }
                }
            }
        }

        return arraylist.isEmpty();
    }

    /**
     * Returns an Item that is the result of this recipe
     */
    public ItemStack getCraftingResult(TileEntityOven p_77572_1_)
    {
        return this.recipeOutput.copy();
    }

    /**
     * Returns the size of the recipe area
     */
    public int getRecipeSize()
    {
        return this.recipeItems.size();
    }

	@Override
	public int getEnergyUsed() {
		return rfUsed;
	}

	@Override
	public boolean hasSecondOutput() {
		return secondOutput != null;
	}

	@Override
	public ItemStack getSecondOutput() {
		return secondOutput;
	}

	@Override
	public int getTimeToCraft() {
		return craftTime;
	}

	@Override
	public boolean matches(IInventory p_77569_1_, World p_77569_2_) {
		return matches((TileEntityOven)p_77569_1_, p_77569_2_);
	}

	@Override
	public ItemStack getCraftingResult(IInventory p_77572_1_) {
		return getCraftingResult((TileEntityOven)p_77572_1_);
	}

	@Override
	public ItemStack[] getInputs() {
		return (ItemStack[]) recipeItems.toArray();
	}

	@Override
	public int chanceOfSecondOutput() {
		return secondChance;
	}
}