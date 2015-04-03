package com.omgimalexis.allthethings.biome;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.world.WorldGenModTree;

public class BiomePearForest extends BiomeGenBase {
	public BiomePearForest(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 10;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x7DFF29;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		return new WorldGenModTree(ModBlocks.pearWood, ModBlocks.pearLeaves);
	}
}
