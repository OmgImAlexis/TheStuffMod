package com.shnupbups.allthethings.handler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem()==ModItems.fyrestone) {
			return 15000;
		} else if(fuel.getItem()==Item.getItemFromBlock(ModBlocks.blockFyrestone)) {
			return 140000;
		} else if(fuel.getItem()==ModItems.fyrestoneStable) {
			return 2500;
		}
		return 0;
	}
}
