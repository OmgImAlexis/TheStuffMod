package com.shnupbups.allthethings.item.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import cofh.api.energy.EnergyStorage;
import com.shnupbups.allthethings.block.BlockBattery;
import com.shnupbups.allthethings.utility.MiscUtility;

public class ItemRenderBattery implements IItemRenderer {
	@Override
	public boolean handleRenderType(ItemStack item,ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type,ItemStack item,ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type,ItemStack item,Object... data) {
		GL11.glPushMatrix();
		if(type==ItemRenderType.ENTITY) GL11.glTranslated(-0.5,-0.5,-0.5);
		else if(type==ItemRenderType.INVENTORY) GL11.glTranslated(0,-0.1,0);
		BlockBattery block=(BlockBattery)((ItemBlock)item.getItem()).field_150939_a;
		IIcon[] icons;
		if(item.hasTagCompound()&&item.getTagCompound().hasKey("tiledata")) {
			EnergyStorage rf=new EnergyStorage(block.maxStorage);
			rf.readFromNBT(item.getTagCompound().getCompoundTag("tiledata"));
			icons=new IIcon[6];
			icons[0]=block.getIcon(0,rf.getEnergyStored(),MiscUtility.intToBoolean(item.getTagCompound().getCompoundTag("tiledata").getIntArray("outputSides"))[0]);
			icons[1]=block.getIcon(1,rf.getEnergyStored(),MiscUtility.intToBoolean(item.getTagCompound().getCompoundTag("tiledata").getIntArray("outputSides"))[1]);
			icons[2]=block.getIcon(2,rf.getEnergyStored(),MiscUtility.intToBoolean(item.getTagCompound().getCompoundTag("tiledata").getIntArray("outputSides"))[2]);
			icons[3]=block.getIcon(3,rf.getEnergyStored(),MiscUtility.intToBoolean(item.getTagCompound().getCompoundTag("tiledata").getIntArray("outputSides"))[3]);
			icons[4]=block.getIcon(4,rf.getEnergyStored(),MiscUtility.intToBoolean(item.getTagCompound().getCompoundTag("tiledata").getIntArray("outputSides"))[4]);
			icons[5]=block.getIcon(5,rf.getEnergyStored(),MiscUtility.intToBoolean(item.getTagCompound().getCompoundTag("tiledata").getIntArray("outputSides"))[5]);
		} else {
			icons=new IIcon[]{block.getIcon(0,0),block.getIcon(1,0),block.getIcon(2,0),block.getIcon(3,0),block.getIcon(4,0),block.getIcon(5,0)};
		}
		Tessellator tess=Tessellator.instance;
		if(icons!=null) {
			Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_CULL_FACE);
			GL11.glEnable(GL11.GL_BLEND);
			OpenGlHelper.glBlendFunc(770,771,1,0);
			float[] minU=new float[]{icons[0].getMinU(),icons[1].getMinU(),icons[2].getMinU(),icons[3].getMinU(),icons[4].getMinU(),icons[5].getMinU()};
			float[] maxU=new float[]{icons[0].getMaxU(),icons[1].getMaxU(),icons[2].getMaxU(),icons[3].getMaxU(),icons[4].getMaxU(),icons[5].getMaxU()};
			float[] minV=new float[]{icons[0].getMinV(),icons[1].getMinV(),icons[2].getMinV(),icons[3].getMinV(),icons[4].getMinV(),icons[5].getMinV()};
			float[] maxV=new float[]{icons[0].getMaxV(),icons[1].getMaxV(),icons[2].getMaxV(),icons[3].getMaxV(),icons[4].getMaxV(),icons[5].getMaxV()};
			tess.startDrawingQuads();
			tess.addVertexWithUV(1,0,0,minU[2],maxV[2]);
			tess.addVertexWithUV(0,0,0,maxU[2],maxV[2]);
			tess.addVertexWithUV(0,1,0,maxU[2],minV[2]);
			tess.addVertexWithUV(1,1,0,minU[2],minV[2]);
			tess.addVertexWithUV(1,0,1,maxU[3],maxV[3]);
			tess.addVertexWithUV(1,1,1,maxU[3],minV[3]);
			tess.addVertexWithUV(0,1,1,minU[3],minV[3]);
			tess.addVertexWithUV(0,0,1,minU[3],maxV[3]);
			tess.addVertexWithUV(1,0,0,maxU[4],maxV[4]);
			tess.addVertexWithUV(1,1,0,maxU[4],minV[4]);
			tess.addVertexWithUV(1,1,1,minU[4],minV[4]);
			tess.addVertexWithUV(1,0,1,minU[4],maxV[4]);
			tess.addVertexWithUV(0,0,1,maxU[5],maxV[5]);
			tess.addVertexWithUV(0,1,1,maxU[5],minV[5]);
			tess.addVertexWithUV(0,1,0,minU[5],minV[5]);
			tess.addVertexWithUV(0,0,0,minU[5],maxV[5]);
			tess.addVertexWithUV(0,1,1,minU[1],minV[1]);
			tess.addVertexWithUV(1,1,1,minU[1],maxV[1]);
			tess.addVertexWithUV(1,1,0,maxU[1],maxV[1]);
			tess.addVertexWithUV(0,1,0,maxU[1],minV[1]);
			tess.addVertexWithUV(1,0,0,minU[0],maxV[0]);
			tess.addVertexWithUV(1,0,1,maxU[0],maxV[0]);
			tess.addVertexWithUV(0,0,1,maxU[0],minV[0]);
			tess.addVertexWithUV(0,0,0,minU[0],minV[0]);
			tess.draw();
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glDisable(GL11.GL_CULL_FACE);
		}
		GL11.glPopMatrix();
	}
}
