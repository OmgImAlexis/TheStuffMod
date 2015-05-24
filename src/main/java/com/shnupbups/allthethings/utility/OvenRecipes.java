package com.shnupbups.allthethings.utility;

import com.shnupbups.allthethings.init.ModCustomRecipes;
import net.minecraft.item.ItemStack;

public class OvenRecipes {
	
	public static ItemStack getCookResult(ItemStack[] inventory) {		
		int isCorrect = 0;
		for (int i = 0; i < ModCustomRecipes.ovenRecipes.length; i++) {
			if(ModCustomRecipes.ovenRecipes[i] != null) {
				for (int j = 0; j < ModCustomRecipes.ovenRecipes[i].length; j++) {
					if(ModCustomRecipes.ovenRecipes[i][j] != null && ModCustomRecipes.ovenRecipes[i][j].getItem() != null) {
						int currentCorrect = isCorrect;
						for (int k = 0; k < 9; k++) {
							if(inventory[k] != null && inventory[k].getItem() != null) {
								if(inventory[k].getItem() == ModCustomRecipes.ovenRecipes[i][j].getItem() && inventory[k].getItemDamage() == ModCustomRecipes.ovenRecipes[i][j].getItemDamage()) {
									isCorrect++;
								}
							}
						}
						if(isCorrect == currentCorrect || isCorrect > currentCorrect+1) {
							isCorrect = 0;
							break;
						}
						for (int l = 0; l < 9; l++) {
							if(inventory[l] != null && inventory[l].getItem() != null) {
								int correct2 = 0;
								for (int m = 0; m < ModCustomRecipes.ovenRecipes[i].length; m++) {
									if(ModCustomRecipes.ovenRecipes[i][m] != null && ModCustomRecipes.ovenRecipes[i][m].getItem() != null) {
										if(inventory[l].getItem() == ModCustomRecipes.ovenRecipes[i][m].getItem() && inventory[l].getItemDamage() == ModCustomRecipes.ovenRecipes[i][m].getItemDamage()) {
											correct2++;
										}
									}
								}
								if(correct2 != 1) {
									isCorrect = 0;
									break;
								}
							}
						}
					}
				}
				if(isCorrect != 0) {
					return ModCustomRecipes.ovenResults[i];
				}
			}
			
		} 
		
		for (int i = 0; i < ModCustomRecipes.ovenShapedRecipes.length; i++) {
			if(inventory == ModCustomRecipes.ovenShapedRecipes[i]) {
				return ModCustomRecipes.ovenShapedResults[i];
			}
		}
		
		return null;
	}
	
	private static boolean stackSizeIsMoreOrEqual(ItemStack itemstack, int stackSize) {
		return itemstack.stackSize >= stackSize;
	}
	
	public static int getStackSizeToDecrease(ItemStack[] inventory) {
		return 1;
	}
}
