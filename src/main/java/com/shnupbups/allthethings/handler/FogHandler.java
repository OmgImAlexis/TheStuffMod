package com.shnupbups.allthethings.handler;

import java.awt.Color;

import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.block.BlockBasicFluid;
import com.shnupbups.allthethings.init.ModPotions;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FogHandler {
	@SubscribeEvent
	public void onFogCheck(FogColors fogEvent) {
		if(fogEvent.entity.getActivePotionEffect(ModPotions.bleeding) != null) {
			fogEvent.red=9001f;
			fogEvent.blue=0f;
			fogEvent.green=0f;
		}/** else if(fogEvent.block instanceof BlockBasicFluid) {
			fogEvent.blue = Color.decode(String.valueOf(((BlockBasicFluid) fogEvent.block).getRenderColor(0))).getBlue();
			fogEvent.green = Color.decode(String.valueOf(((BlockBasicFluid) fogEvent.block).getRenderColor(0))).getGreen();
			fogEvent.red = Color.decode(String.valueOf(((BlockBasicFluid) fogEvent.block).getRenderColor(0))).getRed();
		}**/
	}
	
	@SubscribeEvent
	public void onFogDensity(FogDensity fogEvent) {
		if(fogEvent.entity.getActivePotionEffect(ModPotions.bleeding) != null) {
			fogEvent.density=0.4f;
			GL11.glFogi(GL11.GL_FOG_MODE, GL11.GL_EXP);
			//fogEvent.setCanceled(true);
		}/** else if(fogEvent.block instanceof BlockBasicFluid) {
			fogEvent.density=2f;
			GL11.glFogi(GL11.GL_FOG_MODE, GL11.GL_EXP);
		}**/
	}
}
