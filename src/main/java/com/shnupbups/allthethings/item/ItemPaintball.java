package com.shnupbups.allthethings.item;

import java.util.List;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPaintball extends ItemBasic {
	public ItemPaintball(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize, "Temporary Recipe, will change next PR.");
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 17; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return Reference.MOD_ID + ":paintballWhite";
		case 1:
			return Reference.MOD_ID + ":paintballOrange";
		case 2:
			return Reference.MOD_ID + ":paintballMagenta";
		case 3:
			return Reference.MOD_ID + ":paintballLightBlue";
		case 4:
			return Reference.MOD_ID + ":paintballYellow";
		case 5:
			return Reference.MOD_ID + ":paintballLime";
		case 6:
			return Reference.MOD_ID + ":paintballPink";
		case 7:
			return Reference.MOD_ID + ":paintballGrey";
		case 8:
			return Reference.MOD_ID + ":paintballLightGrey";
		case 9:
			return Reference.MOD_ID + ":paintballCyan";
		case 10:
			return Reference.MOD_ID + ":paintballPurple";
		case 11:
			return Reference.MOD_ID + ":paintballBlue";
		case 12:
			return Reference.MOD_ID + ":paintballBrown";
		case 13:
			return Reference.MOD_ID + ":paintballGreen";
		case 14:
			return Reference.MOD_ID + ":paintballRed";
		case 15:
			return Reference.MOD_ID + ":paintballBlack";
		default:
			return Reference.MOD_ID + ":paintballRainbow";
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		if(stack.getItemDamage() < 16) {
			return UtilityCheck.getColourForMeta(stack.getItemDamage());
		} else return new Random().nextInt(16777215);
	}
}
