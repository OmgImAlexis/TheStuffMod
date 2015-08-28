package com.shnupbups.allthethings.potion;

import java.util.LinkedList;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;

public class PotionMonochromacy extends PotionBasic {
	LinkedList<AttributeModifier> modifiers=new LinkedList<AttributeModifier>();

	public PotionMonochromacy(int par1,boolean par2,int par3,boolean isBad,int colour) {
		super(par1,par2,par3,isBad,colour);
	}

	public boolean isReady(int p_76397_1_,int p_76397_2_) {
		return true;
	}

	public void performEffect(EntityLivingBase entity,int p_76394_2_) {
		if(entity.getActivePotionEffect(this).getDuration()<=5) {
			entity.removePotionEffect(getId());
			if(entity.worldObj.isRemote) Minecraft.getMinecraft().renderGlobal.loadRenderers();
		}
	}

	@Override
	public void applyAttributesModifiersToEntity(EntityLivingBase entity,BaseAttributeMap map,int p_111185_3_) {
		if(entity.worldObj.isRemote) Minecraft.getMinecraft().renderGlobal.loadRenderers();
	}
}
