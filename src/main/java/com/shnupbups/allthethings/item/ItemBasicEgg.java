package com.shnupbups.allthethings.item;

import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemStack;
import com.shnupbups.allthethings.lib.Reference;

public class ItemBasicEgg extends ItemEgg {
	public ItemBasicEgg() {
		super();
		Reference.incrementItems();
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		// return new ItemStack(ModItems.eggShell);
		return null;
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		return false;
	}
}