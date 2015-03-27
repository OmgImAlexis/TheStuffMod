package com.omgimalexis.allthethings.init;

import net.minecraft.item.ItemEgg;

import com.omgimalexis.allthethings.item.ItemBanana;
import com.omgimalexis.allthethings.item.ItemBasic;
import com.omgimalexis.allthethings.item.ItemBasicCake;
import com.omgimalexis.allthethings.item.ItemBasicEgg;
import com.omgimalexis.allthethings.item.ItemBasicFood;
import com.omgimalexis.allthethings.item.ItemBasicSeedFood;
import com.omgimalexis.allthethings.item.ItemBucketDrink;
import com.omgimalexis.allthethings.item.ItemDebugger;
import com.omgimalexis.allthethings.item.ItemFossil;
import com.omgimalexis.allthethings.item.ItemKnife;
import com.omgimalexis.allthethings.item.ItemPaintbrush;
import com.omgimalexis.allthethings.item.ItemUpgrade;
import com.omgimalexis.allthethings.utility.Register;

import cpw.mods.fml.common.registry.ExistingSubstitutionException;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.Type;

public class ModItems {
	
	// Ingots
	public static final ItemBasic ingotAdamanite = new ItemBasic("ingotAdamanite",ModCreativeTabs.item);
	public static final ItemBasic ingotAdamant = new ItemBasic("ingotAdamant",ModCreativeTabs.item);
	public static final ItemBasic ingotAluminium = new ItemBasic("ingotAluminium",ModCreativeTabs.item);
	public static final ItemBasic ingotBlurite = new ItemBasic("ingotBlurite",ModCreativeTabs.item);
	public static final ItemBasic ingotBrass = new ItemBasic("ingotBrass",ModCreativeTabs.item);
	public static final ItemBasic ingotBronze = new ItemBasic("ingotBronze",ModCreativeTabs.item);
	public static final ItemBasic ingotChromium = new ItemBasic("ingotChromium",ModCreativeTabs.item);
	public static final ItemBasic ingotCobalt = new ItemBasic("ingotCobalt",ModCreativeTabs.item);
	public static final ItemBasic ingotCopper = new ItemBasic("ingotCopper",ModCreativeTabs.item);
	public static final ItemBasic ingotDaeyalt = new ItemBasic("ingotDaeyalt",ModCreativeTabs.item);
	public static final ItemBasic ingotElectrum = new ItemBasic("ingotElectrum",ModCreativeTabs.item);
	public static final ItemBasic ingotGoloid = new ItemBasic("ingotGoloid",ModCreativeTabs.item);
	public static final ItemBasic ingotInvar = new ItemBasic("ingotInvar",ModCreativeTabs.item);
	public static final ItemBasic ingotLead = new ItemBasic("ingotLead",ModCreativeTabs.item);
	public static final ItemBasic ingotLunar = new ItemBasic("ingotLunar",ModCreativeTabs.item);
	public static final ItemBasic ingotMalagnite = new ItemBasic("ingotMalagnite",ModCreativeTabs.item);
	public static final ItemBasic ingotManganese = new ItemBasic("ingotManganese",ModCreativeTabs.item);
	public static final ItemBasic ingotMithril = new ItemBasic("ingotMithril",ModCreativeTabs.item);
	public static final ItemBasic ingotNickel = new ItemBasic("ingotNickel",ModCreativeTabs.item);
	public static final ItemBasic ingotObsidian = new ItemBasic("ingotObsidian",ModCreativeTabs.item);
	public static final ItemBasic ingotPlatinum = new ItemBasic("ingotPlatinum",ModCreativeTabs.item);
	public static final ItemBasic ingotRhodium = new ItemBasic("ingotRhodium",ModCreativeTabs.item);
	public static final ItemBasic ingotRubium = new ItemBasic("ingotRubium",ModCreativeTabs.item);
	public static final ItemBasic ingotRunite = new ItemBasic("ingotRunite",ModCreativeTabs.item);
	public static final ItemBasic ingotSilicon = new ItemBasic("ingotSilicon", ModCreativeTabs.item);
	public static final ItemBasic ingotSilver = new ItemBasic("ingotSilver",ModCreativeTabs.item);
	public static final ItemBasic ingotSolder = new ItemBasic("ingotSolder",ModCreativeTabs.item);
	public static final ItemBasic ingotSteel = new ItemBasic("ingotSteel",ModCreativeTabs.item);
	public static final ItemBasic ingotTin = new ItemBasic("ingotTin",ModCreativeTabs.item);
	public static final ItemBasic ingotTitanium = new ItemBasic("ingotTitanium",ModCreativeTabs.item);
	public static final ItemBasic ingotTungsten = new ItemBasic("ingotTungsten",ModCreativeTabs.item);
	public static final ItemBasic ingotZinc = new ItemBasic("ingotZinc",ModCreativeTabs.item);
	
	// Dusts
	public static final ItemBasic dustAdamanite = new ItemBasic("dustAdamanite",ModCreativeTabs.plate);
	public static final ItemBasic dustAdamant = new ItemBasic("dustAdamant",ModCreativeTabs.plate);
	public static final ItemBasic dustAluminium = new ItemBasic("dustAluminium",ModCreativeTabs.plate);
	public static final ItemBasic dustBlurite = new ItemBasic("dustBlurite",ModCreativeTabs.plate);
	public static final ItemBasic dustBrass = new ItemBasic("dustBrass",ModCreativeTabs.plate);
	public static final ItemBasic dustBronze = new ItemBasic("dustBronze",ModCreativeTabs.plate);
	public static final ItemBasic dustChromium = new ItemBasic("dustChromium",ModCreativeTabs.plate);
	public static final ItemBasic dustCobalt = new ItemBasic("dustCobalt",ModCreativeTabs.plate);
	public static final ItemBasic dustCopper = new ItemBasic("dustCopper",ModCreativeTabs.plate);
	public static final ItemBasic dustDaeyalt = new ItemBasic("dustDaeyalt",ModCreativeTabs.plate);
	public static final ItemBasic dustElectrum = new ItemBasic("dustElectrum",ModCreativeTabs.plate);
	public static final ItemBasic dustGold = new ItemBasic("dustGold",ModCreativeTabs.plate);
	public static final ItemBasic dustGoloid = new ItemBasic("dustGoloid",ModCreativeTabs.plate);
	public static final ItemBasic dustInvar = new ItemBasic("dustInvar",ModCreativeTabs.plate);
	public static final ItemBasic dustIron = new ItemBasic("dustIron",ModCreativeTabs.plate);
	public static final ItemBasic dustLead = new ItemBasic("dustLead",ModCreativeTabs.plate);
	public static final ItemBasic dustLunar = new ItemBasic("dustLunar",ModCreativeTabs.plate);
	public static final ItemBasic dustMalagnite = new ItemBasic("dustMalagnite",ModCreativeTabs.plate);
	public static final ItemBasic dustManganese = new ItemBasic("dustManganese",ModCreativeTabs.plate);
	public static final ItemBasic dustMithril = new ItemBasic("dustMithril",ModCreativeTabs.plate);
	public static final ItemBasic dustNickel = new ItemBasic("dustNickel",ModCreativeTabs.plate);
	public static final ItemBasic dustObsidian = new ItemBasic("dustObsidian",ModCreativeTabs.plate);
	public static final ItemBasic dustPlatinum = new ItemBasic("dustPlatinum",ModCreativeTabs.plate);
	public static final ItemBasic dustRhodium = new ItemBasic("dustRhodium",ModCreativeTabs.plate);
	public static final ItemBasic dustRubium = new ItemBasic("dustRubium",ModCreativeTabs.plate);
	public static final ItemBasic dustRunite = new ItemBasic("dustRunite",ModCreativeTabs.plate);
	public static final ItemBasic dustSilicon = new ItemBasic("dustSilicon", ModCreativeTabs.plate);
	public static final ItemBasic dustSilver = new ItemBasic("dustSilver",ModCreativeTabs.plate);
	public static final ItemBasic dustSolder = new ItemBasic("dustSolder",ModCreativeTabs.plate);
	public static final ItemBasic dustSteel = new ItemBasic("dustSteel",ModCreativeTabs.plate);
	public static final ItemBasic dustTin = new ItemBasic("dustTin",ModCreativeTabs.plate);
	public static final ItemBasic dustTitanium = new ItemBasic("dustTitanium",ModCreativeTabs.plate);
	public static final ItemBasic dustTungsten = new ItemBasic("dustTungsten",ModCreativeTabs.plate);
	public static final ItemBasic dustZinc = new ItemBasic("dustZinc",ModCreativeTabs.plate);
	
	public static final ItemBasic dustAmazonite = new ItemBasic("dustAmazonite",ModCreativeTabs.plate);
	public static final ItemBasic dustAmber = new ItemBasic("dustAmber",ModCreativeTabs.plate);
	public static final ItemBasic dustAmethyst = new ItemBasic("dustAmethyst",ModCreativeTabs.plate);
	public static final ItemBasic dustAquamarine = new ItemBasic("dustAquamarine",ModCreativeTabs.plate);
	public static final ItemBasic dustCarnelian = new ItemBasic("dustCarnelian",ModCreativeTabs.plate);
	public static final ItemBasic dustCitrine = new ItemBasic("dustCitrine",ModCreativeTabs.plate);
	public static final ItemBasic dustDiamond = new ItemBasic("dustDiamond",ModCreativeTabs.plate);
	public static final ItemBasic dustEmerald = new ItemBasic("dustEmerald",ModCreativeTabs.plate);
	public static final ItemBasic dustGarnet = new ItemBasic("dustGarnet",ModCreativeTabs.plate);
	public static final ItemBasic dustJade = new ItemBasic("dustJade",ModCreativeTabs.plate);
	public static final ItemBasic dustKunzite = new ItemBasic("dustKunzite",ModCreativeTabs.plate);
	public static final ItemBasic dustNetherQuartz = new ItemBasic("dustNetherQuartz",ModCreativeTabs.plate);
	public static final ItemBasic dustOnyx = new ItemBasic("dustOnyx",ModCreativeTabs.plate);
	public static final ItemBasic dustOpal = new ItemBasic("dustOpal",ModCreativeTabs.plate);
	public static final ItemBasic dustQuartz = new ItemBasic("dustQuartz",ModCreativeTabs.plate);
	public static final ItemBasic dustRuby = new ItemBasic("dustRuby",ModCreativeTabs.plate);
	public static final ItemBasic dustSapphire = new ItemBasic("dustSapphire",ModCreativeTabs.plate);
	public static final ItemBasic dustTopaz = new ItemBasic("dustTopaz",ModCreativeTabs.plate);
	
