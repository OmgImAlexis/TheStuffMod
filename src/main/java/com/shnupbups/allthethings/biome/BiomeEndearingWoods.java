package com.shnupbups.allthethings.biome;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.world.WorldGenModTree;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeEndearingWoods extends BiomeGenBase {
	public BiomeEndearingWoods(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 9001;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0x3AAA6A;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		int i = par1Random.nextInt(11);
		if(i <= 1) {return new WorldGenModTree(ModBlocks.ebonyWood, ModBlocks.ebonyLeaves, 10, 1, false);}
		else if(i <= 2) {return new WorldGenModTree(ModBlocks.oliveWood, ModBlocks.oliveLeaves, 10, 1, false);}
		else if(i <= 3) {return new WorldGenModTree(ModBlocks.mapleWood, ModBlocks.mapleLeaves, 10, 1, false);}
		else if(i <= 4) {return new WorldGenModTree(ModBlocks.jacarandaWood, ModBlocks.jacarandaLeaves, 10, 1, false);}
		else if(i <= 5) {return new WorldGenModTree(ModBlocks.rubberWood, ModBlocks.rubberLeaves, 10, 1, false);}
		else if(i <= 6) {return new WorldGenModTree(Blocks.log2, Blocks.leaves2, 1, 1, false, 10, 1, false);}
		else if(i <= 7) {return new WorldGenModTree(ModBlocks.ebonyWood, ModBlocks.ebonyLeaves, 10, 1, true);}
		else if(i <= 8) {return new WorldGenModTree(ModBlocks.oliveWood, ModBlocks.oliveLeaves, 10, 1, true);}
		else if(i <= 9) {return new WorldGenModTree(ModBlocks.mapleWood, ModBlocks.mapleLeaves, 10, 1, true);}
		else if(i <= 10) {return new WorldGenModTree(ModBlocks.jacarandaWood, ModBlocks.jacarandaLeaves, 10, 1, true);}
		else if(i <= 11) {return new WorldGenModTree(ModBlocks.rubberWood, ModBlocks.rubberLeaves, 10, 1, true);}
		else {return new WorldGenModTree(Blocks.log2, Blocks.leaves2, 1, 1, false, 10, 1, true);}
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float par1) {
        return 0x000000;
    }
}
