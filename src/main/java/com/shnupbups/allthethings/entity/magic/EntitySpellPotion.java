package com.shnupbups.allthethings.entity.magic;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySpellPotion extends EntitySpell {

	public PotionEffect effect;
	
	public EntitySpellPotion(World world, EntityLivingBase entity, PotionEffect effect) {
		super(world, entity);
		this.effect = effect;
	}

	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		if (!this.worldObj.isRemote) {
            AxisAlignedBB axisalignedbb = this.boundingBox.expand(4.0D, 2.0D, 4.0D);
            List list1 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);

            if (list1 != null && !list1.isEmpty()) {
                Iterator iterator = list1.iterator();

                while (iterator.hasNext()) {
                    EntityLivingBase entitylivingbase = (EntityLivingBase)iterator.next();
                    double d0 = this.getDistanceSqToEntity(entitylivingbase);

                    if (d0 < 16.0D) {
                        double d1 = 1.0D - Math.sqrt(d0) / 4.0D;

                        if (entitylivingbase == p_70184_1_.entityHit) {
                            d1 = 1.0D;
                        }
           
                        entitylivingbase.addPotionEffect(effect);
                    }
                }
            } this.setDead();
        }
	}
	
	public void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);

        if(tag.hasKey("potionId") && tag.hasKey("potionDuration") && tag.hasKey("potionAmplifier") && tag.hasKey("potionAmbient")) {
        	this.effect = new PotionEffect(tag.getInteger("potionId"), tag.getInteger("potionDuration"), tag.getInteger("potionAmplifier"), tag.getBoolean("potionAmbient"));
        }
    }

    public void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);

        tag.setInteger("potionId", effect.getPotionID());
        tag.setInteger("potionDuration", effect.getDuration());
        tag.setInteger("potionAmplifier", effect.getAmplifier());
        tag.setBoolean("potionAmbient", effect.getIsAmbient());
    }
}
