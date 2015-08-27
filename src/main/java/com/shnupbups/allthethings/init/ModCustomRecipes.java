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
	
		Register.registerPulverizerRecipe("oreIron", new ItemStack(ModItems.dustIron, 2), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe("oreGold", new ItemStack(ModItems.dustGold, 2), new ItemStack(ModItems.dustSilver, 1), 10);
		
		Register.registerPulverizerRecipe("oreRedstone", new ItemStack(Items.redstone, 12), new ItemStack(ModItems.dustCopper, 1), 2);
		Register.registerPulverizerRecipe("oreLapis", new ItemStack(ModItems.dustLapis, 12), new ItemStack(ModItems.dustSilicon, 1), 4);
		Register.registerPulverizerRecipe("oreCoal", new ItemStack(ModItems.dustCoal, 2), new ItemStack(ModItems.dustDiamond, 1), 1);
		
		Register.registerPulverizerRecipe("oreCopper", new ItemStack(ModItems.dustCopper, 2), new ItemStack(ModItems.dustGold, 1), 10);
		Register.registerPulverizerRecipe("oreTin", new ItemStack(ModItems.dustTin, 2), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe("oreSilver", new ItemStack(ModItems.dustSilver, 2), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe("oreLead", new ItemStack(ModItems.dustLead, 2), new ItemStack(ModItems.dustTin, 1), 10);
		Register.registerPulverizerRecipe("oreNickel", new ItemStack(ModItems.dustNickel, 2), new ItemStack(ModItems.dustCobalt, 1), 10);
		Register.registerPulverizerRecipe("oreAluminum", new ItemStack(ModItems.dustAluminium, 2), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe("orePlatinum", new ItemStack(ModItems.dustPlatinum, 2), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe("oreCobalt", new ItemStack(ModItems.dustCobalt, 2), new ItemStack(ModItems.dustPlatinum, 1), 10);
		Register.registerPulverizerRecipe("oreChromium", new ItemStack(ModItems.dustChromium, 2), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe("oreZinc", new ItemStack(ModItems.dustZinc, 2), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe("oreManganese", new ItemStack(ModItems.dustManganese, 2), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe("oreRhodium", new ItemStack(ModItems.dustRhodium, 2), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe("oreTitanium", new ItemStack(ModItems.dustTitanium, 2), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe("oreTungsten", new ItemStack(ModItems.dustTungsten, 2), new ItemStack(ModItems.dustManganese, 1), 10);
		Register.registerPulverizerRecipe("oreSilicon", new ItemStack(ModItems.dustSilicon, 2), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe("oreIridium", new ItemStack(ModItems.dustIridium, 2), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe("oreUranium", new ItemStack(ModItems.dustUranium, 2), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe("orePlutonium", new ItemStack(ModItems.dustPlutonium, 2), new ItemStack(ModItems.dustUranium, 1), 10);
		Register.registerPulverizerRecipe("oreBlurite", new ItemStack(ModItems.dustBlurite, 2), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe("oreMalagnite", new ItemStack(ModItems.dustMalagnite, 2), new ItemStack(ModItems.dustTitanium, 1), 10);
		Register.registerPulverizerRecipe("oreRubium", new ItemStack(ModItems.dustRubium, 2), new ItemStack(ModItems.dustRhodium, 1), 10);
		Register.registerPulverizerRecipe("oreAdamanite", new ItemStack(ModItems.dustAdamanite, 2), new ItemStack(ModItems.dustTungsten, 1), 10);
		Register.registerPulverizerRecipe("oreLunar", new ItemStack(ModItems.dustLunar, 2), new ItemStack(ModItems.dustChromium, 1), 10);
		Register.registerPulverizerRecipe("oreMithril", new ItemStack(ModItems.dustMithril, 2), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe("oreRunite", new ItemStack(ModItems.dustRunite, 2), new ItemStack(ModItems.dustMalagnite, 1), 10);
		
		Register.registerPulverizerRecipe("oreVoidiumRegular", new ItemStack(ModItems.dustVoidium, 2), 3000, 300);
		
		Register.registerPulverizerRecipe("oreVoidiumBedrock", new ItemStack(ModItems.dustVoidium, 2), 24000, 2400);
		
		Register.registerPulverizerRecipe("oreFyrestone", new ItemStack(ModItems.dustFyrestone, 2), 1000, 100);
		Register.registerPulverizerRecipe("oreTrytementium", new ItemStack(ModItems.dustTrytementium, 2), 1000, 100);
		
		Register.registerPulverizerRecipe("oreQuartz", new ItemStack(ModItems.dustNetherQuartz, 2), 1000, 100);
		
		Register.registerPulverizerRecipe("oreCrymeretye", new ItemStack(ModItems.dustCrymeretye, 2), new ItemStack(ModItems.dustJonjronyphyll, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe("oreGraeconthylynium", new ItemStack(ModItems.dustGraeconthylynium, 2), new ItemStack(ModItems.dustSchulbradethenairdivite, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe("oreJonjronyphyll", new ItemStack(ModItems.dustJonjronyphyll, 2), new ItemStack(ModItems.dustGraeconthylynium, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe("oreKraktachnar", new ItemStack(ModItems.dustKraktachnar, 2), new ItemStack(ModItems.dustXaldriodythidyte, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe("oreMuktaphlyte", new ItemStack(ModItems.dustMuktaphlyte, 2), new ItemStack(ModItems.dustKraktachnar, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe("oreSchulbradethenairdivite", new ItemStack(ModItems.dustSchulbradethenairdivite, 2), new ItemStack(ModItems.dustMuktaphlyte, 1), 10, 2400, 240);
		Register.registerPulverizerRecipe("oreXaldriodythidyte", new ItemStack(ModItems.dustXaldriodythidyte, 2), new ItemStack(ModItems.dustCrymeretye, 1), 10, 2400, 240);
		
		Register.registerPulverizerRecipe("oreAmazonite", new ItemStack(ModItems.dustAmazonite, 2));
		Register.registerPulverizerRecipe("oreAmethyst", new ItemStack(ModItems.dustAmethyst, 2));
		Register.registerPulverizerRecipe("oreAquamarine", new ItemStack(ModItems.dustAquamarine, 2));
		Register.registerPulverizerRecipe("oreCarnelian", new ItemStack(ModItems.dustCarnelian, 2));
		Register.registerPulverizerRecipe("oreCitrine", new ItemStack(ModItems.dustCitrine, 2));
		Register.registerPulverizerRecipe("oreGarnet", new ItemStack(ModItems.dustGarnet, 2));
		Register.registerPulverizerRecipe("oreJade", new ItemStack(ModItems.dustJade, 2));
		Register.registerPulverizerRecipe("oreKunzite", new ItemStack(ModItems.dustKunzite, 2));
		Register.registerPulverizerRecipe("oreOnyx", new ItemStack(ModItems.dustOnyx, 2));
		Register.registerPulverizerRecipe("oreOpal", new ItemStack(ModItems.dustOpal, 2));
		Register.registerPulverizerRecipe("oreQuartzRegular", new ItemStack(ModItems.dustQuartz, 2));
		Register.registerPulverizerRecipe("oreRuby", new ItemStack(ModItems.dustRuby, 2));
		Register.registerPulverizerRecipe("oreSapphire", new ItemStack(ModItems.dustSapphire, 2));
		Register.registerPulverizerRecipe("oreTopaz", new ItemStack(ModItems.dustTopaz, 2));
		
		Register.registerPulverizerRecipe("oreDiamomnd", new ItemStack(ModItems.dustDiamond, 2));
		Register.registerPulverizerRecipe("oreEmerald", new ItemStack(ModItems.dustEmerald, 2));
		
		Register.registerPulverizerRecipe("clusterIron", new ItemStack(ModItems.dustIron, 3), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe("clusterGold", new ItemStack(ModItems.dustGold, 3), new ItemStack(ModItems.dustSilver, 1), 10);
		
		Register.registerPulverizerRecipe("clusterRedstone", new ItemStack(Items.redstone, 12), new ItemStack(ModItems.dustCopper, 1), 3);
		Register.registerPulverizerRecipe("clusterLapis", new ItemStack(ModItems.dustLapis, 12), new ItemStack(ModItems.dustSilicon, 1), 4);
		Register.registerPulverizerRecipe("clusterCoal", new ItemStack(ModItems.dustCoal, 3), new ItemStack(ModItems.dustDiamond, 1), 1);
		
		Register.registerPulverizerRecipe("clusterCopper", new ItemStack(ModItems.dustCopper, 3), new ItemStack(ModItems.dustGold, 1), 10);
		Register.registerPulverizerRecipe("clusterTin", new ItemStack(ModItems.dustTin, 3), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe("clusterSilver", new ItemStack(ModItems.dustSilver, 3), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe("clusterLead", new ItemStack(ModItems.dustLead, 3), new ItemStack(ModItems.dustTin, 1), 10);
		Register.registerPulverizerRecipe("clusterNickel", new ItemStack(ModItems.dustNickel, 3), new ItemStack(ModItems.dustCobalt, 1), 10);
		Register.registerPulverizerRecipe("clusterAluminium", new ItemStack(ModItems.dustAluminium, 3), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe("clusterPlatinum", new ItemStack(ModItems.dustPlatinum, 3), new ItemStack(ModItems.dustCopper, 1), 10);
		Register.registerPulverizerRecipe("clusterCobalt", new ItemStack(ModItems.dustCobalt, 3), new ItemStack(ModItems.dustPlatinum, 1), 10);
		Register.registerPulverizerRecipe("clusterChromium", new ItemStack(ModItems.dustChromium, 3), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe("clusterZinc", new ItemStack(ModItems.dustZinc, 3), new ItemStack(ModItems.dustLead, 1), 10);
		Register.registerPulverizerRecipe("clusterManganese", new ItemStack(ModItems.dustManganese, 3), new ItemStack(ModItems.dustAluminium, 1), 10);
		Register.registerPulverizerRecipe("clusterRhodium", new ItemStack(ModItems.dustRhodium, 3), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe("clusterTitanium", new ItemStack(ModItems.dustTitanium, 3), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe("clusterTungsten", new ItemStack(ModItems.dustTungsten, 3), new ItemStack(ModItems.dustManganese, 1), 10);
		Register.registerPulverizerRecipe("clusterSilicon", new ItemStack(ModItems.dustSilicon, 3), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe("clusterIridium", new ItemStack(ModItems.dustIridium, 3), new ItemStack(ModItems.dustNickel, 1), 10);
		Register.registerPulverizerRecipe("clusterUranium", new ItemStack(ModItems.dustUranium, 3), new ItemStack(ModItems.dustIron, 1), 10);
		Register.registerPulverizerRecipe("clusterPlutonium", new ItemStack(ModItems.dustPlutonium, 3), new ItemStack(ModItems.dustUranium, 1), 10);
		Register.registerPulverizerRecipe("clusterBlurite", new ItemStack(ModItems.dustBlurite, 3), new ItemStack(ModItems.dustZinc, 1), 10);
		Register.registerPulverizerRecipe("clusterMalagnite", new ItemStack(ModItems.dustMalagnite, 3), new ItemStack(ModItems.dustTitanium, 1), 10);
		Register.registerPulverizerRecipe("clusterRubium", new ItemStack(ModItems.dustRubium, 3), new ItemStack(ModItems.dustRhodium, 1), 10);
		Register.registerPulverizerRecipe("clusterAdamanite", new ItemStack(ModItems.dustAdamanite, 3), new ItemStack(ModItems.dustTungsten, 1), 10);
		Register.registerPulverizerRecipe("clusterLunar", new ItemStack(ModItems.dustLunar, 3), new ItemStack(ModItems.dustChromium, 1), 10);
		Register.registerPulverizerRecipe("clusterMithril", new ItemStack(ModItems.dustMithril, 3), new ItemStack(ModItems.dustSilver, 1), 10);
		Register.registerPulverizerRecipe("clusterRunite", new ItemStack(ModItems.dustRunite, 3), new ItemStack(ModItems.dustMalagnite, 1), 10);
		
		Register.registerPulverizerRecipe("clusterVoidium", new ItemStack(ModItems.dustVoidium, 3));
		
		Register.registerPulverizerRecipe("clusterFyrestone", new ItemStack(ModItems.dustFyrestone, 3));
		Register.registerPulverizerRecipe("clusterTrytementium", new ItemStack(ModItems.dustTrytementium, 3));
		
		Register.registerPulverizerRecipe("clusterNetherQuartz", new ItemStack(ModItems.dustNetherQuartz, 3));
		
		Register.registerPulverizerRecipe("clusterCrymeretye", new ItemStack(ModItems.dustCrymeretye, 3), new ItemStack(ModItems.dustJonjronyphyll, 1), 10);
		Register.registerPulverizerRecipe("clusterGraeconthylynium", new ItemStack(ModItems.dustGraeconthylynium, 3), new ItemStack(ModItems.dustSchulbradethenairdivite, 1), 10);
		Register.registerPulverizerRecipe("clusterJonjronyphyll", new ItemStack(ModItems.dustJonjronyphyll, 3), new ItemStack(ModItems.dustGraeconthylynium, 1), 10);
		Register.registerPulverizerRecipe("clusterKraktachnar", new ItemStack(ModItems.dustKraktachnar, 3), new ItemStack(ModItems.dustXaldriodythidyte, 1), 10);
		Register.registerPulverizerRecipe("clusterMuktaphlyte", new ItemStack(ModItems.dustMuktaphlyte, 3), new ItemStack(ModItems.dustKraktachnar, 1), 10);
		Register.registerPulverizerRecipe("clusterSchulbradethenairdivite", new ItemStack(ModItems.dustSchulbradethenairdivite, 3), new ItemStack(ModItems.dustMuktaphlyte, 1), 10);
		Register.registerPulverizerRecipe("clusterXaldriodythidyte", new ItemStack(ModItems.dustXaldriodythidyte, 3), new ItemStack(ModItems.dustCrymeretye, 1), 10);
		
		Register.registerPulverizerRecipe("clusterAmazonite", new ItemStack(ModItems.dustAmazonite, 3));
		Register.registerPulverizerRecipe("clusterAmethyst", new ItemStack(ModItems.dustAmethyst, 3));
		Register.registerPulverizerRecipe("clusterAquamarine", new ItemStack(ModItems.dustAquamarine, 3));
		Register.registerPulverizerRecipe("clusterCarnelian", new ItemStack(ModItems.dustCarnelian, 3));
		Register.registerPulverizerRecipe("clusterCitrine", new ItemStack(ModItems.dustCitrine, 3));
		Register.registerPulverizerRecipe("clusterGarnet", new ItemStack(ModItems.dustGarnet, 3));
		Register.registerPulverizerRecipe("clusterJade", new ItemStack(ModItems.dustJade, 3));
		Register.registerPulverizerRecipe("clusterKunzite", new ItemStack(ModItems.dustKunzite, 3));
		Register.registerPulverizerRecipe("clusterOnyx", new ItemStack(ModItems.dustOnyx, 3));
		Register.registerPulverizerRecipe("clusterOpal", new ItemStack(ModItems.dustOpal, 3));
		Register.registerPulverizerRecipe("clusterQuartz", new ItemStack(ModItems.dustQuartz, 3));
		Register.registerPulverizerRecipe("clusterRuby", new ItemStack(ModItems.dustRuby, 3));
		Register.registerPulverizerRecipe("clusterSapphire", new ItemStack(ModItems.dustSapphire, 3));
		Register.registerPulverizerRecipe("clusterTopaz", new ItemStack(ModItems.dustTopaz, 3));
		
		Register.registerPulverizerRecipe("clusterDiamond", new ItemStack(ModItems.dustDiamond, 3));
		Register.registerPulverizerRecipe("clusterEmerald", new ItemStack(ModItems.dustEmerald, 3));
		
		Register.registerPulverizerRecipe("ingotIron", new ItemStack(ModItems.dustIron, 1));
		Register.registerPulverizerRecipe("ingotGold", new ItemStack(ModItems.dustGold, 1));
		
		Register.registerPulverizerRecipe("gemLapis", new ItemStack(ModItems.dustLapis, 1));
		Register.registerPulverizerRecipe("materialCoal", new ItemStack(ModItems.dustCoal, 1));
		
		Register.registerPulverizerRecipe("ingotCopper", new ItemStack(ModItems.dustCopper, 1));
		Register.registerPulverizerRecipe("ingotTin", new ItemStack(ModItems.dustTin, 1));
		Register.registerPulverizerRecipe("ingotSilver", new ItemStack(ModItems.dustSilver, 1));
		Register.registerPulverizerRecipe("ingotLead", new ItemStack(ModItems.dustLead, 1));
		Register.registerPulverizerRecipe("ingotNickel", new ItemStack(ModItems.dustNickel, 1));
		Register.registerPulverizerRecipe("ingotAluminium", new ItemStack(ModItems.dustAluminium, 1));
		Register.registerPulverizerRecipe("ingotPlatinum", new ItemStack(ModItems.dustPlatinum, 1));
		Register.registerPulverizerRecipe("ingotCobalt", new ItemStack(ModItems.dustCobalt, 1));
		Register.registerPulverizerRecipe("ingotChromium", new ItemStack(ModItems.dustChromium, 1));
		Register.registerPulverizerRecipe("ingotZinc", new ItemStack(ModItems.dustZinc, 1));
		Register.registerPulverizerRecipe("ingotManganese", new ItemStack(ModItems.dustManganese, 1));
		Register.registerPulverizerRecipe("ingotRhodium", new ItemStack(ModItems.dustRhodium, 1));
		Register.registerPulverizerRecipe("ingotTitanium", new ItemStack(ModItems.dustTitanium, 1));
		Register.registerPulverizerRecipe("ingotTungsten", new ItemStack(ModItems.dustTungsten, 1));
		Register.registerPulverizerRecipe("ingotSilicon", new ItemStack(ModItems.dustSilicon, 1));
		Register.registerPulverizerRecipe("ingotIridium", new ItemStack(ModItems.dustIridium, 1));
		Register.registerPulverizerRecipe("ingotUranium", new ItemStack(ModItems.dustUranium, 1));
		Register.registerPulverizerRecipe("ingotPlutonium", new ItemStack(ModItems.dustPlutonium, 1));
		Register.registerPulverizerRecipe("ingotBlurite", new ItemStack(ModItems.dustBlurite, 1));
		Register.registerPulverizerRecipe("ingotMalagnite", new ItemStack(ModItems.dustMalagnite, 1));
		Register.registerPulverizerRecipe("ingotRubium", new ItemStack(ModItems.dustRubium, 1));
		Register.registerPulverizerRecipe("ingotAdamanite", new ItemStack(ModItems.dustAdamanite, 1));
		Register.registerPulverizerRecipe("ingotLunar", new ItemStack(ModItems.dustLunar, 1));
		Register.registerPulverizerRecipe("ingotMithril", new ItemStack(ModItems.dustMithril, 1));
		Register.registerPulverizerRecipe("ingotRunite", new ItemStack(ModItems.dustRunite, 1));
		
		Register.registerPulverizerRecipe("materialVoidium", new ItemStack(ModItems.dustVoidium, 1));
		
		Register.registerPulverizerRecipe("materialFyrestone", new ItemStack(ModItems.dustFyrestone, 1));
		Register.registerPulverizerRecipe("materialTrytementium", new ItemStack(ModItems.dustTrytementium, 1));
		
		Register.registerPulverizerRecipe("gemNetherQuartz", new ItemStack(ModItems.dustNetherQuartz, 1));
		
		Register.registerPulverizerRecipe("materialCrymeretye", new ItemStack(ModItems.dustCrymeretye, 1));
		Register.registerPulverizerRecipe("materialGraeconthylynium", new ItemStack(ModItems.dustGraeconthylynium, 1));
		Register.registerPulverizerRecipe("materialJonjronyphyll", new ItemStack(ModItems.dustJonjronyphyll, 1));
		Register.registerPulverizerRecipe("materialKraktachnar", new ItemStack(ModItems.dustKraktachnar, 1));
		Register.registerPulverizerRecipe("materialMuktaphlyte", new ItemStack(ModItems.dustMuktaphlyte, 1));
		Register.registerPulverizerRecipe("materialSchulbradethenairdivite", new ItemStack(ModItems.dustSchulbradethenairdivite, 1));
		Register.registerPulverizerRecipe("materialXaldriodythidyte", new ItemStack(ModItems.dustXaldriodythidyte, 1));
		
		Register.registerPulverizerRecipe("gemAmazonite", new ItemStack(ModItems.dustAmazonite, 1));
		Register.registerPulverizerRecipe("gemAmethyst", new ItemStack(ModItems.dustAmethyst, 1));
		Register.registerPulverizerRecipe("gemAquamarine", new ItemStack(ModItems.dustAquamarine, 1));
		Register.registerPulverizerRecipe("gemCarnelian", new ItemStack(ModItems.dustCarnelian, 1));
		Register.registerPulverizerRecipe("gemCitrine", new ItemStack(ModItems.dustCitrine, 1));
		Register.registerPulverizerRecipe("gemGarnet", new ItemStack(ModItems.dustGarnet, 1));
		Register.registerPulverizerRecipe("gemJade", new ItemStack(ModItems.dustJade, 1));
		Register.registerPulverizerRecipe("gemKunzite", new ItemStack(ModItems.dustKunzite, 1));
		Register.registerPulverizerRecipe("gemOnyx", new ItemStack(ModItems.dustOnyx, 1));
		Register.registerPulverizerRecipe("gemOpal", new ItemStack(ModItems.dustOpal, 1));
		Register.registerPulverizerRecipe("gemQuartzRegular", new ItemStack(ModItems.dustQuartz, 1));
		Register.registerPulverizerRecipe("gemRuby", new ItemStack(ModItems.dustRuby, 1));
		Register.registerPulverizerRecipe("gemSapphire", new ItemStack(ModItems.dustSapphire, 1));
		Register.registerPulverizerRecipe("gemTopaz", new ItemStack(ModItems.dustTopaz, 1));
		
		Register.registerPulverizerRecipe("gemDiamond", new ItemStack(ModItems.dustDiamond, 1));
		Register.registerPulverizerRecipe("gemEmerald", new ItemStack(ModItems.dustEmerald, 1));
		
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
		Register.registerPulverizerRecipe(Blocks.gravel, new ItemStack(Items.flint, 2), new ItemStack(Blocks.sand), 5);
		Register.registerPulverizerRecipe(Blocks.sandstone, new ItemStack(Blocks.sand, 4));
		Register.registerPulverizerRecipe(Blocks.glowstone, new ItemStack(Items.glowstone_dust, 4));
		Register.registerPulverizerRecipe(Items.reeds, new ItemStack(Items.sugar, 2));
		Register.registerPulverizerRecipe(Blocks.wool, new ItemStack(Items.string, 4));
		Register.registerPulverizerRecipe(Blocks.stone, new ItemStack(Blocks.cobblestone));
		Register.registerPulverizerRecipe(ModBlocks.ustherite, new ItemStack(ModBlocks.cobbledUstherite));
	}
}
