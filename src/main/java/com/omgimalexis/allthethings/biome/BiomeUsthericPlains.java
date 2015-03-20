package com.omgimalexis.allthethings.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.world.WorldGenModTree;

public class BiomeUsthericPlains extends BiomeGenBase {
	public BiomeUsthericPlains(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 3;
		this.topBlock = ModBlocks.ustherite;
        this.fillerBlock = ModBlocks.ustherite;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x877C40;
	}
	
	public WorldGenerator getRandomWorldGenForGrass(Random p_76730_1_)
    {
        return new WorldGenTallGrass(ModBlocks.physhroom, 0);
    }
}
