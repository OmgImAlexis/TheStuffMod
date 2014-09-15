package omgimalexis.allthethings.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import omgimalexis.allthethings.item.Items;

public class TutCreativeTabCombat extends CreativeTabs {

	public TutCreativeTabCombat(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Items.adamaniteDust;
	}

}
