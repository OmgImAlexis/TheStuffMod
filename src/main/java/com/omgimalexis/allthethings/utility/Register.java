package com.omgimalexis.allthethings.utility;

import com.omgimalexis.allthethings.block.BlockBasic;
import com.omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import com.omgimalexis.allthethings.handler.BucketHandler;
import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.init.ModFluids;
import com.omgimalexis.allthethings.init.ModItems;
import com.omgimalexis.allthethings.item.ItemBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
	 * Only problem is, it's very buggy and should not ever be used until it's better.
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
	/**public static void addMaterial(String itemname, String blockname, String orename, int blockhard, int blocklevel, Material blockmaterial, int orehard, int orelevel, Material orematerial, boolean oredropitem) {
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
	}*/
	
	public static void registerBucket(ItemBucket bucket, String name, Fluid fluid, Block block) {
		GameRegistry.registerItem(bucket, name);
		FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, 1000), new ItemStack(bucket), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(block, bucket);
	}

	public static void registerRing(Item ring, Item ring2, String name, String name2, Item material) {
		GameRegistry.registerItem(ring, name);
		GameRegistry.registerItem(ring2, name2);
		GameRegistry.addShapelessRecipe(new ItemStack(ring), ModItems.ring, material);
		GameRegistry.addShapelessRecipe(new ItemStack(ring2), ModItems.silverRing, material);
	}
	
	public static void registerMaterialBlock(Block block, String name, Item base) {
		GameRegistry.registerBlock(block, name);
		GameRegistry.addRecipe(new ItemStack(block), "mmm", "mmm", "mmm", 'm', base);
		GameRegistry.addShapelessRecipe(new ItemStack(base, 9), block);
		UtilityCheck.addMaterialBlock(block);
	}
	
	public static void registerMaterial(Item material, String name) {
		GameRegistry.registerItem(material, name);
		UtilityCheck.addMaterial(material);
	}
}
