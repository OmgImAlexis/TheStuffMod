package com.omgimalexis.allthethings.init;

import net.minecraft.init.Items;
import com.omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import com.omgimalexis.allthethings.item.ItemBasic;
import com.omgimalexis.allthethings.item.ItemBasicFood;
import com.omgimalexis.allthethings.utility.Register;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems extends Items {
	
	// Ingots
	public static final ItemBasic ingotAdamanite = new ItemBasic("ingotAdamanite",TMCreativeTabs.item);
	public static final ItemBasic ingotAdamant = new ItemBasic("ingotAdamant",TMCreativeTabs.item);
	public static final ItemBasic ingotAluminium = new ItemBasic("ingotAluminium",TMCreativeTabs.item);
	public static final ItemBasic ingotBlurite = new ItemBasic("ingotBlurite",TMCreativeTabs.item);
	public static final ItemBasic ingotBrass = new ItemBasic("ingotBrass",TMCreativeTabs.item);
	public static final ItemBasic ingotBronze = new ItemBasic("ingotBronze",TMCreativeTabs.item);
	public static final ItemBasic ingotChromium = new ItemBasic("ingotChromium",TMCreativeTabs.item);
	public static final ItemBasic ingotCobalt = new ItemBasic("ingotCobalt",TMCreativeTabs.item);
	public static final ItemBasic ingotCopper = new ItemBasic("ingotCopper",TMCreativeTabs.item);
	public static final ItemBasic ingotDaeyalt = new ItemBasic("ingotDaeyalt",TMCreativeTabs.item);
	public static final ItemBasic ingotElectrum = new ItemBasic("ingotElectrum",TMCreativeTabs.item);
	public static final ItemBasic ingotGoloid = new ItemBasic("ingotGoloid",TMCreativeTabs.item);
	public static final ItemBasic ingotInvar = new ItemBasic("ingotInvar",TMCreativeTabs.item);
	public static final ItemBasic ingotLead = new ItemBasic("ingotLead",TMCreativeTabs.item);
	public static final ItemBasic ingotLunar = new ItemBasic("ingotLunar",TMCreativeTabs.item);
	public static final ItemBasic ingotMalagnite = new ItemBasic("ingotMalagnite",TMCreativeTabs.item);
	public static final ItemBasic ingotManganese = new ItemBasic("ingotManganese",TMCreativeTabs.item);
	public static final ItemBasic ingotMithril = new ItemBasic("ingotMithril",TMCreativeTabs.item);
	public static final ItemBasic ingotNickel = new ItemBasic("ingotNickel",TMCreativeTabs.item);
	public static final ItemBasic ingotObsidian = new ItemBasic("ingotObsidian",TMCreativeTabs.item);
	public static final ItemBasic ingotPlatinum = new ItemBasic("ingotPlatinum",TMCreativeTabs.item);
	public static final ItemBasic ingotRhodium = new ItemBasic("ingotRhodium",TMCreativeTabs.item);
	public static final ItemBasic ingotRubium = new ItemBasic("ingotRubium",TMCreativeTabs.item);
	public static final ItemBasic ingotRunite = new ItemBasic("ingotRunite",TMCreativeTabs.item);
	public static final ItemBasic ingotSilicon = new ItemBasic("ingotSilicon", TMCreativeTabs.item);
	public static final ItemBasic ingotSilver = new ItemBasic("ingotSilver",TMCreativeTabs.item);
	public static final ItemBasic ingotSolder = new ItemBasic("ingotSolder",TMCreativeTabs.item);
	public static final ItemBasic ingotSteel = new ItemBasic("ingotSteel",TMCreativeTabs.item);
	public static final ItemBasic ingotTin = new ItemBasic("ingotTin",TMCreativeTabs.item);
	public static final ItemBasic ingotTitanium = new ItemBasic("ingotTitanium",TMCreativeTabs.item);
	public static final ItemBasic ingotTungsten = new ItemBasic("ingotTungsten",TMCreativeTabs.item);
	public static final ItemBasic ingotZinc = new ItemBasic("ingotZinc",TMCreativeTabs.item);
	
	// Dusts
	public static final ItemBasic dustAdamanite = new ItemBasic("dustAdamanite",TMCreativeTabs.plate);
	public static final ItemBasic dustAdamant = new ItemBasic("dustAdamant",TMCreativeTabs.plate);
	public static final ItemBasic dustAluminium = new ItemBasic("dustAluminium",TMCreativeTabs.plate);
	public static final ItemBasic dustBlurite = new ItemBasic("dustBlurite",TMCreativeTabs.plate);
	public static final ItemBasic dustBrass = new ItemBasic("dustBrass",TMCreativeTabs.plate);
	public static final ItemBasic dustBronze = new ItemBasic("dustBronze",TMCreativeTabs.plate);
	public static final ItemBasic dustChromium = new ItemBasic("dustChromium",TMCreativeTabs.plate);
	public static final ItemBasic dustCobalt = new ItemBasic("dustCobalt",TMCreativeTabs.plate);
	public static final ItemBasic dustCopper = new ItemBasic("dustCopper",TMCreativeTabs.plate);
	public static final ItemBasic dustDaeyalt = new ItemBasic("dustDaeyalt",TMCreativeTabs.plate);
	public static final ItemBasic dustElectrum = new ItemBasic("dustElectrum",TMCreativeTabs.plate);
	public static final ItemBasic dustGold = new ItemBasic("dustGold",TMCreativeTabs.plate);
	public static final ItemBasic dustGoloid = new ItemBasic("dustGoloid",TMCreativeTabs.plate);
	public static final ItemBasic dustInvar = new ItemBasic("dustInvar",TMCreativeTabs.plate);
	public static final ItemBasic dustIron = new ItemBasic("dustIron",TMCreativeTabs.plate);
	public static final ItemBasic dustLead = new ItemBasic("dustLead",TMCreativeTabs.plate);
	public static final ItemBasic dustLunar = new ItemBasic("dustLunar",TMCreativeTabs.plate);
	public static final ItemBasic dustMalagnite = new ItemBasic("dustMalagnite",TMCreativeTabs.plate);
	public static final ItemBasic dustManganese = new ItemBasic("dustManganese",TMCreativeTabs.plate);
	public static final ItemBasic dustMithril = new ItemBasic("dustMithril",TMCreativeTabs.plate);
	public static final ItemBasic dustNickel = new ItemBasic("dustNickel",TMCreativeTabs.plate);
	public static final ItemBasic dustObsidian = new ItemBasic("dustObsidian",TMCreativeTabs.plate);
	public static final ItemBasic dustPlatinum = new ItemBasic("dustPlatinum",TMCreativeTabs.plate);
	public static final ItemBasic dustRhodium = new ItemBasic("dustRhodium",TMCreativeTabs.plate);
	public static final ItemBasic dustRunite = new ItemBasic("dustRunite",TMCreativeTabs.plate);
	public static final ItemBasic dustSilicon = new ItemBasic("dustSilicon", TMCreativeTabs.plate);
	public static final ItemBasic dustSilver = new ItemBasic("dustSilver",TMCreativeTabs.plate);
	public static final ItemBasic dustSolder = new ItemBasic("dustSolder",TMCreativeTabs.plate);
	public static final ItemBasic dustSteel = new ItemBasic("dustSteel",TMCreativeTabs.plate);
	public static final ItemBasic dustTin = new ItemBasic("dustTin",TMCreativeTabs.plate);
	public static final ItemBasic dustTitanium = new ItemBasic("dustTitanium",TMCreativeTabs.plate);
	public static final ItemBasic dustTungsten = new ItemBasic("dustTungsten",TMCreativeTabs.plate);
	public static final ItemBasic dustZinc = new ItemBasic("dustZinc",TMCreativeTabs.plate);
	
	public static final ItemBasic dustAmazonite = new ItemBasic("dustAmazonite",TMCreativeTabs.plate);
	public static final ItemBasic dustAmber = new ItemBasic("dustAmber",TMCreativeTabs.plate);
	public static final ItemBasic dustAmethyst = new ItemBasic("dustAmethyst",TMCreativeTabs.plate);
	public static final ItemBasic dustAquamarine = new ItemBasic("dustAquamarine",TMCreativeTabs.plate);
	public static final ItemBasic dustCarnelian = new ItemBasic("dustCarnelian",TMCreativeTabs.plate);
	public static final ItemBasic dustCitrine = new ItemBasic("dustCitrine",TMCreativeTabs.plate);
	public static final ItemBasic dustDiamond = new ItemBasic("dustDiamond",TMCreativeTabs.plate);
	public static final ItemBasic dustEmerald = new ItemBasic("dustEmerald",TMCreativeTabs.plate);
	public static final ItemBasic dustGarnet = new ItemBasic("dustGarnet",TMCreativeTabs.plate);
	public static final ItemBasic dustJade = new ItemBasic("dustJade",TMCreativeTabs.plate);
	public static final ItemBasic dustKunzite = new ItemBasic("dustKunzite",TMCreativeTabs.plate);
	public static final ItemBasic dustNetherQuartz = new ItemBasic("dustNetherQuartz",TMCreativeTabs.plate);
	public static final ItemBasic dustOnyx = new ItemBasic("dustOnyx",TMCreativeTabs.plate);
	public static final ItemBasic dustOpal = new ItemBasic("dustOpal",TMCreativeTabs.plate);
	public static final ItemBasic dustQuartz = new ItemBasic("dustQuartz",TMCreativeTabs.plate);
	public static final ItemBasic dustRuby = new ItemBasic("dustRuby",TMCreativeTabs.plate);
	public static final ItemBasic dustSapphire = new ItemBasic("dustSapphire",TMCreativeTabs.plate);
	public static final ItemBasic dustTopaz = new ItemBasic("dustTopaz",TMCreativeTabs.plate);
	
	public static final ItemBasic dustVoidium = new ItemBasic("dustVoidium",TMCreativeTabs.plate);
	public static final ItemBasic dustFyrestone = new ItemBasic("dustFyrestone",TMCreativeTabs.plate);
	
	public static final ItemBasic dustIridium = new ItemBasic("dustIridium",TMCreativeTabs.plate);
	public static final ItemBasic dustPlutonium = new ItemBasic("dustPlutonium", TMCreativeTabs.plate);
	public static final ItemBasic dustUranium = new ItemBasic("dustUranium",TMCreativeTabs.plate);
	
	public static final ItemBasic dustTrytementium = new ItemBasic("dustTrytementium",TMCreativeTabs.plate);
	public static final ItemBasic dustUnobtanium = new ItemBasic("dustUnobtanium",TMCreativeTabs.plate);
	
	public static final ItemBasic dustCoal = new ItemBasic("dustCoal", TMCreativeTabs.plate);
	public static final ItemBasic dustLapis = new ItemBasic("dustLapis", TMCreativeTabs.plate);
	
	// Clusters
	public static final ItemBasic clusterAdamanite = new ItemBasic("clusterAdamanite",TMCreativeTabs.plate);
	public static final ItemBasic clusterAdamant = new ItemBasic("clusterAdamant",TMCreativeTabs.plate);
	public static final ItemBasic clusterAluminium = new ItemBasic("clusterAluminium",TMCreativeTabs.plate);
	public static final ItemBasic clusterBlurite = new ItemBasic("clusterBlurite",TMCreativeTabs.plate);
	public static final ItemBasic clusterBrass = new ItemBasic("clusterBrass",TMCreativeTabs.plate);
	public static final ItemBasic clusterBronze = new ItemBasic("clusterBronze",TMCreativeTabs.plate);
	public static final ItemBasic clusterChromium = new ItemBasic("clusterChromium",TMCreativeTabs.plate);
	public static final ItemBasic clusterCobalt = new ItemBasic("clusterCobalt",TMCreativeTabs.plate);
	public static final ItemBasic clusterCopper = new ItemBasic("clusterCopper",TMCreativeTabs.plate);
	public static final ItemBasic clusterDaeyalt = new ItemBasic("clusterDaeyalt",TMCreativeTabs.plate);
	public static final ItemBasic clusterElectrum = new ItemBasic("clusterElectrum",TMCreativeTabs.plate);
	public static final ItemBasic clusterGold = new ItemBasic("clusterGold",TMCreativeTabs.plate);
	public static final ItemBasic clusterGoloid = new ItemBasic("clusterGoloid",TMCreativeTabs.plate);
	public static final ItemBasic clusterInvar = new ItemBasic("clusterInvar",TMCreativeTabs.plate);
	public static final ItemBasic clusterIron = new ItemBasic("clusterIron",TMCreativeTabs.plate);
	public static final ItemBasic clusterLead = new ItemBasic("clusterLead",TMCreativeTabs.plate);
	public static final ItemBasic clusterLunar = new ItemBasic("clusterLunar",TMCreativeTabs.plate);
	public static final ItemBasic clusterMalagnite = new ItemBasic("clusterMalagnite",TMCreativeTabs.plate);
	public static final ItemBasic clusterManganese = new ItemBasic("clusterManganese",TMCreativeTabs.plate);
	public static final ItemBasic clusterMithril = new ItemBasic("clusterMithril",TMCreativeTabs.plate);
	public static final ItemBasic clusterNickel = new ItemBasic("clusterNickel",TMCreativeTabs.plate);
	public static final ItemBasic clusterObsidian = new ItemBasic("clusterObsidian",TMCreativeTabs.plate);
	public static final ItemBasic clusterPlatinum = new ItemBasic("clusterPlatinum",TMCreativeTabs.plate);
	public static final ItemBasic clusterRhodium = new ItemBasic("clusterRhodium",TMCreativeTabs.plate);
	public static final ItemBasic clusterRunite = new ItemBasic("clusterRunite",TMCreativeTabs.plate);
	public static final ItemBasic clusterSilicon = new ItemBasic("clusterSilicon", TMCreativeTabs.plate);
	public static final ItemBasic clusterSilver = new ItemBasic("clusterSilver",TMCreativeTabs.plate);
	public static final ItemBasic clusterSolder = new ItemBasic("clusterSolder",TMCreativeTabs.plate);
	public static final ItemBasic clusterSteel = new ItemBasic("clusterSteel",TMCreativeTabs.plate);
	public static final ItemBasic clusterTin = new ItemBasic("clusterTin",TMCreativeTabs.plate);
	public static final ItemBasic clusterTitanium = new ItemBasic("clusterTitanium",TMCreativeTabs.plate);
	public static final ItemBasic clusterTungsten = new ItemBasic("clusterTungsten",TMCreativeTabs.plate);
	public static final ItemBasic clusterZinc = new ItemBasic("clusterZinc",TMCreativeTabs.plate);
	
	public static final ItemBasic clusterAmazonite = new ItemBasic("clusterAmazonite",TMCreativeTabs.plate);
	public static final ItemBasic clusterAmber = new ItemBasic("clusterAmber",TMCreativeTabs.plate);
	public static final ItemBasic clusterAmethyst = new ItemBasic("clusterAmethyst",TMCreativeTabs.plate);
	public static final ItemBasic clusterAquamarine = new ItemBasic("clusterAquamarine",TMCreativeTabs.plate);
	public static final ItemBasic clusterCarnelian = new ItemBasic("clusterCarnelian",TMCreativeTabs.plate);
	public static final ItemBasic clusterCitrine = new ItemBasic("clusterCitrine",TMCreativeTabs.plate);
	public static final ItemBasic clusterDiamond = new ItemBasic("clusterDiamond",TMCreativeTabs.plate);
	public static final ItemBasic clusterEmerald = new ItemBasic("clusterEmerald",TMCreativeTabs.plate);
	public static final ItemBasic clusterGarnet = new ItemBasic("clusterGarnet",TMCreativeTabs.plate);
	public static final ItemBasic clusterJade = new ItemBasic("clusterJade",TMCreativeTabs.plate);
	public static final ItemBasic clusterKunzite = new ItemBasic("clusterKunzite",TMCreativeTabs.plate);
	public static final ItemBasic clusterNetherQuartz = new ItemBasic("clusterNetherQuartz",TMCreativeTabs.plate);
	public static final ItemBasic clusterOnyx = new ItemBasic("clusterOnyx",TMCreativeTabs.plate);
	public static final ItemBasic clusterOpal = new ItemBasic("clusterOpal",TMCreativeTabs.plate);
	public static final ItemBasic clusterQuartz = new ItemBasic("clusterQuartz",TMCreativeTabs.plate);
	public static final ItemBasic clusterRuby = new ItemBasic("clusterRuby",TMCreativeTabs.plate);
	public static final ItemBasic clusterSapphire = new ItemBasic("clusterSapphire",TMCreativeTabs.plate);
	public static final ItemBasic clusterTopaz = new ItemBasic("clusterTopaz",TMCreativeTabs.plate);
	
	public static final ItemBasic clusterVoidium = new ItemBasic("clusterVoidium",TMCreativeTabs.plate);
	public static final ItemBasic clusterFyrestone = new ItemBasic("clusterFyrestone",TMCreativeTabs.plate);
	
	public static final ItemBasic clusterIridium = new ItemBasic("clusterIridium",TMCreativeTabs.plate);
	public static final ItemBasic clusterPlutonium = new ItemBasic("clusterPlutonium", TMCreativeTabs.plate);
	public static final ItemBasic clusterUranium = new ItemBasic("clusterUranium",TMCreativeTabs.plate);
	
	public static final ItemBasic clusterTrytementium = new ItemBasic("clusterTrytementium",TMCreativeTabs.plate);
	public static final ItemBasic clusterUnobtanium = new ItemBasic("clusterUnobtanium",TMCreativeTabs.plate);
	
	public static final ItemBasic clusterCoal = new ItemBasic("clusterCoal", TMCreativeTabs.plate);
	public static final ItemBasic clusterLapis = new ItemBasic("clusterLapis", TMCreativeTabs.plate);
	
	// Plates
	public static final ItemBasic plateAdamanite = new ItemBasic("plateAdamanite",TMCreativeTabs.plate);
	public static final ItemBasic plateAdamant = new ItemBasic("plateAdamant",TMCreativeTabs.plate);
	public static final ItemBasic plateAluminium = new ItemBasic("plateAluminium",TMCreativeTabs.plate);
	public static final ItemBasic plateBlurite = new ItemBasic("plateBlurite",TMCreativeTabs.plate);
	public static final ItemBasic plateBrass = new ItemBasic("plateBrass",TMCreativeTabs.plate);
	public static final ItemBasic plateBronze = new ItemBasic("plateBronze",TMCreativeTabs.plate);
	public static final ItemBasic plateChromium = new ItemBasic("plateChromium",TMCreativeTabs.plate);
	public static final ItemBasic plateCobalt = new ItemBasic("plateCobalt",TMCreativeTabs.plate);
	public static final ItemBasic plateCopper = new ItemBasic("plateCopper",TMCreativeTabs.plate);
	public static final ItemBasic plateDaeyalt = new ItemBasic("plateDaeyalt",TMCreativeTabs.plate);
	public static final ItemBasic plateElectrum = new ItemBasic("plateElectrum",TMCreativeTabs.plate);
	public static final ItemBasic plateGold = new ItemBasic("plateGold",TMCreativeTabs.plate);
	public static final ItemBasic plateGoloid = new ItemBasic("plateGoloid",TMCreativeTabs.plate);
	public static final ItemBasic plateInvar = new ItemBasic("plateInvar",TMCreativeTabs.plate);
	public static final ItemBasic plateIron = new ItemBasic("plateIron",TMCreativeTabs.plate);
	public static final ItemBasic plateLead = new ItemBasic("plateLead",TMCreativeTabs.plate);
	public static final ItemBasic plateLunar = new ItemBasic("plateLunar",TMCreativeTabs.plate);
	public static final ItemBasic plateMalagnite = new ItemBasic("plateMalagnite",TMCreativeTabs.plate);
	public static final ItemBasic plateManganese = new ItemBasic("plateManganese",TMCreativeTabs.plate);
	public static final ItemBasic plateMithril = new ItemBasic("plateMithril",TMCreativeTabs.plate);
	public static final ItemBasic plateNickel = new ItemBasic("plateNickel",TMCreativeTabs.plate);
	public static final ItemBasic plateObsidian = new ItemBasic("plateObsidian",TMCreativeTabs.plate);
	public static final ItemBasic platePlatinum = new ItemBasic("platePlatinum",TMCreativeTabs.plate);
	public static final ItemBasic plateRhodium = new ItemBasic("plateRhodium",TMCreativeTabs.plate);
	public static final ItemBasic plateRunite = new ItemBasic("plateRunite",TMCreativeTabs.plate);
	public static final ItemBasic plateSilicon = new ItemBasic("plateSilicon", TMCreativeTabs.plate);
	public static final ItemBasic plateSilver = new ItemBasic("plateSilver",TMCreativeTabs.plate);
	public static final ItemBasic plateSolder = new ItemBasic("plateSolder",TMCreativeTabs.plate);
	public static final ItemBasic plateSteel = new ItemBasic("plateSteel",TMCreativeTabs.plate);
	public static final ItemBasic plateTin = new ItemBasic("plateTin",TMCreativeTabs.plate);
	public static final ItemBasic plateTitanium = new ItemBasic("plateTitanium",TMCreativeTabs.plate);
	public static final ItemBasic plateTungsten = new ItemBasic("plateTungsten",TMCreativeTabs.plate);
	public static final ItemBasic plateZinc = new ItemBasic("plateZinc",TMCreativeTabs.plate);
	
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
	public static final ItemBasic gemPureAmazonite = new ItemBasic("amazonitePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureAmber = new ItemBasic("amberPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureAmethyst = new ItemBasic("amethystPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureAquamarine = new ItemBasic("aquamarinePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureCarnelian = new ItemBasic("carnelianPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureCitrine = new ItemBasic("citrinePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureDiamond = new ItemBasic("diamondPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureEmerald = new ItemBasic("emeraldPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureGarnet = new ItemBasic("garnetPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureJade = new ItemBasic("jadePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureKunzite = new ItemBasic("kunzitePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureNetherQuartz = new ItemBasic("netherQuartzPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureOnyx = new ItemBasic("onyxPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureOpal = new ItemBasic("opalPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureQuartz = new ItemBasic("quartzPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureRuby = new ItemBasic("rubyPure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureSapphire = new ItemBasic("sapphirePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureTopaz = new ItemBasic("topazPure",TMCreativeTabs.pure);
	
	public static final ItemBasic gemPureFyrestone = new ItemBasic("fyrestonePure",TMCreativeTabs.pure);
	public static final ItemBasic gemPureVoidiumRadioactiveFocused = new ItemBasic("voidiumPureRadioactiveFocused",TMCreativeTabs.pure);
	
	public static final ItemBasic pureObsidian = new ItemBasic("obsidianPure",TMCreativeTabs.pure);
	
	// Shards
	public static final ItemBasic shardAmazonite = new ItemBasic("amazoniteShard",TMCreativeTabs.pure);
	public static final ItemBasic shardAmber = new ItemBasic("amberShard",TMCreativeTabs.pure);
	public static final ItemBasic shardAmethyst = new ItemBasic("amethystShard",TMCreativeTabs.pure);
	public static final ItemBasic shardAquamarine = new ItemBasic("aquamarineShard",TMCreativeTabs.pure);
	public static final ItemBasic shardCarnelian = new ItemBasic("carnelianShard",TMCreativeTabs.pure);
	public static final ItemBasic shardCitrine = new ItemBasic("citrineShard",TMCreativeTabs.pure);
	public static final ItemBasic shardDiamond = new ItemBasic("diamondShard",TMCreativeTabs.pure);
	public static final ItemBasic shardEmerald = new ItemBasic("emeraldShard",TMCreativeTabs.pure);
	public static final ItemBasic shardGarnet = new ItemBasic("garnetShard",TMCreativeTabs.pure);
	public static final ItemBasic shardJade = new ItemBasic("jadeShard",TMCreativeTabs.pure);
	public static final ItemBasic shardKunzite = new ItemBasic("kunziteShard",TMCreativeTabs.pure);
	public static final ItemBasic shardNetherQuartz = new ItemBasic("netherQuartzShard",TMCreativeTabs.pure);
	public static final ItemBasic shardOnyx = new ItemBasic("onyxShard",TMCreativeTabs.pure);
	public static final ItemBasic shardOpal = new ItemBasic("opalShard",TMCreativeTabs.pure);
	public static final ItemBasic shardQuartz = new ItemBasic("quartzShard",TMCreativeTabs.pure);
	public static final ItemBasic shardRuby = new ItemBasic("rubyShard",TMCreativeTabs.pure);
	public static final ItemBasic shardSapphire = new ItemBasic("sapphireShard",TMCreativeTabs.pure);
	public static final ItemBasic shardTopaz = new ItemBasic("topazShard",TMCreativeTabs.pure);
	
	public static final ItemBasic shardFyrestone = new ItemBasic("fyrestoneShard",TMCreativeTabs.pure);
	public static final ItemBasic shardVoidiumRadioactiveFocused = new ItemBasic("voidiumShardRadioactiveFocused",TMCreativeTabs.pure);
	
	public static final ItemBasic shardObsidian = new ItemBasic("obsidianShard",TMCreativeTabs.pure);
	
	public static final ItemBasic shardTrytementium  = new ItemBasic("trytementiumShard",TMCreativeTabs.pure);
	public static final ItemBasic shardUnobtanium  = new ItemBasic("unobtaniumShard",TMCreativeTabs.pure);
	
	// Radioactive Materials
	public static final ItemBasic iridium  = new ItemBasic("iridium",TMCreativeTabs.item);
	public static final ItemBasic plutonium  = new ItemBasic("plutonium", TMCreativeTabs.item);
	public static final ItemBasic uranium  = new ItemBasic("uranium",TMCreativeTabs.item);
	
	// Special Materials
	public static final ItemBasic trytementium  = new ItemBasic("trytementium",TMCreativeTabs.item);
	public static final ItemBasic unobtanium  = new ItemBasic("unobtanium",TMCreativeTabs.item);
	
	// Bands
	public static final ItemBasic goldBand = new ItemBasic("goldBand",TMCreativeTabs.jewelry);
	public static final ItemBasic silverBand = new ItemBasic("silverBand",TMCreativeTabs.jewelry);
	
	// Rings
	public static final ItemBasic ring = new ItemBasic("ring",TMCreativeTabs.jewelry);
	public static final ItemBasic silverRing = new ItemBasic("ringSilver",TMCreativeTabs.jewelry);
	
	public static final ItemBasic onyxRing = new ItemBasic("ringOnyx",TMCreativeTabs.jewelry);
	public static final ItemBasic rubyRing = new ItemBasic("ringRuby",TMCreativeTabs.jewelry);
	public static final ItemBasic sapphireRing = new ItemBasic("ringSapphire",TMCreativeTabs.jewelry);
	public static final ItemBasic amberRing = new ItemBasic("ringAmber",TMCreativeTabs.jewelry);
	public static final ItemBasic jadeRing = new ItemBasic("ringJade",TMCreativeTabs.jewelry);
	public static final ItemBasic citrineRing = new ItemBasic("ringCitrine",TMCreativeTabs.jewelry);
	public static final ItemBasic amethystRing = new ItemBasic("ringAmethyst",TMCreativeTabs.jewelry);
	public static final ItemBasic carnelianRing = new ItemBasic("ringCarnelian",TMCreativeTabs.jewelry);
	public static final ItemBasic amazoniteRing = new ItemBasic("ringAmazonite",TMCreativeTabs.jewelry);
	public static final ItemBasic garnetRing = new ItemBasic("ringGarnet",TMCreativeTabs.jewelry);
	public static final ItemBasic kunziteRing = new ItemBasic("ringKunzite",TMCreativeTabs.jewelry);
	public static final ItemBasic aquamarineRing = new ItemBasic("ringAquamarine",TMCreativeTabs.jewelry);
	
	public static final ItemBasic diamondRing = new ItemBasic("ringDiamond",TMCreativeTabs.jewelry);
	public static final ItemBasic emeraldRing = new ItemBasic("ringEmerald",TMCreativeTabs.jewelry);
	public static final ItemBasic netherQuartzRing = new ItemBasic("ringNetherQuartz",TMCreativeTabs.jewelry);
	
	public static final ItemBasic voidiumRing = new ItemBasic("ringVoidium",TMCreativeTabs.jewelry);
	public static final ItemBasic fyrestoneRing = new ItemBasic("ringFyrestone",TMCreativeTabs.jewelry);
	
	public static final ItemBasic onyxSilverRing = new ItemBasic("ringOnyxSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic rubySilverRing = new ItemBasic("ringRubySilver",TMCreativeTabs.jewelry);
	public static final ItemBasic sapphireSilverRing = new ItemBasic("ringSapphireSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic amberSilverRing = new ItemBasic("ringAmberSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic jadeSilverRing = new ItemBasic("ringJadeSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic citrineSilverRing = new ItemBasic("ringCitrineSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic amethystSilverRing = new ItemBasic("ringAmethystSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic carnelianSilverRing = new ItemBasic("ringCarnelianSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic amazoniteSilverRing = new ItemBasic("ringAmazoniteSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic garnetSilverRing = new ItemBasic("ringGarnetSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic kunziteSilverRing = new ItemBasic("ringKunziteSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic aquamarineSilverRing = new ItemBasic("ringAquamarineSilver",TMCreativeTabs.jewelry);
	
	public static final ItemBasic diamondSilverRing = new ItemBasic("ringDiamondSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic emeraldSilverRing = new ItemBasic("ringEmeraldSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic netherQuartzSilverRing = new ItemBasic("ringNetherQuartzSilver",TMCreativeTabs.jewelry);
	
	public static final ItemBasic voidiumSilverRing = new ItemBasic("ringVoidiumSilver",TMCreativeTabs.jewelry);
	public static final ItemBasic fyrestoneSilverRing = new ItemBasic("ringFyrestoneSilver",TMCreativeTabs.jewelry);
	
	// Fyrestone Forms
	public static final ItemBasic fyrestone = new ItemBasic("fyrestone",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneStable = new ItemBasic("fyrestoneStable",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneGem = new ItemBasic("fyrestoneGem",TMCreativeTabs.item);
	public static final ItemBasic fyrestoneCut = new ItemBasic("fyrestoneCut",TMCreativeTabs.item);
	
	// Voidium Forms
	public static final ItemBasic voidium = new ItemBasic("voidium",TMCreativeTabs.item);
	public static final ItemBasic voidiumStable = new ItemBasic("voidiumStable",TMCreativeTabs.item);
	public static final ItemBasic voidiumRadioactiveFocused = new ItemBasic("voidiumRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic voidiumCutRadioactiveFocused = new ItemBasic("voidiumCutRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrb = new ItemBasic("voidiumOrb",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactive = new ItemBasic("voidiumOrbRadioactive",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactiveFocused = new ItemBasic("voidiumOrbRadioactiveFocused",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactiveFocusedCondensed = new ItemBasic("voidiumOrbRadioactiveFocusedCondensed",TMCreativeTabs.item);
	public static final ItemBasic voidiumOrbRadioactiveFocusedCondensedFragile = new ItemBasic("voidiumOrbRadioactiveFocusedCondensedFragile",TMCreativeTabs.item);
	
	// Ylvoltium Forms
	public static final ItemBasic ylvoltium = new ItemBasic("ylvoltium",TMCreativeTabs.item);
	public static final ItemBasic ylvoltiumInfused = new ItemBasic("ylvoltiumInfused",TMCreativeTabs.item);
	public static final ItemBasic ylvoltiumFocused = new ItemBasic("ylvoltiumFocused",TMCreativeTabs.item);
	public static final ItemBasic ylvoltiumFluxed = new ItemBasic("ylvoltiumFluxed",TMCreativeTabs.item);
	
	// Food
	public static final ItemBasicFood cherry = new ItemBasicFood("cherry", TMCreativeTabs.food, 2, 0.2f, false);
	
	// Miscellaneous
	public static final ItemBasic fossil = new ItemBasic("fossil", TMCreativeTabs.misc);
	public static final ItemBasic resin = new ItemBasic("resin", TMCreativeTabs.misc);
	public static final ItemBasic rubber = new ItemBasic("rubber", TMCreativeTabs.misc);
	public static final ItemBasic fossilResin = new ItemBasic("resinFossil", TMCreativeTabs.misc);

	public static void init() {

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
		GameRegistry.registerItem(dustRunite, dustRunite.getUnlocalizedName());
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
		Register.registerMaterial(unobtanium, unobtanium.getUnlocalizedName());
		Register.registerMaterial(trytementium, trytementium.getUnlocalizedName());
		
		// Radioactive Materials
		Register.registerMaterial(iridium, iridium.getUnlocalizedName());
		Register.registerMaterial(uranium, uranium.getUnlocalizedName());
		Register.registerMaterial(plutonium, plutonium.getUnlocalizedName());
		
		// Base Rings
		GameRegistry.registerItem(ring, ring.getUnlocalizedName());
		GameRegistry.registerItem(silverRing, silverRing.getUnlocalizedName());
		
		// Material Rings
		Register.registerRing(onyxRing, onyxSilverRing, onyxRing.getUnlocalizedName(), onyxSilverRing.getUnlocalizedName(), gemOnyx);
		Register.registerRing(rubyRing, rubySilverRing, rubyRing.getUnlocalizedName(), rubySilverRing.getUnlocalizedName(), gemRuby);
		Register.registerRing(sapphireRing, sapphireSilverRing, sapphireRing.getUnlocalizedName(), sapphireSilverRing.getUnlocalizedName(), gemSapphire);
		Register.registerRing(amberRing, amberSilverRing, amberRing.getUnlocalizedName(), amberSilverRing.getUnlocalizedName(), gemAmber);
		Register.registerRing(jadeRing, jadeSilverRing, jadeRing.getUnlocalizedName(), jadeSilverRing.getUnlocalizedName(), gemJade);
		Register.registerRing(citrineRing, citrineSilverRing, citrineRing.getUnlocalizedName(), citrineSilverRing.getUnlocalizedName(), gemCitrine);
		Register.registerRing(amethystRing, amethystSilverRing, amethystRing.getUnlocalizedName(), amethystSilverRing.getUnlocalizedName(), gemAmethyst);
		Register.registerRing(carnelianRing, carnelianSilverRing, carnelianRing.getUnlocalizedName(), carnelianSilverRing.getUnlocalizedName(), gemCarnelian);
		Register.registerRing(amazoniteRing, amazoniteSilverRing, amazoniteRing.getUnlocalizedName(), amazoniteSilverRing.getUnlocalizedName(), gemAmazonite);
		Register.registerRing(garnetRing, garnetSilverRing, garnetRing.getUnlocalizedName(), garnetSilverRing.getUnlocalizedName(), gemGarnet);
		Register.registerRing(kunziteRing, kunziteSilverRing, kunziteRing.getUnlocalizedName(), kunziteSilverRing.getUnlocalizedName(), gemKunzite);
		Register.registerRing(aquamarineRing, aquamarineSilverRing, aquamarineRing.getUnlocalizedName(), aquamarineSilverRing.getUnlocalizedName(), gemAquamarine);
		
		Register.registerRing(diamondRing, diamondSilverRing, diamondRing.getUnlocalizedName(), diamondSilverRing.getUnlocalizedName(), gemDiamond);
		Register.registerRing(emeraldRing, emeraldSilverRing, emeraldRing.getUnlocalizedName(), emeraldSilverRing.getUnlocalizedName(), Items.emerald);
		Register.registerRing(netherQuartzRing, netherQuartzSilverRing, netherQuartzRing.getUnlocalizedName(), netherQuartzSilverRing.getUnlocalizedName(), gemNetherQuartz);
		
		Register.registerRing(voidiumRing, voidiumSilverRing, voidiumRing.getUnlocalizedName(), voidiumSilverRing.getUnlocalizedName(), voidiumCutRadioactiveFocused);
		Register.registerRing(fyrestoneRing, fyrestoneSilverRing, fyrestoneRing.getUnlocalizedName(), fyrestoneSilverRing.getUnlocalizedName(), fyrestoneCut);
		
		// Metal Bands
		GameRegistry.registerItem(goldBand, goldBand.getUnlocalizedName());
		GameRegistry.registerItem(silverBand, silverBand.getUnlocalizedName());
		
		// Food
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
	}

}
