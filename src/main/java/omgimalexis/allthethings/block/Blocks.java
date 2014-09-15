package omgimalexis.allthethings.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;


public class Blocks extends net.minecraft.init.Blocks {

	public static void mainRegistry() {
		initialiseBlock();
		registerBlock();
	}

	// To be removed
	public static Block tutBlock;
	public static Block tutCrop;
	public static Block multiSided;
	
	// Ores
	public static Block adamanite_ore;
	public static Block blurite_ore;
	public static Block copper_ore;
	public static Block daeyalt_ore;
	public static Block lunar_ore;
	public static Block mithril_ore;
	public static Block rubium_ore;
	public static Block ruby_ore;
	public static Block runite_ore;
	public static Block sapphire_ore;
	public static Block silver_ore;
	public static Block tin_ore;
	public static Block topaz_ore;
	
	// Other blocks
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
		// To be removed
		tutBlock = new BlockBigBang().setBlockName("TutBlock").setCreativeTab(TMCreativeTabs.tabBlock);
		multiSided = new MultiSided(Material.ground).setBlockName("MultiSided").setCreativeTab(TMCreativeTabs.tabBlock);
		tutCrop = new TutCrop().setBlockName("TutCrop").setCreativeTab(TMCreativeTabs.tabBlock).setBlockTextureName(Strings.MODID + ":TutCrop");
	
		// Ores
		adamanite_ore = new BlockOre().setBlockName("adamanite_ore");
		blurite_ore = new BlockOre().setBlockName("blurite_ore");
		copper_ore = new BlockOre().setBlockName("copper_ore");
		daeyalt_ore = new BlockOre().setBlockName("daeyalt_ore");
		lunar_ore = new BlockOre().setBlockName("lunar_ore");
		mithril_ore = new BlockOre().setBlockName("mithril_ore");
		rubium_ore = new BlockOre().setBlockName("rubium_ore");
		ruby_ore = new BlockOre().setBlockName("ruby_ore");
		runite_ore = new BlockOre().setBlockName("runite_ore");
		sapphire_ore = new BlockOre().setBlockName("sapphire_ore");
		silver_ore = new BlockOre().setBlockName("silver_ore");
		tin_ore = new BlockOre().setBlockName("tin_ore");
		topaz_ore = new BlockOre().setBlockName("topaz_ore");
		
		// Other blocks
		granite = new BlockOre().setBlockName("granite");
		limestone = new BlockOre().setBlockName("limestone");
		opal = new BlockOre().setBlockName("opal");
		
		// Compressed blocks
		compressed_iron_block = new BlockOre().setBlockName("compressed_iron_block");
		compressed_gold_block = new BlockOre().setBlockName("compressed_gold_block");
		compressed_emerald_block = new BlockOre().setBlockName("compressed_emerald_block");
		compressed_ruby_block = new BlockOre().setBlockName("compressed_ruby_block");
		compressed_sapphire_block = new BlockOre().setBlockName("compressed_sapphire_block");
		compressed_diamond_block = new BlockOre().setBlockName("compressed_diamond_block");
		
		// Blocks
		ruby_block = new BlockOre().setBlockName("ruby_block");
		sapphire_block = new BlockOre().setBlockName("sapphire_block");
		
		// Machines
		dark_matter_furnace = new DarkMatterFurnace(false).setBlockName("dark_matter_furnace");
		dark_matter_furnace_active = new DarkMatterFurnace(true);
	}

	public static void registerBlock() {
		// To be removed
		GameRegistry.registerBlock(tutBlock, tutBlock.getUnlocalizedName());
		GameRegistry.registerBlock(multiSided, multiSided.getUnlocalizedName());
		GameRegistry.registerBlock(tutCrop, tutCrop.getUnlocalizedName());

		// Ores
		GameRegistry.registerBlock(adamanite_ore, adamanite_ore.getUnlocalizedName());
		GameRegistry.registerBlock(blurite_ore, blurite_ore.getUnlocalizedName());
		GameRegistry.registerBlock(copper_ore, copper_ore.getUnlocalizedName());
		GameRegistry.registerBlock(daeyalt_ore, daeyalt_ore.getUnlocalizedName());
		GameRegistry.registerBlock(lunar_ore, lunar_ore.getUnlocalizedName());
		GameRegistry.registerBlock(mithril_ore, mithril_ore.getUnlocalizedName());
		GameRegistry.registerBlock(rubium_ore, rubium_ore.getUnlocalizedName());
		GameRegistry.registerBlock(ruby_ore, ruby_ore.getUnlocalizedName());
		GameRegistry.registerBlock(runite_ore, runite_ore.getUnlocalizedName());
		GameRegistry.registerBlock(sapphire_ore, sapphire_ore.getUnlocalizedName());
		GameRegistry.registerBlock(silver_ore, silver_ore.getUnlocalizedName());
		GameRegistry.registerBlock(tin_ore, tin_ore.getUnlocalizedName());
		GameRegistry.registerBlock(topaz_ore, topaz_ore.getUnlocalizedName());
		
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