	public static final ItemBasic dustVoidium = new ItemBasic("dustVoidium",ModCreativeTabs.plate);
	public static final ItemBasic dustFyrestone = new ItemBasic("dustFyrestone",ModCreativeTabs.plate);
	
	public static final ItemBasic dustIridium = new ItemBasic("dustIridium",ModCreativeTabs.plate);
	public static final ItemBasic dustPlutonium = new ItemBasic("dustPlutonium", ModCreativeTabs.plate);
	public static final ItemBasic dustUranium = new ItemBasic("dustUranium",ModCreativeTabs.plate);
	
	public static final ItemBasic dustCrymeretye = new ItemBasic("dustCrymeretye",ModCreativeTabs.plate);
	public static final ItemBasic dustMuktaphlyte  = new ItemBasic("dustMuktaphlyte",ModCreativeTabs.plate);
	public static final ItemBasic dustJonjronyphyll  = new ItemBasic("dustJonjronyphyll",ModCreativeTabs.plate);
	public static final ItemBasic dustKraktachnar  = new ItemBasic("dustKraktachnar",ModCreativeTabs.plate);
	public static final ItemBasic dustXaldriodythidyte  = new ItemBasic("dustXaldriodythidyte",ModCreativeTabs.plate);
	public static final ItemBasic dustTrytementium = new ItemBasic("dustTrytementium",ModCreativeTabs.plate);
	public static final ItemBasic dustUnobtanium = new ItemBasic("dustUnobtanium",ModCreativeTabs.plate);
	
	public static final ItemBasic dustCoal = new ItemBasic("dustCoal", ModCreativeTabs.plate);
	public static final ItemBasic dustLapis = new ItemBasic("dustLapis", ModCreativeTabs.plate);
	
	// Clusters
	public static final ItemBasic clusterAdamanite = new ItemBasic("clusterAdamanite",ModCreativeTabs.plate);
	public static final ItemBasic clusterAdamant = new ItemBasic("clusterAdamant",ModCreativeTabs.plate);
	public static final ItemBasic clusterAluminium = new ItemBasic("clusterAluminium",ModCreativeTabs.plate);
	public static final ItemBasic clusterBlurite = new ItemBasic("clusterBlurite",ModCreativeTabs.plate);
	public static final ItemBasic clusterBrass = new ItemBasic("clusterBrass",ModCreativeTabs.plate);
	public static final ItemBasic clusterBronze = new ItemBasic("clusterBronze",ModCreativeTabs.plate);
	public static final ItemBasic clusterChromium = new ItemBasic("clusterChromium",ModCreativeTabs.plate);
	public static final ItemBasic clusterCobalt = new ItemBasic("clusterCobalt",ModCreativeTabs.plate);
	public static final ItemBasic clusterCopper = new ItemBasic("clusterCopper",ModCreativeTabs.plate);
	public static final ItemBasic clusterDaeyalt = new ItemBasic("clusterDaeyalt",ModCreativeTabs.plate);
	public static final ItemBasic clusterElectrum = new ItemBasic("clusterElectrum",ModCreativeTabs.plate);
	public static final ItemBasic clusterGold = new ItemBasic("clusterGold",ModCreativeTabs.plate);
	public static final ItemBasic clusterGoloid = new ItemBasic("clusterGoloid",ModCreativeTabs.plate);
	public static final ItemBasic clusterInvar = new ItemBasic("clusterInvar",ModCreativeTabs.plate);
	public static final ItemBasic clusterIron = new ItemBasic("clusterIron",ModCreativeTabs.plate);
	public static final ItemBasic clusterLead = new ItemBasic("clusterLead",ModCreativeTabs.plate);
	public static final ItemBasic clusterLunar = new ItemBasic("clusterLunar",ModCreativeTabs.plate);
	public static final ItemBasic clusterMalagnite = new ItemBasic("clusterMalagnite",ModCreativeTabs.plate);
	public static final ItemBasic clusterManganese = new ItemBasic("clusterManganese",ModCreativeTabs.plate);
	public static final ItemBasic clusterMithril = new ItemBasic("clusterMithril",ModCreativeTabs.plate);
	public static final ItemBasic clusterNickel = new ItemBasic("clusterNickel",ModCreativeTabs.plate);
	public static final ItemBasic clusterObsidian = new ItemBasic("clusterObsidian",ModCreativeTabs.plate);
	public static final ItemBasic clusterPlatinum = new ItemBasic("clusterPlatinum",ModCreativeTabs.plate);
	public static final ItemBasic clusterRhodium = new ItemBasic("clusterRhodium",ModCreativeTabs.plate);
	public static final ItemBasic clusterRubium = new ItemBasic("clusterRubium",ModCreativeTabs.plate);
	public static final ItemBasic clusterRunite = new ItemBasic("clusterRunite",ModCreativeTabs.plate);
	public static final ItemBasic clusterSilicon = new ItemBasic("clusterSilicon", ModCreativeTabs.plate);
	public static final ItemBasic clusterSilver = new ItemBasic("clusterSilver",ModCreativeTabs.plate);
	public static final ItemBasic clusterSolder = new ItemBasic("clusterSolder",ModCreativeTabs.plate);
	public static final ItemBasic clusterSteel = new ItemBasic("clusterSteel",ModCreativeTabs.plate);
	public static final ItemBasic clusterTin = new ItemBasic("clusterTin",ModCreativeTabs.plate);
	public static final ItemBasic clusterTitanium = new ItemBasic("clusterTitanium",ModCreativeTabs.plate);
	public static final ItemBasic clusterTungsten = new ItemBasic("clusterTungsten",ModCreativeTabs.plate);
	public static final ItemBasic clusterZinc = new ItemBasic("clusterZinc",ModCreativeTabs.plate);
	
	public static final ItemBasic clusterAmazonite = new ItemBasic("clusterAmazonite",ModCreativeTabs.plate);
	public static final ItemBasic clusterAmber = new ItemBasic("clusterAmber",ModCreativeTabs.plate);
	public static final ItemBasic clusterAmethyst = new ItemBasic("clusterAmethyst",ModCreativeTabs.plate);
	public static final ItemBasic clusterAquamarine = new ItemBasic("clusterAquamarine",ModCreativeTabs.plate);
	public static final ItemBasic clusterCarnelian = new ItemBasic("clusterCarnelian",ModCreativeTabs.plate);
	public static final ItemBasic clusterCitrine = new ItemBasic("clusterCitrine",ModCreativeTabs.plate);
	public static final ItemBasic clusterDiamond = new ItemBasic("clusterDiamond",ModCreativeTabs.plate);
	public static final ItemBasic clusterEmerald = new ItemBasic("clusterEmerald",ModCreativeTabs.plate);
	public static final ItemBasic clusterGarnet = new ItemBasic("clusterGarnet",ModCreativeTabs.plate);
	public static final ItemBasic clusterJade = new ItemBasic("clusterJade",ModCreativeTabs.plate);
	public static final ItemBasic clusterKunzite = new ItemBasic("clusterKunzite",ModCreativeTabs.plate);
	public static final ItemBasic clusterNetherQuartz = new ItemBasic("clusterNetherQuartz",ModCreativeTabs.plate);
	public static final ItemBasic clusterOnyx = new ItemBasic("clusterOnyx",ModCreativeTabs.plate);
	public static final ItemBasic clusterOpal = new ItemBasic("clusterOpal",ModCreativeTabs.plate);
	public static final ItemBasic clusterQuartz = new ItemBasic("clusterQuartz",ModCreativeTabs.plate);
	public static final ItemBasic clusterRuby = new ItemBasic("clusterRuby",ModCreativeTabs.plate);
	public static final ItemBasic clusterSapphire = new ItemBasic("clusterSapphire",ModCreativeTabs.plate);
	public static final ItemBasic clusterTopaz = new ItemBasic("clusterTopaz",ModCreativeTabs.plate);
	
	public static final ItemBasic clusterVoidium = new ItemBasic("clusterVoidium",ModCreativeTabs.plate);
	public static final ItemBasic clusterFyrestone = new ItemBasic("clusterFyrestone",ModCreativeTabs.plate);
	
	public static final ItemBasic clusterIridium = new ItemBasic("clusterIridium",ModCreativeTabs.plate);
	public static final ItemBasic clusterPlutonium = new ItemBasic("clusterPlutonium", ModCreativeTabs.plate);
	public static final ItemBasic clusterUranium = new ItemBasic("clusterUranium",ModCreativeTabs.plate);
	
