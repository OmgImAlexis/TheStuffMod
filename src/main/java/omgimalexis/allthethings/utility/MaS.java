package omgimalexis.allthethings.utility;

import omgimalexis.allthethings.block.BlockBasic;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.item.ItemBasic;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class MaS {
	private static ItemBasic item;
	private static BlockBasic block;
	private static BlockBasic ore;
	
	public static void addMaterial(String itemname, String blockname, String orename, int blockhard, int blocklevel, Material blockmaterial, int orehard, int orelevel, Material orematerial, boolean oredropitem) {
		item = new ItemBasic(itemname,TMCreativeTabs.item);
		block = new BlockBasic(blockname, blockmaterial, TMCreativeTabs.block, blocklevel, blockhard);
		ore = new BlockBasic(orename, orematerial, TMCreativeTabs.block, orelevel, orehard);
		
		GameRegistry.registerItem(item, itemname);
		GameRegistry.registerBlock(block, blockname);
		GameRegistry.registerBlock(ore, orename);
		OreDictionary.registerOre(itemname, item);
		GameRegistry.addSmelting(ore, new ItemStack(item), 5);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(block), true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), itemname}));
		GameRegistry.addShapelessRecipe(new ItemStack(item, 9), new ItemStack(block));
	}
}
