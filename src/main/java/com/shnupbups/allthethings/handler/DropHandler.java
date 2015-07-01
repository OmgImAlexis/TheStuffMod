package com.shnupbups.allthethings.handler;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.shnupbups.allthethings.init.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	@SubscribeEvent
	public void onEvent(LivingDropsEvent event){
	    if (event.entityLiving instanceof EntityBat){
	        if(event.entityLiving.worldObj.rand.nextInt(10) <= 2) {
	        	event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(ModItems.batWing)));
	        }
	    }
	} 
}
