package com.omgimalexis.allthethings.init;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

import com.omgimalexis.allthethings.biome.BiomeBananaGrove;
import com.omgimalexis.allthethings.biome.BiomeCherryForest;
import com.omgimalexis.allthethings.biome.BiomeFruitForest;
import com.omgimalexis.allthethings.biome.BiomeLemonForest;
import com.omgimalexis.allthethings.biome.BiomeMangoForest;
import com.omgimalexis.allthethings.biome.BiomePearForest;
import com.omgimalexis.allthethings.biome.BiomeRubberPlains;

public class ModBiomes {
	public static final BiomeGenBase cherryForest = new BiomeCherryForest(80, "Cherry Forest", 0x7cae9b);
	public static final BiomeGenBase rubberPlains = new BiomeRubberPlains(81, "Rubber-Oak Plains", 0xD8FFF9);
	public static final BiomeGenBase lemonForest = new BiomeLemonForest(82, "Lemon Forest", 0x7D9CD9);
	public static final BiomeGenBase fruitForest = new BiomeFruitForest(83, "Fruit Forest", 0x1973A8);
	public static final BiomeGenBase bananaGrove = new BiomeBananaGrove(84, "Banana Grove", 0x4B8468);
	public static final BiomeGenBase mangoForest = new BiomeMangoForest(85, "Mango Forest", 0x19FFA8);
	public static final BiomeGenBase pearForest = new BiomePearForest(86, "Pear Forest", 0x4BFF68);
	
	public static final BiomeGenBase usthericPlains = new BiomeBananaGrove(85, "Ustheric Plains", 0x4B8468);
	
	public static void init() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(cherryForest, 5));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(rubberPlains, 5));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(lemonForest, 5));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(pearForest, 5));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(mangoForest, 5));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(fruitForest, 3));
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(bananaGrove, 6));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(cherryForest, 5));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(rubberPlains, 5));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(lemonForest, 5));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(pearForest, 5));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(mangoForest, 5));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(fruitForest, 3));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(bananaGrove, 8));
		
		BiomeManager.addVillageBiome(rubberPlains, true);
		BiomeManager.addVillageBiome(bananaGrove, true);
	}
}
