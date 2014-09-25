package omgimalexis.allthethings.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import omgimalexis.allthethings.block.BlockBasic;
import omgimalexis.allthethings.block.BlockBasicFluid;
import omgimalexis.allthethings.block.BlockBasicLeaf;
import omgimalexis.allthethings.block.BlockBasicLog;
import omgimalexis.allthethings.block.BlockBasicSapling;
import omgimalexis.allthethings.block.BlockBasicSlab;
import omgimalexis.allthethings.block.BlockBasicStairs;
import omgimalexis.allthethings.block.BlockBattery;
import omgimalexis.allthethings.block.BlockCable;
import omgimalexis.allthethings.block.BlockCompressor;
import omgimalexis.allthethings.block.BlockPipe;
import omgimalexis.allthethings.block.BlockRubberLog;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	// Ores
	public static final BlockBasic oreAdamanite = new BlockBasic("oreAdamanite", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic oreAluminium = new BlockBasic("oreAluminium", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreAmazonite = new BlockBasic("oreAmazonite", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemAmazonite);
	public static final BlockBasic oreAmethyst = new BlockBasic("oreAmethyst", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemAmethyst);
	public static final BlockBasic oreAquamarine = new BlockBasic("oreAquamarine", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemAquamarine);
	public static final BlockBasic oreBlurite = new BlockBasic("oreBlurite", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic oreCarnelian = new BlockBasic("oreCarnelian", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemCarnelian);
	public static final BlockBasic oreChromium = new BlockBasic("oreChromium", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreCitrine = new BlockBasic("oreCitrine", Material.rock, TMCreativeTabs.block, 3, 3, ModItems.gemCitrine);
	public static final BlockBasic oreCobalt = new BlockBasic("oreCobalt", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreCopper = new BlockBasic("oreCopper", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreDaeyalt = new BlockBasic("oreDaeyalt", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic oreFyrestone = new BlockBasic("oreFyrestone", Material.rock, TMCreativeTabs.block, 3, 3, 1.0f, ModItems.fyrestone);
	public static final BlockBasic oreGarnet = new BlockBasic("oreGarnet", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemGarnet);
	public static final BlockBasic oreIridium = new BlockBasic("oreIridium", Material.rock, TMCreativeTabs.block, 1, 3, ModItems.iridium);
	public static final BlockBasic oreJade = new BlockBasic("oreJade", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemJade);
	public static final BlockBasic oreKunzite = new BlockBasic("oreKunzite", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemKunzite);
	public static final BlockBasic oreLead = new BlockBasic("oreLead", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreLunar = new BlockBasic("oreLunar", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic oreMalagnite = new BlockBasic("oreMalagnite", Material.rock, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic oreManganese = new BlockBasic("oreManganese", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreMithril = new BlockBasic("oreMithril", Material.rock, TMCreativeTabs.block, 3, 6);
	public static final BlockBasic oreNickel = new BlockBasic("oreNickel", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreOnyx = new BlockBasic("oreOnyx", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic orePlatinum = new BlockBasic("orePlatinum", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic orePlutonium = new BlockBasic("orePlutonium", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.plutonium);
	public static final BlockBasic oreRhodium = new BlockBasic("oreRhodium", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreRubium = new BlockBasic("oreRubium", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);
	public static final BlockBasic oreRuby = new BlockBasic("oreRuby", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemRuby);
	public static final BlockBasic oreRunite = new BlockBasic("oreRunite", Material.rock, TMCreativeTabs.block, 3, 6);	
	public static final BlockBasic oreSapphire = new BlockBasic("oreSapphire", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemSapphire);
	public static final BlockBasic oreSilicon = new BlockBasic("oreSilicon", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreSilver = new BlockBasic("oreSilver", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreTin = new BlockBasic("oreTin", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreTitanium = new BlockBasic("oreTitanium", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreTopaz = new BlockBasic("oreTopaz", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.gemTopaz);
	public static final BlockBasic oreTrytementium = new BlockBasic("oreTrytementium", Material.rock, TMCreativeTabs.block, 4, 3, ModItems.trytementium);
	public static final BlockBasic oreTungsten = new BlockBasic("oreTungsten", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreUranium = new BlockBasic("oreUranium", Material.rock, TMCreativeTabs.block, 1, 3, ModItems.uranium);
	public static final BlockBasic oreVoidium = new BlockBasic("oreVoidium", Material.rock, TMCreativeTabs.block, 4, 4, ModItems.voidium);
	public static final BlockBasic oreVoidiumBedrock = new BlockBasic("oreVoidiumBedrock", Material.rock, TMCreativeTabs.block, 4, 200, ModItems.voidium);
	public static final BlockBasic oreZinc = new BlockBasic("oreZinc", Material.rock, TMCreativeTabs.block, 1, 3);

	// Other blocks
	public static Block granite = new BlockBasic("granite", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block limestone = new BlockBasic("limestone", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block opal = new BlockBasic("opal", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.gemOnyx);

	// Compressed blocks
	public static Block compressedIronBlock = new BlockBasic("compressedIronBlock", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block compressedGoldBlock = new BlockBasic("compressedGoldBlock", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block compressedEmeraldBlock = new BlockBasic("compressedEmeraldBlock", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block compressedRubyBlock = new BlockBasic("compressedRubyBlock", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block compressedSapphireBlock = new BlockBasic("compressedSapphireBlock", Material.rock, TMCreativeTabs.block, 3, 6);
	public static Block compressedDiamondBlock = new BlockBasic("compressedDiamondBlock", Material.rock, TMCreativeTabs.block, 3, 6);

	// Machines
	public static Block compressor = new BlockCompressor(false).setBlockName("compressor");
	public static Block compressorActive = new BlockCompressor(true);
	public static Block battery = new BlockBattery().setBlockName("battery");
	
	// Pipes
	public static Block pipe = new BlockPipe().setBlockName("pipe");
	
	// Cables
	public static Block cableBasic = new BlockCable().setBlockName("cableBasic");
	
	// My Stuff, will sort later
	public static final BlockBasic blockOnyx = new BlockBasic("onyxBlock", Material.iron, TMCreativeTabs.block, 3, 6);
	public static final BlockBasic blockRuby = new BlockBasic("rubyBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSapphire = new BlockBasic("sapphireBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAmber = new BlockBasic("amberBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCitrine = new BlockBasic("citrineBlock", Material.iron, TMCreativeTabs.block, 3, 6);
	public static final BlockBasic blockJade = new BlockBasic("jadeBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAmethyst = new BlockBasic("amethystBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCarnelian = new BlockBasic("carnelianBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAmazonite = new BlockBasic("amazoniteBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockGarnet = new BlockBasic("garnetBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockKunzite = new BlockBasic("kunziteBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAquamarine = new BlockBasic("aquamarineBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTopaz = new BlockBasic("topazBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockDiamondGem = new BlockBasic("diamondGemBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockNetherQuartzGem = new BlockBasic("netherQuartzGemBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockVoidium = new BlockBasic("voidiumBlock", Material.iron, TMCreativeTabs.block, 4, 4);
	public static final BlockBasic blockFyrestone = new BlockBasic("fyrestoneBlock", Material.iron, TMCreativeTabs.block, 3, 3, 1.0f);
	public static final BlockBasic blockTin = new BlockBasic("tinBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockCopper = new BlockBasic("copperBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockSilver = new BlockBasic("silverBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockLead = new BlockBasic("leadBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockPlatinum = new BlockBasic("platinumBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockZinc = new BlockBasic("zincBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockAluminium = new BlockBasic("aluminiumBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockTitanium = new BlockBasic("titaniumBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockIridium = new BlockBasic("iridiumBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockUranium = new BlockBasic("uraniumBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockBronze = new BlockBasic("bronzeBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSteel = new BlockBasic("steelBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockElectrum = new BlockBasic("electrumBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockBrass = new BlockBasic("brassBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockMalagnite = new BlockBasic("malagniteBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockTrytementium = new BlockBasic("trytementiumBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockUnobtanium = new BlockBasic("unobtaniumBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockPlutonium = new BlockBasic("plutoniumBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSolder = new BlockBasic("solderBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockInvar = new BlockBasic("invarBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockNickel = new BlockBasic("nickelBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockChromium = new BlockBasic("chromiumBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockObsidian = new BlockBasic("obsidianBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockCobalt = new BlockBasic("cobaltBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTungsten = new BlockBasic("tungstenBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockRhodium = new BlockBasic("rhodiumBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockGoloid = new BlockBasic("goloidBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockManganese = new BlockBasic("manganeseBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSilicon = new BlockBasic("siliconBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	
	public static final BlockBasic blockPureObsidian = new BlockBasic("pureObsidianBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockEnrichedObsidian = new BlockBasic("enrichedObsidianBlock", Material.iron, TMCreativeTabs.block, 2, 3);
		
	public static final BlockBasic fossil = new BlockBasic("fossil", Material.rock, TMCreativeTabs.block, 0, 3, Items.bone);
	public static final BlockBasic fossilSkull = new BlockBasic("fossilSkull", Material.rock, TMCreativeTabs.block, 0, 3, ModItems.fossil);
	
	public static final BlockBasicLeaf cherryLeaves = new BlockBasicLeaf("cherryLeaves", Material.leaves, TMCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog cherryWood = new BlockBasicLog("cherryWood", Material.wood, TMCreativeTabs.block, 0, 2);
	public static final BlockBasic cherryPlanks = new BlockBasic("cherryPlanks", Material.wood, TMCreativeTabs.block, 0, 2);
	public static final BlockBasicStairs cherryStairs = new BlockBasicStairs("cherryStairs", TMCreativeTabs.block, 0, 2, cherryPlanks, 0);
	public static final BlockBasicSlab cherrySlab = new BlockBasicSlab("cherrySlab", Material.wood, TMCreativeTabs.block, 0, 2, cherryPlanks, 0, false);
	public static final BlockBasicSlab cherryDoubleSlab = new BlockBasicSlab("cherryDoubleSlab", Material.wood, null, 0, 2, cherryPlanks, 0, true, cherrySlab);
	public static final BlockBasicSapling cherrySapling = new BlockBasicSapling("cherrySapling", Material.plants, TMCreativeTabs.block, 0, 0, cherryWood, cherryLeaves);
	
	public static final BlockBasicLeaf rubberLeaves = new BlockBasicLeaf("rubberLeaves", Material.leaves, TMCreativeTabs.block, 0, 0.2f, true);
	public static final BlockRubberLog rubberWood = new BlockRubberLog("rubberWood", Material.wood, TMCreativeTabs.block, 0, 2);
	public static final BlockBasic rubberPlanks = new BlockBasic("rubberPlanks", Material.wood, TMCreativeTabs.block, 0, 2);
	public static final BlockBasicStairs rubberStairs = new BlockBasicStairs("rubberStairs", TMCreativeTabs.block, 0, 2, rubberPlanks, 0);
	public static final BlockBasicSlab rubberSlab = new BlockBasicSlab("rubberSlab", Material.wood, TMCreativeTabs.block, 0, 2, rubberPlanks, 0, false);
	public static final BlockBasicSlab rubberDoubleSlab = new BlockBasicSlab("rubberDoubleSlab", Material.wood, null, 0, 2, rubberPlanks, 0, true, rubberSlab);
	public static final BlockBasicSapling rubberSapling = new BlockBasicSapling("rubberSapling", Material.plants, TMCreativeTabs.block, 0, 0, rubberWood, rubberLeaves);
	
	public static final BlockBasic machineBlock = new BlockBasic("machineBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockSteel = new BlockBasic("machineBlockSteel", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockStrengthened = new BlockBasic("machineBlockStrengthened", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockReinforced = new BlockBasic("machineBlockReinforced", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockImbued = new BlockBasic("machineBlockImbued", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic machineBlockFluxed = new BlockBasic("machineBlockFluxed", Material.iron, TMCreativeTabs.block, 2, 3);
	
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
		GameRegistry.registerBlock(orePlatinum, orePlatinum.getUnlocalizedName());
		GameRegistry.registerBlock(orePlutonium, orePlutonium.getUnlocalizedName());
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
		GameRegistry.registerBlock(opal, opal.getUnlocalizedName());

		// Compressed blocks
		GameRegistry.registerBlock(compressedIronBlock, compressedIronBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedGoldBlock, compressedGoldBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedEmeraldBlock, compressedEmeraldBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedRubyBlock, compressedRubyBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedSapphireBlock, compressedSapphireBlock.getUnlocalizedName());
		GameRegistry.registerBlock(compressedDiamondBlock, compressedDiamondBlock.getUnlocalizedName());

		// Machines
		GameRegistry.registerBlock(compressor, compressor.getUnlocalizedName());
		GameRegistry.registerBlock(compressorActive, compressorActive.getUnlocalizedName());
		GameRegistry.registerBlock(battery, battery.getUnlocalizedName());
		
		// Pipes
		GameRegistry.registerBlock(pipe, pipe.getUnlocalizedName());
		
		// Cables
		GameRegistry.registerBlock(cableBasic, cableBasic.getUnlocalizedName());
		
		// My Stuff, will sort and clean up later
		GameRegistry.registerBlock(blockOnyx, "onyxBlock");
		GameRegistry.registerBlock(blockRuby, "rubyBlock");
		GameRegistry.registerBlock(blockSapphire, "sapphireBlock");
		GameRegistry.registerBlock(blockAmber, "amberBlock");
		GameRegistry.registerBlock(blockCitrine, "citrineBlock");
		GameRegistry.registerBlock(blockJade, "jadeBlock");
		GameRegistry.registerBlock(blockAmethyst, "amethystBlock");
		GameRegistry.registerBlock(blockCarnelian, "carnelianBlock");
		GameRegistry.registerBlock(blockAmazonite, "amazoniteBlock");
		GameRegistry.registerBlock(blockGarnet, "garnetBlock");
		GameRegistry.registerBlock(blockKunzite, "kunziteBlock");
		GameRegistry.registerBlock(blockAquamarine, "aquamarineBlock");
		GameRegistry.registerBlock(blockDiamondGem, "diamondGemBlock");
		GameRegistry.registerBlock(blockNetherQuartzGem, "netherQuartzGemBlock");
		GameRegistry.registerBlock(blockVoidium, "voidiumBlock");
		GameRegistry.registerBlock(blockFyrestone, "fyrestoneBlock");
		GameRegistry.registerBlock(blockTin, "tinBlock");
		GameRegistry.registerBlock(blockCopper, "copperBlock");
		GameRegistry.registerBlock(blockSilver, "silverBlock");
		GameRegistry.registerBlock(blockLead, "leadBlock");
		GameRegistry.registerBlock(blockPlatinum, "platinumBlock");
		GameRegistry.registerBlock(blockBronze, "bronzeBlock");
		GameRegistry.registerBlock(blockSteel, "steelBlock");
		GameRegistry.registerBlock(blockElectrum, "electrumBlock");
		GameRegistry.registerBlock(blockMalagnite, "malagniteBlock");
		GameRegistry.registerBlock(blockTrytementium, "trytementiumBlock");
		GameRegistry.registerBlock(blockTitanium, "titaniumBlock");
		GameRegistry.registerBlock(blockIridium, "iridiumBlock");
		GameRegistry.registerBlock(blockUranium, "uraniumBlock");
		GameRegistry.registerBlock(blockAluminium, "aluminiumBlock");
		GameRegistry.registerBlock(blockZinc, "zincBlock");
		GameRegistry.registerBlock(blockTopaz, "topazBlock");
		GameRegistry.registerBlock(blockBrass, "brassBlock");
		GameRegistry.registerBlock(blockUnobtanium, "unobtaniumBlock");
		GameRegistry.registerBlock(blockPlutonium, "plutoniumBlock");
		GameRegistry.registerBlock(blockSolder, "solderBlock");
		GameRegistry.registerBlock(blockInvar, "invarBlock");
		GameRegistry.registerBlock(blockNickel, "nickelBlock");
		GameRegistry.registerBlock(blockObsidian, blockObsidian.getUnlocalizedName());
		GameRegistry.registerBlock(blockChromium, "chromiumBlock");
		GameRegistry.registerBlock(blockCobalt, "cobaltBlock");
		GameRegistry.registerBlock(blockTungsten, "tungstenBlock");
		GameRegistry.registerBlock(blockRhodium, "rhodiumBlock");
		GameRegistry.registerBlock(blockGoloid, "goloidBlock");
		GameRegistry.registerBlock(blockManganese, "manganeseBlock");
		GameRegistry.registerBlock(blockSilicon, "siliconBlock");
		
		GameRegistry.registerBlock(blockPureObsidian, blockPureObsidian.getUnlocalizedName());
		GameRegistry.registerBlock(blockEnrichedObsidian, blockEnrichedObsidian.getUnlocalizedName());
		
		GameRegistry.registerBlock(fossil, "fossil");
		GameRegistry.registerBlock(fossilSkull, "fossilSkull");
		
		GameRegistry.registerBlock(cherryLeaves, "cherryLeaves");
		GameRegistry.registerBlock(cherryWood, "cherryWood");
		GameRegistry.registerBlock(cherryPlanks, "cherryPlanks");
		GameRegistry.registerBlock(cherryStairs, "cherryStairs");
		GameRegistry.registerBlock(cherrySlab, "cherrySlab");
		GameRegistry.registerBlock(cherryDoubleSlab, "cherryDoubleSlab");
		GameRegistry.registerBlock(cherrySapling, "cherrySapling");
		
		GameRegistry.registerBlock(rubberLeaves, "rubberLeaves");
		GameRegistry.registerBlock(rubberWood, "rubberWood");
		GameRegistry.registerBlock(rubberPlanks, "rubberPlanks");
		GameRegistry.registerBlock(rubberStairs, "rubberStairs");
		GameRegistry.registerBlock(rubberSlab, "rubberSlab");
		GameRegistry.registerBlock(rubberDoubleSlab, "rubberDoubleSlab");
		GameRegistry.registerBlock(rubberSapling, "rubberSapling");
		
		GameRegistry.registerBlock(machineBlock, machineBlock.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockSteel, machineBlockSteel.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockStrengthened, machineBlockStrengthened.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockReinforced, machineBlockReinforced.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockImbued, machineBlockImbued.getUnlocalizedName());
		GameRegistry.registerBlock(machineBlockFluxed, machineBlockFluxed.getUnlocalizedName());
		
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
