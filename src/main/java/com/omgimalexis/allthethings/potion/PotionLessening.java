package com.omgimalexis.allthethings.potion;

import java.util.Iterator;
import java.util.Map.Entry;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;

public class PotionLessening extends PotionBasic{

	public PotionLessening(int par1, boolean par2, int par3) {
		super(par1, par2, par3);
		// TODO Auto-generated constructor stub
	}
	
	public void applyAttributesModifiersToEntity(EntityLivingBase p_111185_1_, BaseAttributeMap p_111185_2_, int p_111185_3_)
    {
       super.applyAttributesModifiersToEntity(p_111185_1_, p_111185_2_, p_111185_3_);
       p_111185_1_.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(p_111185_1_.getMaxHealth()-(0.1F*this.getEffectiveness()));
    }
	
	public void removeAttributesModifiersFromEntity(EntityLivingBase p_111187_1_, BaseAttributeMap p_111187_2_, int p_111187_3_){
        super.removeAttributesModifiersFromEntity(p_111187_1_, p_111187_2_, p_111187_3_);

        p_111187_1_.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20);
    }

}