	public static final ItemBasic clusterCrymeretye = new ItemBasic("clusterCrymeretye",ModCreativeTabs.plate);
	public static final ItemBasic clusterMuktaphlyte  = new ItemBasic("clusterMuktaphlyte",ModCreativeTabs.plate);
	public static final ItemBasic clusterJonjronyphyll  = new ItemBasic("clusterJonjronyphyll",ModCreativeTabs.plate);
	public static final ItemBasic clusterKraktachnar  = new ItemBasic("clusterKraktachnar",ModCreativeTabs.plate);
	public static final ItemBasic clusterXaldriodythidyte  = new ItemBasic("clusterXaldriodythidyte",ModCreativeTabs.plate);
	public static final ItemBasic clusterTrytementium = new ItemBasic("clusterTrytementium",ModCreativeTabs.plate);
	public static final ItemBasic clusterUnobtanium = new ItemBasic("clusterUnobtanium",ModCreativeTabs.plate);
	
	public static final ItemBasic clusterCoal = new ItemBasic("clusterCoal", ModCreativeTabs.plate);
	public static final ItemBasic clusterLapis = new ItemBasic("clusterLapis", ModCreativeTabs.plate);
	public static final ItemBasic clusterRedstone = new ItemBasic("clusterRedstone", ModCreativeTabs.plate);
	
	// Plates
	public static final ItemBasic plateAdamanite = new ItemBasic("plateAdamanite",ModCreativeTabs.plate);
	public static final ItemBasic plateAdamant = new ItemBasic("plateAdamant",ModCreativeTabs.plate);
	public static final ItemBasic plateAluminium = new ItemBasic("plateAluminium",ModCreativeTabs.plate);
	public static final ItemBasic plateBlurite = new ItemBasic("plateBlurite",ModCreativeTabs.plate);
	public static final ItemBasic plateBrass = new ItemBasic("plateBrass",ModCreativeTabs.plate);
	public static final ItemBasic plateBronze = new ItemBasic("plateBronze",ModCreativeTabs.plate);
	public static final ItemBasic plateChromium = new ItemBasic("plateChromium",ModCreativeTabs.plate);
	public static final ItemBasic plateCobalt = new ItemBasic("plateCobalt",ModCreativeTabs.plate);
	public static final ItemBasic plateCopper = new ItemBasic("plateCopper",ModCreativeTabs.plate);
	public static final ItemBasic plateDaeyalt = new ItemBasic("plateDaeyalt",ModCreativeTabs.plate);
	public static final ItemBasic plateElectrum = new ItemBasic("plateElectrum",ModCreativeTabs.plate);
	public static final ItemBasic plateGold = new ItemBasic("plateGold",ModCreativeTabs.plate);
	public static final ItemBasic plateGoloid = new ItemBasic("plateGoloid",ModCreativeTabs.plate);
	public static final ItemBasic plateInvar = new ItemBasic("plateInvar",ModCreativeTabs.plate);
	public static final ItemBasic plateIron = new ItemBasic("plateIron",ModCreativeTabs.plate);
	public static final ItemBasic plateLead = new ItemBasic("plateLead",ModCreativeTabs.plate);
	public static final ItemBasic plateLunar = new ItemBasic("plateLunar",ModCreativeTabs.plate);
	public static final ItemBasic plateMalagnite = new ItemBasic("plateMalagnite",ModCreativeTabs.plate);
	public static final ItemBasic plateManganese = new ItemBasic("plateManganese",ModCreativeTabs.plate);
	public static final ItemBasic plateMithril = new ItemBasic("plateMithril",ModCreativeTabs.plate);
	public static final ItemBasic plateNickel = new ItemBasic("plateNickel",ModCreativeTabs.plate);
	public static final ItemBasic plateObsidian = new ItemBasic("plateObsidian",ModCreativeTabs.plate);
	public static final ItemBasic platePlatinum = new ItemBasic("platePlatinum",ModCreativeTabs.plate);
	public static final ItemBasic plateRhodium = new ItemBasic("plateRhodium",ModCreativeTabs.plate);
	public static final ItemBasic plateRunite = new ItemBasic("plateRunite",ModCreativeTabs.plate);
	public static final ItemBasic plateSilicon = new ItemBasic("plateSilicon", ModCreativeTabs.plate);
	public static final ItemBasic plateSilver = new ItemBasic("plateSilver",ModCreativeTabs.plate);
	public static final ItemBasic plateSolder = new ItemBasic("plateSolder",ModCreativeTabs.plate);
	public static final ItemBasic plateSteel = new ItemBasic("plateSteel",ModCreativeTabs.plate);
	public static final ItemBasic plateTin = new ItemBasic("plateTin",ModCreativeTabs.plate);
	public static final ItemBasic plateTitanium = new ItemBasic("plateTitanium",ModCreativeTabs.plate);
	public static final ItemBasic plateTungsten = new ItemBasic("plateTungsten",ModCreativeTabs.plate);
	public static final ItemBasic plateZinc = new ItemBasic("plateZinc",ModCreativeTabs.plate);
	
	// Gems
	public static final ItemBasic gemAmazonite = new ItemBasic("gemAmazonite");
	public static final ItemBasic gemAmber = new ItemBasic("gemAmber");
	public static final ItemBasic gemAmethyst = new ItemBasic("gemAmethyst");
	public static final ItemBasic gemAquamarine = new ItemBasic("gemAquamarine");
	public static final ItemBasic gemCarnelian = new ItemBasic("gemCarnelian");
	public static final ItemBasic gemCitrine = new ItemBasic("gemCitrine");
	public static final ItemBasic gemDiamond = new ItemBasic("gemDiamond");
	public static final ItemBasic gemGarnet = new ItemBasic("gemGarnet");
	public static final ItemBasic gemJade = new ItemBasic("gemJade");
	public static final ItemBasic gemKunzite = new ItemBasic("gemKunzite");
	public static final ItemBasic gemNetherQuartz = new ItemBasic("gemNetherQuartz");
	public static final ItemBasic gemOnyx = new ItemBasic("gemOnyx");
	public static final ItemBasic gemOpal = new ItemBasic("gemOpal");
	public static final ItemBasic gemQuartz = new ItemBasic("gemQuartz");
	public static final ItemBasic gemRuby = new ItemBasic("gemRuby");
	public static final ItemBasic gemSapphire = new ItemBasic("gemSapphire");
	public static final ItemBasic gemTopaz = new ItemBasic("gemTopaz");
	
