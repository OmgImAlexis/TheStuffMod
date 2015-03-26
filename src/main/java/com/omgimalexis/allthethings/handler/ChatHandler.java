package com.omgimalexis.allthethings.handler;

import com.omgimalexis.allthethings.init.ModArmour;
import com.omgimalexis.allthethings.utility.LogHelper;

import net.minecraftforge.event.ServerChatEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChatHandler {

	@SubscribeEvent
	public void OnChat(ServerChatEvent e) {
		if(ConfigurationHandler.enableOzTransport && e.player.inventory.armorItemInSlot(0).getItem() == ModArmour.bootsRuby) {
			if(e.message.toLowerCase().contains("no place like home")) {
				if(e.player.getBedLocation(e.player.dimension) != null) {
					e.player.setPositionAndUpdate(e.player.getBedLocation(e.player.dimension).posX, e.player.getBedLocation(e.player.dimension).posY+1, e.player.getBedLocation(e.player.dimension).posZ);
					LogHelper.info(e.player.getPosition(e.player.dimension));
				} else {
					e.player.setPositionAndUpdate(e.player.worldObj.getSpawnPoint().posX, e.player.worldObj.getHeightValue(e.player.worldObj.getSpawnPoint().posX, e.player.worldObj.getSpawnPoint().posZ), e.player.worldObj.getSpawnPoint().posZ);
					LogHelper.info(e.player.getPosition(e.player.dimension));
					LogHelper.info(e.player.worldObj.getSpawnPoint());
				}
			}
		}
	}
}
