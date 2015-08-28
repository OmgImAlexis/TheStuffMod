package com.shnupbups.allthethings.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.shnupbups.allthethings.lib.Reference;

public class ModDebugTabs {
	public static final CreativeTabs debug=new CreativeTabs(Reference.MOD_ID.toLowerCase()+"debug") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.blockUnobtanium);
		}
	};
}
