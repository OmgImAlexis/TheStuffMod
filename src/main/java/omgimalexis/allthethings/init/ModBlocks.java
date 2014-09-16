package omgimalexis.allthethings.init;

import omgimalexis.allthethings.block.BlockBasic;
import omgimalexis.allthethings.block.BlockBasicFluid;
import omgimalexis.allthethings.block.BlockBasicLeaf;
import omgimalexis.allthethings.block.BlockBasicLog;
import omgimalexis.allthethings.block.BlockBasicSapling;
import omgimalexis.allthethings.block.BlockBasicSided;
import omgimalexis.allthethings.block.BlockBasicSlab;
import omgimalexis.allthethings.block.BlockBasicStairs;
import omgimalexis.allthethings.block.Compressor;
import omgimalexis.allthethings.block.ModBlockOre;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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

	// Other blocks
	public static Block amber = new ModBlockOre().setBlockName("amber");
	public static Block granite = new ModBlockOre().setBlockName("granite");
	public static Block limestone = new ModBlockOre().setBlockName("limestone");
	public static Block opal = new ModBlockOre().setBlockName("opal");

	// Compressed blocks
	public static Block compressedIronBlock = new ModBlockOre().setBlockName("compressedIronBlock");
	public static Block compressedGoldBlock = new ModBlockOre().setBlockName("compressedGoldBlock");
	public static Block compressedEmeraldBlock = new ModBlockOre().setBlockName("compressedEmeraldBlock");
	public static Block compressedRubyBlock = new ModBlockOre().setBlockName("compressedRubyBlock");
	public static Block compressedSapphireBlock = new ModBlockOre().setBlockName("compressedSapphireBlock");
	public static Block compressedDiamondBlock = new ModBlockOre().setBlockName("compressedDiamondBlock");

	// Blocks
	public static Block rubyBlock = new ModBlockOre().setBlockName("rubyBlock");
	public static Block sapphireBlock = new ModBlockOre().setBlockName("sapphireBlock");

	// Machines
	public static Block compressor = new Compressor(false).setBlockName("compressor");
	public static Block compressorActive = new Compressor(true);
	
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
		GameRegistry.registerBlock(oreAluminium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreAmazonite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreAmethyst, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreAquamarine, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreBlurite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreCarnelian, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreChromium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreCitrine, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreCobalt, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreCopper, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreDaeyalt, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreFyrestone, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreGarnet, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreIridium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreJade, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreKunzite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreLead, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreLunar, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreMalagnite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreManganese, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreMithril, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreNickel, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreOnyx, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(orePlatinum, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(orePlutonium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreRhodium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreRubium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreRuby, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreRunite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreSapphire, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreSilicon, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreSilver, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreTin, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreTitanium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreTopaz, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreTrytementium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreTungsten, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreUranium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreVoidium, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreVoidiumBedrock, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreZinc, oreAdamanite.getUnlocalizedName());

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
