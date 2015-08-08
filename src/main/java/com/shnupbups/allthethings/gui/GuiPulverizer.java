package com.shnupbups.allthethings.gui;

import java.util.Arrays;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.inventory.ContainerPulverizer;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiPulverizer extends GuiContainer{
	
	private static final ResourceLocation furnaceGuiTextures = new ResourceLocation(Reference.MOD_ID + ":textures/gui/compressor.png");
	private TileEntityPulverizer tileentity;

	public GuiPulverizer(InventoryPlayer invPlayer, TileEntityPulverizer tile) {
		super(new ContainerPulverizer(invPlayer.player, tile.getWorldObj(), tile.xCoord, tile.yCoord, tile.zCoord));
		this.tileentity = tile;
		
	}
	
	protected void drawGuiContainerForegroundLayer(int x, int y){
		String string = this.tileentity.hasCustomInventoryName() ? this.tileentity.getInventoryName() : I18n.format(this.tileentity.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(string, this.xSize / 2 - (this.fontRendererObj.getStringWidth(string)/2), 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), this.xSize / 2 - (this.fontRendererObj.getStringWidth(I18n.format("container.inventory", new Object[0]))/2), this.ySize - 94, 4210752);
		
		drawEnergyLevel(x, y);
	}

	/**@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	        int i1;

	        if (this.tileentity.isBurning())
	        {
	            i1 = this.tileentity.getBurnTimeRemainingScaled(12);
	            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
	        }

	        i1 = this.tileentity.getCookProgressScaled(24);
	        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
	}*/
	
	private void drawEnergyLevel(int x, int y) {
		int minX = guiLeft + 7;
		int maxX = guiLeft + 7 + 13;
		int minY = guiTop + 10;
		int maxY = guiTop + 10 + 64;
		if(x >= minX && x <= maxX && y >= minY && y <= maxY) {
			this.drawHoveringText(Arrays.asList(tileentity.getEnergyStored(ForgeDirection.UNKNOWN) + " / " + tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN) + " RF"), x - guiLeft - 6, y - guiTop, fontRendererObj);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int x, int y) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	     this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
	     int k = (this.width - this.xSize) / 2;
	     int l = (this.height - this.ySize) / 2;
	     this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	     this.drawTexturedModalRect(guiLeft + 8, guiTop + 11 + (62 - (tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*62)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)), 189, 0, 11, (tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*62)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN));
	     this.drawTexturedModalRect(guiLeft + 7, guiTop + 10, 176, 0, 13, 64);
	     
	     if(tileentity.canOperate()) {
	    	 this.drawTexturedModalRect(guiLeft + 72, guiTop + 39, 176, 64, (int) (tileentity.operateStatus * 24 / tileentity.getTimeNeeded()), 17);
	     }
	}

}
