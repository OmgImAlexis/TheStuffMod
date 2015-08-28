package com.shnupbups.allthethings.item.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import com.shnupbups.allthethings.block.BlockColoured;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.lib.Strings;

public class ItemBlockColoured extends ItemBlockWithMetadata {
	public ItemBlockColoured(Block block) {
		super(block,block);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch(stack.getItemDamage()) {
			case 0:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[0]));
			case 1:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[1]));
			case 2:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[2]));
			case 3:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[3]));
			case 4:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[4]));
			case 5:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[5]));
			case 6:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[6]));
			case 7:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[7]));
			case 8:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[8]));
			case 9:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[9]));
			case 10:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[10]));
			case 11:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[11]));
			case 12:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[12]));
			case 13:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[13]));
			case 14:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[14]));
			case 15:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(((BlockColoured)Block.getBlockFromItem(stack.getItem())).textureName+Strings.colourNames[15]));
			default:
				return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		}
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
