package omgimalexis.allthethings.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import omgimalexis.allthethings.item.Items;

public class TutCrop extends BlockCrops {

	/**
	 * seeds
	 */
	@Override
	protected Item func_149866_i() {
		return Items.adamaniteDust;
	}

	/**
	 * crop
	 */
	@Override
	protected Item func_149865_P() {
		return Items.adamaniteDust;
	}

}
