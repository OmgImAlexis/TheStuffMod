package com.shnupbups.allthethings.biome;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.world.WorldGenModTree;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeOliveWoods extends BiomeGenBase {
	public BiomeOliveWoods(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 15;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x809377;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		return new WorldGenModTree(ModBlocks.oliveWood, ModBlocks.oliveLeaves, 4, 7, false);
	}
}
