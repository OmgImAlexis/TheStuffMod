package com.shnupbups.allthethings.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityLyekstone extends EntityThrowable {

	public EntityLyekstone(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    public EntityLyekstone(World p_i1774_1_, EntityLivingBase p_i1774_2_)
    {
        super(p_i1774_1_, p_i1774_2_);
    }

    public EntityLyekstone(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if(!this.worldObj.isRemote) {
			if(pos.entityHit != null) {
				this.worldObj.createExplosion(getThrower(), pos.entityHit.posX, pos.entityHit.posY, pos.entityHit.posZ, 10.0f, true);
				pos.entityHit.setDead();
			} else {
				this.worldObj.createExplosion(getThrower(), pos.blockX, pos.blockY, pos.blockZ, 10.0f, true);
			}
			this.setDead();
		}
	}

}
