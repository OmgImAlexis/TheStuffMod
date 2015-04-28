package com.omgimalexis.allthethings.world.village;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import scala.Int;

import com.omgimalexis.allthethings.init.ModItems;
import com.omgimalexis.allthethings.init.ModMisc;
import com.omgimalexis.allthethings.item.ItemMaterial;
import com.omgimalexis.allthethings.item.MaterialDimension;
import com.omgimalexis.allthethings.item.MaterialType;
import com.omgimalexis.allthethings.utility.MiscUtility;
import com.omgimalexis.allthethings.utility.UtilityCheck;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class VillageTrades implements IVillageTradeHandler{
	//Thanks Tinker's
	
	private final List<ItemStack> allowedIngredients = new ArrayList<ItemStack>();
	
	private final int min = 1;
	private final int max = 16;
	
	public VillageTrades() {
		super();
		
		for(int i = 0; i < UtilityCheck.getListOfMaterials().size(); i++) {
			if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getDimension() == MaterialDimension.OVERWORLD) {
				if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.GEM || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.PUREGEM) {
					allowedIngredients.add(new ItemStack(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)), UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/2));
				}
			}
		}
		allowedIngredients.add(new ItemStack(Items.diamond, 4));
		allowedIngredients.add(new ItemStack(Items.emerald, 16));
	}
	
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		if (villager.getProfession() == 56329) {
			ItemStack ingredient;
			ItemStack ingredient2;
			ItemStack result;
			
			for (int sc = 8; sc <12; sc++) {
				int num = getNextInt(random, min, max);
				
				ingredient = getIngredient(random, num);
				if(ingredient.stackSize < 13) {
					ingredient2 = getIngredient(random, ingredient);
				} else {
					ingredient2 = null;
				}
				result = getIngredient(random, getNextInt(random, min, max));
				recipeList.addToListWithCheck(new MerchantRecipe(ingredient, ingredient2, result));
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
