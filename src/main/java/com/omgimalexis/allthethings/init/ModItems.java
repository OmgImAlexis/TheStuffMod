package com.omgimalexis.allthethings.init;

import com.omgimalexis.allthethings.item.ItemBanana;
import com.omgimalexis.allthethings.item.ItemBasic;
import com.omgimalexis.allthethings.item.ItemBasicCake;
import com.omgimalexis.allthethings.item.ItemBasicFood;
import com.omgimalexis.allthethings.item.ItemBasicSeedFood;
import com.omgimalexis.allthethings.item.ItemBucketDrink;
import com.omgimalexis.allthethings.item.ItemDebugger;
import com.omgimalexis.allthethings.item.ItemFossil;
import com.omgimalexis.allthethings.item.ItemKnife;
import com.omgimalexis.allthethings.item.ItemMaterial;
import com.omgimalexis.allthethings.item.ItemPaintbrush;
import com.omgimalexis.allthethings.item.ItemUpgrade;
import com.omgimalexis.allthethings.item.MaterialDimension;
import com.omgimalexis.allthethings.item.MaterialRarity;
import com.omgimalexis.allthethings.item.MaterialType;
import com.omgimalexis.allthethings.utility.Register;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	// Ingots
	public static final ItemMaterial ingotAdamanite = new ItemMaterial("ingotAdamanite",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotAdamant = new ItemMaterial("ingotAdamant",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotAluminium = new ItemMaterial("ingotAluminium",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotBlurite = new ItemMaterial("ingotBlurite",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotBrass = new ItemMaterial("ingotBrass",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotBronze = new ItemMaterial("ingotBronze",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotChromium = new ItemMaterial("ingotChromium",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotCobalt = new ItemMaterial("ingotCobalt",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotCopper = new ItemMaterial("ingotCopper",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial ingotDaeyalt = new ItemMaterial("ingotDaeyalt",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotElectrum = new ItemMaterial("ingotElectrum",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotGoloid = new ItemMaterial("ingotGoloid",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotInvar = new ItemMaterial("ingotInvar",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotLead = new ItemMaterial("ingotLead",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotLunar = new ItemMaterial("ingotLunar",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotMalagnite = new ItemMaterial("ingotMalagnite",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.RARE);
	public static final ItemMaterial ingotManganese = new ItemMaterial("ingotManganese",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotMithril = new ItemMaterial("ingotMithril",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotNickel = new ItemMaterial("ingotNickel",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotPlatinum = new ItemMaterial("ingotPlatinum",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotRhodium = new ItemMaterial("ingotRhodium",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotRubium = new ItemMaterial("ingotRubium",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotRunite = new ItemMaterial("ingotRunite",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotSilicon = new ItemMaterial("ingotSilicon", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotSilver = new ItemMaterial("ingotSilver",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotSolder = new ItemMaterial("ingotSolder",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotSteel = new ItemMaterial("ingotSteel",ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotTin = new ItemMaterial("ingotTin",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotTitanium = new ItemMaterial("ingotTitanium",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotTungsten = new ItemMaterial("ingotTungsten",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotZinc = new ItemMaterial("ingotZinc",ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	
	// Dusts
	public static final ItemMaterial dustAdamanite = new ItemMaterial("dustAdamanite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustAdamant = new ItemMaterial("dustAdamant",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustAluminium = new ItemMaterial("dustAluminium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustBlurite = new ItemMaterial("dustBlurite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustBrass = new ItemMaterial("dustBrass",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustBronze = new ItemMaterial("dustBronze",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustChromium = new ItemMaterial("dustChromium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustCobalt = new ItemMaterial("dustCobalt",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustCopper = new ItemMaterial("dustCopper",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial dustDaeyalt = new ItemMaterial("dustDaeyalt",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustElectrum = new ItemMaterial("dustElectrum",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustGold = new ItemMaterial("dustGold",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustGoloid = new ItemMaterial("dustGoloid",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustInvar = new ItemMaterial("dustInvar",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustIron = new ItemMaterial("dustIron",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial dustLead = new ItemMaterial("dustLead",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustLunar = new ItemMaterial("dustLunar",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustMalagnite = new ItemMaterial("dustMalagnite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.RARE);
	public static final ItemMaterial dustManganese = new ItemMaterial("dustManganese",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustMithril = new ItemMaterial("dustMithril",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustNickel = new ItemMaterial("dustNickel",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustObsidian = new ItemMaterial("dustObsidian",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.RARE);
	public static final ItemMaterial dustPlatinum = new ItemMaterial("dustPlatinum",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustRhodium = new ItemMaterial("dustRhodium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustRubium = new ItemMaterial("dustRubium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustRunite = new ItemMaterial("dustRunite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustSilicon = new ItemMaterial("dustSilicon", ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustSilver = new ItemMaterial("dustSilver",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustSolder = new ItemMaterial("dustSolder",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustSteel = new ItemMaterial("dustSteel",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustTin = new ItemMaterial("dustTin",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustTitanium = new ItemMaterial("dustTitanium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustTungsten = new ItemMaterial("dustTungsten",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustZinc = new ItemMaterial("dustZinc",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial dustAmazonite = new ItemMaterial("dustAmazonite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustAmber = new ItemMaterial("dustAmber",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustAmethyst = new ItemMaterial("dustAmethyst",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustAquamarine = new ItemMaterial("dustAquamarine",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustCarnelian = new ItemMaterial("dustCarnelian",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustCitrine = new ItemMaterial("dustCitrine",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.SUPERRARE);
	public static final ItemMaterial dustDiamond = new ItemMaterial("dustDiamond",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.RARE);
	public static final ItemMaterial dustEmerald = new ItemMaterial("dustEmerald",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustGarnet = new ItemMaterial("dustGarnet",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustJade = new ItemMaterial("dustJade",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustKunzite = new ItemMaterial("dustKunzite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustNetherQuartz = new ItemMaterial("dustNetherQuartz",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial dustOnyx = new ItemMaterial("dustOnyx",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.SUPERRARE);
	public static final ItemMaterial dustOpal = new ItemMaterial("dustOpal",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustQuartz = new ItemMaterial("dustQuartz",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	public static final ItemMaterial dustRuby = new ItemMaterial("dustRuby",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustSapphire = new ItemMaterial("dustSapphire",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	public static final ItemMaterial dustTopaz = new ItemMaterial("dustTopaz",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial dustVoidium = new ItemMaterial("dustVoidium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON, MaterialDimension.END);
	public static final ItemMaterial dustFyrestone = new ItemMaterial("dustFyrestone",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.COMMON, MaterialDimension.NETHER);
	
	public static final ItemMaterial dustIridium = new ItemMaterial("dustIridium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.RARE);
	public static final ItemMaterial dustPlutonium = new ItemMaterial("dustPlutonium", ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.RARE);
	public static final ItemMaterial dustUranium = new ItemMaterial("dustUranium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial dustCrymeretye = new ItemMaterial("dustCrymeretye",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial dustGraeconthylynium  = new ItemMaterial("dustGraeconthylynium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial dustMuktaphlyte  = new ItemMaterial("dustMuktaphlyte",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial dustJonjronyphyll  = new ItemMaterial("dustJonjronyphyll",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial dustKraktachnar  = new ItemMaterial("dustKraktachnar",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial dustSchulbradethenairdivite  = new ItemMaterial("dustSchulbradethenairdivite",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial dustXaldriodythidyte  = new ItemMaterial("dustXaldriodythidyte",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	
	public static final ItemMaterial dustTrytementium = new ItemMaterial("dustTrytementium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.AVERAGE, MaterialDimension.NETHER);
	public static final ItemMaterial dustUnobtanium = new ItemMaterial("dustUnobtanium",ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.ULTRARARE, MaterialDimension.NONE);
	
	public static final ItemMaterial dustCoal = new ItemMaterial("dustCoal", ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial dustLapis = new ItemMaterial("dustLapis", ModCreativeTabs.plate, MaterialType.DUST, MaterialRarity.UNCOMMON);
	
	// Clusters
	public static final ItemMaterial clusterAdamanite = new ItemMaterial("clusterAdamanite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterAdamant = new ItemMaterial("clusterAdamant",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterAluminium = new ItemMaterial("clusterAluminium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterBlurite = new ItemMaterial("clusterBlurite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterBrass = new ItemMaterial("clusterBrass",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterBronze = new ItemMaterial("clusterBronze",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterChromium = new ItemMaterial("clusterChromium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterCobalt = new ItemMaterial("clusterCobalt",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterCopper = new ItemMaterial("clusterCopper",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial clusterDaeyalt = new ItemMaterial("clusterDaeyalt",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterElectrum = new ItemMaterial("clusterElectrum",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterGold = new ItemMaterial("clusterGold",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterGoloid = new ItemMaterial("clusterGoloid",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterInvar = new ItemMaterial("clusterInvar",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterIron = new ItemMaterial("clusterIron",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial clusterLead = new ItemMaterial("clusterLead",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterLunar = new ItemMaterial("clusterLunar",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterMalagnite = new ItemMaterial("clusterMalagnite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.RARE);
	public static final ItemMaterial clusterManganese = new ItemMaterial("clusterManganese",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterMithril = new ItemMaterial("clusterMithril",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterNickel = new ItemMaterial("clusterNickel",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterObsidian = new ItemMaterial("clusterObsidian",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.RARE);
	public static final ItemMaterial clusterPlatinum = new ItemMaterial("clusterPlatinum",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterRhodium = new ItemMaterial("clusterRhodium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterRubium = new ItemMaterial("clusterRubium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterRunite = new ItemMaterial("clusterRunite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterSilicon = new ItemMaterial("clusterSilicon", ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterSilver = new ItemMaterial("clusterSilver",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterSolder = new ItemMaterial("clusterSolder",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterSteel = new ItemMaterial("clusterSteel",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterTin = new ItemMaterial("clusterTin",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterTitanium = new ItemMaterial("clusterTitanium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterTungsten = new ItemMaterial("clusterTungsten",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterZinc = new ItemMaterial("clusterZinc",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial clusterAmazonite = new ItemMaterial("clusterAmazonite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterAmber = new ItemMaterial("clusterAmber",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterAmethyst = new ItemMaterial("clusterAmethyst",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterAquamarine = new ItemMaterial("clusterAquamarine",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterCarnelian = new ItemMaterial("clusterCarnelian",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterCitrine = new ItemMaterial("clusterCitrine",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.SUPERRARE);
	public static final ItemMaterial clusterDiamond = new ItemMaterial("clusterDiamond",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.RARE);
	public static final ItemMaterial clusterEmerald = new ItemMaterial("clusterEmerald",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterGarnet = new ItemMaterial("clusterGarnet",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterJade = new ItemMaterial("clusterJade",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterKunzite = new ItemMaterial("clusterKunzite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterNetherQuartz = new ItemMaterial("clusterNetherQuartz",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial clusterOnyx = new ItemMaterial("clusterOnyx",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.SUPERRARE);
	public static final ItemMaterial clusterOpal = new ItemMaterial("clusterOpal",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterQuartz = new ItemMaterial("clusterQuartz",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	public static final ItemMaterial clusterRuby = new ItemMaterial("clusterRuby",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterSapphire = new ItemMaterial("clusterSapphire",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterTopaz = new ItemMaterial("clusterTopaz",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial clusterVoidium = new ItemMaterial("clusterVoidium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, MaterialDimension.END);
	public static final ItemMaterial clusterFyrestone = new ItemMaterial("clusterFyrestone",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.COMMON, MaterialDimension.NETHER);
	
	public static final ItemMaterial clusterIridium = new ItemMaterial("clusterIridium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.RARE);
	public static final ItemMaterial clusterPlutonium = new ItemMaterial("clusterPlutonium", ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.RARE);
	public static final ItemMaterial clusterUranium = new ItemMaterial("clusterUranium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial clusterCrymeretye = new ItemMaterial("clusterCrymeretye",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial clusterGraeconthylynium  = new ItemMaterial("clusterGraeconthylynium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial clusterMuktaphlyte  = new ItemMaterial("clusterMuktaphlyte",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial clusterJonjronyphyll  = new ItemMaterial("clusterJonjronyphyll",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial clusterKraktachnar  = new ItemMaterial("clusterKraktachnar",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial clusterSchulbradethenairdivite  = new ItemMaterial("clusterSchulbradethenairdivite",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial clusterXaldriodythidyte  = new ItemMaterial("clusterXaldriodythidyte",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	
	public static final ItemMaterial clusterTrytementium = new ItemMaterial("clusterTrytementium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.AVERAGE, MaterialDimension.NETHER);
	public static final ItemMaterial clusterUnobtanium = new ItemMaterial("clusterUnobtanium",ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.ULTRARARE, MaterialDimension.NONE);
	
	public static final ItemMaterial clusterCoal = new ItemMaterial("clusterCoal", ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial clusterLapis = new ItemMaterial("clusterLapis", ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.UNCOMMON);
	public static final ItemMaterial clusterRedstone = new ItemMaterial("clusterRedstone", ModCreativeTabs.plate, MaterialType.CLUSTER, MaterialRarity.COMMON);
	
	// Plates
	public static final ItemMaterial plateAdamanite = new ItemMaterial("plateAdamanite",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateAdamant = new ItemMaterial("plateAdamant",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateAluminium = new ItemMaterial("plateAluminium",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.UNCOMMON);
	public static final ItemMaterial plateBlurite = new ItemMaterial("plateBlurite",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateBrass = new ItemMaterial("plateBrass",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateBronze = new ItemMaterial("plateBronze",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateChromium = new ItemMaterial("plateChromium",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateCobalt = new ItemMaterial("plateCobalt",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateCopper = new ItemMaterial("plateCopper",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial plateDaeyalt = new ItemMaterial("plateDaeyalt",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateElectrum = new ItemMaterial("plateElectrum",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateGold = new ItemMaterial("plateGold",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.UNCOMMON);
	public static final ItemMaterial plateGoloid = new ItemMaterial("plateGoloid",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateInvar = new ItemMaterial("plateInvar",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateIron = new ItemMaterial("plateIron",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial plateLead = new ItemMaterial("plateLead",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.UNCOMMON);
	public static final ItemMaterial plateLunar = new ItemMaterial("plateLunar",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateMalagnite = new ItemMaterial("plateMalagnite",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.RARE);
	public static final ItemMaterial plateManganese = new ItemMaterial("plateManganese",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateMithril = new ItemMaterial("plateMithril",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateNickel = new ItemMaterial("plateNickel",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.UNCOMMON);
	public static final ItemMaterial plateObsidian = new ItemMaterial("plateObsidian",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.RARE);
	public static final ItemMaterial platePlatinum = new ItemMaterial("platePlatinum",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateRhodium = new ItemMaterial("plateRhodium",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateRubium = new ItemMaterial("plateRubium",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateRunite = new ItemMaterial("plateRunite",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateSilicon = new ItemMaterial("plateSilicon", ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateSilver = new ItemMaterial("plateSilver",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.UNCOMMON);
	public static final ItemMaterial plateSolder = new ItemMaterial("plateSolder",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateSteel = new ItemMaterial("plateSteel",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateTin = new ItemMaterial("plateTin",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.UNCOMMON);
	public static final ItemMaterial plateTitanium = new ItemMaterial("plateTitanium",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateTungsten = new ItemMaterial("plateTungsten",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	public static final ItemMaterial plateZinc = new ItemMaterial("plateZinc",ModCreativeTabs.item, MaterialType.PLATE, MaterialRarity.AVERAGE);
	
	// Gems
	public static final ItemMaterial gemAmazonite = new ItemMaterial("gemAmazonite", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemAmber = new ItemMaterial("gemAmber", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemAmethyst = new ItemMaterial("gemAmethyst", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemAquamarine = new ItemMaterial("gemAquamarine", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemCarnelian = new ItemMaterial("gemCarnelian", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemCitrine = new ItemMaterial("gemCitrine", MaterialType.GEM, MaterialRarity.SUPERRARE);
	public static final ItemMaterial gemDiamond = new ItemMaterial("gemDiamond", MaterialType.GEM, MaterialRarity.RARE);
	public static final ItemMaterial gemGarnet = new ItemMaterial("gemGarnet", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemJade = new ItemMaterial("gemJade", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemKunzite = new ItemMaterial("gemKunzite", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemNetherQuartz = new ItemMaterial("gemNetherQuartz", MaterialType.GEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial gemOnyx = new ItemMaterial("gemOnyx", MaterialType.GEM, MaterialRarity.SUPERRARE);
	public static final ItemMaterial gemOpal = new ItemMaterial("gemOpal", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemQuartz = new ItemMaterial("gemQuartz", MaterialType.GEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemRuby = new ItemMaterial("gemRuby", MaterialType.GEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemSapphire = new ItemMaterial("gemSapphire", MaterialType.GEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemTopaz = new ItemMaterial("gemTopaz", MaterialType.GEM, MaterialRarity.AVERAGE);
	
	// Pure Stuff
	public static final ItemMaterial gemPureAmazonite = new ItemMaterial("amazonitePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureAmber = new ItemMaterial("amberPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureAmethyst = new ItemMaterial("amethystPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureAquamarine = new ItemMaterial("aquamarinePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureCarnelian = new ItemMaterial("carnelianPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureCitrine = new ItemMaterial("citrinePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.SUPERRARE);
	public static final ItemMaterial gemPureDiamond = new ItemMaterial("diamondPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.RARE);
	public static final ItemMaterial gemPureEmerald = new ItemMaterial("emeraldPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemPureGarnet = new ItemMaterial("garnetPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureJade = new ItemMaterial("jadePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureKunzite = new ItemMaterial("kunzitePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureNetherQuartz = new ItemMaterial("netherQuartzPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial gemPureOnyx = new ItemMaterial("onyxPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.SUPERRARE);
	public static final ItemMaterial gemPureOpal = new ItemMaterial("opalPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureQuartz = new ItemMaterial("quartzPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureRuby = new ItemMaterial("rubyPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemPureSapphire = new ItemMaterial("sapphirePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemPureTopaz = new ItemMaterial("topazPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial gemPureFyrestone = new ItemMaterial("fyrestonePure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial gemPureVoidiumRadioactiveFocused = new ItemMaterial("voidiumPureRadioactiveFocused",ModCreativeTabs.pure, "§8And You Purified the Gem. §2RADIOACTIVE", MaterialType.PUREGEM, MaterialRarity.SUPERRARE, MaterialDimension.END);
	
	public static final ItemMaterial pureObsidian = new ItemMaterial("obsidianPure",ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.RARE);
	
	// Shards
	public static final ItemMaterial shardAmazonite = new ItemMaterial("amazoniteShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardAmber = new ItemMaterial("amberShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardAmethyst = new ItemMaterial("amethystShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardAquamarine = new ItemMaterial("aquamarineShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardCarnelian = new ItemMaterial("carnelianShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardCitrine = new ItemMaterial("citrineShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.SUPERRARE);
	public static final ItemMaterial shardDiamond = new ItemMaterial("diamondShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.RARE);
	public static final ItemMaterial shardEmerald = new ItemMaterial("emeraldShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON);
	public static final ItemMaterial shardGarnet = new ItemMaterial("garnetShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardJade = new ItemMaterial("jadeShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardKunzite = new ItemMaterial("kunziteShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardNetherQuartz = new ItemMaterial("netherQuartzShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial shardOnyx = new ItemMaterial("onyxShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.SUPERRARE);
	public static final ItemMaterial shardOpal = new ItemMaterial("opalShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardQuartz = new ItemMaterial("quartzShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardRuby = new ItemMaterial("rubyShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON);
	public static final ItemMaterial shardSapphire = new ItemMaterial("sapphireShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON);
	public static final ItemMaterial shardTopaz = new ItemMaterial("topazShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial shardFyrestone = new ItemMaterial("fyrestoneShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial shardVoidiumRadioactiveFocused = new ItemMaterial("voidiumShardRadioactiveFocused",ModCreativeTabs.pure, "§8You... Broke It? Still, §2RADIOACTIVE", MaterialType.SHARD, MaterialRarity.SUPERRARE, MaterialDimension.END);
	
	public static final ItemMaterial shardObsidian = new ItemMaterial("obsidianShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.RARE);
	
	public static final ItemMaterial shardTrytementium  = new ItemMaterial("trytementiumShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE, MaterialDimension.NETHER);
	public static final ItemMaterial shardUnobtanium  = new ItemMaterial("unobtaniumShard",ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.ULTRARARE, MaterialDimension.NONE);
	
	// Radioactive Materials
	public static final ItemMaterial iridium  = new ItemMaterial("iridium",ModCreativeTabs.item, "§2Radioactive", MaterialType.MISC, MaterialRarity.RARE);
	public static final ItemMaterial plutonium  = new ItemMaterial("plutonium", ModCreativeTabs.item, "§2Radioactive", MaterialType.MISC, MaterialRarity.RARE);
	public static final ItemMaterial uranium  = new ItemMaterial("uranium",ModCreativeTabs.item, "§2Radioactive", MaterialType.MISC, MaterialRarity.AVERAGE);
	
	// Special Materials
	public static final ItemMaterial crymeretye  = new ItemMaterial("crymeretye",ModCreativeTabs.item, "§dIt Feels Warm to the Touch", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial graeconthylynium  = new ItemMaterial("graeconthylynium",ModCreativeTabs.item, "§dIt Feels Slimy and Gooey", MaterialType.MISC, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial muktaphlyte  = new ItemMaterial("muktaphlyte",ModCreativeTabs.item, "§dIt Feels Soft and Malleable", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial jonjronyphyll  = new ItemMaterial("jonjronyphyll",ModCreativeTabs.item, "§dIt Feels Leathery, Almost", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial kraktachnar  = new ItemMaterial("kraktachnar",ModCreativeTabs.item, "§dIt Feels Very Solid", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial schulbradethenairdivite  = new ItemMaterial("schulbradethenairdivite",ModCreativeTabs.item, "§dIt Feels Smooth and Heavy", MaterialType.MISC, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial xaldriodythidyte  = new ItemMaterial("xaldriodythidyte",ModCreativeTabs.item, "§dIt Feels Weightless", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	
	public static final ItemMaterial trytementium  = new ItemMaterial("trytementium",ModCreativeTabs.item, "§aHigh Magical Traces", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.NETHER);
	public static final ItemMaterial unobtanium  = new ItemMaterial("unobtanium",ModCreativeTabs.item, "§5It Looks Strange.", MaterialType.ALLOY, MaterialRarity.ULTRARARE, MaterialDimension.NONE);
	
	// Bands
	public static final ItemBasic goldBand = new ItemBasic("goldBand",ModCreativeTabs.jewelry);
	public static final ItemBasic silverBand = new ItemBasic("silverBand",ModCreativeTabs.jewelry);
	public static final ItemBasic copperBand = new ItemBasic("copperBand",ModCreativeTabs.jewelry);
	
	// Fyrestone Forms
	public static final ItemMaterial fyrestone = new ItemMaterial("fyrestone",ModCreativeTabs.item, "§4Hot Potato, Hot Potato!", MaterialType.MISC, MaterialRarity.COMMON, MaterialDimension.NETHER);
	public static final ItemMaterial fyrestoneStable = new ItemMaterial("fyrestoneStable",ModCreativeTabs.item, "§4Not As Hot To Human Hands Potato!", MaterialType.MISC, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial fyrestoneGem = new ItemMaterial("fyrestoneGem",ModCreativeTabs.item, MaterialType.GEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial fyrestoneCut = new ItemMaterial("fyrestoneCut",ModCreativeTabs.item, MaterialType.CUTGEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	
	// Voidium Forms
	public static final ItemMaterial voidium = new ItemMaterial("voidium",ModCreativeTabs.item, "§8Dangerous", MaterialType.MISC, MaterialRarity.UNCOMMON, MaterialDimension.END);
	public static final ItemMaterial voidiumStable = new ItemMaterial("voidiumStable",ModCreativeTabs.item, "§8Still Very Dangerous", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumRadioactiveFocused = new ItemMaterial("voidiumRadioactiveFocused",ModCreativeTabs.item, "§8And You Made It Into a Gem. *claps* §2RADIOACTIVE", MaterialType.GEM, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumCutRadioactiveFocused = new ItemMaterial("voidiumCutRadioactiveFocused",ModCreativeTabs.item, "§8Now You've Cut It. §2RADIOACTIVE", MaterialType.CUTGEM, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrb = new ItemMaterial("voidiumOrb",ModCreativeTabs.item, "§8Round. But Still Dangerous", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactive = new ItemMaterial("voidiumOrbRadioactive",ModCreativeTabs.item, "§8Great, Now It's §2Radioactive", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactiveFocused = new ItemMaterial("voidiumOrbRadioactiveFocused",ModCreativeTabs.item, "§8MORE §2RADIOACTIVE§0?!", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactiveFocusedCondensed = new ItemMaterial("voidiumOrbRadioactiveFocusedCondensed",ModCreativeTabs.item, "§8Smaller, But Still VERY §2RADIOACTIVE", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactiveFocusedCondensedFragile = new ItemMaterial("voidiumOrbRadioactiveFocusedCondensedFragile",ModCreativeTabs.item, "§8Fragile, Dangerous AND §2Radioactive§0?!", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.END);
	
	// Ylvoltium Forms
	public static final ItemMaterial ylvoltium = new ItemMaterial("ylvoltium",ModCreativeTabs.item, "§ePure Electricty. It's shiny.", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.NONE);
	public static final ItemMaterial ylvoltiumInfused = new ItemMaterial("ylvoltiumInfused",ModCreativeTabs.item, "§ePure Electricty. It's shinier now.", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.NONE);
	public static final ItemMaterial ylvoltiumFocused = new ItemMaterial("ylvoltiumFocused",ModCreativeTabs.item, "§ePurer Electricty. It's shiny.", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.NONE);
	public static final ItemMaterial ylvoltiumFluxed = new ItemMaterial("ylvoltiumFluxed",ModCreativeTabs.item, "§eElectricity Infused Electricty.", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.NONE);
	
	// Colours
	public static final ItemBasic paintbrush = new ItemBasic("paintbrush", ModCreativeTabs.paint, 1);
	public static final ItemPaintbrush paintbrushColoured = new ItemPaintbrush("paintbrushColoured", ModCreativeTabs.paint, 1);
	
	// Food
	public static final ItemBasicFood cherry = new ItemBasicFood("cherry", ModCreativeTabs.food, 2, 2.0f, false);
	public static final ItemBasicFood lemon = new ItemBasicFood("lemon", ModCreativeTabs.food, 3, 2.2f, false);
	public static final ItemBasicFood pear = new ItemBasicFood("pear", ModCreativeTabs.food, 4, 2.5f, false);
	public static final ItemBasicFood mango = new ItemBasicFood("mango", ModCreativeTabs.food, 4, 2.7f, false);
	public static final ItemBanana banana = new ItemBanana("banana", ModCreativeTabs.food, 1, 3, 2.5f);
	public static final ItemBasicSeedFood lettuce = new ItemBasicSeedFood("lettuce", ModCreativeTabs.food, 3, 2.2f, ModBlocksPreItems.lettuceCrop);
	public static final ItemBasicSeedFood tomato = new ItemBasicSeedFood("tomato", ModCreativeTabs.food, 3, 2.2f, ModBlocksPreItems.tomatoCrop);
	public static final ItemBasicFood strawberry = new ItemBasicFood("strawberry", ModCreativeTabs.food, 2, 2.0f, false);
	public static final ItemBasicFood raspberry = new ItemBasicFood("raspberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood blueberry = new ItemBasicFood("blueberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood blackberry = new ItemBasicFood("blackberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood boysenberry = new ItemBasicFood("boysenberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood cranberry = new ItemBasicFood("cranberry", ModCreativeTabs.food, 1, 2.0f, false);
	public static final ItemBasicFood cherryPie = new ItemBasicFood("cherryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood lemonTart = new ItemBasicFood("lemonTart", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood applePie = new ItemBasicFood("applePie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood blackberryPie = new ItemBasicFood("blackberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood raspberryPie = new ItemBasicFood("raspberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood blueberryPie = new ItemBasicFood("blueberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood pearPie = new ItemBasicFood("pearPie", ModCreativeTabs.food, 8, 4.8f, false);
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
	public static final ItemBasicFood mangoSmoothie = new ItemBasicFood("mangoSmoothie", ModCreativeTabs.food, 1, 5, 2.5f, false, true);
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
		GameRegistry.registerItem(dustGraeconthylynium, dustGraeconthylynium.getUnlocalizedName());
		GameRegistry.registerItem(dustMuktaphlyte, dustMuktaphlyte.getUnlocalizedName());
		GameRegistry.registerItem(dustJonjronyphyll, dustJonjronyphyll.getUnlocalizedName());
		GameRegistry.registerItem(dustKraktachnar, dustKraktachnar.getUnlocalizedName());
		GameRegistry.registerItem(dustSchulbradethenairdivite, dustSchulbradethenairdivite.getUnlocalizedName());
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
		GameRegistry.registerItem(clusterGraeconthylynium, clusterGraeconthylynium.getUnlocalizedName());
		GameRegistry.registerItem(clusterMuktaphlyte, clusterMuktaphlyte.getUnlocalizedName());
		GameRegistry.registerItem(clusterJonjronyphyll, clusterJonjronyphyll.getUnlocalizedName());
		GameRegistry.registerItem(clusterKraktachnar, clusterKraktachnar.getUnlocalizedName());
		GameRegistry.registerItem(clusterSchulbradethenairdivite, clusterSchulbradethenairdivite.getUnlocalizedName());
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
		Register.registerMaterial(schulbradethenairdivite, schulbradethenairdivite.getUnlocalizedName());
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
		GameRegistry.registerItem(pear, pear.getUnlocalizedName());
		GameRegistry.registerItem(mango, mango.getUnlocalizedName());
		GameRegistry.registerItem(banana, banana.getUnlocalizedName());
		GameRegistry.registerItem(lettuce, lettuce.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerItem(raspberry, raspberry.getUnlocalizedName());
		GameRegistry.registerItem(blueberry, blueberry.getUnlocalizedName());
		GameRegistry.registerItem(blackberry, blackberry.getUnlocalizedName());
		GameRegistry.registerItem(boysenberry, boysenberry.getUnlocalizedName());
		GameRegistry.registerItem(cranberry, cranberry.getUnlocalizedName());
		GameRegistry.registerItem(cherryPie, cherryPie.getUnlocalizedName());
		GameRegistry.registerItem(lemonTart, lemonTart.getUnlocalizedName());
		GameRegistry.registerItem(applePie, applePie.getUnlocalizedName());
		GameRegistry.registerItem(blackberryPie, blackberryPie.getUnlocalizedName());
		GameRegistry.registerItem(raspberryPie, raspberryPie.getUnlocalizedName());
		GameRegistry.registerItem(blueberryPie, blueberryPie.getUnlocalizedName());
		GameRegistry.registerItem(pearPie, pearPie.getUnlocalizedName());
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
		GameRegistry.registerItem(mangoSmoothie, mangoSmoothie.getUnlocalizedName());
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
