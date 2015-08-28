package com.shnupbups.allthethings.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import com.shnupbups.allthethings.entity.living.EntityLyekhwrone;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLyekhwrone extends RenderLiving {
	private static final ResourceLocation thingTextures=new ResourceLocation(Reference.MOD_ID+":textures/entity/lyekhwrone.png");
	private static final String __OBFID="CL_00000984";

	public RenderLyekhwrone(ModelBase p_i1253_1_,float p_i1253_2_) {
		super(p_i1253_1_,p_i1253_2_);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call
	 * Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityLyekhwrone p_110775_1_) {
		return thingTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call
	 * Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return this.getEntityTexture((EntityLyekhwrone)p_110775_1_);
	}
}