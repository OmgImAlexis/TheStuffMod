package com.shnupbups.allthethings.init;

import java.util.Random;

import scala.Int;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.utility.LogHelper;
import com.shnupbups.allthethings.utility.MiscUtility;
import com.shnupbups.allthethings.utility.UtilityCheck;

public class ModDungeonLoot {
 
	public static void init() {
		for (int i = 0; i < UtilityCheck.getListOfMaterials().size(); i++) {
			if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getDimension() == MaterialDimension.OVERWORLD) {
				if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.INGOT || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.GEM || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.NUGGET ||((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.ALLOY || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.PUREGEM) {
					ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 3, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/5, 1, Int.MaxValue())));
					ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 2, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/10, 1, Int.MaxValue())));
					ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 3, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/7, 1, Int.MaxValue())));
					ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 5, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/3, 1, Int.MaxValue())));
					ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 7, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/2, 1, Int.MaxValue())));
				}
				
				if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.INGOT || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.ALLOY || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.PLATE || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.NUGGET) {
					ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 3, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/20, 1, Int.MaxValue())));
				}
				
				if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.GEM || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.PUREGEM || ((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getType() == MaterialType.SHARD) {
					ModMisc.houseChest.addItem(new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 5, MiscUtility.clamp(UtilityCheck.getBaseRarity(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)))/2, 1, Int.MaxValue())));
				}
			} else if(((ItemMaterial) UtilityCheck.getListOfMaterials().get(i)).getDimension() == MaterialDimension.END) {
				ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent((ItemMaterial) UtilityCheck.getListOfMaterials().get(i), 0, 1, 7, MiscUtility.clamp(UtilityCheck.getBaseRarity((ItemMaterial) UtilityCheck.getListOfMaterials().get(i))/2, 1, Int.MaxValue())));
			}
		}
		ModMisc.houseChest.addItem(new WeightedRandomChestContent(Items.diamond, 0, 1, 5, 7));
		ModMisc.houseChest.addItem(new WeightedRandomChestContent(Items.emerald, 0, 1, 5, 10));
		ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(Items.gold_nugget, 0, 1, 3, MiscUtility.clamp(UtilityCheck.getBaseRarity((ModItems.nuggetSilver))/20, 1, Int.MaxValue())));
	}
	
}
