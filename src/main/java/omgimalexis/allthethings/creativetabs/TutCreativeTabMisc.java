package omgimalexis.allthethings.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import omgimalexis.allthethings.item.ModItems;

public class TutCreativeTabMisc extends CreativeTabs {

	public TutCreativeTabMisc(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.dustAdamanite;
	}

}
