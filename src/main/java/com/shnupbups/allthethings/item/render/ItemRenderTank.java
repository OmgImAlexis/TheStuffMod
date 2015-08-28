package com.shnupbups.allthethings.item.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import org.lwjgl.opengl.GL11;
import com.shnupbups.allthethings.block.BlockTank;
import com.shnupbups.allthethings.utility.LogHelper;

public class ItemRenderTank implements IItemRenderer {
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
		BlockTank block=(BlockTank)((ItemBlock)item.getItem()).field_150939_a;
		IIcon blockicon=block.getIcon(0,0);
		Tessellator tess=Tessellator.instance;
		if(item.hasTagCompound()&&item.getTagCompound().hasKey("tankdata")) {
			NBTTagCompound tanknbt=item.getTagCompound().getCompoundTag("tankdata");
			FluidTank tank=new FluidTank(block.maxStorage);
			tank.readFromNBT(tanknbt);
			if(tank.getFluid()!=null&&tank.getFluid().getFluid()!=null) {
				FluidStack stack=tank.getFluid();
				Fluid fluid=stack.getFluid();
				IIcon icon=fluid.getStillIcon();
				Minecraft mc=Minecraft.getMinecraft();
				if(icon!=null) {
					mc.renderEngine.bindTexture(TextureMap.locationBlocksTexture);
					GL11.glDisable(GL11.GL_BLEND);
					GL11.glDisable(GL11.GL_LIGHTING);
					GL11.glColor4f(1,1,1,1);
					int color=fluid.getColor(stack);
					float red=(color>>16&0xFF)/255.0F;
					float green=(color>>8&0xFF)/255.0F;
					float blue=(color&0xFF)/255.0F;
					float minU=icon.getMinU(),maxU=icon.getMaxU(),minV=icon.getMinV(),maxV=icon.getMaxV(),height=(float)tank.getFluidAmount()/(float)tank.getCapacity();
					tess.startDrawingQuads();
					tess.setColorOpaque_F(red,green,blue);
					tess.addVertexWithUV(0.99,0.01,0.01,maxU,minV);
					tess.addVertexWithUV(0.01,0.01,0.01,minU,minV);
					tess.addVertexWithUV(0.01,height*0.99,0.01,minU,maxV);
					tess.addVertexWithUV(0.99,height*0.99,0.01,maxU,maxV);
					tess.addVertexWithUV(0.99,0.01,0.99,minU,minV);
					tess.addVertexWithUV(0.99,height*0.99,0.99,minU,maxV);
					tess.addVertexWithUV(0.01,height*0.99,0.99,maxU,maxV);
					tess.addVertexWithUV(0.01,0.01,0.99,maxU,minV);
					tess.addVertexWithUV(0.99,0.01,0.01,minU,minV);
					tess.addVertexWithUV(0.99,height*0.99,0.01,minU,maxV);
					tess.addVertexWithUV(0.99,height*0.99,0.99,maxU,maxV);
					tess.addVertexWithUV(0.99,0.01,0.99,maxU,minV);
					tess.addVertexWithUV(0.01,0.01,0.99,minU,minV);
					tess.addVertexWithUV(0.01,height*0.99,0.99,minU,maxV);
					tess.addVertexWithUV(0.01,height*0.99,0.01,maxU,maxV);
					tess.addVertexWithUV(0.01,0.01,0.01,maxU,minV);
					tess.addVertexWithUV(0.01,height*0.99,0.99,maxU,maxV);
					tess.addVertexWithUV(0.99,height*0.99,0.99,maxU,minV);
					tess.addVertexWithUV(0.99,height*0.99,0.01,minU,minV);
					tess.addVertexWithUV(0.01,height*0.99,0.01,minU,maxV);
					tess.addVertexWithUV(0.99,0.01,0.01,maxU,minV);
					tess.addVertexWithUV(0.99,0.01,0.99,minU,minV);
					tess.addVertexWithUV(0.01,0.01,0.99,minU,maxV);
					tess.addVertexWithUV(0.01,0.01,0.01,maxU,maxV);
					tess.draw();
					GL11.glEnable(GL11.GL_BLEND);
					GL11.glEnable(GL11.GL_LIGHTING);
				} else {
					LogHelper.error("Error rendering fluid in tank: "+fluid.getLocalizedName(stack)+" . Could not get Still IIcon! Please report this to the developer of whichever mod adds this fluid.");
				}
			}
		}
		if(blockicon!=null) {
			Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_CULL_FACE);
			GL11.glEnable(GL11.GL_BLEND);
			OpenGlHelper.glBlendFunc(770,771,1,0);
			float minU=blockicon.getMinU(),maxU=blockicon.getMaxU(),minV=blockicon.getMinV(),maxV=blockicon.getMaxV();
			tess.startDrawingQuads();
			tess.addVertexWithUV(1,0,0,maxU,minV);
			tess.addVertexWithUV(0,0,0,minU,minV);
			tess.addVertexWithUV(0,1,0,minU,maxV);
			tess.addVertexWithUV(1,1,0,maxU,maxV);
			tess.addVertexWithUV(1,0,1,minU,minV);
			tess.addVertexWithUV(1,1,1,minU,maxV);
			tess.addVertexWithUV(0,1,1,maxU,maxV);
			tess.addVertexWithUV(0,0,1,maxU,minV);
			tess.addVertexWithUV(1,0,0,minU,minV);
			tess.addVertexWithUV(1,1,0,minU,maxV);
			tess.addVertexWithUV(1,1,1,maxU,maxV);
			tess.addVertexWithUV(1,0,1,maxU,minV);
			tess.addVertexWithUV(0,0,1,minU,minV);
			tess.addVertexWithUV(0,1,1,minU,maxV);
			tess.addVertexWithUV(0,1,0,maxU,maxV);
			tess.addVertexWithUV(0,0,0,maxU,minV);
			tess.addVertexWithUV(0,1,1,maxU,maxV);
			tess.addVertexWithUV(1,1,1,maxU,minV);
			tess.addVertexWithUV(1,1,0,minU,minV);
			tess.addVertexWithUV(0,1,0,minU,maxV);
			tess.addVertexWithUV(1,0,0,maxU,minV);
			tess.addVertexWithUV(1,0,1,minU,minV);
			tess.addVertexWithUV(0,0,1,minU,maxV);
			tess.addVertexWithUV(0,0,0,maxU,maxV);
			tess.draw();
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glDisable(GL11.GL_CULL_FACE);
		}
		GL11.glPopMatrix();
	}
}
