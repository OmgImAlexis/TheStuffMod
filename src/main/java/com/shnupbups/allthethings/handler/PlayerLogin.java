package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class PlayerLogin {
	static List msgs = new ArrayList();
	
	//private static ItemStack book = new ItemStack(Items.written_book);
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
		if(ConfigurationHandler.displayAmount) {
			event.player.addChatMessage(new ChatComponentText("[AllTheThings] "+Reference.BLOCKS_ADDED+" blocks added"));
			event.player.addChatMessage(new ChatComponentText("[AllTheThings] "+Reference.ITEMS_ADDED+" items added"));
		}
		for (int i = 0; i < msgs.size(); i++) {
			event.player.addChatMessage(new ChatComponentText((String) msgs.get(i)));
		}

		/**
		book.setTagInfo("author", new NBTTagString("Shnupbups100"));
		book.setTagInfo("title", new NBTTagString(StatCollector.translateToLocal("book.allthethings:guidebook.title")));
		NBTTagList pages = new NBTTagList();
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.allthethings:guidebook.page1")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.allthethings:guidebook.page2")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.allthethings:guidebook.page3")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.allthethings:guidebook.page4")));
        book.setTagInfo("pages", pages);
		event.player.inventory.addItemStackToInventory(book);**/
	}
	
	public static void addChatMessage(String text) {
		msgs.add(text);
	}
}
