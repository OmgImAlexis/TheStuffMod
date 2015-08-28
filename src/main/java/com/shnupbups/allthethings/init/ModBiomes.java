package com.shnupbups.allthethings.init;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import com.shnupbups.allthethings.biome.BiomeBananaGrove;
import com.shnupbups.allthethings.biome.BiomeCherryForest;
import com.shnupbups.allthethings.biome.BiomeEbonyWoods;
import com.shnupbups.allthethings.biome.BiomeEndearingWoods;
import com.shnupbups.allthethings.biome.BiomeFruitForest;
import com.shnupbups.allthethings.biome.BiomeJacarandaWoods;
import com.shnupbups.allthethings.biome.BiomeLemonForest;
import com.shnupbups.allthethings.biome.BiomeMangoForest;
import com.shnupbups.allthethings.biome.BiomeMapleWoods;
import com.shnupbups.allthethings.biome.BiomeOliveWoods;
import com.shnupbups.allthethings.biome.BiomePearForest;
import com.shnupbups.allthethings.biome.BiomeRubberPlains;
import com.shnupbups.allthethings.biome.BiomeUsthericPlains;

public class ModBiomes {
	public static final BiomeGenBase cherryForest=new BiomeCherryForest(80,"Cherry Forest",0x7cae9b);
	public static final BiomeGenBase rubberPlains=new BiomeRubberPlains(81,"Rubber-Oak Plains",0xD8FFF9);
	public static final BiomeGenBase lemonForest=new BiomeLemonForest(82,"Lemon Forest",0x7D9CD9);
	public static final BiomeGenBase fruitForest=new BiomeFruitForest(83,"Fruit Forest",0x1973A8);
	public static final BiomeGenBase bananaGrove=new BiomeBananaGrove(84,"Banana Grove",0x4B8468).setDisableRain();
	public static final BiomeGenBase mangoForest=new BiomeMangoForest(85,"Mango Forest",0x19FFA8);
	public static final BiomeGenBase pearForest=new BiomePearForest(86,"Pear Forest",0x4BFF68);
	public static final BiomeGenBase mapleWoods=new BiomeMapleWoods(87,"Maple Woods",0x2356AF);
	public static final BiomeGenBase oliveWoods=new BiomeOliveWoods(88,"Olive Woods",0x5C9377);
	public static final BiomeGenBase ebonyWoods=new BiomeEbonyWoods(90,"Ebony Woods",0x3A008C);
	public static final BiomeGenBase jacarandaWoods=new BiomeJacarandaWoods(92,"Jacaranda Woods",0x3AFF7C);
	public static final BiomeGenBase endearingWoods=new BiomeEndearingWoods(91,"Endearing Woods",0x111111);
	public static final BiomeGenBase usthericPlains=new BiomeUsthericPlains(89,"Ustheric Plains",0x4B8468);

	public static void init() {
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(cherryForest,4));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(rubberPlains,4));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(lemonForest,4));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(pearForest,4));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(mangoForest,4));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(fruitForest,2));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(mapleWoods,5));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(oliveWoods,5));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(ebonyWoods,5));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(jacarandaWoods,5));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(endearingWoods,3));
		BiomeManager.addBiome(BiomeType.DESERT,new BiomeEntry(bananaGrove,6));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(cherryForest,4));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(rubberPlains,4));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(lemonForest,4));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(pearForest,4));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(mangoForest,4));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(fruitForest,2));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(mapleWoods,5));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(oliveWoods,5));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(ebonyWoods,5));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(jacarandaWoods,5));
		BiomeManager.addBiome(BiomeType.COOL,new BiomeEntry(endearingWoods,3));
		BiomeManager.addBiome(BiomeType.WARM,new BiomeEntry(bananaGrove,3));
		BiomeManager.addVillageBiome(rubberPlains,true);
		BiomeManager.addVillageBiome(bananaGrove,true);
	}
}
