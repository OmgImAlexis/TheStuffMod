package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.init.ModTools;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class BlockBreakHandler {
	@SubscribeEvent
	public void OnBlockBreak(HarvestDropsEvent event) {
		if(event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().getItem() != null) {
			if(event.harvester.getHeldItem().getItem() instanceof ItemTool && ((ItemTool) event.harvester.getHeldItem().getItem()).func_150913_i() == ModTools.FYRESTONE && !event.isSilkTouching) {
				if(FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block.getItemDropped(event.blockMetadata, event.world.rand, event.fortuneLevel))) != null) {
					event.drops.clear();
					event.world.playSoundAtEntity(event.harvester, "random.fizz", 0.7f, 1.6f);
					event.drops.add(new ItemStack(FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block.getItemDropped(event.blockMetadata, event.world.rand, event.fortuneLevel))).getItem(), 1, FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block.getItemDropped(event.blockMetadata, event.world.rand, event.fortuneLevel))).getItemDamage()));
				} else if(event.block.isFlammable(event.world, event.x, event.y, event.z, ForgeDirection.WEST)) {
					event.drops.clear();
					event.world.playSoundAtEntity(event.harvester, "random.fizz", 0.7f, 1.6f);
				}
			} else if(event.harvester.getHeldItem().getItem() instanceof ItemTool && ((ItemTool) event.harvester.getHeldItem().getItem()).func_150913_i() == ModTools.VOIDIUM) {
				event.drops.clear();
				event.world.playSoundAtEntity(event.harvester, "mob.endermen.portal", 1.0f, 1.6f);
			}
		}
	}
}
