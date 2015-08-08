package com.shnupbups.allthethings.utility;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;

public class OvenRecipeShaped implements IMachineRecipe{
	/** How many horizontal slots this recipe is wide. */
    public final int recipeWidth;
    /** How many vertical slots this recipe uses. */
    public final int recipeHeight;
    /** Is a array of ItemStack that composes the recipe. */
    public final ItemStack[] recipeItems;
    /** Is the ItemStack that you get when craft the recipe. */
    private final ItemStack recipeOutput;
    /** Is a secondary output ItemStack that isn't necessary to define. */
    private final ItemStack secondOutput;
    /** Is amount of RF consumed during the crafting process. Default 1600.*/
    public final int rfUsed;
    /** Is amount of ticks i takes to craft the recipe. Default 160.*/
    public final int craftTime;
    /** Is percentage chance of second output item being produced. Default 0.*/
    public final int secondChance;
    private boolean field_92101_f;
    private static final String __OBFID = "CL_00000093";

    public OvenRecipeShaped(int p_i1917_1_, int p_i1917_2_, ItemStack[] p_i1917_3_, ItemStack p_i1917_4_)
    {
        this.recipeWidth = p_i1917_1_;
        this.recipeHeight = p_i1917_2_;
        this.recipeItems = p_i1917_3_;
        this.recipeOutput = p_i1917_4_;
        this.secondOutput = null;
        this.secondChance = 0;
        this.rfUsed = 1600;
        this.craftTime = 160;
    }
    
    public OvenRecipeShaped(int p_i1917_1_, int p_i1917_2_, ItemStack[] p_i1917_3_, ItemStack p_i1917_4_, int craftTime)
    {
        this.recipeWidth = p_i1917_1_;
        this.recipeHeight = p_i1917_2_;
        this.recipeItems = p_i1917_3_;
        this.recipeOutput = p_i1917_4_;
        this.secondOutput = null;
        this.secondChance = 0;
        this.rfUsed = 1600;
        this.craftTime = craftTime;
    }

    public OvenRecipeShaped(int p_i1917_1_, int p_i1917_2_, ItemStack[] p_i1917_3_, ItemStack p_i1917_4_, int craftTime, int rf)
    {
        this.recipeWidth = p_i1917_1_;
        this.recipeHeight = p_i1917_2_;
        this.recipeItems = p_i1917_3_;
        this.recipeOutput = p_i1917_4_;
        this.secondOutput = null;
        this.secondChance = 0;
        this.rfUsed = rf;
        this.craftTime = craftTime;
    }
    
    public OvenRecipeShaped(int p_i1917_1_, int p_i1917_2_, ItemStack[] p_i1917_3_, ItemStack p_i1917_4_, ItemStack secondOutput, int secondChance)
    {
        this.recipeWidth = p_i1917_1_;
        this.recipeHeight = p_i1917_2_;
        this.recipeItems = p_i1917_3_;
        this.recipeOutput = p_i1917_4_;
        this.secondOutput = secondOutput;
        this.secondChance = secondChance;
        this.rfUsed = 1600;
        this.craftTime = 160;
    }
    
    public OvenRecipeShaped(int p_i1917_1_, int p_i1917_2_, ItemStack[] p_i1917_3_, ItemStack p_i1917_4_, int craftTime, int rf, ItemStack secondOutput, int secondChance)
    {
        this.recipeWidth = p_i1917_1_;
        this.recipeHeight = p_i1917_2_;
        this.recipeItems = p_i1917_3_;
        this.recipeOutput = p_i1917_4_;
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
        for (int i = 0; i <= 3 - this.recipeWidth; ++i)
        {
            for (int j = 0; j <= 3 - this.recipeHeight; ++j)
            {
                if (this.checkMatch(p_77569_1_, i, j, true))
                {
                    return true;
                }

                if (this.checkMatch(p_77569_1_, i, j, false))
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks if the region of a crafting inventory is match for the recipe.
     */
    private boolean checkMatch(TileEntityOven p_77573_1_, int p_77573_2_, int p_77573_3_, boolean p_77573_4_)
    {
        for (int k = 0; k < 3; ++k)
        {
            for (int l = 0; l < 3; ++l)
            {
                int i1 = k - p_77573_2_;
                int j1 = l - p_77573_3_;
                ItemStack itemstack = null;

                if (i1 >= 0 && j1 >= 0 && i1 < this.recipeWidth && j1 < this.recipeHeight)
                {
                    if (p_77573_4_)
                    {
                        itemstack = this.recipeItems[this.recipeWidth - i1 - 1 + j1 * this.recipeWidth];
                    }
                    else
                    {
                        itemstack = this.recipeItems[i1 + j1 * this.recipeWidth];
                    }
                }

                ItemStack itemstack1 = p_77573_1_.getStackInRowAndColumn(k, l);

                if (itemstack1 != null || itemstack != null)
                {
                    if (itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                    {
                        return false;
                    }

                    if (itemstack.getItem() != itemstack1.getItem())
                    {
                        return false;
                    }

                    if (itemstack.getItemDamage() != 32767 && itemstack.getItemDamage() != itemstack1.getItemDamage())
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    /**
     * Returns an Item that is the result of this recipe
     */
    public ItemStack getCraftingResult(TileEntityOven p_77572_1_)
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

    /**
     * Returns the size of the recipe area
     */
    public int getRecipeSize()
    {
        return this.recipeWidth * this.recipeHeight;
    }

    public OvenRecipeShaped func_92100_c()
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
		return matches((TileEntityOven)p_77569_1_, p_77569_2_);
	}

	@Override
	public ItemStack getCraftingResult(IInventory p_77572_1_) {
		return getCraftingResult((TileEntityOven)p_77572_1_);
	}

	@Override
	public ItemStack[] getInputs() {
		return recipeItems;
	}

	@Override
	public int chanceOfSecondOutput() {
		return secondChance;
	}
}
