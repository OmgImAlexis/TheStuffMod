package omgimalexis.allthethings.init;

import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.item.ItemAxe;
import omgimalexis.allthethings.item.ItemBasic;
import omgimalexis.allthethings.item.ItemBasicFood;
import omgimalexis.allthethings.item.ItemHoe;
import omgimalexis.allthethings.item.ItemPickaxe;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems extends Items {

	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);

	public static ArmorMaterial tutArmorMaterial = EnumHelper.addArmorMaterial("Tutorial Armor Material", 33, new int[] { 2, 5, 4, 2 }, 10);

	// Tools
	public static final Item ruby_axe = new ItemAxe(tutMaterial).setUnlocalizedName("ruby_axe");
	public static final Item ruby_hoe = new ItemHoe(tutMaterial).setUnlocalizedName("ruby_hoe");
	public static final Item ruby_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName("ruby_pickaxe");
	public static final Item ruby_spade = new ItemSpade(tutMaterial).setUnlocalizedName("ruby_spade");
	public static final Item sapphire_axe = new ItemAxe(tutMaterial).setUnlocalizedName("sapphire_axe");
	public static final Item sapphire_hoe = new ItemHoe(tutMaterial).setUnlocalizedName("sapphire_hoe");
	public static final Item sapphire_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName("sapphire_pickaxe");
	public static final Item sapphire_spade = new ItemSpade(tutMaterial).setUnlocalizedName("sapphire_spade");
	
	 // Weapons/Armor
	//public static final ItemBasic ruby_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_boots.getUnlocalizedName()), 0).setUnlocalizedName("ruby_boots");
	//public static final ItemBasic ruby_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_helmet.getUnlocalizedName()), 0).setUnlocalizedName("ruby_helmet");
	//public static final ItemBasic ruby_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_pants.getUnlocalizedName()), 0).setUnlocalizedName("ruby_pants");
	//public static final ItemBasic ruby_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_plate.getUnlocalizedName()), 0).setUnlocalizedName("ruby_plate");
	//public static final ItemBasic sapphire_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_boots.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_boots");
	//public static final ItemBasic sapphire_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_helmet.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_helmet");
	//public static final ItemBasic sapphire_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_pants.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_pants");
	//public static final ItemBasic sapphire_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_plate.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_plate");
	
	// Ingots
	public static final ItemBasic ingotAdamant = new ItemBasic("ingotAdamant",TMCreativeTabs.item);
	public static final ItemBasic ingotAluminium = new ItemBasic("aluminiumIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotBluerite = new ItemBasic("ingotBluerite",TMCreativeTabs.item);
	public static final ItemBasic ingotBrass = new ItemBasic("brassIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotBronze = new ItemBasic("ingotBronze",TMCreativeTabs.item);
	public static final ItemBasic ingotChromium = new ItemBasic("chromiumIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotCobalt = new ItemBasic("cobaltIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotCopper = new ItemBasic("copperIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotElectrum = new ItemBasic("electrumIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotGoloid = new ItemBasic("goloidIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotInvar = new ItemBasic("invarIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotLead = new ItemBasic("leadIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotLunar = new ItemBasic("ingotLunar",TMCreativeTabs.item);
	public static final ItemBasic ingotMalagnite = new ItemBasic("malagniteIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotManganese = new ItemBasic("manganeseIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotMithril = new ItemBasic("ingotMithril",TMCreativeTabs.item);
	public static final ItemBasic ingotNickel = new ItemBasic("nickelIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotPlatinum = new ItemBasic("platinumIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotRhodium = new ItemBasic("rhodiumIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotRunite = new ItemBasic("ingotRunite",TMCreativeTabs.item);
	public static final ItemBasic ingotSilicon = new ItemBasic("siliconIngot", TMCreativeTabs.item);
	public static final ItemBasic ingotSilver = new ItemBasic("ingotSilver",TMCreativeTabs.item);
	public static final ItemBasic ingotSolder = new ItemBasic("solderIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotSteel = new ItemBasic("ingotSteel",TMCreativeTabs.item);
	public static final ItemBasic ingotTin = new ItemBasic("tinIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotTitanium = new ItemBasic("titaniumIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotTungsten = new ItemBasic("tungstenIngot",TMCreativeTabs.item);
	public static final ItemBasic ingotUnobtanium  = new ItemBasic("unobtanium",TMCreativeTabs.item);
	public static final ItemBasic ingotZinc = new ItemBasic("zincIngot",TMCreativeTabs.item);
	
	// Dusts
	public static final ItemBasic dustAdamanite = new ItemBasic("dustAdamanite");
	public static final ItemBasic dustBluerite = new ItemBasic("dustBluerite");
	public static final ItemBasic dustBronze = new ItemBasic("dustBronze");
	public static final ItemBasic dustCoal = new ItemBasic("dustCoal");
	public static final ItemBasic dustCopper = new ItemBasic("dustCopper");
	public static final ItemBasic dustDaeyalt = new ItemBasic("dustDaeyalt");
	public static final ItemBasic dustDiamond = new ItemBasic("dustDiamond");
	public static final ItemBasic dustGold = new ItemBasic("dustGold");
	public static final ItemBasic dustIron = new ItemBasic("dustIron");
	public static final ItemBasic dustLunar = new ItemBasic("dustLunar");
	public static final ItemBasic dustMithril = new ItemBasic("dustMithril");
	public static final ItemBasic dustRuby = new ItemBasic("dustRuby");
	public static final ItemBasic dustRunite = new ItemBasic("dustRunite");
	public static final ItemBasic dustSapphire = new ItemBasic("dustSapphire");
	public static final ItemBasic dustSilver = new ItemBasic("dustSilver");
	public static final ItemBasic dustSteel = new ItemBasic("dustSteel");
	public static final ItemBasic dustTin = new ItemBasic("dustTin");
	
	// Gems
	public static final ItemBasic gemAmber = new ItemBasic("gemAmber");
	public static final ItemBasic gemAmethyst = new ItemBasic("gemAmethyst");
	public static final ItemBasic gemCarnelian = new ItemBasic("gemCarnelian");
	public static final ItemBasic gemCitrine = new ItemBasic("gemCitrine");
	public static final ItemBasic gemDiamond = new ItemBasic("gemDiamond");
	public static final ItemBasic gemGarnet = new ItemBasic("gemGarnet");
	public static final ItemBasic gemJade = new ItemBasic("gemJade");
	public static final ItemBasic gemOnyx = new ItemBasic("gemOnyx");
	public static final ItemBasic gemOpal = new ItemBasic("gemOpal");
	public static final ItemBasic gemQuartz = new ItemBasic("gemQuartz");
	public static final ItemBasic gemRuby = new ItemBasic("gemRuby");
	public static final ItemBasic gemSapphire = new ItemBasic("gemSapphire");
	public static final ItemBasic gemTopaz = new ItemBasic("gemTopaz");
	public static final ItemBasic gemNetherQuartz = new ItemBasic("gemNetherQuartz",TMCreativeTabs.item);
	
	// Shards
	public static final ItemBasic shardAmazonite = new ItemBasic("amazoniteShard",TMCreativeTabs.item);
	public static final ItemBasic shardAmber = new ItemBasic("amberShard",TMCreativeTabs.item);
	public static final ItemBasic shardAmethyst = new ItemBasic("amethystShard",TMCreativeTabs.item);
	public static final ItemBasic shardAquamarine = new ItemBasic("aquamarineShard",TMCreativeTabs.item);
	public static final ItemBasic shardCarnelian = new ItemBasic("carnelianShard",TMCreativeTabs.item);
	public static final ItemBasic shardCitrine = new ItemBasic("citrineShard",TMCreativeTabs.item);
	public static final ItemBasic shardDiamond = new ItemBasic("diamondShard",TMCreativeTabs.item);
	public static final ItemBasic shardEmerald = new ItemBasic("emeraldShard",TMCreativeTabs.item);
	public static final ItemBasic shardGarnet = new ItemBasic("garnetShard",TMCreativeTabs.item);
	public static final ItemBasic shardJade = new ItemBasic("jadeShard",TMCreativeTabs.item);
	public static final ItemBasic shardKunzite = new ItemBasic("kunziteShard",TMCreativeTabs.item);
	public static final ItemBasic shardNetherQuartz = new ItemBasic("netherQuartzShard",TMCreativeTabs.item);
	public static final ItemBasic shardOnyx = new ItemBasic("onyxShard",TMCreativeTabs.item);
	public static final ItemBasic shardRuby = new ItemBasic("rubyShard",TMCreativeTabs.item);
	public static final ItemBasic shardSapphire = new ItemBasic("sapphireShard",TMCreativeTabs.item);
	
	// Rings
	public static final ItemBasic ring = new ItemBasic("ring",TMCreativeTabs.item);
	public static final ItemBasic silverRing = new ItemBasic("silverRing",TMCreativeTabs.item);
	
	public static final ItemBasic onyxRing = new ItemBasic("onyxRing",TMCreativeTabs.item);
	public static final ItemBasic rubyRing = new ItemBasic("rubyRing",TMCreativeTabs.item);
	public static final ItemBasic sapphireRing = new ItemBasic("sapphireRing",TMCreativeTabs.item);
	public static final ItemBasic amberRing = new ItemBasic("amberRing",TMCreativeTabs.item);
	public static final ItemBasic jadeRing = new ItemBasic("jadeRing",TMCreativeTabs.item);
	public static final ItemBasic citrineRing = new ItemBasic("citrineRing",TMCreativeTabs.item);
	public static final ItemBasic amethystRing = new ItemBasic("amethystRing",TMCreativeTabs.item);
	public static final ItemBasic carnelianRing = new ItemBasic("carnelianRing",TMCreativeTabs.item);
	public static final ItemBasic amazoniteRing = new ItemBasic("amazoniteRing",TMCreativeTabs.item);
	public static final ItemBasic garnetRing = new ItemBasic("garnetRing",TMCreativeTabs.item);
	public static final ItemBasic kunziteRing = new ItemBasic("kunziteRing",TMCreativeTabs.item);
	public static final ItemBasic aquamarineRing = new ItemBasic("aquamarineRing",TMCreativeTabs.item);
	
	public static final ItemBasic diamondRing = new ItemBasic("diamondRing",TMCreativeTabs.item);
	public static final ItemBasic emeraldRing = new ItemBasic("emeraldRing",TMCreativeTabs.item);
	public static final ItemBasic netherQuartzRing = new ItemBasic("netherQuartzRing",TMCreativeTabs.item);
	
	public static final ItemBasic voidiumRing = new ItemBasic("voidiumRing",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneRing = new ItemBasic("fyrestoneRing",TMCreativeTabs.item);
	
	public static final ItemBasic onyxSilverRing = new ItemBasic("onyxSilverRing",TMCreativeTabs.item);
	public static final ItemBasic rubySilverRing = new ItemBasic("rubySilverRing",TMCreativeTabs.item);
	public static final ItemBasic sapphireSilverRing = new ItemBasic("sapphireSilverRing",TMCreativeTabs.item);
	public static final ItemBasic amberSilverRing = new ItemBasic("amberSilverRing",TMCreativeTabs.item);
	public static final ItemBasic jadeSilverRing = new ItemBasic("jadeSilverRing",TMCreativeTabs.item);
	public static final ItemBasic citrineSilverRing = new ItemBasic("citrineSilverRing",TMCreativeTabs.item);
	public static final ItemBasic amethystSilverRing = new ItemBasic("amethystSilverRing",TMCreativeTabs.item);
	public static final ItemBasic carnelianSilverRing = new ItemBasic("carnelianSilverRing",TMCreativeTabs.item);
	public static final ItemBasic amazoniteSilverRing = new ItemBasic("amazoniteSilverRing",TMCreativeTabs.item);
	public static final ItemBasic garnetSilverRing = new ItemBasic("garnetSilverRing",TMCreativeTabs.item);
	public static final ItemBasic kunziteSilverRing = new ItemBasic("kunziteSilverRing",TMCreativeTabs.item);
	public static final ItemBasic aquamarineSilverRing = new ItemBasic("aquamarineSilverRing",TMCreativeTabs.item);
	
	public static final ItemBasic diamondSilverRing = new ItemBasic("diamondSilverRing",TMCreativeTabs.item);
	public static final ItemBasic emeraldSilverRing = new ItemBasic("emeraldSilverRing",TMCreativeTabs.item);
	public static final ItemBasic netherQuartzSilverRing = new ItemBasic("netherQuartzSilverRing",TMCreativeTabs.item);
	
	public static final ItemBasic voidiumSilverRing = new ItemBasic("voidiumSilverRing",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneSilverRing = new ItemBasic("fyrestoneSilverRing",TMCreativeTabs.item);
	
	// NOT THINGS?
	public static final ItemBasic iridium  = new ItemBasic("iridium",TMCreativeTabs.item);
	public static final ItemBasic plutonium  = new ItemBasic("plutonium", TMCreativeTabs.item);
	public static final ItemBasic topaz  = new ItemBasic("topaz",TMCreativeTabs.item);
	public static final ItemBasic trytementium  = new ItemBasic("trytementium",TMCreativeTabs.item);
	public static final ItemBasic uranium  = new ItemBasic("uranium",TMCreativeTabs.item);



	
	
	
	// EVERYTHING BELOW THIS ISN'T SORTED |||||||| FIX IT PLEASE
	public static final ItemBasic onyx = new ItemBasic("onyx",TMCreativeTabs.item);
	public static final ItemBasic ruby = new ItemBasic("ruby",TMCreativeTabs.item);
	public static final ItemBasic sapphire = new ItemBasic("sapphire",TMCreativeTabs.item);
	public static final ItemBasic amber = new ItemBasic("amber",TMCreativeTabs.item);
	public static final ItemBasic jade = new ItemBasic("jade",TMCreativeTabs.item);
	public static final ItemBasic citrine = new ItemBasic("citrine",TMCreativeTabs.item);
	public static final ItemBasic amethyst = new ItemBasic("amethyst",TMCreativeTabs.item);
	public static final ItemBasic carnelian = new ItemBasic("carnelian",TMCreativeTabs.item);
	public static final ItemBasic amazonite = new ItemBasic("amazonite",TMCreativeTabs.item);
	public static final ItemBasic garnet = new ItemBasic("garnet",TMCreativeTabs.item);
	public static final ItemBasic kunzite = new ItemBasic("kunzite",TMCreativeTabs.item);
	public static final ItemBasic aquamarine = new ItemBasic("aquamarine",TMCreativeTabs.item);

	
	public static final ItemBasic fyrestone = new ItemBasic("fyrestone",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneStable = new ItemBasic("fyrestoneStable",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneGem = new ItemBasic("fyrestoneGem",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneCut = new ItemBasic("fyrestoneCut",TMCreativeTabs.item);
	public static final ItemBasic voidium = new ItemBasic("voidium",TMCreativeTabs.item);
	public static final ItemBasic voidiumStable = new ItemBasic("voidiumStable",TMCreativeTabs.item);
	public static final ItemBasic voidiumRadioactiveFocused = new ItemBasic("voidiumRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic voidiumCutRadioactiveFocused = new ItemBasic("voidiumCutRadioactiveFocused",TMCreativeTabs.item);
	
	public static final ItemBasic voidiumOrb = new ItemBasic("voidiumOrb",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactive = new ItemBasic("voidiumOrbRadioactive",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactiveFocused = new ItemBasic("voidiumOrbRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactiveFocusedCondensed = new ItemBasic("voidiumOrbRadioactiveFocusedCondensed",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactiveFocusedCondensedFragile = new ItemBasic("voidiumOrbRadioactiveFocusedCondensedFragile",TMCreativeTabs.item);
	
	public static final ItemBasic onyxPure = new ItemBasic("onyxPure",TMCreativeTabs.item);
	public static final ItemBasic rubyPure = new ItemBasic("rubyPure",TMCreativeTabs.item);
	public static final ItemBasic sapphirePure = new ItemBasic("sapphirePure",TMCreativeTabs.item);
	public static final ItemBasic amberPure = new ItemBasic("amberPure",TMCreativeTabs.item);
	public static final ItemBasic jadePure = new ItemBasic("jadePure",TMCreativeTabs.item);
	public static final ItemBasic citrinePure = new ItemBasic("citrinePure",TMCreativeTabs.item);
	public static final ItemBasic amethystPure = new ItemBasic("amethystPure",TMCreativeTabs.item);
	public static final ItemBasic carnelianPure = new ItemBasic("carnelianPure",TMCreativeTabs.item);
	public static final ItemBasic voidiumPureRadioactiveFocused = new ItemBasic("voidiumPureRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic fyrestonePure = new ItemBasic("fyrestonePure",TMCreativeTabs.item);
	public static final ItemBasic diamondPure = new ItemBasic("diamondPure",TMCreativeTabs.item);
	public static final ItemBasic emeraldPure = new ItemBasic("emeraldPure",TMCreativeTabs.item);

	public static final ItemBasic voidiumShardRadioactiveFocused = new ItemBasic("voidiumShardRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneShard = new ItemBasic("fyrestoneShard",TMCreativeTabs.item);
	
	public static final ItemBasic goldBand = new ItemBasic("goldBand",TMCreativeTabs.item);
	public static final ItemBasic silverBand = new ItemBasic("silverBand",TMCreativeTabs.item);
		
	public static final ItemBasicFood cherry = new ItemBasicFood("cherry", TMCreativeTabs.misc, 2, 0.2f, false);
	
	
	public static void init() {
		
		// Tools
		GameRegistry.registerItem(ruby_axe, ruby_axe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_hoe, ruby_hoe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_pickaxe, ruby_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_spade, ruby_spade.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_axe, sapphire_axe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_hoe, sapphire_hoe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_pickaxe, sapphire_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_spade, sapphire_spade.getUnlocalizedName());
		
		// Weapons/Armor
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
		
		// My stuff, will organise/clean later
		GameRegistry.registerItem(onyx, "onyx");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(amber, "amber");
		GameRegistry.registerItem(jade, "jade");
		GameRegistry.registerItem(citrine, "citrine");
		GameRegistry.registerItem(amethyst, "amethyst");
		GameRegistry.registerItem(carnelian, "carnelian");
		GameRegistry.registerItem(amazonite, "amazonite");
		GameRegistry.registerItem(garnet, "garnet");
		GameRegistry.registerItem(kunzite, "kunzite");
		GameRegistry.registerItem(aquamarine, "aquamarine");
		
		GameRegistry.registerItem(diamondGem, "diamondGem");
		GameRegistry.registerItem(netherQuartzGem, "netherQuartzGem");
		
		GameRegistry.registerItem(fyrestone, "fyrestone");
		GameRegistry.registerItem(fyrestoneStable, "fyrestoneStable");
		GameRegistry.registerItem(fyrestoneGem, "fyrestoneGem");
		GameRegistry.registerItem(fyrestoneCut, "fyrestoneCut");
		GameRegistry.registerItem(voidium, "voidium");
		GameRegistry.registerItem(voidiumStable, "voidiumStable");
		GameRegistry.registerItem(voidiumRadioactiveFocused, "voidiumRadioactiveFocused");
		GameRegistry.registerItem(voidiumCutRadioactiveFocused, "voidiumCutRadioactiveFocused");
		
		GameRegistry.registerItem(voidiumOrb, "voidiumOrb");
		GameRegistry.registerItem(voidiumOrbRadioactive, "voidiumOrbRadioactive");
		GameRegistry.registerItem(voidiumOrbRadioactiveFocused, "voidiumOrbRadioactiveFocused");
		GameRegistry.registerItem(voidiumOrbRadioactiveFocusedCondensed, "voidiumOrbRadioactiveFocusedCondensed");
		GameRegistry.registerItem(voidiumOrbRadioactiveFocusedCondensedFragile, "voidiumOrbRadioactiveFocusedCondensedFragile");
		
		GameRegistry.registerItem(onyxPure, "onyxPure");
		GameRegistry.registerItem(rubyPure, "rubyPure");
		GameRegistry.registerItem(sapphirePure, "sapphirePure");
		GameRegistry.registerItem(amberPure, "amberPure");
		GameRegistry.registerItem(jadePure, "jadePure");
		GameRegistry.registerItem(citrinePure, "citrinePure");
		GameRegistry.registerItem(amethystPure, "amethystPure");
		GameRegistry.registerItem(carnelianPure, "carnelianPure");
		GameRegistry.registerItem(voidiumPureRadioactiveFocused, "voidiumPureRadioactiveFocused");
		GameRegistry.registerItem(fyrestonePure, "fyrestonePure");
		GameRegistry.registerItem(diamondPure, "diamondPure");
		GameRegistry.registerItem(emeraldPure, "emeraldPure");
		
		GameRegistry.registerItem(onyxShard, "onyxShard");
		GameRegistry.registerItem(rubyShard, "rubyShard");
		GameRegistry.registerItem(sapphireShard, "sapphireShard");
		GameRegistry.registerItem(amberShard, "amberShard");
		GameRegistry.registerItem(jadeShard, "jadeShard");
		GameRegistry.registerItem(citrineShard, "citrineShard");
		GameRegistry.registerItem(amethystShard, "amethystShard");
		GameRegistry.registerItem(carnelianShard, "carnelianShard");
		GameRegistry.registerItem(amazoniteShard, "amazoniteShard");
		GameRegistry.registerItem(garnetShard, "garnetShard");
		GameRegistry.registerItem(kunziteShard, "kunziteShard");
		GameRegistry.registerItem(aquamarineShard, "aquamarineShard");
		
		GameRegistry.registerItem(diamondShard, "diamondShard");
		GameRegistry.registerItem(emeraldShard, "emeraldShard");
		GameRegistry.registerItem(netherQuartzShard, "netherQuartzShard");
		
		GameRegistry.registerItem(voidiumShardRadioactiveFocused, "voidiumShardRadioactiveFocused");
		GameRegistry.registerItem(fyrestoneShard, "fyrestoneShard");
		
		GameRegistry.registerItem(ring, "ring");
		GameRegistry.registerItem(silverRing, "silverRing");
		
		GameRegistry.registerItem(onyxRing, "onyxRing");
		GameRegistry.registerItem(rubyRing, "rubyRing");
		GameRegistry.registerItem(sapphireRing, "sapphireRing");
		GameRegistry.registerItem(amberRing, "amberRing");
		GameRegistry.registerItem(jadeRing, "jadeRing");
		GameRegistry.registerItem(citrineRing, "citrineRing");
		GameRegistry.registerItem(amethystRing, "amethystRing");
		GameRegistry.registerItem(carnelianRing, "carnelianRing");
		GameRegistry.registerItem(amazoniteRing, "amazoniteRing");
		GameRegistry.registerItem(garnetRing, "garnetRing");
		GameRegistry.registerItem(kunziteRing, "kunziteRing");
		GameRegistry.registerItem(aquamarineRing, "aquamarineRing");
		
		GameRegistry.registerItem(diamondRing, "diamondRing");
		GameRegistry.registerItem(emeraldRing, "emeraldRing");
		GameRegistry.registerItem(netherQuartzRing, "netherQuartzRing");
		
		GameRegistry.registerItem(voidiumRing, "voidiumRing");
		GameRegistry.registerItem(fyrestoneRing, "fyrestoneRing");
		
		GameRegistry.registerItem(onyxSilverRing, "onyxSilverRing");
		GameRegistry.registerItem(rubySilverRing, "rubySilverRing");
		GameRegistry.registerItem(sapphireSilverRing, "sapphireSilverRing");
		GameRegistry.registerItem(amberSilverRing, "amberSilverRing");
		GameRegistry.registerItem(jadeSilverRing, "jadeSilverRing");
		GameRegistry.registerItem(citrineSilverRing, "citrineSilverRing");
		GameRegistry.registerItem(amethystSilverRing, "amethystSilverRing");
		GameRegistry.registerItem(carnelianSilverRing, "carnelianSilverRing");
		GameRegistry.registerItem(amazoniteSilverRing, "amazoniteSilverRing");
		GameRegistry.registerItem(garnetSilverRing, "garnetSilverRing");
		GameRegistry.registerItem(kunziteSilverRing, "kunziteSilverRing");
		GameRegistry.registerItem(aquamarineSilverRing, "aquamarineSilverRing");
		
		GameRegistry.registerItem(diamondSilverRing, "diamondSilverRing");
		GameRegistry.registerItem(emeraldSilverRing, "emeraldSilverRing");
		GameRegistry.registerItem(netherQuartzSilverRing, "netherQuartzSilverRing");
		
		GameRegistry.registerItem(voidiumSilverRing, "voidiumSilverRing");
		GameRegistry.registerItem(fyrestoneSilverRing, "fyrestoneSilverRing");
		
		GameRegistry.registerItem(goldBand, "goldBand");
		
		GameRegistry.registerItem(tinIngot, "tinIngot");
		GameRegistry.registerItem(copperIngot, "copperIngot");
		GameRegistry.registerItem(leadIngot, "leadIngot");
		GameRegistry.registerItem(silverIngot, "silverIngot");
		GameRegistry.registerItem(platinumIngot, "platinumIngot");
		GameRegistry.registerItem(steelIngot, "steelIngot");
		GameRegistry.registerItem(bronzeIngot, "bronzeIngot");
		GameRegistry.registerItem(electrumIngot, "electrumIngot");
		GameRegistry.registerItem(malagniteIngot, "malagniteIngot");
		GameRegistry.registerItem(trytementium,"trytementium");
		GameRegistry.registerItem(iridium, "iridium");
		GameRegistry.registerItem(uranium, "uranium");
		GameRegistry.registerItem(topaz,"topaz");
		GameRegistry.registerItem(aluminiumIngot, "aluminiumIngot");
		GameRegistry.registerItem(zincIngot,"zincIngot");
		GameRegistry.registerItem(brassIngot, "brassIngot");
		GameRegistry.registerItem(unobtanium, "unobtanium");
		GameRegistry.registerItem(titaniumIngot,"titaniumIngot");
		GameRegistry.registerItem(plutonium, "plutonium");
		GameRegistry.registerItem(solderIngot,"solderIngot");
		GameRegistry.registerItem(invarIngot, "invarIngot");
		GameRegistry.registerItem(nickelIngot, "nickelIngot");
		GameRegistry.registerItem(chromiumIngot,"chromiumIngot");
		GameRegistry.registerItem(cobaltIngot, "cobaltIngot");
		GameRegistry.registerItem(tungstenIngot,"tungstenIngot");
		GameRegistry.registerItem(rhodiumIngot, "rhodiumIngot");
		GameRegistry.registerItem(goloidIngot, "goloidIngot");
		GameRegistry.registerItem(manganeseIngot,"manganeseIngot");
		GameRegistry.registerItem(siliconIngot, "siliconIngot");
		
		GameRegistry.registerItem(cherry, "cherry");
	}

}
