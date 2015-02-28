package com.omgimalexis.allthethings.init;

import com.omgimalexis.allthethings.world.village.VillageTrades;

import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ModMisc {
	public static ChestGenHooks houseChest;
	
	public static void init() {
		houseChest = new ChestGenHooks("gemHouse", new WeightedRandomChestContent[0], 2, 8);
		houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemAmazonite), 1, 3, 100));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemAmber), 1, 3, 128));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemAmethyst), 1, 3, 128));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemCarnelian), 1, 3, 50));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemCitrine), 1, 3, 32));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemDiamond), 1, 2, 16));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemGarnet), 1, 3, 32));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemJade), 1, 3, 128));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemKunzite), 1, 3, 50));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemNetherQuartz), 1, 3, 50));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemOnyx), 1, 2, 12));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemOpal), 1, 3, 64));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemQuartz), 1, 3, 64));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemRuby), 1, 4, 200));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemSapphire), 1, 4, 200));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemTopaz), 1, 3, 150));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(Items.emerald), 1, 3, 200));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond), 1, 2, 25));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(Items.quartz), 1, 3, 75));
		houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureAmazonite), 1, 2, 50));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureAmber), 1, 2, 64));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureAmethyst), 1, 2, 64));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureCarnelian), 1, 2, 25));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureCitrine), 1, 2, 16));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureDiamond), 1, 1, 8));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureEmerald), 1, 2, 100));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureGarnet), 1, 2, 32));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureJade), 1, 2, 64));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureKunzite), 1, 2, 25));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureNetherQuartz), 1, 2, 25));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureOnyx), 1, 1, 8));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureOpal), 1, 2, 32));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureQuartz), 1, 2, 32));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureRuby), 1, 3, 100));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureSapphire), 1, 3, 100));
    	houseChest.addItem(new WeightedRandomChestContent(new ItemStack(ModItems.gemPureTopaz), 1, 2, 75));
    	
    	
    	VillagerRegistry.instance().registerVillageTradeHandler(56329, new VillageTrades());
	}
}
