package com.omgimalexis.allthethings.potion;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;

public class PotionLessening extends PotionBasic{
	
	LinkedList<AttributeModifier> modifiers = new LinkedList<AttributeModifier>();
	
	public PotionLessening(int par1, boolean par2, int par3) {
		super(par1, par2, par3);
	}
	
	public boolean isReady(int p_76397_1_, int p_76397_2_){
        return true;
    }
	
	public void performEffect(EntityLivingBase p_76394_1_, int p_76394_2_) {
		applyAttributesModifiersToEntity(p_76394_1_, p_76394_1_.getAttributeMap(), p_76394_2_);
	}
	
	@Override
	public void applyAttributesModifiersToEntity(EntityLivingBase entity, BaseAttributeMap map, int p_111185_3_) {
		AttributeModifier modifier = new AttributeModifier("lessen", -0.1D*this.getEffectiveness(), 0);
		entity.getEntityAttribute(SharedMonsterAttributes.maxHealth).applyModifier(modifier);
		modifiers.add(modifier);
		if(new Random().nextInt(20) <= 2) entity.worldObj.playSoundAtEntity(entity, "minecraft:mob.zombiepig.zpigdeath", 1.0F, 0.7F);
		if(entity.getHealth() > entity.getMaxHealth()) entity.setHealth(entity.getMaxHealth());
		super.applyAttributesModifiersToEntity(entity, map, p_111185_3_);
	}
	
	public void removeAttributesModifiersFromEntity(EntityLivingBase entity, BaseAttributeMap p_111187_2_, int p_111187_3_){
		for(int i = 0; i < modifiers.size(); i++) {
			entity.getEntityAttribute(SharedMonsterAttributes.maxHealth).removeModifier(modifiers.get(i));
		}
		super.removeAttributesModifiersFromEntity(entity, p_111187_2_, p_111187_3_);
    }

}
