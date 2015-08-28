package com.shnupbups.allthethings.entity.living;

import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBear extends EntityAnimal {
	public boolean angry=false;

	public EntityBear(World world) {
		super(world);
		this.setSize(1.0F,1.0F);
		this.tasks.addTask(0,new EntityAISwimming(this));
		this.tasks.addTask(1,new EntityAIWander(this,1.0D));
		this.tasks.addTask(2,new EntityAIMate(this,1.0D));
		this.tasks.addTask(3,new EntityAITempt(this,1.2D,Items.fish,false));
		this.tasks.addTask(4,new EntityAIFollowParent(this,1.1D));
		this.tasks.addTask(5,new EntityAIWander(this,1.0D));
		this.tasks.addTask(6,new EntityAIWatchClosest(this,EntityPlayer.class,6.0F));
		this.tasks.addTask(7,new EntityAILookIdle(this));
		this.tasks.addTask(8,new EntityAIAttackOnCollide(this,1.0D,false));
		this.targetTasks.addTask(0,new EntityAIHurtByTarget(this,true));
	}

	@Override
	public boolean isAIEnabled() {
		return true;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	}

	public EntityBear createChild(EntityAgeable p_90011_1_) {
		return spawnBabyAnimal(p_90011_1_);
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
		this.entityToAttack=getOwner();
	}

	public EntityLivingBase getOwner() {
		try {
			UUID uuid=UUID.fromString(this.dataWatcher.getWatchableObjectString(17));
			return uuid==null? null:this.worldObj.func_152378_a(uuid);
		} catch(IllegalArgumentException illegalargumentexception) {
			return null;
		} catch(NullPointerException nullpointer) {
			return null;
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16,new Byte((byte)0));
		this.dataWatcher.addObject(17,"");
	}

	public void setAttackTarget(EntityLivingBase p_70624_1_) {
		super.setAttackTarget(p_70624_1_);
		if(p_70624_1_==null) {
			this.setAngry(false);
		} else {
			this.setAngry(true);
		}
	}

	public boolean isAngry() {
		return (this.dataWatcher.getWatchableObjectByte(16)&2)!=0;
	}

	public void setAngry(boolean p_70916_1_) {
		byte b0=this.dataWatcher.getWatchableObjectByte(16);
		if(p_70916_1_) {
			this.dataWatcher.updateObject(16,Byte.valueOf((byte)(b0|2)));
		} else {
			this.dataWatcher.updateObject(16,Byte.valueOf((byte)(b0&-3)));
		}
	}

	public void setOwner(String uuid) {
		this.dataWatcher.updateObject(17,uuid);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tag) {
		super.writeEntityToNBT(tag);
		tag.setBoolean("Angry",this.angry);
		tag.setString("Target",this.dataWatcher.getWatchableObjectString(17));
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag) {
		super.readEntityFromNBT(tag);
		this.angry=tag.getBoolean("Angry");
		setOwner(tag.getString("Target"));
	}

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots
	 * or seeds depending on
	 * the animal type)
	 */
	public boolean isBreedingItem(ItemStack p_70877_1_) {
		return(p_70877_1_.getItem()==Items.fish);
	}

	public EntityBear spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
		return new EntityBear(this.worldObj);
	}

	public boolean attackEntityFrom(DamageSource p_70097_1_,float p_70097_2_) {
		if(this.isEntityInvulnerable()) {
			return false;
		} else {
			Entity entity=p_70097_1_.getEntity();
			if(entity!=null&&!(entity instanceof EntityPlayer)&&!(entity instanceof EntityArrow)) {
				p_70097_2_=(p_70097_2_+1.0F)/2.0F;
			}
			return super.attackEntityFrom(p_70097_1_,p_70097_2_);
		}
	}

	public boolean attackEntityAsMob(Entity p_70652_1_) {
		return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this),4);
	}
}
