package com.shnupbups.allthethings.world.village;

import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.utility.UtilityCheck;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MechanicTrades implements IVillageTradeHandler{
	//Thanks Tinker's
	
	private final List<ItemStack> allowedIngredients = new ArrayList<ItemStack>();
	
	private final int min = 1;
	private final int max = 16;
	
	public MechanicTrades() {
		super();
		
		for(int i = 0; i < UtilityCheck.getListOfMaterials().size(); i++) {
			if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getDimension() == MaterialDimension.OVERWORLD) {
				if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.GEAR) {
					allowedIngredients.add(new ItemStack(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)), UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/2));
				}
			}
		}
	}
	
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		if (villager.getProfession() == 56330) {
			ItemStack ingredient;
			ItemStack ingredient2;
			ItemStack result;
			
			for (int sc = 8; sc <12; sc++) {
				if(random.nextInt(4) <= 2) {
					int num = getNextInt(random, min, max);
				
					ingredient = getIngredient(random, num);
					if(ingredient.stackSize < 13 && random.nextInt(5) <= 2) {
						ingredient2 = getIngredient(random, ingredient);
						if(ingredient2.getItem() == ingredient.getItem()) {
							ingredient.stackSize+=ingredient2.stackSize;
							ingredient2 = null;
						}
					} else {
						ingredient2 = null;
					}
					result = new ItemStack(Items.emerald,random.nextInt(12)+1);
					recipeList.addToListWithCheck(new MerchantRecipe(ingredient, ingredient2, result));
				} else {
					int num = getNextInt(random, min, max);
					
					ingredient = new ItemStack(Items.emerald,random.nextInt(12)+1);
					ingredient2 = null;
					result = getIngredient(random, num);
					recipeList.addToListWithCheck(new MerchantRecipe(ingredient, ingredient2, result));
				}
			}
		}
		
	}
	
	private ItemStack getIngredient (Random random, ItemStack ingredient){
		 int sc;
		 ItemStack is;
		 int tries = 0;
		 while (true){
			 sc = getNextInt(random, 0, allowedIngredients.size() - 1);
			 is = allowedIngredients.get(sc);

			 if (is != ingredient || is.getItemDamage() != ingredient.getItemDamage())
				 break;

			 tries++;
			 if (tries == 5)
				 return null;
		 }
		 int num = getNextInt(random, 0, Math.min(is.stackSize, max - ingredient.stackSize));
		 return is.copy().splitStack(num);
	}

	 private ItemStack getIngredient (Random random, int num){
		 int sc = getNextInt(random, 0, allowedIngredients.size() - 1);
		 ItemStack item = allowedIngredients.get(sc);
		 return item.copy().splitStack(Math.min(num, item.stackSize));
	}

    private int getNextInt (Random random, int min, int max){
        return random.nextInt(Math.max(1, (max - min) + 1)) + min;
    }
    
    private int calcStackSize (ItemStack ingredient, ItemStack ingredient2){
        if (ingredient == null)
            return 1;
        int num = ingredient.stackSize;
        if (ingredient2 != null)
            num += ingredient2.stackSize;

        return Math.max(1, Math.round((num - 5) / 4));
    }

}
