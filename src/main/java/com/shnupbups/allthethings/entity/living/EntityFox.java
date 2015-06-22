package com.shnupbups.allthethings.entity.living;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFox extends EntityWolf {

    public EntityFox(World world) {
        super(world);
        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityChicken.class, 200, false));
    }

    @SideOnly(Side.CLIENT)
    public float getTailRotation()
    {
        return this.isAngry() ? 1.5393804F : (this.isTamed() ? (0.55F - (20.0F - this.dataWatcher.getWatchableObjectFloat(18)) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F));
    }
    
    public EntityFox createChild(EntityAgeable p_90011_1_)
    {
        EntityFox fox = new EntityFox(this.worldObj);
        String s = this.func_152113_b();

        if (s != null && s.trim().length() > 0) {
            fox.func_152115_b(s);
            fox.setTamed(true);
        }

        return fox;
    }
}
