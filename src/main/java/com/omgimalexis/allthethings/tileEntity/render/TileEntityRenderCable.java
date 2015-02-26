package com.omgimalexis.allthethings.tileEntity.render;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;

import org.lwjgl.opengl.GL11;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.tileEntity.TileEntityCable;
import com.omgimalexis.allthethings.tileEntity.TileEntityPipe;

public class TileEntityRenderCable extends TileEntitySpecialRenderer {
	ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/models/cables/cable.png");
	boolean drawInside = true;
	
	float pixel = 1F / 16F;
	float texturePixel = 1F / 32F;

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double translationX, double translationY, double translationZ, float par5) {
		GL11.glTranslated(translationX, translationY, translationZ);
		GL11.glDisable(GL11.GL_LIGHTING);
		this.bindTexture(texture);
		{
			TileEntityCable cable = (TileEntityCable) tileEntity;
			if(!cable.onlyOneOpposite(cable.connections)){
				drawCore(tileEntity);
				for (int i = 0; i < cable.connections.length; i++){
					if (cable.connections[i] != null) {
						drawConnector(cable.connections[i]);
					}
				}
			} else {
				for (int i = 0; i < cable.connections.length; i++){
					if (cable.connections[i] != null) {
						drawStraight(cable.connections[i]);
						break;
					}
				}
			}
		}
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glTranslated(-translationX, -translationY, -translationZ);
	}
	
	public void drawStraight(ForgeDirection direction) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		{
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);
			if (direction.equals(ForgeDirection.NORTH) || direction.equals(ForgeDirection.SOUTH)) {
				GL11.glRotatef(90, 1, 0, 0);
			} else if (direction.equals(ForgeDirection.EAST) || direction.equals(ForgeDirection.WEST)) {
				GL11.glRotatef(90, 0, 0, 1);
			}
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			
			tessellator.addVertexWithUV(1-13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 0*texturePixel);
			
			tessellator.addVertexWithUV(1-13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 0*texturePixel);
			
			if (drawInside) {
				tessellator.addVertexWithUV(13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(13*pixel/2, 0, 13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 26*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 26*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 0, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
			}
		}
		tessellator.draw();
		
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		if (direction.equals(ForgeDirection.NORTH) || direction.equals(ForgeDirection.SOUTH)) {
			GL11.glRotatef(-90, 1, 0, 0);
		} else if (direction.equals(ForgeDirection.EAST) || direction.equals(ForgeDirection.WEST)) {
			GL11.glRotatef(-90, 0, 0, 1);
		}
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
	}
	
	public void drawConnector(ForgeDirection direction) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		{
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);
			if (direction.equals(ForgeDirection.UP)) {
				// ROTATE
			} else if (direction.equals(ForgeDirection.DOWN)) {
				GL11.glRotatef(180, 1, 0, 0);
			} else if (direction.equals(ForgeDirection.SOUTH)) {
				GL11.glRotatef(90, 1, 0, 0);
			} else if (direction.equals(ForgeDirection.NORTH)) {
				GL11.glRotatef(270, 1, 0, 0);
			} else if (direction.equals(ForgeDirection.WEST)) {
				GL11.glRotatef(90, 0, 0, 1);
			} else if (direction.equals(ForgeDirection.EAST)) {
				GL11.glRotatef(270, 0, 0, 1);
			}
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
			
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
			
			if (drawInside) {
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 13*pixel/2, 6*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1, 1-13*pixel/2, 6*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			}
		}
		tessellator.draw();
		
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		if (direction.equals(ForgeDirection.UP)) {
			// ROTATE
		} else if (direction.equals(ForgeDirection.DOWN)) {
			GL11.glRotatef(-180, 1, 0, 0);
		} else if (direction.equals(ForgeDirection.SOUTH)) {
			GL11.glRotatef(-90, 1, 0, 0);
		} else if (direction.equals(ForgeDirection.NORTH)) {
			GL11.glRotatef(-270, 1, 0, 0);
		} else if (direction.equals(ForgeDirection.WEST)) {
			GL11.glRotatef(-90, 0, 0, 1);
		} else if (direction.equals(ForgeDirection.EAST)) {
			GL11.glRotatef(-270, 0, 0, 1);
		}
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
	}

	public void drawCore(TileEntity tileEntity) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		{
			tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
			
			tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 13*pixel/2, 0*texturePixel, 3*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 13*pixel/2, 0*texturePixel, 3*texturePixel);
			
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
			
			tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
			
			if (drawInside) {
				tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 0*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 0*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 13*pixel/2, 0*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 13*pixel/2, 0*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 1-13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 1-13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
				
				tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 1-13*pixel/2, 0*texturePixel, 3*texturePixel);
				tessellator.addVertexWithUV(1-13*pixel/2, 13*pixel/2, 13*pixel/2, 0*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 13*pixel/2, 3*texturePixel, 0*texturePixel);
				tessellator.addVertexWithUV(13*pixel/2, 13*pixel/2, 1-13*pixel/2, 3*texturePixel, 3*texturePixel);
			}
		}
		tessellator.draw();
	}
}
