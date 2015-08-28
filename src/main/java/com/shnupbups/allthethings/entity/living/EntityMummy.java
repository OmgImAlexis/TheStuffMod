package com.shnupbups.allthethings.entity.living;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import com.shnupbups.allthethings.init.ModItems;

public class EntityMummy extends EntityMob {
	public EntityMummy(World world) {
		super(world);
		this.setSize(0.9F,1.9F);
		this.tasks.addTask(0,new EntityAIAttackOnCollide(this,EntityPlayer.class,1.0D,false));
		this.tasks.addTask(1,new EntityAIFleeSun(this,2.0D));
		this.tasks.addTask(2,new EntityAISwimming(this));
		this.tasks.addTask(3,new EntityAIWander(this,1.0D));
		this.tasks.addTask(4,new EntityAIWatchClosest(this,EntityPlayer.class,20.0F));
		this.targetTasks.addTask(0,new EntityAINearestAttackableTarget(this,EntityPlayer.class,0,true));
		this.targetTasks.addTask(1,new EntityAIHurtByTarget(this,true));
	}

	@Override
	public boolean isAIEnabled() {
		return true;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
	}

	@Override
	public void onLivingUpdate() {
		if(this.worldObj.isDaytime()&&!this.worldObj.isRemote) {
			float f=this.getBrightness(1.0F);
			if(f>0.5F&&this.rand.nextFloat()*30.0F<(f-0.4F)*2.0F&&this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX),MathHelper.floor_double(this.posY),MathHelper.floor_double(this.posZ))) {
				boolean flag=true;
				if(flag) {
					this.setFire(8);
				}
			}
		}
		super.onLivingUpdate();
	}

	protected Item getDropItem() {
		return Items.rotten_flesh;
	}

	/**
	 * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit
	 * by a player. @param
	 * par2 - Level of Looting used to kill this mob.
	 */
	protected void dropFewItems(boolean p_70628_1_,int p_70628_2_) {
		Item item=this.getDropItem();
		if(item!=null) {
			int j=this.rand.nextInt(3);
			if(p_70628_2_>0) {
				j+=this.rand.nextInt(p_70628_2_+1);
			}
			for(int k=0;k<j;++k) {
				this.dropItem(item,1);
				this.dropItem(ModItems.bandage,1);
			}
		}
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound() {
		return "mob.zombie.say";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound() {
		return "mob.zombie.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound() {
		return "mob.zombie.death";
	}
}
