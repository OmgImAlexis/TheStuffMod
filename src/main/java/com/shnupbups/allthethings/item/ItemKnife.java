package com.shnupbups.allthethings.item;

import com.google.common.collect.Multimap;
import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Random;

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
    public boolean hasContainerItem(ItemStack stack){
        return (this.getDamage(stack)<this.getMaxDamage());
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
	
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}
