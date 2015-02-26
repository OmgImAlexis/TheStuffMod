package com.omgimalexis.allthethings.dimension;

import com.omgimalexis.allthethings.init.ModBiomes;
import com.omgimalexis.allthethings.init.ModDimensions;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderGenerate;

public class WorldProviderUsther extends WorldProvider{

	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return "Usther";
	}
	
	public void registerWorldChunkManager(){
	       this.worldChunkMgr = new WorldChunkManagerHell(ModBiomes.usthericPlains, 0.8F);
	       this.dimensionId = ModDimensions.usther.id;
	}

	public IChunkProvider createChunkGenerator(){
	       return new ChunkProviderUsther(worldObj, worldObj.getSeed(), true);
	}
	
}
