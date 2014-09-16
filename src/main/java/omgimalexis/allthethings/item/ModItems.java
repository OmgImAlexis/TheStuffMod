package omgimalexis.allthethings.item;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems extends Items {

	// Materials
	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);
	public static ArmorMaterial tutArmorMaterial = EnumHelper.addArmorMaterial("Tutorial Armor Material", 33, new int[] { 2, 5, 4, 2 }, 10);

	// Tools
	public static Item ruby_axe = new ItemAxe(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":ruby_axe");
	public static Item ruby_hoe = new ItemHoe(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":ruby_hoe");
	public static Item ruby_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":ruby_pickaxe");
	public static Item ruby_spade = new ItemSpade(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":ruby_spade");
	public static Item sapphire_axe = new ItemAxe(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":sapphire_axe");
	public static Item sapphire_hoe = new ItemHoe(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":sapphire_hoe");
	public static Item sapphire_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":sapphire_pickaxe");
	public static Item sapphire_spade = new ItemSpade(tutMaterial).setUnlocalizedName(Reference.MOD_ID + ":sapphire_spade");

	// Weapons
	
	//Armor
//		public static Item ruby_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_boots.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":ruby_boots");
//		public static Item ruby_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_helmet.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":ruby_helmet");
//		public static Item ruby_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_pants.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":ruby_pants");
//		public static Item ruby_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_plate.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":ruby_plate");
//		public static Item sapphire_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_boots.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":sapphire_boots");
//		public static Item sapphire_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_helmet.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":sapphire_helmet");
//		public static Item sapphire_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_pants.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":sapphire_pants");
//		public static Item sapphire_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_plate.getUnlocalizedName()), 0).setUnlocalizedName(Reference.MOD_ID + ":sapphire_plate");


	
	// Ingots
	public static Item ingotAdamant = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotAdamant");
	public static Item ingotBluerite = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotBluerite");
	public static Item ingotBronze = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotBronze");
	public static Item ingotLunar = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotLunar");
	public static Item ingotMithril = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotMithril");
	public static Item ingotRunite = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotRunite");
	public static Item ingotSilver = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotSilver");
	public static Item ingotSteel = new Item().setUnlocalizedName(Reference.MOD_ID + ":ingotSteel");
	
	// Dusts
	public static Item dustAdamanite = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustAdamanite");
	public static Item dustBluerite = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustBluerite");
	public static Item dustBronze = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustBronze");
	public static Item dustCoal = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustCoal");
	public static Item dustCopper = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustCopper");
	public static Item dustDaeyalt = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustDaeyalt");
	public static Item dustDiamond = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustDiamond");
	public static Item dustGold = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustGold");
	public static Item dustIron = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustIron");
	public static Item dustLunar = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustLunar");
	public static Item dustMithril = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustMithril");
	public static Item dustRuby = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustRuby");
	public static Item dustRunite = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustRunite");
	public static Item dustSapphire = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustSapphire");
	public static Item dustSilver = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustSilver");
	public static Item dustSteel = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustSteel");
	public static Item dustTin = new Item().setUnlocalizedName(Reference.MOD_ID + ":dustTin");
	
	// Gems
	public static Item gemAmber = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemAmber");
	public static Item gemAmethyst = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemAmethyst");
	public static Item gemCarnelian = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemCarnelian");
	public static Item gemCitrine = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemCitrine");
	public static Item gemDiamond = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemDiamond");
	public static Item gemGarnet = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemGarnet");
	public static Item gemJade = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemJade");
	public static Item gemOnyx = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemOnyx");
	public static Item gemOpal = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemOpal");
	public static Item gemQuartz = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemQuartz");
	public static Item gemRuby = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemRuby");
	public static Item gemSapphire = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemSapphire");
	public static Item gemTopaz = new Item().setUnlocalizedName(Reference.MOD_ID + ":gemTopaz");
	
	// This is how I do it
	public static final ItemBasic fyrestone = new ItemBasic("fyrestone", TMCreativeTabs.misc);

	public static void registerItem() {
		
		// Tools
		GameRegistry.registerItem(ruby_axe, ruby_axe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_hoe, ruby_hoe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_pickaxe, ruby_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_spade, ruby_spade.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_axe, sapphire_axe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_hoe, sapphire_hoe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_pickaxe, sapphire_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_spade, sapphire_spade.getUnlocalizedName());
		
		// Weapons
		
		
		//Armor
//		GameRegistry.registerItem(ruby_boots, ruby_boots.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_helmet, ruby_helmet.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_pants, ruby_pants.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_plate, ruby_plate.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_boots, sapphire_boots.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_helmet, sapphire_helmet.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_pants, sapphire_pants.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_plate, sapphire_plate.getUnlocalizedName());
		
		// Ingots
		GameRegistry.registerItem(ingotAdamant, ingotAdamant.getUnlocalizedName());
		GameRegistry.registerItem(ingotBluerite, ingotBluerite.getUnlocalizedName());
		GameRegistry.registerItem(ingotBronze, ingotBronze.getUnlocalizedName());
		GameRegistry.registerItem(ingotLunar, ingotLunar.getUnlocalizedName());
		GameRegistry.registerItem(ingotMithril, ingotMithril.getUnlocalizedName());
		GameRegistry.registerItem(ingotRunite, ingotRunite.getUnlocalizedName());
		GameRegistry.registerItem(ingotSilver, ingotSilver.getUnlocalizedName());
		GameRegistry.registerItem(ingotSteel, ingotSteel.getUnlocalizedName());
		
		// Dusts
		GameRegistry.registerItem(dustAdamanite, dustAdamanite.getUnlocalizedName());
		GameRegistry.registerItem(dustBluerite, dustBluerite.getUnlocalizedName());
		GameRegistry.registerItem(dustBronze, dustBronze.getUnlocalizedName());
		GameRegistry.registerItem(dustCoal, dustCoal.getUnlocalizedName());
		GameRegistry.registerItem(dustCopper, dustCopper.getUnlocalizedName());
		GameRegistry.registerItem(dustDaeyalt, dustDaeyalt.getUnlocalizedName());
		GameRegistry.registerItem(dustDiamond, dustDiamond.getUnlocalizedName());
		GameRegistry.registerItem(dustGold, dustGold.getUnlocalizedName());
		GameRegistry.registerItem(dustIron, dustIron.getUnlocalizedName());
		GameRegistry.registerItem(dustLunar, dustLunar.getUnlocalizedName());
		GameRegistry.registerItem(dustMithril, dustMithril.getUnlocalizedName());
		GameRegistry.registerItem(dustRuby, dustRuby.getUnlocalizedName());
		GameRegistry.registerItem(dustRunite, dustRunite.getUnlocalizedName());
		GameRegistry.registerItem(dustSapphire, dustSapphire.getUnlocalizedName());
		GameRegistry.registerItem(dustSilver, dustSilver.getUnlocalizedName());
		GameRegistry.registerItem(dustSteel, dustSteel.getUnlocalizedName());
		GameRegistry.registerItem(dustTin, dustTin.getUnlocalizedName());
		
		// Gems
		GameRegistry.registerItem(gemAmber, gemAmber.getUnlocalizedName());
		GameRegistry.registerItem(gemAmethyst, gemAmethyst.getUnlocalizedName());
		GameRegistry.registerItem(gemCarnelian, gemCarnelian.getUnlocalizedName());
		GameRegistry.registerItem(gemCitrine, gemCitrine.getUnlocalizedName());
		GameRegistry.registerItem(gemDiamond, gemDiamond.getUnlocalizedName());
		GameRegistry.registerItem(gemGarnet, gemGarnet.getUnlocalizedName());
		GameRegistry.registerItem(gemJade, gemJade.getUnlocalizedName());
		GameRegistry.registerItem(gemOnyx, gemOnyx.getUnlocalizedName());
		GameRegistry.registerItem(gemOpal, gemOpal.getUnlocalizedName());
		GameRegistry.registerItem(gemQuartz, gemQuartz.getUnlocalizedName());
		GameRegistry.registerItem(gemRuby, gemRuby.getUnlocalizedName());
		GameRegistry.registerItem(gemSapphire, gemSapphire.getUnlocalizedName());
		GameRegistry.registerItem(gemTopaz, gemTopaz.getUnlocalizedName());
		
		// Edit
		GameRegistry.registerItem(fyrestone, fyrestone.getUnlocalizedName());
	}

}
