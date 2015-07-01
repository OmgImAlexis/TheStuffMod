package com.shnupbups.allthethings.handler;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.world.WorldSettings.GameType;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.utility.MiscUtility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PotionHandler {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		if(event.entityLiving.isPotionActive(ModPotions.bleeding)) {
			if(event.entityLiving.worldObj.rand.nextInt(24-(MiscUtility.clamp(event.entityLiving.getActivePotionEffect(ModPotions.bleeding).getAmplifier()+1,1,20))) == 0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:bleeding"), MiscUtility.clamp(event.entityLiving.getActivePotionEffect(ModPotions.bleeding).getAmplifier()+1,1,5));
				//event.entityLiving.worldObj.spawnParticle("splash", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0D, 1.0D, 1.0D);
			}
		}
		if(event.entityLiving.isPotionActive(ModPotions.leadPoison)) {
			if(event.entityLiving.worldObj.rand.nextInt(120) == 0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:leadPoison"), 2);
				if (event.entityLiving instanceof EntityPlayer) {
					((EntityPlayer)event.entityLiving).addExhaustion(10.0F);
				}
				//event.entityLiving.worldObj.spawnParticle("splash", (event.entityLiving.posX+0.5F)-0.27000001072883606D, (event.entityLiving.posY+0.7F)+0.2199999988079071D, (event.entityLiving.posZ+0.5F), 0.0D, 0.0D, 0.0D);
			}
		}
		if(event.entityLiving.isPotionActive(ModPotions.lessening)) {
			if(event.entityLiving instanceof EntityPlayerMP && ((EntityPlayerMP) event.entityLiving).theItemInWorldManager.getGameType() == GameType.CREATIVE) return;
			else if(event.entityLiving.getHealth() <= 1 || event.entityLiving.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue() <= 2.0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:lessening"), 9001);
			}
		}
		if(event.entityLiving.isPotionActive(ModPotions.anchorage)) {
			event.entityLiving.motionY=MiscUtility.clamp(event.entityLiving.motionY, -9001, 0);
		}
		if(event.entityLiving.isPotionActive(ModPotions.flight) && event.entityLiving instanceof EntityPlayer && ((EntityPlayer)event.entityLiving).capabilities.isCreativeMode != true) {
			if(event.entityLiving.getActivePotionEffect(ModPotions.flight).getDuration()<50) {((EntityPlayer)event.entityLiving).capabilities.allowFlying = false; ((EntityPlayer)event.entityLiving).capabilities.isFlying = false;}
			else ((EntityPlayer)event.entityLiving).capabilities.allowFlying = true;
		} else if(event.entityLiving instanceof EntityPlayer) {
			//if(((EntityPlayer)event.entityLiving).capabilities.isCreativeMode != true) {((EntityPlayer)event.entityLiving).capabilities.allowFlying = false; ((EntityPlayer)event.entityLiving).capabilities.isFlying = false;}
		}
	}
	
	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent event) {
		if(event.entityLiving.isPotionActive(ModPotions.anchorage)) {
			event.entityLiving.motionY=MiscUtility.clamp(event.entityLiving.motionY, -Double.MAX_VALUE, 0);
		}
	}
}
