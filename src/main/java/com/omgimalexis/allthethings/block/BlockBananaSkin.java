package com.omgimalexis.allthethings.block;

import java.util.Random;

import com.omgimalexis.allthethings.init.ModBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockBananaSkin extends BlockBasic {
	
	public String playerName;

	public BlockBananaSkin(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(name, material, tab, harvest, hard);
		this.setBlockBounds(0.5F - 0.4F, 0.0F, 0.5F - 0.4F, 0.5F + 0.4F, 0.4F * 2.0F, 0.5F + 0.4F);
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if(entity instanceof EntityLivingBase && !((EntityPlayer) entity).capabilities.isCreativeMode){
			if(((EntityLivingBase) entity).attackEntityFrom(new DamageSource("allthethings:banana"), 1.0F)) {
				this.dropBlockAsItemWithChance(world, x, y, z, 0, 0.5F, 0);
				world.setBlockToAir(x, y, z);
			}
		}
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }
    
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
		return null;
    }
	
	@Override
    public void onBlockPlacedBy(World world, int par2, int par3, int par4, EntityLivingBase entity, ItemStack itemstack) {
        if(entity instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) entity;
            playerName = player.getDisplayName();
        }
    }
	
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return world.isBlockNormalCubeDefault(x, y-1, z, true);
    }
}
