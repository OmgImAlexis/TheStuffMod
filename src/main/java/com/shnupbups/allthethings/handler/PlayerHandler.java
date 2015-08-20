package com.shnupbups.allthethings.handler;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.magic.FluoProperties;
import com.shnupbups.allthethings.main.CommonProxy;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleChannelHandlerWrapper;

public class PlayerHandler {
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
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event) {
		if(event.entity instanceof EntityPlayer && FluoProperties.get((EntityPlayer) event.entity) == null) {
			FluoProperties.register((EntityPlayer) event.entity);
		}
	}

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {
			NBTTagCompound playerData = new NBTTagCompound();
			((FluoProperties)(event.entity.getExtendedProperties(FluoProperties.propertyName))).saveNBTData(playerData);
			CommonProxy.storeEntityData(((EntityPlayer) event.entity).getUniqueID() + FluoProperties.propertyName, playerData);
		}
	}

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event) {
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {
			NBTTagCompound playerData = CommonProxy.getEntityData(((EntityPlayer) event.entity).getUniqueID() + FluoProperties.propertyName);

			if(playerData != null) {
				((FluoProperties)(event.entity.getExtendedProperties(FluoProperties.propertyName))).loadNBTData(playerData);
			}
			//Nutricraft.packetPipeline.sendTo(new NCSyncPlayerPropPacket((EntityPlayer) event.entity), (EntityPlayerMP) event.entity);
		}
	}
}