	// Pure Stuff
	public static final ItemBasic gemPureAmazonite = new ItemBasic("amazonitePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureAmber = new ItemBasic("amberPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureAmethyst = new ItemBasic("amethystPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureAquamarine = new ItemBasic("aquamarinePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureCarnelian = new ItemBasic("carnelianPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureCitrine = new ItemBasic("citrinePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureDiamond = new ItemBasic("diamondPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureEmerald = new ItemBasic("emeraldPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureGarnet = new ItemBasic("garnetPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureJade = new ItemBasic("jadePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureKunzite = new ItemBasic("kunzitePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureNetherQuartz = new ItemBasic("netherQuartzPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureOnyx = new ItemBasic("onyxPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureOpal = new ItemBasic("opalPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureQuartz = new ItemBasic("quartzPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureRuby = new ItemBasic("rubyPure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureSapphire = new ItemBasic("sapphirePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureTopaz = new ItemBasic("topazPure",ModCreativeTabs.pure);
	
	public static final ItemBasic gemPureFyrestone = new ItemBasic("fyrestonePure",ModCreativeTabs.pure);
	public static final ItemBasic gemPureVoidiumRadioactiveFocused = new ItemBasic("voidiumPureRadioactiveFocused",ModCreativeTabs.pure, "§8And You Purified the Gem. §2RADIOACTIVE");
	
	public static final ItemBasic pureObsidian = new ItemBasic("obsidianPure",ModCreativeTabs.pure);
	
	// Shards
	public static final ItemBasic shardAmazonite = new ItemBasic("amazoniteShard",ModCreativeTabs.pure);
	public static final ItemBasic shardAmber = new ItemBasic("amberShard",ModCreativeTabs.pure);
	public static final ItemBasic shardAmethyst = new ItemBasic("amethystShard",ModCreativeTabs.pure);
	public static final ItemBasic shardAquamarine = new ItemBasic("aquamarineShard",ModCreativeTabs.pure);
	public static final ItemBasic shardCarnelian = new ItemBasic("carnelianShard",ModCreativeTabs.pure);
	public static final ItemBasic shardCitrine = new ItemBasic("citrineShard",ModCreativeTabs.pure);
	public static final ItemBasic shardDiamond = new ItemBasic("diamondShard",ModCreativeTabs.pure);
	public static final ItemBasic shardEmerald = new ItemBasic("emeraldShard",ModCreativeTabs.pure);
	public static final ItemBasic shardGarnet = new ItemBasic("garnetShard",ModCreativeTabs.pure);
	public static final ItemBasic shardJade = new ItemBasic("jadeShard",ModCreativeTabs.pure);
	public static final ItemBasic shardKunzite = new ItemBasic("kunziteShard",ModCreativeTabs.pure);
	public static final ItemBasic shardNetherQuartz = new ItemBasic("netherQuartzShard",ModCreativeTabs.pure);
	public static final ItemBasic shardOnyx = new ItemBasic("onyxShard",ModCreativeTabs.pure);
	public static final ItemBasic shardOpal = new ItemBasic("opalShard",ModCreativeTabs.pure);
	public static final ItemBasic shardQuartz = new ItemBasic("quartzShard",ModCreativeTabs.pure);
	public static final ItemBasic shardRuby = new ItemBasic("rubyShard",ModCreativeTabs.pure);
	public static final ItemBasic shardSapphire = new ItemBasic("sapphireShard",ModCreativeTabs.pure);
	public static final ItemBasic shardTopaz = new ItemBasic("topazShard",ModCreativeTabs.pure);
	
	public static final ItemBasic shardFyrestone = new ItemBasic("fyrestoneShard",ModCreativeTabs.pure);
	public static final ItemBasic shardVoidiumRadioactiveFocused = new ItemBasic("voidiumShardRadioactiveFocused",ModCreativeTabs.pure, "§8You... Broke It? Still, §2RADIOACTIVE");
	
	public static final ItemBasic shardObsidian = new ItemBasic("obsidianShard",ModCreativeTabs.pure);
	
	public static final ItemBasic shardTrytementium  = new ItemBasic("trytementiumShard",ModCreativeTabs.pure);
	public static final ItemBasic shardUnobtanium  = new ItemBasic("unobtaniumShard",ModCreativeTabs.pure);
	
	// Radioactive Materials
	public static final ItemBasic iridium  = new ItemBasic("iridium",ModCreativeTabs.item, "§2Radioactive");
	public static final ItemBasic plutonium  = new ItemBasic("plutonium", ModCreativeTabs.item, "§2Radioactive");
	public static final ItemBasic uranium  = new ItemBasic("uranium",ModCreativeTabs.item, "§2Radioactive");
	
	// Special Materials
	public static final ItemBasic crymeretye  = new ItemBasic("crymeretye",ModCreativeTabs.item, "§dIt Feels Warm to the Touch");
	public static final ItemBasic graeconthylynium  = new ItemBasic("graeconthylynium",ModCreativeTabs.item, "§dIt Feels Slimy and Gooey");
	public static final ItemBasic muktaphlyte  = new ItemBasic("muktaphlyte",ModCreativeTabs.item, "§dIt Feels Soft and Malleable");
	public static final ItemBasic jonjronyphyll  = new ItemBasic("jonjronyphyll",ModCreativeTabs.item, "§dIt Feels Leathery, Almost");
	public static final ItemBasic kraktachnar  = new ItemBasic("kraktachnar",ModCreativeTabs.item, "§dIt Feels Very Solid");
	public static final ItemBasic xaldriodythidyte  = new ItemBasic("xaldriodythidyte",ModCreativeTabs.item, "§dIt Feels Weightless");
	public static final ItemBasic trytementium  = new ItemBasic("trytementium",ModCreativeTabs.item, "§aHigh Magical Traces");
	public static final ItemBasic unobtanium  = new ItemBasic("unobtanium",ModCreativeTabs.item, "§5It Looks Strange.");
	
	// Bands
	public static final ItemBasic goldBand = new ItemBasic("goldBand",ModCreativeTabs.jewelry);
	public static final ItemBasic silverBand = new ItemBasic("silverBand",ModCreativeTabs.jewelry);
	public static final ItemBasic copperBand = new ItemBasic("copperBand",ModCreativeTabs.jewelry);
	
	// Fyrestone Forms
	public static final ItemBasic fyrestone = new ItemBasic("fyrestone",ModCreativeTabs.item, "§4Hot Potato, Hot Potato!");
	public static final ItemBasic fyrestoneStable = new ItemBasic("fyrestoneStable",ModCreativeTabs.item, "§4Not As Hot To Human Hands Potato!");
	public static final ItemBasic fyrestoneGem = new ItemBasic("fyrestoneGem",ModCreativeTabs.item);
	public static final ItemBasic fyrestoneCut = new ItemBasic("fyrestoneCut",ModCreativeTabs.item);
	
	// Voidium Forms
	public static final ItemBasic voidium = new ItemBasic("voidium",ModCreativeTabs.item, "§8Dangerous");
	public static final ItemBasic voidiumStable = new ItemBasic("voidiumStable",ModCreativeTabs.item, "§8Still Very Dangerous");
	public static final ItemBasic voidiumRadioactiveFocused = new ItemBasic("voidiumRadioactiveFocused",ModCreativeTabs.item, "§8And You Made It Into a Gem. *claps* §2RADIOACTIVE");
	public static final ItemBasic voidiumCutRadioactiveFocused = new ItemBasic("voidiumCutRadioactiveFocused",ModCreativeTabs.item, "§8Now You've Cut It. §2RADIOACTIVE");
	public static final ItemBasic voidiumOrb = new ItemBasic("voidiumOrb",ModCreativeTabs.item, "§8Round. But Still Dangerous");
	public static final ItemBasic voidiumOrbRadioactive = new ItemBasic("voidiumOrbRadioactive",ModCreativeTabs.item, "§8Great, Now It's §2Radioactive");
	public static final ItemBasic voidiumOrbRadioactiveFocused = new ItemBasic("voidiumOrbRadioactiveFocused",ModCreativeTabs.item, "§8MORE §2RADIOACTIVE§0?!");
	public static final ItemBasic voidiumOrbRadioactiveFocusedCondensed = new ItemBasic("voidiumOrbRadioactiveFocusedCondensed",ModCreativeTabs.item, "§8Smaller, But Still VERY §2RADIOACTIVE");
	public static final ItemBasic voidiumOrbRadioactiveFocusedCondensedFragile = new ItemBasic("voidiumOrbRadioactiveFocusedCondensedFragile",ModCreativeTabs.item, "§8Fragile, Dangerous AND §2Radioactive§0?!");
	
	// Ylvoltium Forms
	public static final ItemBasic ylvoltium = new ItemBasic("ylvoltium",ModCreativeTabs.item, "§ePure Electricty. It's shiny.");
	public static final ItemBasic ylvoltiumInfused = new ItemBasic("ylvoltiumInfused",ModCreativeTabs.item, "§ePure Electricty. It's shinier now.");
	public static final ItemBasic ylvoltiumFocused = new ItemBasic("ylvoltiumFocused",ModCreativeTabs.item, "§ePurer Electricty. It's shiny.");
	public static final ItemBasic ylvoltiumFluxed = new ItemBasic("ylvoltiumFluxed",ModCreativeTabs.item, "§eElectricity Infused Electricty.");
	
	// Colours
	public static final ItemBasic paintbrush = new ItemBasic("paintbrush", ModCreativeTabs.paint, 1);
	public static final ItemPaintbrush paintbrushColoured = new ItemPaintbrush("paintbrushColoured", ModCreativeTabs.paint, 1);
	
	// Food
	public static final ItemBasicFood cherry = new ItemBasicFood("cherry", ModCreativeTabs.food, 2, 2.0f, false);
	public static final ItemBasicFood lemon = new ItemBasicFood("lemon", ModCreativeTabs.food, 3, 2.2f, false);
	public static final ItemBanana banana = new ItemBanana("banana", ModCreativeTabs.food, 1, 4, 2.5f);
	public static final ItemBasicSeedFood lettuce = new ItemBasicSeedFood("lettuce", ModCreativeTabs.food, 3, 2.2f, ModBlocksPreItems.lettuceCrop);
	public static final ItemBasicSeedFood tomato = new ItemBasicSeedFood("tomato", ModCreativeTabs.food, 3, 2.2f, ModBlocksPreItems.tomatoCrop);
	public static final ItemBasicFood strawberry = new ItemBasicFood("strawberry", ModCreativeTabs.food, 2, 2.0f, false);
	public static final ItemBasicFood raspberry = new ItemBasicFood("raspberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood blueberry = new ItemBasicFood("blueberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood blackberry = new ItemBasicFood("blackberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood cherryPie = new ItemBasicFood("cherryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood lemonTart = new ItemBasicFood("lemonTart", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood applePie = new ItemBasicFood("applePie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood slicedBread = new ItemBasicFood("slicedBread", ModCreativeTabs.food, 2, 2.4f, false);
	public static final ItemBasicFood toast = new ItemBasicFood("toast", ModCreativeTabs.food, 3, 2.5f, false);
	public static final ItemBasicFood strawberryJamToast = new ItemBasicFood("strawberryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood strawberryJam = new ItemBasicFood("strawberryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood strawberryJamSandwich = new ItemBasicFood("strawberryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood strawberryJamPancake = new ItemBasicFood("strawberryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood raspberryJamToast = new ItemBasicFood("raspberryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood raspberryJam = new ItemBasicFood("raspberryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood raspberryJamSandwich = new ItemBasicFood("raspberryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood raspberryJamPancake = new ItemBasicFood("raspberryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood blueberryJamToast = new ItemBasicFood("blueberryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood blueberryJam = new ItemBasicFood("blueberryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood blueberryJamSandwich = new ItemBasicFood("blueberryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood blueberryJamPancake = new ItemBasicFood("blueberryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood blackberryJamToast = new ItemBasicFood("blackberryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood blackberryJam = new ItemBasicFood("blackberryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood blackberryJamSandwich = new ItemBasicFood("blackberryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood blackberryJamPancake = new ItemBasicFood("blackberryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood appleJamToast = new ItemBasicFood("appleJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood appleJam = new ItemBasicFood("appleJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood appleJamSandwich = new ItemBasicFood("appleJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood appleJamPancake = new ItemBasicFood("appleJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood cherryJamToast = new ItemBasicFood("cherryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood cherryJam = new ItemBasicFood("cherryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood cherryJamSandwich = new ItemBasicFood("cherryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood cherryJamPancake = new ItemBasicFood("cherryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood lemonMarmaladeToast = new ItemBasicFood("lemonMarmaladeToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood lemonMarmalade = new ItemBasicFood("lemonMarmalade", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood lemonMarmaladeSandwich = new ItemBasicFood("lemonMarmaladeSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood lemonMarmaladePancake = new ItemBasicFood("lemonMarmaladePancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood mapleSyrup = new ItemBasicFood("mapleSyrup", ModCreativeTabs.food, 1, 2, 1.1f, false, true);
	public static final ItemBasicFood blt = new ItemBasicFood("BLT", ModCreativeTabs.food, 10, 8.0f, false);
	public static final ItemBasicFood lemonJuice = new ItemBasicFood("lemonJuice", ModCreativeTabs.food, 1, 2, 1.5f, false, true);
	public static final ItemBasicFood appleJuice = new ItemBasicFood("appleJuice", ModCreativeTabs.food, 1, 2, 1.5f, false, true);
	public static final ItemBasicFood lemonade = new ItemBasicFood("lemonade", ModCreativeTabs.food, 1, 3, 1.0f, false, true);
	public static final ItemBasicFood bananaSmoothie = new ItemBasicFood("bananaSmoothie", ModCreativeTabs.food, 1, 5, 2.5f, false, true);
	public static final ItemBasicFood vegetableStew = new ItemBasicFood("vegetableStew", ModCreativeTabs.food, 1, 7, 5.0f, false);
	public static final ItemBasicFood shellSoup = new ItemBasicFood("shellSoup", ModCreativeTabs.food, 1, 8, 6.0f, false);
	public static final ItemBasicCake chocolateCake = new ItemBasicCake("chocCake", ModCreativeTabs.food, 1, ModBlocksPreItems.chocolateCake);
	public static final ItemBucketDrink chocolateMilk = new ItemBucketDrink("chocolateMilk", ModCreativeTabs.food, 1);
	public static final ItemBasicCake strawberryCake = new ItemBasicCake("strawCake", ModCreativeTabs.food, 1, ModBlocksPreItems.strawberryCake);
	public static final ItemBucketDrink strawberryMilk = new ItemBucketDrink("strawberryMilk", ModCreativeTabs.food, 1);
	public static final ItemBasicFood caramel = new ItemBasicFood("caramel", ModCreativeTabs.food, 2, 0.1F, false);
	public static final ItemBasicFood toffee = new ItemBasicFood("toffee", ModCreativeTabs.food, 3, 0.5F, false);
	public static final ItemBasicFood toffeeApple = new ItemBasicFood("toffeeApple", ModCreativeTabs.food, 1, 5, 1.0F, false);
	public static final ItemBasicFood pancake = new ItemBasicFood("pancake", ModCreativeTabs.food, 4, 1.0F, false);
	public static final ItemBasicFood mapleSyrupPancake = new ItemBasicFood("mapleSyrupPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood lemonSugarPancake = new ItemBasicFood("lemonSugarPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood blueberryPancake = new ItemBasicFood("blueberryPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood rawTortoise = new ItemBasicFood("rawTortoise", ModCreativeTabs.food, 4, 0.5F, true);
	public static final ItemBasicFood cookedTortoise = new ItemBasicFood("cookedTortoise", ModCreativeTabs.food, 7, 4.0F, true);
	
	public static final ItemBasic flour = new ItemBasic("flour", ModCreativeTabs.food);
	public static final ItemBasic mapleSap = new ItemBasic("mapleSap", ModCreativeTabs.misc);
	
	public static final ItemBasic glassJar = new ItemBasic("glassJar", ModCreativeTabs.misc);
	
	public static final ItemKnife knife = new ItemKnife("knife", ModCreativeTabs.tool);
	
	// Fossils
	public static final ItemBasic fossil = new ItemFossil("fossil", ModCreativeTabs.misc, 64);
	
	// Miscellaneous
	public static final ItemBasic resin = new ItemBasic("resin", ModCreativeTabs.misc, "§6Sticky");
	public static final ItemBasic rubber = new ItemBasic("rubber", ModCreativeTabs.misc, "§1Rubbery");
	public static final ItemBasic fossilResin = new ItemBasic("resinFossil", ModCreativeTabs.misc, "§6Sticky, But Solid");
	
	// Magicks
	public static final ItemBasicFood fluxWorm = new ItemBasicFood("fluxWorm", ModCreativeTabs.food, 1, 0.1f, false);
	
	// Upgrades
	public static final ItemUpgrade speedUpgrade = new ItemUpgrade("speedUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade efficiencyUpgrade = new ItemUpgrade("efficiencyUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade outputUpgrade = new ItemUpgrade("outputUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade capacityUpgrade = new ItemUpgrade("capacityUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade inputUpgrade = new ItemUpgrade("inputUpgrade", ModCreativeTabs.misc, 1);
	
	// Random
	public static final ItemBasic mapleLeaf = new ItemBasic("mapleLeaf", ModCreativeTabs.misc);
	
	// Stuff I need
	public static final ItemBasic ringForIcon = new ItemBasic("ringForIcon", null, "This is needed for backend stuff. Does not do anything.");
	
	public static final ItemDebugger debugTool = new ItemDebugger("debugTool", null, 1);
	
	//public static final ItemBasicEgg egg = new ItemBasicEgg();
	//public static final ItemBasic eggShell = new ItemBasic("eggShell", ModCreativeTabs.food, 16);

	public static void init() {
		
		/**GameRegistry.registerItem(eggShell, eggShell.getUnlocalizedName());
		try {
			GameRegistry.addSubstitutionAlias("minecraft:egg", Type.ITEM, egg);
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}**/

		// Ingots
		Register.registerMaterial(ingotAdamanite, ingotAdamanite.getUnlocalizedName());
		Register.registerMaterial(ingotAdamant, ingotAdamant.getUnlocalizedName());
		Register.registerMaterial(ingotAluminium, ingotAluminium.getUnlocalizedName());
		Register.registerMaterial(ingotBlurite, ingotBlurite.getUnlocalizedName());
		Register.registerMaterial(ingotBrass, ingotBrass.getUnlocalizedName());
		Register.registerMaterial(ingotBronze, ingotBronze.getUnlocalizedName());
		Register.registerMaterial(ingotChromium, ingotChromium.getUnlocalizedName());
		Register.registerMaterial(ingotCobalt, ingotCobalt.getUnlocalizedName());
		Register.registerMaterial(ingotCopper, ingotCopper.getUnlocalizedName());
		Register.registerMaterial(ingotDaeyalt, ingotDaeyalt.getUnlocalizedName());
		Register.registerMaterial(ingotElectrum, ingotElectrum.getUnlocalizedName());
		Register.registerMaterial(ingotGoloid, ingotGoloid.getUnlocalizedName());
		Register.registerMaterial(ingotInvar, ingotInvar.getUnlocalizedName());
		Register.registerMaterial(ingotLead, ingotLead.getUnlocalizedName());
		Register.registerMaterial(ingotLunar, ingotLunar.getUnlocalizedName());
		Register.registerMaterial(ingotMalagnite, ingotMalagnite.getUnlocalizedName());
		Register.registerMaterial(ingotManganese, ingotManganese.getUnlocalizedName());
		Register.registerMaterial(ingotMithril, ingotMithril.getUnlocalizedName());
		Register.registerMaterial(ingotNickel, ingotNickel.getUnlocalizedName());
		Register.registerMaterial(ingotPlatinum, ingotPlatinum.getUnlocalizedName());
		Register.registerMaterial(ingotRhodium, ingotRhodium.getUnlocalizedName());
		Register.registerMaterial(ingotRubium, ingotRubium.getUnlocalizedName());
		Register.registerMaterial(ingotRunite, ingotRunite.getUnlocalizedName());
		Register.registerMaterial(ingotSilicon, ingotSilicon.getUnlocalizedName());
		Register.registerMaterial(ingotSilver, ingotSilver.getUnlocalizedName());
		Register.registerMaterial(ingotSolder, ingotSolder.getUnlocalizedName());
		Register.registerMaterial(ingotSteel, ingotSteel.getUnlocalizedName());
		Register.registerMaterial(ingotTin, ingotTin.getUnlocalizedName());
		Register.registerMaterial(ingotTitanium, ingotTitanium.getUnlocalizedName());
		Register.registerMaterial(ingotTungsten, ingotTungsten.getUnlocalizedName());
		Register.registerMaterial(ingotZinc, ingotZinc.getUnlocalizedName());
		
		// Dusts
		GameRegistry.registerItem(dustAdamanite, dustAdamanite.getUnlocalizedName());
		GameRegistry.registerItem(dustAdamant, dustAdamant.getUnlocalizedName());
		GameRegistry.registerItem(dustAluminium, dustAluminium.getUnlocalizedName());
		GameRegistry.registerItem(dustBlurite, dustBlurite.getUnlocalizedName());
		GameRegistry.registerItem(dustBrass, dustBrass.getUnlocalizedName());
		GameRegistry.registerItem(dustBronze, dustBronze.getUnlocalizedName());
		GameRegistry.registerItem(dustChromium, dustChromium.getUnlocalizedName());
		GameRegistry.registerItem(dustCobalt, dustCobalt.getUnlocalizedName());
		GameRegistry.registerItem(dustCopper, dustCopper.getUnlocalizedName());
		GameRegistry.registerItem(dustDaeyalt, dustDaeyalt.getUnlocalizedName());
		GameRegistry.registerItem(dustElectrum, dustElectrum.getUnlocalizedName());
		GameRegistry.registerItem(dustGold, dustGold.getUnlocalizedName());
		GameRegistry.registerItem(dustGoloid, dustGoloid.getUnlocalizedName());
		GameRegistry.registerItem(dustInvar, dustInvar.getUnlocalizedName());
		GameRegistry.registerItem(dustIron, dustIron.getUnlocalizedName());
		GameRegistry.registerItem(dustLead, dustLead.getUnlocalizedName());
		GameRegistry.registerItem(dustLunar, dustLunar.getUnlocalizedName());
		GameRegistry.registerItem(dustMalagnite, dustMalagnite.getUnlocalizedName());
		GameRegistry.registerItem(dustManganese, dustManganese.getUnlocalizedName());
		GameRegistry.registerItem(dustMithril, dustMithril.getUnlocalizedName());
		GameRegistry.registerItem(dustNickel, dustNickel.getUnlocalizedName());
		GameRegistry.registerItem(dustPlatinum, dustPlatinum.getUnlocalizedName());
		GameRegistry.registerItem(dustRhodium, dustRhodium.getUnlocalizedName());
		GameRegistry.registerItem(dustRubium, dustRubium.getUnlocalizedName());
		GameRegistry.registerItem(dustRunite, dustRunite.getUnlocalizedName());
		GameRegistry.registerItem(dustSilicon, dustSilicon.getUnlocalizedName());
		GameRegistry.registerItem(dustSilver, dustSilver.getUnlocalizedName());
		GameRegistry.registerItem(dustSolder, dustSolder.getUnlocalizedName());
		GameRegistry.registerItem(dustSteel, dustSteel.getUnlocalizedName());
		GameRegistry.registerItem(dustTin, dustTin.getUnlocalizedName());
		GameRegistry.registerItem(dustTitanium, dustTitanium.getUnlocalizedName());
		GameRegistry.registerItem(dustTungsten, dustTungsten.getUnlocalizedName());
		GameRegistry.registerItem(dustZinc, dustZinc.getUnlocalizedName());
		
		GameRegistry.registerItem(dustAmazonite, dustAmazonite.getUnlocalizedName());
		GameRegistry.registerItem(dustAmber, dustAmber.getUnlocalizedName());
		GameRegistry.registerItem(dustAmethyst, dustAmethyst.getUnlocalizedName());
		GameRegistry.registerItem(dustAquamarine, dustAquamarine.getUnlocalizedName());
		GameRegistry.registerItem(dustCarnelian, dustCarnelian.getUnlocalizedName());
		GameRegistry.registerItem(dustCitrine, dustCitrine.getUnlocalizedName());
		GameRegistry.registerItem(dustDiamond, dustDiamond.getUnlocalizedName());
		GameRegistry.registerItem(dustEmerald, dustEmerald.getUnlocalizedName());
		GameRegistry.registerItem(dustGarnet, dustGarnet.getUnlocalizedName());
		GameRegistry.registerItem(dustJade, dustJade.getUnlocalizedName());
		GameRegistry.registerItem(dustKunzite, dustKunzite.getUnlocalizedName());
		GameRegistry.registerItem(dustNetherQuartz, dustNetherQuartz.getUnlocalizedName());
		GameRegistry.registerItem(dustOnyx, dustOnyx.getUnlocalizedName());
		GameRegistry.registerItem(dustOpal, dustOpal.getUnlocalizedName());
		GameRegistry.registerItem(dustQuartz, dustQuartz.getUnlocalizedName());
		GameRegistry.registerItem(dustRuby, dustRuby.getUnlocalizedName());
		GameRegistry.registerItem(dustSapphire, dustSapphire.getUnlocalizedName());
		GameRegistry.registerItem(dustTopaz, dustTopaz.getUnlocalizedName());
		
		GameRegistry.registerItem(dustFyrestone, dustFyrestone.getUnlocalizedName());
		GameRegistry.registerItem(dustVoidium, dustVoidium.getUnlocalizedName());
		
		GameRegistry.registerItem(dustIridium, dustIridium.getUnlocalizedName());
		GameRegistry.registerItem(dustPlutonium, dustPlutonium.getUnlocalizedName());
		GameRegistry.registerItem(dustUranium, dustUranium.getUnlocalizedName());
		
		GameRegistry.registerItem(dustCrymeretye, dustCrymeretye.getUnlocalizedName());
		GameRegistry.registerItem(dustMuktaphlyte, dustMuktaphlyte.getUnlocalizedName());
		GameRegistry.registerItem(dustJonjronyphyll, dustJonjronyphyll.getUnlocalizedName());
		GameRegistry.registerItem(dustKraktachnar, dustKraktachnar.getUnlocalizedName());
		GameRegistry.registerItem(dustXaldriodythidyte, dustXaldriodythidyte.getUnlocalizedName());
		GameRegistry.registerItem(dustUnobtanium, dustUnobtanium.getUnlocalizedName());
		GameRegistry.registerItem(dustTrytementium, dustTrytementium.getUnlocalizedName());
		
		GameRegistry.registerItem(dustCoal, dustCoal.getUnlocalizedName());
		GameRegistry.registerItem(dustLapis, dustLapis.getUnlocalizedName());
		
		// Clusters
		GameRegistry.registerItem(clusterAdamanite, clusterAdamanite.getUnlocalizedName());
		GameRegistry.registerItem(clusterAdamant, clusterAdamant.getUnlocalizedName());
		GameRegistry.registerItem(clusterAluminium, clusterAluminium.getUnlocalizedName());
		GameRegistry.registerItem(clusterBlurite, clusterBlurite.getUnlocalizedName());
		GameRegistry.registerItem(clusterBrass, clusterBrass.getUnlocalizedName());
		GameRegistry.registerItem(clusterBronze, clusterBronze.getUnlocalizedName());
		GameRegistry.registerItem(clusterChromium, clusterChromium.getUnlocalizedName());
		GameRegistry.registerItem(clusterCobalt, clusterCobalt.getUnlocalizedName());
		GameRegistry.registerItem(clusterCopper, clusterCopper.getUnlocalizedName());
		GameRegistry.registerItem(clusterDaeyalt, clusterDaeyalt.getUnlocalizedName());
		GameRegistry.registerItem(clusterElectrum, clusterElectrum.getUnlocalizedName());
		GameRegistry.registerItem(clusterGold, clusterGold.getUnlocalizedName());
		GameRegistry.registerItem(clusterGoloid, clusterGoloid.getUnlocalizedName());
		GameRegistry.registerItem(clusterInvar, clusterInvar.getUnlocalizedName());
		GameRegistry.registerItem(clusterIron, clusterIron.getUnlocalizedName());
		GameRegistry.registerItem(clusterLead, clusterLead.getUnlocalizedName());
		GameRegistry.registerItem(clusterLunar, clusterLunar.getUnlocalizedName());
		GameRegistry.registerItem(clusterMalagnite, clusterMalagnite.getUnlocalizedName());
		GameRegistry.registerItem(clusterManganese, clusterManganese.getUnlocalizedName());
		GameRegistry.registerItem(clusterMithril, clusterMithril.getUnlocalizedName());
		GameRegistry.registerItem(clusterNickel, clusterNickel.getUnlocalizedName());
		GameRegistry.registerItem(clusterPlatinum, clusterPlatinum.getUnlocalizedName());
		GameRegistry.registerItem(clusterRhodium, clusterRhodium.getUnlocalizedName());
		GameRegistry.registerItem(clusterRubium, clusterRubium.getUnlocalizedName());
		GameRegistry.registerItem(clusterRunite, clusterRunite.getUnlocalizedName());
		GameRegistry.registerItem(clusterSilicon, clusterSilicon.getUnlocalizedName());
		GameRegistry.registerItem(clusterSilver, clusterSilver.getUnlocalizedName());
		GameRegistry.registerItem(clusterSolder, clusterSolder.getUnlocalizedName());
		GameRegistry.registerItem(clusterSteel, clusterSteel.getUnlocalizedName());
		GameRegistry.registerItem(clusterTin, clusterTin.getUnlocalizedName());
		GameRegistry.registerItem(clusterTitanium, clusterTitanium.getUnlocalizedName());
		GameRegistry.registerItem(clusterTungsten, clusterTungsten.getUnlocalizedName());
		GameRegistry.registerItem(clusterZinc, clusterZinc.getUnlocalizedName());
				
		GameRegistry.registerItem(clusterAmazonite, clusterAmazonite.getUnlocalizedName());
		GameRegistry.registerItem(clusterAmber, clusterAmber.getUnlocalizedName());
		GameRegistry.registerItem(clusterAmethyst, clusterAmethyst.getUnlocalizedName());
		GameRegistry.registerItem(clusterAquamarine, clusterAquamarine.getUnlocalizedName());
		GameRegistry.registerItem(clusterCarnelian, clusterCarnelian.getUnlocalizedName());
		GameRegistry.registerItem(clusterCitrine, clusterCitrine.getUnlocalizedName());
		GameRegistry.registerItem(clusterDiamond, clusterDiamond.getUnlocalizedName());
		GameRegistry.registerItem(clusterEmerald, clusterEmerald.getUnlocalizedName());
		GameRegistry.registerItem(clusterGarnet, clusterGarnet.getUnlocalizedName());
		GameRegistry.registerItem(clusterJade, clusterJade.getUnlocalizedName());
		GameRegistry.registerItem(clusterKunzite, clusterKunzite.getUnlocalizedName());
		GameRegistry.registerItem(clusterNetherQuartz, clusterNetherQuartz.getUnlocalizedName());
		GameRegistry.registerItem(clusterOnyx, clusterOnyx.getUnlocalizedName());
		GameRegistry.registerItem(clusterOpal, clusterOpal.getUnlocalizedName());
		GameRegistry.registerItem(clusterQuartz, clusterQuartz.getUnlocalizedName());
		GameRegistry.registerItem(clusterRuby, clusterRuby.getUnlocalizedName());
		GameRegistry.registerItem(clusterSapphire, clusterSapphire.getUnlocalizedName());
		GameRegistry.registerItem(clusterTopaz, clusterTopaz.getUnlocalizedName());
		
		GameRegistry.registerItem(clusterFyrestone, clusterFyrestone.getUnlocalizedName());
		GameRegistry.registerItem(clusterVoidium, clusterVoidium.getUnlocalizedName());
		
		GameRegistry.registerItem(clusterIridium, clusterIridium.getUnlocalizedName());
		GameRegistry.registerItem(clusterPlutonium, clusterPlutonium.getUnlocalizedName());
		GameRegistry.registerItem(clusterUranium, clusterUranium.getUnlocalizedName());
		
		GameRegistry.registerItem(clusterCrymeretye, clusterCrymeretye.getUnlocalizedName());
		GameRegistry.registerItem(clusterMuktaphlyte, clusterMuktaphlyte.getUnlocalizedName());
		GameRegistry.registerItem(clusterJonjronyphyll, clusterJonjronyphyll.getUnlocalizedName());
		GameRegistry.registerItem(clusterKraktachnar, clusterKraktachnar.getUnlocalizedName());
		GameRegistry.registerItem(clusterXaldriodythidyte, clusterXaldriodythidyte.getUnlocalizedName());
		GameRegistry.registerItem(clusterUnobtanium, clusterUnobtanium.getUnlocalizedName());
		GameRegistry.registerItem(clusterTrytementium, clusterTrytementium.getUnlocalizedName());
		
		GameRegistry.registerItem(clusterCoal, clusterCoal.getUnlocalizedName());
		GameRegistry.registerItem(clusterLapis, clusterLapis.getUnlocalizedName());
		
		// Plates
		GameRegistry.registerItem(plateAdamanite, plateAdamanite.getUnlocalizedName());
		GameRegistry.registerItem(plateAdamant, plateAdamant.getUnlocalizedName());
		GameRegistry.registerItem(plateAluminium, plateAluminium.getUnlocalizedName());
		GameRegistry.registerItem(plateBlurite, plateBlurite.getUnlocalizedName());
		GameRegistry.registerItem(plateBrass, plateBrass.getUnlocalizedName());
		GameRegistry.registerItem(plateBronze, plateBronze.getUnlocalizedName());
		GameRegistry.registerItem(plateChromium, plateChromium.getUnlocalizedName());
		GameRegistry.registerItem(plateCobalt, plateCobalt.getUnlocalizedName());
		GameRegistry.registerItem(plateCopper, plateCopper.getUnlocalizedName());
		GameRegistry.registerItem(plateDaeyalt, plateDaeyalt.getUnlocalizedName());
		GameRegistry.registerItem(plateElectrum, plateElectrum.getUnlocalizedName());
		GameRegistry.registerItem(plateGold, plateGold.getUnlocalizedName());
		GameRegistry.registerItem(plateGoloid, plateGoloid.getUnlocalizedName());
		GameRegistry.registerItem(plateInvar, plateInvar.getUnlocalizedName());
		GameRegistry.registerItem(plateIron, plateIron.getUnlocalizedName());
		GameRegistry.registerItem(plateLead, plateLead.getUnlocalizedName());
		GameRegistry.registerItem(plateLunar, plateLunar.getUnlocalizedName());
		GameRegistry.registerItem(plateMalagnite, plateMalagnite.getUnlocalizedName());
		GameRegistry.registerItem(plateManganese, plateManganese.getUnlocalizedName());
		GameRegistry.registerItem(plateMithril, plateMithril.getUnlocalizedName());
		GameRegistry.registerItem(plateNickel, plateNickel.getUnlocalizedName());
		GameRegistry.registerItem(plateObsidian, plateObsidian.getUnlocalizedName());
		GameRegistry.registerItem(platePlatinum, platePlatinum.getUnlocalizedName());
		GameRegistry.registerItem(plateRhodium, plateRhodium.getUnlocalizedName());
		GameRegistry.registerItem(plateRunite, plateRunite.getUnlocalizedName());
		GameRegistry.registerItem(plateSilicon, plateSilicon.getUnlocalizedName());
		GameRegistry.registerItem(plateSilver, plateSilver.getUnlocalizedName());
		GameRegistry.registerItem(plateSolder, plateSolder.getUnlocalizedName());
		GameRegistry.registerItem(plateSteel, plateSteel.getUnlocalizedName());
		GameRegistry.registerItem(plateTin, plateTin.getUnlocalizedName());
		GameRegistry.registerItem(plateTitanium, plateTitanium.getUnlocalizedName());
		GameRegistry.registerItem(plateTungsten, plateTungsten.getUnlocalizedName());
		GameRegistry.registerItem(plateZinc, plateZinc.getUnlocalizedName());
		
		// Gems
		Register.registerMaterial(gemAmazonite, gemAmazonite.getUnlocalizedName());
		Register.registerMaterial(gemAmber, gemAmber.getUnlocalizedName());
		Register.registerMaterial(gemAmethyst, gemAmethyst.getUnlocalizedName());
		Register.registerMaterial(gemAquamarine, gemAquamarine.getUnlocalizedName());
		Register.registerMaterial(gemCarnelian, gemCarnelian.getUnlocalizedName());
		Register.registerMaterial(gemCitrine, gemCitrine.getUnlocalizedName());
		Register.registerMaterial(gemDiamond, gemDiamond.getUnlocalizedName());
		Register.registerMaterial(gemGarnet, gemGarnet.getUnlocalizedName());
		Register.registerMaterial(gemJade, gemJade.getUnlocalizedName());
		Register.registerMaterial(gemKunzite, gemKunzite.getUnlocalizedName());
		Register.registerMaterial(gemNetherQuartz, gemNetherQuartz.getUnlocalizedName());
		Register.registerMaterial(gemOnyx, gemOnyx.getUnlocalizedName());
		Register.registerMaterial(gemOpal, gemOpal.getUnlocalizedName());
		Register.registerMaterial(gemQuartz, gemQuartz.getUnlocalizedName());
		Register.registerMaterial(gemRuby, gemRuby.getUnlocalizedName());
		Register.registerMaterial(gemSapphire, gemSapphire.getUnlocalizedName());
		Register.registerMaterial(gemTopaz, gemTopaz.getUnlocalizedName());
		
		// Pure Stuff
		Register.registerMaterial(gemPureAmazonite, gemPureAmazonite.getUnlocalizedName());
		Register.registerMaterial(gemPureAmber, gemPureAmber.getUnlocalizedName());
		Register.registerMaterial(gemPureAmethyst, gemPureAmethyst.getUnlocalizedName());
		Register.registerMaterial(gemPureAquamarine, gemPureAquamarine.getUnlocalizedName());
		Register.registerMaterial(gemPureCarnelian, gemPureCarnelian.getUnlocalizedName());
		Register.registerMaterial(gemPureCitrine, gemPureCitrine.getUnlocalizedName());
		Register.registerMaterial(gemPureDiamond, gemPureDiamond.getUnlocalizedName());
		Register.registerMaterial(gemPureEmerald, gemPureEmerald.getUnlocalizedName());
		Register.registerMaterial(gemPureGarnet, gemPureGarnet.getUnlocalizedName());
		Register.registerMaterial(gemPureJade, gemPureJade.getUnlocalizedName());
		Register.registerMaterial(gemPureKunzite, gemPureKunzite.getUnlocalizedName());
		Register.registerMaterial(gemPureNetherQuartz, gemPureNetherQuartz.getUnlocalizedName());
		Register.registerMaterial(gemPureOnyx, gemPureOnyx.getUnlocalizedName());
		Register.registerMaterial(gemPureOpal, gemPureOpal.getUnlocalizedName());
		Register.registerMaterial(gemPureQuartz, gemPureQuartz.getUnlocalizedName());
		Register.registerMaterial(gemPureRuby, gemPureRuby.getUnlocalizedName());
		Register.registerMaterial(gemPureSapphire, gemPureSapphire.getUnlocalizedName());
		Register.registerMaterial(gemPureTopaz, gemPureTopaz.getUnlocalizedName());
		
		Register.registerMaterial(gemPureFyrestone, gemPureFyrestone.getUnlocalizedName());
		Register.registerMaterial(gemPureVoidiumRadioactiveFocused, gemPureVoidiumRadioactiveFocused.getUnlocalizedName());
		
		Register.registerMaterial(pureObsidian, pureObsidian.getUnlocalizedName());
		
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
		GameRegistry.registerItem(shardOpal, shardOpal.getUnlocalizedName());
		GameRegistry.registerItem(shardQuartz, shardQuartz.getUnlocalizedName());
		GameRegistry.registerItem(shardRuby, shardRuby.getUnlocalizedName());
		GameRegistry.registerItem(shardSapphire, shardSapphire.getUnlocalizedName());
		GameRegistry.registerItem(shardTopaz, shardTopaz.getUnlocalizedName());
		
		GameRegistry.registerItem(shardFyrestone, shardFyrestone.getUnlocalizedName());
		GameRegistry.registerItem(shardVoidiumRadioactiveFocused, shardVoidiumRadioactiveFocused.getUnlocalizedName());
		
		GameRegistry.registerItem(shardObsidian, shardObsidian.getUnlocalizedName());
		
		GameRegistry.registerItem(shardUnobtanium, shardUnobtanium.getUnlocalizedName());
		GameRegistry.registerItem(shardTrytementium, shardTrytementium.getUnlocalizedName());
		
		// Colour stuffs
		GameRegistry.registerItem(paintbrush, paintbrush.getUnlocalizedName());
		GameRegistry.registerItem(paintbrushColoured, paintbrushColoured.getUnlocalizedName());
		
		// Miscellaneous
		GameRegistry.registerItem(fossil, fossil.getUnlocalizedName());
		GameRegistry.registerItem(resin, resin.getUnlocalizedName());
		GameRegistry.registerItem(rubber, rubber.getUnlocalizedName());
		GameRegistry.registerItem(fossilResin, fossilResin.getUnlocalizedName());
		
		// Ylvoltium Forms
		Register.registerMaterial(ylvoltium, ylvoltium.getUnlocalizedName());
		Register.registerMaterial(ylvoltiumInfused, ylvoltiumInfused.getUnlocalizedName());
		Register.registerMaterial(ylvoltiumFocused, ylvoltiumFocused.getUnlocalizedName());
		Register.registerMaterial(ylvoltiumFluxed, ylvoltiumFluxed.getUnlocalizedName());
		
		// Fyrestone Forms
		Register.registerMaterial(fyrestone, fyrestone.getUnlocalizedName());
		Register.registerMaterial(fyrestoneStable, fyrestoneStable.getUnlocalizedName());
		Register.registerMaterial(fyrestoneGem, fyrestoneGem.getUnlocalizedName());
		GameRegistry.registerItem(fyrestoneCut, fyrestoneCut.getUnlocalizedName());
		
		// Voidium Forms
		Register.registerMaterial(voidium, voidium.getUnlocalizedName());
		Register.registerMaterial(voidiumStable, voidiumStable.getUnlocalizedName());
		Register.registerMaterial(voidiumRadioactiveFocused, voidiumRadioactiveFocused.getUnlocalizedName());
		GameRegistry.registerItem(voidiumCutRadioactiveFocused, voidiumCutRadioactiveFocused.getUnlocalizedName());
		GameRegistry.registerItem(voidiumOrb, voidiumOrb.getUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactive, voidiumOrbRadioactive.getUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactiveFocused, voidiumOrbRadioactiveFocused.getUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactiveFocusedCondensed, voidiumOrbRadioactiveFocusedCondensed.getUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactiveFocusedCondensedFragile, voidiumOrbRadioactiveFocusedCondensedFragile.getUnlocalizedName());
		
		// Oddball Materials
		Register.registerMaterial(crymeretye, crymeretye.getUnlocalizedName());
		Register.registerMaterial(graeconthylynium, graeconthylynium.getUnlocalizedName());
		Register.registerMaterial(muktaphlyte, muktaphlyte.getUnlocalizedName());
		Register.registerMaterial(jonjronyphyll, jonjronyphyll.getUnlocalizedName());
		Register.registerMaterial(kraktachnar, kraktachnar.getUnlocalizedName());
		Register.registerMaterial(xaldriodythidyte, xaldriodythidyte.getUnlocalizedName());
		Register.registerMaterial(unobtanium, unobtanium.getUnlocalizedName());
		Register.registerMaterial(trytementium, trytementium.getUnlocalizedName());
		
		// Radioactive Materials
		Register.registerMaterial(iridium, iridium.getUnlocalizedName());
		Register.registerMaterial(uranium, uranium.getUnlocalizedName());
		Register.registerMaterial(plutonium, plutonium.getUnlocalizedName());
		
		// Metal Bands
		GameRegistry.registerItem(goldBand, goldBand.getUnlocalizedName());
		GameRegistry.registerItem(silverBand, silverBand.getUnlocalizedName());
		GameRegistry.registerItem(copperBand, copperBand.getUnlocalizedName());
		
		// Food
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
		GameRegistry.registerItem(lemon, lemon.getUnlocalizedName());
		GameRegistry.registerItem(banana, banana.getUnlocalizedName());
		GameRegistry.registerItem(lettuce, lettuce.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerItem(raspberry, raspberry.getUnlocalizedName());
		GameRegistry.registerItem(blueberry, blueberry.getUnlocalizedName());
		GameRegistry.registerItem(blackberry, blackberry.getUnlocalizedName());
		GameRegistry.registerItem(cherryPie, cherryPie.getUnlocalizedName());
		GameRegistry.registerItem(lemonTart, lemonTart.getUnlocalizedName());
		GameRegistry.registerItem(applePie, applePie.getUnlocalizedName());
		GameRegistry.registerItem(slicedBread, slicedBread.getUnlocalizedName());
		GameRegistry.registerItem(toast, toast.getUnlocalizedName());
		GameRegistry.registerItem(strawberryJamToast, strawberryJamToast.getUnlocalizedName());
		GameRegistry.registerItem(strawberryJam, strawberryJam.getUnlocalizedName());
		GameRegistry.registerItem(strawberryJamSandwich, strawberryJamSandwich.getUnlocalizedName());
		GameRegistry.registerItem(strawberryJamPancake, strawberryJamPancake.getUnlocalizedName());
		GameRegistry.registerItem(raspberryJamToast, raspberryJamToast.getUnlocalizedName());
		GameRegistry.registerItem(raspberryJam, raspberryJam.getUnlocalizedName());
		GameRegistry.registerItem(raspberryJamSandwich, raspberryJamSandwich.getUnlocalizedName());
		GameRegistry.registerItem(raspberryJamPancake, raspberryJamPancake.getUnlocalizedName());
		GameRegistry.registerItem(blueberryJamToast, blueberryJamToast.getUnlocalizedName());
		GameRegistry.registerItem(blueberryJam, blueberryJam.getUnlocalizedName());
		GameRegistry.registerItem(blueberryJamSandwich, blueberryJamSandwich.getUnlocalizedName());
		GameRegistry.registerItem(blueberryJamPancake, blueberryJamPancake.getUnlocalizedName());
		GameRegistry.registerItem(blackberryJamToast, blackberryJamToast.getUnlocalizedName());
		GameRegistry.registerItem(blackberryJam, blackberryJam.getUnlocalizedName());
		GameRegistry.registerItem(blackberryJamSandwich, blackberryJamSandwich.getUnlocalizedName());
		GameRegistry.registerItem(blackberryJamPancake, blackberryJamPancake.getUnlocalizedName());
		GameRegistry.registerItem(appleJamToast, appleJamToast.getUnlocalizedName());
		GameRegistry.registerItem(appleJam, appleJam.getUnlocalizedName());
		GameRegistry.registerItem(appleJamSandwich, appleJamSandwich.getUnlocalizedName());
		GameRegistry.registerItem(appleJamPancake, appleJamPancake.getUnlocalizedName());
		GameRegistry.registerItem(cherryJamToast, cherryJamToast.getUnlocalizedName());
		GameRegistry.registerItem(cherryJam, cherryJam.getUnlocalizedName());
		GameRegistry.registerItem(cherryJamSandwich, cherryJamSandwich.getUnlocalizedName());
		GameRegistry.registerItem(cherryJamPancake, cherryJamPancake.getUnlocalizedName());
		GameRegistry.registerItem(lemonMarmaladeToast, lemonMarmaladeToast.getUnlocalizedName());
		GameRegistry.registerItem(lemonMarmalade, lemonMarmalade.getUnlocalizedName());
		GameRegistry.registerItem(lemonMarmaladeSandwich, lemonMarmaladeSandwich.getUnlocalizedName());
		GameRegistry.registerItem(lemonMarmaladePancake, lemonMarmaladePancake.getUnlocalizedName());
		GameRegistry.registerItem(mapleSyrup, mapleSyrup.getUnlocalizedName());
		GameRegistry.registerItem(blt, blt.getUnlocalizedName());
		GameRegistry.registerItem(lemonJuice, lemonJuice.getUnlocalizedName());
		GameRegistry.registerItem(appleJuice, appleJuice.getUnlocalizedName());
		GameRegistry.registerItem(lemonade, lemonade.getUnlocalizedName());
		GameRegistry.registerItem(bananaSmoothie, bananaSmoothie.getUnlocalizedName());
		GameRegistry.registerItem(vegetableStew, vegetableStew.getUnlocalizedName());
		GameRegistry.registerItem(shellSoup, shellSoup.getUnlocalizedName());
		GameRegistry.registerItem(chocolateCake, chocolateCake.getUnlocalizedName());
		GameRegistry.registerItem(chocolateMilk, chocolateMilk.getUnlocalizedName());
		GameRegistry.registerItem(strawberryCake, strawberryCake.getUnlocalizedName());
		GameRegistry.registerItem(strawberryMilk, strawberryMilk.getUnlocalizedName());
		GameRegistry.registerItem(caramel, caramel.getUnlocalizedName());
		GameRegistry.registerItem(toffee, toffee.getUnlocalizedName());
		GameRegistry.registerItem(toffeeApple, toffeeApple.getUnlocalizedName());
		GameRegistry.registerItem(pancake, pancake.getUnlocalizedName());
		GameRegistry.registerItem(mapleSyrupPancake, mapleSyrupPancake.getUnlocalizedName());
		GameRegistry.registerItem(lemonSugarPancake, lemonSugarPancake.getUnlocalizedName());
		GameRegistry.registerItem(blueberryPancake, blueberryPancake.getUnlocalizedName());
		GameRegistry.registerItem(rawTortoise, rawTortoise.getUnlocalizedName());
		GameRegistry.registerItem(cookedTortoise, cookedTortoise.getUnlocalizedName());
		
		GameRegistry.registerItem(flour, flour.getUnlocalizedName());
		GameRegistry.registerItem(mapleSap, mapleSap.getUnlocalizedName());
		
		GameRegistry.registerItem(knife, knife.getUnlocalizedName());
		
		GameRegistry.registerItem(glassJar, glassJar.getUnlocalizedName());
		
		// Magicks
		GameRegistry.registerItem(fluxWorm, fluxWorm.getUnlocalizedName());
		
		// Upgrades
		GameRegistry.registerItem(speedUpgrade, speedUpgrade.getUnlocalizedName());
		GameRegistry.registerItem(efficiencyUpgrade, efficiencyUpgrade.getUnlocalizedName());
		GameRegistry.registerItem(outputUpgrade, outputUpgrade.getUnlocalizedName());
		GameRegistry.registerItem(capacityUpgrade, capacityUpgrade.getUnlocalizedName());
		GameRegistry.registerItem(inputUpgrade, inputUpgrade.getUnlocalizedName());
		
		//Misc
		GameRegistry.registerItem(mapleLeaf, mapleLeaf.getUnlocalizedName());
		
		// Stuff I need
		GameRegistry.registerItem(ringForIcon, ringForIcon.getUnlocalizedName());
		
		GameRegistry.registerItem(debugTool, debugTool.getUnlocalizedName());
	}

}
