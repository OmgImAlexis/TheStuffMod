package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.fyrestone) {
			return 15000;
		} else if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.blockFyrestone)) {
			return 140000;
		} else if(fuel.getItem() == ModItems.fyrestoneStable) {
			return 1500;
		} 
		return 0;
	}
}
