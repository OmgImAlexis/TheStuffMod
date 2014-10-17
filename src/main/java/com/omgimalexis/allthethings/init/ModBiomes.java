package com.omgimalexis.allthethings.init;

import cpw.mods.fml.common.registry.GameRegistry;

import com.omgimalexis.allthethings.biome.BiomeCherryForest;
import com.omgimalexis.allthethings.biome.BiomeRubberPlains;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ModBiomes {
	public static final BiomeGenBase cherryForest = new BiomeCherryForest(40, "Cherry Forest", 0x7cae9b);
	public static final BiomeGenBase rubberPlains = new BiomeRubberPlains(41, "Rubber-Oak Plains", 0xD8FFF9);
	
	public static void init() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(cherryForest, 10));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(rubberPlains, 10));
		
		BiomeManager.addVillageBiome(rubberPlains, true);
	}
}
