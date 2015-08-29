package com.shnupbups.allthethings.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityPipe;

public class BlockPipe extends BlockContainer implements IBlockMod {
	public int powerLevel;
	float pixel=1f/16f;

	public BlockPipe(String name) {
		super(Material.ground);
		setBlockName(name);
		this.setBlockBounds(11*pixel/2,11*pixel/2,11*pixel/2,1-11*pixel/2,1-11*pixel/2,1-11*pixel/2);
		this.useNeighborBrightness=true;
		Reference.incrementBlocks();
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world,int x,int y,int z) {
		TileEntityPipe pipe=(TileEntityPipe)world.getTileEntity(x,y,z);
		if(pipe!=null) {
			float minX=11*pixel/2-(pipe.connections[5]!=null? (11*pixel/2):0);
			float minY=11*pixel/2-(pipe.connections[1]!=null? (11*pixel/2):0);
			float minZ=11*pixel/2-(pipe.connections[2]!=null? (11*pixel/2):0);
			float maxZ=1-11*pixel/2+(pipe.connections[4]!=null? (11*pixel/2):0);
			float maxY=1-11*pixel/2+(pipe.connections[0]!=null? (11*pixel/2):0);
			float maxX=1-11*pixel/2+(pipe.connections[3]!=null? (11*pixel/2):0);
			this.setBlockBounds(minX,minY,minZ,maxX,maxY,maxZ);
		}
		return AxisAlignedBB.getBoundingBox(x+this.minX,y+this.minY,z+this.minZ,x+this.maxX,y+this.maxY,z+this.maxZ);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess world,int x,int y,int z) {
		TileEntityPipe pipe=(TileEntityPipe)world.getTileEntity(x,y,z);
		if(pipe!=null) {
			float minX=11*pixel/2-(pipe.connections[5]!=null? (11*pixel/2):0);
			float minY=11*pixel/2-(pipe.connections[1]!=null? (11*pixel/2):0);
			float minZ=11*pixel/2-(pipe.connections[2]!=null? (11*pixel/2):0);
			float maxZ=1-11*pixel/2+(pipe.connections[4]!=null? (11*pixel/2):0);
			float maxY=1-11*pixel/2+(pipe.connections[0]!=null? (11*pixel/2):0);
			float maxX=1-11*pixel/2+(pipe.connections[3]!=null? (11*pixel/2):0);
			this.setBlockBounds(minX,minY,minZ,maxX,maxY,maxZ);
		}
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public TileEntity createNewTileEntity(World world,int metadata) {
		return new TileEntityPipe();
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")+1);
	}
}
