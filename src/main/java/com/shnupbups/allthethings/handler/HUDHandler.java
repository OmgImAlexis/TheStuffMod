package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import org.lwjgl.opengl.GL11;

public class HUDHandler extends Gui {

	private Minecraft mc;

	public HUDHandler(Minecraft mc) {
		super();
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void hideHealth(RenderGameOverlayEvent event) {

		if(mc.thePlayer.getActivePotionEffect(ModPotions.lessening) != null && event.type.equals(ElementType.HEALTH) && event.isCancelable()) {
		
		event.setCanceled(true);

		mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "/textures/gui/icons.png"));
		GL11.glPushMatrix();
		for (int i = 0; i < Math.round(mc.thePlayer.getMaxHealth()/2); i++) {
			drawTexturedModalRect((int) (mc.displayWidth/6.5+(i*9)), mc.displayHeight/2-38, 0, 0, 9, 9);
		}
		for (int i = 0; i < Math.round(mc.thePlayer.getHealth()/2); i++) {
			drawTexturedModalRect((int) (mc.displayWidth/6.5+(i*9)), mc.displayHeight/2-38, 9, 0, 9, 9);
		}
		GL11.glPopMatrix();
		mc.getTextureManager().bindTexture(new ResourceLocation("minecraft:textures/gui/icons.png"));
		}

	}

	public void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6) {
		float f = 0.00390625F;
		float f1 = 0.00390625F;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV((double) (par1 + 0), (double) (par2 + par6), 1, (double) ((float) (par3 + 0) * f), (double) ((float) (par4 + par6) * f1));
		tessellator.addVertexWithUV((double) (par1 + par5), (double) (par2 + par6), 1, (double) ((float) (par3 + par5) * f), (double) ((float) (par4 + par6) * f1));
		tessellator.addVertexWithUV((double) (par1 + par5), (double) (par2 + 0), 1, (double) ((float) (par3 + par5) * f), (double) ((float) (par4 + 0) * f1));
		tessellator.addVertexWithUV((double) (par1 + 0), (double) (par2 + 0), 1, (double) ((float) (par3 + 0) * f), (double) ((float) (par4 + 0) * f1));
		tessellator.draw();
	}
}
