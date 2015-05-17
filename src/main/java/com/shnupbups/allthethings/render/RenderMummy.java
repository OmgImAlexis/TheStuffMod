package com.shnupbups.allthethings.render;

import com.shnupbups.allthethings.entity.living.EntityMummy;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderMummy extends RenderLiving {
    private static final ResourceLocation mummyTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/mummy.png");
    private static final String __OBFID = "CL_00000984";

    public RenderMummy(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMummy p_110775_1_)
    {
        return mummyTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityMummy)p_110775_1_);
    }
}