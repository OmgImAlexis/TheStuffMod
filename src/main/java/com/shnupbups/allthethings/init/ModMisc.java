package com.shnupbups.allthethings.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;

import com.shnupbups.allthethings.entity.EntityLyekstone;
import com.shnupbups.allthethings.utility.UtilityCheck;
import com.shnupbups.allthethings.world.village.VillageTrades;

import cpw.mods.fml.common.registry.VillagerRegistry;

public class ModMisc {
	public static ChestGenHooks houseChest;
	
	public static String GEM_HOUSE = "gemHouse";

	public static int backpackID = 0;
	
	public static void init() {
		houseChest = new ChestGenHooks(GEM_HOUSE, new WeightedRandomChestContent[0], 1, 4);
		
    	VillagerRegistry.instance().registerVillageTradeHandler(56329, new VillageTrades());
    	
    	BlockDispenser.dispenseBehaviorRegistry.putObject(ModItems.lyekstone, new BehaviorProjectileDispense()
        {
            private static final String __OBFID = "CL_00001398";
            /**
             * Return the projectile entity spawned by this dispense behavior.
             */
            protected IProjectile getProjectileEntity(World p_82499_1_, IPosition p_82499_2_)
            {
                EntityLyekstone lyekstone = new EntityLyekstone(p_82499_1_, p_82499_2_.getX(), p_82499_2_.getY(), p_82499_2_.getZ());
                return lyekstone;
            }
        });
	}
}
