package com.shnupbups.allthethings.utility;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.shnupbups.allthethings.init.ModBlocks;

public class CompressingRecipes {
	public static ItemStack getCompressResult(ItemStack itemstack) {
		if(itemstack!=null) {
			if(itemstack.getItem()==Item.getItemFromBlock(Blocks.iron_block)&&stackSizeIsMoreOrEqual(itemstack,1)) return new ItemStack(ModBlocks.compressedIronBlock,1);
		}
		return null;
	}

	private static boolean stackSizeIsMoreOrEqual(ItemStack itemstack,int stackSize) {
		return itemstack.stackSize>=stackSize;
	}

	public static int getStackSizeToDecrease(ItemStack itemstack) {
		return 9;
	}
}
