package com.shnupbups.allthethings.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;

import com.shnupbups.allthethings.entity.EntityLyekstone;
import com.shnupbups.allthethings.entity.EntityPaintball;
import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.utility.UtilityCheck;
import com.shnupbups.allthethings.world.village.MechanicTrades;
import com.shnupbups.allthethings.world.village.VillageTrades;

import cpw.mods.fml.common.registry.VillagerRegistry;

public class ModMisc {
	public static ChestGenHooks houseChest;
	public static ChestGenHooks mechanicChest;
	
	public static String GEM_HOUSE = "gemHouse";
	public static String MECH_HOUSE = "mechHouse";

	public static int backpackID = 0;
	
	public static void init() {
		houseChest = new ChestGenHooks(GEM_HOUSE, new WeightedRandomChestContent[0], 1, 4);
		mechanicChest = new ChestGenHooks(MECH_HOUSE, new WeightedRandomChestContent[0], 1, 4);
		
    	VillagerRegistry.instance().registerVillageTradeHandler(ConfigurationHandler.gemCollectorID, new VillageTrades());
    	VillagerRegistry.instance().registerVillageTradeHandler(ConfigurationHandler.mechanicID, new MechanicTrades());
    	
    	BlockDispenser.dispenseBehaviorRegistry.putObject(ModItems.lyekstone, new BehaviorProjectileDispense()
        {
            /**
             * Return the projectile entity spawned by this dispense behavior.
             */
            protected IProjectile getProjectileEntity(World p_82499_1_, IPosition p_82499_2_)
            {
                EntityLyekstone lyekstone = new EntityLyekstone(p_82499_1_, p_82499_2_.getX(), p_82499_2_.getY(), p_82499_2_.getZ());
                return lyekstone;
            }
        });
    	
    	BlockDispenser.dispenseBehaviorRegistry.putObject(ModItems.paintball, new IBehaviorDispenseItem()
        {
            /**
             * Dispenses the specified ItemStack from a dispenser.
             */
            public ItemStack dispense(IBlockSource p_82482_1_, final ItemStack p_82482_2_)
            {
                return new BehaviorProjectileDispense()
                {
                    private static final String __OBFID = "CL_00001408";
                    /**
                     * Return the projectile entity spawned by this dispense behavior.
                     */
                    protected IProjectile getProjectileEntity(World p_82499_1_, IPosition p_82499_2_)
                    {
                        EntityPaintball ball = new EntityPaintball(p_82499_1_, p_82499_2_.getX(), p_82499_2_.getY(), p_82499_2_.getZ());
                        if(p_82482_2_.getItemDamage() < 16) ball.setColour(p_82482_2_.getItemDamage());
                        else ball.setColour(p_82499_1_.rand.nextInt(15));
                        return ball;
                    }
                }.dispense(p_82482_1_, p_82482_2_);
            }
        });
	}
}
