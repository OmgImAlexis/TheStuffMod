package com.omgimalexis.allthethings.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;

import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.world.WorldGenModTree;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeEndearingWoods extends BiomeGenBase {
	public BiomeEndearingWoods(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 30;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x111111;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		int i = par1Random.nextInt(11);
		if(i <= 1) {return new WorldGenModTree(ModBlocks.ebonyWood, ModBlocks.ebonyLeaves, 3, 9, false);}
		else if(i <= 2) {return new WorldGenModTree(ModBlocks.oliveWood, ModBlocks.oliveLeaves, 3, 9, false);}
		else if(i <= 3) {return new WorldGenModTree(ModBlocks.mapleWood, ModBlocks.mapleLeaves, 3, 9, false);}
		else if(i <= 4) {return new WorldGenModTree(ModBlocks.rubberWood, ModBlocks.rubberLeaves, 3, 9, false);}
		else if(i <= 5) {return new WorldGenModTree(Blocks.log2, Blocks.leaves2, 1, 1, false, 3, 9, false);}
		else if(i <= 6) {return new WorldGenModTree(ModBlocks.ebonyWood, ModBlocks.ebonyLeaves, 3, 9, true);}
		else if(i <= 7) {return new WorldGenModTree(ModBlocks.oliveWood, ModBlocks.oliveLeaves, 3, 9, true);}
		else if(i <= 8) {return new WorldGenModTree(ModBlocks.mapleWood, ModBlocks.mapleLeaves, 3, 9, true);}
		else if(i <= 9) {return new WorldGenModTree(ModBlocks.rubberWood, ModBlocks.rubberLeaves, 3, 9, true);}
		else {return new WorldGenModTree(Blocks.log2, Blocks.leaves2, 1, 1, false, 3, 9, true);}
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float par1) {
        return 0x00497A;
    }
}
