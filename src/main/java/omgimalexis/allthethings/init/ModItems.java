package omgimalexis.allthethings.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.item.ItemAxe;
import omgimalexis.allthethings.item.ItemBasic;
import omgimalexis.allthethings.item.ItemBasicFood;
import omgimalexis.allthethings.item.ItemHoe;
import omgimalexis.allthethings.item.ItemPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems extends Items {
	
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
	
	public static final ItemBasic onyxRing = new ItemBasic("onyxRing",TMCreativeTabs.jewelry);
	public static final ItemBasic rubyRing = new ItemBasic("rubyRing",TMCreativeTabs.jewelry);
	public static final ItemBasic sapphireRing = new ItemBasic("sapphireRing",TMCreativeTabs.jewelry);
	public static final ItemBasic amberRing = new ItemBasic("amberRing",TMCreativeTabs.jewelry);
	public static final ItemBasic jadeRing = new ItemBasic("jadeRing",TMCreativeTabs.jewelry);
	public static final ItemBasic citrineRing = new ItemBasic("citrineRing",TMCreativeTabs.jewelry);
	public static final ItemBasic amethystRing = new ItemBasic("amethystRing",TMCreativeTabs.jewelry);
	public static final ItemBasic carnelianRing = new ItemBasic("carnelianRing",TMCreativeTabs.jewelry);
	public static final ItemBasic amazoniteRing = new ItemBasic("amazoniteRing",TMCreativeTabs.jewelry);
	public static final ItemBasic garnetRing = new ItemBasic("garnetRing",TMCreativeTabs.jewelry);
	public static final ItemBasic kunziteRing = new ItemBasic("kunziteRing",TMCreativeTabs.jewelry);
	public static final ItemBasic aquamarineRing = new ItemBasic("aquamarineRing",TMCreativeTabs.jewelry);
	
	public static final ItemBasic diamondRing = new ItemBasic("diamondRing",TMCreativeTabs.jewelry);
	public static final ItemBasic emeraldRing = new ItemBasic("emeraldRing",TMCreativeTabs.jewelry);
	public static final ItemBasic netherQuartzRing = new ItemBasic("netherQuartzRing",TMCreativeTabs.jewelry);
	
	public static final ItemBasic voidiumRing = new ItemBasic("voidiumRing",TMCreativeTabs.jewelry);
	public static final ItemBasic fyrestoneRing = new ItemBasic("fyrestoneRing",TMCreativeTabs.jewelry);
	
	public static final ItemBasic onyxSilverRing = new ItemBasic("onyxSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic rubySilverRing = new ItemBasic("rubySilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic sapphireSilverRing = new ItemBasic("sapphireSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic amberSilverRing = new ItemBasic("amberSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic jadeSilverRing = new ItemBasic("jadeSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic citrineSilverRing = new ItemBasic("citrineSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic amethystSilverRing = new ItemBasic("amethystSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic carnelianSilverRing = new ItemBasic("carnelianSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic amazoniteSilverRing = new ItemBasic("amazoniteSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic garnetSilverRing = new ItemBasic("garnetSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic kunziteSilverRing = new ItemBasic("kunziteSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic aquamarineSilverRing = new ItemBasic("aquamarineSilverRing",TMCreativeTabs.jewelry);
	
	public static final ItemBasic diamondSilverRing = new ItemBasic("diamondSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic emeraldSilverRing = new ItemBasic("emeraldSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic netherQuartzSilverRing = new ItemBasic("netherQuartzSilverRing",TMCreativeTabs.jewelry);
	
	public static final ItemBasic voidiumSilverRing = new ItemBasic("voidiumSilverRing",TMCreativeTabs.jewelry);
	public static final ItemBasic fyrestoneSilverRing = new ItemBasic("fyrestoneSilverRing",TMCreativeTabs.jewelry);

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
		
		// Ingots
		GameRegistry.registerItem(ingotAdamant, ingotAdamant.getUnlocalizedName());
		GameRegistry.registerItem(ingotAluminium, ingotAluminium.getUnlocalizedName());
		GameRegistry.registerItem(ingotBluerite, ingotBluerite.getUnlocalizedName());
		GameRegistry.registerItem(ingotBrass, ingotBrass.getUnlocalizedName());
		GameRegistry.registerItem(ingotBronze, ingotBronze.getUnlocalizedName());
		GameRegistry.registerItem(ingotChromium, ingotChromium.getUnlocalizedName());
		GameRegistry.registerItem(ingotCobalt, ingotCobalt.getUnlocalizedName());
		GameRegistry.registerItem(ingotCopper, ingotCopper.getUnlocalizedName());
		GameRegistry.registerItem(ingotElectrum, ingotElectrum.getUnlocalizedName());
		GameRegistry.registerItem(ingotGoloid, ingotGoloid.getUnlocalizedName());
		GameRegistry.registerItem(ingotInvar, ingotInvar.getUnlocalizedName());
		GameRegistry.registerItem(ingotLead, ingotLead.getUnlocalizedName());
		GameRegistry.registerItem(ingotLunar, ingotLunar.getUnlocalizedName());
		GameRegistry.registerItem(ingotMalagnite, ingotMalagnite.getUnlocalizedName());
		GameRegistry.registerItem(ingotManganese, ingotManganese.getUnlocalizedName());
		GameRegistry.registerItem(ingotMithril, ingotMithril.getUnlocalizedName());
		GameRegistry.registerItem(ingotNickel, ingotNickel.getUnlocalizedName());
		GameRegistry.registerItem(ingotPlatinum, ingotPlatinum.getUnlocalizedName());
		GameRegistry.registerItem(ingotRhodium, ingotRhodium.getUnlocalizedName());
		GameRegistry.registerItem(ingotRunite, ingotRunite.getUnlocalizedName());
		GameRegistry.registerItem(ingotRunite, ingotRunite.getUnlocalizedName());
		GameRegistry.registerItem(ingotSilicon, ingotSilicon.getUnlocalizedName());
		GameRegistry.registerItem(ingotSilver, ingotSilver.getUnlocalizedName());
		GameRegistry.registerItem(ingotSolder, ingotSolder.getUnlocalizedName());
		GameRegistry.registerItem(ingotSteel, ingotSteel.getUnlocalizedName());
		GameRegistry.registerItem(ingotTin, ingotTin.getUnlocalizedName());
		GameRegistry.registerItem(ingotTitanium, ingotTitanium.getUnlocalizedName());
		GameRegistry.registerItem(ingotTungsten, ingotTungsten.getUnlocalizedName());
		GameRegistry.registerItem(ingotUnobtanium, ingotUnobtanium.getUnlocalizedName());
		GameRegistry.registerItem(ingotZinc, ingotZinc.getUnlocalizedName());
		
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
		GameRegistry.registerItem(gemNetherQuartz, gemNetherQuartz.getUnlocalizedName());
		GameRegistry.registerItem(gemOnyx, gemOnyx.getUnlocalizedName());
		GameRegistry.registerItem(gemOpal, gemOpal.getUnlocalizedName());
		GameRegistry.registerItem(gemQuartz, gemQuartz.getUnlocalizedName());
		GameRegistry.registerItem(gemRuby, gemRuby.getUnlocalizedName());
		GameRegistry.registerItem(gemSapphire, gemSapphire.getUnlocalizedName());
		GameRegistry.registerItem(gemTopaz, gemTopaz.getUnlocalizedName());
		
		// Shards
		GameRegistry.registerItem(shardAmazonite, shardAmazonite.getUnlocalizedName());
		GameRegistry.registerItem(shardAmber, shardAmber.getUnlocalizedName());
		GameRegistry.registerItem(shardAmethyst, shardAmethyst.getUnlocalizedName());
		GameRegistry.registerItem(shardAquamarine, shardAquamarine.getUnlocalizedName());
		GameRegistry.registerItem(shardCarnelian, shardCarnelian.getUnlocalizedName());
		GameRegistry.registerItem(shardCitrine, shardCitrine.getUnlocalizedName());
		GameRegistry.registerItem(shardDiamond, shardDiamond.getUnlocalizedName());
		GameRegistry.registerItem(shardEmerald, shardEmerald.getUnlocalizedName());
		GameRegistry.registerItem(shardGarnet, shardGarnet.getUnlocalizedName());
		GameRegistry.registerItem(shardJade, shardJade.getUnlocalizedName());
		GameRegistry.registerItem(shardKunzite, shardKunzite.getUnlocalizedName());
		GameRegistry.registerItem(shardNetherQuartz, shardNetherQuartz.getUnlocalizedName());
		GameRegistry.registerItem(shardOnyx, shardOnyx.getUnlocalizedName());
		GameRegistry.registerItem(shardRuby, shardRuby.getUnlocalizedName());
		GameRegistry.registerItem(shardSapphire, shardSapphire.getUnlocalizedName());
		
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
		
		GameRegistry.registerItem(trytementium,"trytementium");
		GameRegistry.registerItem(iridium, "iridium");
		GameRegistry.registerItem(uranium, "uranium");
		GameRegistry.registerItem(topaz,"topaz");
		GameRegistry.registerItem(plutonium, "plutonium");
		
		GameRegistry.registerItem(cherry, "cherry");
	}

}
