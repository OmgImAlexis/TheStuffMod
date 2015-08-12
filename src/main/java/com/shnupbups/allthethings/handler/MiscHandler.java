package com.shnupbups.allthethings.handler;

import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import cpw.mods.fml.client.GuiIngameModOptions;
import cpw.mods.fml.client.GuiModList;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MiscHandler {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEvent(GuiOpenEvent event){
	    if (event.gui instanceof GuiIngameModOptions){
	        event.gui = new GuiModList(new GuiIngameMenu());        
	    }
	}
	
}
