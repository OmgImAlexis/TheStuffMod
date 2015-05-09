package com.shnupbups.allthethings.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.shnupbups.allthethings.block.BlockBananaSkin;
import com.shnupbups.allthethings.block.BlockBasic;
import com.shnupbups.allthethings.block.BlockBasicBush;
import com.shnupbups.allthethings.block.BlockBasicFlower;
import com.shnupbups.allthethings.block.BlockBasicFluid;
import com.shnupbups.allthethings.block.BlockBasicLeaf;
import com.shnupbups.allthethings.block.BlockBasicLog;
import com.shnupbups.allthethings.block.BlockBasicSapling;
import com.shnupbups.allthethings.block.BlockBasicShroom;
import com.shnupbups.allthethings.block.BlockBasicSlab;
import com.shnupbups.allthethings.block.BlockBasicStairs;
import com.shnupbups.allthethings.block.BlockBattery;
import com.shnupbups.allthethings.block.BlockCable;
import com.shnupbups.allthethings.block.BlockColoured;
import com.shnupbups.allthethings.block.BlockCompressor;
import com.shnupbups.allthethings.block.BlockCrusher;
import com.shnupbups.allthethings.block.BlockGenerator;
import com.shnupbups.allthethings.block.BlockOven;
import com.shnupbups.allthethings.block.BlockPipe;
import com.shnupbups.allthethings.block.BlockPulverizer;
import com.shnupbups.allthethings.block.BlockShell;
import com.shnupbups.allthethings.block.BlockUstherPortal;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.itemblocks.ItemBlockBananaSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockCable;
import com.shnupbups.allthethings.itemblocks.ItemBlockCherrySlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockColoured;
import com.shnupbups.allthethings.itemblocks.ItemBlockEbonySlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockJacarandaSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockLemonSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockMangoSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockMapleSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockOliveSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockPearSlab;
import com.shnupbups.allthethings.itemblocks.ItemBlockRubberSlab;
import com.shnupbups.allthethings.utility.LogHelper;
import com.shnupbups.allthethings.utility.Register;

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
	public static final BlockBasic oreCrymeretye = new BlockBasic("oreCrymeretye", Material.rock, ModCreativeTabs.block, 4, 12, ModItems.crymeretye);
	public static final BlockBasic oreDaeyalt = new BlockBasic("oreDaeyalt", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.dustDaeyalt, 1, 6);
	public static final BlockBasic oreFyrestone = new BlockBasic("oreFyrestone", Material.rock, ModCreativeTabs.block, 3, 3, 1.0f, ModItems.fyrestone);
	public static final BlockBasic oreGarnet = new BlockBasic("oreGarnet", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemGarnet);
	public static final BlockBasic oreGraeconthylynium = new BlockBasic("oreGraeconthylynium", Material.rock, ModCreativeTabs.block, 4, 11, ModItems.graeconthylynium);
	public static final BlockBasic oreIridium = new BlockBasic("oreIridium", Material.rock, ModCreativeTabs.block, 1, 3, ModItems.iridium);
	public static final BlockBasic oreJade = new BlockBasic("oreJade", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemJade);
	public static final BlockBasic oreJonjronyphyll = new BlockBasic("oreJonjronyphyll", Material.rock, ModCreativeTabs.block, 4, 12, ModItems.jonjronyphyll);
	public static final BlockBasic oreKraktachnar = new BlockBasic("oreKraktachnar", Material.rock, ModCreativeTabs.block, 4, 12, ModItems.kraktachnar);
	public static final BlockBasic oreKunzite = new BlockBasic("oreKunzite", Material.rock, ModCreativeTabs.block, 2, 3, ModItems.gemKunzite);
	public static final BlockBasic oreLead = new BlockBasic("oreLead", Material.rock, ModCreativeTabs.block, 1, 3);
	public static final BlockBasic oreLunar = new BlockBasic("oreLunar", Material.rock, ModCreativeTabs.block, 3, 6, ModItems.dustLunar);
	public static final BlockBasic oreMalagnite = new BlockBasic("oreMalagnite", Material.rock, ModCreativeTabs.block, 3, 3);
	public static final BlockBasic oreManganese = new BlockBasic("oreManganese", Material.rock, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic oreMithril = new BlockBasic("oreMithril", Material.rock, ModCreativeTabs.block, 3, 6);
	public static final BlockBasic oreMuktaphlyte = new BlockBasic("oreMuktaphlyte", Material.rock, ModCreativeTabs.block, 4, 12, ModItems.muktaphlyte);
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
	public static final BlockBasic oreSchulbradethenairdivite = new BlockBasic("oreSchulbradethenairdivite", Material.rock, ModCreativeTabs.block, 4, 10, ModItems.schulbradethenairdivite);
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
	public static final BlockBasic oreXaldriodythidyte = new BlockBasic("oreXaldriodythidyte", Material.rock, ModCreativeTabs.block, 4, 12, ModItems.xaldriodythidyte);
	public static final BlockBasic oreZinc = new BlockBasic("oreZinc", Material.rock, ModCreativeTabs.block, 1, 3);

	// Other blocks
	public static BlockBasic granite = new BlockBasic("granite", Material.rock, ModCreativeTabs.block, 3, 6);
	public static BlockBasic limestone = new BlockBasic("limestone", Material.rock, ModCreativeTabs.block, 3, 6);

	// Compressed blocks
	public static BlockBasic compressedIronBlock = new BlockBasic("compressedIronBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static BlockBasic compressedGoldBlock = new BlockBasic("compressedGoldBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static BlockBasic compressedEmeraldBlock = new BlockBasic("compressedEmeraldBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static BlockBasic compressedRubyBlock = new BlockBasic("compressedRubyBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static BlockBasic compressedSapphireBlock = new BlockBasic("compressedSapphireBlock", Material.rock, ModCreativeTabs.block, 3, 6);
	public static BlockBasic compressedDiamondBlock = new BlockBasic("compressedDiamondBlock", Material.rock, ModCreativeTabs.block, 3, 6);

	// Machines
	public static BlockCompressor compressor = new BlockCompressor("compressor");
	public static BlockOven oven = new BlockOven("oven");
	public static BlockPulverizer pulverizer = new BlockPulverizer("pulverizer");
	public static BlockCrusher crusher = new BlockCrusher("crusher");
	public static BlockBattery battery = new BlockBattery("battery");
	public static BlockGenerator generator = new BlockGenerator("generator", Material.iron, ModCreativeTabs.block, 3, 4);
	
	// Pipes
	public static BlockPipe pipe = new BlockPipe("pipe");
	
	// Cables
	public static BlockCable cableBasic = new BlockCable("cableBasic");
	
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
	public static final BlockBasic blockCrymeretye = new BlockBasic("blockCrymeretye", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockDaeyalt = new BlockBasic("blockDaeyalt", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockElectrum = new BlockBasic("blockElectrum", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockFyrestone = new BlockBasic("blockFyrestone", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockGarnet = new BlockBasic("blockGarnet", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockGoloid = new BlockBasic("blockGoloid", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockGraeconthylynium = new BlockBasic("blockGraeconthylynium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockInvar = new BlockBasic("blockInvar", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockIridium = new BlockBasic("blockIridium", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockJade = new BlockBasic("blockJade", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockJonjronyphyll = new BlockBasic("blockJonjronyphyll", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockKraktachnar = new BlockBasic("blockKraktachnar", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockKunzite = new BlockBasic("blockKunzite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockLead = new BlockBasic("blockLead", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockLunar = new BlockBasic("blockLunar", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockMalagnite = new BlockBasic("blockMalagnite", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockManganese = new BlockBasic("blockManganese", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockMithril = new BlockBasic("blockMithril", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic blockMuktaphlyte = new BlockBasic("blockMuktaphlyte", Material.iron, ModCreativeTabs.block, 2, 3);
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
	public static final BlockBasic blockSchulbradethenairdivite = new BlockBasic("blockSchulbradethenairdivite", Material.iron, ModCreativeTabs.block, 2, 3);
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
	public static final BlockBasic blockXaldriodythidyte = new BlockBasic("blockXaldriodythidyte", Material.iron, ModCreativeTabs.block, 2, 3);
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
	
	// Banana Stuff
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
	
	// Pear Stuff
	public static final BlockBasicLeaf pearLeaves = new BlockBasicLeaf("pearLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog pearWood = new BlockBasicLog("pearWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic pearPlanks = new BlockBasic("pearPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs pearStairs = new BlockBasicStairs("pearStairs", ModCreativeTabs.block, 0, 2, pearPlanks, 0);
	public static final BlockBasicSlab pearSlab = new BlockBasicSlab("pearSlab", Material.wood, ModCreativeTabs.block, 0, 2, pearPlanks, 0, false);
	public static final BlockBasicSlab pearDoubleSlab = new BlockBasicSlab("pearDoubleSlab", Material.wood, null, 0, 2, pearPlanks, 0, true, pearSlab);
	public static final BlockBasicSapling pearSapling = new BlockBasicSapling("pearSapling", Material.plants, ModCreativeTabs.block, 0, 0, pearWood, pearLeaves);
	
	// Mango Stuff
	public static final BlockBasicLeaf mangoLeaves = new BlockBasicLeaf("mangoLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog mangoWood = new BlockBasicLog("mangoWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic mangoPlanks = new BlockBasic("mangoPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs mangoStairs = new BlockBasicStairs("mangoStairs", ModCreativeTabs.block, 0, 2, mangoPlanks, 0);
	public static final BlockBasicSlab mangoSlab = new BlockBasicSlab("mangoSlab", Material.wood, ModCreativeTabs.block, 0, 2, mangoPlanks, 0, false);
	public static final BlockBasicSlab mangoDoubleSlab = new BlockBasicSlab("mangoDoubleSlab", Material.wood, null, 0, 2, mangoPlanks, 0, true, mangoSlab);
	public static final BlockBasicSapling mangoSapling = new BlockBasicSapling("mangoSapling", Material.plants, ModCreativeTabs.block, 0, 0, mangoWood, mangoLeaves);
	
	// Jacaranda Stuff
	public static final BlockBasicLeaf jacarandaLeaves = new BlockBasicLeaf("jacarandaLeaves", Material.leaves, ModCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog jacarandaWood = new BlockBasicLog("jacarandaWood", Material.wood, ModCreativeTabs.block, 0, 2);
	public static final BlockBasic jacarandaPlanks = new BlockBasic("jacarandaPlanks", Material.wood, ModCreativeTabs.block, 0, 2, Block.soundTypeWood);
	public static final BlockBasicStairs jacarandaStairs = new BlockBasicStairs("jacarandaStairs", ModCreativeTabs.block, 0, 2, jacarandaPlanks, 0);
	public static final BlockBasicSlab jacarandaSlab = new BlockBasicSlab("jacarandaSlab", Material.wood, ModCreativeTabs.block, 0, 2, jacarandaPlanks, 0, false);
	public static final BlockBasicSlab jacarandaDoubleSlab = new BlockBasicSlab("jacarandaDoubleSlab", Material.wood, null, 0, 2, jacarandaPlanks, 0, true, jacarandaSlab);
	public static final BlockBasicSapling jacarandaSapling = new BlockBasicSapling("jacarandaSapling", Material.plants, ModCreativeTabs.block, 0, 0, jacarandaWood, jacarandaLeaves);
	
	// Bushes
	public static final BlockBasicBush strawberryBush = new BlockBasicBush("strawberryBush", ModCreativeTabs.block, ModItems.strawberry);
	public static final BlockBasicBush raspberryBush = new BlockBasicBush("raspberryBush", ModCreativeTabs.block, ModItems.raspberry);
	public static final BlockBasicBush blueberryBush = new BlockBasicBush("blueberryBush", ModCreativeTabs.block, ModItems.blueberry);
	public static final BlockBasicBush blackberryBush = new BlockBasicBush("blackberryBush", ModCreativeTabs.block, ModItems.blackberry);
	public static final BlockBasicBush boysenberryBush = new BlockBasicBush("boysenberryBush", ModCreativeTabs.block, ModItems.boysenberry);
	public static final BlockBasicBush cranberryBush = new BlockBasicBush("cranberryBush", ModCreativeTabs.block, ModItems.cranberry);
	
	// Machine Blocks
	public static final BlockBasic machineBlock = new BlockBasic("machineBlock", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockSteel = new BlockBasic("machineBlockSteel", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockStrengthened = new BlockBasic("machineBlockStrengthened", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockReinforced = new BlockBasic("machineBlockReinforced", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockImbued = new BlockBasic("machineBlockImbued", Material.iron, ModCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockFluxed = new BlockBasic("machineBlockFluxed", Material.iron, ModCreativeTabs.block, 2, 3);
	
	// Decor Blocks	
	public static final BlockColoured brickColoured = new BlockColoured("brickColoured", Material.rock, ModCreativeTabs.block, 0, 2, 15, "brick");
	public static final BlockColoured woodColoured = new BlockColoured("planksColoured", Material.wood, ModCreativeTabs.block, 0, 2, 15, "planks");
	public static final BlockShell shell = new BlockShell("shell", Material.rock, 0, 10);
	
	// Magicks
	public static final BlockBasic fluxInfestedSoil = new BlockBasic("fluxInfestedSoil", Material.grass, ModCreativeTabs.block, 0, 2, ModItems.fluxWorm, 0, 3);
	
	// Now You're Thinking With P0rtals
	public static final BlockUstherPortal ustherPortal = new BlockUstherPortal("ustherPortal", null);
	
	// Other Usther
	public static final BlockBasic cobbledUstherite = new BlockBasic("cobbledUstherite", Material.rock, ModCreativeTabs.block, 3, 8);
	public static final BlockBasic ustherite = new BlockBasic("ustherite", Material.rock, ModCreativeTabs.block, 3, 10, new ItemStack(cobbledUstherite));
	public static final BlockBasic smoothUstherite = new BlockBasic("smoothUstherite", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic tiledUstherite = new BlockBasic("tiledUstherite", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic smallTiledUstherite = new BlockBasic("smallTiledUstherite", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic tinyTiledUstherite = new BlockBasic("tinyTiledUstherite", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic patternedUstherite = new BlockBasic("patternedUstherite", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic pillaredUstherite = new BlockBasic("pillaredUstherite", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic ustheriteBricks = new BlockBasic("ustheriteBricks", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasic largeUstheriteBricks = new BlockBasic("largeUstheriteBricks", Material.rock, ModCreativeTabs.block, 3, 10);
	public static final BlockBasicShroom physhroom = new BlockBasicShroom("physhroom", Material.plants, ModCreativeTabs.block, 0, 3);
	
	// Flowers
	public static final BlockBasicFlower marigold = new BlockBasicFlower("marigold", ModCreativeTabs.block);
	public static final BlockBasicFlower petunia = new BlockBasicFlower("petunia", ModCreativeTabs.block);
	public static final BlockBasicFlower lavender = new BlockBasicFlower("lavender", ModCreativeTabs.block);
	public static final BlockBasicFlower pansy = new BlockBasicFlower("pansy", ModCreativeTabs.block);
	
	// Molten Materials
	public static final BlockBasicFluid moltenAdamanite = new BlockBasicFluid("moltenAdamanite", ModFluids.moltenAdamaniteFluid);
	public static final BlockBasicFluid moltenAdamant = new BlockBasicFluid("moltenAdamant", ModFluids.moltenAdamantFluid);
	public static final BlockBasicFluid moltenAluminium = new BlockBasicFluid("moltenAluminium", ModFluids.moltenAluminiumFluid);
	public static final BlockBasicFluid moltenBlurite = new BlockBasicFluid("moltenBlurite", ModFluids.moltenBluriteFluid);
	public static final BlockBasicFluid moltenBrass = new BlockBasicFluid("moltenBrass", ModFluids.moltenBrassFluid);
	public static final BlockBasicFluid moltenBronze = new BlockBasicFluid("moltenBronze", ModFluids.moltenBronzeFluid);
	public static final BlockBasicFluid moltenChromium = new BlockBasicFluid("moltenChromium", ModFluids.moltenChromiumFluid);
	public static final BlockBasicFluid moltenCobalt = new BlockBasicFluid("moltenCobalt", ModFluids.moltenCobaltFluid);
	public static final BlockBasicFluid moltenCopper = new BlockBasicFluid("moltenCopper", ModFluids.moltenCopperFluid);
	public static final BlockBasicFluid moltenDaeyalt = new BlockBasicFluid("moltenDaeyalt", ModFluids.moltenDaeyaltFluid);
	public static final BlockBasicFluid moltenElectrum = new BlockBasicFluid("moltenElectrum", ModFluids.moltenElectrumFluid);
	public static final BlockBasicFluid moltenGold = new BlockBasicFluid("moltenGold", ModFluids.moltenGoldFluid);
	public static final BlockBasicFluid moltenGoloid = new BlockBasicFluid("moltenGoloid", ModFluids.moltenGoloidFluid);
	public static final BlockBasicFluid moltenInvar = new BlockBasicFluid("moltenInvar", ModFluids.moltenInvarFluid);
	public static final BlockBasicFluid moltenIron = new BlockBasicFluid("moltenIron", ModFluids.moltenIronFluid);
	public static final BlockBasicFluid moltenLead = new BlockBasicFluid("moltenLead", ModFluids.moltenLeadFluid);
	public static final BlockBasicFluid moltenLunar = new BlockBasicFluid("moltenLunar", ModFluids.moltenLunarFluid);
	public static final BlockBasicFluid moltenMalagnite = new BlockBasicFluid("moltenMalagnite", ModFluids.moltenMalagniteFluid);
	public static final BlockBasicFluid moltenManganese = new BlockBasicFluid("moltenManganese", ModFluids.moltenManganeseFluid);
	public static final BlockBasicFluid moltenMithril = new BlockBasicFluid("moltenMithril", ModFluids.moltenMithrilFluid);
	public static final BlockBasicFluid moltenNickel = new BlockBasicFluid("moltenNickel", ModFluids.moltenNickelFluid);
	public static final BlockBasicFluid moltenPlatinum = new BlockBasicFluid("moltenPlatinum", ModFluids.moltenPlatinumFluid);
	public static final BlockBasicFluid moltenRhodium = new BlockBasicFluid("moltenRhodium", ModFluids.moltenRhodiumFluid);
	public static final BlockBasicFluid moltenRubium = new BlockBasicFluid("moltenRubium", ModFluids.moltenRubiumFluid);
	public static final BlockBasicFluid moltenRunite = new BlockBasicFluid("moltenRunite", ModFluids.moltenRuniteFluid);
	public static final BlockBasicFluid moltenSilicon = new BlockBasicFluid("moltenSilicon",  ModFluids.moltenSiliconFluid);
	public static final BlockBasicFluid moltenSilver = new BlockBasicFluid("moltenSilver", ModFluids.moltenSilverFluid);
	public static final BlockBasicFluid moltenSolder = new BlockBasicFluid("moltenSolder", ModFluids.moltenSolderFluid);
	public static final BlockBasicFluid moltenSteel = new BlockBasicFluid("moltenSteel", ModFluids.moltenSteelFluid);
	public static final BlockBasicFluid moltenTin = new BlockBasicFluid("moltenTin", ModFluids.moltenTinFluid);
	public static final BlockBasicFluid moltenTitanium = new BlockBasicFluid("moltenTitanium", ModFluids.moltenTitaniumFluid);
	public static final BlockBasicFluid moltenTungsten = new BlockBasicFluid("moltenTungsten", ModFluids.moltenTungstenFluid);
	public static final BlockBasicFluid moltenZinc = new BlockBasicFluid("moltenZinc", ModFluids.moltenZincFluid);
	
	public static final BlockBasicFluid moltenAmazonite = new BlockBasicFluid("moltenAmazonite", ModFluids.moltenAmazoniteFluid);
	public static final BlockBasicFluid moltenAmber = new BlockBasicFluid("moltenAmber", ModFluids.moltenAmberFluid);
	public static final BlockBasicFluid moltenAmethyst = new BlockBasicFluid("moltenAmethyst", ModFluids.moltenAmethystFluid);
	public static final BlockBasicFluid moltenAquamarine = new BlockBasicFluid("moltenAquamarine", ModFluids.moltenAquamarineFluid);
	public static final BlockBasicFluid moltenCarnelian = new BlockBasicFluid("moltenCarnelian", ModFluids.moltenCarnelianFluid);
	public static final BlockBasicFluid moltenCitrine = new BlockBasicFluid("moltenCitrine", ModFluids.moltenCitrineFluid);
	public static final BlockBasicFluid moltenDiamond = new BlockBasicFluid("moltenDiamond", ModFluids.moltenDiamondFluid);
	public static final BlockBasicFluid moltenEmerald = new BlockBasicFluid("moltenEmerald", ModFluids.moltenEmeraldFluid);
	public static final BlockBasicFluid moltenGarnet = new BlockBasicFluid("moltenGarnet", ModFluids.moltenGarnetFluid);
	public static final BlockBasicFluid moltenJade = new BlockBasicFluid("moltenJade", ModFluids.moltenJadeFluid);
	public static final BlockBasicFluid moltenKunzite = new BlockBasicFluid("moltenKunzite", ModFluids.moltenKunziteFluid);
	public static final BlockBasicFluid moltenNetherQuartz = new BlockBasicFluid("moltenNetherQuartz", ModFluids.moltenNetherQuartzFluid);
	public static final BlockBasicFluid moltenOnyx = new BlockBasicFluid("moltenOnyx", ModFluids.moltenOnyxFluid);
	public static final BlockBasicFluid moltenOpal = new BlockBasicFluid("moltenOpal", ModFluids.moltenOpalFluid);
	public static final BlockBasicFluid moltenQuartz = new BlockBasicFluid("moltenQuartz", ModFluids.moltenQuartzFluid);
	public static final BlockBasicFluid moltenRuby = new BlockBasicFluid("moltenRuby", ModFluids.moltenRubyFluid);
	public static final BlockBasicFluid moltenSapphire = new BlockBasicFluid("moltenSapphire", ModFluids.moltenSapphireFluid);
	public static final BlockBasicFluid moltenTopaz = new BlockBasicFluid("moltenTopaz", ModFluids.moltenTopazFluid);
	
	public static final BlockBasicFluid moltenVoidium = new BlockBasicFluid("moltenVoidium", ModFluids.moltenVoidiumFluid);
	public static final BlockBasicFluid moltenFyrestone = new BlockBasicFluid("moltenFyrestone", ModFluids.moltenFyrestoneFluid);
	
	public static final BlockBasicFluid moltenIridium = new BlockBasicFluid("moltenIridium", ModFluids.moltenIridiumFluid);
	public static final BlockBasicFluid moltenPlutonium = new BlockBasicFluid("moltenPlutonium", ModFluids.moltenPlutoniumFluid);
	public static final BlockBasicFluid moltenUranium = new BlockBasicFluid("moltenUranium", ModFluids.moltenUraniumFluid);
	
	public static final BlockBasicFluid moltenCrymeretye = new BlockBasicFluid("moltenCrymeretye", ModFluids.moltenCrymeretyeFluid);
	public static final BlockBasicFluid moltenGraeconthylynium  = new BlockBasicFluid("moltenGraeconthylynium", ModFluids.moltenGraeconthylyniumFluid);
	public static final BlockBasicFluid moltenMuktaphlyte  = new BlockBasicFluid("moltenMuktaphlyte", ModFluids.moltenMuktaphlyteFluid);
	public static final BlockBasicFluid moltenJonjronyphyll  = new BlockBasicFluid("moltenJonjronyphyll", ModFluids.moltenJonjronyphyllFluid);
	public static final BlockBasicFluid moltenKraktachnar  = new BlockBasicFluid("moltenKraktachnar", ModFluids.moltenKraktachnarFluid);
	public static final BlockBasicFluid moltenSchulbradethenairdivite  = new BlockBasicFluid("moltenSchulbradethenairdivite", ModFluids.moltenSchulbradethenairdiviteFluid);
	public static final BlockBasicFluid moltenXaldriodythidyte  = new BlockBasicFluid("moltenXaldriodythidyte", ModFluids.moltenXaldriodythidyteFluid);
	
	public static final BlockBasicFluid moltenTrytementium = new BlockBasicFluid("moltenTrytementium", ModFluids.moltenTrytementiumFluid);
	public static final BlockBasicFluid moltenUnobtanium = new BlockBasicFluid("moltenUnobtanium", ModFluids.moltenUnobtaniumFluid);
	
	public static final BlockBasicFluid moltenCoal = new BlockBasicFluid("moltenCoal", ModFluids.moltenCoalFluid);
	public static final BlockBasicFluid moltenLapis = new BlockBasicFluid("moltenLapis", ModFluids.moltenLapisFluid);
	public static final BlockBasicFluid moltenObsidian = new BlockBasicFluid("moltenObsidian", ModFluids.moltenObsidianFluid);
	public static final BlockBasicFluid moltenRedstone = new BlockBasicFluid("moltenRedstone", ModFluids.moltenRedstoneFluid);
	
	public static void init() {
		
		// Ores
		GameRegistry.registerBlock(oreAdamanite, oreAdamanite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreAluminium, oreAluminium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreAmazonite, oreAmazonite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreAmethyst, oreAmethyst.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreAquamarine, oreAquamarine.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreBlurite, oreBlurite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreCarnelian, oreCarnelian.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreChromium, oreChromium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreCitrine, oreCitrine.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreCobalt, oreCobalt.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreCopper, oreCopper.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreCrymeretye, oreCrymeretye.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreDaeyalt, oreDaeyalt.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreFyrestone, oreFyrestone.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreGarnet, oreGarnet.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreGraeconthylynium, oreGraeconthylynium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreIridium, oreIridium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreJade, oreJade.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreJonjronyphyll, oreJonjronyphyll.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreKraktachnar, oreKraktachnar.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreKunzite, oreKunzite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreLead, oreLead.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreLunar, oreLunar.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreMalagnite, oreMalagnite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreManganese, oreManganese.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreMithril, oreMithril.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreMuktaphlyte, oreMuktaphlyte.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreNickel, oreNickel.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreOnyx, oreOnyx.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreOpal, oreOpal.getTrueUnlocalizedName());
		GameRegistry.registerBlock(orePlatinum, orePlatinum.getTrueUnlocalizedName());
		GameRegistry.registerBlock(orePlutonium, orePlutonium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreQuartz, oreQuartz.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreRhodium, oreRhodium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreRubium, oreRubium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreRuby, oreRuby.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreRunite, oreRunite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreSapphire, oreSapphire.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreSchulbradethenairdivite, oreSchulbradethenairdivite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreSilicon, oreSilicon.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreSilver, oreSilver.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreTin, oreTin.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreTitanium, oreTitanium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreTopaz, oreTopaz.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreTrytementium, oreTrytementium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreTungsten, oreTungsten.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreUranium, oreUranium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreVoidium, oreVoidium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreVoidiumBedrock, oreVoidiumBedrock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreXaldriodythidyte, oreXaldriodythidyte.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oreZinc, oreZinc.getTrueUnlocalizedName());

		// Other blocks
		GameRegistry.registerBlock(granite, granite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(limestone, limestone.getTrueUnlocalizedName());

		// Compressed blocks
		GameRegistry.registerBlock(compressedIronBlock, compressedIronBlock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(compressedGoldBlock, compressedGoldBlock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(compressedEmeraldBlock, compressedEmeraldBlock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(compressedRubyBlock, compressedRubyBlock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(compressedSapphireBlock, compressedSapphireBlock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(compressedDiamondBlock, compressedDiamondBlock.getTrueUnlocalizedName());

		// Machines
		GameRegistry.registerBlock(compressor, compressor.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oven, oven.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pulverizer, pulverizer.getTrueUnlocalizedName());
		GameRegistry.registerBlock(crusher, crusher.getTrueUnlocalizedName());
		GameRegistry.registerBlock(battery, battery.getTrueUnlocalizedName());
		GameRegistry.registerBlock(generator, generator.getTrueUnlocalizedName());
		
		// Pipes
		GameRegistry.registerBlock(pipe, pipe.getTrueUnlocalizedName());
		
		// Cables
		GameRegistry.registerBlock(cableBasic, ItemBlockCable.class, cableBasic.getTrueUnlocalizedName());
		
		// Blocks
		Register.registerMaterialBlock(blockAdamanite, blockAdamanite.getTrueUnlocalizedName(), ModItems.ingotAdamanite, "ingotAdamanite");
		Register.registerMaterialBlock(blockAdamant, blockAdamant.getTrueUnlocalizedName(), ModItems.ingotAdamant, "ingotAdamant");
		Register.registerMaterialBlock(blockAluminium, blockAluminium.getTrueUnlocalizedName(), ModItems.ingotAluminium, "ingotAluminum");
		Register.registerMaterialBlock(blockAmazonite, blockAmazonite.getTrueUnlocalizedName(), ModItems.gemAmazonite, "gemAmazonite");
		Register.registerMaterialBlock(blockAmber, blockAmber.getTrueUnlocalizedName(), ModItems.gemAmber, "gemAmber");
		Register.registerMaterialBlock(blockAmethyst, blockAmethyst.getTrueUnlocalizedName(), ModItems.gemAmethyst, "gemAmethyst");
		Register.registerMaterialBlock(blockAquamarine, blockAquamarine.getTrueUnlocalizedName(), ModItems.gemAquamarine, "gemAquamarine");
		Register.registerMaterialBlock(blockBlurite, blockBlurite.getTrueUnlocalizedName(), ModItems.ingotBlurite, "ingotBlurite");
		Register.registerMaterialBlock(blockBrass, blockBrass.getTrueUnlocalizedName(), ModItems.ingotBrass, "ingotBrass");
		Register.registerMaterialBlock(blockBronze, blockBronze.getTrueUnlocalizedName(), ModItems.ingotBronze, "ingotBronze");
		Register.registerMaterialBlock(blockCarnelian, blockCarnelian.getTrueUnlocalizedName(), ModItems.gemCarnelian, "gemCarnelian");
		Register.registerMaterialBlock(blockChromium, blockChromium.getTrueUnlocalizedName(), ModItems.ingotChromium, "ingotChromium");
		Register.registerMaterialBlock(blockCitrine, blockCitrine.getTrueUnlocalizedName(), ModItems.gemCitrine, "gemCitrine");
		Register.registerMaterialBlock(blockCobalt, blockCobalt.getTrueUnlocalizedName(), ModItems.ingotCobalt, "ingotCobalt");
		Register.registerMaterialBlock(blockCopper, blockCopper.getTrueUnlocalizedName(), ModItems.ingotCopper, "ingotCopper");
		Register.registerMaterialBlock(blockCrymeretye, blockCrymeretye.getTrueUnlocalizedName(), ModItems.crymeretye);
		Register.registerMaterialBlock(blockDaeyalt, blockDaeyalt.getTrueUnlocalizedName(), ModItems.ingotDaeyalt, "ingotDaeyalt");
		Register.registerMaterialBlock(blockElectrum, blockElectrum.getTrueUnlocalizedName(), ModItems.ingotElectrum, "ingotElectrum");
		Register.registerMaterialBlock(blockFyrestone, blockFyrestone.getTrueUnlocalizedName(), ModItems.fyrestone);
		Register.registerMaterialBlock(blockGarnet, blockGarnet.getTrueUnlocalizedName(), ModItems.gemGarnet, "gemGarnet");
		Register.registerMaterialBlock(blockGoloid, blockGoloid.getTrueUnlocalizedName(), ModItems.ingotGoloid, "ingotGoloid");
		Register.registerMaterialBlock(blockGraeconthylynium, blockGraeconthylynium.getTrueUnlocalizedName(), ModItems.graeconthylynium);
		Register.registerMaterialBlock(blockInvar, blockInvar.getTrueUnlocalizedName(), ModItems.ingotInvar, "ingotInvar");
		Register.registerMaterialBlock(blockIridium, blockIridium.getTrueUnlocalizedName(), ModItems.iridium, "iridium");
		Register.registerMaterialBlock(blockJade, blockJade.getTrueUnlocalizedName(), ModItems.gemJade, "gemJade");
		Register.registerMaterialBlock(blockJonjronyphyll, blockJonjronyphyll.getTrueUnlocalizedName(), ModItems.jonjronyphyll);
		Register.registerMaterialBlock(blockKraktachnar, blockKraktachnar.getTrueUnlocalizedName(), ModItems.kraktachnar);
		Register.registerMaterialBlock(blockKunzite, blockKunzite.getTrueUnlocalizedName(), ModItems.gemKunzite, "gemKunzite");
		Register.registerMaterialBlock(blockLead, blockLead.getTrueUnlocalizedName(), ModItems.ingotLead, "ingotLead");
		Register.registerMaterialBlock(blockLunar, blockLunar.getTrueUnlocalizedName(), ModItems.ingotLunar, "ingotLunar");
		Register.registerMaterialBlock(blockMalagnite, blockMalagnite.getTrueUnlocalizedName(), ModItems.ingotMalagnite, "ingotMalagnite");
		Register.registerMaterialBlock(blockManganese, blockManganese.getTrueUnlocalizedName(), ModItems.ingotManganese, "ingotManganese");
		Register.registerMaterialBlock(blockMithril, blockMithril.getTrueUnlocalizedName(), ModItems.ingotMithril, "ingotMithril");
		Register.registerMaterialBlock(blockMuktaphlyte, blockMuktaphlyte.getTrueUnlocalizedName(), ModItems.muktaphlyte);
		Register.registerMaterialBlock(blockNickel, blockNickel.getTrueUnlocalizedName(), ModItems.ingotNickel, "ingotNickel");
		Register.registerMaterialBlock(blockOnyx, blockOnyx.getTrueUnlocalizedName(), ModItems.gemOnyx, "gemOnyx");
		Register.registerMaterialBlock(blockOpal, blockOpal.getTrueUnlocalizedName(), ModItems.gemOpal, "gemOpal");
		Register.registerMaterialBlock(blockPlatinum, blockPlatinum.getTrueUnlocalizedName(), ModItems.ingotPlatinum, "ingotPlatinum");
		Register.registerMaterialBlock(blockPlutonium, blockPlutonium.getTrueUnlocalizedName(), ModItems.plutonium, "plutonium");
		Register.registerMaterialBlock(blockQuartz, blockQuartz.getTrueUnlocalizedName(), ModItems.gemQuartz, "gemQuartz");
		Register.registerMaterialBlock(blockRhodium, blockRhodium.getTrueUnlocalizedName(), ModItems.ingotRhodium, "ingotRhodium");
		Register.registerMaterialBlock(blockRubium, blockRubium.getTrueUnlocalizedName(), ModItems.ingotRubium, "ingotRubium");
		Register.registerMaterialBlock(blockRuby, blockRuby.getTrueUnlocalizedName(), ModItems.gemRuby, "gemRuby");
		Register.registerMaterialBlock(blockRunite, blockRunite.getTrueUnlocalizedName(), ModItems.ingotRunite, "ingotRunite");
		Register.registerMaterialBlock(blockSapphire, blockSapphire.getTrueUnlocalizedName(), ModItems.gemSapphire, "gemSapphire");
		Register.registerMaterialBlock(blockSchulbradethenairdivite, blockSchulbradethenairdivite.getTrueUnlocalizedName(), ModItems.schulbradethenairdivite);
		Register.registerMaterialBlock(blockSilicon, blockSilicon.getTrueUnlocalizedName(), ModItems.ingotSilicon, "ingotSilicon");
		Register.registerMaterialBlock(blockSilver, blockSilver.getTrueUnlocalizedName(), ModItems.ingotSilver, "ingotSilver");
		Register.registerMaterialBlock(blockSolder, blockSolder.getTrueUnlocalizedName(), ModItems.ingotSolder, "ingotSolder");
		Register.registerMaterialBlock(blockSteel, blockSteel.getTrueUnlocalizedName(), ModItems.ingotSteel, "ingotSteel");
		Register.registerMaterialBlock(blockTin, blockTin.getTrueUnlocalizedName(), ModItems.ingotTin, "ingotTin");
		Register.registerMaterialBlock(blockTitanium, blockTitanium.getTrueUnlocalizedName(), ModItems.ingotTitanium, "ingotTitanium");
		Register.registerMaterialBlock(blockTopaz, blockTopaz.getTrueUnlocalizedName(), ModItems.gemTopaz, "gemTopaz");
		Register.registerMaterialBlock(blockTrytementium, blockTrytementium.getTrueUnlocalizedName(), ModItems.trytementium);
		Register.registerMaterialBlock(blockTungsten, blockTungsten.getTrueUnlocalizedName(), ModItems.ingotTungsten, "ingotTungsten");
		Register.registerMaterialBlock(blockUnobtanium, blockUnobtanium.getTrueUnlocalizedName(), ModItems.unobtanium, "ingotUnobtanium");
		Register.registerMaterialBlock(blockUranium, blockUranium.getTrueUnlocalizedName(), ModItems.uranium, "uranium");
		Register.registerMaterialBlock(blockVoidium, blockVoidium.getTrueUnlocalizedName(), ModItems.voidium);
		Register.registerMaterialBlock(blockXaldriodythidyte, blockXaldriodythidyte.getTrueUnlocalizedName(), ModItems.xaldriodythidyte);
		Register.registerMaterialBlock(blockYlvoltium, blockYlvoltium.getTrueUnlocalizedName(), ModItems.ylvoltium);
		Register.registerMaterialBlock(blockZinc, blockZinc.getTrueUnlocalizedName(), ModItems.ingotZinc, "ingotZinc");
		
		Register.registerMaterialBlock(blockDiamondGem, blockDiamondGem.getTrueUnlocalizedName(), ModItems.gemDiamond);
		Register.registerMaterialBlock(blockNetherQuartzGem, blockNetherQuartzGem.getTrueUnlocalizedName(), ModItems.gemNetherQuartz);
		GameRegistry.registerBlock(blockObsidian, blockObsidian.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(blockPureObsidian, blockPureObsidian.getTrueUnlocalizedName());
		GameRegistry.registerBlock(blockEnrichedObsidian, blockEnrichedObsidian.getTrueUnlocalizedName());
		
		// Magicks
		GameRegistry.registerBlock(fluxInfestedSoil, fluxInfestedSoil.getTrueUnlocalizedName());
		
		// Portals
		GameRegistry.registerBlock(ustherPortal, ustherPortal.getTrueUnlocalizedName());
		
		// Usther
		GameRegistry.registerBlock(cobbledUstherite, cobbledUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ustherite, ustherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(smoothUstherite, smoothUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(tiledUstherite, tiledUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(smallTiledUstherite, smallTiledUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(tinyTiledUstherite, tinyTiledUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(patternedUstherite, patternedUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pillaredUstherite, pillaredUstherite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ustheriteBricks, ustheriteBricks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(largeUstheriteBricks, largeUstheriteBricks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(physhroom, physhroom.getTrueUnlocalizedName());
		
		// Fossils
		GameRegistry.registerBlock(fossil, fossil.getTrueUnlocalizedName());
		GameRegistry.registerBlock(fossilSkull, fossilSkull.getTrueUnlocalizedName());
		
		// Cherry Stuff
		GameRegistry.registerBlock(cherryLeaves, cherryLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cherryWood, cherryWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cherryPlanks, cherryPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cherryStairs, cherryStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cherrySlab, ItemBlockCherrySlab.class, cherrySlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cherryDoubleSlab, ItemBlockCherrySlab.class, cherryDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cherrySapling, cherrySapling.getTrueUnlocalizedName());
		
		// Rubber Stuff
		GameRegistry.registerBlock(rubberLeaves, rubberLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(rubberWood, rubberWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(rubberPlanks, rubberPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(rubberStairs, rubberStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(rubberSlab, ItemBlockRubberSlab.class, rubberSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(rubberDoubleSlab, ItemBlockRubberSlab.class, rubberDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(rubberSapling, rubberSapling.getTrueUnlocalizedName());
		
		// Lemon Stuff
		GameRegistry.registerBlock(lemonLeaves, lemonLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lemonWood, lemonWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lemonPlanks, lemonPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lemonStairs, lemonStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lemonSlab, ItemBlockLemonSlab.class, lemonSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lemonDoubleSlab, ItemBlockLemonSlab.class, lemonDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lemonSapling, lemonSapling.getTrueUnlocalizedName());
		
		// Banana Stuff
		GameRegistry.registerBlock(bananaLeaves, bananaLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(bananaWood, bananaWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(bananaPlanks, bananaPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(bananaStairs, bananaStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(bananaSlab, ItemBlockBananaSlab.class, bananaSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(bananaDoubleSlab, ItemBlockBananaSlab.class, bananaDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(bananaSapling, bananaSapling.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(bananaPeel, bananaPeel.getTrueUnlocalizedName());
		
		// Olive Stuff
		GameRegistry.registerBlock(oliveLeaves, oliveLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oliveWood, oliveWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(olivePlanks, olivePlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oliveStairs, oliveStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oliveSlab, ItemBlockOliveSlab.class, oliveSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oliveDoubleSlab, ItemBlockOliveSlab.class, oliveDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(oliveSapling, oliveSapling.getTrueUnlocalizedName());
				
		// Maple Stuff
		GameRegistry.registerBlock(mapleLeaves, mapleLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mapleWood, mapleWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(maplePlanks, maplePlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mapleStairs, mapleStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mapleSlab, ItemBlockMapleSlab.class, mapleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mapleDoubleSlab, ItemBlockMapleSlab.class, mapleDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mapleSapling, mapleSapling.getTrueUnlocalizedName());
				
		// Ebony Stuff
		GameRegistry.registerBlock(ebonyLeaves, ebonyLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ebonyWood, ebonyWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ebonyPlanks, ebonyPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ebonyStairs, ebonyStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ebonySlab, ItemBlockEbonySlab.class, ebonySlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ebonyDoubleSlab, ItemBlockEbonySlab.class, ebonyDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(ebonySapling, ebonySapling.getTrueUnlocalizedName());
		
		// Pear Stuff
		GameRegistry.registerBlock(pearLeaves, pearLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pearWood, pearWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pearPlanks, pearPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pearStairs, pearStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pearSlab, ItemBlockPearSlab.class, pearSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pearDoubleSlab, ItemBlockPearSlab.class, pearDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pearSapling, pearSapling.getTrueUnlocalizedName());
		
		// Mango Stuff
		GameRegistry.registerBlock(mangoLeaves, mangoLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mangoWood, mangoWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mangoPlanks, mangoPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mangoStairs, mangoStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mangoSlab, ItemBlockMangoSlab.class, mangoSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mangoDoubleSlab, ItemBlockMangoSlab.class, mangoDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(mangoSapling, mangoSapling.getTrueUnlocalizedName());
		
		// Jacaranda Stuff
		GameRegistry.registerBlock(jacarandaLeaves, jacarandaLeaves.getTrueUnlocalizedName());
		GameRegistry.registerBlock(jacarandaWood, jacarandaWood.getTrueUnlocalizedName());
		GameRegistry.registerBlock(jacarandaPlanks, jacarandaPlanks.getTrueUnlocalizedName());
		GameRegistry.registerBlock(jacarandaStairs, jacarandaStairs.getTrueUnlocalizedName());
		GameRegistry.registerBlock(jacarandaSlab, ItemBlockJacarandaSlab.class, jacarandaSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(jacarandaDoubleSlab, ItemBlockJacarandaSlab.class, jacarandaDoubleSlab.getTrueUnlocalizedName());
		GameRegistry.registerBlock(jacarandaSapling, jacarandaSapling.getTrueUnlocalizedName());
		
		// Bushes
		GameRegistry.registerBlock(strawberryBush, strawberryBush.getTrueUnlocalizedName());
		GameRegistry.registerBlock(raspberryBush, raspberryBush.getTrueUnlocalizedName());
		GameRegistry.registerBlock(blueberryBush, blueberryBush.getTrueUnlocalizedName());
		GameRegistry.registerBlock(blackberryBush, blackberryBush.getTrueUnlocalizedName());
		GameRegistry.registerBlock(boysenberryBush, boysenberryBush.getTrueUnlocalizedName());
		GameRegistry.registerBlock(cranberryBush, cranberryBush.getTrueUnlocalizedName());
		
		// Machine Blocks
		GameRegistry.registerBlock(machineBlock, machineBlock.getTrueUnlocalizedName());
		GameRegistry.registerBlock(machineBlockSteel, machineBlockSteel.getTrueUnlocalizedName());
		GameRegistry.registerBlock(machineBlockStrengthened, machineBlockStrengthened.getTrueUnlocalizedName());
		GameRegistry.registerBlock(machineBlockReinforced, machineBlockReinforced.getTrueUnlocalizedName());
		GameRegistry.registerBlock(machineBlockImbued, machineBlockImbued.getTrueUnlocalizedName());
		GameRegistry.registerBlock(machineBlockFluxed, machineBlockFluxed.getTrueUnlocalizedName());
		
		// Flowers
		GameRegistry.registerBlock(marigold, marigold.getTrueUnlocalizedName());
		GameRegistry.registerBlock(petunia, petunia.getTrueUnlocalizedName());
		GameRegistry.registerBlock(lavender, lavender.getTrueUnlocalizedName());
		GameRegistry.registerBlock(pansy, pansy.getTrueUnlocalizedName());
		
		// Decor Blocks
		GameRegistry.registerBlock(brickColoured, ItemBlockColoured.class, brickColoured.getTrueUnlocalizedName());
		GameRegistry.registerBlock(woodColoured, ItemBlockColoured.class, woodColoured.getTrueUnlocalizedName());
		GameRegistry.registerBlock(shell, shell.getTrueUnlocalizedName());
		
		// Molten Stuffs
		GameRegistry.registerBlock(moltenAdamanite, moltenAdamanite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenAdamant, moltenAdamant.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenAluminium, moltenAluminium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenBlurite, moltenBlurite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenBrass, moltenBrass.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenBronze, moltenBronze.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenChromium, moltenChromium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenCobalt, moltenCobalt.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenCopper, moltenCopper.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenDaeyalt, moltenDaeyalt.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenElectrum, moltenElectrum.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenGold, moltenGold.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenGoloid, moltenGoloid.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenInvar, moltenInvar.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenIron, moltenIron.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenLead, moltenLead.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenLunar, moltenLunar.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenMalagnite, moltenMalagnite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenManganese, moltenManganese.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenMithril, moltenMithril.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenNickel, moltenNickel.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenPlatinum, moltenPlatinum.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenRhodium, moltenRhodium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenRubium, moltenRubium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenRunite, moltenRunite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenSilicon, moltenSilicon.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenSilver, moltenSilver.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenSolder, moltenSolder.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenSteel, moltenSteel.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenTin, moltenTin.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenTitanium, moltenTitanium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenTungsten, moltenTungsten.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenZinc, moltenZinc.getTrueUnlocalizedName());
				
		GameRegistry.registerBlock(moltenAmazonite, moltenAmazonite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenAmber, moltenAmber.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenAmethyst, moltenAmethyst.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenAquamarine, moltenAquamarine.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenCarnelian, moltenCarnelian.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenCitrine, moltenCitrine.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenDiamond, moltenDiamond.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenEmerald, moltenEmerald.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenGarnet, moltenGarnet.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenJade, moltenJade.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenKunzite, moltenKunzite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenNetherQuartz, moltenNetherQuartz.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenOnyx, moltenOnyx.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenOpal, moltenOpal.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenQuartz, moltenQuartz.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenRuby, moltenRuby.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenSapphire, moltenSapphire.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenTopaz, moltenTopaz.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(moltenFyrestone, moltenFyrestone.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenVoidium, moltenVoidium.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(moltenIridium, moltenIridium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenPlutonium, moltenPlutonium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenUranium, moltenUranium.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(moltenCrymeretye, moltenCrymeretye.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenGraeconthylynium, moltenGraeconthylynium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenMuktaphlyte, moltenMuktaphlyte.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenJonjronyphyll, moltenJonjronyphyll.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenKraktachnar, moltenKraktachnar.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenSchulbradethenairdivite, moltenSchulbradethenairdivite.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenXaldriodythidyte, moltenXaldriodythidyte.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(moltenUnobtanium, moltenUnobtanium.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenTrytementium, moltenTrytementium.getTrueUnlocalizedName());
		
		GameRegistry.registerBlock(moltenCoal, moltenCoal.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenLapis, moltenLapis.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenObsidian, moltenObsidian.getTrueUnlocalizedName());
		GameRegistry.registerBlock(moltenRedstone, moltenRedstone.getTrueUnlocalizedName());
		
		LogHelper.info("Blocks initialized successfully!");
	}
}
