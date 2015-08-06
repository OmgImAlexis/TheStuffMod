package com.shnupbups.allthethings.render;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.shnupbups.allthethings.entity.EntityPaintball;

public class RenderPaintball extends RenderSnowball {
	
	public Item item;
	public int meta;
	
	public RenderPaintball(Item item, int meta){
        super(item, meta);
        this.item = item;
        this.meta = meta;
    }

    public RenderPaintball(Item item){
    	super(item);
    	this.item = item;
    	this.meta = 0;
    }

    public void doRender(Entity entity, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
    	if(!(entity instanceof EntityPaintball)) {
    		super.doRender(entity, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    		return;
    	}
    	IIcon iicon = item.getIconFromDamage(((EntityPaintball)entity).getColour());

        if (iicon != null)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            int k = item.getColorFromItemStack(new ItemStack(item,1,((EntityPaintball)entity).getColour()), 0);
            float f5 = (float)(k >> 16 & 255) / 255.0F;
            float f6 = (float)(k >> 8 & 255) / 255.0F;
            float f7 = (float)(k & 255) / 255.0F;
            GL11.glColor4f(f5, f6, f7, 1.0F);
            this.bindEntityTexture(entity);
            Tessellator tessellator = Tessellator.instance;

            this.func_77026_a(tessellator, iicon);
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
        }
    }
    
    private void func_77026_a(Tessellator p_77026_1_, IIcon p_77026_2_)
    {
        float f = p_77026_2_.getMinU();
        float f1 = p_77026_2_.getMaxU();
        float f2 = p_77026_2_.getMinV();
        float f3 = p_77026_2_.getMaxV();
        float f4 = 1.0F;
        float f5 = 0.5F;
        float f6 = 0.25F;
        GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        p_77026_1_.startDrawingQuads();
        p_77026_1_.setNormal(0.0F, 1.0F, 0.0F);
        p_77026_1_.addVertexWithUV((double)(0.0F - f5), (double)(0.0F - f6), 0.0D, (double)f, (double)f3);
        p_77026_1_.addVertexWithUV((double)(f4 - f5), (double)(0.0F - f6), 0.0D, (double)f1, (double)f3);
        p_77026_1_.addVertexWithUV((double)(f4 - f5), (double)(f4 - f6), 0.0D, (double)f1, (double)f2);
        p_77026_1_.addVertexWithUV((double)(0.0F - f5), (double)(f4 - f6), 0.0D, (double)f, (double)f2);
        p_77026_1_.draw();
    }
}
