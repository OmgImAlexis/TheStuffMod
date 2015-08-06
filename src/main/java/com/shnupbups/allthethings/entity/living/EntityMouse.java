package com.shnupbups.allthethings.entity.living;

import net.minecraft.block.BlockCrops;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.shnupbups.allthethings.entity.ai.EntityAIMoveTowardsBlockType;
import com.shnupbups.allthethings.utility.LogHelper;

public class EntityMouse extends EntityAnimal {

	public EntityMouse(World world) {
		super(world);
		this.setSize(0.3F, 0.3F);
		this.tasks.addTask(0, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        //this.tasks.addTask(3, new EntityAITempt(this, 1.2D, ModItems.cheese, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(1, new EntityAIMoveTowardsBlockType(this, 1.0D, 5, BlockCrops.class));
	}
	
	@Override
	public boolean isAIEnabled() {
		return true;
	}
	
	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	}
	
	@Override
	public Item getDropItem(){
		return null;
	}
	
	public void dropFewItems(boolean par1, int par2) {
		
	}

    public EntityMouse createChild(EntityAgeable p_90011_1_)
    {
        return spawnBabyAnimal(p_90011_1_);
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        //return (p_70877_1_.getItem() == Item.getItemFromBlock(Blocks.pumpkin) || p_70877_1_.getItem() == ModItems.lettuce || p_70877_1_.getItem() == ModItems.tomato); 
    	return false;
    }
    
    public EntityMouse spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityMouse(this.worldObj);
    }
    
    @Override
	public void onEntityUpdate() {
        super.onEntityUpdate();
        
        /**int[] blockPos = UtilityCheck.getNearestBlockOfType(worldObj, BlockCrops.class, (int) posX, (int) posY, (int) posZ, 1);
        
        if(blockPos != null) {
        	LogHelper.info("X: "+blockPos[0]+" Y:"+blockPos[1]+" Z:"+blockPos[2]);
        	worldObj.getBlock(blockPos[0], blockPos[1], blockPos[2]).removedByPlayer(worldObj, null, blockPos[0], blockPos[1], blockPos[2], true);
        	worldObj.playSoundAtEntity(this, "random.eat", 0.5F + 0.5F * (float)this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
        }**/
        
        if(worldObj.getBlock((int)(posX-0.5), (int)posY, (int)(posZ-0.5)) instanceof BlockCrops) {
        	worldObj.getBlock((int)(posX-0.5), (int)posY, (int)(posZ-0.5)).removedByPlayer(worldObj, null, (int)(posX-0.5), (int)posY, (int)(posZ-0.5), true);
        	worldObj.playSoundAtEntity(this, "random.eat", 0.5F + 0.5F * (float)this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
        }
    }
    
}
