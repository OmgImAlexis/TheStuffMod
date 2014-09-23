package omgimalexis.allthethings.utility;

import omgimalexis.allthethings.block.BlockBasic;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.handler.BucketHandler;
import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.init.ModFluids;
import omgimalexis.allthethings.item.ItemBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Register {
	private static ItemBasic item;
	private static BlockBasic block;
	private static BlockBasic ore;
	
	/**
	 * A function that creates everything for us!
	 * Only problem is, it's very buggy and should not every be used until it's better.
	 * Best to leave it alone for now.
	 * @param itemname
	 * @param blockname
	 * @param orename
	 * @param blockhard
	 * @param blocklevel
	 * @param blockmaterial
	 * @param orehard
	 * @param orelevel
	 * @param orematerial
	 * @param oredropitem
	 */
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
	
	public static void addBucket(ItemBucket bucket, String name, Fluid fluid, Block block) {
		GameRegistry.registerItem(bucket, name);
		FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, 1000), new ItemStack(bucket), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(block, bucket);
	}
}