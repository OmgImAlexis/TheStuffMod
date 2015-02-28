package com.omgimalexis.allthethings.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.world.WorldGenModTree;

public class BiomeUsthericPlains extends BiomeGenBase {
	public BiomeUsthericPlains(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 3;
		this.topBlock = ModBlocks.blockVoidium;
        this.fillerBlock = ModBlocks.granite;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x877C40;
	}
}
