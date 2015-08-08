package com.shnupbups.allthethings.init;

import java.util.ArrayList;

import com.shnupbups.allthethings.utility.OvenRecipes;
import com.shnupbups.allthethings.utility.Register;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCustomRecipes {
	
	public static void init() {
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.caramel,2), new ItemStack(Items.sugar), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket), new ItemStack(Items.milk_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.toffee,2), new ItemStack(Items.sugar), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_chicken), new ItemStack(Items.chicken));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_porkchop), new ItemStack(Items.porkchop));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_beef), new ItemStack(Items.beef));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_fished), new ItemStack(Items.fish,1,0));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_fished,1,1), new ItemStack(Items.fish,1,1));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cookedTortoise), new ItemStack(ModItems.rawTortoise));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cookedGrawquat), new ItemStack(ModItems.rawGrawquat));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.mapleSyrup), new ItemStack(ModItems.mapleSap), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.pancake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.milk_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.bread), new ItemStack(Items.water_bucket), new ItemStack(ModItems.flour));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.water_bucket), new ItemStack(Items.milk_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.chocolateCake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.water_bucket), new ItemStack(ModItems.chocolateMilk));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.strawberryCake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.water_bucket), new ItemStack(ModItems.strawberryMilk));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.pumpkin_pie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Blocks.pumpkin), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.applePie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.apple), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cherryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.cherry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.lemonTart), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.lemon), new ItemStack(Items.egg), new ItemStack(Items.water_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.raspberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.raspberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.blueberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.blueberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.blackberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.blackberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.strawberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.strawberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.boysenberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.boysenberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cranberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.cranberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.pearPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.pear), new ItemStack(Items.egg));
	
		Register.registerPulverizerRecipe(Blocks.iron_ore, new ItemStack(ModItems.dustIron, 2), new ItemStack(ModItems.dustSteel, 1), 1);
	}
}
