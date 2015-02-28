package com.omgimalexis.allthethings.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;

import com.omgimalexis.allthethings.block.BlockBananaSkin;
import com.omgimalexis.allthethings.block.BlockBasic;
import com.omgimalexis.allthethings.block.BlockBasicBush;
import com.omgimalexis.allthethings.block.BlockBasicFluid;
import com.omgimalexis.allthethings.block.BlockBasicLeaf;
import com.omgimalexis.allthethings.block.BlockBasicLog;
import com.omgimalexis.allthethings.block.BlockBasicSapling;
import com.omgimalexis.allthethings.block.BlockBasicSlab;
import com.omgimalexis.allthethings.block.BlockBasicStairs;
import com.omgimalexis.allthethings.block.BlockBattery;
import com.omgimalexis.allthethings.block.BlockBricks;
import com.omgimalexis.allthethings.block.BlockCable;
import com.omgimalexis.allthethings.block.BlockCompressor;
import com.omgimalexis.allthethings.block.BlockGenerator;
import com.omgimalexis.allthethings.block.BlockOven;
import com.omgimalexis.allthethings.block.BlockPipe;
import com.omgimalexis.allthethings.block.BlockPulverizer;
import com.omgimalexis.allthethings.block.BlockShell;
import com.omgimalexis.allthethings.block.BlockUstherPortal;
import com.omgimalexis.allthethings.itemblocks.ItemBlockBananaSlab;
import com.omgimalexis.allthethings.itemblocks.ItemBlockBrick;
import com.omgimalexis.allthethings.itemblocks.ItemBlockCable;
import com.omgimalexis.allthethings.itemblocks.ItemBlockCherrySlab;
import com.omgimalexis.allthethings.itemblocks.ItemBlockEbonySlab;
import com.omgimalexis.allthethings.itemblocks.ItemBlockLemonSlab;
import com.omgimalexis.allthethings.itemblocks.ItemBlockMapleSlab;
import com.omgimalexis.allthethings.itemblocks.ItemBlockOliveSlab;
import com.omgimalexis.allthethings.itemblocks.ItemBlockRubberSlab;
import com.omgimalexis.allthethings.utility.LogHelper;
import com.omgimalexis.allthethings.utility.Register;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	// Ores
	public static final BlockBasic oreAdamanite = new BlockBasic("oreAdamanite", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.dustAdamanite, 1, 3);
	public static final BlockBasic oreAluminium = new BlockBasic("oreAluminium", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreAmazonite = new BlockBasic("oreAmazonite", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemAmazonite);
	public static final BlockBasic oreAmethyst = new BlockBasic("oreAmethyst", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemAmethyst);
	public static final BlockBasic oreAquamarine = new BlockBasic("oreAquamarine", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemAquamarine);
	public static final BlockBasic oreBlurite = new BlockBasic("oreBlurite", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.dustBlurite, 1, 3);
	public static final BlockBasic oreCarnelian = new BlockBasic("oreCarnelian", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemCarnelian);
	public static final BlockBasic oreChromium = new BlockBasic("oreChromium", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreCitrine = new BlockBasic("oreCitrine", Material.rock, ModCreativeTabs.block, 3, 3, ModItems.gemCitrine);
	public static final BlockBasic oreCobalt = new BlockBasic("oreCobalt", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreCopper = new BlockBasic("oreCopper", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreDaeyalt = new BlockBasic("oreDaeyalt", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.dustDaeyalt, 1, 6);
	public static final BlockBasic oreFyrestone = new BlockBasic("oreFyrestone", Material.rock, ModCreativeTabs.block, 3, 3, 1.0f, ModItems.fyrestone);
	public static final BlockBasic oreGarnet = new BlockBasic("oreGarnet", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemGarnet);
	public static final BlockBasic oreIridium = new BlockBasic("oreIridium", Material.rock, ModCreativeTabs.block, 1, 3, ModItems.iridium);
	public static final BlockBasic oreJade = new BlockBasic("oreJade", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemJade);
	public static final BlockBasic oreKunzite = new BlockBasic("oreKunzite", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemKunzite);
	public static final BlockBasic oreLead = new BlockBasic("oreLead", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreLunar = new BlockBasic("oreLunar", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.dustLunar);
	public static final BlockBasic oreMalagnite = new BlockBasic("oreMalagnite", Material.rock, ModCreativeTabs.block, 3, 3);
	public static final BlockBasic oreManganese = new BlockBasic("oreManganese", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic oreMithril = new BlockBasic("oreMithril", Material.rock, ModCreativeTabs.block, 3, 6);
	public static final BlockBasic oreNickel = new BlockBasic("oreNickel", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic oreOnyx = new BlockBasic("oreOnyx", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic oreOpal = new BlockBasic("oreOpal", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.gemOpal);
	public static final BlockBasic orePlatinum = new BlockBasic("orePlatinum", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic orePlutonium = new BlockBasic("orePlutonium", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.plutonium);
	public static final BlockBasic oreQuartz = new BlockBasic("oreQuartz", Material.rock, ModCreativeTabs.block, 1, 3, ModItems.gemQuartz);
	public static final BlockBasic oreRhodium = new BlockBasic("oreRhodium", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreRubium = new BlockBasic("oreRubium", Material.rock, ModCreativeTabs.block, 3, 6);
	public static final BlockBasic oreRuby = new BlockBasic("oreRuby", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemRuby);
	public static final BlockBasic oreRunite = new BlockBasic("oreRunite", Material.rock, ModCreativeTabs.block, 3, 6);	
	public static final BlockBasic oreSapphire = new BlockBasic("oreSapphire", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemSapphire);
	public static final BlockBasic oreSilicon = new BlockBasic("oreSilicon", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic oreSilver = new BlockBasic("oreSilver", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic oreTin = new BlockBasic("oreTin", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreTitanium = new BlockBasic("oreTitanium", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic oreTopaz = new BlockBasic("oreTopaz", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemTopaz);
	public static final BlockBasic oreTrytementium = new BlockBasic("oreTrytementium", Material.rock, ModCreativeTabs.block, 4, 3, ModItems.trytementium);
	public static final BlockBasic oreTungsten = new BlockBasic("oreTungsten", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreUranium = new BlockBasic("oreUranium", Material.rock, ModCreativeTabs.block, 1, 3, ModItems.uranium);
	public static final BlockBasic oreVoidium = new BlockBasic("oreVoidium", Material.rock, ModCreativeTabs.block, 4, 4, ModItems.voidium);
	public static final BlockBasic oreVoidiumBedrock = new BlockBasic("oreVoidiumBedrock", Material.rock, ModCreativeTabs.block, 4, 200, ModItems.voidium);
	public static final BlockBasic oreZinc = new BlockBasic("oreZinc", Material.rock, ModCreativeTabs.block, 1, 3);

	// Other blocks
	public static Block granite = new BlockBasic("granite", Material.rock, ModCreativeTabs.block, 3, 6);
	public static Block limestone = new BlockBasic("limestone", Material.rock, ModCreativeTabs.block, 3, 6);

	// Compressed blocks
	public static Block compressedIronBlock = new BlockBasic("compressedIronBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static Block compressedGoldBlock = new BlockBasic("compressedGoldBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static Block compressedEmeraldBlock = new BlockBasic("compressedEmeraldBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static Block compressedRubyBlock = new BlockBasic("compressedRubyBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static Block compressedSapphireBlock = new BlockBasic("compressedSapphireBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static Block compressedDiamondBlock = new BlockBasic("compressedDiamondBlock", Material.rock, ModCreativeTabs.block, 3, 6);

	// Machines
	public static Block compressor = new BlockCompressor().setBlockName("compressor");
	public static Block oven = new BlockOven().setBlockName("oven");
	public static Block pulverizer = new BlockPulverizer().setBlockName("pulverizer");
	public static Block battery = new BlockBattery();
	public static Block generator = new BlockGenerator("generator", Material.iron, ModCreativeTabs.block, 3, 4);
	
	// Pipes
	public static Block pipe = new BlockPipe().setBlockName("pipe");
	
	// Cables
	public static Block cableBasic = new BlockCable("cableBasic");
	
	// Blocks
	public static final BlockBasic blockAdamanite = new BlockBasic("blockAdamanite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAdamant = new BlockBasic("blockAdamant", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAluminium = new BlockBasic("blockAluminium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAmazonite = new BlockBasic("blockAmazonite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAmber = new BlockBasic("blockAmber", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAmethyst = new BlockBasic("blockAmethyst", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAquamarine = new BlockBasic("blockAquamarine", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockBlurite = new BlockBasic("blockBlurite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockBrass = new BlockBasic("blockBrass", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockBronze = new BlockBasic("blockBronze", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCarnelian = new BlockBasic("blockCarnelian", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockChromium = new BlockBasic("blockChromium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCitrine = new BlockBasic("blockCitrine", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCobalt = new BlockBasic("blockCobalt", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCopper = new BlockBasic("blockCopper", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockDaeyalt = new BlockBasic("blockDaeyalt", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockElectrum = new BlockBasic("blockElectrum", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockFyrestone = new BlockBasic("blockFyrestone", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockGarnet = new BlockBasic("blockGarnet", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockGoloid = new BlockBasic("blockGoloid", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockInvar = new BlockBasic("blockInvar", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockIridium = new BlockBasic("blockIridium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockJade = new BlockBasic("blockJade", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockKunzite = new BlockBasic("blockKunzite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockLead = new BlockBasic("blockLead", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockLunar = new BlockBasic("blockLunar", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockMalagnite = new BlockBasic("blockMalagnite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockManganese = new BlockBasic("blockManganese", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockMithril = new BlockBasic("blockMithril", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockNickel = new BlockBasic("blockNickel", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockOnyx = new BlockBasic("blockOnyx", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockOpal = new BlockBasic("blockOpal", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockPlatinum = new BlockBasic("blockPlatinum", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockPlutonium = new BlockBasic("blockPlutonium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockQuartz = new BlockBasic("blockQuartz", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockRhodium = new BlockBasic("blockRhodium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockRubium = new BlockBasic("blockRubium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockRuby = new BlockBasic("blockRuby", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockRunite = new BlockBasic("blockRunite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSapphire = new BlockBasic("blockSapphire", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSilicon = new BlockBasic("blockSilicon", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSilver = new BlockBasic("blockSilver", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSolder = new BlockBasic("blockSolder", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSteel = new BlockBasic("blockSteel", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTin = new BlockBasic("blockTin", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTitanium = new BlockBasic("blockTitanium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTopaz = new BlockBasic("blockTopaz", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTrytementium = new BlockBasic("blockTrytementium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTungsten = new BlockBasic("blockTungsten", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockUnobtanium = new BlockBasic("blockUnobtanium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockUranium = new BlockBasic("blockUranium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockVoidium = new BlockBasic("blockVoidium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockYlvoltium = new BlockBasic("blockYlvoltium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockZinc = new BlockBasic("blockZinc", Material.iron, ModCreativeTabs.block, 2, 3);
	
	public static final BlockBasic blockDiamondGem = new BlockBasic("blockDiamondGem", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockNetherQuartzGem = new BlockBasic("blockNetherQuartzGem", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockObsidian = new BlockBasic("blockObsidian", Material.iron, ModCreativeTabs.block, 2, 3);
	
	public static final BlockBasic blockPureObsidian = new BlockBasic("blockObsidianPure", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockEnrichedObsidian = new BlockBasic("blockObsidianEnriched", Material.iron, ModCreativeTabs.block, 2, 3);
		
	// Fossils
	public static final BlockBasic fossil = new BlockBasic("fossilOre", Material.rock, ModCreativeTabs.block, 0, 3, Items.bone, 1, 5);
	public static final BlockBasic fossilSkull = new BlockBasic("fossilSkullOre", Material.rock, ModCreativeTabs.block, 0, 3, ModItems.fossil, 0, 1);
	
	// Cherry Stuff
	public static final BlockBasicLeaf cherryLeaves = new BlockBasicLeaf("cherryLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog cherryWood = new BlockBasicLog("cherryWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic cherryPlanks = new BlockBasic("cherryPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs cherryStairs = new BlockBasicStairs("cherryStairs", ModCreativeTabs.block, 0, 2, cherryPlanks, 0);
	public static final BlockBasicSlab cherrySlab = new BlockBasicSlab("cherrySlab", Material.wood, ModCreativeTabs.block, 0, 2, cherryPlanks, 0, false);
	public static final BlockBasicSlab cherryDoubleSlab = new BlockBasicSlab("cherryDoubleSlab", Material.wood, null, 0, 2, cherryPlanks, 0, true, cherrySlab);
	public static final BlockBasicSapling cherrySapling = new BlockBasicSapling("cherrySapling", Material.plants, ModCreativeTabs.block, 0, 0, cherryWood, cherryLeaves);
	
	// Lemon Stuff
	public static final BlockBasicLeaf lemonLeaves = new BlockBasicLeaf("lemonLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog lemonWood = new BlockBasicLog("lemonWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic lemonPlanks = new BlockBasic("lemonPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs lemonStairs = new BlockBasicStairs("lemonStairs", ModCreativeTabs.block, 0, 2, lemonPlanks, 0);
	public static final BlockBasicSlab lemonSlab = new BlockBasicSlab("lemonSlab", Material.wood, ModCreativeTabs.block, 0, 2, lemonPlanks, 0, false);
	public static final BlockBasicSlab lemonDoubleSlab = new BlockBasicSlab("lemonDoubleSlab", Material.wood, null, 0, 2, lemonPlanks, 0, true, lemonSlab);
	public static final BlockBasicSapling lemonSapling = new BlockBasicSapling("lemonSapling", Material.plants, ModCreativeTabs.block, 0, 0, lemonWood, lemonLeaves);
	
	// Lemon Stuff
	public static final BlockBasicLeaf bananaLeaves = new BlockBasicLeaf("bananaLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog bananaWood = new BlockBasicLog("bananaWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic bananaPlanks = new BlockBasic("bananaPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs bananaStairs = new BlockBasicStairs("bananaStairs", ModCreativeTabs.block, 0, 2, bananaPlanks, 0);
	public static final BlockBasicSlab bananaSlab = new BlockBasicSlab("bananaSlab", Material.wood, ModCreativeTabs.block, 0, 2, bananaPlanks, 0, false);
	public static final BlockBasicSlab bananaDoubleSlab = new BlockBasicSlab("bananaDoubleSlab", Material.wood, null, 0, 2, bananaPlanks, 0, true, bananaSlab);
	public static final BlockBasicSapling bananaSapling = new BlockBasicSapling("bananaSapling", Material.plants, ModCreativeTabs.block, 0, 0, bananaWood, bananaLeaves);
	
	public static final BlockBananaSkin bananaPeel = new BlockBananaSkin("bananaPeel", Material.plants, ModCreativeTabs.block, 0, 0);
	
	// Rubber Stuff
	public static final BlockBasicLeaf rubberLeaves = new BlockBasicLeaf("rubberLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog rubberWood = new BlockBasicLog("rubberWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic rubberPlanks = new BlockBasic("rubberPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs rubberStairs = new BlockBasicStairs("rubberStairs", ModCreativeTabs.block, 0, 2, rubberPlanks, 0);
	public static final BlockBasicSlab rubberSlab = new BlockBasicSlab("rubberSlab", Material.wood, ModCreativeTabs.block, 0, 2, rubberPlanks, 0, false);
	public static final BlockBasicSlab rubberDoubleSlab = new BlockBasicSlab("rubberDoubleSlab", Material.wood, null, 0, 2, rubberPlanks, 0, true, rubberSlab);
	public static final BlockBasicSapling rubberSapling = new BlockBasicSapling("rubberSapling", Material.plants, ModCreativeTabs.block, 0, 0, rubberWood, rubberLeaves);
	
	// Olive Stuff
	public static final BlockBasicLeaf oliveLeaves = new BlockBasicLeaf("oliveLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog oliveWood = new BlockBasicLog("oliveWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic olivePlanks = new BlockBasic("olivePlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs oliveStairs = new BlockBasicStairs("oliveStairs", ModCreativeTabs.block, 0, 2, olivePlanks, 0);
	public static final BlockBasicSlab oliveSlab = new BlockBasicSlab("oliveSlab", Material.wood, ModCreativeTabs.block, 0, 2, olivePlanks, 0, false);
	public static final BlockBasicSlab oliveDoubleSlab = new BlockBasicSlab("oliveDoubleSlab", Material.wood, null, 0, 2, olivePlanks, 0, true, oliveSlab);
	public static final BlockBasicSapling oliveSapling = new BlockBasicSapling("oliveSapling", Material.plants, ModCreativeTabs.block, 0, 0, oliveWood, oliveLeaves);
		
	// Maple Stuff
	public static final BlockBasicLeaf mapleLeaves = new BlockBasicLeaf("mapleLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog mapleWood = new BlockBasicLog("mapleWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic maplePlanks = new BlockBasic("maplePlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs mapleStairs = new BlockBasicStairs("mapleStairs", ModCreativeTabs.block, 0, 2, maplePlanks, 0);
	public static final BlockBasicSlab mapleSlab = new BlockBasicSlab("mapleSlab", Material.wood, ModCreativeTabs.block, 0, 2, maplePlanks, 0, false);
	public static final BlockBasicSlab mapleDoubleSlab = new BlockBasicSlab("mapleDoubleSlab", Material.wood, null, 0, 2, maplePlanks, 0, true, mapleSlab);
	public static final BlockBasicSapling mapleSapling = new BlockBasicSapling("mapleSapling", Material.plants, ModCreativeTabs.block, 0, 0, mapleWood, mapleLeaves);
		
	// Ebony Stuff
	public static final BlockBasicLeaf ebonyLeaves = new BlockBasicLeaf("ebonyLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog ebonyWood = new BlockBasicLog("ebonyWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic ebonyPlanks = new BlockBasic("ebonyPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs ebonyStairs = new BlockBasicStairs("ebonyStairs", ModCreativeTabs.block, 0, 2, ebonyPlanks, 0);
	public static final BlockBasicSlab ebonySlab = new BlockBasicSlab("ebonySlab", Material.wood, ModCreativeTabs.block, 0, 2, ebonyPlanks, 0, false);
	public static final BlockBasicSlab ebonyDoubleSlab = new BlockBasicSlab("ebonyDoubleSlab", Material.wood, null, 0, 2, ebonyPlanks, 0, true, ebonySlab);
	public static final BlockBasicSapling ebonySapling = new BlockBasicSapling("ebonySapling", Material.plants, ModCreativeTabs.block, 0, 0, ebonyWood, ebonyLeaves);
	
	// Bushes
	public static final BlockBasicBush strawberryBush = new BlockBasicBush("strawberryBush", ModCreativeTabs.block, ModItems.strawberry);
	public static final BlockBasicBush raspberryBush = new BlockBasicBush("raspberryBush", ModCreativeTabs.block, ModItems.raspberry);
	public static final BlockBasicBush blueberryBush = new BlockBasicBush("blueberryBush", ModCreativeTabs.block, ModItems.blueberry);
	public static final BlockBasicBush blackberryBush = new BlockBasicBush("blackberryBush", ModCreativeTabs.block, ModItems.blackberry);
	
	// Machine Blocks
	public static final BlockBasic machineBlock = new BlockBasic("machineBlock", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockSteel = new BlockBasic("machineBlockSteel", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockStrengthened = new BlockBasic("machineBlockStrengthened", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockReinforced = new BlockBasic("machineBlockReinforced", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockImbued = new BlockBasic("machineBlockImbued", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockFluxed = new BlockBasic("machineBlockFluxed", Material.iron, ModCreativeTabs.block, 2, 3);
	
	// Decor Blocks	
	public static final BlockBricks brickColoured = new BlockBricks("brickColoured", Material.rock, ModCreativeTabs.block, 0, 2, 15);
	public static final BlockShell shell = new BlockShell("shell", Material.rock, 0, 10);
	
	// Magicks
	public static final BlockBasic fluxInfestedSoil = new BlockBasic("fluxInfestedSoil", Material.grass, ModCreativeTabs.block, 0, 2, ModItems.fluxWorm, 0, 3);
	
	// Now You're Thinking With P0rtals
	public static final BlockUstherPortal ustherPortal = new BlockUstherPortal("ustherPortal", null);
	
	// Molten Materials
	public static final BlockBasicFluid moltenIron = new BlockBasicFluid(ModFluids.moltenIronFluid, Material.lava, "ironMolten");
	public static final BlockBasicFluid moltenGold = new BlockBasicFluid(ModFluids.moltenGoldFluid, Material.lava, "goldMolten");
	public static final BlockBasicFluid moltenCopper = new BlockBasicFluid(ModFluids.moltenCopperFluid, Material.lava, "copperMolten");
	public static final BlockBasicFluid moltenTin = new BlockBasicFluid(ModFluids.moltenTinFluid, Material.lava, "tinMolten");
	public static final BlockBasicFluid moltenLead = new BlockBasicFluid(ModFluids.moltenLeadFluid, Material.lava, "leadMolten");
	public static final BlockBasicFluid moltenSilver = new BlockBasicFluid(ModFluids.moltenSilverFluid, Material.lava, "silverMolten");
	public static final BlockBasicFluid moltenBronze = new BlockBasicFluid(ModFluids.moltenBronzeFluid, Material.lava, "bronzeMolten");
	public static final BlockBasicFluid moltenPlatinum = new BlockBasicFluid(ModFluids.moltenPlatinumFluid, Material.lava, "platinumMolten");
	public static final BlockBasicFluid moltenZinc = new BlockBasicFluid(ModFluids.moltenZincFluid, Material.lava, "zincMolten");
	public static final BlockBasicFluid moltenSolder = new BlockBasicFluid(ModFluids.moltenSolderFluid, Material.lava, "solderMolten");
	public static final BlockBasicFluid moltenBrass = new BlockBasicFluid(ModFluids.moltenBrassFluid, Material.lava, "brassMolten");
	public static final BlockBasicFluid moltenSteel = new BlockBasicFluid(ModFluids.moltenSteelFluid, Material.lava, "steelMolten");
	public static final BlockBasicFluid moltenElectrum = new BlockBasicFluid(ModFluids.moltenElectrumFluid, Material.lava, "electrumMolten");
	public static final BlockBasicFluid moltenMalagnite = new BlockBasicFluid(ModFluids.moltenMalagniteFluid, Material.lava, "malagniteMolten");
	public static final BlockBasicFluid moltenAluminium = new BlockBasicFluid(ModFluids.moltenAluminiumFluid, Material.lava, "aluminiumMolten");
	public static final BlockBasicFluid moltenGoloid = new BlockBasicFluid(ModFluids.moltenGoloidFluid, Material.lava, "goloidMolten");
	public static final BlockBasicFluid moltenSilicon = new BlockBasicFluid(ModFluids.moltenSiliconFluid, Material.lava, "siliconMolten");
	public static final BlockBasicFluid moltenVoidium = new BlockBasicFluid(ModFluids.moltenVoidiumFluid, Material.lava, "voidiumMolten");
	public static final BlockBasicFluid moltenRhodium = new BlockBasicFluid(ModFluids.moltenRhodiumFluid, Material.lava, "rhodiumMolten");
	public static final BlockBasicFluid moltenTungsten = new BlockBasicFluid(ModFluids.moltenTungstenFluid, Material.lava, "tungstenMolten");
	public static final BlockBasicFluid moltenCobalt = new BlockBasicFluid(ModFluids.moltenCobaltFluid, Material.lava, "cobaltMolten");
	public static final BlockBasicFluid moltenInvar = new BlockBasicFluid(ModFluids.moltenInvarFluid, Material.lava, "invarMolten");
	public static final BlockBasicFluid moltenTrytementium = new BlockBasicFluid(ModFluids.moltenTrytementiumFluid, Material.lava, "trytementiumMolten");
	public static final BlockBasicFluid moltenNickel = new BlockBasicFluid(ModFluids.moltenNickelFluid, Material.lava, "nickelMolten");
	public static final BlockBasicFluid moltenChromium = new BlockBasicFluid(ModFluids.moltenChromiumFluid, Material.lava, "chromiumMolten");
	public static final BlockBasicFluid moltenUnobtanium = new BlockBasicFluid(ModFluids.moltenUnobtaniumFluid, Material.lava, "unobtaniumMolten");
	public static final BlockBasicFluid moltenPlutonium = new BlockBasicFluid(ModFluids.moltenPlutoniumFluid, Material.lava, "plutoniumMolten");
	public static final BlockBasicFluid moltenUranium = new BlockBasicFluid(ModFluids.moltenUraniumFluid, Material.lava, "uraniumMolten");
	public static final BlockBasicFluid moltenIridium = new BlockBasicFluid(ModFluids.moltenIridiumFluid, Material.lava, "iridiumMolten");
	public static final BlockBasicFluid moltenBlurite = new BlockBasicFluid(ModFluids.moltenBluriteFluid, Material.lava, "bluriteMolten");
	public static final BlockBasicFluid moltenRunite = new BlockBasicFluid(ModFluids.moltenRuniteFluid, Material.lava, "runiteMolten");
	public static final BlockBasicFluid moltenRubium = new BlockBasicFluid(ModFluids.moltenRubiumFluid, Material.lava, "rubiumMolten");
	public static final BlockBasicFluid moltenLunar = new BlockBasicFluid(ModFluids.moltenLunarFluid, Material.lava, "lunarMolten");
	public static final BlockBasicFluid moltenOpal = new BlockBasicFluid(ModFluids.moltenOpalFluid, Material.lava, "opalMolten");
	public static final BlockBasicFluid moltenDaeyalt = new BlockBasicFluid(ModFluids.moltenDaeyaltFluid, Material.lava, "daeyaltMolten");
	public static final BlockBasicFluid moltenRuby = new BlockBasicFluid(ModFluids.moltenRubyFluid, Material.lava, "rubyMolten");
	public static final BlockBasicFluid moltenSapphire = new BlockBasicFluid(ModFluids.moltenSapphireFluid, Material.lava, "sapphireMolten");
	public static final BlockBasicFluid moltenEmerald = new BlockBasicFluid(ModFluids.moltenEmeraldFluid, Material.lava, "emeraldMolten");
	public static final BlockBasicFluid moltenDiamond = new BlockBasicFluid(ModFluids.moltenDiamondFluid, Material.lava, "diamondMolten");
	public static final BlockBasicFluid moltenNetherQuartz = new BlockBasicFluid(ModFluids.moltenNetherQuartzFluid, Material.lava, "netherQuartzMolten");
	public static final BlockBasicFluid moltenObsidian = new BlockBasicFluid(ModFluids.moltenObsidianFluid, Material.lava, "obsidianMolten");
	public static final BlockBasicFluid moltenOnyx = new BlockBasicFluid(ModFluids.moltenOnyxFluid, Material.lava, "onyxMolten");
	public static final BlockBasicFluid moltenKunzite = new BlockBasicFluid(ModFluids.moltenKunziteFluid, Material.lava, "kunziteMolten");
	public static final BlockBasicFluid moltenAmber = new BlockBasicFluid(ModFluids.moltenAmberFluid, Material.lava, "amberMolten");
	public static final BlockBasicFluid moltenGarnet = new BlockBasicFluid(ModFluids.moltenGarnetFluid, Material.lava, "garnetMolten");
	public static final BlockBasicFluid moltenAmazonite = new BlockBasicFluid(ModFluids.moltenAmazoniteFluid, Material.lava, "amazoniteMolten");
	public static final BlockBasicFluid moltenFyrestone = new BlockBasicFluid(ModFluids.moltenFyrestoneFluid, Material.lava, "fyrestoneMolten");
	public static final BlockBasicFluid moltenAquamarine = new BlockBasicFluid(ModFluids.moltenAquamarineFluid, Material.lava, "aquamarineMolten");
	public static final BlockBasicFluid moltenTopaz = new BlockBasicFluid(ModFluids.moltenTopazFluid, Material.lava, "topazMolten");
	public static final BlockBasicFluid moltenCarnelian = new BlockBasicFluid(ModFluids.moltenCarnelianFluid, Material.lava, "carnelianMolten");
	public static final BlockBasicFluid moltenJade = new BlockBasicFluid(ModFluids.moltenJadeFluid, Material.lava, "jadeMolten");
	public static final BlockBasicFluid moltenAmethyst = new BlockBasicFluid(ModFluids.moltenAmethystFluid, Material.lava, "amethystMolten");
	public static final BlockBasicFluid moltenCitrine = new BlockBasicFluid(ModFluids.moltenCitrineFluid, Material.lava, "citrineMolten");
	public static final BlockBasicFluid moltenMithril = new BlockBasicFluid(ModFluids.moltenMithrilFluid, Material.lava, "mithrilMolten");
	public static final BlockBasicFluid moltenManganese = new BlockBasicFluid(ModFluids.moltenManganeseFluid, Material.lava, "manganeseMolten");
	
	public static void init() {
		
		// Ores
		GameRegistry.registerBlock(oreAdamanite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreAluminium, oreAluminium.getUnlocalizedName());
		GameRegistry.registerBlock(oreAmazonite, oreAmazonite.getUnlocalizedName());
		GameRegistry.registerBlock(oreAmethyst, oreAmethyst.getUnlocalizedName());
		GameRegistry.registerBlock(oreAquamarine, oreAquamarine.getUnlocalizedName());
		GameRegistry.registerBlock(oreBlurite, oreBlurite.getUnlocalizedName());
		GameRegistry.registerBlock(oreCarnelian, oreCarnelian.getUnlocalizedName());
		GameRegistry.registerBlock(oreChromium, oreChromium.getUnlocalizedName());
		GameRegistry.registerBlock(oreCitrine, oreCitrine.getUnlocalizedName());
		GameRegistry.registerBlock(oreCobalt, oreCobalt.getUnlocalizedName());
		GameRegistry.registerBlock(oreCopper, oreCopper.getUnlocalizedName());
		GameRegistry.registerBlock(oreDaeyalt, oreDaeyalt.getUnlocalizedName());
		GameRegistry.registerBlock(oreFyrestone, oreFyrestone.getUnlocalizedName());
		GameRegistry.registerBlock(oreGarnet, oreGarnet.getUnlocalizedName());
		GameRegistry.registerBlock(oreIridium, oreIridium.getUnlocalizedName());
		GameRegistry.registerBlock(oreJade, oreJade.getUnlocalizedName());
		GameRegistry.registerBlock(oreKunzite, oreKunzite.getUnlocalizedName());
		GameRegistry.registerBlock(oreLead, oreLead.getUnlocalizedName());
		GameRegistry.registerBlock(oreLunar, oreLunar.getUnlocalizedName());
		GameRegistry.registerBlock(oreMalagnite, oreMalagnite.getUnlocalizedName());
		GameRegistry.registerBlock(oreManganese, oreManganese.getUnlocalizedName());
		GameRegistry.registerBlock(oreMithril, oreMithril.getUnlocalizedName());
		GameRegistry.registerBlock(oreNickel, oreNickel.getUnlocalizedName());
		GameRegistry.registerBlock(oreOnyx, oreOnyx.getUnlocalizedName());
		GameRegistry.registerBlock(oreOpal, oreOpal.getUnlocalizedName());
		GameRegistry.registerBlock(orePlatinum, orePlatinum.getUnlocalizedName());
		GameRegistry.registerBlock(orePlutonium, orePlutonium.getUnlocalizedName());
		GameRegistry.registerBlock(oreQuartz, oreQuartz.getUnlocalizedName());
		GameRegistry.registerBlock(oreRhodium, oreRhodium.getUnlocalizedName());
		GameRegistry.registerBlock(oreRubium, oreRubium.getUnlocalizedName());
		GameRegistry.registerBlock(oreRuby, oreRuby.getUnlocalizedName());
		GameRegistry.registerBlock(oreRunite, oreRunite.getUnlocalizedName());
		GameRegistry.registerBlock(oreSapphire, oreSapphire.getUnlocalizedName());
		GameRegistry.registerBlock(oreSilicon, oreSilicon.getUnlocalizedName());
		GameRegistry.registerBlock(oreSilver, oreSilver.getUnlocalizedName());
		GameRegistry.registerBlock(oreTin, oreTin.getUnlocalizedName());
		GameRegistry.registerBlock(oreTitanium, oreTitanium.getUnlocalizedName());
		GameRegistry.registerBlock(oreTopaz, oreTopaz.getUnlocalizedName());
		GameRegistry.registerBlock(oreTrytementium, oreTrytementium.getUnlocalizedName());
		GameRegistry.registerBlock(oreTungsten, oreTungsten.getUnlocalizedName());
		GameRegistry.registerBlock(oreUranium, oreUranium.getUnlocalizedName());
		GameRegistry.registerBlock(oreVoidium, oreVoidium.getUnlocalizedName());
		GameRegistry.registerBlock(oreVoidiumBedrock, oreVoidiumBedrock.getUnlocalizedName());
		GameRegistry.registerBlock(oreZinc, oreZinc.getUnlocalizedName());

		// Other blocks
		GameRegistry.registerBlock(granite, granite.getUnlocalizedName());
		GameRegistry.registerBlock(limestone, limestone.getUnlocalizedName());

		// Compressed blocks
		GameRegistry.registerBlock(compressedIronBlock, compressedIronBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedGoldBlock, compressedGoldBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedEmeraldBlock, compressedEmeraldBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedRubyBlock, compressedRubyBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedSapphireBlock, compressedSapphireBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedDiamondBlock, compressedDiamondBlock.getUnlocalizedName());

		// Machines
		GameRegistry.registerBlock(compressor, compressor.getUnlocalizedName());
		GameRegistry.registerBlock(oven, oven.getUnlocalizedName());
		GameRegistry.registerBlock(pulverizer, pulverizer.getUnlocalizedName());
		GameRegistry.registerBlock(battery, battery.getUnlocalizedName());
		GameRegistry.registerBlock(generator, generator.getUnlocalizedName());
		
		// Pipes
		GameRegistry.registerBlock(pipe, pipe.getUnlocalizedName());
		
		// Cables
		GameRegistry.registerBlock(cableBasic, ItemBlockCable.class, cableBasic.getUnlocalizedName());
		
		// Blocks
		Register.registerMaterialBlock(blockAdamanite, blockAdamanite.getUnlocalizedName(), ModItems.ingotAdamanite);
		Register.registerMaterialBlock(blockAdamant, blockAdamant.getUnlocalizedName(), ModItems.ingotAdamant);
		Register.registerMaterialBlock(blockAluminium, blockAluminium.getUnlocalizedName(), ModItems.ingotAluminium);
		Register.registerMaterialBlock(blockAmazonite, blockAmazonite.getUnlocalizedName(), ModItems.gemAmazonite);
		Register.registerMaterialBlock(blockAmber, blockAmber.getUnlocalizedName(), ModItems.gemAmber);
		Register.registerMaterialBlock(blockAmethyst, blockAmethyst.getUnlocalizedName(), ModItems.gemAmethyst);
		Register.registerMaterialBlock(blockAquamarine, blockAquamarine.getUnlocalizedName(), ModItems.gemAquamarine);
		Register.registerMaterialBlock(blockBlurite, blockBlurite.getUnlocalizedName(), ModItems.ingotBlurite);
		Register.registerMaterialBlock(blockBrass, blockBrass.getUnlocalizedName(), ModItems.ingotBrass);
		Register.registerMaterialBlock(blockBronze, blockBronze.getUnlocalizedName(), ModItems.ingotBronze);
		Register.registerMaterialBlock(blockCarnelian, blockCarnelian.getUnlocalizedName(), ModItems.gemCarnelian);
		Register.registerMaterialBlock(blockChromium, blockChromium.getUnlocalizedName(), ModItems.ingotChromium);
		Register.registerMaterialBlock(blockCitrine, blockCitrine.getUnlocalizedName(), ModItems.gemCitrine);
		Register.registerMaterialBlock(blockCobalt, blockCobalt.getUnlocalizedName(), ModItems.ingotCobalt);
		Register.registerMaterialBlock(blockCopper, blockCopper.getUnlocalizedName(), ModItems.ingotCopper);
		Register.registerMaterialBlock(blockDaeyalt, blockDaeyalt.getUnlocalizedName(), ModItems.ingotDaeyalt);
		Register.registerMaterialBlock(blockElectrum, blockElectrum.getUnlocalizedName(), ModItems.ingotElectrum);
		Register.registerMaterialBlock(blockFyrestone, blockFyrestone.getUnlocalizedName(), ModItems.fyrestone);
		Register.registerMaterialBlock(blockGarnet, blockGarnet.getUnlocalizedName(), ModItems.gemGarnet);
		Register.registerMaterialBlock(blockGoloid, blockGoloid.getUnlocalizedName(), ModItems.ingotGoloid);
		Register.registerMaterialBlock(blockInvar, blockInvar.getUnlocalizedName(), ModItems.ingotInvar);
		Register.registerMaterialBlock(blockIridium, blockIridium.getUnlocalizedName(), ModItems.iridium);
		Register.registerMaterialBlock(blockJade, blockJade.getUnlocalizedName(), ModItems.gemJade);
		Register.registerMaterialBlock(blockKunzite, blockKunzite.getUnlocalizedName(), ModItems.gemKunzite);
		Register.registerMaterialBlock(blockLead, blockLead.getUnlocalizedName(), ModItems.ingotLead);
		Register.registerMaterialBlock(blockLunar, blockLunar.getUnlocalizedName(), ModItems.ingotLunar);
		Register.registerMaterialBlock(blockMalagnite, blockMalagnite.getUnlocalizedName(), ModItems.ingotMalagnite);
		Register.registerMaterialBlock(blockManganese, blockManganese.getUnlocalizedName(), ModItems.ingotManganese);
		Register.registerMaterialBlock(blockMithril, blockMithril.getUnlocalizedName(), ModItems.ingotMithril);
		Register.registerMaterialBlock(blockNickel, blockNickel.getUnlocalizedName(), ModItems.ingotNickel);
		Register.registerMaterialBlock(blockOnyx, blockOnyx.getUnlocalizedName(), ModItems.gemOnyx);
		Register.registerMaterialBlock(blockOpal, blockOpal.getUnlocalizedName(), ModItems.gemOpal);
		Register.registerMaterialBlock(blockPlatinum, blockPlatinum.getUnlocalizedName(), ModItems.ingotPlatinum);
		Register.registerMaterialBlock(blockPlutonium, blockPlutonium.getUnlocalizedName(), ModItems.plutonium);
		Register.registerMaterialBlock(blockQuartz, blockQuartz.getUnlocalizedName(), ModItems.gemQuartz);
		Register.registerMaterialBlock(blockRhodium, blockRhodium.getUnlocalizedName(), ModItems.ingotRhodium);
		Register.registerMaterialBlock(blockRubium, blockRubium.getUnlocalizedName(), ModItems.ingotRubium);
		Register.registerMaterialBlock(blockRuby, blockRuby.getUnlocalizedName(), ModItems.gemRuby);
		Register.registerMaterialBlock(blockRunite, blockRunite.getUnlocalizedName(), ModItems.ingotRunite);
		Register.registerMaterialBlock(blockSapphire, blockSapphire.getUnlocalizedName(), ModItems.gemSapphire);
		Register.registerMaterialBlock(blockSilicon, blockSilicon.getUnlocalizedName(), ModItems.ingotSilicon);
		Register.registerMaterialBlock(blockSilver, blockSilver.getUnlocalizedName(), ModItems.ingotSilver);
		Register.registerMaterialBlock(blockSolder, blockSolder.getUnlocalizedName(), ModItems.ingotSolder);
		Register.registerMaterialBlock(blockSteel, blockSteel.getUnlocalizedName(), ModItems.ingotSteel);
		Register.registerMaterialBlock(blockTin, blockTin.getUnlocalizedName(), ModItems.ingotTin);
		Register.registerMaterialBlock(blockTitanium, blockTitanium.getUnlocalizedName(), ModItems.ingotTitanium);
		Register.registerMaterialBlock(blockTopaz, blockTopaz.getUnlocalizedName(), ModItems.gemTopaz);
		Register.registerMaterialBlock(blockTrytementium, blockTrytementium.getUnlocalizedName(), ModItems.trytementium);
		Register.registerMaterialBlock(blockTungsten, blockTungsten.getUnlocalizedName(), ModItems.ingotTungsten);
		Register.registerMaterialBlock(blockUnobtanium, blockUnobtanium.getUnlocalizedName(), ModItems.unobtanium);
		Register.registerMaterialBlock(blockUranium, blockUranium.getUnlocalizedName(), ModItems.uranium);
		Register.registerMaterialBlock(blockVoidium, blockVoidium.getUnlocalizedName(), ModItems.voidium);
		Register.registerMaterialBlock(blockYlvoltium, blockYlvoltium.getUnlocalizedName(), ModItems.ylvoltium);
		Register.registerMaterialBlock(blockZinc, blockZinc.getUnlocalizedName(), ModItems.ingotZinc);
		
		Register.registerMaterialBlock(blockDiamondGem, blockDiamondGem.getUnlocalizedName(), ModItems.gemDiamond);
		Register.registerMaterialBlock(blockNetherQuartzGem, blockNetherQuartzGem.getUnlocalizedName(), ModItems.gemNetherQuartz);
		GameRegistry.registerBlock(blockObsidian, blockObsidian.getUnlocalizedName());
		
		GameRegistry.registerBlock(blockPureObsidian, blockPureObsidian.getUnlocalizedName());
		GameRegistry.registerBlock(blockEnrichedObsidian, blockEnrichedObsidian.getUnlocalizedName());
		
		// Magicks
		GameRegistry.registerBlock(fluxInfestedSoil, fluxInfestedSoil.getUnlocalizedName());
		
		// Portals
		GameRegistry.registerBlock(ustherPortal, ustherPortal.getUnlocalizedName());
		
		// Fossils
		GameRegistry.registerBlock(fossil, fossil.getUnlocalizedName());
		GameRegistry.registerBlock(fossilSkull, fossilSkull.getUnlocalizedName());
		
		// Cherry Stuff
		GameRegistry.registerBlock(cherryLeaves, cherryLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(cherryWood, cherryWood.getUnlocalizedName());
		GameRegistry.registerBlock(cherryPlanks, cherryPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(cherryStairs, cherryStairs.getUnlocalizedName());
		GameRegistry.registerBlock(cherrySlab, ItemBlockCherrySlab.class, cherrySlab.getUnlocalizedName());
		GameRegistry.registerBlock(cherryDoubleSlab, ItemBlockCherrySlab.class, cherryDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(cherrySapling, cherrySapling.getUnlocalizedName());
		
		// Rubber Stuff
		GameRegistry.registerBlock(rubberLeaves, rubberLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(rubberWood, rubberWood.getUnlocalizedName());
		GameRegistry.registerBlock(rubberPlanks, rubberPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(rubberStairs, rubberStairs.getUnlocalizedName());
		GameRegistry.registerBlock(rubberSlab, ItemBlockRubberSlab.class, rubberSlab.getUnlocalizedName());
		GameRegistry.registerBlock(rubberDoubleSlab, ItemBlockRubberSlab.class, rubberDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(rubberSapling, rubberSapling.getUnlocalizedName());
		
		// Lemon Stuff
		GameRegistry.registerBlock(lemonLeaves, lemonLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(lemonWood, lemonWood.getUnlocalizedName());
		GameRegistry.registerBlock(lemonPlanks, lemonPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(lemonStairs, lemonStairs.getUnlocalizedName());
		GameRegistry.registerBlock(lemonSlab, ItemBlockLemonSlab.class, lemonSlab.getUnlocalizedName());
		GameRegistry.registerBlock(lemonDoubleSlab, ItemBlockLemonSlab.class, lemonDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(lemonSapling, lemonSapling.getUnlocalizedName());
		
		// Banana Stuff
		GameRegistry.registerBlock(bananaLeaves, bananaLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(bananaWood, bananaWood.getUnlocalizedName());
		GameRegistry.registerBlock(bananaPlanks, bananaPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(bananaStairs, bananaStairs.getUnlocalizedName());
		GameRegistry.registerBlock(bananaSlab, ItemBlockBananaSlab.class, bananaSlab.getUnlocalizedName());
		GameRegistry.registerBlock(bananaDoubleSlab, ItemBlockBananaSlab.class, bananaDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(bananaSapling, bananaSapling.getUnlocalizedName());
		
		GameRegistry.registerBlock(bananaPeel, bananaPeel.getUnlocalizedName());
		
		// Olive Stuff
		GameRegistry.registerBlock(oliveLeaves, oliveLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(oliveWood, oliveWood.getUnlocalizedName());
		GameRegistry.registerBlock(olivePlanks, olivePlanks.getUnlocalizedName());
		GameRegistry.registerBlock(oliveStairs, oliveStairs.getUnlocalizedName());
		GameRegistry.registerBlock(oliveSlab, ItemBlockOliveSlab.class, oliveSlab.getUnlocalizedName());
		GameRegistry.registerBlock(oliveDoubleSlab, ItemBlockOliveSlab.class, oliveDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(oliveSapling, oliveSapling.getUnlocalizedName());
				
		// Maple Stuff
		GameRegistry.registerBlock(mapleLeaves, mapleLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(mapleWood, mapleWood.getUnlocalizedName());
		GameRegistry.registerBlock(maplePlanks, maplePlanks.getUnlocalizedName());
		GameRegistry.registerBlock(mapleStairs, mapleStairs.getUnlocalizedName());
		GameRegistry.registerBlock(mapleSlab, ItemBlockMapleSlab.class, mapleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(mapleDoubleSlab, ItemBlockMapleSlab.class, mapleDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(mapleSapling, mapleSapling.getUnlocalizedName());
				
		// Ebony Stuff
		GameRegistry.registerBlock(ebonyLeaves, ebonyLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(ebonyWood, ebonyWood.getUnlocalizedName());
		GameRegistry.registerBlock(ebonyPlanks, ebonyPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(ebonyStairs, ebonyStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ebonySlab, ItemBlockEbonySlab.class, ebonySlab.getUnlocalizedName());
		GameRegistry.registerBlock(ebonyDoubleSlab, ItemBlockEbonySlab.class, ebonyDoubleSlab.getUnlocalizedName());
		GameRegistry.registerBlock(ebonySapling, ebonySapling.getUnlocalizedName());
		
		// Bushes
		GameRegistry.registerBlock(strawberryBush, strawberryBush.getUnlocalizedName());
		GameRegistry.registerBlock(raspberryBush, raspberryBush.getUnlocalizedName());
		GameRegistry.registerBlock(blueberryBush, blueberryBush.getUnlocalizedName());
		GameRegistry.registerBlock(blackberryBush, blackberryBush.getUnlocalizedName());
		
		// Machine Blocks
		GameRegistry.registerBlock(machineBlock, machineBlock.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockSteel, machineBlockSteel.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockStrengthened, machineBlockStrengthened.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockReinforced, machineBlockReinforced.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockImbued, machineBlockImbued.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockFluxed, machineBlockFluxed.getUnlocalizedName());
		
		// Decor Blocks
		GameRegistry.registerBlock(brickColoured, ItemBlockBrick.class, brickColoured.getUnlocalizedName());
		GameRegistry.registerBlock(shell, shell.getUnlocalizedName());
		
		// Molten Stuffs
		GameRegistry.registerBlock(moltenIron, "moltenIron");
		GameRegistry.registerBlock(moltenGold, "moltenGold");
		GameRegistry.registerBlock(moltenCopper, "moltenCopper");
		GameRegistry.registerBlock(moltenTin, "moltenTin");
		GameRegistry.registerBlock(moltenLead, "moltenLead");
		GameRegistry.registerBlock(moltenSilver, "moltenSilver");
		GameRegistry.registerBlock(moltenBronze, "moltenBronze");
		GameRegistry.registerBlock(moltenPlatinum, "moltenPlatinum");
		GameRegistry.registerBlock(moltenZinc, "moltenZinc");
		GameRegistry.registerBlock(moltenSolder, "moltenSolder");
		GameRegistry.registerBlock(moltenBrass, "moltenBrass");
		GameRegistry.registerBlock(moltenSteel, "moltenSteel");
		GameRegistry.registerBlock(moltenElectrum, "moltenElectrum");
		GameRegistry.registerBlock(moltenMalagnite, "moltenMalagnite");
		GameRegistry.registerBlock(moltenAluminium, "moltenAluminium");
		GameRegistry.registerBlock(moltenGoloid, "moltenGoloid");
		GameRegistry.registerBlock(moltenSilicon, "moltenSilicon");
		GameRegistry.registerBlock(moltenVoidium, "moltenVoidium");
		GameRegistry.registerBlock(moltenRhodium, "moltenRhodium");
		GameRegistry.registerBlock(moltenTungsten, "moltenTungsten");
		GameRegistry.registerBlock(moltenCobalt, "moltenCobalt");
		GameRegistry.registerBlock(moltenInvar, "moltenInvar");
		GameRegistry.registerBlock(moltenTrytementium, "moltenTrytementium");
		GameRegistry.registerBlock(moltenNickel, "moltenNickel");
		GameRegistry.registerBlock(moltenChromium, "moltenChromium");
		GameRegistry.registerBlock(moltenUnobtanium, "moltenUnobtanium");
		GameRegistry.registerBlock(moltenPlutonium, "moltenPlutonium");
		GameRegistry.registerBlock(moltenUranium, "moltenUranium");
		GameRegistry.registerBlock(moltenIridium, "moltenIridium");
		GameRegistry.registerBlock(moltenBlurite, "moltenBlurite");
		GameRegistry.registerBlock(moltenRunite, "moltenRunite");
		GameRegistry.registerBlock(moltenRubium, "moltenRubium");
		GameRegistry.registerBlock(moltenLunar, "moltenLunar");
		GameRegistry.registerBlock(moltenOpal, "moltenOpal");
		GameRegistry.registerBlock(moltenDaeyalt, "moltenDaeyalt");
		GameRegistry.registerBlock(moltenRuby, "moltenRuby");
		GameRegistry.registerBlock(moltenSapphire, "moltenSapphire");
		GameRegistry.registerBlock(moltenEmerald, "moltenEmerald");
		GameRegistry.registerBlock(moltenDiamond, "moltenDiamond");
		GameRegistry.registerBlock(moltenNetherQuartz, "moltenNetherQuartz");
		GameRegistry.registerBlock(moltenObsidian, "moltenObsidian");
		GameRegistry.registerBlock(moltenOnyx, "moltenOnyx");
		GameRegistry.registerBlock(moltenKunzite, "moltenKunzite");
		GameRegistry.registerBlock(moltenAmber, "moltenAmber");
		GameRegistry.registerBlock(moltenGarnet, "moltenGarnet");
		GameRegistry.registerBlock(moltenAmazonite, "moltenAmazonite");
		GameRegistry.registerBlock(moltenFyrestone, "moltenFyrestone");
		GameRegistry.registerBlock(moltenAquamarine, "moltenAquamarine");
		GameRegistry.registerBlock(moltenTopaz, "moltenTopaz");
		GameRegistry.registerBlock(moltenCarnelian, "moltenCarnelian");
		GameRegistry.registerBlock(moltenJade, "moltenJade");
		GameRegistry.registerBlock(moltenAmethyst, "moltenAmethyst");
		GameRegistry.registerBlock(moltenCitrine, "moltenCitrine");
		GameRegistry.registerBlock(moltenMithril, "moltenMithril");
		GameRegistry.registerBlock(moltenManganese, "moltenManganese");
		
		LogHelper.info("Blocks initialized successfully!");
	}
}