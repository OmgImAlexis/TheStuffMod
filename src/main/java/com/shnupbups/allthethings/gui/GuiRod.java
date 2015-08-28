package com.shnupbups.allthethings.gui;

import java.util.List;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.shnupbups.allthethings.inventory.ContainerRod;
import com.shnupbups.allthethings.inventory.InventoryRod;
import com.shnupbups.allthethings.lib.Reference;

public class GuiRod extends GuiContainer {
	private static final ResourceLocation guiTexture=new ResourceLocation(Reference.MOD_ID+":textures/gui/rod.png");
	public InventoryRod inventory;

	public GuiRod(ContainerRod containerRod) {
		super(containerRod);
		this.inventory=containerRod.inventory;
	}

	public void drawScreen(int par1,int par2,float par3) {
		super.drawScreen(par1,par2,par3);
	}

	public void drawGuiContainerForegroundLayer(int par1,int par2) {
		String s=this.inventory.getInventoryName();
		List list=this.fontRendererObj.listFormattedStringToWidth(s,this.xSize-19);
		for(int i=0;i<list.size();i++) {
			this.fontRendererObj.drawString((String)list.get(i),((this.xSize-19)/2-this.fontRendererObj.getStringWidth((String)list.get(i))/2),6+(i*10),4210752);
		}
		this.fontRendererObj.drawString("Inventory",8,this.ySize-96+3,4210752);
	}

	public void drawGuiContainerBackgroundLayer(float par1,int par2,int par3) {
		GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
		this.mc.getTextureManager().bindTexture(guiTexture);
		int k=(this.width-this.xSize)/2;
		int l=(this.height-this.ySize)/2;
		this.drawTexturedModalRect(k,l,0,0,this.xSize,this.ySize);
	}
}
