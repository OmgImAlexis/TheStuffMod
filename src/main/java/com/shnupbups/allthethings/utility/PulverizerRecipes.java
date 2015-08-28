package com.shnupbups.allthethings.utility;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

public class PulverizerRecipes {
	/** The static instance of this class */
	private static final PulverizerRecipes instance=new PulverizerRecipes();
	/** A list of all the recipes added */
	private List recipes=new ArrayList();

	/**
	 * Returns the static instance of this class
	 */
	public static final PulverizerRecipes getInstance() {
		return instance;
	}

	private PulverizerRecipes() {}

	public IMachineRecipe addRecipe(ItemStack output,Object input) {
		Object input2=Register.parseObjectToStackOrString(input);
		if(input2 instanceof ItemStack) {
			return this.addRecipe(output,(ItemStack)input2);
		} else if(input2 instanceof String) {
			return this.addRecipe(output,(String)input2);
		} else throw new IllegalArgumentException("Given input for recipe is not an Item, Block, ItemStack or String. Instead was "+Object.class.getSimpleName());
	}

	public IMachineRecipe addRecipe(ItemStack output,Object input,ItemStack secondOutput,int secondChance) {
		Object input2=Register.parseObjectToStackOrString(input);
		if(input2 instanceof ItemStack) {
			return this.addRecipe(output,(ItemStack)input2,secondOutput,secondChance);
		} else if(input2 instanceof String) {
			return this.addRecipe(output,(String)input2,secondOutput,secondChance);
		} else throw new IllegalArgumentException("Given input for recipe is not an Item, Block, ItemStack or String. Instead was "+Object.class.getSimpleName());
	}

	public IMachineRecipe addRecipe(ItemStack output,Object input,int rf,int craftTime) {
		Object input2=Register.parseObjectToStackOrString(input);
		if(input2 instanceof ItemStack) {
			return this.addRecipe(output,(ItemStack)input2,rf,craftTime);
		} else if(input2 instanceof String) {
			return this.addRecipe(output,(String)input2,rf,craftTime);
		} else throw new IllegalArgumentException("Given input for recipe is not an Item, Block, ItemStack or String. Instead was "+input.getClass().getSimpleName());
	}

	public IMachineRecipe addRecipe(ItemStack output,Object input,int rf,int craftTime,ItemStack secondOutput,int secondChance) {
		Object input2=Register.parseObjectToStackOrString(input);
		if(input2 instanceof ItemStack) {
			return this.addRecipe(output,(ItemStack)input2,rf,craftTime,secondOutput,secondChance);
		} else if(input2 instanceof String) {
			return this.addRecipe(output,(String)input2,rf,craftTime,secondOutput,secondChance);
		} else throw new IllegalArgumentException("Given input for recipe is not an Item, Block, ItemStack or String. Instead was "+input.getClass().getSimpleName());
	}

	public PulverizerRecipe addRecipe(ItemStack output,ItemStack input) {
		PulverizerRecipe PulverizerRecipe=new PulverizerRecipe(output,input);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerRecipe addRecipe(ItemStack output,ItemStack input,ItemStack secondOutput,int secondChance) {
		PulverizerRecipe PulverizerRecipe=new PulverizerRecipe(output,input,secondOutput,secondChance);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerRecipe addRecipe(ItemStack output,ItemStack input,int rf,int craftTime) {
		PulverizerRecipe PulverizerRecipe=new PulverizerRecipe(output,input,craftTime,rf);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerRecipe addRecipe(ItemStack output,ItemStack input,int rf,int craftTime,ItemStack secondOutput,int secondChance) {
		PulverizerRecipe PulverizerRecipe=new PulverizerRecipe(output,input,craftTime,rf,secondOutput,secondChance);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerOreRecipe addRecipe(ItemStack output,String input) {
		PulverizerOreRecipe PulverizerRecipe=new PulverizerOreRecipe(output,input);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerOreRecipe addRecipe(ItemStack output,String input,ItemStack secondOutput,int secondChance) {
		PulverizerOreRecipe PulverizerRecipe=new PulverizerOreRecipe(output,input,secondOutput,secondChance);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerOreRecipe addRecipe(ItemStack output,String input,int rf,int craftTime) {
		PulverizerOreRecipe PulverizerRecipe=new PulverizerOreRecipe(output,input,craftTime,rf);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public PulverizerOreRecipe addRecipe(ItemStack output,String input,int rf,int craftTime,ItemStack secondOutput,int secondChance) {
		PulverizerOreRecipe PulverizerRecipe=new PulverizerOreRecipe(output,input,craftTime,rf,secondOutput,secondChance);
		this.recipes.add(PulverizerRecipe);
		return PulverizerRecipe;
	}

	public IMachineRecipe findMatchingRecipe(TileEntityPulverizer p_82787_1_,World p_82787_2_) {
		int j;
		for(j=0;j<this.recipes.size();++j) {
			IMachineRecipe IMachineRecipe=(IMachineRecipe)this.recipes.get(j);
			if(IMachineRecipe.matches(p_82787_1_,p_82787_2_)) {
				return IMachineRecipe;
			}
		}
		return null;
	}

	public ItemStack findMatchingOutput(TileEntityPulverizer p_82787_1_,World p_82787_2_) {
		int j;
		for(j=0;j<this.recipes.size();++j) {
			IMachineRecipe IMachineRecipe=(IMachineRecipe)this.recipes.get(j);
			if(IMachineRecipe.matches(p_82787_1_,p_82787_2_)) {
				return IMachineRecipe.getRecipeOutput();
			}
		}
		return null;
	}

	public ItemStack findMatchingSecondOutput(TileEntityPulverizer p_82787_1_,World p_82787_2_) {
		int j;
		for(j=0;j<this.recipes.size();++j) {
			IMachineRecipe IMachineRecipe=(IMachineRecipe)this.recipes.get(j);
			if(IMachineRecipe.matches(p_82787_1_,p_82787_2_)) {
				return IMachineRecipe.getSecondOutput();
			}
		}
		return null;
	}

	/**
	 * returns the List<> of all recipes
	 */
	public List getRecipeList() {
		return this.recipes;
	}
}
