package omgimalexis.allthethings.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import omgimalexis.allthethings.block.Blocks;


public class TutCreativeTabBlock extends CreativeTabs {

	public TutCreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Blocks.ruby_ore);
	}

}
