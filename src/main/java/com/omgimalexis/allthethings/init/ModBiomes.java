package com.omgimalexis.allthethings.init;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

import com.omgimalexis.allthethings.biome.BiomeCherryForest;
import com.omgimalexis.allthethings.biome.BiomeFruitForest;
import com.omgimalexis.allthethings.biome.BiomeLemonForest;
import com.omgimalexis.allthethings.biome.BiomeRubberPlains;

public class ModBiomes {
	public static final BiomeGenBase cherryForest = new BiomeCherryForest(40, "Cherry Forest", 0x7cae9b);
	public static final BiomeGenBase rubberPlains = new BiomeRubberPlains(41, "Rubber-Oak Plains", 0xD8FFF9);
	public static final BiomeGenBase lemonForest = new BiomeLemonForest(42, "Lemon Forest", 0x7D9CD9);
	public static final BiomeGenBase fruitForest = new BiomeFruitForest(43, "Fruit Forest", 0x1973A8);
	public static final BiomeGenBase bananaGrove = new BiomeFruitForest(44, "Banana Grove", 0x4B8468);
	
	public static void init() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(cherryForest, 10));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(rubberPlains, 10));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(lemonForest, 10));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(fruitForest, 10));
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(bananaGrove, 10));
		
		BiomeManager.addVillageBiome(rubberPlains, true);
		BiomeManager.addVillageBiome(bananaGrove, true);
	}
}
