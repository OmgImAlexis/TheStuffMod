package com.shnupbups.allthethings.entity.magic;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.world.World;

public abstract class EntitySpell extends EntityThrowable {
	public EntitySpell(World world) {
		super(world);
	}

	public EntitySpell(World world,double x,double y,double z) {
		super(world,x,y,z);
	}

	public EntitySpell(World world,EntityLivingBase entity) {
		super(world,entity);
	}

	protected float getGravityVelocity() {
		return 0F;
	}

	protected float func_70182_d() {
		return 2F;
	}

	protected float func_70183_g() {
		return 0F;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		this.worldObj.spawnParticle("crit",this.posX,this.posY,this.posZ,0,0,0);
	}
}
