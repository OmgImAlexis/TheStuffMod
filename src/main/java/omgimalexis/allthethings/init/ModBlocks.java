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
import omgimalexis.allthethings.block.BlockCompressor;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	// Ores
	public static final BlockBasic oreAdamanite = new BlockBasic("oreAdamanite", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic oreAluminium = new BlockBasic("aluminiumOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreAmazonite = new BlockBasic("amazoniteOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.amazonite);
	public static final BlockBasic oreAmethyst = new BlockBasic("amethystOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.amethyst);
	public static final BlockBasic oreAquamarine = new BlockBasic("aquamarineOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.aquamarine);
	public static final BlockBasic oreBlurite = new BlockBasic("oreBlurite", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic oreCarnelian = new BlockBasic("carnelianOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.carnelian);
	public static final BlockBasic oreChromium = new BlockBasic("chromiumOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreCitrine = new BlockBasic("citrineOre", Material.rock, TMCreativeTabs.block, 3, 3, ModItems.citrine);
	public static final BlockBasic oreCobalt = new BlockBasic("cobaltOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreCopper = new BlockBasic("copperOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreDaeyalt = new BlockBasic("oreDaeyalt", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic oreFyrestone = new BlockBasic("fyrestoneOre", Material.rock, TMCreativeTabs.block, 3, 3, 1.0f, ModItems.fyrestone);
	public static final BlockBasic oreGarnet = new BlockBasic("garnetOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.garnet);
	public static final BlockBasic oreIridium = new BlockBasic("iridiumOre", Material.rock, TMCreativeTabs.block, 1, 3, ModItems.iridium);
	public static final BlockBasic oreJade = new BlockBasic("jadeOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.jade);
	public static final BlockBasic oreKunzite = new BlockBasic("kunziteOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.kunzite);
	public static final BlockBasic oreLead = new BlockBasic("leadOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreLunar = new BlockBasic("oreLunar", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic oreMalagnite = new BlockBasic("malagniteOre", Material.rock, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic oreManganese = new BlockBasic("manganeseOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreMithril = new BlockBasic("oreMithril", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic oreNickel = new BlockBasic("nickelOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreOnyx = new BlockBasic("onyxOre", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic orePlatinum = new BlockBasic("platinumOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic orePlutonium = new BlockBasic("plutoniumOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.plutonium);
	public static final BlockBasic oreRhodium = new BlockBasic("rhodiumOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreRubium = new BlockBasic("oreRubium", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic oreRuby = new BlockBasic("rubyOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.ruby);
	public static final BlockBasic oreRunite = new BlockBasic("oreRunite", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);	
	public static final BlockBasic oreSapphire = new BlockBasic("sapphireOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.sapphire);
	public static final BlockBasic oreSilicon = new BlockBasic("siliconOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreSilver = new BlockBasic("silverOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreTin = new BlockBasic("tinOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreTitanium = new BlockBasic("titaniumOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic oreTopaz = new BlockBasic("topazOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.topaz);
	public static final BlockBasic oreTrytementium = new BlockBasic("trytementiumOre", Material.rock, TMCreativeTabs.block, 4, 3, ModItems.trytementium);
	public static final BlockBasic oreTungsten = new BlockBasic("tungstenOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic oreUranium = new BlockBasic("uraniumOre", Material.rock, TMCreativeTabs.block, 1, 3, ModItems.uranium);
	public static final BlockBasic oreVoidium = new BlockBasic("voidiumOre", Material.rock, TMCreativeTabs.block, 4, 4, ModItems.voidium);
	public static final BlockBasic oreVoidiumBedrock = new BlockBasic("voidiumOreBedrock", Material.rock, TMCreativeTabs.block, 4, 200, ModItems.voidium);
	public static final BlockBasic oreZinc = new BlockBasic("zincOre", Material.rock, TMCreativeTabs.block, 1, 3);

	// EVERYTHING IN HERE NEEDS TO BE GIVEN A DROP AND HARDNESS ----------------#####################
	//
	//
	// Other blocks
	public static Block amber = new BlockBasic("amber", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block granite = new BlockBasic("granite", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block limestone = new BlockBasic("limestone", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block opal = new BlockBasic("opal", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);

	// Compressed blocks
	public static Block compressedIronBlock = new BlockBasic("compressedIronBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block compressedGoldBlock = new BlockBasic("compressedGoldBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block compressedEmeraldBlock = new BlockBasic("compressedEmeraldBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block compressedRubyBlock = new BlockBasic("compressedRubyBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block compressedSapphireBlock = new BlockBasic("compressedSapphireBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block compressedDiamondBlock = new BlockBasic("compressedDiamondBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);

	// Blocks
	public static Block rubyBlock = new BlockBasic("rubyBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static Block sapphireBlock = new BlockBasic("sapphireBlock", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);

	// Machines
	public static Block compressor = new BlockCompressor(false).setBlockName("compressor");
	public static Block compressorActive = new BlockCompressor(true);
	//
	//
	// EVERYTHING IN HERE NEEDS TO BE GIVEN A DROP AND HARDNESS ----------------#####################
	
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
	public static final BlockBasic blockCobalt = new BlockBasic("cobaltBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockTungsten = new BlockBasic("tungstenBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockRhodium = new BlockBasic("rhodiumBlock", Material.iron, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic blockGoloid = new BlockBasic("goloidBlock", Material.iron, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic blockManganese = new BlockBasic("manganeseBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic blockSilicon = new BlockBasic("siliconBlock", Material.iron, TMCreativeTabs.block, 2, 3);
		
	public static final BlockBasic fossil = new BlockBasic("fossil", Material.rock, TMCreativeTabs.block, 0, 3, Items.bone);
	public static final BlockBasic fossilSkull = new BlockBasic("fossilSkull", Material.rock, TMCreativeTabs.block, 0, 3, Items.bone);
	
	public static final BlockBasicLeaf cherryLeaves = new BlockBasicLeaf("cherryLeaves", Material.leaves, TMCreativeTabs.block, 0, 0.2f, true);
	public static final BlockBasicLog cherryWood = new BlockBasicLog("cherryWood", Material.wood, TMCreativeTabs.block, 0, 2);
	public static final BlockBasic cherryPlanks = new BlockBasic("cherryPlanks", Material.wood, TMCreativeTabs.block, 0, 2);
	public static final BlockBasicStairs cherryStairs = new BlockBasicStairs("cherryStairs", TMCreativeTabs.block, 0, 2, cherryPlanks, 0);
	public static final BlockBasicSlab cherrySlab = new BlockBasicSlab("cherrySlab", Material.wood, TMCreativeTabs.block, 0, 2, cherryPlanks, 0, false);
	public static final BlockBasicSlab cherryDoubleSlab = new BlockBasicSlab("cherryDoubleSlab", Material.wood, null, 0, 2, cherryPlanks, 0, true, cherrySlab);
	public static final BlockBasicSapling cherrySapling = new BlockBasicSapling("cherrySapling", Material.plants, TMCreativeTabs.block, 0, 0);
	
	public static final BlockBasic machineBlock = new BlockBasic("machineBlock", Material.iron, TMCreativeTabs.block, 2, 3);
	
	public static final BlockBasicFluid moltenIron = new BlockBasicFluid(ModFluids.moltenIronFluid, Material.lava, "ironMolten");

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

		// Blocks
		GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName());
		GameRegistry.registerBlock(sapphireBlock, sapphireBlock.getUnlocalizedName());

		// Machines
		GameRegistry.registerBlock(compressor, compressor.getUnlocalizedName());
		GameRegistry.registerBlock(compressorActive, compressorActive.getUnlocalizedName());
		
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
		GameRegistry.registerBlock(blockChromium, "chromiumBlock");
		GameRegistry.registerBlock(blockCobalt, "cobaltBlock");
		GameRegistry.registerBlock(blockTungsten, "tungstenBlock");
		GameRegistry.registerBlock(blockRhodium, "rhodiumBlock");
		GameRegistry.registerBlock(blockGoloid, "goloidBlock");
		GameRegistry.registerBlock(blockManganese, "manganeseBlock");
		GameRegistry.registerBlock(blockSilicon, "siliconBlock");
		
		GameRegistry.registerBlock(fossil, "fossil");
		GameRegistry.registerBlock(fossilSkull, "fossilSkull");
		
		GameRegistry.registerBlock(cherryLeaves, "cherryLeaves");
		GameRegistry.registerBlock(cherryWood, "cherryWood");
		GameRegistry.registerBlock(cherryPlanks, "cherryPlanks");
		GameRegistry.registerBlock(cherryStairs, "cherryStairs");
		GameRegistry.registerBlock(cherrySlab, "cherrySlab");
		GameRegistry.registerBlock(cherryDoubleSlab, "cherryDoubleSlab");
		GameRegistry.registerBlock(cherrySapling, "cherrySapling");
		
		GameRegistry.registerBlock(machineBlock, "machineBlock");
		
		GameRegistry.registerBlock(moltenIron, "moltenIron");
	}
}
