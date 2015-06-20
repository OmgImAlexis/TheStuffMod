package com.shnupbups.allthethings.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.entity.living.EntityFox;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFox extends RenderLiving
{
    private static final ResourceLocation foxTextures = new ResourceLocation(Reference.MOD_ID+":textures/entity/fox.png");
    private static final ResourceLocation tamedFoxTextures = new ResourceLocation(Reference.MOD_ID+":textures/entity/foxtame.png");
    private static final ResourceLocation angryFoxTextures = new ResourceLocation(Reference.MOD_ID+":textures/entity/foxangry.png");
    private static final ResourceLocation wolfCollarTextures = new ResourceLocation("textures/entity/wolf/wolf_collar.png");
    private static final String __OBFID = "CL_00001036";

    public RenderFox(ModelBase p_i1269_1_, float f)
    {
        super(p_i1269_1_, f);
        this.setRenderPassModel(p_i1269_1_);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityFox p_77044_1_, float p_77044_2_)
    {
        return p_77044_1_.getTailRotation();
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityFox p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_2_ == 0 && p_77032_1_.getWolfShaking())
        {
            float f1 = p_77032_1_.getBrightness(p_77032_3_) * p_77032_1_.getShadingWhileShaking(p_77032_3_);
            this.bindTexture(foxTextures);
            GL11.glColor3f(f1, f1, f1);
            return 1;
        }
        else if (p_77032_2_ == 1 && p_77032_1_.isTamed())
        {
            this.bindTexture(wolfCollarTextures);
            int j = p_77032_1_.getCollarColor();
            GL11.glColor3f(EntitySheep.fleeceColorTable[j][0], EntitySheep.fleeceColorTable[j][1], EntitySheep.fleeceColorTable[j][2]);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityFox p_110775_1_)
    {
        return p_110775_1_.isTamed() ? tamedFoxTextures : (p_110775_1_.isAngry() ? angryFoxTextures : foxTextures);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityFox)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.handleRotationFloat((EntityFox)p_77044_1_, p_77044_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityFox)p_110775_1_);
    }
}