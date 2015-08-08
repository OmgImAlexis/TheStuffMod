package com.shnupbups.allthethings.utility;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

public class PulverizerRecipe implements IMachineRecipe{
    /** Is a array of ItemStack that composes the recipe. */
    public final ItemStack recipeItem;
    /** Is the ItemStack that you get when craft the recipe. */
    private final ItemStack recipeOutput;
    /** Is a secondary output ItemStack that isn't necessary to define. */
    private final ItemStack secondOutput;
    /** Is amount of RF consumed during the crafting process. Default 2000.*/
    public final int rfUsed;
    /** Is amount of ticks i takes to craft the recipe. Default 200.*/
    public final int craftTime;
    /** Is percentage chance of second output item being produced. Default 0.*/
    public final int secondChance;
    private boolean field_92101_f;
    private static final String __OBFID = "CL_00000093";

    public PulverizerRecipe(ItemStack output, ItemStack input)
    {
        this.recipeItem = input;
        this.recipeOutput = output;
        this.secondOutput = null;
        this.rfUsed = 2000;
        this.craftTime = 200;
        this.secondChance = 0;
    }
    
    public PulverizerRecipe(ItemStack output, ItemStack input, int craftTime)
    {
        this.recipeItem = input;
        this.recipeOutput = output;
        this.secondOutput = null;
        this.rfUsed = 2000;
        this.craftTime = craftTime;
        this.secondChance = 0;
    }

    public PulverizerRecipe(ItemStack output, ItemStack input, int craftTime, int rf)
    {
        this.recipeItem = input;
        this.recipeOutput = output;
        this.secondOutput = null;
        this.rfUsed = rf;
        this.craftTime = craftTime;
        this.secondChance = 0;
    }
    
    public PulverizerRecipe(ItemStack output, ItemStack input, ItemStack secondOutput, int secondChance)
    {
        this.recipeItem = input;
        this.recipeOutput = output;
        this.secondOutput = secondOutput;
        this.secondChance = secondChance;
        this.rfUsed = 2000;
        this.craftTime = 200;
    }
    
    public PulverizerRecipe(ItemStack output, ItemStack input, int craftTime, int rf, ItemStack secondOutput, int secondChance)
    {
        this.recipeItem = input;
        this.recipeOutput = output;
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
    public boolean matches(TileEntityPulverizer p_77569_1_, World p_77569_2_)
    {
    	return(p_77569_1_.getStackInSlot(0) != null && p_77569_1_.getStackInSlot(0).isItemEqual(recipeItem) && p_77569_1_.getStackInSlot(0).stackSize >= recipeItem.stackSize);
    }


    /**
     * Returns an Item that is the result of this recipe
     */
    public ItemStack getCraftingResult(TileEntityPulverizer p_77572_1_)
    {
        ItemStack itemstack = this.getRecipeOutput().copy();

        if (this.field_92101_f)
        {
            for (int i = 0; i < p_77572_1_.getSizeInventory(); ++i)
            {
                ItemStack itemstack1 = p_77572_1_.getStackInSlot(i);

                if (itemstack1 != null && itemstack1.hasTagCompound())
                {
                    itemstack.setTagCompound((NBTTagCompound)itemstack1.stackTagCompound.copy());
                }
            }
        }

        return itemstack;
    }

    public PulverizerRecipe func_92100_c()
    {
        this.field_92101_f = true;
        return this;
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
		return matches((TileEntityPulverizer)p_77569_1_, p_77569_2_);
	}

	@Override
	public ItemStack getCraftingResult(IInventory p_77572_1_) {
		return getCraftingResult((TileEntityPulverizer)p_77572_1_);
	}

	@Override
	public int getRecipeSize() {
		return 1;
	}

	@Override
	public ItemStack[] getInputs() {
		return new ItemStack[]{recipeItem};
	}

	@Override
	public int chanceOfSecondOutput() {
		return secondChance;
	}
}
