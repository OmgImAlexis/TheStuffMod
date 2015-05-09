package com.shnupbups.allthethings.item;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;
import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemKnife extends ItemBasic{

	public ItemKnife(String name, CreativeTabs tab) {
		super(name, tab, 1);
		this.setMaxDamage(100);
		Reference.incrementItems();
	}

	@Override
	public Multimap getAttributeModifiers(ItemStack stack){
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 4.5F, 0));
        return multimap;
    }
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack){
        //if(itemStack.getItemDamage() <= 0) return null;
        //else
        return new ItemStack(this, 1, this.getDamage(itemStack)+1);
    }

    @Override
    public boolean hasContainerItem(){
        return true;
    }
    
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
    	return false;
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase hit, EntityLivingBase player)
    {
        stack.damageItem(1, player);
        int bleed = new Random().nextInt(4);
        if(bleed <= 1) {
        	hit.addPotionEffect(new PotionEffect(ModPotions.bleeding.getId(), 300, 1, true));
        }
        return true;
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.block;
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        return p_77659_1_;
    }
	
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
    
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }
}
