package omgimalexis.allthethings.handler;

import omgimalexis.allthethings.init.ModAchievements;
import omgimalexis.allthethings.init.ModArmour;
import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.init.ModItems;
import omgimalexis.allthethings.utility.UtilityCheck;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
		if(event.crafting.getItem().equals(ModItems.fyrestoneRing)){
			event.player.addStat(ModAchievements.pyromaniac, 1);
		}
		if(event.crafting.getItem().equals(ModItems.fyrestoneSilverRing)){
			event.player.addStat(ModAchievements.pyromaniac, 1);
		}
		if(event.crafting.getItem().equals(ModItems.voidiumRing)){
			event.player.addStat(ModAchievements.steveAlmighty, 1);
		}
		if(event.crafting.getItem().equals(ModItems.voidiumSilverRing)){
			event.player.addStat(ModAchievements.steveAlmighty, 1);
		}
		if(event.crafting.getItem().equals(ModItems.ring)){
			event.player.addStat(ModAchievements.jeweller, 1);
		}
		if(event.crafting.getItem().equals(ModItems.silverRing)){
			event.player.addStat(ModAchievements.jeweller, 1);
		}
		if(event.crafting.getItem().equals(ModItems.diamondRing)){
			event.player.addStat(ModAchievements.marry, 1);
		}
		if(event.crafting.getItem().equals(ModItems.diamondSilverRing)){
			event.player.addStat(ModAchievements.marry, 1);
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
