package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.init.ModTools;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakHandler {
	@SubscribeEvent
	public void OnBlockBreak(HarvestDropsEvent event) {
		if(event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().getItem() != null) {
			if(event.harvester.getHeldItem().getItem() instanceof ItemTool && ((ItemTool) event.harvester.getHeldItem().getItem()).func_150913_i() == ModTools.FYRESTONE) {
				if(FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block)) != null && !event.isSilkTouching) {
					event.drops.clear();
					if(event.fortuneLevel >= 1) {
						for(int i = 0; i < event.world.rand.nextInt(Math.abs(event.fortuneLevel))+1; i++) {
							event.drops.add(FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block)));
						}
					} else {
						event.drops.add(FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block)));
					}
				}
			}
		}
	}
}
