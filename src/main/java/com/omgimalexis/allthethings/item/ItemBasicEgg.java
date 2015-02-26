package com.omgimalexis.allthethings.item;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Multimap;
import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.init.ModCreativeTabs;
import com.omgimalexis.allthethings.init.ModItems;
import com.omgimalexis.allthethings.init.ModPotions;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.UtilityCheck;

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