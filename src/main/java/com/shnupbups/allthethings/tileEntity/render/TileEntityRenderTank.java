package com.shnupbups.allthethings.tileEntity.render;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.tileEntity.TileEntityTank;
import com.shnupbups.allthethings.utility.LogHelper;

public class TileEntityRenderTank extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity tilep, double x, double y, double z, float ticks) {
		if(tilep instanceof TileEntityTank) {
			TileEntityTank tile = (TileEntityTank) tilep;
			if(tile.tank != null && tile.tank.getFluid() != null && tile.tank.getFluid().getFluid() != null) {
				FluidTank tank = tile.tank;
				FluidStack stack = tank.getFluid();
				Fluid fluid = stack.getFluid();
				IIcon icon = fluid.getStillIcon();
				World world = tile.getWorldObj();
				Minecraft mc = Minecraft.getMinecraft();
				Tessellator tess = Tessellator.instance;
				if(icon != null) {
					this.bindTexture(TextureMap.locationBlocksTexture);
					GL11.glPushMatrix();
					if(world != null) {
						GL11.glTranslated(x, y, z);
					}
					GL11.glDisable(GL11.GL_BLEND);
					GL11.glDisable(GL11.GL_LIGHTING);
					GL11.glColor4f(1, 1, 1, 1);
					int color = fluid.getColor(stack);
					float red = (color >> 16 & 0xFF) / 255.0F;
					float green = (color >> 8 & 0xFF) / 255.0F;
					float blue = (color & 0xFF) / 255.0F;
					float minU = icon.getMinU(), maxU = icon.getMaxU(), minV = icon.getMinV(), maxV = icon.getMaxV(), height = (float)tank.getFluidAmount()/(float)tank.getCapacity();
					tess.startDrawingQuads();
					tess.setColorOpaque_F(red, green, blue);
					
					tess.addVertexWithUV(0.99, 0.01, 0.01, maxU, minV);
					tess.addVertexWithUV(0.01, 0.01, 0.01, minU, minV);
					tess.addVertexWithUV(0.01, height*0.99, 0.01, minU, maxV);
					tess.addVertexWithUV(0.99, height*0.99, 0.01, maxU, maxV);

					tess.addVertexWithUV(0.99, 0.01, 0.99, minU, minV);
					tess.addVertexWithUV(0.99, height*0.99, 0.99, minU, maxV);
					tess.addVertexWithUV(0.01, height*0.99, 0.99, maxU, maxV);
					tess.addVertexWithUV(0.01, 0.01, 0.99, maxU, minV);

					tess.addVertexWithUV(0.99, 0.01, 0.01, minU, minV);
					tess.addVertexWithUV(0.99, height*0.99, 0.01, minU, maxV);
					tess.addVertexWithUV(0.99, height*0.99, 0.99, maxU, maxV);
					tess.addVertexWithUV(0.99, 0.01, 0.99, maxU, minV);

					tess.addVertexWithUV(0.01, 0.01, 0.99, minU, minV);
					tess.addVertexWithUV(0.01, height*0.99, 0.99, minU, maxV);
					tess.addVertexWithUV(0.01, height*0.99, 0.01, maxU, maxV);
					tess.addVertexWithUV(0.01, 0.01, 0.01, maxU, minV);
					
					tess.addVertexWithUV(0.01, height*0.99, 0.99, maxU, maxV);
					tess.addVertexWithUV(0.99, height*0.99, 0.99, maxU, minV);
					tess.addVertexWithUV(0.99, height*0.99, 0.01, minU, minV);
					tess.addVertexWithUV(0.01, height*0.99, 0.01, minU, maxV);
					
					tess.addVertexWithUV(0.99, 0.01, 0.01, maxU, minV);
					tess.addVertexWithUV(0.99, 0.01, 0.99, minU, minV);
					tess.addVertexWithUV(0.01, 0.01, 0.99, minU, maxV);
					tess.addVertexWithUV(0.01, 0.01, 0.01, maxU, maxV);
					
					tess.draw();
					GL11.glEnable(GL11.GL_LIGHTING);
					GL11.glPopMatrix();
				} else {
					LogHelper.error("Error rendering fluid in tank: "+fluid.getLocalizedName(stack)+" . Could not get Still IIcon! Please report this to the developer of whichever mod adds this fluid.");
				}
			}
		} else throw new IllegalArgumentException();
	}

}
