package com.shnupbups.allthethings.item;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Multimap;
import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasicEgg extends ItemEgg {
	
	public ItemBasicEgg() {
		super();
		Reference.incrementItems();
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack){
       // return new ItemStack(ModItems.eggShell);
		return null;
    }

    @Override
    public boolean hasContainerItem(){
        return true;
    }
    
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
    	return false;
    }
}