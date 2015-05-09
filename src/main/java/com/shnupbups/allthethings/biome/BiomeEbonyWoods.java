package com.shnupbups.allthethings.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.world.WorldGenModTree;

public class BiomeEbonyWoods extends BiomeGenBase {
	public BiomeEbonyWoods(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 15;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x5CDD4C;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		return new WorldGenModTree(ModBlocks.ebonyWood, ModBlocks.ebonyLeaves, 4, 7, false);
	}
}
