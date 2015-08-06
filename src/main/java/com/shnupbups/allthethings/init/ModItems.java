package com.shnupbups.allthethings.init;

import net.minecraft.init.Items;
import net.minecraft.util.EnumChatFormatting;

import com.shnupbups.allthethings.item.ItemAgitator;
import com.shnupbups.allthethings.item.ItemBackpack;
import com.shnupbups.allthethings.item.ItemBanana;
import com.shnupbups.allthethings.item.ItemBasic;
import com.shnupbups.allthethings.item.ItemBasicCake;
import com.shnupbups.allthethings.item.ItemBasicFood;
import com.shnupbups.allthethings.item.ItemBasicSeedFood;
import com.shnupbups.allthethings.item.ItemBucketDrink;
import com.shnupbups.allthethings.item.ItemDebugger;
import com.shnupbups.allthethings.item.ItemEssence;
import com.shnupbups.allthethings.item.ItemFossil;
import com.shnupbups.allthethings.item.ItemKnife;
import com.shnupbups.allthethings.item.ItemLyekstone;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.ItemPaintball;
import com.shnupbups.allthethings.item.ItemPaintballGun;
import com.shnupbups.allthethings.item.ItemPaintbrush;
import com.shnupbups.allthethings.item.ItemRemote;
import com.shnupbups.allthethings.item.ItemUpgrade;
import com.shnupbups.allthethings.item.ItemWrench;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.itemblocks.ItemBlockSign;
import com.shnupbups.allthethings.utility.Register;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	//Signs
	public static final ItemBlockSign ironSign = new ItemBlockSign("ironSignItem", ModCreativeTabs.block, 16, ModBlocksPreItems.ironSign, ModBlocksPreItems.ironSignWall);
	public static final ItemBlockSign copperSign = new ItemBlockSign("copperSignItem", ModCreativeTabs.block, 16, ModBlocksPreItems.copperSign, ModBlocksPreItems.copperSignWall);
	public static final ItemBlockSign goldSign = new ItemBlockSign("goldSignItem", ModCreativeTabs.block, 16, ModBlocksPreItems.goldSign, ModBlocksPreItems.goldSignWall);
	public static final ItemBlockSign silverSign = new ItemBlockSign("silverSignItem", ModCreativeTabs.block, 16, ModBlocksPreItems.silverSign, ModBlocksPreItems.silverSignWall);

	// Ingots
	public static final ItemMaterial ingotAdamanite = new ItemMaterial("ingotAdamanite", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotAdamant = new ItemMaterial("ingotAdamant", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotAluminium = new ItemMaterial("ingotAluminium", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotBlurite = new ItemMaterial("ingotBlurite", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotBrass = new ItemMaterial("ingotBrass", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotBronze = new ItemMaterial("ingotBronze", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotChromium = new ItemMaterial("ingotChromium", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotCobalt = new ItemMaterial("ingotCobalt", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotCopper = new ItemMaterial("ingotCopper", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.EVERYWHERE);
	public static final ItemMaterial ingotDaeyalt = new ItemMaterial("ingotDaeyalt", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotElectrum = new ItemMaterial("ingotElectrum", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotGoloid = new ItemMaterial("ingotGoloid", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotInvar = new ItemMaterial("ingotInvar", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotLead = new ItemMaterial("ingotLead", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotLunar = new ItemMaterial("ingotLunar", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotMalagnite = new ItemMaterial("ingotMalagnite", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.RARE);
	public static final ItemMaterial ingotManganese = new ItemMaterial("ingotManganese", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotMithril = new ItemMaterial("ingotMithril", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotNickel = new ItemMaterial("ingotNickel", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotPlatinum = new ItemMaterial("ingotPlatinum", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotRhodium = new ItemMaterial("ingotRhodium", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotRubium = new ItemMaterial("ingotRubium", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotRunite = new ItemMaterial("ingotRunite", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotSilicon = new ItemMaterial("ingotSilicon", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotSilver = new ItemMaterial("ingotSilver", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotSolder = new ItemMaterial("ingotSolder", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotSteel = new ItemMaterial("ingotSteel", ModCreativeTabs.item, MaterialType.ALLOY, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotTin = new ItemMaterial("ingotTin", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.UNCOMMON);
	public static final ItemMaterial ingotTitanium = new ItemMaterial("ingotTitanium", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotTungsten = new ItemMaterial("ingotTungsten", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);
	public static final ItemMaterial ingotZinc = new ItemMaterial("ingotZinc", ModCreativeTabs.item, MaterialType.INGOT, MaterialRarity.AVERAGE);

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

	public static final ItemMaterial gemObsidian = new ItemMaterial("gemObsidian", MaterialType.GEM, MaterialRarity.RARE);

	// Dusts
	public static final ItemMaterial dustAdamanite = new ItemMaterial("dustAdamanite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xAE6082);
	public static final ItemMaterial dustAdamant = new ItemMaterial("dustAdamant", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xFFAE9C);
	public static final ItemMaterial dustAluminium = new ItemMaterial("dustAluminium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0xA4A8AB);
	public static final ItemMaterial dustBlurite = new ItemMaterial("dustBlurite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x64868E);
	public static final ItemMaterial dustBrass = new ItemMaterial("dustBrass", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x9A822C);
	public static final ItemMaterial dustBronze = new ItemMaterial("dustBronze", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xA56600);
	public static final ItemMaterial dustChromium = new ItemMaterial("dustChromium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xFCFCFC);
	public static final ItemMaterial dustCobalt = new ItemMaterial("dustCobalt", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x364664);
	public static final ItemMaterial dustCopper = new ItemMaterial("dustCopper", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.EVERYWHERE, 0xAA6011);
	public static final ItemMaterial dustDaeyalt = new ItemMaterial("dustDaeyalt", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xCDB6CD);
	public static final ItemMaterial dustElectrum = new ItemMaterial("dustElectrum", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xE1D45C);
	public static final ItemMaterial dustGold = new ItemMaterial("dustGold", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0xFCEE4B);
	public static final ItemMaterial dustGoloid = new ItemMaterial("dustGoloid", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xF7CF1E);
	public static final ItemMaterial dustInvar = new ItemMaterial("dustInvar", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x88877C);
	public static final ItemMaterial dustIron = new ItemMaterial("dustIron", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.EVERYWHERE, 0xE2C0AA);
	public static final ItemMaterial dustLead = new ItemMaterial("dustLead", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0x353047);
	public static final ItemMaterial dustLunar = new ItemMaterial("dustLunar", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xDBEADB);
	public static final ItemMaterial dustMalagnite = new ItemMaterial("dustMalagnite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.RARE, 0x762DC9);
	public static final ItemMaterial dustManganese = new ItemMaterial("dustManganese", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xB1A7A9);
	public static final ItemMaterial dustMithril = new ItemMaterial("dustMithril", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xCAD7D8);
	public static final ItemMaterial dustNickel = new ItemMaterial("dustNickel", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0x6F7671);
	public static final ItemMaterial dustPlatinum = new ItemMaterial("dustPlatinum", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xCCCBC0);
	public static final ItemMaterial dustRhodium = new ItemMaterial("dustRhodium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xDFDFDF);
	public static final ItemMaterial dustRubium = new ItemMaterial("dustRubium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xCC6363);
	public static final ItemMaterial dustRunite = new ItemMaterial("dustRunite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xABBAC3);
	public static final ItemMaterial dustSilicon = new ItemMaterial("dustSilicon", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xC6C6C6);
	public static final ItemMaterial dustSilver = new ItemMaterial("dustSilver", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0xFFFFFF);
	public static final ItemMaterial dustSolder = new ItemMaterial("dustSolder", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xD2CFD6);
	public static final ItemMaterial dustSteel = new ItemMaterial("dustSteel", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x8C8C8C);
	public static final ItemMaterial dustTin = new ItemMaterial("dustTin", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0xD3C9CB);
	public static final ItemMaterial dustTitanium = new ItemMaterial("dustTitanium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xA9A9A9);
	public static final ItemMaterial dustTungsten = new ItemMaterial("dustTungsten", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x686C73);
	public static final ItemMaterial dustZinc = new ItemMaterial("dustZinc", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x88887F);
	
	public static final ItemMaterial dustAmazonite = new ItemMaterial("dustAmazonite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x008F61);
	public static final ItemMaterial dustAmber = new ItemMaterial("dustAmber", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xDC8C1F);
	public static final ItemMaterial dustAmethyst = new ItemMaterial("dustAmethyst", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xCC17DD);
	public static final ItemMaterial dustAquamarine = new ItemMaterial("dustAquamarine", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x81E8DC);
	public static final ItemMaterial dustCarnelian = new ItemMaterial("dustCarnelian", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xE36543);
	public static final ItemMaterial dustCitrine = new ItemMaterial("dustCitrine", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.SUPERRARE, 0xDDD917);
	public static final ItemMaterial dustDiamond = new ItemMaterial("dustDiamond", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.RARE, 0x5DECF5);
	public static final ItemMaterial dustEmerald = new ItemMaterial("dustEmerald", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0x17DD62);
	public static final ItemMaterial dustGarnet = new ItemMaterial("dustGarnet", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x942400);
	public static final ItemMaterial dustJade = new ItemMaterial("dustJade", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xDD17C0);
	public static final ItemMaterial dustKunzite = new ItemMaterial("dustKunzite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xEC9FA0);
	public static final ItemMaterial dustNetherQuartz = new ItemMaterial("dustNetherQuartz", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0xDDCBBE, MaterialDimension.NETHER);
	public static final ItemMaterial dustOnyx = new ItemMaterial("dustOnyx", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.SUPERRARE, 0x3D3D3D);
	public static final ItemMaterial dustOpal = new ItemMaterial("dustOpal", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xBEC4BA);
	public static final ItemMaterial dustQuartz = new ItemMaterial("dustQuartz", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xB7B0AA);
	public static final ItemMaterial dustRuby = new ItemMaterial("dustRuby", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0xDD2317);
	public static final ItemMaterial dustSapphire = new ItemMaterial("dustSapphire", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0x1740DD);
	public static final ItemMaterial dustTopaz = new ItemMaterial("dustTopaz", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xD97700);
	
	public static final ItemMaterial dustVoidium = new ItemMaterial("dustVoidium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0x0F0F0F, MaterialDimension.END);
	public static final ItemMaterial dustFyrestone = new ItemMaterial("dustFyrestone", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.COMMON, 0xCC7A00, MaterialDimension.NETHER);
	
	public static final ItemMaterial dustIridium = new ItemMaterial("dustIridium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.RARE, 0xDDDDDD);
	public static final ItemMaterial dustPlutonium = new ItemMaterial("dustPlutonium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.RARE, 0xB1AA94);
	public static final ItemMaterial dustUranium = new ItemMaterial("dustUranium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x18BF12);
	
	public static final ItemMaterial dustCrymeretye = new ItemMaterial("dustCrymeretye", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0xFF81A8, MaterialDimension.USTHER);
	public static final ItemMaterial dustGraeconthylynium  = new ItemMaterial("dustGraeconthylynium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.COMMON, 0x454C7D, MaterialDimension.USTHER);
	public static final ItemMaterial dustMuktaphlyte  = new ItemMaterial("dustMuktaphlyte", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x943547, MaterialDimension.USTHER);
	public static final ItemMaterial dustJonjronyphyll  = new ItemMaterial("dustJonjronyphyll", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x807409, MaterialDimension.USTHER);
	public static final ItemMaterial dustKraktachnar  = new ItemMaterial("dustKraktachnar", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x005655, MaterialDimension.USTHER);
	public static final ItemMaterial dustSchulbradethenairdivite  = new ItemMaterial("dustSchulbradethenairdivite", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.COMMON, 0xC37546, MaterialDimension.USTHER);
	public static final ItemMaterial dustXaldriodythidyte  = new ItemMaterial("dustXaldriodythidyte", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x6F0037, MaterialDimension.USTHER);
	
	public static final ItemMaterial dustTrytementium = new ItemMaterial("dustTrytementium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.AVERAGE, 0x67AF00, MaterialDimension.NETHER);
	public static final ItemMaterial dustUnobtanium = new ItemMaterial("dustUnobtanium", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.ULTRARARE, 0xF17E4A, MaterialDimension.NONE);
	
	public static final ItemMaterial dustCoal = new ItemMaterial("dustCoal", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.EVERYWHERE, 0x373737);
	public static final ItemMaterial dustLapis = new ItemMaterial("dustLapis", ModCreativeTabs.dust, MaterialType.DUST, MaterialRarity.UNCOMMON, 0x183DC0);
	
	// Clusters
	public static final ItemMaterial clusterAdamanite = new ItemMaterial("clusterAdamanite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xAE6082);
	public static final ItemMaterial clusterAdamant = new ItemMaterial("clusterAdamant", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xFFAE9C);
	public static final ItemMaterial clusterAluminium = new ItemMaterial("clusterAluminium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0xA4A8AB);
	public static final ItemMaterial clusterBlurite = new ItemMaterial("clusterBlurite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x64868E);
	public static final ItemMaterial clusterBrass = new ItemMaterial("clusterBrass", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x9A822C);
	public static final ItemMaterial clusterBronze = new ItemMaterial("clusterBronze", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xA56600);
	public static final ItemMaterial clusterChromium = new ItemMaterial("clusterChromium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xFCFCFC);
	public static final ItemMaterial clusterCobalt = new ItemMaterial("clusterCobalt", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x364664);
	public static final ItemMaterial clusterCopper = new ItemMaterial("clusterCopper", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.EVERYWHERE, 0xAA6011);
	public static final ItemMaterial clusterDaeyalt = new ItemMaterial("clusterDaeyalt", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xCDB6CD);
	public static final ItemMaterial clusterElectrum = new ItemMaterial("clusterElectrum", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xE1D45C);
	public static final ItemMaterial clusterGold = new ItemMaterial("clusterGold", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0xFCEE4B);
	public static final ItemMaterial clusterGoloid = new ItemMaterial("clusterGoloid", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xF7CF1E);
	public static final ItemMaterial clusterInvar = new ItemMaterial("clusterInvar", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x88877C);
	public static final ItemMaterial clusterIron = new ItemMaterial("clusterIron", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.EVERYWHERE, 0xE2C0AA);
	public static final ItemMaterial clusterLead = new ItemMaterial("clusterLead", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0x353047);
	public static final ItemMaterial clusterLunar = new ItemMaterial("clusterLunar", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xDBEADB);
	public static final ItemMaterial clusterMalagnite = new ItemMaterial("clusterMalagnite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.RARE, 0x762DC9);
	public static final ItemMaterial clusterManganese = new ItemMaterial("clusterManganese", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xB1A7A9);
	public static final ItemMaterial clusterMithril = new ItemMaterial("clusterMithril", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xCAD7D8);
	public static final ItemMaterial clusterNickel = new ItemMaterial("clusterNickel", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0x6F7671);
	public static final ItemMaterial clusterPlatinum = new ItemMaterial("clusterPlatinum", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xCCCBC0);
	public static final ItemMaterial clusterRhodium = new ItemMaterial("clusterRhodium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xDFDFDF);
	public static final ItemMaterial clusterRubium = new ItemMaterial("clusterRubium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xCC6363);
	public static final ItemMaterial clusterRunite = new ItemMaterial("clusterRunite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xABBAC3);
	public static final ItemMaterial clusterSilicon = new ItemMaterial("clusterSilicon", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xC6C6C6);
	public static final ItemMaterial clusterSilver = new ItemMaterial("clusterSilver", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0xFFFFFF);
	public static final ItemMaterial clusterSolder = new ItemMaterial("clusterSolder", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xD2CFD6);
	public static final ItemMaterial clusterSteel = new ItemMaterial("clusterSteel", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x8C8C8C);
	public static final ItemMaterial clusterTin = new ItemMaterial("clusterTin", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0xD3C9CB);
	public static final ItemMaterial clusterTitanium = new ItemMaterial("clusterTitanium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xA9A9A9);
	public static final ItemMaterial clusterTungsten = new ItemMaterial("clusterTungsten", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x686C73);
	public static final ItemMaterial clusterZinc = new ItemMaterial("clusterZinc", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x88887F);
	
	public static final ItemMaterial clusterAmazonite = new ItemMaterial("clusterAmazonite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x008F61);
	public static final ItemMaterial clusterAmber = new ItemMaterial("clusterAmber", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xDC8C1F);
	public static final ItemMaterial clusterAmethyst = new ItemMaterial("clusterAmethyst", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xCC17DD);
	public static final ItemMaterial clusterAquamarine = new ItemMaterial("clusterAquamarine", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x81E8DC);
	public static final ItemMaterial clusterCarnelian = new ItemMaterial("clusterCarnelian", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xE36543);
	public static final ItemMaterial clusterCitrine = new ItemMaterial("clusterCitrine", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.SUPERRARE, 0xDDD917);
	public static final ItemMaterial clusterDiamond = new ItemMaterial("clusterDiamond", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.RARE, 0x5DECF5);
	public static final ItemMaterial clusterEmerald = new ItemMaterial("clusterEmerald", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0x17DD62);
	public static final ItemMaterial clusterGarnet = new ItemMaterial("clusterGarnet", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x942400);
	public static final ItemMaterial clusterJade = new ItemMaterial("clusterJade", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xDD17C0);
	public static final ItemMaterial clusterKunzite = new ItemMaterial("clusterKunzite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xEC9FA0);
	public static final ItemMaterial clusterNetherQuartz = new ItemMaterial("clusterNetherQuartz", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0xDDCBBE, MaterialDimension.NETHER);
	public static final ItemMaterial clusterOnyx = new ItemMaterial("clusterOnyx", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.SUPERRARE, 0x3D3D3D);
	public static final ItemMaterial clusterOpal = new ItemMaterial("clusterOpal", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xBEC4BA);
	public static final ItemMaterial clusterQuartz = new ItemMaterial("clusterQuartz", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xB7B0AA);
	public static final ItemMaterial clusterRuby = new ItemMaterial("clusterRuby", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0xDD2317);
	public static final ItemMaterial clusterSapphire = new ItemMaterial("clusterSapphire", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0x1740DD);
	public static final ItemMaterial clusterTopaz = new ItemMaterial("clusterTopaz", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xD97700);
	
	public static final ItemMaterial clusterVoidium = new ItemMaterial("clusterVoidium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0x0F0F0F, MaterialDimension.END);
	public static final ItemMaterial clusterFyrestone = new ItemMaterial("clusterFyrestone", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.COMMON, 0xCC7A00, MaterialDimension.NETHER);
	
	public static final ItemMaterial clusterIridium = new ItemMaterial("clusterIridium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.RARE, 0xDDDDDD);
	public static final ItemMaterial clusterPlutonium = new ItemMaterial("clusterPlutonium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.RARE, 0xB1AA94);
	public static final ItemMaterial clusterUranium = new ItemMaterial("clusterUranium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x18BF12);
	
	public static final ItemMaterial clusterCrymeretye = new ItemMaterial("clusterCrymeretye", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0xFF81A8, MaterialDimension.USTHER);
	public static final ItemMaterial clusterGraeconthylynium = new ItemMaterial("clusterGraeconthylynium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.COMMON, 0x454C7D, MaterialDimension.USTHER);
	public static final ItemMaterial clusterMuktaphlyte = new ItemMaterial("clusterMuktaphlyte", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x943547, MaterialDimension.USTHER);
	public static final ItemMaterial clusterJonjronyphyll = new ItemMaterial("clusterJonjronyphyll", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x807409, MaterialDimension.USTHER);
	public static final ItemMaterial clusterKraktachnar = new ItemMaterial("clusterKraktachnar", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x005655, MaterialDimension.USTHER);
	public static final ItemMaterial clusterSchulbradethenairdivite = new ItemMaterial("clusterSchulbradethenairdivite", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.COMMON, 0xC37546, MaterialDimension.USTHER);
	public static final ItemMaterial clusterXaldriodythidyte = new ItemMaterial("clusterXaldriodythidyte", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x6F0037, MaterialDimension.USTHER);
	
	public static final ItemMaterial clusterTrytementium = new ItemMaterial("clusterTrytementium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.AVERAGE, 0x67AF00, MaterialDimension.NETHER);
	public static final ItemMaterial clusterUnobtanium = new ItemMaterial("clusterUnobtanium", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.ULTRARARE, 0xF17E4A, MaterialDimension.NONE);
	
	public static final ItemMaterial clusterCoal = new ItemMaterial("clusterCoal", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.EVERYWHERE, 0x373737);
	public static final ItemMaterial clusterLapis = new ItemMaterial("clusterLapis", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.UNCOMMON, 0x183DC0);
	public static final ItemMaterial clusterRedstone = new ItemMaterial("clusterRedstone", ModCreativeTabs.dust, MaterialType.CLUSTER, MaterialRarity.COMMON, 0xB80505);
	
	// Plates
    public static final ItemMaterial plateAdamanite = new ItemMaterial("plateAdamanite", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xAE6082);
    public static final ItemMaterial plateAdamant = new ItemMaterial("plateAdamant", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xFFAE9C);
    public static final ItemMaterial plateAluminium = new ItemMaterial("plateAluminium", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.UNCOMMON, 0xA4A8AB);
    public static final ItemMaterial plateBlurite = new ItemMaterial("plateBlurite", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x64868E);
    public static final ItemMaterial plateBrass = new ItemMaterial("plateBrass", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x9A822C);
    public static final ItemMaterial plateBronze = new ItemMaterial("plateBronze", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xA56600);
    public static final ItemMaterial plateChromium = new ItemMaterial("plateChromium", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xFCFCFC);
    public static final ItemMaterial plateCobalt = new ItemMaterial("plateCobalt", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x364664);
    public static final ItemMaterial plateCopper = new ItemMaterial("plateCopper", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.EVERYWHERE, 0xAA6011);
    public static final ItemMaterial plateDaeyalt = new ItemMaterial("plateDaeyalt", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xCDB6CD);
    public static final ItemMaterial plateElectrum = new ItemMaterial("plateElectrum", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xE1D45C);
    public static final ItemMaterial plateGold = new ItemMaterial("plateGold", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.UNCOMMON);
    public static final ItemMaterial plateGoloid = new ItemMaterial("plateGoloid", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xF7CF1E);
    public static final ItemMaterial plateInvar = new ItemMaterial("plateInvar", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x88877C);
    public static final ItemMaterial plateIron = new ItemMaterial("plateIron", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.EVERYWHERE);
    public static final ItemMaterial plateLead = new ItemMaterial("plateLead", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.UNCOMMON, 0x353047);
    public static final ItemMaterial plateLunar = new ItemMaterial("plateLunar", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xDBEADB);
    public static final ItemMaterial plateMalagnite = new ItemMaterial("plateMalagnite", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.RARE, 0x762DC9);
    public static final ItemMaterial plateManganese = new ItemMaterial("plateManganese", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xB1A7A9);
    public static final ItemMaterial plateMithril = new ItemMaterial("plateMithril", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xCAD7D8);
    public static final ItemMaterial plateNickel = new ItemMaterial("plateNickel", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.UNCOMMON, 0x6F7671);
    public static final ItemMaterial plateObsidian = new ItemMaterial("plateObsidian", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.RARE);
    public static final ItemMaterial platePlatinum = new ItemMaterial("platePlatinum", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xCCCBC0);
    public static final ItemMaterial plateRhodium = new ItemMaterial("plateRhodium", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xDFDFDF);
    public static final ItemMaterial plateRubium = new ItemMaterial("plateRubium", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xCC6363);
    public static final ItemMaterial plateRunite = new ItemMaterial("plateRunite", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xABBAC3);
    public static final ItemMaterial plateSilicon = new ItemMaterial("plateSilicon", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xC6C6C6);
    public static final ItemMaterial plateSilver = new ItemMaterial("plateSilver", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.UNCOMMON, 0xFFFFFF);
    public static final ItemMaterial plateSolder = new ItemMaterial("plateSolder", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xD2CFD6);
    public static final ItemMaterial plateSteel = new ItemMaterial("plateSteel", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x8C8C8C);
    public static final ItemMaterial plateTin = new ItemMaterial("plateTin", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.UNCOMMON, 0xD3C9CB);
    public static final ItemMaterial plateTitanium = new ItemMaterial("plateTitanium", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0xA9A9A9);
    public static final ItemMaterial plateTungsten = new ItemMaterial("plateTungsten", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x686C73);
    public static final ItemMaterial plateZinc = new ItemMaterial("plateZinc", ModCreativeTabs.plate, MaterialType.PLATE, MaterialRarity.AVERAGE, 0x88887F);
	
	// Nuggets
    public static final ItemMaterial nuggetAdamanite = new ItemMaterial("nuggetAdamanite", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xAE6082);
    public static final ItemMaterial nuggetAdamant = new ItemMaterial("nuggetAdamant", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xFFAE9C);
    public static final ItemMaterial nuggetAluminium = new ItemMaterial("nuggetAluminium", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.UNCOMMON, 0xA4A8AB);
    public static final ItemMaterial nuggetBlurite = new ItemMaterial("nuggetBlurite", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x64868E);
    public static final ItemMaterial nuggetBrass = new ItemMaterial("nuggetBrass", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x9A822C);
    public static final ItemMaterial nuggetBronze = new ItemMaterial("nuggetBronze", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xA56600);
    public static final ItemMaterial nuggetChromium = new ItemMaterial("nuggetChromium", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xFCFCFC);
    public static final ItemMaterial nuggetCobalt = new ItemMaterial("nuggetCobalt", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x364664);
    public static final ItemMaterial nuggetCopper = new ItemMaterial("nuggetCopper", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.EVERYWHERE, 0xAA6011);
    public static final ItemMaterial nuggetDaeyalt = new ItemMaterial("nuggetDaeyalt", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xCDB6CD);
    public static final ItemMaterial nuggetElectrum = new ItemMaterial("nuggetElectrum", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xE1D45C);
    public static final ItemMaterial nuggetGoloid = new ItemMaterial("nuggetGoloid", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xF7CF1E);
    public static final ItemMaterial nuggetInvar = new ItemMaterial("nuggetInvar", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x88877C);
    public static final ItemMaterial nuggetIron = new ItemMaterial("nuggetIron", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.EVERYWHERE, 0xEEEEEE);
    public static final ItemMaterial nuggetLead = new ItemMaterial("nuggetLead", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.UNCOMMON, 0x353047);
    public static final ItemMaterial nuggetLunar = new ItemMaterial("nuggetLunar", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xDBEADB);
    public static final ItemMaterial nuggetMalagnite = new ItemMaterial("nuggetMalagnite", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.RARE, 0x762DC9);
    public static final ItemMaterial nuggetManganese = new ItemMaterial("nuggetManganese", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xB1A7A9);
    public static final ItemMaterial nuggetMithril = new ItemMaterial("nuggetMithril", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xCAD7D8);
    public static final ItemMaterial nuggetNickel = new ItemMaterial("nuggetNickel", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.UNCOMMON, 0x6F7671);
    public static final ItemMaterial nuggetPlatinum = new ItemMaterial("nuggetPlatinum", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xCCCBC0);
    public static final ItemMaterial nuggetRhodium = new ItemMaterial("nuggetRhodium", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xDFDFDF);
    public static final ItemMaterial nuggetRubium = new ItemMaterial("nuggetRubium", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xCC6363);
    public static final ItemMaterial nuggetRunite = new ItemMaterial("nuggetRunite", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xABBAC3);
    public static final ItemMaterial nuggetSilicon = new ItemMaterial("nuggetSilicon", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xC6C6C6);
    public static final ItemMaterial nuggetSilver = new ItemMaterial("nuggetSilver", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.UNCOMMON, 0xFFFFFF);
    public static final ItemMaterial nuggetSolder = new ItemMaterial("nuggetSolder", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xD2CFD6);
    public static final ItemMaterial nuggetSteel = new ItemMaterial("nuggetSteel", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x8C8C8C);
    public static final ItemMaterial nuggetTin = new ItemMaterial("nuggetTin", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.UNCOMMON, 0xD3C9CB);
    public static final ItemMaterial nuggetTitanium = new ItemMaterial("nuggetTitanium", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0xA9A9A9);
    public static final ItemMaterial nuggetTungsten = new ItemMaterial("nuggetTungsten", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x686C73);
    public static final ItemMaterial nuggetZinc = new ItemMaterial("nuggetZinc", ModCreativeTabs.plate, MaterialType.NUGGET, MaterialRarity.AVERAGE, 0x88887F);

	// Pure Stuff
	public static final ItemMaterial gemPureAmazonite = new ItemMaterial("amazonitePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureAmber = new ItemMaterial("amberPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureAmethyst = new ItemMaterial("amethystPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureAquamarine = new ItemMaterial("aquamarinePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureCarnelian = new ItemMaterial("carnelianPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureCitrine = new ItemMaterial("citrinePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.SUPERRARE);
	public static final ItemMaterial gemPureDiamond = new ItemMaterial("diamondPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.RARE);
	public static final ItemMaterial gemPureEmerald = new ItemMaterial("emeraldPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemPureGarnet = new ItemMaterial("garnetPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureJade = new ItemMaterial("jadePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureKunzite = new ItemMaterial("kunzitePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureNetherQuartz = new ItemMaterial("netherQuartzPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial gemPureOnyx = new ItemMaterial("onyxPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.SUPERRARE);
	public static final ItemMaterial gemPureOpal = new ItemMaterial("opalPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureQuartz = new ItemMaterial("quartzPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	public static final ItemMaterial gemPureRuby = new ItemMaterial("rubyPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemPureSapphire = new ItemMaterial("sapphirePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON);
	public static final ItemMaterial gemPureTopaz = new ItemMaterial("topazPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial gemPureFyrestone = new ItemMaterial("fyrestonePure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial gemPureVoidiumRadioactiveFocused = new ItemMaterial("voidiumPureRadioactiveFocused", ModCreativeTabs.pure, EnumChatFormatting.DARK_RED+"And You Purified the Gem. "+EnumChatFormatting.DARK_GREEN+"RADIOACTIVE", MaterialType.PUREGEM, MaterialRarity.SUPERRARE, MaterialDimension.END);
	
	public static final ItemMaterial gemPureObsidian = new ItemMaterial("obsidianPure", ModCreativeTabs.pure, MaterialType.PUREGEM, MaterialRarity.RARE);
	
	// Shards
	public static final ItemMaterial shardAmazonite = new ItemMaterial("amazoniteShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardAmber = new ItemMaterial("amberShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardAmethyst = new ItemMaterial("amethystShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardAquamarine = new ItemMaterial("aquamarineShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardCarnelian = new ItemMaterial("carnelianShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardCitrine = new ItemMaterial("citrineShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.SUPERRARE);
	public static final ItemMaterial shardDiamond = new ItemMaterial("diamondShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.RARE);
	public static final ItemMaterial shardEmerald = new ItemMaterial("emeraldShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON);
	public static final ItemMaterial shardGarnet = new ItemMaterial("garnetShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardJade = new ItemMaterial("jadeShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardKunzite = new ItemMaterial("kunziteShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardNetherQuartz = new ItemMaterial("netherQuartzShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial shardOnyx = new ItemMaterial("onyxShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.SUPERRARE);
	public static final ItemMaterial shardOpal = new ItemMaterial("opalShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardQuartz = new ItemMaterial("quartzShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	public static final ItemMaterial shardRuby = new ItemMaterial("rubyShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON);
	public static final ItemMaterial shardSapphire = new ItemMaterial("sapphireShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON);
	public static final ItemMaterial shardTopaz = new ItemMaterial("topazShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE);
	
	public static final ItemMaterial shardFyrestone = new ItemMaterial("fyrestoneShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial shardVoidiumRadioactiveFocused = new ItemMaterial("voidiumShardRadioactiveFocused", ModCreativeTabs.pure, EnumChatFormatting.DARK_RED+"You... Broke It? Still, "+EnumChatFormatting.DARK_GREEN+"RADIOACTIVE", MaterialType.SHARD, MaterialRarity.SUPERRARE, MaterialDimension.END);
	
	public static final ItemMaterial shardObsidian = new ItemMaterial("obsidianShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.RARE);
	
	public static final ItemMaterial shardTrytementium  = new ItemMaterial("trytementiumShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.AVERAGE, MaterialDimension.NETHER);
	public static final ItemMaterial shardUnobtanium  = new ItemMaterial("unobtaniumShard", ModCreativeTabs.pure, MaterialType.SHARD, MaterialRarity.ULTRARARE, MaterialDimension.NONE);
	
	// Gears
	public static final ItemMaterial gearAdamanite = new ItemMaterial("gearAdamanite", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xAE6082);
    public static final ItemMaterial gearAdamant = new ItemMaterial("gearAdamant", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xFFAE9C);
    public static final ItemMaterial gearAluminium = new ItemMaterial("gearAluminium", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.UNCOMMON, 0xA4A8AB);
    public static final ItemMaterial gearBlurite = new ItemMaterial("gearBlurite", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x64868E);
    public static final ItemMaterial gearBrass = new ItemMaterial("gearBrass", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x9A822C);
    public static final ItemMaterial gearBronze = new ItemMaterial("gearBronze", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xA56600);
    public static final ItemMaterial gearChromium = new ItemMaterial("gearChromium", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xFCFCFC);
    public static final ItemMaterial gearCobalt = new ItemMaterial("gearCobalt", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x364664);
    public static final ItemMaterial gearCopper = new ItemMaterial("gearCopper", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.EVERYWHERE, 0xAA6011);
    public static final ItemMaterial gearDaeyalt = new ItemMaterial("gearDaeyalt", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xCDB6CD);
    public static final ItemMaterial gearElectrum = new ItemMaterial("gearElectrum", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xE1D45C);
    public static final ItemMaterial gearGold = new ItemMaterial("gearGold", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.UNCOMMON, 0xFCEE4B);
    public static final ItemMaterial gearGoloid = new ItemMaterial("gearGoloid", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xF7CF1E);
    public static final ItemMaterial gearInvar = new ItemMaterial("gearInvar", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x88877C);
    public static final ItemMaterial gearIron = new ItemMaterial("gearIron", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.EVERYWHERE, 0xEEEEEE);
    public static final ItemMaterial gearLead = new ItemMaterial("gearLead", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.UNCOMMON, 0x353047);
    public static final ItemMaterial gearLunar = new ItemMaterial("gearLunar", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xDBEADB);
    public static final ItemMaterial gearMalagnite = new ItemMaterial("gearMalagnite", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.RARE, 0x762DC9);
    public static final ItemMaterial gearManganese = new ItemMaterial("gearManganese", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xB1A7A9);
    public static final ItemMaterial gearMithril = new ItemMaterial("gearMithril", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xCAD7D8);
    public static final ItemMaterial gearNickel = new ItemMaterial("gearNickel", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.UNCOMMON, 0x6F7671);
    public static final ItemMaterial gearPlatinum = new ItemMaterial("gearPlatinum", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xCCCBC0);
    public static final ItemMaterial gearRhodium = new ItemMaterial("gearRhodium", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xDFDFDF);
    public static final ItemMaterial gearRubium = new ItemMaterial("gearRubium", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xCC6363);
    public static final ItemMaterial gearRunite = new ItemMaterial("gearRunite", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xABBAC3);
    public static final ItemMaterial gearSilicon = new ItemMaterial("gearSilicon", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xC6C6C6);
    public static final ItemMaterial gearSilver = new ItemMaterial("gearSilver", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.UNCOMMON, 0xFFFFFF);
    public static final ItemMaterial gearSolder = new ItemMaterial("gearSolder", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xD2CFD6);
    public static final ItemMaterial gearSteel = new ItemMaterial("gearSteel", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x8C8C8C);
    public static final ItemMaterial gearTin = new ItemMaterial("gearTin", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.UNCOMMON, 0xD3C9CB);
    public static final ItemMaterial gearTitanium = new ItemMaterial("gearTitanium", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0xA9A9A9);
    public static final ItemMaterial gearTungsten = new ItemMaterial("gearTungsten", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x686C73);
    public static final ItemMaterial gearZinc = new ItemMaterial("gearZinc", ModCreativeTabs.gear, MaterialType.GEAR, MaterialRarity.AVERAGE, 0x88887F);
	
	// Radioactive Materials
	public static final ItemMaterial iridium  = new ItemMaterial("iridium", ModCreativeTabs.item, EnumChatFormatting.DARK_GREEN+"Radioactive", MaterialType.MISC, MaterialRarity.RARE);
	public static final ItemMaterial plutonium  = new ItemMaterial("plutonium", ModCreativeTabs.item, EnumChatFormatting.DARK_GREEN+"Radioactive", MaterialType.MISC, MaterialRarity.RARE);
	public static final ItemMaterial uranium  = new ItemMaterial("uranium", ModCreativeTabs.item, EnumChatFormatting.DARK_GREEN+"Radioactive", MaterialType.MISC, MaterialRarity.AVERAGE);
	
	// Special Materials
	public static final ItemMaterial crymeretye  = new ItemMaterial("crymeretye", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Warm to the Touch", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial graeconthylynium  = new ItemMaterial("graeconthylynium", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Slimy and Gooey", MaterialType.MISC, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial muktaphlyte  = new ItemMaterial("muktaphlyte", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Soft and Malleable", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial jonjronyphyll  = new ItemMaterial("jonjronyphyll", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Leathery, Almost", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial kraktachnar  = new ItemMaterial("kraktachnar", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Very Solid", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	public static final ItemMaterial schulbradethenairdivite  = new ItemMaterial("schulbradethenairdivite", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Smooth and Heavy", MaterialType.MISC, MaterialRarity.COMMON, MaterialDimension.USTHER);
	public static final ItemMaterial xaldriodythidyte  = new ItemMaterial("xaldriodythidyte", ModCreativeTabs.item, EnumChatFormatting.LIGHT_PURPLE+"It Feels Weightless", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.USTHER);
	
	public static final ItemMaterial trytementium  = new ItemMaterial("trytementium", ModCreativeTabs.item, EnumChatFormatting.GREEN+"High Magical Traces", MaterialType.MISC, MaterialRarity.AVERAGE, MaterialDimension.NETHER);
	public static final ItemMaterial unobtanium  = new ItemMaterial("unobtanium", ModCreativeTabs.item, EnumChatFormatting.DARK_PURPLE+"It Looks Strange.", MaterialType.ALLOY, MaterialRarity.ULTRARARE, MaterialDimension.NONE);
	
	// Bands
	public static final ItemBasic goldBand = new ItemBasic("goldBand", ModCreativeTabs.tool);
	public static final ItemBasic silverBand = new ItemBasic("silverBand", ModCreativeTabs.tool);
	public static final ItemBasic copperBand = new ItemBasic("copperBand", ModCreativeTabs.tool);
	
	// Fyrestone Forms
	public static final ItemMaterial fyrestone = new ItemMaterial("fyrestone", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Hot Potato, Hot Potato!", MaterialType.MISC, MaterialRarity.COMMON, MaterialDimension.NETHER);
	public static final ItemMaterial fyrestoneStable = new ItemMaterial("fyrestoneStable", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Not As Hot To Human Hands Potato!", MaterialType.MISC, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial fyrestoneGem = new ItemMaterial("fyrestoneGem", ModCreativeTabs.item, MaterialType.GEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	public static final ItemMaterial fyrestoneCut = new ItemMaterial("fyrestoneCut", ModCreativeTabs.item, MaterialType.CUTGEM, MaterialRarity.UNCOMMON, MaterialDimension.NETHER);
	
	// Voidium Forms
	public static final ItemMaterial voidium = new ItemMaterial("voidium", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Dangerous", MaterialType.MISC, MaterialRarity.UNCOMMON, MaterialDimension.END);
	public static final ItemMaterial voidiumStable = new ItemMaterial("voidiumStable", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Still Very Dangerous", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumRadioactiveFocused = new ItemMaterial("voidiumRadioactiveFocused", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"And You Made It Into a Gem. "+EnumChatFormatting.DARK_GREEN+"RADIOACTIVE", MaterialType.GEM, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumCutRadioactiveFocused = new ItemMaterial("voidiumCutRadioactiveFocused", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Now You've Cut It. "+EnumChatFormatting.DARK_GREEN+"RADIOACTIVE", MaterialType.CUTGEM, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrb = new ItemMaterial("voidiumOrb", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Round. But Still Dangerous", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactive = new ItemMaterial("voidiumOrbRadioactive", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Great, Now It's "+EnumChatFormatting.DARK_GREEN+"Radioactive", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactiveFocused = new ItemMaterial("voidiumOrbRadioactiveFocused", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"MORE "+EnumChatFormatting.DARK_GREEN+"RADIOACTIVE", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactiveFocusedCondensed = new ItemMaterial("voidiumOrbRadioactiveFocusedCondensed", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Smaller, But Still VERY "+EnumChatFormatting.DARK_GREEN+"RADIOACTIVE", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.END);
	public static final ItemMaterial voidiumOrbRadioactiveFocusedCondensedFragile = new ItemMaterial("voidiumOrbRadioactiveFocusedCondensedFragile", ModCreativeTabs.item, EnumChatFormatting.DARK_RED+"Fragile, Dangerous AND "+EnumChatFormatting.DARK_GREEN+"Radioactive", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.END);
	
	// Ylvoltium Forms
	public static final ItemMaterial ylvoltium = new ItemMaterial("ylvoltium", ModCreativeTabs.item, EnumChatFormatting.YELLOW+"Pure Electricty. It's shiny.", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.NONE);
	public static final ItemMaterial ylvoltiumInfused = new ItemMaterial("ylvoltiumInfused", ModCreativeTabs.item, EnumChatFormatting.YELLOW+"Pure Electricty. It's shinier now.", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.NONE);
	public static final ItemMaterial ylvoltiumFocused = new ItemMaterial("ylvoltiumFocused", ModCreativeTabs.item, EnumChatFormatting.YELLOW+"Purer Electricty. It's shiny.", MaterialType.MISC, MaterialRarity.RARE, MaterialDimension.NONE);
	public static final ItemMaterial ylvoltiumFluxed = new ItemMaterial("ylvoltiumFluxed", ModCreativeTabs.item, EnumChatFormatting.YELLOW+"Electricity Infused Electricty.", MaterialType.MISC, MaterialRarity.SUPERRARE, MaterialDimension.NONE);
	
	// Colours
	public static final ItemBasic paintbrush = new ItemBasic("paintbrush", ModCreativeTabs.paint, 1);
	public static final ItemPaintbrush paintbrushColoured = new ItemPaintbrush("paintbrushColoured", ModCreativeTabs.paint, 1);
	public static final ItemPaintball paintball = new ItemPaintball("paintball", ModCreativeTabs.paint, 16);
	
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
	public static final ItemBasicFood strawberryPie = new ItemBasicFood("strawberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood blackberryPie = new ItemBasicFood("blackberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood raspberryPie = new ItemBasicFood("raspberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood blueberryPie = new ItemBasicFood("blueberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood boysenberryPie = new ItemBasicFood("boysenberryPie", ModCreativeTabs.food, 8, 4.8f, false);
	public static final ItemBasicFood cranberryPie = new ItemBasicFood("cranberryPie", ModCreativeTabs.food, 8, 4.8f, false);
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
	public static final ItemBasicFood boysenberryJamToast = new ItemBasicFood("boysenberryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood boysenberryJam = new ItemBasicFood("boysenberryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood boysenberryJamSandwich = new ItemBasicFood("boysenberryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood boysenberryJamPancake = new ItemBasicFood("boysenberryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
	public static final ItemBasicFood cranberryJamToast = new ItemBasicFood("cranberryJamToast", ModCreativeTabs.food, 4, 2.6f, false);
	public static final ItemBasicFood cranberryJam = new ItemBasicFood("cranberryJam", ModCreativeTabs.food, 1, 2, 1.0f, false);
	public static final ItemBasicFood cranberryJamSandwich = new ItemBasicFood("cranberryJamSandwich", ModCreativeTabs.food, 6, 4.0f, false);
	public static final ItemBasicFood cranberryJamPancake = new ItemBasicFood("cranberryJamPancake", ModCreativeTabs.food, 5, 2.1F, false);
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
	public static final ItemBasicFood blt = new ItemBasicFood("BLT", ModCreativeTabs.food, 16, 20.0f, false);
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
	public static final ItemBasicFood rawGrawquat = new ItemBasicFood("rawGrawquat", ModCreativeTabs.food, 8, 0.8F, true);
	public static final ItemBasicFood cookedGrawquat = new ItemBasicFood("cookedGrawquat", ModCreativeTabs.food, 14, 9.0F, true);
	
	public static final ItemBasic flour = new ItemBasic("flour", ModCreativeTabs.food);
	public static final ItemBasic mapleSap = new ItemBasic("mapleSap", ModCreativeTabs.misc);
	
	public static final ItemBasic glassJar = new ItemBasic("glassJar", ModCreativeTabs.misc);
	
	public static final ItemKnife knife = new ItemKnife("knife", ModCreativeTabs.tool);
	
	// Fossils
	public static final ItemBasic fossil = new ItemFossil("fossil", ModCreativeTabs.misc, 64);
	
	// Miscellaneous
	public static final ItemBasic resin = new ItemBasic("resin", ModCreativeTabs.misc, EnumChatFormatting.GOLD+"Sticky");
	public static final ItemBasic rubber = new ItemBasic("rubber", ModCreativeTabs.misc, EnumChatFormatting.DARK_BLUE+"Rubbery");
	public static final ItemBasic fossilResin = new ItemBasic("resinFossil", ModCreativeTabs.misc, EnumChatFormatting.GOLD+"Sticky, But Solid");
	
	// Magicks
	public static final ItemBasicFood fluxWorm = new ItemBasicFood("fluxWorm", ModCreativeTabs.food, 1, 0.1f, false);
	public static final ItemEssence essence = new ItemEssence("essence", ModCreativeTabs.essence, 1);
	
	// Upgrades
	public static final ItemUpgrade speedUpgrade = new ItemUpgrade("speedUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade efficiencyUpgrade = new ItemUpgrade("efficiencyUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade outputUpgrade = new ItemUpgrade("outputUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade capacityUpgrade = new ItemUpgrade("capacityUpgrade", ModCreativeTabs.misc, 1);
	public static final ItemUpgrade inputUpgrade = new ItemUpgrade("inputUpgrade", ModCreativeTabs.misc, 1);
	
	// Utilities
	public static final ItemBackpack backpack = new ItemBackpack("backpack", ModCreativeTabs.misc);
	public static final ItemRemote remote = new ItemRemote("remote", ModCreativeTabs.tool);
	public static final ItemAgitator agitator = new ItemAgitator("agitator", ModCreativeTabs.tool);
	public static final ItemWrench wrench = new ItemWrench("wrench", ModCreativeTabs.tool);
	public static final ItemPaintballGun paintballGun = new ItemPaintballGun("paintballGun", ModCreativeTabs.tool);
	
	// Random
	public static final ItemBasic mapleLeaf = new ItemBasic("mapleLeaf", ModCreativeTabs.misc);
	public static final ItemBasic bandage = new ItemBasic("bandage", ModCreativeTabs.misc);
	public static final ItemBasic batWing = new ItemBasic("batWing", ModCreativeTabs.misc);
	public static final ItemLyekstone lyekstone = new ItemLyekstone("lyekstone", ModCreativeTabs.misc, 16);
	
	public static final ItemDebugger debugTool = new ItemDebugger("debugTool", null, 1);

	//public static final ItemBasicEgg egg = new ItemBasicEgg();
	//public static final ItemBasic eggShell = new ItemBasic("eggShell", ModCreativeTabs.food, 16);
	
	//TEST
	public static Object[] samarium;

	public static void init() {
		
		/**GameRegistry.registerItem(eggShell, eggShell.getTrueUnlocalizedName());
		try {
			GameRegistry.addSubstitutionAlias("minecraft:egg", Type.ITEM, egg);
		} catch (ExistingSubstitutionException e) {
			e.printStackTrace();
		}**/

		// Ingots
		Register.registerMaterial(ingotAdamanite, ingotAdamanite.getTrueUnlocalizedName());
		Register.registerMaterial(ingotAdamant, ingotAdamant.getTrueUnlocalizedName());
		Register.registerMaterial(ingotAluminium, ingotAluminium.getTrueUnlocalizedName());
		Register.registerMaterial(ingotBlurite, ingotBlurite.getTrueUnlocalizedName());
		Register.registerMaterial(ingotBrass, ingotBrass.getTrueUnlocalizedName());
		Register.registerMaterial(ingotBronze, ingotBronze.getTrueUnlocalizedName());
		Register.registerMaterial(ingotChromium, ingotChromium.getTrueUnlocalizedName());
		Register.registerMaterial(ingotCobalt, ingotCobalt.getTrueUnlocalizedName());
		Register.registerMaterial(ingotCopper, ingotCopper.getTrueUnlocalizedName());
		Register.registerMaterial(ingotDaeyalt, ingotDaeyalt.getTrueUnlocalizedName());
		Register.registerMaterial(ingotElectrum, ingotElectrum.getTrueUnlocalizedName());
		Register.registerMaterial(ingotGoloid, ingotGoloid.getTrueUnlocalizedName());
		Register.registerMaterial(ingotInvar, ingotInvar.getTrueUnlocalizedName());
		Register.registerMaterial(ingotLead, ingotLead.getTrueUnlocalizedName());
		Register.registerMaterial(ingotLunar, ingotLunar.getTrueUnlocalizedName());
		Register.registerMaterial(ingotMalagnite, ingotMalagnite.getTrueUnlocalizedName());
		Register.registerMaterial(ingotManganese, ingotManganese.getTrueUnlocalizedName());
		Register.registerMaterial(ingotMithril, ingotMithril.getTrueUnlocalizedName());
		Register.registerMaterial(ingotNickel, ingotNickel.getTrueUnlocalizedName());
		Register.registerMaterial(ingotPlatinum, ingotPlatinum.getTrueUnlocalizedName());
		Register.registerMaterial(ingotRhodium, ingotRhodium.getTrueUnlocalizedName());
		Register.registerMaterial(ingotRubium, ingotRubium.getTrueUnlocalizedName());
		Register.registerMaterial(ingotRunite, ingotRunite.getTrueUnlocalizedName());
		Register.registerMaterial(ingotSilicon, ingotSilicon.getTrueUnlocalizedName());
		Register.registerMaterial(ingotSilver, ingotSilver.getTrueUnlocalizedName());
		Register.registerMaterial(ingotSolder, ingotSolder.getTrueUnlocalizedName());
		Register.registerMaterial(ingotSteel, ingotSteel.getTrueUnlocalizedName());
		Register.registerMaterial(ingotTin, ingotTin.getTrueUnlocalizedName());
		Register.registerMaterial(ingotTitanium, ingotTitanium.getTrueUnlocalizedName());
		Register.registerMaterial(ingotTungsten, ingotTungsten.getTrueUnlocalizedName());
		Register.registerMaterial(ingotZinc, ingotZinc.getTrueUnlocalizedName());
		
		// Dusts
		GameRegistry.registerItem(dustAdamanite, dustAdamanite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustAdamant, dustAdamant.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustAluminium, dustAluminium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustBlurite, dustBlurite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustBrass, dustBrass.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustBronze, dustBronze.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustChromium, dustChromium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustCobalt, dustCobalt.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustCopper, dustCopper.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustDaeyalt, dustDaeyalt.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustElectrum, dustElectrum.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustGold, dustGold.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustGoloid, dustGoloid.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustInvar, dustInvar.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustIron, dustIron.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustLead, dustLead.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustLunar, dustLunar.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustMalagnite, dustMalagnite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustManganese, dustManganese.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustMithril, dustMithril.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustNickel, dustNickel.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustPlatinum, dustPlatinum.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustRhodium, dustRhodium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustRubium, dustRubium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustRunite, dustRunite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustSilicon, dustSilicon.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustSilver, dustSilver.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustSolder, dustSolder.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustSteel, dustSteel.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustTin, dustTin.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustTitanium, dustTitanium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustTungsten, dustTungsten.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustZinc, dustZinc.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(dustAmazonite, dustAmazonite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustAmber, dustAmber.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustAmethyst, dustAmethyst.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustAquamarine, dustAquamarine.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustCarnelian, dustCarnelian.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustCitrine, dustCitrine.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustDiamond, dustDiamond.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustEmerald, dustEmerald.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustGarnet, dustGarnet.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustJade, dustJade.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustKunzite, dustKunzite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustNetherQuartz, dustNetherQuartz.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustOnyx, dustOnyx.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustOpal, dustOpal.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustQuartz, dustQuartz.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustRuby, dustRuby.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustSapphire, dustSapphire.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustTopaz, dustTopaz.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(dustFyrestone, dustFyrestone.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustVoidium, dustVoidium.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(dustIridium, dustIridium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustPlutonium, dustPlutonium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustUranium, dustUranium.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(dustCrymeretye, dustCrymeretye.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustGraeconthylynium, dustGraeconthylynium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustMuktaphlyte, dustMuktaphlyte.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustJonjronyphyll, dustJonjronyphyll.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustKraktachnar, dustKraktachnar.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustSchulbradethenairdivite, dustSchulbradethenairdivite.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustXaldriodythidyte, dustXaldriodythidyte.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(dustUnobtanium, dustUnobtanium.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustTrytementium, dustTrytementium.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(dustCoal, dustCoal.getTrueUnlocalizedName());
		GameRegistry.registerItem(dustLapis, dustLapis.getTrueUnlocalizedName());
		
		// Clusters
		GameRegistry.registerItem(clusterAdamanite, clusterAdamanite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterAdamant, clusterAdamant.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterAluminium, clusterAluminium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterBlurite, clusterBlurite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterBrass, clusterBrass.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterBronze, clusterBronze.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterChromium, clusterChromium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterCobalt, clusterCobalt.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterCopper, clusterCopper.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterDaeyalt, clusterDaeyalt.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterElectrum, clusterElectrum.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterGold, clusterGold.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterGoloid, clusterGoloid.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterInvar, clusterInvar.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterIron, clusterIron.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterLead, clusterLead.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterLunar, clusterLunar.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterMalagnite, clusterMalagnite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterManganese, clusterManganese.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterMithril, clusterMithril.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterNickel, clusterNickel.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterPlatinum, clusterPlatinum.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterRhodium, clusterRhodium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterRubium, clusterRubium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterRunite, clusterRunite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterSilicon, clusterSilicon.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterSilver, clusterSilver.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterSolder, clusterSolder.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterSteel, clusterSteel.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterTin, clusterTin.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterTitanium, clusterTitanium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterTungsten, clusterTungsten.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterZinc, clusterZinc.getTrueUnlocalizedName());
				
		GameRegistry.registerItem(clusterAmazonite, clusterAmazonite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterAmber, clusterAmber.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterAmethyst, clusterAmethyst.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterAquamarine, clusterAquamarine.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterCarnelian, clusterCarnelian.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterCitrine, clusterCitrine.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterDiamond, clusterDiamond.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterEmerald, clusterEmerald.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterGarnet, clusterGarnet.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterJade, clusterJade.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterKunzite, clusterKunzite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterNetherQuartz, clusterNetherQuartz.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterOnyx, clusterOnyx.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterOpal, clusterOpal.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterQuartz, clusterQuartz.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterRuby, clusterRuby.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterSapphire, clusterSapphire.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterTopaz, clusterTopaz.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(clusterFyrestone, clusterFyrestone.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterVoidium, clusterVoidium.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(clusterIridium, clusterIridium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterPlutonium, clusterPlutonium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterUranium, clusterUranium.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(clusterCrymeretye, clusterCrymeretye.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterGraeconthylynium, clusterGraeconthylynium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterMuktaphlyte, clusterMuktaphlyte.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterJonjronyphyll, clusterJonjronyphyll.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterKraktachnar, clusterKraktachnar.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterSchulbradethenairdivite, clusterSchulbradethenairdivite.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterXaldriodythidyte, clusterXaldriodythidyte.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(clusterUnobtanium, clusterUnobtanium.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterTrytementium, clusterTrytementium.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(clusterCoal, clusterCoal.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterLapis, clusterLapis.getTrueUnlocalizedName());
		GameRegistry.registerItem(clusterRedstone, clusterRedstone.getTrueUnlocalizedName());
		
		// Plates
		Register.registerMaterial(plateAdamanite, plateAdamanite.getTrueUnlocalizedName());
		Register.registerMaterial(plateAdamant, plateAdamant.getTrueUnlocalizedName());
		Register.registerMaterial(plateAluminium, plateAluminium.getTrueUnlocalizedName());
		Register.registerMaterial(plateBlurite, plateBlurite.getTrueUnlocalizedName());
		Register.registerMaterial(plateBrass, plateBrass.getTrueUnlocalizedName());
		Register.registerMaterial(plateBronze, plateBronze.getTrueUnlocalizedName());
		Register.registerMaterial(plateChromium, plateChromium.getTrueUnlocalizedName());
		Register.registerMaterial(plateCobalt, plateCobalt.getTrueUnlocalizedName());
		Register.registerMaterial(plateCopper, plateCopper.getTrueUnlocalizedName());
		Register.registerMaterial(plateDaeyalt, plateDaeyalt.getTrueUnlocalizedName());
		Register.registerMaterial(plateElectrum, plateElectrum.getTrueUnlocalizedName());
		Register.registerMaterial(plateGold, plateGold.getTrueUnlocalizedName());
		Register.registerMaterial(plateGoloid, plateGoloid.getTrueUnlocalizedName());
		Register.registerMaterial(plateInvar, plateInvar.getTrueUnlocalizedName());
		Register.registerMaterial(plateIron, plateIron.getTrueUnlocalizedName());
		Register.registerMaterial(plateLead, plateLead.getTrueUnlocalizedName());
		Register.registerMaterial(plateLunar, plateLunar.getTrueUnlocalizedName());
		Register.registerMaterial(plateMalagnite, plateMalagnite.getTrueUnlocalizedName());
		Register.registerMaterial(plateManganese, plateManganese.getTrueUnlocalizedName());
		Register.registerMaterial(plateMithril, plateMithril.getTrueUnlocalizedName());
		Register.registerMaterial(plateNickel, plateNickel.getTrueUnlocalizedName());
		Register.registerMaterial(plateObsidian, plateObsidian.getTrueUnlocalizedName());
		Register.registerMaterial(platePlatinum, platePlatinum.getTrueUnlocalizedName());
		Register.registerMaterial(plateRhodium, plateRhodium.getTrueUnlocalizedName());
		Register.registerMaterial(plateRubium, plateRubium.getTrueUnlocalizedName());
		Register.registerMaterial(plateRunite, plateRunite.getTrueUnlocalizedName());
		Register.registerMaterial(plateSilicon, plateSilicon.getTrueUnlocalizedName());
		Register.registerMaterial(plateSilver, plateSilver.getTrueUnlocalizedName());
		Register.registerMaterial(plateSolder, plateSolder.getTrueUnlocalizedName());
		Register.registerMaterial(plateSteel, plateSteel.getTrueUnlocalizedName());
		Register.registerMaterial(plateTin, plateTin.getTrueUnlocalizedName());
		Register.registerMaterial(plateTitanium, plateTitanium.getTrueUnlocalizedName());
		Register.registerMaterial(plateTungsten, plateTungsten.getTrueUnlocalizedName());
		Register.registerMaterial(plateZinc, plateZinc.getTrueUnlocalizedName());
		
		// Nuggets
		Register.registerMaterialNugget(nuggetAdamanite, nuggetAdamanite.getTrueUnlocalizedName(), ingotAdamanite);
		Register.registerMaterialNugget(nuggetAdamant, nuggetAdamant.getTrueUnlocalizedName(), ingotAdamant);
		Register.registerMaterialNugget(nuggetAluminium, nuggetAluminium.getTrueUnlocalizedName(), ingotAluminium);
		Register.registerMaterialNugget(nuggetBlurite, nuggetBlurite.getTrueUnlocalizedName(), ingotBlurite);
		Register.registerMaterialNugget(nuggetBrass, nuggetBrass.getTrueUnlocalizedName(), ingotBrass);
		Register.registerMaterialNugget(nuggetBronze, nuggetBronze.getTrueUnlocalizedName(), ingotBronze);
		Register.registerMaterialNugget(nuggetChromium, nuggetChromium.getTrueUnlocalizedName(), ingotChromium);
		Register.registerMaterialNugget(nuggetCobalt, nuggetCobalt.getTrueUnlocalizedName(), ingotCobalt);
		Register.registerMaterialNugget(nuggetCopper, nuggetCopper.getTrueUnlocalizedName(), ingotCopper);
		Register.registerMaterialNugget(nuggetDaeyalt, nuggetDaeyalt.getTrueUnlocalizedName(), ingotDaeyalt);
		Register.registerMaterialNugget(nuggetElectrum, nuggetElectrum.getTrueUnlocalizedName(), ingotElectrum);
		Register.registerMaterialNugget(nuggetGoloid, nuggetGoloid.getTrueUnlocalizedName(), ingotGoloid);
		Register.registerMaterialNugget(nuggetInvar, nuggetInvar.getTrueUnlocalizedName(), ingotInvar);
		Register.registerMaterialNugget(nuggetIron, nuggetIron.getTrueUnlocalizedName(), Items.iron_ingot);
		Register.registerMaterialNugget(nuggetLead, nuggetLead.getTrueUnlocalizedName(), ingotLead);
		Register.registerMaterialNugget(nuggetLunar, nuggetLunar.getTrueUnlocalizedName(), ingotLunar);
		Register.registerMaterialNugget(nuggetMalagnite, nuggetMalagnite.getTrueUnlocalizedName(), ingotMalagnite);
		Register.registerMaterialNugget(nuggetManganese, nuggetManganese.getTrueUnlocalizedName(), ingotManganese);
		Register.registerMaterialNugget(nuggetMithril, nuggetMithril.getTrueUnlocalizedName(), ingotMithril);
		Register.registerMaterialNugget(nuggetNickel, nuggetNickel.getTrueUnlocalizedName(), ingotNickel);
		Register.registerMaterialNugget(nuggetPlatinum, nuggetPlatinum.getTrueUnlocalizedName(), ingotPlatinum);
		Register.registerMaterialNugget(nuggetRhodium, nuggetRhodium.getTrueUnlocalizedName(), ingotRhodium);
		Register.registerMaterialNugget(nuggetRubium, nuggetRubium.getTrueUnlocalizedName(), ingotRubium);
		Register.registerMaterialNugget(nuggetRunite, nuggetRunite.getTrueUnlocalizedName(), ingotRunite);
		Register.registerMaterialNugget(nuggetSilicon, nuggetSilicon.getTrueUnlocalizedName(), ingotSilicon);
		Register.registerMaterialNugget(nuggetSilver, nuggetSilver.getTrueUnlocalizedName(), ingotSilver);
		Register.registerMaterialNugget(nuggetSolder, nuggetSolder.getTrueUnlocalizedName(), ingotSolder);
		Register.registerMaterialNugget(nuggetSteel, nuggetSteel.getTrueUnlocalizedName(), ingotSteel);
		Register.registerMaterialNugget(nuggetTin, nuggetTin.getTrueUnlocalizedName(), ingotTin);
		Register.registerMaterialNugget(nuggetTitanium, nuggetTitanium.getTrueUnlocalizedName(), ingotTitanium);
		Register.registerMaterialNugget(nuggetTungsten, nuggetTungsten.getTrueUnlocalizedName(), ingotTungsten);
		Register.registerMaterialNugget(nuggetZinc, nuggetZinc.getTrueUnlocalizedName(), ingotZinc);
		
		// Gems
		Register.registerMaterial(gemAmazonite, gemAmazonite.getTrueUnlocalizedName());
		Register.registerMaterial(gemAmber, gemAmber.getTrueUnlocalizedName());
		Register.registerMaterial(gemAmethyst, gemAmethyst.getTrueUnlocalizedName());
		Register.registerMaterial(gemAquamarine, gemAquamarine.getTrueUnlocalizedName());
		Register.registerMaterial(gemCarnelian, gemCarnelian.getTrueUnlocalizedName());
		Register.registerMaterial(gemCitrine, gemCitrine.getTrueUnlocalizedName());
		Register.registerMaterial(gemDiamond, gemDiamond.getTrueUnlocalizedName());
		Register.registerMaterial(gemGarnet, gemGarnet.getTrueUnlocalizedName());
		Register.registerMaterial(gemJade, gemJade.getTrueUnlocalizedName());
		Register.registerMaterial(gemKunzite, gemKunzite.getTrueUnlocalizedName());
		Register.registerMaterial(gemNetherQuartz, gemNetherQuartz.getTrueUnlocalizedName());
		Register.registerMaterial(gemOnyx, gemOnyx.getTrueUnlocalizedName());
		Register.registerMaterial(gemOpal, gemOpal.getTrueUnlocalizedName());
		Register.registerMaterial(gemQuartz, gemQuartz.getTrueUnlocalizedName());
		Register.registerMaterial(gemRuby, gemRuby.getTrueUnlocalizedName());
		Register.registerMaterial(gemSapphire, gemSapphire.getTrueUnlocalizedName());
		Register.registerMaterial(gemTopaz, gemTopaz.getTrueUnlocalizedName());

		Register.registerMaterial(gemObsidian, gemObsidian.getTrueUnlocalizedName());
		
		// Pure Stuff
		Register.registerMaterial(gemPureAmazonite, gemPureAmazonite.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureAmber, gemPureAmber.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureAmethyst, gemPureAmethyst.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureAquamarine, gemPureAquamarine.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureCarnelian, gemPureCarnelian.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureCitrine, gemPureCitrine.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureDiamond, gemPureDiamond.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureEmerald, gemPureEmerald.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureGarnet, gemPureGarnet.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureJade, gemPureJade.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureKunzite, gemPureKunzite.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureNetherQuartz, gemPureNetherQuartz.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureOnyx, gemPureOnyx.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureOpal, gemPureOpal.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureQuartz, gemPureQuartz.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureRuby, gemPureRuby.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureSapphire, gemPureSapphire.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureTopaz, gemPureTopaz.getTrueUnlocalizedName());
		
		Register.registerMaterial(gemPureFyrestone, gemPureFyrestone.getTrueUnlocalizedName());
		Register.registerMaterial(gemPureVoidiumRadioactiveFocused, gemPureVoidiumRadioactiveFocused.getTrueUnlocalizedName());
		
		Register.registerMaterial(gemPureObsidian, gemPureObsidian.getTrueUnlocalizedName());
		
		// Shards
		Register.registerMaterial(shardAmazonite, shardAmazonite.getTrueUnlocalizedName());
		Register.registerMaterial(shardAmber, shardAmber.getTrueUnlocalizedName());
		Register.registerMaterial(shardAmethyst, shardAmethyst.getTrueUnlocalizedName());
		Register.registerMaterial(shardAquamarine, shardAquamarine.getTrueUnlocalizedName());
		Register.registerMaterial(shardCarnelian, shardCarnelian.getTrueUnlocalizedName());
		Register.registerMaterial(shardCitrine, shardCitrine.getTrueUnlocalizedName());
		Register.registerMaterial(shardDiamond, shardDiamond.getTrueUnlocalizedName());
		Register.registerMaterial(shardEmerald, shardEmerald.getTrueUnlocalizedName());
		Register.registerMaterial(shardGarnet, shardGarnet.getTrueUnlocalizedName());
		Register.registerMaterial(shardJade, shardJade.getTrueUnlocalizedName());
		Register.registerMaterial(shardKunzite, shardKunzite.getTrueUnlocalizedName());
		Register.registerMaterial(shardNetherQuartz, shardNetherQuartz.getTrueUnlocalizedName());
		Register.registerMaterial(shardOnyx, shardOnyx.getTrueUnlocalizedName());
		Register.registerMaterial(shardOpal, shardOpal.getTrueUnlocalizedName());
		Register.registerMaterial(shardQuartz, shardQuartz.getTrueUnlocalizedName());
		Register.registerMaterial(shardRuby, shardRuby.getTrueUnlocalizedName());
		Register.registerMaterial(shardSapphire, shardSapphire.getTrueUnlocalizedName());
		Register.registerMaterial(shardTopaz, shardTopaz.getTrueUnlocalizedName());
		
		Register.registerMaterial(shardFyrestone, shardFyrestone.getTrueUnlocalizedName());
		Register.registerMaterial(shardVoidiumRadioactiveFocused, shardVoidiumRadioactiveFocused.getTrueUnlocalizedName());
		
		Register.registerMaterial(shardObsidian, shardObsidian.getTrueUnlocalizedName());
		
		Register.registerMaterial(shardUnobtanium, shardUnobtanium.getTrueUnlocalizedName());
		Register.registerMaterial(shardTrytementium, shardTrytementium.getTrueUnlocalizedName());
		
		// Gears
		Register.registerMaterial(gearAdamanite, gearAdamanite.getTrueUnlocalizedName());
		Register.registerMaterial(gearAdamant, gearAdamant.getTrueUnlocalizedName());
		Register.registerMaterial(gearAluminium, gearAluminium.getTrueUnlocalizedName());
		Register.registerMaterial(gearBlurite, gearBlurite.getTrueUnlocalizedName());
		Register.registerMaterial(gearBrass, gearBrass.getTrueUnlocalizedName());
		Register.registerMaterial(gearBronze, gearBronze.getTrueUnlocalizedName());
		Register.registerMaterial(gearChromium, gearChromium.getTrueUnlocalizedName());
		Register.registerMaterial(gearCobalt, gearCobalt.getTrueUnlocalizedName());
		Register.registerMaterial(gearCopper, gearCopper.getTrueUnlocalizedName());
		Register.registerMaterial(gearDaeyalt, gearDaeyalt.getTrueUnlocalizedName());
		Register.registerMaterial(gearElectrum, gearElectrum.getTrueUnlocalizedName());
		Register.registerMaterial(gearGold, gearGold.getTrueUnlocalizedName());
		Register.registerMaterial(gearGoloid, gearGoloid.getTrueUnlocalizedName());
		Register.registerMaterial(gearInvar, gearInvar.getTrueUnlocalizedName());
		Register.registerMaterial(gearIron, gearIron.getTrueUnlocalizedName());
		Register.registerMaterial(gearLead, gearLead.getTrueUnlocalizedName());
		Register.registerMaterial(gearLunar, gearLunar.getTrueUnlocalizedName());
		Register.registerMaterial(gearMalagnite, gearMalagnite.getTrueUnlocalizedName());
		Register.registerMaterial(gearManganese, gearManganese.getTrueUnlocalizedName());
		Register.registerMaterial(gearMithril, gearMithril.getTrueUnlocalizedName());
		Register.registerMaterial(gearNickel, gearNickel.getTrueUnlocalizedName());
		Register.registerMaterial(gearPlatinum, gearPlatinum.getTrueUnlocalizedName());
		Register.registerMaterial(gearRhodium, gearRhodium.getTrueUnlocalizedName());
		Register.registerMaterial(gearRubium, gearRubium.getTrueUnlocalizedName());
		Register.registerMaterial(gearRunite, gearRunite.getTrueUnlocalizedName());
		Register.registerMaterial(gearSilicon, gearSilicon.getTrueUnlocalizedName());
		Register.registerMaterial(gearSilver, gearSilver.getTrueUnlocalizedName());
		Register.registerMaterial(gearSolder, gearSolder.getTrueUnlocalizedName());
		Register.registerMaterial(gearSteel, gearSteel.getTrueUnlocalizedName());
		Register.registerMaterial(gearTin, gearTin.getTrueUnlocalizedName());
		Register.registerMaterial(gearTitanium, gearTitanium.getTrueUnlocalizedName());
		Register.registerMaterial(gearTungsten, gearTungsten.getTrueUnlocalizedName());
		Register.registerMaterial(gearZinc, gearZinc.getTrueUnlocalizedName());
		
		// Colour stuffs
		GameRegistry.registerItem(paintbrush, paintbrush.getTrueUnlocalizedName());
		GameRegistry.registerItem(paintbrushColoured, paintbrushColoured.getTrueUnlocalizedName());
		GameRegistry.registerItem(paintball, paintball.getTrueUnlocalizedName());
		
		// Signs
		GameRegistry.registerItem(ironSign, ironSign.getTrueUnlocalizedName());
		GameRegistry.registerItem(copperSign, copperSign.getTrueUnlocalizedName());
		GameRegistry.registerItem(goldSign, goldSign.getTrueUnlocalizedName());
		GameRegistry.registerItem(silverSign, silverSign.getTrueUnlocalizedName());
		
		// Miscellaneous
		GameRegistry.registerItem(fossil, fossil.getTrueUnlocalizedName());
		GameRegistry.registerItem(resin, resin.getTrueUnlocalizedName());
		GameRegistry.registerItem(rubber, rubber.getTrueUnlocalizedName());
		GameRegistry.registerItem(fossilResin, fossilResin.getTrueUnlocalizedName());
		
		// Ylvoltium Forms
		Register.registerMaterial(ylvoltium, ylvoltium.getTrueUnlocalizedName());
		Register.registerMaterial(ylvoltiumInfused, ylvoltiumInfused.getTrueUnlocalizedName());
		Register.registerMaterial(ylvoltiumFocused, ylvoltiumFocused.getTrueUnlocalizedName());
		Register.registerMaterial(ylvoltiumFluxed, ylvoltiumFluxed.getTrueUnlocalizedName());
		
		// Fyrestone Forms
		Register.registerMaterial(fyrestone, fyrestone.getTrueUnlocalizedName());
		Register.registerMaterial(fyrestoneStable, fyrestoneStable.getTrueUnlocalizedName());
		Register.registerMaterial(fyrestoneGem, fyrestoneGem.getTrueUnlocalizedName());
		GameRegistry.registerItem(fyrestoneCut, fyrestoneCut.getTrueUnlocalizedName());
		
		// Voidium Forms
		Register.registerMaterial(voidium, voidium.getTrueUnlocalizedName());
		Register.registerMaterial(voidiumStable, voidiumStable.getTrueUnlocalizedName());
		Register.registerMaterial(voidiumRadioactiveFocused, voidiumRadioactiveFocused.getTrueUnlocalizedName());
		GameRegistry.registerItem(voidiumCutRadioactiveFocused, voidiumCutRadioactiveFocused.getTrueUnlocalizedName());
		GameRegistry.registerItem(voidiumOrb, voidiumOrb.getTrueUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactive, voidiumOrbRadioactive.getTrueUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactiveFocused, voidiumOrbRadioactiveFocused.getTrueUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactiveFocusedCondensed, voidiumOrbRadioactiveFocusedCondensed.getTrueUnlocalizedName());
		GameRegistry.registerItem(voidiumOrbRadioactiveFocusedCondensedFragile, voidiumOrbRadioactiveFocusedCondensedFragile.getTrueUnlocalizedName());
		
		// Oddball Materials
		Register.registerMaterial(crymeretye, crymeretye.getTrueUnlocalizedName());
		Register.registerMaterial(graeconthylynium, graeconthylynium.getTrueUnlocalizedName());
		Register.registerMaterial(muktaphlyte, muktaphlyte.getTrueUnlocalizedName());
		Register.registerMaterial(jonjronyphyll, jonjronyphyll.getTrueUnlocalizedName());
		Register.registerMaterial(kraktachnar, kraktachnar.getTrueUnlocalizedName());
		Register.registerMaterial(schulbradethenairdivite, schulbradethenairdivite.getTrueUnlocalizedName());
		Register.registerMaterial(xaldriodythidyte, xaldriodythidyte.getTrueUnlocalizedName());
		
		Register.registerMaterial(unobtanium, unobtanium.getTrueUnlocalizedName());
		Register.registerMaterial(trytementium, trytementium.getTrueUnlocalizedName());
		
		// Radioactive Materials
		Register.registerMaterial(iridium, iridium.getTrueUnlocalizedName());
		Register.registerMaterial(uranium, uranium.getTrueUnlocalizedName());
		Register.registerMaterial(plutonium, plutonium.getTrueUnlocalizedName());
		
		// Metal Bands
		GameRegistry.registerItem(goldBand, goldBand.getTrueUnlocalizedName());
		GameRegistry.registerItem(silverBand, silverBand.getTrueUnlocalizedName());
		GameRegistry.registerItem(copperBand, copperBand.getTrueUnlocalizedName());
		
		// Food
		GameRegistry.registerItem(cherry, cherry.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemon, lemon.getTrueUnlocalizedName());
		GameRegistry.registerItem(pear, pear.getTrueUnlocalizedName());
		GameRegistry.registerItem(mango, mango.getTrueUnlocalizedName());
		GameRegistry.registerItem(banana, banana.getTrueUnlocalizedName());
		GameRegistry.registerItem(lettuce, lettuce.getTrueUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getTrueUnlocalizedName());
		GameRegistry.registerItem(raspberry, raspberry.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberry, blueberry.getTrueUnlocalizedName());
		GameRegistry.registerItem(blackberry, blackberry.getTrueUnlocalizedName());
		GameRegistry.registerItem(boysenberry, boysenberry.getTrueUnlocalizedName());
		GameRegistry.registerItem(cranberry, cranberry.getTrueUnlocalizedName());
		GameRegistry.registerItem(cherryPie, cherryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonTart, lemonTart.getTrueUnlocalizedName());
		GameRegistry.registerItem(applePie, applePie.getTrueUnlocalizedName());
		GameRegistry.registerItem(blackberryPie, blackberryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(raspberryPie, raspberryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberryPie, blueberryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryPie, strawberryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(boysenberryPie, boysenberryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(cranberryPie, cranberryPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(pearPie, pearPie.getTrueUnlocalizedName());
		GameRegistry.registerItem(slicedBread, slicedBread.getTrueUnlocalizedName());
		GameRegistry.registerItem(toast, toast.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryJamToast, strawberryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryJam, strawberryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryJamSandwich, strawberryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryJamPancake, strawberryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(raspberryJamToast, raspberryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(raspberryJam, raspberryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(raspberryJamSandwich, raspberryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(raspberryJamPancake, raspberryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberryJamToast, blueberryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberryJam, blueberryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberryJamSandwich, blueberryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberryJamPancake, blueberryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(blackberryJamToast, blackberryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(blackberryJam, blackberryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(blackberryJamSandwich, blackberryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(blackberryJamPancake, blackberryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(boysenberryJamToast, boysenberryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(boysenberryJam, boysenberryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(boysenberryJamSandwich, boysenberryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(boysenberryJamPancake, boysenberryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(cranberryJamToast, cranberryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(cranberryJam, cranberryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(cranberryJamSandwich, cranberryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(cranberryJamPancake, cranberryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(appleJamToast, appleJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(appleJam, appleJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(appleJamSandwich, appleJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(appleJamPancake, appleJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(cherryJamToast, cherryJamToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(cherryJam, cherryJam.getTrueUnlocalizedName());
		GameRegistry.registerItem(cherryJamSandwich, cherryJamSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(cherryJamPancake, cherryJamPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonMarmaladeToast, lemonMarmaladeToast.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonMarmalade, lemonMarmalade.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonMarmaladeSandwich, lemonMarmaladeSandwich.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonMarmaladePancake, lemonMarmaladePancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(mapleSyrup, mapleSyrup.getTrueUnlocalizedName());
		GameRegistry.registerItem(blt, blt.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonJuice, lemonJuice.getTrueUnlocalizedName());
		GameRegistry.registerItem(appleJuice, appleJuice.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonade, lemonade.getTrueUnlocalizedName());
		GameRegistry.registerItem(bananaSmoothie, bananaSmoothie.getTrueUnlocalizedName());
		GameRegistry.registerItem(mangoSmoothie, mangoSmoothie.getTrueUnlocalizedName());
		GameRegistry.registerItem(vegetableStew, vegetableStew.getTrueUnlocalizedName());
		GameRegistry.registerItem(shellSoup, shellSoup.getTrueUnlocalizedName());
		GameRegistry.registerItem(chocolateCake, chocolateCake.getTrueUnlocalizedName());
		GameRegistry.registerItem(chocolateMilk, chocolateMilk.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryCake, strawberryCake.getTrueUnlocalizedName());
		GameRegistry.registerItem(strawberryMilk, strawberryMilk.getTrueUnlocalizedName());
		GameRegistry.registerItem(caramel, caramel.getTrueUnlocalizedName());
		GameRegistry.registerItem(toffee, toffee.getTrueUnlocalizedName());
		GameRegistry.registerItem(toffeeApple, toffeeApple.getTrueUnlocalizedName());
		GameRegistry.registerItem(pancake, pancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(mapleSyrupPancake, mapleSyrupPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(lemonSugarPancake, lemonSugarPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(blueberryPancake, blueberryPancake.getTrueUnlocalizedName());
		GameRegistry.registerItem(rawTortoise, rawTortoise.getTrueUnlocalizedName());
		GameRegistry.registerItem(cookedTortoise, cookedTortoise.getTrueUnlocalizedName());
		GameRegistry.registerItem(rawGrawquat, rawGrawquat.getTrueUnlocalizedName());
		GameRegistry.registerItem(cookedGrawquat, cookedGrawquat.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(flour, flour.getTrueUnlocalizedName());
		GameRegistry.registerItem(mapleSap, mapleSap.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(knife, knife.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(glassJar, glassJar.getTrueUnlocalizedName());
		
		// Magicks
		GameRegistry.registerItem(fluxWorm, fluxWorm.getTrueUnlocalizedName());
		GameRegistry.registerItem(essence, essence.getTrueUnlocalizedName());
		
		// Upgrades
		GameRegistry.registerItem(speedUpgrade, speedUpgrade.getTrueUnlocalizedName());
		GameRegistry.registerItem(efficiencyUpgrade, efficiencyUpgrade.getTrueUnlocalizedName());
		GameRegistry.registerItem(outputUpgrade, outputUpgrade.getTrueUnlocalizedName());
		GameRegistry.registerItem(capacityUpgrade, capacityUpgrade.getTrueUnlocalizedName());
		GameRegistry.registerItem(inputUpgrade, inputUpgrade.getTrueUnlocalizedName());
		
		// Utilities
		GameRegistry.registerItem(backpack, backpack.getTrueUnlocalizedName());
		GameRegistry.registerItem(remote, remote.getTrueUnlocalizedName());
		GameRegistry.registerItem(agitator, agitator.getTrueUnlocalizedName());
		GameRegistry.registerItem(wrench, wrench.getTrueUnlocalizedName());
		GameRegistry.registerItem(paintballGun, paintballGun.getTrueUnlocalizedName());
		
		//Misc
		GameRegistry.registerItem(mapleLeaf, mapleLeaf.getTrueUnlocalizedName());
		GameRegistry.registerItem(bandage, bandage.getTrueUnlocalizedName());
		GameRegistry.registerItem(batWing, batWing.getTrueUnlocalizedName());
		GameRegistry.registerItem(lyekstone, lyekstone.getTrueUnlocalizedName());
		
		GameRegistry.registerItem(debugTool, debugTool.getTrueUnlocalizedName());

		//TEST
		//samarium = Register.registerNewMaterial("Samarium", 0x9B8978, MaterialType.INGOT, MaterialRarity.AVERAGE, MaterialDimension.OVERWORLD, new boolean[]{false,false,false,false,false,false,false,false,false,false,false}, new boolean[]{false,false,false,false,false,false,false,false,false,false,false}, new Object[]{null,null,null,null,null,null,null,null,null,null,null}, new int[]{2,6,2,6,0,1,1}, new int[]{1300,6000,3000,12}, new ItemBlock[]{null,null,null,null,null,null,null,null,null,null,null});
	}

}
