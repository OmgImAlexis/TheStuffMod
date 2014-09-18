package omgimalexis.allthethings.init;

import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.handler.BucketHandler;
import omgimalexis.allthethings.item.ItemBasicBucket;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBuckets {
	public static final ItemBasicBucket moltenIronBucket = new ItemBasicBucket(ModBlocks.moltenIron, "ironMoltenBucket", TMCreativeTabs.misc, 1);
	public static final ItemBasicBucket moltenGoldBucket = new ItemBasicBucket(ModBlocks.moltenGold, "goldMoltenBucket", TMCreativeTabs.misc, 1);
	
	public static void init() {
		GameRegistry.registerItem(moltenIronBucket, "ironMoltenBucket");
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.moltenIronFluid, 1000), new ItemStack(moltenIronBucket), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(ModBlocks.moltenIron, moltenIronBucket);
		GameRegistry.registerItem(moltenGoldBucket, "goldMoltenBucket");
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.moltenGoldFluid, 1000), new ItemStack(moltenGoldBucket), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(ModBlocks.moltenGold, moltenGoldBucket);
	}
}
