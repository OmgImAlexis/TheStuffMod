package com.shnupbups.allthethings.machine;

import net.minecraft.item.ItemStack;

public interface IGenerator {
	public void operate();
	public boolean canOperate();
	public int getAmountFor(ItemStack item);
}
