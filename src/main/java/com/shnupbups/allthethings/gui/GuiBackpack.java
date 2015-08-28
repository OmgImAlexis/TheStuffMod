package com.shnupbups.allthethings.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.shnupbups.allthethings.inventory.ContainerBackpack;
import com.shnupbups.allthethings.inventory.InventoryBackpack;
import com.shnupbups.allthethings.lib.Reference;

public class GuiBackpack extends GuiContainer {
	private static final ResourceLocation guiTexture=new ResourceLocation(Reference.MOD_ID+":textures/gui/backpack.png");
	public InventoryBackpack inventory;

	public GuiBackpack(ContainerBackpack container) {
		super(container);
		this.inventory=container.inventory;
	}

	public void drawScreen(int par1,int par2,float par3) {
		super.drawScreen(par1,par2,par3);
	}

	public void drawGuiContainerForegroundLayer(int par1,int par2) {
		String s=this.inventory.getInventoryName();
		this.fontRendererObj.drawString(s,this.xSize/2-this.fontRendererObj.getStringWidth(s)/2,6,4210752);
		this.fontRendererObj.drawString("Inventory",8,this.ySize-96+3,4210752);
	}

	public void drawGuiContainerBackgroundLayer(float par1,int par2,int par3) {
		GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
		this.mc.getTextureManager().bindTexture(guiTexture);
		int k=(this.width-this.xSize)/2;
		int l=(this.height-this.ySize)/2;
		this.drawTexturedModalRect(k,l,0,0,this.xSize,this.ySize);
		for(int i=0;i<3;++i) {
			for(int j=0;j<(InventoryBackpack.size)/3;j++) {
				this.drawTexturedModalRect(k+((89-(((InventoryBackpack.size/3)*18)/2))+(18*j))-1,l+(18+(18*i))-1,176,0,18,18);
			}
		}
	}
}
