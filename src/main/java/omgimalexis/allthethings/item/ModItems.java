package omgimalexis.allthethings.item;

import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems extends Items {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);

	public static ArmorMaterial tutArmorMaterial = EnumHelper.addArmorMaterial("Tutorial Armor Material", 33, new int[] { 2, 5, 4, 2 }, 10);

	// Tools
	public static Item ruby_pickaxe;
	public static Item ruby_axe;
	public static Item ruby_hoe;
	public static Item ruby_spade;
	public static Item sapphire_pickaxe;
	public static Item sapphire_axe;
	public static Item sapphire_hoe;
	public static Item sapphire_spade;
	
	// Weapons
	public static Item ruby_sword;
	public static Item sapphire_sword;

	// Armour
	public static Item ruby_helmet;
	public static Item ruby_plate;
	public static Item ruby_pants;
	public static Item ruby_boots;
	public static Item sapphire_helmet;
	public static Item sapphire_plate;
	public static Item sapphire_pants;
	public static Item sapphire_boots;

	// Ingots
	public static Item ingotAdamant;
	public static Item ingotBluerite;
	public static Item ingotBronze;
	public static Item ingotLunar;
	public static Item ingotMithril;
	public static Item ingotRunite;
	public static Item ingotSilver;
	public static Item ingotSteel;

	// Dusts
	public static Item dustAdamanite;
	public static Item dustBluerite;
	public static Item dustBronze;
	public static Item dustCoal;
	public static Item dustCopper;
	public static Item dustDaeyalt;
	public static Item dustDiamond;
	public static Item dustGold;
	public static Item dustIron;
	public static Item dustLunar;
	public static Item dustMithril;
	public static Item dustRuby;
	public static Item dustRunite;
	public static Item dustSapphire;
	public static Item dustSilver;
	public static Item dustSteel;
	public static Item dustTin;

	// Others
	public static Item gemAmber;
	public static Item gemAmethyst;
	public static Item gemCarnelian;
	public static Item gemCitrine;
	public static Item gemDiamond;
	public static Item gemGarnet;
	public static Item gemJade;
	public static Item gemOnyx;
	public static Item gemOpal;
	public static Item gemQuartz;
	public static Item gemRuby;
	public static Item gemSapphire;
	public static Item gemTopaz;
	
	// This is how I do it
	public static final ItemBasic fyrestone = new ItemBasic("fyrestone", TMCreativeTabs.tabMisc);

	public static void initialiseItem() {

		// Tools
		ruby_axe = new ItemAxe(tutMaterial).setUnlocalizedName("ruby_axe");
		ruby_hoe = new ItemHoe(tutMaterial).setUnlocalizedName("ruby_hoe");
		ruby_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName("ruby_pickaxe");
		ruby_spade = new ItemSpade(tutMaterial).setUnlocalizedName("ruby_spade");
		sapphire_axe = new ItemAxe(tutMaterial).setUnlocalizedName("sapphire_axe");
		sapphire_hoe = new ItemHoe(tutMaterial).setUnlocalizedName("sapphire_hoe");
		sapphire_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName("sapphire_pickaxe");
		sapphire_spade = new ItemSpade(tutMaterial).setUnlocalizedName("sapphire_spade");

		// Weapons
		
		//Armor
//		ruby_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_boots.getUnlocalizedName()), 0).setUnlocalizedName("ruby_boots");
//		ruby_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_helmet.getUnlocalizedName()), 0).setUnlocalizedName("ruby_helmet");
//		ruby_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_pants.getUnlocalizedName()), 0).setUnlocalizedName("ruby_pants");
//		ruby_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_plate.getUnlocalizedName()), 0).setUnlocalizedName("ruby_plate");
//		sapphire_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_boots.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_boots");
//		sapphire_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_helmet.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_helmet");
//		sapphire_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_pants.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_pants");
//		sapphire_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_plate.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_plate");

		// Ingots
		ingotAdamant = new Item().setUnlocalizedName("ingotAdamant");
		ingotBluerite = new Item().setUnlocalizedName("ingotBluerite");
		ingotBronze = new Item().setUnlocalizedName("ingotBronze");
		ingotLunar = new Item().setUnlocalizedName("ingotLunar");
		ingotMithril = new Item().setUnlocalizedName("ingotMithril");
		ingotRunite = new Item().setUnlocalizedName("ingotRunite");
		ingotSilver = new Item().setUnlocalizedName("ingotSilver");
		ingotSteel = new Item().setUnlocalizedName("ingotSteel");
		
		// Dusts
		dustAdamanite = new Item().setUnlocalizedName("dustAdamanite");
		dustBluerite = new Item().setUnlocalizedName("dustBluerite");
		dustBronze = new Item().setUnlocalizedName("dustBronze");
		dustCoal = new Item().setUnlocalizedName("dustCoal");
		dustCopper = new Item().setUnlocalizedName("dustCopper");
		dustDaeyalt = new Item().setUnlocalizedName("dustDaeyalt");
		dustDiamond = new Item().setUnlocalizedName("dustDiamond");
		dustGold = new Item().setUnlocalizedName("dustGold");
		dustIron = new Item().setUnlocalizedName("dustIron");
		dustLunar = new Item().setUnlocalizedName("dustLunar");
		dustMithril = new Item().setUnlocalizedName("dustMithril");
		dustRuby = new Item().setUnlocalizedName("dustRuby");
		dustRunite = new Item().setUnlocalizedName("dustRunite");
		dustSapphire = new Item().setUnlocalizedName("dustSapphire");
		dustSilver = new Item().setUnlocalizedName("dustSilver");
		dustSteel = new Item().setUnlocalizedName("dustSteel");
		dustTin = new Item().setUnlocalizedName("dustTin");
		
		// Gems
		gemAmber = new Item().setUnlocalizedName("gemAmber");
		gemAmethyst = new Item().setUnlocalizedName("gemAmethyst");
		gemCarnelian = new Item().setUnlocalizedName("gemCarnelian");
		gemCitrine = new Item().setUnlocalizedName("gemCitrine");
		gemDiamond = new Item().setUnlocalizedName("gemDiamond");
		gemGarnet = new Item().setUnlocalizedName("gemGarnet");
		gemJade = new Item().setUnlocalizedName("gemJade");
		gemOnyx = new Item().setUnlocalizedName("gemOnyx");
		gemOpal = new Item().setUnlocalizedName("gemOpal");
		gemQuartz = new Item().setUnlocalizedName("gemQuartz");
		gemRuby = new Item().setUnlocalizedName("gemRuby");
		gemSapphire = new Item().setUnlocalizedName("gemSapphire");
		gemTopaz = new Item().setUnlocalizedName("gemTopaz");

	}

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
