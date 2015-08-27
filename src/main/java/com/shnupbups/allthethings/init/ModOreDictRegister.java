package com.shnupbups.allthethings.init;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

import com.shnupbups.allthethings.utility.LogHelper;

public class ModOreDictRegister {
	public static void init() {
		// Ingots
		OreDictionary.registerOre("ingotAdamanite", ModItems.ingotAdamanite);
		OreDictionary.registerOre("ingotAluminium", ModItems.ingotAluminium);
		OreDictionary.registerOre("ingotBlurite", ModItems.ingotBlurite);
		OreDictionary.registerOre("ingotChromium", ModItems.ingotChromium);
		OreDictionary.registerOre("ingotCobalt", ModItems.ingotCobalt);
		OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
		OreDictionary.registerOre("ingotDaeyalt", ModItems.ingotDaeyalt);
		OreDictionary.registerOre("ingotLead", ModItems.ingotLead);
		OreDictionary.registerOre("ingotLunar", ModItems.ingotLunar);
		OreDictionary.registerOre("ingotMalagnite", ModItems.ingotMalagnite);
		OreDictionary.registerOre("ingotManganese", ModItems.ingotManganese);
		OreDictionary.registerOre("ingotMithril", ModItems.ingotMithril);
		OreDictionary.registerOre("ingotNickel", ModItems.ingotNickel);
		OreDictionary.registerOre("ingotPlatinum", ModItems.ingotPlatinum);
		OreDictionary.registerOre("ingotRhodium", ModItems.ingotRhodium);
		OreDictionary.registerOre("ingotRubium", ModItems.ingotRubium);
		OreDictionary.registerOre("ingotRunite", ModItems.ingotRunite);
		OreDictionary.registerOre("ingotSilicon", ModItems.ingotSilicon);
		OreDictionary.registerOre("ingotSilver", ModItems.ingotSilver);
		OreDictionary.registerOre("ingotTin", ModItems.ingotTin);
		OreDictionary.registerOre("ingotTitanium", ModItems.ingotTitanium);
		OreDictionary.registerOre("ingotTungsten", ModItems.ingotTungsten);
		OreDictionary.registerOre("ingotZinc", ModItems.ingotZinc);

		// Metal Ores
		OreDictionary.registerOre("oreAdamanite", ModBlocks.oreAdamanite);
		OreDictionary.registerOre("oreAluminium", ModBlocks.oreAluminium);
		OreDictionary.registerOre("oreBlurite", ModBlocks.oreBlurite);
		OreDictionary.registerOre("oreChromium", ModBlocks.oreChromium);
		OreDictionary.registerOre("oreCobalt", ModBlocks.oreCobalt);
		OreDictionary.registerOre("oreCopper", ModBlocks.oreCopper);
		OreDictionary.registerOre("oreDaeyalt", ModBlocks.oreDaeyalt);
		OreDictionary.registerOre("oreLead", ModBlocks.oreLead);
		OreDictionary.registerOre("oreLunar", ModBlocks.oreLunar);
		OreDictionary.registerOre("oreMalagnite", ModBlocks.oreMalagnite);
		OreDictionary.registerOre("oreManganese", ModBlocks.oreManganese);
		OreDictionary.registerOre("oreMithril", ModBlocks.oreMithril);
		OreDictionary.registerOre("oreNickel", ModBlocks.oreNickel);
		OreDictionary.registerOre("orePlatinum", ModBlocks.orePlatinum);
		OreDictionary.registerOre("oreRhodium", ModBlocks.oreRhodium);
		OreDictionary.registerOre("oreRubium", ModBlocks.oreRubium);
		OreDictionary.registerOre("oreRunite", ModBlocks.oreRunite);
		OreDictionary.registerOre("oreSilicon", ModBlocks.oreSilicon);
		OreDictionary.registerOre("oreSilver", ModBlocks.oreSilver);
		OreDictionary.registerOre("oreTin", ModBlocks.oreTin);
		OreDictionary.registerOre("oreTitanium", ModBlocks.oreTitanium);
		OreDictionary.registerOre("oreTungsten", ModBlocks.oreTungsten);
		OreDictionary.registerOre("oreZinc", ModBlocks.oreZinc);
		
		// Alloys
		OreDictionary.registerOre("ingotAdamant", ModItems.ingotAdamant);
		OreDictionary.registerOre("ingotBrass", ModItems.ingotBrass);
		OreDictionary.registerOre("ingotBronze", ModItems.ingotBronze);
		OreDictionary.registerOre("ingotElectrum", ModItems.ingotElectrum);
		OreDictionary.registerOre("ingotGoloid", ModItems.ingotGoloid);
		OreDictionary.registerOre("ingotInvar", ModItems.ingotInvar);
		OreDictionary.registerOre("ingotSolder", ModItems.ingotSolder);
		OreDictionary.registerOre("ingotSteel", ModItems.ingotSteel);
		
		// Gems
		OreDictionary.registerOre("gemAmazonite", ModItems.gemAmazonite);
		OreDictionary.registerOre("gemAmber", ModItems.gemAmber);
		OreDictionary.registerOre("gemAmethyst", ModItems.gemAmethyst);
		OreDictionary.registerOre("gemAquamarine", ModItems.gemAquamarine);
		OreDictionary.registerOre("gemCarnelian", ModItems.gemCarnelian);
		OreDictionary.registerOre("gemCitrine", ModItems.gemCitrine);
		OreDictionary.registerOre("gemDiamond", ModItems.gemDiamond);
		OreDictionary.registerOre("gemGarnet", ModItems.gemGarnet);
		OreDictionary.registerOre("gemJade", ModItems.gemJade);
		OreDictionary.registerOre("gemKunzite", ModItems.gemKunzite);
		OreDictionary.registerOre("gemNetherQuartz", ModItems.gemNetherQuartz);
		OreDictionary.registerOre("gemNetherQuartz", Items.quartz);
		OreDictionary.registerOre("gemOnyx", ModItems.gemOnyx);
		OreDictionary.registerOre("gemOpal", ModItems.gemOpal);
		OreDictionary.registerOre("gemQuartz", ModItems.gemQuartz);
		OreDictionary.registerOre("gemQuartzRegular", ModItems.gemQuartz);
		OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
		OreDictionary.registerOre("gemSapphire", ModItems.gemSapphire);
		OreDictionary.registerOre("gemTopaz", ModItems.gemTopaz);

		OreDictionary.registerOre("gemObsidian", ModItems.gemObsidian);
		
		// Gem Ores
		OreDictionary.registerOre("oreAmazonite", ModBlocks.oreAmazonite);
		OreDictionary.registerOre("oreAmethyst", ModBlocks.oreAmethyst);
		OreDictionary.registerOre("oreAquamarine", ModBlocks.oreAquamarine);
		OreDictionary.registerOre("oreCarnelian", ModBlocks.oreCarnelian);
		OreDictionary.registerOre("oreCitrine", ModBlocks.oreCitrine);
		OreDictionary.registerOre("oreGarnet", ModBlocks.oreGarnet);
		OreDictionary.registerOre("oreJade", ModBlocks.oreJade);
		OreDictionary.registerOre("oreKunzite", ModBlocks.oreKunzite);
		OreDictionary.registerOre("oreOnyx", ModBlocks.oreOnyx);
		OreDictionary.registerOre("oreOpal", ModBlocks.oreOpal);
		OreDictionary.registerOre("oreQuartzRegular", ModBlocks.oreQuartz);
		OreDictionary.registerOre("oreRuby", ModBlocks.oreRuby);
		OreDictionary.registerOre("oreSapphire", ModBlocks.oreSapphire);
		OreDictionary.registerOre("oreTopaz", ModBlocks.oreTopaz);

		// Dusts
		OreDictionary.registerOre("dustAdamanite", ModItems.dustAdamanite);
		OreDictionary.registerOre("dustAdamant", ModItems.dustAdamant);
		OreDictionary.registerOre("dustAluminium", ModItems.dustAluminium);
		OreDictionary.registerOre("dustBlurite", ModItems.dustBlurite);
		OreDictionary.registerOre("dustBrass", ModItems.dustBrass);
		OreDictionary.registerOre("dustBronze", ModItems.dustBronze);
		OreDictionary.registerOre("dustChromium", ModItems.dustChromium);
		OreDictionary.registerOre("dustCobalt", ModItems.dustCobalt);
		OreDictionary.registerOre("dustCopper", ModItems.dustCopper);
		OreDictionary.registerOre("dustDaeyalt", ModItems.dustDaeyalt);
		OreDictionary.registerOre("dustElectrum", ModItems.dustElectrum);
		OreDictionary.registerOre("dustGold", ModItems.dustGold);
		OreDictionary.registerOre("dustGoloid", ModItems.dustGoloid);
		OreDictionary.registerOre("dustInvar", ModItems.dustInvar);
		OreDictionary.registerOre("dustIron", ModItems.dustIron);
		OreDictionary.registerOre("dustLead", ModItems.dustLead);
		OreDictionary.registerOre("dustLunar", ModItems.dustLunar);
		OreDictionary.registerOre("dustMalagnite", ModItems.dustMalagnite);
		OreDictionary.registerOre("dustManganese", ModItems.dustManganese);
		OreDictionary.registerOre("dustMithril", ModItems.dustMithril);
		OreDictionary.registerOre("dustNickel", ModItems.dustNickel);
		OreDictionary.registerOre("dustPlatinum", ModItems.dustPlatinum);
		OreDictionary.registerOre("dustRhodium", ModItems.dustRhodium);
		OreDictionary.registerOre("dustRubium", ModItems.dustRubium);
		OreDictionary.registerOre("dustRunite", ModItems.dustRunite);
		OreDictionary.registerOre("dustSilicon", ModItems.dustSilicon);
		OreDictionary.registerOre("dustSilver", ModItems.dustSilver);
		OreDictionary.registerOre("dustSolder", ModItems.dustSolder);
		OreDictionary.registerOre("dustSteel", ModItems.dustSteel);
		OreDictionary.registerOre("dustTin", ModItems.dustTin);
		OreDictionary.registerOre("dustTitanium", ModItems.dustTitanium);
		OreDictionary.registerOre("dustTungsten", ModItems.dustTungsten);
		OreDictionary.registerOre("dustZinc", ModItems.dustZinc);
		
		OreDictionary.registerOre("dustAmazonite", ModItems.dustAmazonite);
		OreDictionary.registerOre("dustAmber", ModItems.dustAmber);
		OreDictionary.registerOre("dustAmethyst", ModItems.dustAmethyst);
		OreDictionary.registerOre("dustAquamarine", ModItems.dustAquamarine);
		OreDictionary.registerOre("dustCarnelian", ModItems.dustCarnelian);
		OreDictionary.registerOre("dustCitrine", ModItems.dustCitrine);
		OreDictionary.registerOre("dustDiamond", ModItems.dustDiamond);
		OreDictionary.registerOre("dustEmerald", ModItems.dustEmerald);
		OreDictionary.registerOre("dustGarnet", ModItems.dustGarnet);
		OreDictionary.registerOre("dustJade", ModItems.dustJade);
		OreDictionary.registerOre("dustKunzite", ModItems.dustKunzite);
		OreDictionary.registerOre("dustNetherQuartz", ModItems.dustNetherQuartz);
		OreDictionary.registerOre("dustOnyx", ModItems.dustOnyx);
		OreDictionary.registerOre("dustOpal", ModItems.dustOpal);
		OreDictionary.registerOre("dustQuartz", ModItems.dustQuartz);
		OreDictionary.registerOre("dustRuby", ModItems.dustRuby);
		OreDictionary.registerOre("dustSapphire", ModItems.dustSapphire);
		OreDictionary.registerOre("dustTopaz", ModItems.dustTopaz);
		
		OreDictionary.registerOre("dustVoidium", ModItems.dustVoidium);
		OreDictionary.registerOre("dustFyrestone", ModItems.dustFyrestone);
		
		OreDictionary.registerOre("dustIridium", ModItems.dustIridium);
		OreDictionary.registerOre("dustPlutonium", ModItems.dustPlutonium);
		OreDictionary.registerOre("dustUranium", ModItems.dustUranium);
		
		OreDictionary.registerOre("dustCrymeretye", ModItems.dustCrymeretye);
		OreDictionary.registerOre("dustGraeconthylynium", ModItems.dustGraeconthylynium);
		OreDictionary.registerOre("dustMuktaphlyte", ModItems.dustMuktaphlyte);
		OreDictionary.registerOre("dustJonjronyphyll", ModItems.dustJonjronyphyll);
		OreDictionary.registerOre("dustKraktachnar", ModItems.dustKraktachnar);
		OreDictionary.registerOre("dustSchulbradethenairdivite", ModItems.dustSchulbradethenairdivite);
		OreDictionary.registerOre("dustXaldriodythidyte", ModItems.dustXaldriodythidyte);
		
		OreDictionary.registerOre("dustTrytementium", ModItems.dustTrytementium);
		OreDictionary.registerOre("dustUnobtanium", ModItems.dustUnobtanium); 
		
		OreDictionary.registerOre("dustCoal", ModItems.dustCoal);
		OreDictionary.registerOre("dustLapis", ModItems.dustLapis);
		
		// Clusters
		OreDictionary.registerOre("clusterAdamanite", ModItems.clusterAdamanite);
		OreDictionary.registerOre("clusterAdamant", ModItems.clusterAdamant);
		OreDictionary.registerOre("clusterAluminium", ModItems.clusterAluminium);
		OreDictionary.registerOre("clusterBlurite", ModItems.clusterBlurite);
		OreDictionary.registerOre("clusterBrass", ModItems.clusterBrass);
		OreDictionary.registerOre("clusterBronze", ModItems.clusterBronze);
		OreDictionary.registerOre("clusterChromium", ModItems.clusterChromium);
		OreDictionary.registerOre("clusterCobalt", ModItems.clusterCobalt);
		OreDictionary.registerOre("clusterCopper", ModItems.clusterCopper);
		OreDictionary.registerOre("clusterDaeyalt", ModItems.clusterDaeyalt);
		OreDictionary.registerOre("clusterElectrum", ModItems.clusterElectrum);
		OreDictionary.registerOre("clusterGold", ModItems.clusterGold);
		OreDictionary.registerOre("clusterGoloid", ModItems.clusterGoloid);
		OreDictionary.registerOre("clusterInvar", ModItems.clusterInvar);
		OreDictionary.registerOre("clusterIron", ModItems.clusterIron);
		OreDictionary.registerOre("clusterLead", ModItems.clusterLead);
		OreDictionary.registerOre("clusterLunar", ModItems.clusterLunar);
		OreDictionary.registerOre("clusterMalagnite", ModItems.clusterMalagnite);
		OreDictionary.registerOre("clusterManganese", ModItems.clusterManganese);
		OreDictionary.registerOre("clusterMithril", ModItems.clusterMithril);
		OreDictionary.registerOre("clusterNickel", ModItems.clusterNickel);
		OreDictionary.registerOre("clusterPlatinum", ModItems.clusterPlatinum);
		OreDictionary.registerOre("clusterRhodium", ModItems.clusterRhodium);
		OreDictionary.registerOre("clusterRubium", ModItems.clusterRubium);
		OreDictionary.registerOre("clusterRunite", ModItems.clusterRunite);
		OreDictionary.registerOre("clusterSilicon", ModItems.clusterSilicon);
		OreDictionary.registerOre("clusterSilver", ModItems.clusterSilver);
		OreDictionary.registerOre("clusterSolder", ModItems.clusterSolder);
		OreDictionary.registerOre("clusterSteel", ModItems.clusterSteel);
		OreDictionary.registerOre("clusterTin", ModItems.clusterTin);
		OreDictionary.registerOre("clusterTitanium", ModItems.clusterTitanium);
		OreDictionary.registerOre("clusterTungsten", ModItems.clusterTungsten);
		OreDictionary.registerOre("clusterZinc", ModItems.clusterZinc);
		
		OreDictionary.registerOre("clusterAmazonite", ModItems.clusterAmazonite);
		OreDictionary.registerOre("clusterAmber", ModItems.clusterAmber);
		OreDictionary.registerOre("clusterAmethyst", ModItems.clusterAmethyst);
		OreDictionary.registerOre("clusterAquamarine", ModItems.clusterAquamarine);
		OreDictionary.registerOre("clusterCarnelian", ModItems.clusterCarnelian);
		OreDictionary.registerOre("clusterCitrine", ModItems.clusterCitrine);
		OreDictionary.registerOre("clusterDiamond", ModItems.clusterDiamond);
		OreDictionary.registerOre("clusterEmerald", ModItems.clusterEmerald);
		OreDictionary.registerOre("clusterGarnet", ModItems.clusterGarnet);
		OreDictionary.registerOre("clusterJade", ModItems.clusterJade);
		OreDictionary.registerOre("clusterKunzite", ModItems.clusterKunzite);
		OreDictionary.registerOre("clusterNetherQuartz", ModItems.clusterNetherQuartz);
		OreDictionary.registerOre("clusterOnyx", ModItems.clusterOnyx);
		OreDictionary.registerOre("clusterOpal", ModItems.clusterOpal);
		OreDictionary.registerOre("clusterQuartz", ModItems.clusterQuartz);
		OreDictionary.registerOre("clusterRuby", ModItems.clusterRuby);
		OreDictionary.registerOre("clusterSapphire", ModItems.clusterSapphire);
		OreDictionary.registerOre("clusterTopaz", ModItems.clusterTopaz);
		
		OreDictionary.registerOre("clusterVoidium", ModItems.clusterVoidium);
		OreDictionary.registerOre("clusterFyrestone", ModItems.clusterFyrestone);
		
		OreDictionary.registerOre("clusterIridium", ModItems.clusterIridium);
		OreDictionary.registerOre("clusterPlutonium", ModItems.clusterPlutonium);
		OreDictionary.registerOre("clusterUranium", ModItems.clusterUranium);
		
		OreDictionary.registerOre("clusterCrymeretye", ModItems.clusterCrymeretye);
		OreDictionary.registerOre("clusterGraeconthylynium", ModItems.clusterGraeconthylynium);
		OreDictionary.registerOre("clusterMuktaphlyte", ModItems.clusterMuktaphlyte);
		OreDictionary.registerOre("clusterJonjronyphyll", ModItems.clusterJonjronyphyll);
		OreDictionary.registerOre("clusterKraktachnar", ModItems.clusterKraktachnar);
		OreDictionary.registerOre("clusterSchulbradethenairdivite", ModItems.clusterSchulbradethenairdivite);
		OreDictionary.registerOre("clusterXaldriodythidyte", ModItems.clusterXaldriodythidyte);
		
		OreDictionary.registerOre("clusterTrytementium", ModItems.clusterTrytementium);
		OreDictionary.registerOre("clusterUnobtanium", ModItems.clusterUnobtanium);
		
		OreDictionary.registerOre("clusterCoal", ModItems.clusterCoal);
		OreDictionary.registerOre("clusterLapis", ModItems.clusterLapis);
		OreDictionary.registerOre("clusterRedstone", ModItems.clusterRedstone);
		
		// Plates
	    OreDictionary.registerOre("plateAdamanite", ModItems.plateAdamanite);
	    OreDictionary.registerOre("plateAdamant", ModItems.plateAdamant);
	    OreDictionary.registerOre("plateAluminium", ModItems.plateAluminium);
	    OreDictionary.registerOre("plateBlurite", ModItems.plateBlurite);
	    OreDictionary.registerOre("plateBrass", ModItems.plateBrass);
	    OreDictionary.registerOre("plateBronze", ModItems.plateBronze);
	    OreDictionary.registerOre("plateChromium", ModItems.plateChromium);
	    OreDictionary.registerOre("plateCobalt", ModItems.plateCobalt);
	    OreDictionary.registerOre("plateCopper", ModItems.plateCopper);
	    OreDictionary.registerOre("plateDaeyalt", ModItems.plateDaeyalt);
	    OreDictionary.registerOre("plateElectrum", ModItems.plateElectrum);
	    OreDictionary.registerOre("plateGold", ModItems.plateGold);
	    OreDictionary.registerOre("plateGoloid", ModItems.plateGoloid);
	    OreDictionary.registerOre("plateInvar", ModItems.plateInvar);
	    OreDictionary.registerOre("plateIron", ModItems.plateIron);
	    OreDictionary.registerOre("plateLead", ModItems.plateLead);
	    OreDictionary.registerOre("plateLunar", ModItems.plateLunar);
	    OreDictionary.registerOre("plateMalagnite", ModItems.plateMalagnite);
	    OreDictionary.registerOre("plateManganese", ModItems.plateManganese);
	    OreDictionary.registerOre("plateMithril", ModItems.plateMithril);
	    OreDictionary.registerOre("plateNickel", ModItems.plateNickel);
	    OreDictionary.registerOre("plateObsidian", ModItems.plateObsidian);
	    OreDictionary.registerOre("platePlatinum", ModItems.platePlatinum);
	    OreDictionary.registerOre("plateRhodium", ModItems.plateRhodium);
	    OreDictionary.registerOre("plateRubium", ModItems.plateRubium);
	    OreDictionary.registerOre("plateRunite", ModItems.plateRunite);
	    OreDictionary.registerOre("plateSilicon", ModItems.plateSilicon);
	    OreDictionary.registerOre("plateSilver", ModItems.plateSilver);
	    OreDictionary.registerOre("plateSolder", ModItems.plateSolder);
	    OreDictionary.registerOre("plateSteel", ModItems.plateSteel);
	    OreDictionary.registerOre("plateTin", ModItems.plateTin);
	    OreDictionary.registerOre("plateTitanium", ModItems.plateTitanium);
	    OreDictionary.registerOre("plateTungsten", ModItems.plateTungsten);
	    OreDictionary.registerOre("plateZinc", ModItems.plateZinc);
		
		// Nuggets
	    OreDictionary.registerOre("nuggetAdamanite", ModItems.nuggetAdamanite);
	    OreDictionary.registerOre("nuggetAdamant", ModItems.nuggetAdamant);
	    OreDictionary.registerOre("nuggetAluminium", ModItems.nuggetAluminium);
	    OreDictionary.registerOre("nuggetBlurite", ModItems.nuggetBlurite);
	    OreDictionary.registerOre("nuggetBrass", ModItems.nuggetBrass);
	    OreDictionary.registerOre("nuggetBronze", ModItems.nuggetBronze);
	    OreDictionary.registerOre("nuggetChromium", ModItems.nuggetChromium);
	    OreDictionary.registerOre("nuggetCobalt", ModItems.nuggetCobalt);
	    OreDictionary.registerOre("nuggetCopper", ModItems.nuggetCopper);
	    OreDictionary.registerOre("nuggetDaeyalt", ModItems.nuggetDaeyalt);
	    OreDictionary.registerOre("nuggetElectrum", ModItems.nuggetElectrum);
	    OreDictionary.registerOre("nuggetGoloid", ModItems.nuggetGoloid);
	    OreDictionary.registerOre("nuggetInvar", ModItems.nuggetInvar);
	    OreDictionary.registerOre("nuggetIron", ModItems.nuggetIron);
	    OreDictionary.registerOre("nuggetLead", ModItems.nuggetLead);
	    OreDictionary.registerOre("nuggetLunar", ModItems.nuggetLunar);
	    OreDictionary.registerOre("nuggetMalagnite", ModItems.nuggetMalagnite);
	    OreDictionary.registerOre("nuggetManganese", ModItems.nuggetManganese);
	    OreDictionary.registerOre("nuggetMithril", ModItems.nuggetMithril);
	    OreDictionary.registerOre("nuggetNickel", ModItems.nuggetNickel);
	    OreDictionary.registerOre("nuggetPlatinum", ModItems.nuggetPlatinum);
	    OreDictionary.registerOre("nuggetRhodium", ModItems.nuggetRhodium);
	    OreDictionary.registerOre("nuggetRubium", ModItems.nuggetRubium);
	    OreDictionary.registerOre("nuggetRunite", ModItems.nuggetRunite);
	    OreDictionary.registerOre("nuggetSilicon", ModItems.nuggetSilicon);
	    OreDictionary.registerOre("nuggetSilver", ModItems.nuggetSilver);
	    OreDictionary.registerOre("nuggetSolder", ModItems.nuggetSolder);
	    OreDictionary.registerOre("nuggetSteel", ModItems.nuggetSteel);
	    OreDictionary.registerOre("nuggetTin", ModItems.nuggetTin);
	    OreDictionary.registerOre("nuggetTitanium", ModItems.nuggetTitanium);
	    OreDictionary.registerOre("nuggetTungsten", ModItems.nuggetTungsten);
	    OreDictionary.registerOre("nuggetZinc", ModItems.nuggetZinc);

		// Pure Stuff
		OreDictionary.registerOre("gemPureAmazonite", ModItems.gemPureAmazonite);
		OreDictionary.registerOre("gemPureAmber", ModItems.gemPureAmber);
		OreDictionary.registerOre("gemPureAmethyst", ModItems.gemPureAmethyst);
		OreDictionary.registerOre("gemPureAquamarine", ModItems.gemPureAquamarine);
		OreDictionary.registerOre("gemPureCarnelian", ModItems.gemPureCarnelian);
		OreDictionary.registerOre("gemPureCitrine", ModItems.gemPureCitrine);
		OreDictionary.registerOre("gemPureDiamond", ModItems.gemPureDiamond);
		OreDictionary.registerOre("gemPureEmerald", ModItems.gemPureEmerald);
		OreDictionary.registerOre("gemPureGarnet", ModItems.gemPureGarnet);
		OreDictionary.registerOre("gemPureJade", ModItems.gemPureJade);
		OreDictionary.registerOre("gemPureKunzite", ModItems.gemPureKunzite);
		OreDictionary.registerOre("gemPureNetherQuartz", ModItems.gemPureNetherQuartz);
		OreDictionary.registerOre("gemPureOnyx", ModItems.gemPureOnyx);
		OreDictionary.registerOre("gemPureOpal", ModItems.gemPureOpal);
		OreDictionary.registerOre("gemPureQuartz", ModItems.gemPureQuartz);
		OreDictionary.registerOre("gemPureRuby", ModItems.gemPureRuby);
		OreDictionary.registerOre("gemPureSapphire", ModItems.gemPureSapphire);
		OreDictionary.registerOre("gemPureTopaz", ModItems.gemPureTopaz);
		
		OreDictionary.registerOre("gemPureFyrestone", ModItems.gemPureFyrestone);
		OreDictionary.registerOre("gemPureVoidiumRadioactiveFocused", ModItems.gemPureVoidiumRadioactiveFocused);
		
		OreDictionary.registerOre("gemPureObsidian", ModItems.gemPureObsidian);
		
		OreDictionary.registerOre("gemAmazonite", ModItems.gemPureAmazonite);
		OreDictionary.registerOre("gemAmber", ModItems.gemPureAmber);
		OreDictionary.registerOre("gemAmethyst", ModItems.gemPureAmethyst);
		OreDictionary.registerOre("gemAquamarine", ModItems.gemPureAquamarine);
		OreDictionary.registerOre("gemCarnelian", ModItems.gemPureCarnelian);
		OreDictionary.registerOre("gemCitrine", ModItems.gemPureCitrine);
		OreDictionary.registerOre("gemDiamond", ModItems.gemPureDiamond);
		OreDictionary.registerOre("gemEmerald", ModItems.gemPureEmerald);
		OreDictionary.registerOre("gemGarnet", ModItems.gemPureGarnet);
		OreDictionary.registerOre("gemJade", ModItems.gemPureJade);
		OreDictionary.registerOre("gemKunzite", ModItems.gemPureKunzite);
		OreDictionary.registerOre("gemNetherQuartz", ModItems.gemPureNetherQuartz);
		OreDictionary.registerOre("gemOnyx", ModItems.gemPureOnyx);
		OreDictionary.registerOre("gemOpal", ModItems.gemPureOpal);
		OreDictionary.registerOre("gemQuartz", ModItems.gemPureQuartz);
		OreDictionary.registerOre("gemQuartzRegular", ModItems.gemPureQuartz);
		OreDictionary.registerOre("gemRuby", ModItems.gemPureRuby);
		OreDictionary.registerOre("gemSapphire", ModItems.gemPureSapphire);
		OreDictionary.registerOre("gemTopaz", ModItems.gemPureTopaz);
		
		OreDictionary.registerOre("gemFyrestone", ModItems.gemPureFyrestone);
		OreDictionary.registerOre("gemVoidiumRadioactiveFocused", ModItems.gemPureVoidiumRadioactiveFocused);
		
		OreDictionary.registerOre("gemObsidian", ModItems.gemPureObsidian);
		
		// Shards
		OreDictionary.registerOre("shardAmazonite", ModItems.shardAmazonite);
		OreDictionary.registerOre("shardAmber", ModItems.shardAmber);
		OreDictionary.registerOre("shardAmethyst", ModItems.shardAmethyst);
		OreDictionary.registerOre("shardAquamarine", ModItems.shardAquamarine);
		OreDictionary.registerOre("shardCarnelian", ModItems.shardCarnelian);
		OreDictionary.registerOre("shardCitrine", ModItems.shardCitrine);
		OreDictionary.registerOre("shardDiamond", ModItems.shardDiamond);
		OreDictionary.registerOre("shardEmerald", ModItems.shardEmerald);
		OreDictionary.registerOre("shardGarnet", ModItems.shardGarnet);
		OreDictionary.registerOre("shardJade", ModItems.shardJade);
		OreDictionary.registerOre("shardKunzite", ModItems.shardKunzite);
		OreDictionary.registerOre("shardNetherQuartz", ModItems.shardNetherQuartz);
		OreDictionary.registerOre("shardOnyx", ModItems.shardOnyx);
		OreDictionary.registerOre("shardOpal", ModItems.shardOpal);
		OreDictionary.registerOre("shardQuartz", ModItems.shardQuartz);
		OreDictionary.registerOre("shardRuby", ModItems.shardRuby);
		OreDictionary.registerOre("shardSapphire", ModItems.shardSapphire);
		OreDictionary.registerOre("shardTopaz", ModItems.shardTopaz);
		
		OreDictionary.registerOre("shardFyrestone", ModItems.shardFyrestone);
		OreDictionary.registerOre("shardVoidiumRadioactiveFocused", ModItems.shardVoidiumRadioactiveFocused);
		
		OreDictionary.registerOre("shardObsidian", ModItems.shardObsidian);
		
		OreDictionary.registerOre("shardTrytementium", ModItems.shardTrytementium);
		OreDictionary.registerOre("shardUnobtanium", ModItems.shardUnobtanium);
		
		// Gears
		OreDictionary.registerOre("gearAdamanite", ModItems.gearAdamanite);
	    OreDictionary.registerOre("gearAdamant", ModItems.gearAdamant);
	    OreDictionary.registerOre("gearAluminium", ModItems.gearAluminium);
	    OreDictionary.registerOre("gearBlurite", ModItems.gearBlurite);
	    OreDictionary.registerOre("gearBrass", ModItems.gearBrass);
	    OreDictionary.registerOre("gearBronze", ModItems.gearBronze);
	    OreDictionary.registerOre("gearChromium", ModItems.gearChromium);
	    OreDictionary.registerOre("gearCobalt", ModItems.gearCobalt);
	    OreDictionary.registerOre("gearCopper", ModItems.gearCopper);
	    OreDictionary.registerOre("gearDaeyalt", ModItems.gearDaeyalt);
	    OreDictionary.registerOre("gearElectrum", ModItems.gearElectrum);
	    OreDictionary.registerOre("gearGold", ModItems.gearGold);
	    OreDictionary.registerOre("gearGoloid", ModItems.gearGoloid);
	    OreDictionary.registerOre("gearInvar", ModItems.gearInvar);
	    OreDictionary.registerOre("gearIron", ModItems.gearIron);
	    OreDictionary.registerOre("gearLead", ModItems.gearLead);
	    OreDictionary.registerOre("gearLunar", ModItems.gearLunar);
	    OreDictionary.registerOre("gearMalagnite", ModItems.gearMalagnite);
	    OreDictionary.registerOre("gearManganese", ModItems.gearManganese);
	    OreDictionary.registerOre("gearMithril", ModItems.gearMithril);
	    OreDictionary.registerOre("gearNickel", ModItems.gearNickel);
	    OreDictionary.registerOre("gearPlatinum", ModItems.gearPlatinum);
	    OreDictionary.registerOre("gearRhodium", ModItems.gearRhodium);
	    OreDictionary.registerOre("gearRubium", ModItems.gearRubium);
	    OreDictionary.registerOre("gearRunite", ModItems.gearRunite);
	    OreDictionary.registerOre("gearSilicon", ModItems.gearSilicon);
	    OreDictionary.registerOre("gearSilver", ModItems.gearSilver);
	    OreDictionary.registerOre("gearSolder", ModItems.gearSolder);
	    OreDictionary.registerOre("gearSteel", ModItems.gearSteel);
	    OreDictionary.registerOre("gearTin", ModItems.gearTin);
	    OreDictionary.registerOre("gearTitanium", ModItems.gearTitanium);
	    OreDictionary.registerOre("gearTungsten", ModItems.gearTungsten);
	    OreDictionary.registerOre("gearZinc", ModItems.gearZinc);
		
		// Radioactive Materials
		OreDictionary.registerOre("ingotIridium", ModItems.iridium);
		OreDictionary.registerOre("ingotPlutonium", ModItems.plutonium);
		OreDictionary.registerOre("ingotUranium", ModItems.uranium);
		
		// Radioactive Ores
		OreDictionary.registerOre("oreIridium", ModBlocks.oreIridium);
		OreDictionary.registerOre("orePlutonium", ModBlocks.orePlutonium);
		OreDictionary.registerOre("oreUranium", ModBlocks.oreUranium);
		
		// Special Materials
		OreDictionary.registerOre("materialCrymeretye", ModItems.crymeretye);
		OreDictionary.registerOre("materialGraeconthylynium", ModItems.graeconthylynium);
		OreDictionary.registerOre("materialMuktaphlyte", ModItems.muktaphlyte);
		OreDictionary.registerOre("materialJonjronyphyll", ModItems.jonjronyphyll);
		OreDictionary.registerOre("materialKraktachnar", ModItems.kraktachnar);
		OreDictionary.registerOre("materialSchulbradethenairdivite", ModItems.schulbradethenairdivite);
		OreDictionary.registerOre("materialXaldriodythidyte", ModItems.xaldriodythidyte);
		
		OreDictionary.registerOre("materialFyrestone", ModItems.fyrestone);
		OreDictionary.registerOre("materialVoidium", ModItems.voidium);
		OreDictionary.registerOre("materialTrytementium", ModItems.trytementium);
		OreDictionary.registerOre("materialYlvoltium", ModItems.ylvoltium);
		OreDictionary.registerOre("ingotUnobtanium", ModItems.unobtanium);
		
		OreDictionary.registerOre("materialCoal", Items.coal);
		
		// Special Ores
		
		OreDictionary.registerOre("oreCrymeretye", ModBlocks.oreCrymeretye);
		OreDictionary.registerOre("oreGraeconthylynium", ModBlocks.oreGraeconthylynium);
		OreDictionary.registerOre("oreMuktaphlyte", ModBlocks.oreMuktaphlyte);
		OreDictionary.registerOre("oreJonjronyphyll", ModBlocks.oreJonjronyphyll);
		OreDictionary.registerOre("oreKraktachnar", ModBlocks.oreKraktachnar);
		OreDictionary.registerOre("oreSchulbradethenairdivite", ModBlocks.oreSchulbradethenairdivite);
		OreDictionary.registerOre("oreXaldriodythidyte", ModBlocks.oreXaldriodythidyte);
		
		OreDictionary.registerOre("oreFyrestone", ModBlocks.oreFyrestone);
		OreDictionary.registerOre("oreVoidium", ModBlocks.oreVoidium);
		OreDictionary.registerOre("oreVoidium", ModBlocks.oreVoidiumBedrock);
		OreDictionary.registerOre("oreVoidiumRegular", ModBlocks.oreVoidium);
		OreDictionary.registerOre("oreVoidiumBedrock", ModBlocks.oreVoidiumBedrock);
		OreDictionary.registerOre("oreTrytementium", ModBlocks.oreTrytementium);
		
		LogHelper.info("Ore Dictionary integration initialized successfully!");
	}
}