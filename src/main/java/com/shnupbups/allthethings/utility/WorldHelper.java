package com.shnupbups.allthethings.utility;

import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.ChunkProviderServer;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldHelper {
	public static int[] getNearestBlockOfType(IBlockAccess world,Block type,int x,int y,int z,int range) {
		if(world.getBlock(x,y,z)==type) {
			return new int[]{x,y,z};
		}
		for(int i=1;i<=range;i++) {
			for(int j=1;j<=range;j++) {
				for(int k=1;k<=range;k++) {
					for(int q=0;q<i;q++) {
						for(int r=0;r<j;r++) {
							for(int s=0;s<k;s++) {
								if(world.getBlock(x+i,y+r,z+s)==type) {
									return new int[]{(x+i),y+r,(z+s)};
								}
								if(world.getBlock(x+i,y+r,z-s)==type) {
									return new int[]{(x+i),y+r,(z-s)};
								}
								if(world.getBlock(x+i,y-r,z+s)==type) {
									return new int[]{(x+i),y-r,(z+s)};
								}
								if(world.getBlock(x+i,y-r,z-s)==type) {
									return new int[]{(x+i),y-r,(z-s)};
								}
								if(world.getBlock(x-i,y+r,z+s)==type) {
									return new int[]{(x-i),y+r,(z+s)};
								}
								if(world.getBlock(x-i,y+r,z-s)==type) {
									return new int[]{(x-i),y+r,(z-s)};
								}
								if(world.getBlock(x-i,y-r,z+s)==type) {
									return new int[]{(x-i),y-r,(z+s)};
								}
								if(world.getBlock(x-i,y-r,z-s)==type) {
									return new int[]{(x-i),y-r,(z-s)};
								}
								if(world.getBlock(x+q,y+j,z+s)==type) {
									return new int[]{(x+q),y+j,(z+s)};
								}
								if(world.getBlock(x+q,y+j,z-s)==type) {
									return new int[]{(x+q),y+j,(z-s)};
								}
								if(world.getBlock(x+q,y-j,z+s)==type) {
									return new int[]{(x+q),y-j,(z+s)};
								}
								if(world.getBlock(x+q,y-j,z-s)==type) {
									return new int[]{(x+q),y-j,(z-s)};
								}
								if(world.getBlock(x-q,y+j,z+s)==type) {
									return new int[]{(x-q),y+j,(z+s)};
								}
								if(world.getBlock(x-q,y+j,z-s)==type) {
									return new int[]{(x-q),y+j,(z-s)};
								}
								if(world.getBlock(x-q,y-j,z+s)==type) {
									return new int[]{(x-q),y-j,(z+s)};
								}
								if(world.getBlock(x-q,y-j,z-s)==type) {
									return new int[]{(x-q),y-j,(z-s)};
								}
								if(world.getBlock(x+q,y+r,z+k)==type) {
									return new int[]{(x+q),y+r,(z+k)};
								}
								if(world.getBlock(x+q,y+r,z-k)==type) {
									return new int[]{(x+q),y+r,(z-k)};
								}
								if(world.getBlock(x+q,y-r,z+k)==type) {
									return new int[]{(x+q),y-r,(z+k)};
								}
								if(world.getBlock(x+q,y-r,z-k)==type) {
									return new int[]{(x+q),y-r,(z-k)};
								}
								if(world.getBlock(x-q,y+r,z+k)==type) {
									return new int[]{(x-q),y+r,(z+k)};
								}
								if(world.getBlock(x-q,y+r,z-k)==type) {
									return new int[]{(x-q),y+r,(z-k)};
								}
								if(world.getBlock(x-q,y-r,z+k)==type) {
									return new int[]{(x-q),y-r,(z+k)};
								}
								if(world.getBlock(x-q,y-r,z-k)==type) {
									return new int[]{(x-q),y-r,(z-k)};
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static int[] getNearestBlockOfType(IBlockAccess world,Class type,int x,int y,int z,int range) {
		if(type.isInstance(world.getBlock(x,y,z))) {
			return new int[]{x,y,z};
		}
		for(int i=1;i<=range;i++) {
			for(int j=1;j<=range;j++) {
				for(int k=1;k<=range;k++) {
					for(int q=0;q<i;q++) {
						for(int r=0;r<j;r++) {
							for(int s=0;s<k;s++) {
								if(type.isInstance(world.getBlock(x+i,y+r,z+s))) {
									return new int[]{(x+i),y+r,(z+s)};
								}
								if(type.isInstance(world.getBlock(x+i,y+r,z-s))) {
									return new int[]{(x+i),y+r,(z-s)};
								}
								if(type.isInstance(world.getBlock(x+i,y-r,z+s))) {
									return new int[]{(x+i),y-r,(z+s)};
								}
								if(type.isInstance(world.getBlock(x+i,y-r,z-s))) {
									return new int[]{(x+i),y-r,(z-s)};
								}
								if(type.isInstance(world.getBlock(x-i,y+r,z+s))) {
									return new int[]{(x-i),y+r,(z+s)};
								}
								if(type.isInstance(world.getBlock(x-i,y+r,z-s))) {
									return new int[]{(x-i),y+r,(z-s)};
								}
								if(type.isInstance(world.getBlock(x-i,y-r,z+s))) {
									return new int[]{(x-i),y-r,(z+s)};
								}
								if(type.isInstance(world.getBlock(x-i,y-r,z-s))) {
									return new int[]{(x-i),y-r,(z-s)};
								}
								if(type.isInstance(world.getBlock(x+q,y+j,z+s))) {
									return new int[]{(x+q),y+j,(z+s)};
								}
								if(type.isInstance(world.getBlock(x+q,y+j,z-s))) {
									return new int[]{(x+q),y+j,(z-s)};
								}
								if(type.isInstance(world.getBlock(x+q,y-j,z+s))) {
									return new int[]{(x+q),y-j,(z+s)};
								}
								if(type.isInstance(world.getBlock(x+q,y-j,z-s))) {
									return new int[]{(x+q),y-j,(z-s)};
								}
								if(type.isInstance(world.getBlock(x-q,y+j,z+s))) {
									return new int[]{(x-q),y+j,(z+s)};
								}
								if(type.isInstance(world.getBlock(x-q,y+j,z-s))) {
									return new int[]{(x-q),y+j,(z-s)};
								}
								if(type.isInstance(world.getBlock(x-q,y-j,z+s))) {
									return new int[]{(x-q),y-j,(z+s)};
								}
								if(type.isInstance(world.getBlock(x-q,y-j,z-s))) {
									return new int[]{(x-q),y-j,(z-s)};
								}
								if(type.isInstance(world.getBlock(x+q,y+r,z+k))) {
									return new int[]{(x+q),y+r,(z+k)};
								}
								if(type.isInstance(world.getBlock(x+q,y+r,z-k))) {
									return new int[]{(x+q),y+r,(z-k)};
								}
								if(type.isInstance(world.getBlock(x+q,y-r,z+k))) {
									return new int[]{(x+q),y-r,(z+k)};
								}
								if(type.isInstance(world.getBlock(x+q,y-r,z-k))) {
									return new int[]{(x+q),y-r,(z-k)};
								}
								if(type.isInstance(world.getBlock(x-q,y+r,z+k))) {
									return new int[]{(x-q),y+r,(z+k)};
								}
								if(type.isInstance(world.getBlock(x-q,y+r,z-k))) {
									return new int[]{(x-q),y+r,(z-k)};
								}
								if(type.isInstance(world.getBlock(x-q,y-r,z+k))) {
									return new int[]{(x-q),y-r,(z+k)};
								}
								if(type.isInstance(world.getBlock(x-q,y-r,z-k))) {
									return new int[]{(x-q),y-r,(z-k)};
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static ArrayList<int[]> getCloseBlocksOfType(IBlockAccess world,Block type,int x,int y,int z,int range) {
		ArrayList list=new ArrayList();
		if(world.getBlock(x,y,z)==type) {
			list.add(new int[]{x,y,z});
		}
		for(int i=1;i<=range;i++) {
			for(int j=1;j<=range;j++) {
				for(int k=1;k<=range;k++) {
					for(int q=0;q<i;q++) {
						for(int r=0;r<j;r++) {
							for(int s=0;s<k;s++) {
								if(world.getBlock(x+i,y+r,z+s)==type) {
									list.add(new int[]{(x+i),y+r,(z+s)});
								}
								if(world.getBlock(x+i,y+r,z-s)==type) {
									list.add(new int[]{(x+i),y+r,(z-s)});
								}
								if(world.getBlock(x+i,y-r,z+s)==type) {
									list.add(new int[]{(x+i),y-r,(z+s)});
								}
								if(world.getBlock(x+i,y-r,z-s)==type) {
									list.add(new int[]{(x+i),y-r,(z-s)});
								}
								if(world.getBlock(x-i,y+r,z+s)==type) {
									list.add(new int[]{(x-i),y+r,(z+s)});
								}
								if(world.getBlock(x-i,y+r,z-s)==type) {
									list.add(new int[]{(x-i),y+r,(z-s)});
								}
								if(world.getBlock(x-i,y-r,z+s)==type) {
									list.add(new int[]{(x-i),y-r,(z+s)});
								}
								if(world.getBlock(x-i,y-r,z-s)==type) {
									list.add(new int[]{(x-i),y-r,(z-s)});
								}
								if(world.getBlock(x+q,y+j,z+s)==type) {
									list.add(new int[]{(x+q),y+j,(z+s)});
								}
								if(world.getBlock(x+q,y+j,z-s)==type) {
									list.add(new int[]{(x+q),y+j,(z-s)});
								}
								if(world.getBlock(x+q,y-j,z+s)==type) {
									list.add(new int[]{(x+q),y-j,(z+s)});
								}
								if(world.getBlock(x+q,y-j,z-s)==type) {
									list.add(new int[]{(x+q),y-j,(z-s)});
								}
								if(world.getBlock(x-q,y+j,z+s)==type) {
									list.add(new int[]{(x-q),y+j,(z+s)});
								}
								if(world.getBlock(x-q,y+j,z-s)==type) {
									list.add(new int[]{(x-q),y+j,(z-s)});
								}
								if(world.getBlock(x-q,y-j,z+s)==type) {
									list.add(new int[]{(x-q),y-j,(z+s)});
								}
								if(world.getBlock(x-q,y-j,z-s)==type) {
									list.add(new int[]{(x-q),y-j,(z-s)});
								}
								if(world.getBlock(x+q,y+r,z+k)==type) {
									list.add(new int[]{(x+q),y+r,(z+k)});
								}
								if(world.getBlock(x+q,y+r,z-k)==type) {
									list.add(new int[]{(x+q),y+r,(z-k)});
								}
								if(world.getBlock(x+q,y-r,z+k)==type) {
									list.add(new int[]{(x+q),y-r,(z+k)});
								}
								if(world.getBlock(x+q,y-r,z-k)==type) {
									list.add(new int[]{(x+q),y-r,(z-k)});
								}
								if(world.getBlock(x-q,y+r,z+k)==type) {
									list.add(new int[]{(x-q),y+r,(z+k)});
								}
								if(world.getBlock(x-q,y+r,z-k)==type) {
									list.add(new int[]{(x-q),y+r,(z-k)});
								}
								if(world.getBlock(x-q,y-r,z+k)==type) {
									list.add(new int[]{(x-q),y-r,(z+k)});
								}
								if(world.getBlock(x-q,y-r,z-k)==type) {
									list.add(new int[]{(x-q),y-r,(z-k)});
								}
							}
						}
					}
				}
			}
		}
		return list;
	}

	public static ArrayList<int[]> getCloseBlocksOfType(IBlockAccess world,Class type,int x,int y,int z,int range) {
		ArrayList list=new ArrayList();
		if(type.isInstance(world.getBlock(x,y,z))) {
			list.add(new int[]{x,y,z});
		}
		for(int i=1;i<=range;i++) {
			for(int j=1;j<=range;j++) {
				for(int k=1;k<=range;k++) {
					for(int q=0;q<i;q++) {
						for(int r=0;r<j;r++) {
							for(int s=0;s<k;s++) {
								if(type.isInstance(world.getBlock(x+i,y+r,z+s))) {
									list.add(new int[]{(x+i),y+r,(z+s)});
								}
								if(type.isInstance(world.getBlock(x+i,y+r,z-s))) {
									list.add(new int[]{(x+i),y+r,(z-s)});
								}
								if(type.isInstance(world.getBlock(x+i,y-r,z+s))) {
									list.add(new int[]{(x+i),y-r,(z+s)});
								}
								if(type.isInstance(world.getBlock(x+i,y-r,z-s))) {
									list.add(new int[]{(x+i),y-r,(z-s)});
								}
								if(type.isInstance(world.getBlock(x-i,y+r,z+s))) {
									list.add(new int[]{(x-i),y+r,(z+s)});
								}
								if(type.isInstance(world.getBlock(x-i,y+r,z-s))) {
									list.add(new int[]{(x-i),y+r,(z-s)});
								}
								if(type.isInstance(world.getBlock(x-i,y-r,z+s))) {
									list.add(new int[]{(x-i),y-r,(z+s)});
								}
								if(type.isInstance(world.getBlock(x-i,y-r,z-s))) {
									list.add(new int[]{(x-i),y-r,(z-s)});
								}
								if(type.isInstance(world.getBlock(x+q,y+j,z+s))) {
									list.add(new int[]{(x+q),y+j,(z+s)});
								}
								if(type.isInstance(world.getBlock(x+q,y+j,z-s))) {
									list.add(new int[]{(x+q),y+j,(z-s)});
								}
								if(type.isInstance(world.getBlock(x+q,y-j,z+s))) {
									list.add(new int[]{(x+q),y-j,(z+s)});
								}
								if(type.isInstance(world.getBlock(x+q,y-j,z-s))) {
									list.add(new int[]{(x+q),y-j,(z-s)});
								}
								if(type.isInstance(world.getBlock(x-q,y+j,z+s))) {
									list.add(new int[]{(x-q),y+j,(z+s)});
								}
								if(type.isInstance(world.getBlock(x-q,y+j,z-s))) {
									list.add(new int[]{(x-q),y+j,(z-s)});
								}
								if(type.isInstance(world.getBlock(x-q,y-j,z+s))) {
									list.add(new int[]{(x-q),y-j,(z+s)});
								}
								if(type.isInstance(world.getBlock(x-q,y-j,z-s))) {
									list.add(new int[]{(x-q),y-j,(z-s)});
								}
								if(type.isInstance(world.getBlock(x+q,y+r,z+k))) {
									list.add(new int[]{(x+q),y+r,(z+k)});
								}
								if(type.isInstance(world.getBlock(x+q,y+r,z-k))) {
									list.add(new int[]{(x+q),y+r,(z-k)});
								}
								if(type.isInstance(world.getBlock(x+q,y-r,z+k))) {
									list.add(new int[]{(x+q),y-r,(z+k)});
								}
								if(type.isInstance(world.getBlock(x+q,y-r,z-k))) {
									list.add(new int[]{(x+q),y-r,(z-k)});
								}
								if(type.isInstance(world.getBlock(x-q,y+r,z+k))) {
									list.add(new int[]{(x-q),y+r,(z+k)});
								}
								if(type.isInstance(world.getBlock(x-q,y+r,z-k))) {
									list.add(new int[]{(x-q),y+r,(z-k)});
								}
								if(type.isInstance(world.getBlock(x-q,y-r,z+k))) {
									list.add(new int[]{(x-q),y-r,(z+k)});
								}
								if(type.isInstance(world.getBlock(x-q,y-r,z-k))) {
									list.add(new int[]{(x-q),y-r,(z-k)});
								}
							}
						}
					}
				}
			}
		}
		return list;
	}

	public static void fillAreaWithBlock(World world,BlockArea area,Block block,int meta,boolean replace,boolean notify) {
		area.fillWithBlock(world,block,meta,replace,notify);
	}

	public static void fillAreaWithBlock(World world,BlockArea area,Block block,boolean replace,boolean notify) {
		fillAreaWithBlock(world,area,block,0,replace,notify);
	}

	public static void fillAreaWithBlock(World world,BlockArea area,Block block,int meta,boolean replace) {
		fillAreaWithBlock(world,area,block,meta,replace,true);
	}

	public static void fillAreaWithBlock(World world,BlockArea area,Block block,boolean replace) {
		fillAreaWithBlock(world,area,block,0,replace,true);
	}

	public static void fillAreaWithBlock(World world,BlockArea area,Block block,int meta) {
		fillAreaWithBlock(world,area,block,meta,true,true);
	}

	public static void fillAreaWithBlock(World world,BlockArea area,Block block) {
		fillAreaWithBlock(world,area,block,0,true,true);
	}

	public static void fillAreaWithBlock(World world,BlockPos start,BlockPos end,Block block,int meta,boolean replace,boolean notify) {
		fillAreaWithBlock(world,new BlockArea(start,end),block,meta,replace,notify);
	}

	public static void fillAreaWithBlock(World world,BlockPos start,BlockPos end,Block block,boolean replace,boolean notify) {
		fillAreaWithBlock(world,new BlockArea(start,end),block,0,replace,notify);
	}

	public static void fillAreaWithBlock(World world,BlockPos start,BlockPos end,Block block,int meta,boolean replace) {
		fillAreaWithBlock(world,new BlockArea(start,end),block,meta,replace,true);
	}

	public static void fillAreaWithBlock(World world,BlockPos start,BlockPos end,Block block,boolean replace) {
		fillAreaWithBlock(world,new BlockArea(start,end),block,0,replace,true);
	}

	public static void fillAreaWithBlock(World world,BlockPos start,BlockPos end,Block block,int meta) {
		fillAreaWithBlock(world,new BlockArea(start,end),block,meta,true,true);
	}

	public static void fillAreaWithBlock(World world,BlockPos start,BlockPos end,Block block) {
		fillAreaWithBlock(world,new BlockArea(start,end),block,0,true,true);
	}

	public static void fillAreaWithBlock(World world,int startX,int startY,int startZ,int endX,int endY,int endZ,Block block,int meta,boolean replace,boolean notify) {
		fillAreaWithBlock(world,new BlockArea(startX,startY,startZ,endX,endY,endZ),block,meta,replace,notify);
	}

	public static void fillAreaWithBlock(World world,int startX,int startY,int startZ,int endX,int endY,int endZ,Block block,boolean replace,boolean notify) {
		fillAreaWithBlock(world,new BlockArea(startX,startY,startZ,endX,endY,endZ),block,0,replace,notify);
	}

	public static void fillAreaWithBlock(World world,int startX,int startY,int startZ,int endX,int endY,int endZ,Block block,int meta,boolean replace) {
		fillAreaWithBlock(world,new BlockArea(startX,startY,startZ,endX,endY,endZ),block,meta,replace,true);
	}

	public static void fillAreaWithBlock(World world,int startX,int startY,int startZ,int endX,int endY,int endZ,Block block,boolean replace) {
		fillAreaWithBlock(world,new BlockArea(startX,startY,startZ,endX,endY,endZ),block,0,replace,true);
	}

	public static void fillAreaWithBlock(World world,int startX,int startY,int startZ,int endX,int endY,int endZ,Block block,int meta) {
		fillAreaWithBlock(world,new BlockArea(startX,startY,startZ,endX,endY,endZ),block,meta,true,true);
	}

	public static void fillAreaWithBlock(World world,int startX,int startY,int startZ,int endX,int endY,int endZ,Block block) {
		fillAreaWithBlock(world,new BlockArea(startX,startY,startZ,endX,endY,endZ),block,0,true,true);
	}

	public static BlockArea getChunkAsArea(World world,int chunkX,int chunkZ) {
		if(world.getChunkProvider().chunkExists(chunkX,chunkZ)) {
			int posX=chunkX*16;
			int posZ=chunkZ*16;
			return new BlockArea(posX,0,posZ,posX+16,world.getHeight(),posZ+16);
		}
		return null;
	}

	public static class BlockPos {
		public int x,y,z;

		public BlockPos(int x,int y,int z) {
			this.x=x;
			this.y=y;
			this.z=z;
		}

		public BlockPos(Vec3 pos) {
			this.x=(int)pos.xCoord;
			this.y=(int)pos.yCoord;
			this.z=(int)pos.zCoord;
		}

		public BlockPos(int[] pos) {
			this.x=pos[0];
			this.y=pos[1];
			this.z=pos[2];
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public int getZ() {
			return z;
		}

		public BlockPos setX(int x) {
			this.x=x;
			return this;
		}

		public BlockPos setY(int y) {
			this.y=y;
			return this;
		}

		public BlockPos setZ(int z) {
			this.z=z;
			return this;
		}

		public BlockPos offset(int x,int y,int z) {
			this.x+=x;
			this.y+=y;
			this.z+=z;
			return this;
		}

		public BlockPos offsetX(int offset) {
			this.x+=offset;
			return this;
		}

		public BlockPos offsetY(int offset) {
			this.y+=offset;
			return this;
		}

		public BlockPos offsetZ(int offset) {
			this.z+=offset;
			return this;
		}

		public int[] getPos() {
			return new int[]{x,y,z};
		}

		public BlockPos setPos(int x,int y,int z) {
			this.x=x;
			this.y=y;
			this.z=z;
			return this;
		}

		public BlockPos setPos(int[] pos) {
			this.x=pos[0];
			this.y=pos[1];
			this.z=pos[2];
			return this;
		}

		public Block getBlock(IBlockAccess world) {
			return world.getBlock(x,y,z);
		}

		public Block getBlockAt(IBlockAccess world,ForgeDirection dir) {
			return world.getBlock(x+dir.offsetX,y+dir.offsetY,z+dir.offsetZ);
		}

		public BlockPos setBlock(World world,Block block,int meta,boolean replace,boolean notify) {
			if(replace||this.getBlock(world)==Blocks.air) world.setBlock(x,y,z,block,meta,notify? 3:2);
			return this;
		}

		public BlockPos setBlock(World world,Block block,int meta,boolean replace) {
			return setBlock(world,block,meta,replace,true);
		}

		public BlockPos setBlock(World world,Block block,boolean replace,boolean notify) {
			return setBlock(world,block,0,replace,notify);
		}

		public BlockPos setBlock(World world,Block block,boolean replace) {
			return setBlock(world,block,replace,true);
		}

		public BlockPos setBlock(World world,Block block,int meta) {
			return setBlock(world,block,0,true);
		}

		public BlockPos setBlock(World world,Block block) {
			return setBlock(world,block,true);
		}

		public String toString() {
			return x+","+y+","+z;
		}
	}
	public static class BlockArea {
		public BlockPos start,end;

		public BlockArea(int startX,int startY,int startZ,int endX,int endY,int endZ) {
			this.start=new BlockPos(startX,startY,startZ);
			this.end=new BlockPos(endX,endY,endZ);
		}

		public BlockArea(BlockPos start,BlockPos end) {
			this.start=start;
			this.end=end;
		}

		public BlockArea(StructureBoundingBox box) {
			this.start=new BlockPos(box.minX,box.minY,box.minZ);
			this.end=new BlockPos(box.maxX,box.maxY,box.maxZ);
		}

		public BlockArea(Vec3 start,Vec3 end) {
			this.start=new BlockPos(start);
			this.end=new BlockPos(end);
		}

		public int getStartX() {
			return start.x;
		}

		public int getStartY() {
			return start.y;
		}

		public int getStartZ() {
			return start.z;
		}

		public int getEndX() {
			return end.x;
		}

		public int getEndY() {
			return end.y;
		}

		public int getEndZ() {
			return end.z;
		}

		public BlockPos getStart() {
			return start;
		}

		public BlockPos getEnd() {
			return end;
		}

		public int getWidth() {
			return Math.max(start.x,end.x)-Math.min(start.x,end.x)+1;
		}

		public int getLength() {
			return Math.max(start.z,end.z)-Math.min(start.z,end.z)+1;
		}

		public int getHeight() {
			return Math.max(start.y,end.y)-Math.min(start.y,end.y)+1;
		}

		public int getVolume() {
			return getWidth()*getLength()*getHeight();
		}

		public boolean intersects(BlockArea area) {
			return this.getEndX()>=area.getStartX()&&this.getStartX()<=area.getEndX()&&this.getEndZ()>=area.getStartZ()&&this.getStartZ()<=area.getEndZ()&&this.getEndY()>=area.getStartY()&&this.getStartY()<=area.getEndY();
		}

		public boolean intersects(BlockPos pos) {
			return this.getEndX()>=pos.getX()&&this.getStartX()<=pos.getX()&&this.getEndZ()>=pos.getZ()&&this.getStartZ()<=pos.getZ()&&this.getEndY()>=pos.getY()&&this.getStartY()<=pos.getY();
		}

		public boolean intersects(int x,int y,int z) {
			return intersects(new BlockPos(x,y,z));
		}

		public boolean intersects(BlockPos start,BlockPos end) {
			return intersects(new BlockArea(start,end));
		}

		public boolean intersects(Vec3 pos) {
			return intersects(new BlockPos(pos));
		}

		public boolean intersects(Vec3 start,Vec3 end) {
			return intersects(new BlockArea(start,end));
		}

		public boolean intersects(int startX,int startY,int startZ,int endX,int endY,int endZ) {
			return intersects(new BlockArea(startX,startY,startZ,endX,endY,endZ));
		}

		public boolean intersects(StructureBoundingBox area) {
			return this.getEndX()>=area.minX&&this.getStartX()<=area.maxX&&this.getEndZ()>=area.minZ&&this.getStartZ()<=area.maxZ&&this.getEndY()>=area.minY&&this.getStartY()<=area.minZ;
		}

		public BlockArea offset(int x,int y,int z) {
			this.start=new BlockPos(start.x+x,start.y+y,start.z+z);
			this.end=new BlockPos(end.x+x,end.y+y,end.z+z);
			return this;
		}

		public BlockArea offsetX(int offset) {
			this.start.setX(start.x+offset);
			this.end.setX(start.x+offset);
			return this;
		}

		public BlockArea offsetY(int offset) {
			this.start.setY(start.y+offset);
			this.end.setY(start.y+offset);
			return this;
		}

		public BlockArea offsetZ(int offset) {
			this.start.setZ(start.z+offset);
			this.end.setZ(start.z+offset);
			return this;
		}

		public BlockArea expandTo(BlockArea area) {
			this.start.setX(Math.min(this.start.x,area.start.x));
			this.start.setY(Math.min(this.start.y,area.start.y));
			this.start.setZ(Math.min(this.start.z,area.start.z));
			this.end.setX(Math.max(this.end.x,area.end.x));
			this.end.setY(Math.max(this.end.y,area.end.y));
			this.end.setZ(Math.max(this.end.z,area.end.z));
			return this;
		}

		public int getCenterX() {
			return this.start.x+(this.end.x-this.start.x+1)/2;
		}

		public int getCenterY() {
			return this.start.y+(this.end.y-this.start.y+1)/2;
		}

		public int getCenterZ() {
			return this.start.z+(this.end.z-this.start.z+1)/2;
		}

		public BlockPos getCenter() {
			return new BlockPos(getCenterX(),getCenterY(),getCenterZ());
		}

		public BlockArea setBlockIn(World world,int offX,int offY,int offZ,Block block,int meta,boolean replace,boolean notify) {
			BlockPos pos=new BlockPos(start.x+offX,start.y+offY,start.z+offZ);
			if(intersects(pos)) {
				pos.setBlock(world,block,meta,replace,notify);
			}
			return this;
		}

		public BlockArea setBlockIn(World world,int offX,int offY,int offZ,Block block,int meta,boolean replace) {
			return this.setBlockIn(world,offX,offY,offZ,block,meta,replace,true);
		}

		public BlockArea setBlockIn(World world,int offX,int offY,int offZ,Block block,boolean replace,boolean notify) {
			return this.setBlockIn(world,offX,offY,offZ,block,0,replace,notify);
		}

		public BlockArea setBlockIn(World world,int offX,int offY,int offZ,Block block,boolean replace) {
			return this.setBlockIn(world,offX,offY,offZ,block,0,replace);
		}

		public BlockArea setBlockIn(World world,int offX,int offY,int offZ,Block block,int meta) {
			return this.setBlockIn(world,offX,offY,offZ,block,meta,true);
		}

		public BlockArea setBlockIn(World world,int offX,int offY,int offZ,Block block) {
			return this.setBlockIn(world,offX,offY,offZ,block,0);
		}

		public Block getBlockIn(IBlockAccess world,int offX,int offY,int offZ) {
			BlockPos pos=new BlockPos(start.x+offX,start.y+offY,start.z+offZ);
			if(intersects(pos)) {
				return pos.getBlock(world);
			}
			return null;
		}

		public BlockArea fillWithBlock(World world,Block block,int meta,boolean replace,boolean notify) {
			for(int x=Math.min(start.x,end.x);x<=Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<=Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<=Math.max(start.z,end.z);z++) {
						if(replace||world.isAirBlock(x,y,z)) {
							world.setBlock(x,y,z,block,meta,notify? 3:2);
						}
					}
				}
			}
			return this;
		}

		public BlockArea fillWithBlock(World world,Block block,boolean replace,boolean notify) {
			return fillWithBlock(world,block,0,replace,notify);
		}

		public BlockArea fillWithBlock(World world,Block block,int meta,boolean replace) {
			return fillWithBlock(world,block,meta,replace,true);
		}

		public BlockArea fillWithBlock(World world,Block block,boolean replace) {
			return fillWithBlock(world,block,0,replace,true);
		}

		public BlockArea fillWithBlock(World world,Block block,int meta) {
			return fillWithBlock(world,block,meta,true,true);
		}

		public BlockArea fillWithBlock(World world,Block block) {
			return fillWithBlock(world,block,0,true,true);
		}

		public BlockArea fillWithBlockChance(World world,Block block,int meta,boolean replace,boolean notify,int chance) {
			for(int x=Math.min(start.x,end.x);x<=Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<=Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<=Math.max(start.z,end.z);z++) {
						if(replace||world.isAirBlock(x,y,z)) {
							if(world.rand.nextInt(100)<=chance) world.setBlock(x,y,z,block,meta,notify? 3:2);
						}
					}
				}
			}
			return this;
		}

		public BlockArea fillWithBlockChance(World world,Block block,boolean replace,boolean notify,int chance) {
			return fillWithBlockChance(world,block,0,replace,notify,chance);
		}

		public BlockArea fillWithBlockChance(World world,Block block,int meta,boolean replace,int chance) {
			return fillWithBlockChance(world,block,meta,replace,true,chance);
		}

		public BlockArea fillWithBlockChance(World world,Block block,boolean replace,int chance) {
			return fillWithBlockChance(world,block,0,replace,true,chance);
		}

		public BlockArea fillWithBlockChance(World world,Block block,int meta,int chance) {
			return fillWithBlockChance(world,block,meta,true,true,chance);
		}

		public BlockArea fillWithBlockChance(World world,Block block,int chance) {
			return fillWithBlockChance(world,block,0,true,true,chance);
		}

		public BlockArea fillWithBlockHollow(World world,Block block,int meta,boolean replace,boolean notify) {
			for(int x=Math.min(start.x,end.x);x<=Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<=Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<=Math.max(start.z,end.z);z++) {
						if((replace||world.isAirBlock(x,y,z))&&(x==start.x||x==end.x||y==start.y||y==end.y||z==start.z||z==end.z)) {
							world.setBlock(x,y,z,block,meta,notify? 3:2);
						}
					}
				}
			}
			return this;
		}

		public BlockArea fillWithBlockHollow(World world,Block block,boolean replace,boolean notify) {
			return fillWithBlockHollow(world,block,0,replace,notify);
		}

		public BlockArea fillWithBlockHollow(World world,Block block,int meta,boolean replace) {
			return fillWithBlockHollow(world,block,meta,replace,true);
		}

		public BlockArea fillWithBlockHollow(World world,Block block,boolean replace) {
			return fillWithBlockHollow(world,block,0,replace,true);
		}

		public BlockArea fillWithBlockHollow(World world,Block block,int meta) {
			return fillWithBlockHollow(world,block,meta,true,true);
		}

		public BlockArea fillWithBlockHollow(World world,Block block) {
			return fillWithBlockHollow(world,block,0,true,true);
		}

		public BlockArea fillWithBlockChanceHollow(World world,Block block,int meta,boolean replace,boolean notify,int chance) {
			for(int x=Math.min(start.x,end.x);x<=Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<=Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<=Math.max(start.z,end.z);z++) {
						if((replace||world.isAirBlock(x,y,z))&&(x==start.x||x==end.x||y==start.y||y==end.y||z==start.z||z==end.z)) {
							if(world.rand.nextInt(100)<=chance) world.setBlock(x,y,z,block,meta,notify? 3:2);
						}
					}
				}
			}
			return this;
		}

		public BlockArea fillWithBlockChanceHollow(World world,Block block,boolean replace,boolean notify,int chance) {
			return fillWithBlockChanceHollow(world,block,0,replace,notify,chance);
		}

		public BlockArea fillWithBlockChanceHollow(World world,Block block,int meta,boolean replace,int chance) {
			return fillWithBlockChanceHollow(world,block,meta,replace,true,chance);
		}

		public BlockArea fillWithBlockChanceHollow(World world,Block block,boolean replace,int chance) {
			return fillWithBlockChanceHollow(world,block,0,replace,true,chance);
		}

		public BlockArea fillWithBlockChanceHollow(World world,Block block,int meta,int chance) {
			return fillWithBlockChanceHollow(world,block,meta,true,true,chance);
		}

		public BlockArea fillWithBlockChanceHollow(World world,Block block,int chance) {
			return fillWithBlockChanceHollow(world,block,0,true,true,chance);
		}

		public BlockArea makeHollow(World world) {
			for(int x=Math.min(start.x,end.x);x<=Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<=Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<=Math.max(start.z,end.z);z++) {
						if(!(x==start.x||x==end.x||y==start.y||y==end.y||z==start.z||z==end.z)) {
							world.setBlockToAir(x,y,z);
						}
					}
				}
			}
			return this;
		}

		public BlockPos getPosOffset(int offX,int offY,int offZ) {
			return new BlockPos(start.x+offX,start.y+offY,start.z+offZ);
		}

		public BlockArea getSubArea(int offX,int offY,int offZ,int width,int height,int length) {
			if(intersects(getPosOffset(offX,offY,offZ))&&intersects(getPosOffset(offX+width,offY+height,offZ+length))) {
				return new BlockArea(getPosOffset(offX,offY,offZ),getPosOffset(offX+width,offY+height,offZ+length));
			}
			return null;
		}

		public boolean containsBlock(IBlockAccess world,Block block,int meta) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)==block&&world.getBlockMetadata(x,y,z)==meta) {
							return true;
						}
					}
				}
			}
			return false;
		}

		public boolean containsBlock(IBlockAccess world,Block block) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)==block) {
							return true;
						}
					}
				}
			}
			return false;
		}

		public boolean containsBlockOfType(IBlockAccess world,Class type) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(type.isInstance(world.getBlock(x,y,z))) {
							return true;
						}
					}
				}
			}
			return false;
		}

		public BlockPos findBlock(IBlockAccess world,Block block,int meta) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)==block&&world.getBlockMetadata(x,y,z)==meta) {
							return new BlockPos(x,y,z);
						}
					}
				}
			}
			return null;
		}

		public BlockPos findBlock(IBlockAccess world,Block block) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)==block) {
							return new BlockPos(x,y,z);
						}
					}
				}
			}
			return null;
		}

		public BlockPos findBlockOfType(IBlockAccess world,Class type) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(type.isInstance(world.getBlock(x,y,z))) {
							return new BlockPos(x,y,z);
						}
					}
				}
			}
			return null;
		}

		public ArrayList<BlockPos> findBlocks(IBlockAccess world,Block block,int meta) {
			ArrayList list=new ArrayList();
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)==block&&world.getBlockMetadata(x,y,z)==meta) {
							list.add(new BlockPos(x,y,z));
						}
					}
				}
			}
			return list;
		}

		public ArrayList<BlockPos> findBlocks(IBlockAccess world,Block block) {
			ArrayList list=new ArrayList();
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)==block) {
							list.add(new BlockPos(x,y,z));
						}
					}
				}
			}
			return list;
		}

		public ArrayList<BlockPos> findBlocksOfType(IBlockAccess world,Class type) {
			ArrayList list=new ArrayList();
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(type.isInstance(world.getBlock(x,y,z))) {
							list.add(new BlockPos(x,y,z));
						}
					}
				}
			}
			return list;
		}

		public boolean isEmpty(IBlockAccess world) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)!=Blocks.air) {
							return false;
						}
					}
				}
			}
			return true;
		}

		public BlockArea clear(World world) {
			for(int x=Math.min(start.x,end.x);x<Math.max(start.x,end.x);x++) {
				for(int y=Math.min(start.y,end.y);y<Math.max(start.y,end.y);y++) {
					for(int z=Math.min(start.z,end.z);z<Math.max(start.z,end.z);z++) {
						if(world.getBlock(x,y,z)!=Blocks.air) {
							world.setBlockToAir(x,y,z);
						}
					}
				}
			}
			return this;
		}

		public BlockArea regenerate(World world) {
			// should ONLY be called if area is whole chunk, will regen entire chunk
			this.clear(world);
			ChunkProviderServer chunkprov=(ChunkProviderServer)world.getChunkProvider();
			Chunk chunk=world.getChunkFromBlockCoords(start.x,start.z);
			chunk.isTerrainPopulated=false;
			chunkprov.populate(chunkprov,chunk.xPosition,chunk.zPosition);
			if(chunk.isChunkLoaded) {
				chunk.onChunkUnload();
				chunk.onChunkLoad();
			}
			return this;
		}

		public String toString() {
			return "("+start.toString()+") - ("+end.toString()+")";
		}
	}
}
