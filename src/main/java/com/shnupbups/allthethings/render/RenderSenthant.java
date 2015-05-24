package com.shnupbups.allthethings.render;

import com.shnupbups.allthethings.entity.living.EntitySenthant;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderSenthant extends RenderLiving {
    private static final ResourceLocation senthantTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/senthant.png");
    private static final String __OBFID = "CL_00000984";

    public RenderSenthant(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntitySenthant p_110775_1_)
    {
        return senthantTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntitySenthant)p_110775_1_);
    }
}