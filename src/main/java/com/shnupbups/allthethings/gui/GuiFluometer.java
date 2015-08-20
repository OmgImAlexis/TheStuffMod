package com.shnupbups.allthethings.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.util.ForgeDirection;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.magic.FluoProperties;
import com.shnupbups.allthethings.magic.ItemMagic;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GuiFluometer extends Gui {
	
	private static final ResourceLocation texturepath = new ResourceLocation(Reference.MOD_ID + ":textures/misc/fluometer.png");

	public GuiFluometer() {
		super();
	}
	
	@SubscribeEvent
	public void render(RenderGameOverlayEvent event) {
		if(Minecraft.getMinecraft().thePlayer.getHeldItem() != null && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() != null && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() instanceof ItemMagic && ((ItemMagic) Minecraft.getMinecraft().thePlayer.getHeldItem().getItem()).renderFluoInHUD()) {
			if (event.isCancelable() || event.type != ElementType.EXPERIENCE) {
				return;
			}
			FluoProperties props = FluoProperties.get(Minecraft.getMinecraft().thePlayer);

			if (props == null || props.getMaxFluoLevel() == 0) {
				return;
			}
			
			GL11.glPushMatrix();
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glScalef(0.25f, 0.25f, 0.25f);
			Minecraft.getMinecraft().getTextureManager().bindTexture(texturepath);
			this.drawTexturedModalRect(8, (event.resolution.getScaledHeight()*4)-256, 6, 6, 80, 250);
			this.drawTexturedModalRect(8, (event.resolution.getScaledHeight()*4)-256, 689, 6, 80, 250);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			if(props.getFluoLevel()>0) this.drawTexturedModalRect(8, ((event.resolution.getScaledHeight()*4)-256)+(230 - (props.getFluoLevel()*230)/props.getMaxFluoLevel()), 94, 6+(props.getFluoLevel())/props.getMaxFluoLevel(), 80, (props.getFluoLevel()*230)/props.getMaxFluoLevel());
			this.drawTexturedModalRect(8, (event.resolution.getScaledHeight()*4)-256, 689, 6, 80, 250);
			this.drawTexturedModalRect(8, (event.resolution.getScaledHeight()*4)-256, 6, 6, 80, 250);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(true);
			GL11.glPopMatrix();
			
			//LogHelper.info(props.getFluoLevel());
		}
	}
}
