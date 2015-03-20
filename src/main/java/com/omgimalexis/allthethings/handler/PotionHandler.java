package com.omgimalexis.allthethings.handler;

import net.minecraft.client.particle.EntityFireworkOverlayFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.omgimalexis.allthethings.init.ModPotions;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PotionHandler {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		if(event.entityLiving.isPotionActive(ModPotions.bleeding)) {
			if(event.entityLiving.worldObj.rand.nextInt(40) == 0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:bleeding"), 1);
				event.entityLiving.worldObj.spawnParticle("splash", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0D, 1.0D, 1.0D);
			}
		} else if(event.entityLiving.isPotionActive(ModPotions.leadPoison)) {
			if(event.entityLiving.worldObj.rand.nextInt(40) == 0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:leadPoison"), 2);
				if (event.entityLiving instanceof EntityPlayer) {
					((EntityPlayer)event.entityLiving).addExhaustion(20.0F);
				}
				event.entityLiving.worldObj.spawnParticle("splash", (event.entityLiving.posX+0.5F)-0.27000001072883606D, (event.entityLiving.posY+0.7F)+0.2199999988079071D, (event.entityLiving.posZ+0.5F), 0.0D, 0.0D, 0.0D);
			}
		} else if(event.entityLiving.isPotionActive(ModPotions.lessening)) {
			if(event.entityLiving.getMaxHealth() > 0.1F) {
				event.entityLiving.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(event.entityLiving.getMaxHealth()-0.1F);
			}
		}
	}
	
}
