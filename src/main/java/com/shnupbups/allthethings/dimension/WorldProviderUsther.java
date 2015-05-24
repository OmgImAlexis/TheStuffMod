package com.shnupbups.allthethings.dimension;

import com.shnupbups.allthethings.init.ModBiomes;
import com.shnupbups.allthethings.init.ModDimensions;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;

public class WorldProviderUsther extends WorldProvider{

	IRenderHandler skyRenderer;
	
	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return "Usther";
	}
	
	public void registerWorldChunkManager(){
	       this.worldChunkMgr = new WorldChunkManagerHell(ModBiomes.usthericPlains, 9001);
	       this.dimensionId = ModDimensions.usther.id;
	}

	public IChunkProvider createChunkGenerator(){
	       return new ChunkProviderUsther(worldObj, worldObj.getSeed(), true);
	}
	
	@Override
    public Vec3 getSkyColor(Entity cameraEntity, float partialTicks){
         return Vec3.createVectorHelper(0, .5, 0);
    }

    @Override
    public boolean isSkyColored(){
         return true;
    }
    
    @SideOnly(Side.CLIENT)
    public IRenderHandler getSkyRenderer()
    {
	    return new UstherSkyRenderer();
    }
	
}
