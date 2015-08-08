package com.shnupbups.allthethings.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

public class PulverizerRecipes {

	/** The static instance of this class */
    private static final PulverizerRecipes instance = new PulverizerRecipes();
    /** A list of all the recipes added */
    private List recipes = new ArrayList();
	
    /**
     * Returns the static instance of this class
     */
    public static final PulverizerRecipes getInstance() {
        return instance;
    }

    private PulverizerRecipes() {
    	
    }
    
    public PulverizerRecipe addRecipe(ItemStack output, ItemStack input)
    {
        PulverizerRecipe PulverizerRecipe = new PulverizerRecipe(output, input);
        this.recipes.add(PulverizerRecipe);
        return PulverizerRecipe;
    }
    
    public PulverizerRecipe addRecipe(ItemStack output, ItemStack input, ItemStack secondOutput, int secondChance)
    {
        PulverizerRecipe PulverizerRecipe = new PulverizerRecipe(output, input, secondOutput, secondChance);
        this.recipes.add(PulverizerRecipe);
        return PulverizerRecipe;
    }
    
    public PulverizerRecipe addRecipe(ItemStack output, ItemStack input, int rf, int craftTime)
    {
        PulverizerRecipe PulverizerRecipe = new PulverizerRecipe(output, input, rf, craftTime);
        this.recipes.add(PulverizerRecipe);
        return PulverizerRecipe;
    }
    
    public PulverizerRecipe addRecipe(ItemStack output, ItemStack input, int rf, int craftTime, ItemStack secondOutput, int secondChance)
    {
        PulverizerRecipe PulverizerRecipe = new PulverizerRecipe(output, input, craftTime, rf, secondOutput, secondChance);
        this.recipes.add(PulverizerRecipe);
        return PulverizerRecipe;
    }

    public IMachineRecipe findMatchingRecipe(TileEntityPulverizer p_82787_1_, World p_82787_2_)
    {
    	int j;
        for (j = 0; j < this.recipes.size(); ++j) {
            IMachineRecipe IMachineRecipe = (IMachineRecipe)this.recipes.get(j);

            if (IMachineRecipe.matches(p_82787_1_, p_82787_2_)) {
                return IMachineRecipe;
            }
        }

        return null;
    }
    
    public ItemStack findMatchingOutput(TileEntityPulverizer p_82787_1_, World p_82787_2_)
    {
    	int j;
        for (j = 0; j < this.recipes.size(); ++j) {
            IMachineRecipe IMachineRecipe = (IMachineRecipe)this.recipes.get(j);

            if (IMachineRecipe.matches(p_82787_1_, p_82787_2_)) {
                return IMachineRecipe.getRecipeOutput();
            }
        }

        return null;
    }
    
    public ItemStack findMatchingSecondOutput(TileEntityPulverizer p_82787_1_, World p_82787_2_)
    {
    	int j;
        for (j = 0; j < this.recipes.size(); ++j) {
            IMachineRecipe IMachineRecipe = (IMachineRecipe)this.recipes.get(j);

            if (IMachineRecipe.matches(p_82787_1_, p_82787_2_)) {
                return IMachineRecipe.getSecondOutput();
            }
        }

        return null;
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}
