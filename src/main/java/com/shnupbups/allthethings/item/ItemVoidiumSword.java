package com.shnupbups.allthethings.item;

import java.util.List;

import com.shnupbups.allthethings.lib.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemVoidiumSword extends ItemBasicSword {

	public ItemVoidiumSword(ToolMaterial material, String name, int colour) {
		super(material, name, colour);
	}

	public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        if(p_77644_2_.dimension != 1 && p_77644_2_.worldObj.rand.nextInt(3) <= 1) {
        	p_77644_1_.damageItem(500, p_77644_3_);
        	p_77644_2_.travelToDimension(1);
            p_77644_3_.worldObj.playSoundAtEntity(p_77644_3_, "mob.endermen.portal", 1.0f, 1.6f);
        } else {
        	p_77644_1_.damageItem(1, p_77644_3_);
        }
        return true;
    }
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		list.add("Teleports one who touches");
		list.add("the blade to the Ender Realm");
	}
	
}
