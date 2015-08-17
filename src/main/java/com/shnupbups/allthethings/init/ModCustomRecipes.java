package com.shnupbups.allthethings.init;

import java.util.ArrayList;

import com.shnupbups.allthethings.utility.OvenRecipes;
import com.shnupbups.allthethings.utility.Register;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCustomRecipes {
	
	public static void init() {
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.caramel,2), new ItemStack(Items.sugar), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket), new ItemStack(Items.milk_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.toffee,2), new ItemStack(Items.sugar), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_chicken), new ItemStack(Items.chicken));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_porkchop), new ItemStack(Items.porkchop));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_beef), new ItemStack(Items.beef));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_fished), new ItemStack(Items.fish,1,0));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cooked_fished,1,1), new ItemStack(Items.fish,1,1));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cookedTortoise), new ItemStack(ModItems.rawTortoise));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cookedGrawquat), new ItemStack(ModItems.rawGrawquat));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.mapleSyrup), new ItemStack(ModItems.mapleSap), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.pancake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.milk_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.bread), new ItemStack(Items.water_bucket), new ItemStack(ModItems.flour));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.cake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.water_bucket), new ItemStack(Items.milk_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.chocolateCake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.water_bucket), new ItemStack(ModItems.chocolateMilk));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.strawberryCake), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.egg), new ItemStack(Items.water_bucket), new ItemStack(ModItems.strawberryMilk));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(Items.pumpkin_pie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Blocks.pumpkin), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.applePie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(Items.apple), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cherryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.cherry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.lemonTart), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.lemon), new ItemStack(Items.egg), new ItemStack(Items.water_bucket));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.raspberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.raspberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.blueberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.blueberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.blackberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.blackberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.strawberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.strawberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.boysenberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.boysenberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.cranberryPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.cranberry), new ItemStack(Items.egg));
		OvenRecipes.getInstance().addShapelessRecipe(new ItemStack(ModItems.pearPie), new ItemStack(ModItems.flour), new ItemStack(Items.sugar), new ItemStack(ModItems.pear), new ItemStack(Items.egg));
	
		Register.registerPulverizerRecipe(Blocks.iron_ore, new ItemStack(ModItems.dustIron, 2), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe(Blocks.gold_ore, new ItemStack(ModItems.dustGold, 2), new ItemStack(ModItems.dustSilver, 1), 10);
		
		Register.registerPulverizerRecipe(Blocks.redstone_ore, new ItemStack(Items.redstone, 12), new ItemStack(ModItems.dustCopper, 1), 2);
		Register.registerPulverizerRecipe(Blocks.lapis_ore, new ItemStack(ModItems.dustLapis, 12), new ItemStack(ModItems.dustSilicon, 1), 4);
		
		Register.registerPulverizerRecipe(ModBlocks.oreCopper, new ItemStack(ModItems.dustCopper, 2), new ItemStack(ModItems.dustGold, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreTin, new ItemStack(ModItems.dustTin, 2), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreSilver, new ItemStack(ModItems.dustSilver, 2), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreLead, new ItemStack(ModItems.dustLead, 2), new ItemStack(ModItems.dustTin, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreNickel, new ItemStack(ModItems.dustNickel, 2), new ItemStack(ModItems.dustCobalt, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreAluminium, new ItemStack(ModItems.dustAluminium, 2), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.orePlatinum, new ItemStack(ModItems.dustPlatinum, 2), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreCobalt, new ItemStack(ModItems.dustCobalt, 2), new ItemStack(ModItems.dustPlatinum, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreChromium, new ItemStack(ModItems.dustChromium, 2), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreZinc, new ItemStack(ModItems.dustZinc, 2), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreManganese, new ItemStack(ModItems.dustManganese, 2), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreRhodium, new ItemStack(ModItems.dustRhodium, 2), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreTitanium, new ItemStack(ModItems.dustTitanium, 2), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreTungsten, new ItemStack(ModItems.dustTungsten, 2), new ItemStack(ModItems.dustManganese, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreSilicon, new ItemStack(ModItems.dustSilicon, 2), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreIridium, new ItemStack(ModItems.dustIridium, 2), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreUranium, new ItemStack(ModItems.dustUranium, 2), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.orePlutonium, new ItemStack(ModItems.dustPlutonium, 2), new ItemStack(ModItems.dustUranium, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreBlurite, new ItemStack(ModItems.dustBlurite, 2), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreMalagnite, new ItemStack(ModItems.dustMalagnite, 2), new ItemStack(ModItems.dustTitanium, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreRubium, new ItemStack(ModItems.dustRubium, 2), new ItemStack(ModItems.dustRhodium, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreAdamanite, new ItemStack(ModItems.dustAdamanite, 2), new ItemStack(ModItems.dustTungsten, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreLunar, new ItemStack(ModItems.dustLunar, 2), new ItemStack(ModItems.dustChromium, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreMithril, new ItemStack(ModItems.dustMithril, 2), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe(ModBlocks.oreRunite, new ItemStack(ModItems.dustRunite, 2), new ItemStack(ModItems.dustMalagnite, 1), 10);
		
		Register.registerPulverizerRecipe(ModBlocks.oreVoidium, new ItemStack(ModItems.dustVoidium, 2), 3000, 300);
		
		Register.registerPulverizerRecipe(ModBlocks.oreVoidiumBedrock, new ItemStack(ModItems.dustVoidium, 2), 24000, 2400);
		
		Register.registerPulverizerRecipe(ModBlocks.oreFyrestone, new ItemStack(ModItems.dustFyrestone, 2), 1000, 100);
		Register.registerPulverizerRecipe(ModBlocks.oreTrytementium, new ItemStack(ModItems.dustTrytementium, 2), 1000, 100);
		
		Register.registerPulverizerRecipe(Blocks.quartz_ore, new ItemStack(ModItems.dustNetherQuartz, 2), 1000, 100);
		
		Register.registerPulverizerRecipe(ModBlocks.oreCrymeretye, new ItemStack(ModItems.dustCrymeretye, 2), new ItemStack(ModItems.dustJonjronyphyll, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe(ModBlocks.oreGraeconthylynium, new ItemStack(ModItems.dustGraeconthylynium, 2), new ItemStack(ModItems.dustSchulbradethenairdivite, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe(ModBlocks.oreJonjronyphyll, new ItemStack(ModItems.dustJonjronyphyll, 2), new ItemStack(ModItems.dustGraeconthylynium, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe(ModBlocks.oreKraktachnar, new ItemStack(ModItems.dustKraktachnar, 2), new ItemStack(ModItems.dustXaldriodythidyte, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe(ModBlocks.oreMuktaphlyte, new ItemStack(ModItems.dustMuktaphlyte, 2), new ItemStack(ModItems.dustKraktachnar, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe(ModBlocks.oreSchulbradethenairdivite, new ItemStack(ModItems.dustSchulbradethenairdivite, 2), new ItemStack(ModItems.dustMuktaphlyte, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe(ModBlocks.oreXaldriodythidyte, new ItemStack(ModItems.dustXaldriodythidyte, 2), new ItemStack(ModItems.dustCrymeretye, 1), 10, 2400, 240);
		
		Register.registerPulverizerRecipe(ModBlocks.oreAmazonite, new ItemStack(ModItems.dustAmazonite, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreAmethyst, new ItemStack(ModItems.dustAmethyst, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreAquamarine, new ItemStack(ModItems.dustAquamarine, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreCarnelian, new ItemStack(ModItems.dustCarnelian, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreCitrine, new ItemStack(ModItems.dustCitrine, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreGarnet, new ItemStack(ModItems.dustGarnet, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreJade, new ItemStack(ModItems.dustJade, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreKunzite, new ItemStack(ModItems.dustKunzite, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreOnyx, new ItemStack(ModItems.dustOnyx, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreOpal, new ItemStack(ModItems.dustOpal, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreQuartz, new ItemStack(ModItems.dustQuartz, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreRuby, new ItemStack(ModItems.dustRuby, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreSapphire, new ItemStack(ModItems.dustSapphire, 2));
		Register.registerPulverizerRecipe(ModBlocks.oreTopaz, new ItemStack(ModItems.dustTopaz, 2));
		
		Register.registerPulverizerRecipe(Blocks.diamond_ore, new ItemStack(ModItems.dustDiamond, 2));
		Register.registerPulverizerRecipe(Blocks.emerald_ore, new ItemStack(ModItems.dustEmerald, 2));
		
		Register.registerPulverizerRecipe(ModItems.clusterIron, new ItemStack(ModItems.dustIron, 3), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterGold, new ItemStack(ModItems.dustGold, 3), new ItemStack(ModItems.dustSilver, 1), 10);
		
		Register.registerPulverizerRecipe(ModItems.clusterRedstone, new ItemStack(Items.redstone, 12), new ItemStack(ModItems.dustCopper, 1), 3);
		Register.registerPulverizerRecipe(ModItems.clusterLapis, new ItemStack(ModItems.dustLapis, 12), new ItemStack(ModItems.dustSilicon, 1), 4);
		
		Register.registerPulverizerRecipe(ModItems.clusterCopper, new ItemStack(ModItems.dustCopper, 3), new ItemStack(ModItems.dustGold, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterTin, new ItemStack(ModItems.dustTin, 3), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterSilver, new ItemStack(ModItems.dustSilver, 3), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterLead, new ItemStack(ModItems.dustLead, 3), new ItemStack(ModItems.dustTin, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterNickel, new ItemStack(ModItems.dustNickel, 3), new ItemStack(ModItems.dustCobalt, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterAluminium, new ItemStack(ModItems.dustAluminium, 3), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterPlatinum, new ItemStack(ModItems.dustPlatinum, 3), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterCobalt, new ItemStack(ModItems.dustCobalt, 3), new ItemStack(ModItems.dustPlatinum, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterChromium, new ItemStack(ModItems.dustChromium, 3), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterZinc, new ItemStack(ModItems.dustZinc, 3), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterManganese, new ItemStack(ModItems.dustManganese, 3), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterRhodium, new ItemStack(ModItems.dustRhodium, 3), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterTitanium, new ItemStack(ModItems.dustTitanium, 3), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterTungsten, new ItemStack(ModItems.dustTungsten, 3), new ItemStack(ModItems.dustManganese, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterSilicon, new ItemStack(ModItems.dustSilicon, 3), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterIridium, new ItemStack(ModItems.dustIridium, 3), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterUranium, new ItemStack(ModItems.dustUranium, 3), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterPlutonium, new ItemStack(ModItems.dustPlutonium, 3), new ItemStack(ModItems.dustUranium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterBlurite, new ItemStack(ModItems.dustBlurite, 3), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterMalagnite, new ItemStack(ModItems.dustMalagnite, 3), new ItemStack(ModItems.dustTitanium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterRubium, new ItemStack(ModItems.dustRubium, 3), new ItemStack(ModItems.dustRhodium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterAdamanite, new ItemStack(ModItems.dustAdamanite, 3), new ItemStack(ModItems.dustTungsten, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterLunar, new ItemStack(ModItems.dustLunar, 3), new ItemStack(ModItems.dustChromium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterMithril, new ItemStack(ModItems.dustMithril, 3), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterRunite, new ItemStack(ModItems.dustRunite, 3), new ItemStack(ModItems.dustMalagnite, 1), 10);
		
		Register.registerPulverizerRecipe(ModItems.clusterVoidium, new ItemStack(ModItems.dustVoidium, 3));
		
		Register.registerPulverizerRecipe(ModItems.clusterFyrestone, new ItemStack(ModItems.dustFyrestone, 3));
		Register.registerPulverizerRecipe(ModItems.clusterTrytementium, new ItemStack(ModItems.dustTrytementium, 3));
		
		Register.registerPulverizerRecipe(ModItems.clusterNetherQuartz, new ItemStack(ModItems.dustNetherQuartz, 3));
		
		Register.registerPulverizerRecipe(ModItems.clusterCrymeretye, new ItemStack(ModItems.dustCrymeretye, 3), new ItemStack(ModItems.dustJonjronyphyll, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterGraeconthylynium, new ItemStack(ModItems.dustGraeconthylynium, 3), new ItemStack(ModItems.dustSchulbradethenairdivite, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterJonjronyphyll, new ItemStack(ModItems.dustJonjronyphyll, 3), new ItemStack(ModItems.dustGraeconthylynium, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterKraktachnar, new ItemStack(ModItems.dustKraktachnar, 3), new ItemStack(ModItems.dustXaldriodythidyte, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterMuktaphlyte, new ItemStack(ModItems.dustMuktaphlyte, 3), new ItemStack(ModItems.dustKraktachnar, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterSchulbradethenairdivite, new ItemStack(ModItems.dustSchulbradethenairdivite, 3), new ItemStack(ModItems.dustMuktaphlyte, 1), 10);
		Register.registerPulverizerRecipe(ModItems.clusterXaldriodythidyte, new ItemStack(ModItems.dustXaldriodythidyte, 3), new ItemStack(ModItems.dustCrymeretye, 1), 10);
		
		Register.registerPulverizerRecipe(ModItems.clusterAmazonite, new ItemStack(ModItems.dustAmazonite, 3));
		Register.registerPulverizerRecipe(ModItems.clusterAmethyst, new ItemStack(ModItems.dustAmethyst, 3));
		Register.registerPulverizerRecipe(ModItems.clusterAquamarine, new ItemStack(ModItems.dustAquamarine, 3));
		Register.registerPulverizerRecipe(ModItems.clusterCarnelian, new ItemStack(ModItems.dustCarnelian, 3));
		Register.registerPulverizerRecipe(ModItems.clusterCitrine, new ItemStack(ModItems.dustCitrine, 3));
		Register.registerPulverizerRecipe(ModItems.clusterGarnet, new ItemStack(ModItems.dustGarnet, 3));
		Register.registerPulverizerRecipe(ModItems.clusterJade, new ItemStack(ModItems.dustJade, 3));
		Register.registerPulverizerRecipe(ModItems.clusterKunzite, new ItemStack(ModItems.dustKunzite, 3));
		Register.registerPulverizerRecipe(ModItems.clusterOnyx, new ItemStack(ModItems.dustOnyx, 3));
		Register.registerPulverizerRecipe(ModItems.clusterOpal, new ItemStack(ModItems.dustOpal, 3));
		Register.registerPulverizerRecipe(ModItems.clusterQuartz, new ItemStack(ModItems.dustQuartz, 3));
		Register.registerPulverizerRecipe(ModItems.clusterRuby, new ItemStack(ModItems.dustRuby, 3));
		Register.registerPulverizerRecipe(ModItems.clusterSapphire, new ItemStack(ModItems.dustSapphire, 3));
		Register.registerPulverizerRecipe(ModItems.clusterTopaz, new ItemStack(ModItems.dustTopaz, 3));
		
		Register.registerPulverizerRecipe(ModItems.clusterDiamond, new ItemStack(ModItems.dustDiamond, 3));
		Register.registerPulverizerRecipe(ModItems.clusterEmerald, new ItemStack(ModItems.dustEmerald, 3));
		
		Register.registerPulverizerRecipe(Items.iron_ingot, new ItemStack(ModItems.dustIron, 1));
		Register.registerPulverizerRecipe(Items.gold_ingot, new ItemStack(ModItems.dustGold, 1));
		
		Register.registerPulverizerRecipe(new ItemStack(Items.dye, 1, 4), new ItemStack(ModItems.dustLapis, 12));
		
		Register.registerPulverizerRecipe(ModItems.ingotCopper, new ItemStack(ModItems.dustCopper, 1));
		Register.registerPulverizerRecipe(ModItems.ingotTin, new ItemStack(ModItems.dustTin, 1));
		Register.registerPulverizerRecipe(ModItems.ingotSilver, new ItemStack(ModItems.dustSilver, 1));
		Register.registerPulverizerRecipe(ModItems.ingotLead, new ItemStack(ModItems.dustLead, 1));
		Register.registerPulverizerRecipe(ModItems.ingotNickel, new ItemStack(ModItems.dustNickel, 1));
		Register.registerPulverizerRecipe(ModItems.ingotAluminium, new ItemStack(ModItems.dustAluminium, 1));
		Register.registerPulverizerRecipe(ModItems.ingotPlatinum, new ItemStack(ModItems.dustPlatinum, 1));
		Register.registerPulverizerRecipe(ModItems.ingotCobalt, new ItemStack(ModItems.dustCobalt, 1));
		Register.registerPulverizerRecipe(ModItems.ingotChromium, new ItemStack(ModItems.dustChromium, 1));
		Register.registerPulverizerRecipe(ModItems.ingotZinc, new ItemStack(ModItems.dustZinc, 1));
		Register.registerPulverizerRecipe(ModItems.ingotManganese, new ItemStack(ModItems.dustManganese, 1));
		Register.registerPulverizerRecipe(ModItems.ingotRhodium, new ItemStack(ModItems.dustRhodium, 1));
		Register.registerPulverizerRecipe(ModItems.ingotTitanium, new ItemStack(ModItems.dustTitanium, 1));
		Register.registerPulverizerRecipe(ModItems.ingotTungsten, new ItemStack(ModItems.dustTungsten, 1));
		Register.registerPulverizerRecipe(ModItems.ingotSilicon, new ItemStack(ModItems.dustSilicon, 1));
		Register.registerPulverizerRecipe(ModItems.iridium, new ItemStack(ModItems.dustIridium, 1));
		Register.registerPulverizerRecipe(ModItems.uranium, new ItemStack(ModItems.dustUranium, 1));
		Register.registerPulverizerRecipe(ModItems.plutonium, new ItemStack(ModItems.dustPlutonium, 1));
		Register.registerPulverizerRecipe(ModItems.ingotBlurite, new ItemStack(ModItems.dustBlurite, 1));
		Register.registerPulverizerRecipe(ModItems.ingotMalagnite, new ItemStack(ModItems.dustMalagnite, 1));
		Register.registerPulverizerRecipe(ModItems.ingotRubium, new ItemStack(ModItems.dustRubium, 1));
		Register.registerPulverizerRecipe(ModItems.ingotAdamanite, new ItemStack(ModItems.dustAdamanite, 1));
		Register.registerPulverizerRecipe(ModItems.ingotLunar, new ItemStack(ModItems.dustLunar, 1));
		Register.registerPulverizerRecipe(ModItems.ingotMithril, new ItemStack(ModItems.dustMithril, 1));
		Register.registerPulverizerRecipe(ModItems.ingotRunite, new ItemStack(ModItems.dustRunite, 1));
		
		Register.registerPulverizerRecipe(ModItems.voidium, new ItemStack(ModItems.dustVoidium, 1));
		
		Register.registerPulverizerRecipe(ModItems.fyrestone, new ItemStack(ModItems.dustFyrestone, 1));
		Register.registerPulverizerRecipe(ModItems.trytementium, new ItemStack(ModItems.dustTrytementium, 1));
		
		Register.registerPulverizerRecipe(Items.quartz, new ItemStack(ModItems.dustNetherQuartz, 1));
		
		Register.registerPulverizerRecipe(ModItems.crymeretye, new ItemStack(ModItems.dustCrymeretye, 1));
		Register.registerPulverizerRecipe(ModItems.graeconthylynium, new ItemStack(ModItems.dustGraeconthylynium, 1));
		Register.registerPulverizerRecipe(ModItems.jonjronyphyll, new ItemStack(ModItems.dustJonjronyphyll, 1));
		Register.registerPulverizerRecipe(ModItems.kraktachnar, new ItemStack(ModItems.dustKraktachnar, 1));
		Register.registerPulverizerRecipe(ModItems.muktaphlyte, new ItemStack(ModItems.dustMuktaphlyte, 1));
		Register.registerPulverizerRecipe(ModItems.schulbradethenairdivite, new ItemStack(ModItems.dustSchulbradethenairdivite, 1));
		Register.registerPulverizerRecipe(ModItems.xaldriodythidyte, new ItemStack(ModItems.dustXaldriodythidyte, 1));
		
		Register.registerPulverizerRecipe(ModItems.gemAmazonite, new ItemStack(ModItems.dustAmazonite, 1));
		Register.registerPulverizerRecipe(ModItems.gemAmethyst, new ItemStack(ModItems.dustAmethyst, 1));
		Register.registerPulverizerRecipe(ModItems.gemAquamarine, new ItemStack(ModItems.dustAquamarine, 1));
		Register.registerPulverizerRecipe(ModItems.gemCarnelian, new ItemStack(ModItems.dustCarnelian, 1));
		Register.registerPulverizerRecipe(ModItems.gemCitrine, new ItemStack(ModItems.dustCitrine, 1));
		Register.registerPulverizerRecipe(ModItems.gemGarnet, new ItemStack(ModItems.dustGarnet, 1));
		Register.registerPulverizerRecipe(ModItems.gemJade, new ItemStack(ModItems.dustJade, 1));
		Register.registerPulverizerRecipe(ModItems.gemKunzite, new ItemStack(ModItems.dustKunzite, 1));
		Register.registerPulverizerRecipe(ModItems.gemOnyx, new ItemStack(ModItems.dustOnyx, 1));
		Register.registerPulverizerRecipe(ModItems.gemOpal, new ItemStack(ModItems.dustOpal, 1));
		Register.registerPulverizerRecipe(ModItems.gemQuartz, new ItemStack(ModItems.dustQuartz, 1));
		Register.registerPulverizerRecipe(ModItems.gemRuby, new ItemStack(ModItems.dustRuby, 1));
		Register.registerPulverizerRecipe(ModItems.gemSapphire, new ItemStack(ModItems.dustSapphire, 1));
		Register.registerPulverizerRecipe(ModItems.gemTopaz, new ItemStack(ModItems.dustTopaz, 1));
		
		Register.registerPulverizerRecipe(Items.diamond, new ItemStack(ModItems.dustDiamond, 1));
		Register.registerPulverizerRecipe(Items.emerald, new ItemStack(ModItems.dustEmerald, 1));
		
		Register.registerPulverizerRecipe(Items.bread, new ItemStack(ModItems.flour, 1));
		Register.registerPulverizerRecipe(Items.wheat, new ItemStack(ModItems.flour, 2));
		
		Register.registerPulverizerRecipe(Items.bone, new ItemStack(Items.dye, 6, 15));
		Register.registerPulverizerRecipe(new ItemStack(ModItems.fossil, 1, 0), new ItemStack(Items.dye, 24, 15));
		Register.registerPulverizerRecipe(new ItemStack(ModItems.fossil, 1, 1), new ItemStack(Items.dye, 16, 15));
		Register.registerPulverizerRecipe(new ItemStack(ModItems.fossil, 1, 2), new ItemStack(Items.dye, 16, 15));
		Register.registerPulverizerRecipe(new ItemStack(ModItems.fossil, 1, 3), new ItemStack(Items.dye, 48, 15));
		Register.registerPulverizerRecipe(new ItemStack(ModItems.fossil, 1, 4), new ItemStack(Items.dye, 48, 15));
		Register.registerPulverizerRecipe(new ItemStack(ModItems.fossil, 1, 5), new ItemStack(Items.dye, 16, 15));
		
		Register.registerPulverizerRecipe(Items.blaze_rod, new ItemStack(Items.blaze_powder, 4));
		
		Register.registerPulverizerRecipe(Blocks.cobblestone, new ItemStack(Blocks.gravel, 1), new ItemStack(Blocks.sand), 15);
		Register.registerPulverizerRecipe(Blocks.sandstone, new ItemStack(Blocks.sand, 3));
		Register.registerPulverizerRecipe(Blocks.glowstone, new ItemStack(Items.glowstone_dust, 4));
		Register.registerPulverizerRecipe(Items.reeds, new ItemStack(Items.sugar, 2));
		Register.registerPulverizerRecipe(Blocks.wool, new ItemStack(Items.string, 4));
		Register.registerPulverizerRecipe(Blocks.stone, new ItemStack(Blocks.cobblestone));
		Register.registerPulverizerRecipe(ModBlocks.ustherite, new ItemStack(ModBlocks.cobbledUstherite));
	}
}
