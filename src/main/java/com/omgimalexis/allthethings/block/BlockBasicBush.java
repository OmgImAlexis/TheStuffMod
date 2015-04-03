package com.omgimalexis.allthethings.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicBush extends BlockBasic implements IGrowable, IPlantable{

	public Item drop;
	
	public BlockBasicBush(String name, CreativeTabs tab, Item drop) {
		super(name, Material.leaves, tab, 0, 1);
		this.drop = drop;
	}
	
	@SideOnly(Side.CLIENT)
    private IIcon[] icons;
   
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
	{
    	icons = new IIcon[3];
         
        icons[0] = iconRegister.registerIcon(Reference.MOD_ID + ":bush");
        icons[1] = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        icons[2] = iconRegister.registerIcon(Reference.MOD_ID + ":dryBush");
	}
   
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta){
    	if(meta > 2) meta = 1;
    	return icons[meta];
	}
	
	@Override
	public int damageDropped(int metadata) {
		if(metadata <= 1) return 0;
		else return 2;
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random){
	    super.updateTick(world, x, y, z, random);
	    if (world.getBlockLightValue(x, y + 1, z) >= 9){
		    if (world.getBlockMetadata(x, y, z) == 0){
			    if (random.nextInt(2000) == 0){
			    	//LogHelper.info("Growing berries");
			    	world.setBlockMetadataWithNotify(x, y, z, 1, 3);
			    } else if(!isWaterNearby(world, x, y, z) && random.nextInt(2000) == 0) {
			    	//LogHelper.info("Drying from state 0");
			    	world.setBlockMetadataWithNotify(x, y, z, 2, 3);
			    }
			    
			    if(random.nextInt(2000) == 0) {
		    		int side = Math.round(random.nextInt(5));
		    		if(side == 0 && !this.isBlockSolid(world, x, y+1, z, 0)) world.setBlock(x, y+1, z, this);
		    		else if(side == 1 && !this.isBlockSolid(world, x, y-1, z, 0)) world.setBlock(x, y-1, z, this);
		    		else if(side == 2 && !this.isBlockSolid(world, x+1, y, z, 0)) world.setBlock(x+1, y, z, this);
		    		else if(side == 3 && !this.isBlockSolid(world, x-1, y, z, 0)) world.setBlock(x-1, y, z, this);
		    		else if(side == 4 && !this.isBlockSolid(world, x, y, z+1, 0)) world.setBlock(x, y, z+1, this);
		    		else if(side == 5 && !this.isBlockSolid(world, x, y, z-1, 0)) world.setBlock(x, y, z-1, this);
		    	}
		    } else if(world.getBlockMetadata(x, y, z) == 2) {
		    	if(isWaterNearby(world, x, y, z) && random.nextInt(3) == 0) {
		    		//LogHelper.info("Undrying");
			    	world.setBlockMetadataWithNotify(x, y, z, 0, 3);
			    } else if (random.nextInt(2000) == 0){
			    	//LogHelper.info("Dying");
			    	world.setBlockToAir(x, y, z);
			    	world.setBlock(x, y, z, Blocks.deadbush);
			    }
		    } else if(world.getBlockMetadata(x, y, z) == 1) {
		    	if(!isWaterNearby(world, x, y, z) && random.nextInt(2000) == 0) {
		    		//LogHelper.info("Drying from state 1");
			    	world.setBlockMetadataWithNotify(x, y, z, 2, 3);
			    }
		    	
		    	if(random.nextInt(2000) == 0) {
		    		int side = Math.round(random.nextInt(5));
		    		if(side == 0 && !this.isBlockSolid(world, x, y+1, z, 0)) world.setBlock(x, y+1, z, this);
		    		else if(side == 1 && !this.isBlockSolid(world, x, y-1, z, 0)) world.setBlock(x, y-1, z, this);
		    		else if(side == 2 && !this.isBlockSolid(world, x+1, y, z, 0)) world.setBlock(x+1, y, z, this);
		    		else if(side == 3 && !this.isBlockSolid(world, x-1, y, z, 0)) world.setBlock(x-1, y, z, this);
		    		else if(side == 4 && !this.isBlockSolid(world, x, y, z+1, 0)) world.setBlock(x, y, z+1, this);
		    		else if(side == 5 && !this.isBlockSolid(world, x, y, z-1, 0)) world.setBlock(x, y, z-1, this);
		    	}
		    }
	    }
	    world.scheduleBlockUpdate(x, y, z, this, 1);
	}
	
	@Override
	public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int meta) {
		if(meta == 1) world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(drop)));
		super.harvestBlock(world, player, x, y, z, meta);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz) {
		if(!world.isRemote) {
			if(world.getBlockMetadata(x, y, z) == 1) {
				for (int i = 0; i < new Random().nextInt(3)+1; i++) {
					world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(drop)));
				}
				world.setBlockMetadataWithNotify(x, y, z, 0, 0); world.scheduleBlockUpdate(x, y, z, this, 1); return true;
			} else return false;
		} return false;
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Plains;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		return this;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z){
        return world.getBlock(x, y-1, z) == Blocks.grass || world.getBlock(x, y-1, z) == Blocks.dirt || world.getBlock(x, y-1, z) == Blocks.farmland || world.getBlock(x, y-1, z) instanceof BlockBasicBush;
    }
	
	@Override
	public int onBlockPlaced(World world, int int1, int int2, int int3, int int4, float float1, float float2, float float3, int int5) {
		world.scheduleBlockUpdate(int1, int2, int3, this, 1);
		return int5;
	}

	@Override
	public boolean func_149851_a(World world, int x, int y, int z, boolean bool) {
		if(world.getBlockMetadata(x, y, z) < 1 || world.getBlockMetadata(x, y, z) > 1) return true;
		else return false;
	}

	@Override
	public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_) {
		return true;
	}

	@Override
	public void func_149853_b(World world, Random random, int x, int y, int z) {
		if(world.getBlockMetadata(x, y, z) <= 1) world.setBlockMetadataWithNotify(x, y, z, 1, 3);
		else world.setBlockMetadataWithNotify(x, y, z, 0, 3);
	}
	
	public static boolean isWaterNearby(World world, int x, int y, int z)
    {
        for (int l = x - 4; l <= x + 4; ++l)
        {
            for (int i1 = y - 2; i1 <= y + 2; ++i1)
            {
                for (int j1 = z - 4; j1 <= z + 4; ++j1)
                {
                    if (world.getBlock(l, i1, j1).getMaterial() == Material.water)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }
	
}
