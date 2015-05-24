package com.shnupbups.allthethings.entity.living;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.UUID;

public class EntityBear extends EntityAnimal {

	public boolean angry = false;
	
	public EntityBear(World world) {
		super(world);
		this.setSize(1.0F, 1.0F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.2D, Items.fish, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(8, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	
	@Override
	public boolean isAIEnabled() {
		return true;
	}
	
	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
		//this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
	}

    public EntityBear createChild(EntityAgeable p_90011_1_)
    {
        return spawnBabyAnimal(p_90011_1_);
    }
    
    @Override
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {
        	Entity entity = p_70097_1_.getEntity();

            if (entity instanceof EntityPlayer)
            {
            	this.angry = true;
                this.entityToAttack = entity;
                this.setOwner(((EntityPlayer)entity).getUniqueID().toString());
            }
            
            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
        }
    }
    
    @Override
    protected void updateAITasks(){
        super.updateAITasks();
        this.entityToAttack = getOwner();
    }
    
    public EntityLivingBase getOwner()
    {
        try{
            UUID uuid = UUID.fromString(this.dataWatcher.getWatchableObjectString(17));
            return uuid == null ? null : this.worldObj.func_152378_a(uuid);
        }catch (IllegalArgumentException illegalargumentexception){
            return null;
        } catch (NullPointerException nullpointer) {
        	return null;
        }
    }
    
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
        this.dataWatcher.addObject(17, "");
    }
    
    public void setOwner(String uuid)
    {
        this.dataWatcher.updateObject(17, uuid);
    }
    
    @Override
    public void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("Angry", this.angry);
        tag.setString("Target", this.dataWatcher.getWatchableObjectString(17));
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        this.angry = tag.getBoolean("Angry");
        setOwner(tag.getString("Target"));
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return (p_70877_1_.getItem() == Items.fish); 
    }
    
    public EntityBear spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityBear(this.worldObj);
    }

}
