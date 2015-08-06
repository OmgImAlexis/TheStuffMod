package com.shnupbups.allthethings.entity.ai;

import com.shnupbups.allthethings.utility.UtilityCheck;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.Vec3;

public class EntityAIMoveTowardsBlockType extends EntityAIBase {

	private EntityCreature theEntity;
    private Class targetBlock;
    private int[] blockPos;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private double speed;
    /** If the distance to the target block is further than this, this AI task will not run. */
    private float maxTargetDistance;
    private static final String __OBFID = "CL_00001599";

    public EntityAIMoveTowardsBlockType(EntityCreature p_i1640_1_, double p_i1640_2_, float p_i1640_4_, Class target)
    {
        this.theEntity = p_i1640_1_;
        this.speed = p_i1640_2_;
        this.maxTargetDistance = p_i1640_4_;
        this.targetBlock = target;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        blockPos = UtilityCheck.getNearestBlockOfType(theEntity.worldObj, targetBlock, (int) theEntity.posX, (int) theEntity.posY, (int) theEntity.posZ, (int) maxTargetDistance);

        if (blockPos == null)
        {
            return false;
        }
        else
        {
            Vec3 vec3 = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, 16, 7, Vec3.createVectorHelper(blockPos[0], blockPos[1], blockPos[2]));

            if (vec3 == null)
            {
                return false;
            }
            else
            {
                this.movePosX = vec3.xCoord;
                this.movePosY = vec3.yCoord;
                this.movePosZ = vec3.zCoord;
                return true;
            }
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.theEntity.getNavigator().noPath() && this.blockPos != null && UtilityCheck.getNearestBlockOfType(theEntity.worldObj, targetBlock, (int) theEntity.posX, (int) theEntity.posY, (int) theEntity.posZ, (int) maxTargetDistance) == blockPos;
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.blockPos = null;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX+1, this.movePosY, this.movePosZ+1, this.speed);
    }
}
