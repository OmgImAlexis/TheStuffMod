package com.shnupbups.allthethings.biome;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.world.WorldGenModTree;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeCherryForest extends BiomeGenBase {
	public BiomeCherryForest(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 10;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0xB0FF6B;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		return new WorldGenModTree(ModBlocks.cherryWood, ModBlocks.cherryLeaves);
	}
}
