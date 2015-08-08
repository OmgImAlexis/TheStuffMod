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
	}
}
