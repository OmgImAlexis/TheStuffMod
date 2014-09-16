package omgimalexis.allthethings.block;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks extends Blocks {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	// Ores
	public static Block oreAdamanite;
	public static Block oreAmathyst;
	public static Block oreBlurite;
	public static Block oreCarnelian;
	public static Block oreCitrine;
	public static Block oreCopper;
	public static Block oreDaeyalt;
	public static Block oreJade;
	public static Block oreLunar;
	public static Block oreMithril;
	public static Block oreOnyx;
	public static Block oreRubium;
	public static Block oreRuby;
	public static Block oreRunite;
	public static Block oreSapphire;
	public static Block oreSilver;
	public static Block oreTin;
	public static Block oreTopaz;

	// Other blocks
	public static Block amber;
	public static Block granite;
	public static Block limestone;
	public static Block opal;

	// Compressed blocks
	public static Block compressed_iron_block;
	public static Block compressed_gold_block;
	public static Block compressed_emerald_block;
	public static Block compressed_ruby_block;
	public static Block compressed_sapphire_block;
	public static Block compressed_diamond_block;

	// Blocks
	public static Block ruby_block;
	public static Block sapphire_block;

	// Machines
	public static Block dark_matter_furnace;
	public static Block dark_matter_furnace_active;

	public static void initialiseBlock() {

		// Ores
		oreAdamanite = new ModBlockOre().setBlockName("oreAdamanite");
		oreAmathyst = new ModBlockOre().setBlockName("oreAmathyst");
		oreBlurite = new ModBlockOre().setBlockName("oreBlurite");
		oreCarnelian = new ModBlockOre().setBlockName("oreCarnelian");
		oreCitrine = new ModBlockOre().setBlockName("oreCitrine");
		oreCopper = new ModBlockOre().setBlockName("oreCopper");
		oreDaeyalt = new ModBlockOre().setBlockName("oreDaeyalt");
		oreJade = new ModBlockOre().setBlockName("oreJade");
		oreLunar = new ModBlockOre().setBlockName("oreLunar");
		oreMithril = new ModBlockOre().setBlockName("oreMithril");
		oreOnyx = new ModBlockOre().setBlockName("oreOnyx");
		oreRubium = new ModBlockOre().setBlockName("oreRubium");
		oreRuby = new ModBlockOre().setBlockName("oreRuby");
		oreRunite = new ModBlockOre().setBlockName("oreRunite");
		oreSapphire = new ModBlockOre().setBlockName("oreSapphire");
		oreSilver = new ModBlockOre().setBlockName("oreSilver");
		oreTin = new ModBlockOre().setBlockName("oreTin");
		oreTopaz = new ModBlockOre().setBlockName("oreTopaz");

		// Other blocks
		granite = new ModBlockOre().setBlockName("granite");
		limestone = new ModBlockOre().setBlockName("limestone");
		opal = new ModBlockOre().setBlockName("opal");

		// Compressed blocks
		compressed_iron_block = new ModBlockOre().setBlockName("compressed_iron_block");
		compressed_gold_block = new ModBlockOre().setBlockName("compressed_gold_block");
		compressed_emerald_block = new ModBlockOre().setBlockName("compressed_emerald_block");
		compressed_ruby_block = new ModBlockOre().setBlockName("compressed_ruby_block");
		compressed_sapphire_block = new ModBlockOre().setBlockName("compressed_sapphire_block");
		compressed_diamond_block = new ModBlockOre().setBlockName("compressed_diamond_block");

		// Blocks
		ruby_block = new ModBlockOre().setBlockName("ruby_block");
		sapphire_block = new ModBlockOre().setBlockName("sapphire_block");

		// Machines
		dark_matter_furnace = new DarkMatterFurnace(false).setBlockName("dark_matter_furnace");
		dark_matter_furnace_active = new DarkMatterFurnace(true);
	}

	public static void registerBlock() {

		// Ores
		GameRegistry.registerBlock(oreAdamanite, oreAdamanite.getUnlocalizedName());
		GameRegistry.registerBlock(oreAmathyst, oreAmathyst.getUnlocalizedName());
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
		GameRegistry.registerBlock(compressed_iron_block, compressed_iron_block.getUnlocalizedName());
		GameRegistry.registerBlock(compressed_gold_block, compressed_gold_block.getUnlocalizedName());
		GameRegistry.registerBlock(compressed_emerald_block, compressed_emerald_block.getUnlocalizedName());
		GameRegistry.registerBlock(compressed_ruby_block, compressed_ruby_block.getUnlocalizedName());
		GameRegistry.registerBlock(compressed_sapphire_block, compressed_sapphire_block.getUnlocalizedName());
		GameRegistry.registerBlock(compressed_diamond_block, compressed_diamond_block.getUnlocalizedName());

		// Blocks
		GameRegistry.registerBlock(ruby_block, ruby_block.getUnlocalizedName());
		GameRegistry.registerBlock(sapphire_block, sapphire_block.getUnlocalizedName());

		// Machines
		GameRegistry.registerBlock(dark_matter_furnace, dark_matter_furnace.getUnlocalizedName());
		GameRegistry.registerBlock(dark_matter_furnace_active, dark_matter_furnace_active.getUnlocalizedName());
	}
}
