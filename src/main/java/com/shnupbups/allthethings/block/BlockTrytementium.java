package com.shnupbups.allthethings.block;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import com.shnupbups.allthethings.event.FluoExplosionEvent;
import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.init.ModBlocks;

public class BlockTrytementium extends BlockBasic implements IBlockMod {

	public BlockTrytementium(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(name, material, tab, harvest, hard);
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
		if(!MinecraftForge.EVENT_BUS.post(new FluoExplosionEvent(world, x, y, z))) {
		world.spawnParticle("hugeexplosion", x, y, z, 0, 0, 0);
		world.playSoundEffect(x, y, z, "random.explode", 1.0f, 0.8f);
		List affectedBlockPositions = new ArrayList();
		float f = 16;
        HashSet hashset = new HashSet();
        int i;
        int j;
        int k;
        double d5;
        double d6;
        double d7;

        for (i = 0; i < 16; ++i)
        {
            for (j = 0; j < 16; ++j)
            {
                for (k = 0; k < 16; ++k)
                {
                    if (i == 0 || i == 16 - 1 || j == 0 || j == 16 - 1 || k == 0 || k == 16 - 1)
                    {
                        double d0 = (double)((float)i / ((float)16 - 1.0F) * 2.0F - 1.0F);
                        double d1 = (double)((float)j / ((float)16 - 1.0F) * 2.0F - 1.0F);
                        double d2 = (double)((float)k / ((float)16 - 1.0F) * 2.0F - 1.0F);
                        double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                        d0 /= d3;
                        d1 /= d3;
                        d2 /= d3;
                        float f1 = 16 * (0.7F + world.rand.nextFloat() * 0.6F);
                        d5 = x;
                        d6 = y;
                        d7 = z;

                        for (float f2 = 0.3F; f1 > 0.0F; f1 -= f2 * 0.75F)
                        {
                            int j1 = MathHelper.floor_double(d5);
                            int k1 = MathHelper.floor_double(d6);
                            int l1 = MathHelper.floor_double(d7);
                            Block block = world.getBlock(j1, k1, l1);

                            if (block.getMaterial() != Material.air)
                            {
                                float f3 = block.getExplosionResistance(player, world, j1, k1, l1, x, y, z);
                                f1 -= (f3 + 0.3F) * f2;
                            }

                            if (f1 > 0.0F)
                            {
                                hashset.add(new ChunkPosition(j1, k1, l1));
                            }

                            d5 += d0 * (double)f2;
                            d6 += d1 * (double)f2;
                            d7 += d2 * (double)f2;
                            
                            if((block == Blocks.dirt || block == Blocks.grass) && world.rand.nextInt(3) <= 2) {
                            	world.setBlock(j1, k1, l1, ModBlocks.fluxInfestedSoil, 0, 3);
                            } else if(block.getHarvestLevel(world.getBlockMetadata(j1, k1, l1)) != -1) {
                            	if(ConfigurationHandler.trytementiumBoom && !MinecraftForge.EVENT_BUS.post(new FluoExplosionEvent.BreakBlocks(world, x, y, z)))
                            	world.setBlockToAir(j1, k1, l1);
                            }
                        }
                    }
                }
            }
        }

        affectedBlockPositions.addAll(hashset);
        i = MathHelper.floor_double(x - (double)32 - 1.0D);
        j = MathHelper.floor_double(x + (double)32 + 1.0D);
        k = MathHelper.floor_double(y - (double)32 - 1.0D);
        int i2 = MathHelper.floor_double(y + (double)32 + 1.0D);
        int l = MathHelper.floor_double(z - (double)32 - 1.0D);
        int j2 = MathHelper.floor_double(z + (double)32 + 1.0D);
        List list = world.getEntitiesWithinAABBExcludingEntity(player, AxisAlignedBB.getBoundingBox((double)i, (double)k, (double)l, (double)j, (double)i2, (double)j2));
        Vec3 vec3 = Vec3.createVectorHelper(x, y, z);

        for (int i1 = 0; i1 < list.size(); ++i1)
        {
            Entity entity = (Entity)list.get(i1);
            double d4 = entity.getDistance(x, y, z) / (double)32;

            if (d4 <= 1.0D)
            {
                d5 = entity.posX - x;
                d6 = entity.posY + (double)entity.getEyeHeight() - y;
                d7 = entity.posZ - z;
                double d9 = (double)MathHelper.sqrt_double(d5 * d5 + d6 * d6 + d7 * d7);

                if (d9 != 0.0D)
                {
                    d5 /= d9;
                    d6 /= d9;
                    d7 /= d9;
                    double d10 = (double)world.getBlockDensity(vec3, entity.boundingBox);
                    double d11 = (1.0D - d4) * d10;
                    entity.attackEntityFrom(new DamageSource("allthethings:trytementiumBoom"), (float)((int)((d11 * d11 + d11) / 2.0D * 8.0D * (double)32 + 1.0D)));
                    double d8 = EnchantmentProtection.func_92092_a(entity, d11);
                    entity.motionX += d5 * d8;
                    entity.motionY += d6 * d8;
                    entity.motionZ += d7 * d8;
                }
            }
        }
		}
	}
	

	@Override
	public void updateTick(World world,int int1,int int2,int int3,Random random) {
		if(this == ModBlocks.blockTrytementium) {
			this.removedByPlayer(world,null,int1,int2,int3,true);
		}
	}

}
