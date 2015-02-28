package com.omgimalexis.allthethings.item;

import com.omgimalexis.allthethings.lib.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemFyrestoneSword extends ItemBasicSword {

	public ItemFyrestoneSword(ToolMaterial material, String name) {
		super(material, name);
		Reference.incrementItems();
	}

	public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(1, p_77644_3_);
        p_77644_2_.setFire(10);
        return true;
    }
	
}
