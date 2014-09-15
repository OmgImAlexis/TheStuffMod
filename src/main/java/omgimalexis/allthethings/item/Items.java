package omgimalexis.allthethings.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import omgimalexis.allthethings.block.Blocks;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.lib.Strings;
import omgimalexis.allthethings.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items extends net.minecraft.init.Items {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);

	public static ArmorMaterial tutArmorMaterial = EnumHelper.addArmorMaterial("Tutorial Armor Material", 33, new int[] { 2, 5, 4, 2 }, 10);

	// To be removed
	public static Item tutItem;
	public static Item tutPickaxe;
	public static Item tutAxe;
	public static Item tutSword;
	public static Item tutHoe;
	public static Item tutSpade;
	public static Item tutHelmet;
	public static Item tutPlate;
	public static Item tutPants;
	public static Item tutBoots;
	public static Item tutGrenade;
	public static Item tutSeed;
	public static Item tutCrop;

	// Tools
	public static Item ruby_pickaxe;
	public static Item ruby_axe;
	public static Item riny_sword;
	public static Item ruby_hoe;
	public static Item ruby_spade;
	public static Item sapphire_pickaxe;
	public static Item sapphire_axe;
	public static Item sapphire_sword;
	public static Item sapphire_hoe;
	public static Item sapphire_spade;

	// Weapons/Armour
	public static Item ruby_helmet;
	public static Item ruby_plate;
	public static Item ruby_pants;
	public static Item ruby_boots;

	// Ingots
	public static Item adamantIngot;
	public static Item blueriteIngot;
	public static Item bronzeIngot;
	public static Item lunarIngot;
	public static Item mithrilIngot;
	public static Item runiteIngot;
	public static Item silverIngot;
	public static Item steelIngot;

	// Dusts
	public static Item adamaniteDust;
	public static Item blueriteDust;
	public static Item bronzeDust;
	public static Item coalDust;
	public static Item copperDust;
	public static Item daeyaltDust;
	public static Item diamondDust;
	public static Item goldDust;
	public static Item ironDust;
	public static Item lunarDust;
	public static Item mithrilDust;
	public static Item rubyDust;
	public static Item runiteDust;
	public static Item sapphireDust;
	public static Item silverDust;
	public static Item steelDust;
	public static Item tinDust;

	// Others
	public static Item opal;
	public static Item rubyGem;

	public static void initialiseItem() {

		// To be removed
		tutItem = new Item().setUnlocalizedName("TutItem").setCreativeTab(TMCreativeTabs.tabMisc);
		tutPickaxe = new TutPickaxe(tutMaterial).setUnlocalizedName("TutPickaxe").setCreativeTab(TMCreativeTabs.tabTools);
		tutAxe = new ItemAxe(tutMaterial).setUnlocalizedName("TutAxe").setCreativeTab(TMCreativeTabs.tabTools);
		tutSword = new TutSword(tutMaterial).setUnlocalizedName("TutSword").setCreativeTab(TMCreativeTabs.tabCombat);
		tutHoe = new TutHoe(tutMaterial).setUnlocalizedName("TutHoe").setCreativeTab(TMCreativeTabs.tabTools);
		tutSpade = new TutSpade(tutMaterial).setUnlocalizedName("TutSpade").setCreativeTab(TMCreativeTabs.tabTools);
		tutHelmet = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 0).setUnlocalizedName("TutHelmet").setCreativeTab(TMCreativeTabs.tabCombat);
		tutPlate = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 1).setUnlocalizedName("TutPlate").setCreativeTab(TMCreativeTabs.tabCombat);
		tutPants = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 2).setUnlocalizedName("TutPants").setCreativeTab(TMCreativeTabs.tabCombat);
		tutBoots = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 3).setUnlocalizedName("TutBoots").setCreativeTab(TMCreativeTabs.tabCombat);
		tutGrenade = new TutGrenade().setUnlocalizedName("TutGrenade").setCreativeTab(TMCreativeTabs.tabCombat).setTextureName(Strings.MODID + ":TutGrenade");
		tutSeed = new ItemSeeds(Blocks.tutCrop, Blocks.farmland).setCreativeTab(TMCreativeTabs.tabMisc).setUnlocalizedName("TutSeeds");
		tutCrop = new Item().setCreativeTab(TMCreativeTabs.tabMisc).setUnlocalizedName("TutCropItem");

		// Tools
		ruby_axe = new ItemAxe(tutMaterial);
		ruby_hoe = new TutHoe(tutMaterial);
		ruby_pickaxe = new TutPickaxe(tutMaterial);
		ruby_spade = new ItemSpade(tutMaterial);

		// Weapons/Armour
		ruby_boots = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 0);
		ruby_helmet = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 0);
		ruby_pants = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 0);
		ruby_plate = new ItemArmour(tutArmorMaterial, MainRegistry.proxy.addArmor("TutArmor"), 0);

		// Items

	}

	public static void registerItem() {
		GameRegistry.registerItem(tutItem, tutItem.getUnlocalizedName());
		GameRegistry.registerItem(tutPickaxe, tutPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(tutAxe, tutAxe.getUnlocalizedName());
		GameRegistry.registerItem(tutSword, tutSword.getUnlocalizedName());
		GameRegistry.registerItem(tutHoe, tutHoe.getUnlocalizedName());
		GameRegistry.registerItem(tutSpade, tutSpade.getUnlocalizedName());
		GameRegistry.registerItem(tutHelmet, tutHelmet.getUnlocalizedName());
		GameRegistry.registerItem(tutPlate, tutPlate.getUnlocalizedName());
		GameRegistry.registerItem(tutPants, tutPants.getUnlocalizedName());
		GameRegistry.registerItem(tutBoots, tutBoots.getUnlocalizedName());
		GameRegistry.registerItem(tutGrenade, tutGrenade.getUnlocalizedName());
		GameRegistry.registerItem(tutSeed, tutSeed.getUnlocalizedName());
		GameRegistry.registerItem(tutCrop, tutCrop.getUnlocalizedName());
	}

}
