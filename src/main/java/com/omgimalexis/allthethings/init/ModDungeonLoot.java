package com.omgimalexis.allthethings.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

import com.omgimalexis.allthethings.item.ItemMaterial;
import com.omgimalexis.allthethings.item.MaterialDimension;
import com.omgimalexis.allthethings.item.MaterialType;
import com.omgimalexis.allthethings.utility.UtilityCheck;

public class ModDungeonLoot {
 
	public static void init() {
		for (int i = 0; i < UtilityCheck.getListOfMaterials().size(); i++) {
			if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getDimension() == MaterialDimension.OVERWORLD) {
				if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.INGOT || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.GEM || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.ALLOY || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.PUREGEM) {
					ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 3, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/5));
					ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 2, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/10));
					ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 3, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/7));
					ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 5, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/3));
					ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 7, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/2));
					if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.INGOT || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.ALLOY) {
						ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 7, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/20));
					}
				}
			} else if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getDimension() == MaterialDimension.END) {
				ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 7, UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/2));
			}
		}
	}
	
}
