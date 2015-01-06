package com.omgimalexis.allthethings.handler;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ChatComponentText;

import com.omgimalexis.allthethings.lib.Reference;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class PlayerLogin {
	static List msgs = new ArrayList();
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
		if(ConfigurationHandler.displayAmount) {
			event.player.addChatMessage(new ChatComponentText("[AllTheThings] "+Reference.BLOCKS_ADDED+" blocks added"));
			event.player.addChatMessage(new ChatComponentText("[AllTheThings] "+Reference.ITEMS_ADDED+" items added"));
		}
		for (int i = 0; i < msgs.size(); i++) {
			event.player.addChatMessage(new ChatComponentText((String) msgs.get(i)));
		}
	}
	
	public static void addChatMessage(String text) {
		msgs.add(text);
	}
}
