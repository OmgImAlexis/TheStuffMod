package com.shnupbups.allthethings.render;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import com.shnupbups.allthethings.entity.living.EntityPirate;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.model.ModelPirate;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPirate extends RenderBiped {
	private static final ResourceLocation pirateTextures=new ResourceLocation(Reference.MOD_ID+":textures/entity/captain.png");
	private static final String __OBFID="CL_00000984";
	public ModelPirate model;

	public RenderPirate(ModelPirate p_i1253_1_,float p_i1253_2_) {
		super(p_i1253_1_,p_i1253_2_);
		this.model=(ModelPirate)p_i1253_1_;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call
	 * Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityPirate p_110775_1_) {
		return pirateTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call
	 * Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return this.getEntityTexture((EntityPirate)p_110775_1_);
	}
}