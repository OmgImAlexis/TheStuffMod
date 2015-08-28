package com.shnupbups.allthethings.render;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import com.shnupbups.allthethings.entity.magic.EntitySpellPotion;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;

public class RenderSpell extends Render {
	private static final ResourceLocation texture=new ResourceLocation(Reference.MOD_ID+":textures/misc/spell.png");

	public void doRender(Entity entity,double p_76986_2_,double p_76986_4_,double p_76986_6_,float p_76986_8_,float p_76986_9_) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)p_76986_2_,(float)p_76986_4_,(float)p_76986_6_);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
		if(entity instanceof EntitySpellPotion) {
			PotionEffect potioneffect=((EntitySpellPotion)entity).getEffect();
			if(potioneffect!=null) {
				int id=potioneffect.getPotionID();
				Potion potion=Potion.potionTypes[id];
				if(potion!=null) {
					int hex=potion.getLiquidColor();
					int r=(hex>>16)&0xFF;
					int g=(hex>>8)&0xFF;
					int b=(hex>>0)&0xFF;
					GL11.glColor4f(r/255,g/255,b/255,1.0F);
				} else {
					GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
					LogHelper.info("NOPE1");
				}
			} else {
				GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
				LogHelper.info("NOPE2");
			}
		} else {
			GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
			LogHelper.info("NOPE3");
		}
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glScalef(0.5F,0.5F,0.5F);
		this.bindEntityTexture(entity);
		Tessellator tessellator=Tessellator.instance;
		GL11.glRotatef(180.0F-this.renderManager.playerViewY,0.0F,1.0F,0.0F);
		GL11.glRotatef(-this.renderManager.playerViewX,1.0F,0.0F,0.0F);
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F,1.0F,0.0F);
		tessellator.addVertexWithUV(0,0,0,0,0);
		tessellator.addVertexWithUV(1.0D,0,0,1,0);
		tessellator.addVertexWithUV(1.0D,1.0D,0,1,1);
		tessellator.addVertexWithUV(0,1.0D,0,0,1);
		tessellator.draw();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture;
	}
}
