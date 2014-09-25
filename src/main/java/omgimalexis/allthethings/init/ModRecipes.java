package omgimalexis.allthethings.init;

import omgimalexis.allthethings.utility.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		// Gems to blocks
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockAmber, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemAmber"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockRuby, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockSapphire, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockOnyx, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemOnyx"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCitrine, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemCitrine"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockJade, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemJade"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockAmethyst, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemAmethyst"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCarnelian, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemCarnelian"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockVoidium, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemVoidium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockFyrestone, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemFyrestone"}));
		// Blocks back to gems
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemAmber, 9), ModBlocks.blockAmber);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemRuby, 9), ModBlocks.blockRuby);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemSapphire, 9), ModBlocks.blockSapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemOnyx, 9), ModBlocks.blockOnyx);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemCitrine, 9), ModBlocks.blockCitrine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemJade, 9), ModBlocks.blockJade);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemAmethyst, 9), ModBlocks.blockAmethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemCarnelian, 9), ModBlocks.blockCarnelian);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.voidium, 9), ModBlocks.blockVoidium);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fyrestone, 9), ModBlocks.blockFyrestone);
		// Rings and Bands
		GameRegistry.addRecipe(new ItemStack(ModItems.goldBand,9), "ggg", 'g', Items.gold_ingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.ring), "bbb", "b b", "bbb", 'b', ModItems.goldBand);
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
		// Planks
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cherryPlanks, 4), ModBlocks.cherryWood);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rubberPlanks, 4), ModBlocks.rubberWood);
		
		// Machine Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlock), "pip", "ibi", "pip", 'p', ModItems.plateIron, 'i', Items.iron_ingot, 'b', ModBlocks.compressedIronBlock);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockSteel), "pip", "ibi", "pip", 'p', ModItems.plateSteel, 'i', ModItems.ingotSteel, 'b', ModBlocks.machineBlock);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockStrengthened), "pip", "ibi", "pip", 'p', ModItems.plateObsidian, 'i', ModBlocks.blockPureObsidian, 'b', ModBlocks.machineBlockSteel);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockReinforced), "pip", "ibi", "pip", 'p', ModItems.plateObsidian, 'i', ModBlocks.blockEnrichedObsidian, 'b', ModBlocks.machineBlockStrengthened);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockImbued), "pip", "ibi", "pip", 'p', ModItems.shardTrytementium, 'i', ModItems.shardUnobtanium, 'b', ModBlocks.machineBlockReinforced);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.machineBlockFluxed), "pip", "ibi", "pip", 'p', ModItems.ylvoltium, 'i', ModItems.ylvoltiumFluxed, 'b', ModBlocks.machineBlockImbued);
		
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
		
		LogHelper.info("Recipes initialised successfully!");
	}
}
