package com.omgimalexis.allthethings.utility;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.init.ModItems;

public class CrushingRecipes {

	public static ItemStack getPulverizeResult(ItemStack itemstack) {
		if(itemstack != null) {
			if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAdamanite)) return new ItemStack(ModItems.clusterAdamanite);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAluminium)) return new ItemStack(ModItems.clusterAluminium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreBlurite)) return new ItemStack(ModItems.clusterBlurite);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreChromium)) return new ItemStack(ModItems.clusterChromium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCobalt)) return new ItemStack(ModItems.clusterCobalt);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCopper)) return new ItemStack(ModItems.clusterCopper);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreDaeyalt)) return new ItemStack(ModItems.clusterDaeyalt);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.gold_ore)) return new ItemStack(ModItems.clusterGold);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.iron_ore)) return new ItemStack(ModItems.clusterIron);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreLead)) return new ItemStack(ModItems.clusterLead);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreLunar)) return new ItemStack(ModItems.clusterLunar);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreMalagnite)) return new ItemStack(ModItems.clusterMalagnite);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreManganese)) return new ItemStack(ModItems.clusterManganese);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreMithril)) return new ItemStack(ModItems.clusterMithril);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreNickel)) return new ItemStack(ModItems.clusterNickel);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.orePlatinum)) return new ItemStack(ModItems.clusterPlatinum);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRhodium)) return new ItemStack(ModItems.clusterRhodium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRubium)) return new ItemStack(ModItems.clusterRubium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRunite)) return new ItemStack(ModItems.clusterRunite);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreSilicon)) return new ItemStack(ModItems.clusterSilicon);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreSilver)) return new ItemStack(ModItems.clusterSilver);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTin)) return new ItemStack(ModItems.clusterTin);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTitanium)) return new ItemStack(ModItems.clusterTitanium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTungsten)) return new ItemStack(ModItems.clusterTungsten);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreZinc)) return new ItemStack(ModItems.clusterZinc);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAmazonite)) return new ItemStack(ModItems.clusterAmazonite);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAmethyst)) return new ItemStack(ModItems.clusterAmethyst);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAquamarine)) return new ItemStack(ModItems.clusterAquamarine);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCarnelian)) return new ItemStack(ModItems.clusterCarnelian);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCitrine)) return new ItemStack(ModItems.clusterCitrine);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.diamond_ore)) return new ItemStack(ModItems.clusterDiamond);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.emerald_ore)) return new ItemStack(ModItems.clusterEmerald);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreGarnet)) return new ItemStack(ModItems.clusterGarnet);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreJade)) return new ItemStack(ModItems.clusterJade);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreKunzite)) return new ItemStack(ModItems.clusterKunzite);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.quartz_ore)) return new ItemStack(ModItems.clusterNetherQuartz);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreOnyx)) return new ItemStack(ModItems.clusterOnyx);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreOpal)) return new ItemStack(ModItems.clusterOpal);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreQuartz)) return new ItemStack(ModItems.clusterQuartz);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRuby)) return new ItemStack(ModItems.clusterRuby);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreSapphire)) return new ItemStack(ModItems.clusterSapphire);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTopaz)) return new ItemStack(ModItems.clusterTopaz);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreFyrestone)) return new ItemStack(ModItems.clusterFyrestone);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreVoidium)) return new ItemStack(ModItems.clusterVoidium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreVoidiumBedrock)) return new ItemStack(ModItems.clusterVoidium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreIridium)) return new ItemStack(ModItems.clusterIridium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.orePlutonium)) return new ItemStack(ModItems.clusterPlutonium);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreUranium)) return new ItemStack(ModItems.clusterUranium);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.coal_ore)) return new ItemStack(ModItems.clusterCoal);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.lapis_ore)) return new ItemStack(ModItems.clusterLapis);
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.redstone_ore)) return new ItemStack(ModItems.clusterRedstone);
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTrytementium)) return new ItemStack(ModItems.clusterTrytementium);
		} return null;
	}
	
	private static boolean stackSizeIsMoreOrEqual(ItemStack itemstack, int stackSize) {
		return itemstack.stackSize >= stackSize;
	}
	
	public static int getStackSizeToDecrease(ItemStack itemstack) {
		return 1;
	}
	
	public static int getPulverizeAmount(ItemStack itemstack) {
		if(itemstack != null) {
			if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAdamanite)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAluminium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreBlurite)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreChromium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCobalt)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCopper)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreDaeyalt)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.gold_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.iron_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreLead)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreLunar)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreMalagnite)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreManganese)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreMithril)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreNickel)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.orePlatinum)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRhodium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRubium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRunite)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreSilicon)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreSilver)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTin)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTitanium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTungsten)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreZinc)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAmazonite)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAmethyst)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreAquamarine)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCarnelian)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreCitrine)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.diamond_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.emerald_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreGarnet)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreJade)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreKunzite)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.quartz_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreOnyx)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreOpal)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreQuartz)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreRuby)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreSapphire)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTopaz)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreFyrestone)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreVoidium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreVoidiumBedrock)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreIridium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.orePlutonium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreUranium)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.coal_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.lapis_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(Blocks.redstone_ore)) return 1;
			else if(itemstack.getItem() == Item.getItemFromBlock(ModBlocks.oreTrytementium)) return 1;
		} return 0;
	}
}
