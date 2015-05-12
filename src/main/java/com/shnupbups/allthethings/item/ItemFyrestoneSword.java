package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.lib.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemFyrestoneSword extends ItemBasicSword {

	public ItemFyrestoneSword(ToolMaterial material, String name) {
		super(material, name);
	}

	public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(1, p_77644_3_);
        p_77644_2_.setFire(10);
        return true;
    }
	
}
