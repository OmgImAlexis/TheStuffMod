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
	public static Block oreAdamanite = new ModBlockOre().setBlockName("oreAdamanite");
	public static Block oreAmethyst = new ModBlockOre().setBlockName("oreAmethyst");
	public static Block oreBlurite = new ModBlockOre().setBlockName("oreBlurite");
	public static Block oreCarnelian = new ModBlockOre().setBlockName("oreCarnelian");
	public static Block oreCitrine = new ModBlockOre().setBlockName("oreCitrine");
	public static Block oreCopper = new ModBlockOre().setBlockName("oreCopper");
	public static Block oreDaeyalt = new ModBlockOre().setBlockName("oreDaeyalt");
	public static Block oreJade = new ModBlockOre().setBlockName("oreJade");
	public static Block oreLunar = new ModBlockOre().setBlockName("oreLunar");
	public static Block oreMithril = new ModBlockOre().setBlockName("oreMithril");
	public static Block oreOnyx = new ModBlockOre().setBlockName("oreOnyx");
	public static Block oreRubium = new ModBlockOre().setBlockName("oreRubium");
	public static Block oreRuby = new ModBlockOre().setBlockName("oreRuby");
	public static Block oreRunite = new ModBlockOre().setBlockName("oreRunite");
	public static Block oreSapphire = new ModBlockOre().setBlockName("oreSapphire");
	public static Block oreSilver = new ModBlockOre().setBlockName("oreSilver");
	public static Block oreTin = new ModBlockOre().setBlockName("oreTin");
	public static Block oreTopaz = new ModBlockOre().setBlockName("oreTopaz");

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
	
	public static final BlockBasic onyxOre = new BlockBasic("onyxOre", Material.rock, TMCreativeTabs.block, 3, 6, ModItems.onyx);
	public static final BlockBasic rubyOre = new BlockBasic("rubyOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.ruby);
	public static final BlockBasic sapphireOre = new BlockBasic("sapphireOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.sapphire);
	public static final BlockBasic citrineOre = new BlockBasic("citrineOre", Material.rock, TMCreativeTabs.block, 3, 3, ModItems.citrine);
	public static final BlockBasic jadeOre = new BlockBasic("jadeOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.jade);
	public static final BlockBasic amethystOre = new BlockBasic("amethystOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.amethyst);
	public static final BlockBasic carnelianOre = new BlockBasic("carnelianOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.carnelian);
	public static final BlockBasic amazoniteOre = new BlockBasic("amazoniteOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.amazonite);
	public static final BlockBasic garnetOre = new BlockBasic("garnetOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.garnet);
	public static final BlockBasic kunziteOre = new BlockBasic("kunziteOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.kunzite);
	public static final BlockBasic aquamarineOre = new BlockBasic("aquamarineOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.aquamarine);
	public static final BlockBasic voidiumOre = new BlockBasic("voidiumOre", Material.rock, TMCreativeTabs.block, 4, 4, ModItems.voidium);
	public static final BlockBasic voidiumBedrockOre = new BlockBasic("voidiumOreBedrock", Material.rock, TMCreativeTabs.block, 4, 200, ModItems.voidium);
	public static final BlockBasic fyrestoneOre = new BlockBasic("fyrestoneOre", Material.rock, TMCreativeTabs.block, 3, 3, 1.0f, ModItems.fyrestone);
	public static final BlockBasic tinOre = new BlockBasic("tinOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic copperOre = new BlockBasic("copperOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic silverOre = new BlockBasic("silverOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic leadOre = new BlockBasic("leadOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic platinumOre = new BlockBasic("platinumOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic malagniteOre = new BlockBasic("malagniteOre", Material.rock, TMCreativeTabs.block, 3, 3);
	public static final BlockBasic trytementiumOre = new BlockBasic("trytementiumOre", Material.rock, TMCreativeTabs.block, 4, 3, ModItems.trytementium);
	public static final BlockBasic titaniumOre = new BlockBasic("titaniumOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic iridiumOre = new BlockBasic("iridiumOre", Material.rock, TMCreativeTabs.block, 1, 3, ModItems.iridium);
	public static final BlockBasic uraniumOre = new BlockBasic("uraniumOre", Material.rock, TMCreativeTabs.block, 1, 3, ModItems.uranium);
	public static final BlockBasic aluminiumOre = new BlockBasic("aluminiumOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic zincOre = new BlockBasic("zincOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic topazOre = new BlockBasic("topazOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.topaz);
	public static final BlockBasic plutoniumOre = new BlockBasic("plutoniumOre", Material.rock, TMCreativeTabs.block, 2, 3, ModItems.plutonium);
	public static final BlockBasic nickelOre = new BlockBasic("nickelOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic chromiumOre = new BlockBasic("chromiumOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic cobaltOre = new BlockBasic("cobaltOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic tungstenOre = new BlockBasic("tungstenOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic rhodiumOre = new BlockBasic("rhodiumOre", Material.rock, TMCreativeTabs.block, 1, 3);
	public static final BlockBasic manganeseOre = new BlockBasic("manganeseOre", Material.rock, TMCreativeTabs.block, 2, 3);
	public static final BlockBasic siliconOre = new BlockBasic("siliconOre", Material.rock, TMCreativeTabs.block, 2, 3);
	
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
		GameRegistry.registerBlock(oreAmethyst, oreAmethyst.getUnlocalizedName());
		GameRegistry.registerBlock(oreBlurite, oreBlurite.getUnlocalizedName());
		GameRegistry.registerBlock(oreCarnelian, oreCarnelian.getUnlocalizedName());
		GameRegistry.registerBlock(oreCitrine, oreCitrine.getUnlocalizedName());
		GameRegistry.registerBlock(oreCopper, oreCopper.getUnlocalizedName());
		GameRegistry.registerBlock(oreDaeyalt, oreDaeyalt.getUnlocalizedName());
		GameRegistry.registerBlock(oreJade, oreJade.getUnlocalizedName());
		GameRegistry.registerBlock(oreLunar, oreLunar.getUnlocalizedName());
		GameRegistry.registerBlock(oreMithril, oreMithril.getUnlocalizedName());
		GameRegistry.registerBlock(oreOnyx, oreOnyx.getUnlocalizedName());
		GameRegistry.registerBlock(oreRubium, oreRubium.getUnlocalizedName());
		GameRegistry.registerBlock(oreRuby, oreRuby.getUnlocalizedName());
		GameRegistry.registerBlock(oreRunite, oreRunite.getUnlocalizedName());
		GameRegistry.registerBlock(oreSapphire, oreSapphire.getUnlocalizedName());
		GameRegistry.registerBlock(oreSilver, oreSilver.getUnlocalizedName());
		GameRegistry.registerBlock(oreTin, oreTin.getUnlocalizedName());
		GameRegistry.registerBlock(oreTopaz, oreTopaz.getUnlocalizedName());

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
		
		GameRegistry.registerBlock(onyxOre, "onyxOre");
		GameRegistry.registerBlock(rubyOre, "rubyOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");
		GameRegistry.registerBlock(citrineOre, "citrineOre");
		GameRegistry.registerBlock(jadeOre, "jadeOre");
		GameRegistry.registerBlock(amethystOre, "amethystOre");
		GameRegistry.registerBlock(carnelianOre, "carnelianOre");
		GameRegistry.registerBlock(amazoniteOre, "amazoniteOre");
		GameRegistry.registerBlock(garnetOre, "garnetOre");
		GameRegistry.registerBlock(kunziteOre, "kunziteOre");
		GameRegistry.registerBlock(aquamarineOre, "aquamarineOre");
		GameRegistry.registerBlock(voidiumOre, "voidiumOre");
		GameRegistry.registerBlock(voidiumBedrockOre, "voidiumOreBedrock");
		GameRegistry.registerBlock(fyrestoneOre, "fyrestoneOre");
		GameRegistry.registerBlock(tinOre, "tinOre");
		GameRegistry.registerBlock(copperOre, "copperOre");
		GameRegistry.registerBlock(silverOre, "silverOre");
		GameRegistry.registerBlock(leadOre, "leadOre");
		GameRegistry.registerBlock(platinumOre, "platinumOre");
		GameRegistry.registerBlock(malagniteOre, "malagniteOre");
		GameRegistry.registerBlock(trytementiumOre, "trytementiumOre");
		GameRegistry.registerBlock(titaniumOre, "titaniumOre");
		GameRegistry.registerBlock(iridiumOre, "iridiumOre");
		GameRegistry.registerBlock(uraniumOre, "uraniumOre");
		GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
		GameRegistry.registerBlock(zincOre, "zincOre");
		GameRegistry.registerBlock(topazOre, "topazOre");
		GameRegistry.registerBlock(plutoniumOre, "plutoniumOre");
		GameRegistry.registerBlock(nickelOre, "nickelOre");
		GameRegistry.registerBlock(chromiumOre, "chromiumOre");
		GameRegistry.registerBlock(cobaltOre, "cobaltOre");
		GameRegistry.registerBlock(tungstenOre, "tungstenOre");
		GameRegistry.registerBlock(rhodiumOre, "rhodiumOre");
		GameRegistry.registerBlock(manganeseOre, "manganeseOre");
		GameRegistry.registerBlock(siliconOre, "siliconOre");
		
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
