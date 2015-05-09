package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.common.Loader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
	public static final CreativeTabs block = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"blocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.blockRuby);
		}
	};
	public static final CreativeTabs item = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"items") {
		@Override
		public Item getTabIconItem() {
			return ModItems.gemRuby;
		}
	};
	public static final CreativeTabs tool = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"tools") {
		@Override
		public Item getTabIconItem() {
			return ModTools.rubyPickaxe;
		}
	};
	public static final CreativeTabs plate = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"plate") {
		@Override
		public Item getTabIconItem() {
			return ModItems.plateRubium;
		}
	};
	public static final CreativeTabs dust = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"dust") {
		@Override
		public Item getTabIconItem() {
			return ModItems.dustRuby;
		}
	};
	public static final CreativeTabs liquid = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"liquid") {
		@Override
		public Item getTabIconItem() {
			return ModBuckets.moltenRubyBucket;
		}
	};
	public static final CreativeTabs pure = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"pure") {
		@Override
		public Item getTabIconItem() {
			return ModItems.gemPureRuby;
		}
	};
	public static final CreativeTabs food = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"food") {
		@Override
		public Item getTabIconItem() {
			return ModItems.cherry;
		}
	};
	public static final CreativeTabs paint = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"paint") {
		@Override
		public Item getTabIconItem() {
			return ModItems.paintbrush;
		}
	};
	public static final CreativeTabs misc = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"misc") {
		@Override
		public Item getTabIconItem() {
			return ModItems.fossil;
		}
	};
}
