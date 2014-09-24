package omgimalexis.allthethings.init;

import omgimalexis.allthethings.utility.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static final ItemStack amberStack = new ItemStack(ModItems.gemAmber);
	public static final ItemStack blockAmberStack = new ItemStack(ModBlocks.blockAmber);
	public static final ItemStack rubyStack = new ItemStack(ModItems.gemRuby);
	public static final ItemStack blockRubyStack = new ItemStack(ModBlocks.blockRuby);
	public static final ItemStack sapphireStack = new ItemStack(ModItems.gemSapphire);
	public static final ItemStack blockSapphireStack = new ItemStack(ModBlocks.blockSapphire);
	public static final ItemStack onyxStack = new ItemStack(ModItems.gemOnyx);
	public static final ItemStack blockOnyxStack = new ItemStack(ModBlocks.blockOnyx);
	public static final ItemStack citrineStack = new ItemStack(ModItems.gemCitrine);
	public static final ItemStack blockCitrineStack = new ItemStack(ModBlocks.blockCitrine);
	public static final ItemStack jadeStack = new ItemStack(ModItems.gemJade);
	public static final ItemStack blockJadeStack = new ItemStack(ModBlocks.blockJade);
	public static final ItemStack amethystStack = new ItemStack(ModItems.gemAmethyst);
	public static final ItemStack blockAmethystStack = new ItemStack(ModBlocks.blockAmethyst);
	public static final ItemStack carnelianStack = new ItemStack(ModItems.gemCarnelian);
	public static final ItemStack blockCarnelianStack = new ItemStack(ModBlocks.blockCarnelian);
	public static final ItemStack voidiumStack = new ItemStack(ModItems.voidium);
	public static final ItemStack blockVoidiumStack = new ItemStack(ModBlocks.blockVoidium);
	public static final ItemStack fyrestoneStack = new ItemStack(ModItems.fyrestone);
	public static final ItemStack blockFyrestoneStack = new ItemStack(ModBlocks.blockFyrestone);
	
	public static final ItemStack cutRadioactiveFocusedVoidiumStack = new ItemStack(ModItems.voidiumCutRadioactiveFocused);
	public static final ItemStack cutFyrestoneStack = new ItemStack(ModItems.fyrestoneCut);
	
	public static final ItemStack blockIronStack = new ItemStack(Blocks.iron_block);
	
	public static final ItemStack diamondStack = new ItemStack(Items.diamond);
	public static final ItemStack goldStack = new ItemStack(Items.gold_ingot);
	public static final ItemStack stickStack = new ItemStack(Items.stick);
	
	public static final ItemStack ringStack = new ItemStack(ModItems.ring);
	public static final ItemStack voidiumRingStack = new ItemStack(ModItems.voidiumRing);
	public static final ItemStack fyrestoneRingStack = new ItemStack(ModItems.fyrestoneRing);
	
	public static final ItemStack goldBandStack = new ItemStack(ModItems.goldBand);
	
	public static final ItemStack onyxPickaxeStack = new ItemStack(ModTools.onyxPickaxe);
	public static final ItemStack onyxAxeStack = new ItemStack(ModTools.onyxAxe);
	public static final ItemStack onyxSwordStack = new ItemStack(ModTools.onyxSword);
	public static final ItemStack onyxShovelStack = new ItemStack(ModTools.onyxShovel);
	public static final ItemStack onyxHoeStack = new ItemStack(ModTools.onyxHoe);
	public static final ItemStack rubyPickaxeStack = new ItemStack(ModTools.rubyPickaxe);
	public static final ItemStack rubyAxeStack = new ItemStack(ModTools.rubyAxe);
	public static final ItemStack rubySwordStack = new ItemStack(ModTools.rubySword);
	public static final ItemStack rubyShovelStack = new ItemStack(ModTools.rubyShovel);
	public static final ItemStack rubyHoeStack = new ItemStack(ModTools.rubyHoe);
	
	public static final ItemStack cherryWoodStack = new ItemStack(ModBlocks.cherryWood);
	
	public static void init() {
		// Gems to blocks
		GameRegistry.addRecipe(new ShapedOreRecipe(blockAmberStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemAmber"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockRubyStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockSapphireStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockOnyxStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemOnyx"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockCitrineStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemCitrine"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockJadeStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemJade"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockAmethystStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemAmethyst"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockCarnelianStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemCarnelian"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockVoidiumStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemVoidium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(blockFyrestoneStack, true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), "gemFyrestone"}));
		// Blocks back to gems
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemAmber, 9), blockAmberStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemRuby, 9), blockRubyStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemSapphire, 9), blockSapphireStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemOnyx, 9), blockOnyxStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemCitrine, 9), blockCitrineStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemJade, 9), blockJadeStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemAmethyst, 9), blockAmethystStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemCarnelian, 9), blockCarnelianStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.voidium, 9), blockVoidiumStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fyrestone, 9), blockFyrestoneStack);
		// Rings and Bands
		GameRegistry.addRecipe(new ItemStack(ModItems.goldBand,9), "ggg", 'g', goldStack);
		GameRegistry.addRecipe(ringStack, "bbb", "b b", "bbb", 'b', goldBandStack);
		GameRegistry.addShapelessRecipe(voidiumRingStack, ringStack, cutRadioactiveFocusedVoidiumStack);
		GameRegistry.addShapelessRecipe(fyrestoneRingStack, ringStack, cutFyrestoneStack);
		// Tools (& Swords, but I count them as tools anyway...)
		GameRegistry.addRecipe(onyxPickaxeStack, "ooo", " s", " s", 'o', onyxStack, 's', stickStack);
		GameRegistry.addRecipe(onyxAxeStack, "oo", "os", " s", 'o', onyxStack, 's', stickStack);
		GameRegistry.addRecipe(onyxSwordStack, "o", "o", "s", 'o', onyxStack, 's', stickStack);
		GameRegistry.addRecipe(onyxShovelStack, "o", "s", "s", 'o', onyxStack, 's', stickStack);
		GameRegistry.addRecipe(onyxHoeStack, "oo", " s", " s", 'o', onyxStack, 's', stickStack);
		GameRegistry.addRecipe(rubyPickaxeStack, "rrr", " s ", " s ", 'r', rubyStack, 's', stickStack);
		GameRegistry.addRecipe(rubyAxeStack, "rr", "rs", " s", 'r', rubyStack, 's', stickStack);
		GameRegistry.addRecipe(rubySwordStack, "r", "r", "s", 'r', rubyStack, 's', stickStack);
		GameRegistry.addRecipe(rubyShovelStack, "r", "s", "s", 'r', rubyStack, 's', stickStack);
		GameRegistry.addRecipe(rubyHoeStack, "rr", " s", " s", 'r', rubyStack, 's', stickStack);
		// Planks
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cherryPlanks, 4), cherryWoodStack);
		
		//Smelting Ores
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
