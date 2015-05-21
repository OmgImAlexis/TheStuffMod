package com.shnupbups.allthethings.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;

import org.lwjgl.opengl.GL11;

public class RenderAgricultureEnchant {
	
	public static void renderBlockGlow(RenderGlobal context, EntityPlayer entityPlayer, int x, int y, int z, float lineWidth, float partialTicks)
    {
        Block block = entityPlayer.worldObj.getBlock(x, y, z);
        block.setBlockBoundsBasedOnState(entityPlayer.worldObj, x, y, z);
        renderGlow(context, entityPlayer, block.getSelectedBoundingBoxFromPool(entityPlayer.worldObj, x, y, z), lineWidth, partialTicks);
    }

	private static void renderGlow(RenderGlobal context, EntityPlayer entityPlayer, AxisAlignedBB aabb, float lineWidth, float partialTicks) {
		GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glLineWidth(lineWidth);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDepthMask(false);
        float f1 = 0.002F;

        double d0 = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double) partialTicks;
        double d1 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double) partialTicks;
        double d2 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double) partialTicks;
        context.drawOutlinedBoundingBox(aabb.expand((double) f1, (double) f1, (double) f1).getOffsetBoundingBox(-d0, -d1, -d2), -1);
        
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_BLEND);
        }
}
