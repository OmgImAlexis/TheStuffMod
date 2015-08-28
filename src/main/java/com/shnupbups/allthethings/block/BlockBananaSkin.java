package com.shnupbups.allthethings.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import com.shnupbups.allthethings.init.ModBlocks;

public class BlockBananaSkin extends BlockBasic {
	public BlockBananaSkin(String name,Material material,CreativeTabs tab,int harvest,int hard) {
		super(name,material,tab,harvest,hard);
		this.setBlockBounds(0.5F-0.4F,0.0F,0.5F-0.4F,0.5F+0.4F,0.4F*2.0F,0.5F+0.4F);
	}

	@Override
	public void onEntityCollidedWithBlock(World world,int x,int y,int z,Entity entity) {
		if(entity instanceof EntityLivingBase) {
			if((entity instanceof EntityPlayer&&!((EntityPlayer)entity).capabilities.isCreativeMode)) {
				if(((EntityLivingBase)entity).attackEntityFrom(new DamageSource("allthethings:banana"),1.0F)) {
					this.dropBlockAsItemWithChance(world,x,y,z,0,0.5F,0);
					world.setBlockToAir(x,y,z);
				}
			}
		}
	}

	@Override
	public void onEntityWalking(World world,int x,int y,int z,Entity entity) {
		if(entity instanceof EntityLivingBase) {
			if((entity instanceof EntityPlayer&&!((EntityPlayer)entity).capabilities.isCreativeMode)) {
				if(((EntityLivingBase)entity).attackEntityFrom(new DamageSource("allthethings:banana"),1.0F)) {
					this.dropBlockAsItemWithChance(world,x,y,z,0,0.5F,0);
					world.setBlockToAir(x,y,z);
				}
			}
		}
	}

	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs,
	 * buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType() {
		return 1;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World,int par2,int par3,int par4) {
		return null;
	}

	public void onBlockAdded(World p_149726_1_,int p_149726_2_,int p_149726_3_,int p_149726_4_) {
		if(!ModBlocks.ustherPortal.func_150000_e(p_149726_1_,p_149726_2_,p_149726_3_,p_149726_4_)) {
			if(!World.doesBlockHaveSolidTopSurface(p_149726_1_,p_149726_2_,p_149726_3_-1,p_149726_4_)) {
				p_149726_1_.setBlockToAir(p_149726_2_,p_149726_3_,p_149726_4_);
			} else {
				p_149726_1_.scheduleBlockUpdate(p_149726_2_,p_149726_3_,p_149726_4_,this,this.tickRate(p_149726_1_)+p_149726_1_.rand.nextInt(10));
			}
		}
	}

	public boolean canPlaceBlockAt(World world,int x,int y,int z) {
		return world.isBlockNormalCubeDefault(x,y-1,z,true);
	}
}
