package omgimalexis.allthethings.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import omgimalexis.allthethings.item.ModItems;

public class TutCreativeTabTools extends CreativeTabs {

	public TutCreativeTabTools(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.dustAdamanite;
	}

}
