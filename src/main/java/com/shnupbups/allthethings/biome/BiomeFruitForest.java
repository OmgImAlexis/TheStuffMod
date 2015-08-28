package com.shnupbups.allthethings.biome;

import java.util.Random;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.world.WorldGenModTree;

public class BiomeFruitForest extends BiomeGenBase {
	public BiomeFruitForest(int id,String name,int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier=waterColour;
		this.theBiomeDecorator.treesPerChunk=10;
	}

	public int getModdedBiomeGrassColor(int colour) {
		return 0x7D9C29;
	}

	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random) {
		int i=par1Random.nextInt(6);
		if(i<=1) {
			return new WorldGenModTree(ModBlocks.lemonWood,ModBlocks.lemonLeaves);
		} else if(i<=2) {
			return new WorldGenModTree(ModBlocks.bananaWood,ModBlocks.bananaLeaves);
		} else if(i<=3) {
			return new WorldGenModTree(ModBlocks.pearWood,ModBlocks.pearLeaves);
		} else if(i<=4) {
			return new WorldGenModTree(ModBlocks.mangoWood,ModBlocks.mangoLeaves);
		} else {
			return new WorldGenModTree(ModBlocks.cherryWood,ModBlocks.cherryLeaves);
		}
	}
}
