package com.shnupbups.allthethings.entity;

import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockHardenedClay;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockWood;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import com.shnupbups.allthethings.block.BlockColoured;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.utility.UtilityCheck;
import com.shnupbups.allthethings.utility.WorldHelper;

public class EntityPaintball extends EntityThrowable {
	public EntityPaintball(World p_i1773_1_) {
		super(p_i1773_1_);
	}

	public EntityPaintball(World p_i1774_1_,EntityLivingBase p_i1774_2_) {
		super(p_i1774_1_,p_i1774_2_);
	}

	public EntityPaintball(World p_i1775_1_,double p_i1775_2_,double p_i1775_4_,double p_i1775_6_) {
		super(p_i1775_1_,p_i1775_2_,p_i1775_4_,p_i1775_6_);
	}

	public EntityPaintball(World world,double x,double y,double z,ItemStack stack) {
		this(world,x,y,z);
		this.setColour(stack.getItemDamage());
	}

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if(!this.worldObj.isRemote) {
			if(pos.entityHit!=null) {
				if(this.getThrower()!=null) {
					pos.entityHit.attackEntityFrom(new EntityDamageSource("allthethings:paintball"+UtilityCheck.getColourNameForMeta(this.getColour())+".player",this.getThrower()),2.0f);
				} else {
					pos.entityHit.attackEntityFrom(new DamageSource("allthethings:paintball"+UtilityCheck.getColourNameForMeta(this.getColour())),2.0f);
				}
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockColoured.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlockMetadataWithNotify(blockPos[0],blockPos[1],blockPos[2],this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockColored.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlockMetadataWithNotify(blockPos[0],blockPos[1],blockPos[2],this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockStainedGlass.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlockMetadataWithNotify(blockPos[0],blockPos[1],blockPos[2],this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockStainedGlassPane.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlockMetadataWithNotify(blockPos[0],blockPos[1],blockPos[2],this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockHardenedClay.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlock(blockPos[0],blockPos[1],blockPos[2],Blocks.stained_hardened_clay,this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockGlass.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlock(blockPos[0],blockPos[1],blockPos[2],Blocks.stained_glass,this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,Blocks.glass_pane,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlock(blockPos[0],blockPos[1],blockPos[2],Blocks.stained_glass_pane,this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,BlockWood.class,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlock(blockPos[0],blockPos[1],blockPos[2],ModBlocks.woodColoured,this.getColour(),2);
			}
			for(int[] blockPos:WorldHelper.getCloseBlocksOfType(worldObj,Blocks.brick_block,(int)this.posX,(int)this.posY,(int)this.posZ,3)) {
				worldObj.setBlock(blockPos[0],blockPos[1],blockPos[2],ModBlocks.brickColoured,this.getColour(),2);
			}
			this.setDead();
		}
	}

	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);
		nbt.setInteger("colour",this.getColour());
	}

	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);
		this.setColour(nbt.getInteger("colour"));
	}

	public void setColour(int color) {
		this.dataWatcher.updateObject(20,Integer.valueOf(color));
	}

	public int getColour() {
		return this.dataWatcher.getWatchableObjectInt(20);
	}

	public void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(20,Integer.valueOf(0));
	}
}