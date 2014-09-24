package omgimalexis.allthethings.biome;

import java.util.Random;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.world.WorldGenModTree;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeRubberPlains extends BiomeGenBase {
	public BiomeRubberPlains(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 2;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0xAEC65D;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random rand){
		int l = rand.nextInt(2);
		if(l == 0) {return new WorldGenModTree(ModBlocks.rubberWood, ModBlocks.rubberLeaves);}
		else {return new WorldGenTrees(false);}
	}
}