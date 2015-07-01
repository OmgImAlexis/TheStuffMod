package com.shnupbups.allthethings.biome;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.world.WorldGenModTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeJacarandaWoods extends BiomeGenBase {
	public BiomeJacarandaWoods(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 15;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0xD27000;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		return new WorldGenModTree(ModBlocks.jacarandaWood, ModBlocks.jacarandaLeaves, 4, 7, false);
	}
}
