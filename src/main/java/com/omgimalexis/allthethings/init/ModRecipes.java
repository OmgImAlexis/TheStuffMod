package com.omgimalexis.allthethings.init;

import java.util.Iterator;
import java.util.List;

import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.utility.LogHelper;
import com.omgimalexis.allthethings.utility.Register;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		// Fossilized Resin to Amber
		GameRegistry.addRecipe(new ItemStack(ModItems.gemAmber), " r ", "rrr", " r ", 'r', ModItems.fossilResin);
		// Rings and Bands
		GameRegistry.addRecipe(new ItemStack(ModItems.goldBand,9), "ggg", 'g', Items.gold_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.silverBand,9), "ggg", 'g', ModItems.ingotSilver);
		GameRegistry.addRecipe(new ItemStack(ModItems.copperBand,9), "ggg", 'g', ModItems.ingotCopper);
		// Tools (& Swords, but I count them as tools anyway...)
		GameRegistry.addRecipe(new ItemStack(ModTools.onyxPickaxe), "ooo", " s", " s", 'o', ModItems.gemOnyx, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.onyxAxe), "oo", "os", " s", 'o', ModItems.gemOnyx, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.onyxSword), "o", "o", "s", 'o', ModItems.gemOnyx, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.onyxShovel), "o", "s", "s", 'o', ModItems.gemOnyx, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.onyxHoe), "oo", " s", " s", 'o', ModItems.gemOnyx, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.rubyPickaxe), "rrr", " s ", " s ", 'r', ModItems.gemRuby, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.rubyAxe), "rr", "rs", " s", 'r', ModItems.gemRuby, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.rubySword), "r", "r", "s", 'r', ModItems.gemRuby, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.rubyShovel), "r", "s", "s", 'r', ModItems.gemRuby, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModTools.rubyHoe), "rr", " s", " s", 'r', ModItems.gemRuby, 's', Items.stick);
		// Misc
		GameRegistry.addRecipe(new ItemStack(ModItems.paintbrush), "  w", " i ", "s  ", 's', Items.stick, 'i', Items.iron_ingot, 'w', Items.wheat);
		GameRegistry.addRecipe(new ItemStack(ModItems.paintbrush), "w  ", " i ", "  s", 's', Items.stick, 'i', Items.iron_ingot, 'w', Items.wheat);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 0), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 1), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 2), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 3), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 4), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 5), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 6), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 7), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 8), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 9), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 10), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 11), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 12), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 13), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 14), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paintbrushColoured, 1, 15), new ItemStack(ModItems.paintbrush, 1, 0), new ItemStack(Items.dye, 1, 0));
		// Bricks
		Register.registerPaintingRecipes(Blocks.brick_block, ModBlocks.brickColoured);
		Register.registerPaintingRecipes("plankWood", ModBlocks.woodColoured);
		// Planks
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cherryPlanks, 4), ModBlocks.cherryWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rubberPlanks, 4), ModBlocks.rubberWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.lemonPlanks, 4), ModBlocks.lemonWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bananaPlanks, 4), ModBlocks.bananaWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.olivePlanks, 4), ModBlocks.oliveWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.maplePlanks, 4), ModBlocks.mapleWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ebonyPlanks, 4), ModBlocks.ebonyWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pearPlanks, 4), ModBlocks.pearWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mangoPlanks, 4), ModBlocks.mangoWood);
		// Machine Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlock), "pip", "ibi", "pip", 'p', ModItems.plateIron, 'i', Items.iron_ingot, 'b', ModBlocks.compressedIronBlock);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockSteel), "pip", "ibi", "pip", 'p', ModItems.plateSteel, 'i', ModItems.ingotSteel, 'b', ModBlocks.machineBlock);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockStrengthened), "pip", "ibi", "pip", 'p', ModItems.plateObsidian, 'i', ModBlocks.blockPureObsidian, 'b', ModBlocks.machineBlockSteel);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockReinforced), "pip", "ibi", "pip", 'p', ModItems.plateObsidian, 'i', ModBlocks.blockEnrichedObsidian, 'b', ModBlocks.machineBlockStrengthened);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockImbued), "pip", "ibi", "pip", 'p', ModItems.shardTrytementium, 'i', ModItems.shardUnobtanium, 'b', ModBlocks.machineBlockReinforced);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockFluxed), "pip", "ibi", "pip", 'p', ModItems.ylvoltium, 'i', ModItems.ylvoltiumFluxed, 'b', ModBlocks.machineBlockImbued);
		// Stairs & Slabs
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cherryStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cherrySlab, 6), "   ", "   ", "www", 'w', ModBlocks.cherryPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rubberStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.rubberPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rubberSlab, 6), "   ", "   ", "www", 'w', ModBlocks.rubberPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lemonStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.lemonPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lemonSlab, 6), "   ", "   ", "www", 'w', ModBlocks.lemonPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.bananaStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.bananaPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.bananaSlab, 6), "   ", "   ", "www", 'w', ModBlocks.bananaPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.oliveStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.olivePlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.oliveSlab, 6), "   ", "   ", "www", 'w', ModBlocks.olivePlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mapleStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.maplePlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mapleSlab, 6), "   ", "   ", "www", 'w', ModBlocks.maplePlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ebonyStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.ebonyPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ebonySlab, 6), "   ", "   ", "www", 'w', ModBlocks.ebonyPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pearStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.pearPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pearSlab, 6), "   ", "   ", "www", 'w', ModBlocks.pearPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mangoStairs, 4), "w  ", "ww ", "www", 'w', ModBlocks.mangoPlanks);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mangoSlab, 6), "   ", "   ", "www", 'w', ModBlocks.mangoPlanks);
		// Smelting Ores
		GameRegistry.addSmelting(ModBlocks.oreOnyx, new ItemStack(ModItems.gemOnyx), 5);
		GameRegistry.addSmelting(ModBlocks.oreRuby, new ItemStack(ModItems.gemRuby), 5);
		GameRegistry.addSmelting(ModBlocks.oreSapphire, new ItemStack(ModItems.gemSapphire), 5);
		GameRegistry.addSmelting(ModBlocks.oreCitrine, new ItemStack(ModItems.gemCitrine), 5);
		GameRegistry.addSmelting(ModBlocks.oreJade, new ItemStack(ModItems.gemJade), 5);
		GameRegistry.addSmelting(ModBlocks.oreAmethyst, new ItemStack(ModItems.gemAmethyst), 5);
		GameRegistry.addSmelting(ModBlocks.oreCarnelian, new ItemStack(ModItems.gemCarnelian), 5);
		GameRegistry.addSmelting(ModBlocks.oreAmazonite, new ItemStack(ModItems.gemAmazonite), 5);
		GameRegistry.addSmelting(ModBlocks.oreGarnet, new ItemStack(ModItems.gemGarnet), 5);
		GameRegistry.addSmelting(ModBlocks.oreKunzite, new ItemStack(ModItems.gemKunzite), 5);
		GameRegistry.addSmelting(ModBlocks.oreAquamarine, new ItemStack(ModItems.gemAquamarine), 5);
		GameRegistry.addSmelting(ModBlocks.oreVoidium, new ItemStack(ModItems.voidium), 5);
		GameRegistry.addSmelting(ModBlocks.oreVoidiumBedrock, new ItemStack(ModItems.voidium), 5);
		GameRegistry.addSmelting(ModBlocks.oreFyrestone, new ItemStack(ModItems.fyrestone), 5);
		GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 5);
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 5);
		GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver), 5);
		GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(ModItems.ingotLead), 5);
		GameRegistry.addSmelting(ModBlocks.orePlatinum, new ItemStack(ModItems.ingotPlatinum), 5);
		GameRegistry.addSmelting(ModBlocks.oreMalagnite, new ItemStack(ModItems.ingotMalagnite), 5);
		GameRegistry.addSmelting(ModBlocks.oreTrytementium, new ItemStack(ModItems.trytementium), 5);
		GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 5);
		GameRegistry.addSmelting(ModBlocks.oreIridium, new ItemStack(ModItems.iridium), 5);
		GameRegistry.addSmelting(ModBlocks.oreUranium, new ItemStack(ModItems.uranium), 5);
		GameRegistry.addSmelting(ModBlocks.oreAluminium, new ItemStack(ModItems.ingotAluminium), 5);
		GameRegistry.addSmelting(ModBlocks.oreZinc, new ItemStack(ModItems.ingotZinc), 5);
		GameRegistry.addSmelting(ModBlocks.oreTopaz, new ItemStack(ModItems.gemTopaz), 5);
		GameRegistry.addSmelting(ModBlocks.orePlutonium, new ItemStack(ModItems.plutonium), 5);
		GameRegistry.addSmelting(ModBlocks.oreChromium, new ItemStack(ModItems.ingotChromium), 5);
		GameRegistry.addSmelting(ModBlocks.oreCobalt, new ItemStack(ModItems.ingotCobalt), 5);
		GameRegistry.addSmelting(ModBlocks.oreManganese, new ItemStack(ModItems.ingotManganese), 5);
		GameRegistry.addSmelting(ModBlocks.oreMithril, new ItemStack(ModItems.ingotMithril), 5);
		GameRegistry.addSmelting(ModBlocks.oreNickel, new ItemStack(ModItems.ingotNickel), 5);
		GameRegistry.addSmelting(ModBlocks.oreRhodium, new ItemStack(ModItems.ingotRhodium), 5);
		GameRegistry.addSmelting(ModBlocks.oreRubium, new ItemStack(ModItems.ingotRubium), 5);
		GameRegistry.addSmelting(ModBlocks.oreRunite, new ItemStack(ModItems.ingotRunite), 5);
		GameRegistry.addSmelting(ModBlocks.oreSilicon, new ItemStack(ModItems.ingotSilicon), 5);
		GameRegistry.addSmelting(ModBlocks.oreTungsten, new ItemStack(ModItems.ingotTungsten), 5);
		GameRegistry.addSmelting(ModBlocks.oreAdamanite, new ItemStack(ModItems.ingotAdamanite), 5);
		GameRegistry.addSmelting(ModBlocks.oreBlurite, new ItemStack(ModItems.ingotBlurite), 5);
		GameRegistry.addSmelting(ModBlocks.oreDaeyalt, new ItemStack(ModItems.ingotDaeyalt), 5);
		GameRegistry.addSmelting(ModBlocks.oreLunar, new ItemStack(ModItems.ingotLunar), 5);
		GameRegistry.addSmelting(ModBlocks.oreQuartz, new ItemStack(ModItems.gemQuartz), 5);
		GameRegistry.addSmelting(ModBlocks.oreOpal, new ItemStack(ModItems.gemOpal), 5);
		// Smelting Dusts
		GameRegistry.addSmelting(ModItems.dustAdamanite, new ItemStack(ModItems.ingotAdamanite), 5);
		GameRegistry.addSmelting(ModItems.dustAdamant, new ItemStack(ModItems.ingotAdamant), 5);
		GameRegistry.addSmelting(ModItems.dustAluminium, new ItemStack(ModItems.ingotAluminium), 5);
		GameRegistry.addSmelting(ModItems.dustBlurite, new ItemStack(ModItems.ingotBlurite), 5);
		GameRegistry.addSmelting(ModItems.dustBrass, new ItemStack(ModItems.ingotBrass), 5);
		GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(ModItems.ingotBronze), 5);
		GameRegistry.addSmelting(ModItems.dustChromium, new ItemStack(ModItems.ingotChromium), 5);
		GameRegistry.addSmelting(ModItems.dustCobalt, new ItemStack(ModItems.ingotCobalt), 5);
		GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper), 5);
		GameRegistry.addSmelting(ModItems.dustDaeyalt, new ItemStack(ModItems.ingotDaeyalt), 5);
		GameRegistry.addSmelting(ModItems.dustElectrum, new ItemStack(ModItems.ingotElectrum), 5);
		GameRegistry.addSmelting(ModItems.dustGold, new ItemStack(Items.gold_ingot), 5);
		GameRegistry.addSmelting(ModItems.dustGoloid, new ItemStack(ModItems.ingotGoloid), 5);
		GameRegistry.addSmelting(ModItems.dustInvar, new ItemStack(ModItems.ingotInvar), 5);
		GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(Items.iron_ingot), 5);
		GameRegistry.addSmelting(ModItems.dustLead, new ItemStack(ModItems.ingotLead), 5);
		GameRegistry.addSmelting(ModItems.dustLunar, new ItemStack(ModItems.ingotLunar), 5);
		GameRegistry.addSmelting(ModItems.dustMalagnite, new ItemStack(ModItems.ingotMalagnite), 5);
		GameRegistry.addSmelting(ModItems.dustManganese, new ItemStack(ModItems.ingotManganese), 5);
		GameRegistry.addSmelting(ModItems.dustMithril, new ItemStack(ModItems.ingotMithril), 5);
		GameRegistry.addSmelting(ModItems.dustNickel, new ItemStack(ModItems.ingotNickel), 5);
		GameRegistry.addSmelting(ModItems.dustPlatinum, new ItemStack(ModItems.ingotPlatinum), 5);
		GameRegistry.addSmelting(ModItems.dustRhodium, new ItemStack(ModItems.ingotRhodium), 5);
		GameRegistry.addSmelting(ModItems.dustRubium, new ItemStack(ModItems.ingotRubium), 5);
		GameRegistry.addSmelting(ModItems.dustRunite, new ItemStack(ModItems.ingotRunite), 5);
		GameRegistry.addSmelting(ModItems.dustSilicon, new ItemStack(ModItems.ingotSilicon), 5);
		GameRegistry.addSmelting(ModItems.dustSilver, new ItemStack(ModItems.ingotSilver), 5);
		GameRegistry.addSmelting(ModItems.dustSolder, new ItemStack(ModItems.ingotSolder), 5);
		GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel), 5);
		GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin), 5);
		GameRegistry.addSmelting(ModItems.dustTitanium, new ItemStack(ModItems.ingotTitanium), 5);
		GameRegistry.addSmelting(ModItems.dustTungsten, new ItemStack(ModItems.ingotTungsten), 5);
		GameRegistry.addSmelting(ModItems.dustZinc, new ItemStack(ModItems.ingotZinc), 5);
		// Misc Smelting
		GameRegistry.addSmelting(ModItems.resin, new ItemStack(ModItems.rubber), 5);
		GameRegistry.addSmelting(ModItems.fossilResin, new ItemStack(ModItems.rubber), 5);
		// Bonemeal
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 12, 15), new ItemStack(ModItems.fossil, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 8, 15), new ItemStack(ModItems.fossil, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 8, 15), new ItemStack(ModItems.fossil, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 24, 15), new ItemStack(ModItems.fossil, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 24, 15), new ItemStack(ModItems.fossil, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 8, 15), new ItemStack(ModItems.fossil, 1, 5));
		// Food
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.appleJuice), new ItemStack(Items.apple), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonJuice), new ItemStack(ModItems.lemon), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonade), new ItemStack(ModItems.lemonJuice), new ItemStack(Items.sugar));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.applePie), new ItemStack(Items.apple), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cherryPie), new ItemStack(ModItems.cherry), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonTart), new ItemStack(ModItems.lemon), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blackberryPie), new ItemStack(ModItems.blackberry), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.raspberryPie), new ItemStack(ModItems.raspberry), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueberryPie), new ItemStack(ModItems.blueberry), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		if(ConfigurationHandler.disablePieVanilla == false) GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearPie), new ItemStack(ModItems.pear), new ItemStack(Items.sugar), new ItemStack(Items.egg));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vegetableStew), new ItemStack(Items.carrot), new ItemStack(Items.potato), new ItemStack(Blocks.pumpkin), new ItemStack(Items.bowl));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.shellSoup), new ItemStack(ModArmour.shell), new ItemStack(ModItems.cookedTortoise), new ItemStack(Items.bowl));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bananaSmoothie), new ItemStack(ModItems.banana, 1, 2), new ItemStack(ModItems.banana, 1, 2), new ItemStack(ModItems.banana, 1, 2), new ItemStack(Items.milk_bucket), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bananaSmoothie), new ItemStack(ModItems.banana, 1, 1), new ItemStack(ModItems.banana, 1, 2), new ItemStack(Items.milk_bucket), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bananaSmoothie), new ItemStack(ModItems.banana, 1, 0), new ItemStack(Items.milk_bucket), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bananaSmoothie), new ItemStack(ModItems.banana, 1, 0), new ItemStack(Items.milk_bucket), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mangoSmoothie), new ItemStack(ModItems.mango), new ItemStack(Items.milk_bucket), new ItemStack(Items.glass_bottle));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.strawberryJamToast), new ItemStack(ModItems.strawberryJam), new ItemStack(ModItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.raspberryJam), new ItemStack(ModItems.raspberry), new ItemStack(ModItems.raspberry), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.raspberryJamToast), new ItemStack(ModItems.raspberryJam), new ItemStack(ModItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueberryJam), new ItemStack(ModItems.blueberry), new ItemStack(ModItems.blueberry), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueberryJamToast), new ItemStack(ModItems.blueberryJam), new ItemStack(ModItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blackberryJam), new ItemStack(ModItems.blackberry), new ItemStack(ModItems.blackberry), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blackberryJamToast), new ItemStack(ModItems.blackberryJam), new ItemStack(ModItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cherryJam), new ItemStack(ModItems.cherry), new ItemStack(ModItems.cherry), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cherryJamToast), new ItemStack(ModItems.cherryJam), new ItemStack(ModItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.appleJam), new ItemStack(Items.apple), new ItemStack(Items.apple), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.appleJamToast), new ItemStack(ModItems.appleJam), new ItemStack(ModItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonMarmalade), new ItemStack(ModItems.lemon), new ItemStack(ModItems.lemon), new ItemStack(Items.sugar), new ItemStack(ModItems.glassJar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonMarmaladeToast), new ItemStack(ModItems.lemonMarmalade), new ItemStack(ModItems.toast));
		for (int i = 0; i <= 100; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.slicedBread, 4), new ItemStack(Items.bread), new ItemStack(ModItems.knife, 1, i));
		}
		GameRegistry.addRecipe(new ItemStack(ModItems.blt), " b ", "plt", " b ", 'b', ModItems.slicedBread, 'p', Items.cooked_porkchop, 'l', ModItems.lettuce, 't', ModItems.tomato);
		GameRegistry.addRecipe(new ItemStack(ModItems.blt), " b ", "lpt", " b ", 'b', ModItems.slicedBread, 'p', Items.cooked_porkchop, 'l', ModItems.lettuce, 't', ModItems.tomato);
		GameRegistry.addRecipe(new ItemStack(ModItems.blt), " b ", "tlp", " b ", 'b', ModItems.slicedBread, 'p', Items.cooked_porkchop, 'l', ModItems.lettuce, 't', ModItems.tomato);
		GameRegistry.addRecipe(new ItemStack(ModItems.blt), " b ", "ltp", " b ", 'b', ModItems.slicedBread, 'p', Items.cooked_porkchop, 'l', ModItems.lettuce, 't', ModItems.tomato);
		GameRegistry.addRecipe(new ItemStack(ModItems.blt), " b ", "ptl", " b ", 'b', ModItems.slicedBread, 'p', Items.cooked_porkchop, 'l', ModItems.lettuce, 't', ModItems.tomato);
		GameRegistry.addRecipe(new ItemStack(ModItems.blt), " b ", "tpl", " b ", 'b', ModItems.slicedBread, 'p', Items.cooked_porkchop, 'l', ModItems.lettuce, 't', ModItems.tomato);
		GameRegistry.addRecipe(new ItemStack(ModItems.strawberryJamSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.strawberryJam);
		GameRegistry.addRecipe(new ItemStack(ModItems.raspberryJamSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.raspberryJam);
		GameRegistry.addRecipe(new ItemStack(ModItems.blueberryJamSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.blueberryJam);
		GameRegistry.addRecipe(new ItemStack(ModItems.blackberryJamSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.blackberryJam);
		GameRegistry.addRecipe(new ItemStack(ModItems.cherryJamSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.cherryJam);
		GameRegistry.addRecipe(new ItemStack(ModItems.appleJamSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.appleJam);
		GameRegistry.addRecipe(new ItemStack(ModItems.lemonMarmaladeSandwich), " b ", " j ", " b ", 'b', ModItems.slicedBread, 'j', ModItems.lemonMarmalade);
		GameRegistry.addRecipe(new ItemStack(ModItems.glassJar), "g g", "g g", "ggg", 'g', Blocks.glass_pane);
		GameRegistry.addRecipe(new ItemStack(ModItems.knife), "   ", " i ", "s  ", 's', Items.stick, 'i', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.toffeeApple), " t ", " a ", " s ", 's', Items.stick, 't', ModItems.toffee, 'a', Items.apple);
		GameRegistry.addRecipe(new ItemStack(ModItems.toffeeApple), " t ", " a ", " s ", 's', Items.stick, 't', ModItems.caramel, 'a', Items.apple);
		GameRegistry.addSmelting(ModItems.slicedBread, new ItemStack(ModItems.toast), 5);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chocolateMilk), new ItemStack(Items.milk_bucket), new ItemStack(Items.bucket), new ItemStack(Items.dye, 1, 3), new ItemStack(Items.sugar));
		if(ConfigurationHandler.disableCakeVanilla == false) GameRegistry.addRecipe(new ItemStack(ModItems.chocolateCake), "bbb", "ses", "www", 'b', ModItems.chocolateMilk, 's', Items.sugar, 'e', Items.egg, 'w', Items.wheat);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.strawberryMilk), new ItemStack(Items.milk_bucket), new ItemStack(Items.bucket), new ItemStack(ModItems.strawberry), new ItemStack(Items.sugar));
		if(ConfigurationHandler.disableCakeVanilla == false) GameRegistry.addRecipe(new ItemStack(ModItems.strawberryCake), "bbb", "ses", "www", 'b', ModItems.strawberryMilk, 's', Items.sugar, 'e', Items.egg, 'w', Items.wheat);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), new ItemStack(Items.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mapleSyrupPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.mapleSyrup));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonSugarPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.lemon), new ItemStack(Items.sugar));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueberryPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.flour), new ItemStack(ModItems.blueberry), new ItemStack(ModItems.blueberry), new ItemStack(ModItems.blueberry), new ItemStack(ModItems.blueberry), new ItemStack(ModItems.blueberry));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.strawberryJamPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.strawberryJam));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.raspberryJamPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.raspberryJam));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueberryJamPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.blueberryJam));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blackberryJamPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.blackberryJam));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cherryJamPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.cherryJam));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.appleJamPancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.appleJam));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lemonMarmaladePancake), new ItemStack(ModItems.pancake), new ItemStack(ModItems.lemonMarmalade));
		GameRegistry.addSmelting(new ItemStack(ModItems.rawTortoise), new ItemStack(ModItems.cookedTortoise), 5);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.battery), "aca", "cbc", "aca", 'a', ModItems.plateAluminium, 'c', ModItems.plateCopper, 'b', ModBlocks.blockLead);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.generator), "www", "wbw", "www", 'w', ModItems.copperBand, 'b', ModBlocks.blockLead);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cableBasic), "rrr", "ccc", "rrr", 'r', ModItems.rubber, 'c', ModItems.copperBand);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.compressor), "ici", "pbp", "ipi", 'i', Items.iron_ingot, 'c', ModItems.copperBand, 'p', Blocks.piston, 'b', Blocks.iron_block);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.oven), "ici", "pbp", "ipi", 'i', Items.iron_ingot, 'c', ModItems.copperBand, 'p', ModItems.ingotCopper, 'b', Blocks.iron_block);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pulverizer), "ici", "tbt", "iti", 'i', Items.iron_ingot, 'c', ModItems.copperBand, 't', ModItems.ingotTin, 'b', ModBlocks.compressedIronBlock);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speedUpgrade), "lll", "ltl", "lll", 'l', new ItemStack(Items.dye, 1, 4), 't', ModItems.gemTopaz);
		GameRegistry.addRecipe(new ItemStack(ModItems.inputUpgrade), "lll", "lal", "lll", 'l', new ItemStack(Items.dye, 1, 4), 'a', ModItems.gemAmethyst);
		GameRegistry.addRecipe(new ItemStack(ModItems.outputUpgrade), "lll", "lel", "lll", 'l', new ItemStack(Items.dye, 1, 4), 'e', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(ModItems.efficiencyUpgrade), "lll", "ltl", "lll", 'l', new ItemStack(Items.dye, 1, 4), 't', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(ModItems.capacityUpgrade), "lll", "ltl", "lll", 'l', new ItemStack(Items.dye, 1, 4), 't', ModItems.gemCitrine);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mapleLeaves), "ll ", "ll ", "   ", 'l', ModItems.mapleLeaf);
		
		GameRegistry.addSmelting(ModBlocks.cobbledUstherite, new ItemStack(ModBlocks.ustherite), 5);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.smoothUstherite, 4), "uu ", "uu ", "   ", 'u', ModBlocks.ustherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tiledUstherite, 4), "uu ", "uu ", "   ", 'u', ModBlocks.smoothUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.smallTiledUstherite, 4), "uu ", "uu ", "   ", 'u', ModBlocks.tiledUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tinyTiledUstherite, 4), "uu ", "uu ", "   ", 'u', ModBlocks.smallTiledUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ustheriteBricks, 2), "uu ", "   ", "   ", 'u', ModBlocks.tinyTiledUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.largeUstheriteBricks, 2), "uu ", "   ", "   ", 'u', ModBlocks.smallTiledUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.patternedUstherite, 4), "us ", "su ", "   ", 'u', ModBlocks.cobbledUstherite, 's', ModBlocks.smoothUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.patternedUstherite, 4), "su ", "us ", "   ", 'u', ModBlocks.cobbledUstherite, 's', ModBlocks.smoothUstherite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pillaredUstherite, 2), "u  ", "u  ", "   ", 'u', ModBlocks.smoothUstherite);
		
		//REMOVING RECIPES!!
		if(ConfigurationHandler.disableCakeVanilla == true) {
			List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
			
			Iterator<IRecipe> cake = recipes.iterator();
					          
				while (cake.hasNext()) {
					ItemStack stack = cake.next().getRecipeOutput();
					if (stack != null && stack.getItem() == Items.cake)
						cake.remove();
				};
		}
		if(ConfigurationHandler.disableBreadVanilla == true) {
			List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
			
			Iterator<IRecipe> bread = recipes.iterator();
					          
				while (bread.hasNext()) {
					ItemStack stack = bread.next().getRecipeOutput();
					if (stack != null && stack.getItem() == Items.bread)
						bread.remove();
				};
		}
		if(ConfigurationHandler.disablePieVanilla == true) {
			List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
			
			Iterator<IRecipe> pie = recipes.iterator();
					          
				while (pie.hasNext()) {
					ItemStack stack = pie.next().getRecipeOutput();
					if (stack != null && stack.getItem() == Items.pumpkin_pie)
						pie.remove();
				};
		}
		
		
		LogHelper.info("Recipes initialised successfully!");
	}
}
