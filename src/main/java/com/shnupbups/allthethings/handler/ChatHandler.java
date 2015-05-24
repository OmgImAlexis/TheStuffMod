package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.init.ModArmour;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.ServerChatEvent;

public class ChatHandler {

	@SubscribeEvent
	public void OnChat(ServerChatEvent e) {
		if(!e.player.worldObj.isRemote) {
			if(ConfigurationHandler.enableOzTransport) {
				if(e.player.inventory.armorItemInSlot(0) != null && e.player.inventory.armorItemInSlot(0).getItem() != null && e.player.inventory.armorItemInSlot(0).getItem() == ModArmour.bootsRuby) {
					if(e.message.toLowerCase().contains("no place like home") && !e.player.isPlayerSleeping()) {
						if(e.player.getBedLocation(e.player.dimension) != null) {
							e.player.setPositionAndUpdate(e.player.getBedLocation(e.player.dimension).posX, e.player.getBedLocation(e.player.dimension).posY+1, e.player.getBedLocation(e.player.dimension).posZ);
							e.player.worldObj.playSoundAtEntity(e.player, "minecraft:portal.travel", 1.0F, 1.0F);
							e.player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 120, 2, true));
						} else {
							e.player.setPositionAndUpdate(e.player.worldObj.getSpawnPoint().posX, e.player.worldObj.getHeightValue(e.player.worldObj.getSpawnPoint().posX, e.player.worldObj.getSpawnPoint().posZ), e.player.worldObj.getSpawnPoint().posZ);
							e.player.worldObj.playSoundAtEntity(e.player, "minecraft:portal.travel", 1.0F, 1.0F);
							e.player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 120, 2, true));
						}
					}
				}
			}
		}
	}
}
