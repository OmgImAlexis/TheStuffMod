package com.omgimalexis.allthethings.init;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

import com.omgimalexis.allthethings.biome.BiomeBananaGrove;
import com.omgimalexis.allthethings.biome.BiomeCherryForest;
import com.omgimalexis.allthethings.biome.BiomeFruitForest;
import com.omgimalexis.allthethings.biome.BiomeLemonForest;
import com.omgimalexis.allthethings.biome.BiomeRubberPlains;

public class ModBiomes {
	public static final BiomeGenBase cherryForest = new BiomeCherryForest(80, "Cherry Forest", 0x7cae9b);
	public static final BiomeGenBase rubberPlains = new BiomeRubberPlains(81, "Rubber-Oak Plains", 0xD8FFF9);
	public static final BiomeGenBase lemonForest = new BiomeLemonForest(82, "Lemon Forest", 0x7D9CD9);
	public static final BiomeGenBase fruitForest = new BiomeFruitForest(83, "Fruit Forest", 0x1973A8);
	public static final BiomeGenBase bananaGrove = new BiomeBananaGrove(84, "Banana Grove", 0x4B8468);
	
	public static final BiomeGenBase usthericPlains = new BiomeBananaGrove(85, "Ustheric Plains", 0x4B8468);
	
	public static void init() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(cherryForest, 6));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(rubberPlains, 6));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(lemonForest, 6));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(fruitForest, 4));
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(bananaGrove, 7));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(cherryForest, 6));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(rubberPlains, 6));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(lemonForest, 6));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(fruitForest, 4));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(bananaGrove, 7));
		
		BiomeManager.addVillageBiome(rubberPlains, true);
		BiomeManager.addVillageBiome(bananaGrove, true);
	}
}
