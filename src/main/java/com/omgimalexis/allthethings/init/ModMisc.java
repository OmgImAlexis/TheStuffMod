package com.omgimalexis.allthethings.init;

import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.omgimalexis.allthethings.utility.UtilityCheck;
import com.omgimalexis.allthethings.world.village.VillageTrades;

import cpw.mods.fml.common.registry.VillagerRegistry;

public class ModMisc {
	public static ChestGenHooks houseChest;
	
	public static String GEM_HOUSE = "gemHouse";
	
	public static void init() {
		houseChest = new ChestGenHooks(GEM_HOUSE, new WeightedRandomChestContent[0], 2, 8);
		
    	VillagerRegistry.instance().registerVillageTradeHandler(56329, new VillageTrades());
	}
}
