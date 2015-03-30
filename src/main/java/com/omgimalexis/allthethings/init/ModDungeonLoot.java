package com.omgimalexis.allthethings.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

import com.omgimalexis.allthethings.utility.UtilityCheck;

public class ModDungeonLoot {

	public static void init() {
		for (int i = 0; i < UtilityCheck.getListOfMaterials().size(); i++) {
			ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent((Item) UtilityCheck.getListOfMaterials().get(i), 1, 1, 5, 10));
		}
	}
	
}
