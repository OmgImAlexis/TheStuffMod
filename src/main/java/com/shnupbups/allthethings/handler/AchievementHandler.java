package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.init.ModAchievements;
import com.shnupbups.allthethings.init.ModArmour;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.init.ModRings;
import com.shnupbups.allthethings.init.ModRingsBaubles;
import com.shnupbups.allthethings.utility.UtilityCheck;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class AchievementHandler {
	@SubscribeEvent
	public void OnItemPickup(ItemPickupEvent event){
		if(event.pickedUp.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.dirt))) {
			event.player.addStat(ModAchievements.dirt, 1);
		}
		if(event.pickedUp.getEntityItem().getItem().equals(Item.getItemFromBlock(ModBlocks.oreCopper))) {
			event.player.addStat(ModAchievements.mineCopper, 1);
		}
		if(event.pickedUp.getEntityItem().getItem().equals(ModItems.uranium)) {
			event.player.addStat(ModAchievements.mineUranium, 1);
		}
		if(event.pickedUp.getEntityItem().getItem().equals(ModItems.iridium)) {
			event.player.addStat(ModAchievements.mineUranium, 1);
		}
		if(event.pickedUp.getEntityItem().getItem().equals(ModItems.plutonium)) {
			event.player.addStat(ModAchievements.mineUranium, 1);
		}
		if(UtilityCheck.isItemImpureGem(event.pickedUp.getEntityItem().getItem())) {
			event.player.addStat(ModAchievements.mineGem, 1);
		}
	}
	
	@SubscribeEvent
	public void OnCraftEvent(ItemCraftedEvent event) {
		if(!Loader.isModLoaded("Baubles")) {
			if(event.crafting.getItem().equals(ModRings.fyrestoneRing)){
				event.player.addStat(ModAchievements.pyromaniac, 1);
			}
			if(event.crafting.getItem().equals(ModRings.fyrestoneSilverRing)){
				event.player.addStat(ModAchievements.pyromaniac, 1);
			}
			if(event.crafting.getItem().equals(ModRings.voidiumRing)){
				event.player.addStat(ModAchievements.steveAlmighty, 1);
			}
			if(event.crafting.getItem().equals(ModRings.voidiumSilverRing)){
				event.player.addStat(ModAchievements.steveAlmighty, 1);
			}
			if(event.crafting.getItem().equals(ModRings.ring)){
				event.player.addStat(ModAchievements.jeweller, 1);
			}
			if(event.crafting.getItem().equals(ModRings.silverRing)){
				event.player.addStat(ModAchievements.jeweller, 1);
			}
			if(event.crafting.getItem().equals(ModRings.diamondRing)){
				event.player.addStat(ModAchievements.marry, 1);
			}
			if(event.crafting.getItem().equals(ModRings.diamondSilverRing)){
				event.player.addStat(ModAchievements.marry, 1);
			}
		} else {
			if(event.crafting.getItem().equals(ModRingsBaubles.fyrestoneRing)){
				event.player.addStat(ModAchievements.pyromaniac, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.fyrestoneSilverRing)){
				event.player.addStat(ModAchievements.pyromaniac, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.voidiumRing)){
				event.player.addStat(ModAchievements.steveAlmighty, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.voidiumSilverRing)){
				event.player.addStat(ModAchievements.steveAlmighty, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.ring)){
				event.player.addStat(ModAchievements.jeweller, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.silverRing)){
				event.player.addStat(ModAchievements.jeweller, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.diamondRing)){
				event.player.addStat(ModAchievements.marry, 1);
			}
			if(event.crafting.getItem().equals(ModRingsBaubles.diamondSilverRing)){
				event.player.addStat(ModAchievements.marry, 1);
			}
		}
		if(event.crafting.getItem().equals(Item.getItemFromBlock(ModBlocks.cherryPlanks))){
			event.player.addStat(ModAchievements.pink, 1);
		}
		if(event.crafting.getItem().equals(Items.diamond_hoe)){
			event.player.addStat(ModAchievements.diamondHoe, 1);
		}
		if(event.crafting.getItem().equals(ModArmour.bootsRuby)){
			event.player.addStat(ModAchievements.noPlace, 1);
		}
	}
}
