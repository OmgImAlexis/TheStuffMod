package com.shnupbups.allthethings.magic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import com.shnupbups.allthethings.item.ItemBasic;

public abstract class ItemMagic extends ItemBasic {
	public ItemMagic(String name,CreativeTabs tab,int stackSize) {
		super(name,tab,stackSize);
	}

	public abstract boolean renderFluoInHUD();

	public FluoProperties getProperties(EntityPlayer player) {
		return FluoProperties.get(player);
	}
}
