package omgimalexis.allthethings.creativetabs;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.init.ModItems;
import omgimalexis.allthethings.init.ModTools;
import omgimalexis.allthethings.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TMCreativeTabs {
	public static final CreativeTabs block = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"blocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.blockRuby);
		}
	};
	public static final CreativeTabs item = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"items") {
		@Override
		public Item getTabIconItem() {
			return ModItems.ruby;
		}
	};
	public static final CreativeTabs tool = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"tools") {
		@Override
		public Item getTabIconItem() {
			return ModTools.rubyPickaxe;
		}
	};
	public static final CreativeTabs jewelry = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"jewelry") {
		@Override
		public Item getTabIconItem() {
			return ModItems.rubyRing;
		}
	};
	public static final CreativeTabs misc = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"misc") {
		@Override
		public Item getTabIconItem() {
			return ModItems.cherry;
		}
	};
}
