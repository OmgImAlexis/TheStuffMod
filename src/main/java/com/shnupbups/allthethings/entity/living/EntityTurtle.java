package com.shnupbups.allthethings.entity.living;

import com.shnupbups.allthethings.init.ModArmour;
import com.shnupbups.allthethings.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class EntityTurtle extends EntityAnimal {

	public EntityTurtle(World world) {
		super(world);
		this.setSize(0.9F, 1.0F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(2, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, new ItemStack(Blocks.pumpkin).getItem(), false));
        this.tasks.addTask(5, new EntityAITempt(this, 1.2D, ModItems.lettuce, false));
        this.tasks.addTask(6, new EntityAITempt(this, 1.2D, ModItems.tomato, false));
        this.tasks.addTask(7, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(8, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(10, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
	}
	
	@Override
	public boolean isAIEnabled() {
		return true;
	}
	
	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
	}
	
	@Override
	public Item getDropItem(){
		return ModArmour.shell;
	}
	
	public void dropFewItems(boolean par1, int par2) {
		Item item = this.getDropItem();

        if (item != null)
        {
            if(this.worldObj.rand.nextInt(5)-par2 < 1) this.dropItem(item, 1);
            if(!this.isBurning()) {
            	this.dropItem(ModItems.rawTortoise, new Random().nextInt(4));
            } else {
            	this.dropItem(ModItems.cookedTortoise, new Random().nextInt(4));
            }
        }
	}
	
	@Override
	public void onEntityUpdate() {
		int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !this.isInWater())
        {
            this.setAir(300);
        }
        else
        {
            this.setAir(i--);
        }
    }
	
	public boolean canBreatheUnderwater(){
        return true;
    }

    public EntityTurtle createChild(EntityAgeable p_90011_1_)
    {
        return spawnBabyAnimal(p_90011_1_);
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return (p_70877_1_.getItem() == Item.getItemFromBlock(Blocks.pumpkin) || p_70877_1_.getItem() == ModItems.lettuce || p_70877_1_.getItem() == ModItems.tomato); 
    }
    
    public boolean interact(EntityPlayer p_70085_1_)
    {
        if (super.interact(p_70085_1_)){
            return true;
        } else if (!this.isChild() && !this.worldObj.isRemote && !p_70085_1_.isSneaking() && (this.riddenByEntity == null || this.riddenByEntity == p_70085_1_)){
            p_70085_1_.mountEntity(this);
            return true;
        } else {
            return false;
        }
    }
    
    public EntityTurtle spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityTurtle(this.worldObj);
    }
    
}
