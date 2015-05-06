package com.shnupbups.allthethings.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.shnupbups.allthethings.entity.EntityBear;
import com.shnupbups.allthethings.entity.EntityGrawquat;
import com.shnupbups.allthethings.entity.EntityMummy;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGrawquat extends RenderLiving {
    private static final ResourceLocation grawquatTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/grawquat.png");
    private static final String __OBFID = "CL_00000984";

    public RenderGrawquat(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityGrawquat p_110775_1_)
    {
        return grawquatTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityGrawquat)p_110775_1_);
    }
}