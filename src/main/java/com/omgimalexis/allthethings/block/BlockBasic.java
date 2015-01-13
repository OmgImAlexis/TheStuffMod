package com.omgimalexis.allthethings.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasic extends Block {
	public Item itemDropped;
	public int minDropped = 1;
	public int maxDropped = 1;
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		this.setStepSound(UtilityCheck.getSoundFromMaterial(material));
		this.setTickRandomly(this == ModBlocks.blockTrytementium || this == ModBlocks.fluxInfestedSoil);
		Reference.incrementBlocks();
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param sounds
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, SoundType sound) {
		this(name, material, tab, harvest, hard);
		this.setStepSound(sound);
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param opacity
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, int opacity) {
		this(name, material, tab, harvest, hard);
		this.setLightOpacity(opacity);
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param light
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, float light) {
		this(name, material, tab, harvest, hard);
		this.setLightLevel(light);
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param light
	 * @param drop
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, float light, Item drop) {
		this(name, material, tab, harvest, hard, light);
		this.itemDropped = drop;
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param light
	 * @param drop
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, float light, ItemStack drop) {
		this(name, material, tab, harvest, hard, light);
		this.itemDropped = drop.getItem();
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, Item drop) {
		this(name, material, tab, harvest, hard);
		this.itemDropped = drop;
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, ItemStack drop) {
		this(name, material, tab, harvest, hard);
		this.itemDropped = drop.getItem();
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop
	 * @param min
	 * @param max
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, Item drop, int min, int max) {
		this(name, material, tab, harvest, hard, drop);
		this.minDropped = min;
		this.maxDropped = max;
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop
	 * @param quantity
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, Item drop, int quantity) {
		this(name, material, tab, harvest, hard, drop);
		this.minDropped = quantity;
		this.maxDropped = quantity;
	}

	/**
	 * Gets the unlocalized name.
	 * @return String name
	 */
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	/**
	 * Gets the item dropped.
	 * @param metadata
	 * @param random
	 * @param fortune
	 * @return Item drop
	 */
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		if(itemDropped != null) return itemDropped;
		else return Item.getItemFromBlock(this);
	}
	
	/**
	 * Gets the amount of items dropped.
	 * @param rand
	 * @return int amount
	 */
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt((maxDropped - minDropped) + 1) + minDropped;
	}
	
	/**
	 * Registers the texture
	 * @param iconRegister
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	/**
	 * Gets the unlocalized name, unwrapped.
	 * @param unlocalizedName
	 * @return String unwrappedUnlocalizedName
	 */
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	/**
	 * Gets whether or not the block can be used to form a beacon's pyramid.
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param beaconX
	 * @param beaconY
	 * @param beaconZ
	 * @return boolean isBeaconBase
	 */
	@Override
	public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
	    if(ConfigurationHandler.beaconBase == false) return false;
		return UtilityCheck.isBlockBeaconBase(this);
	}
	
	@Override
	public void updateTick(World world, int int1, int int2, int int3, Random random) {
		if(this == ModBlocks.blockTrytementium) {this.removedByPlayer(world, null, int1, int2, int3, true);}
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if(this == ModBlocks.fluxInfestedSoil) {
			if(entity instanceof EntityLivingBase){
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.wither.getId(), 20, 5));
			}
		}
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if(this == ModBlocks.fluxInfestedSoil) {
			if(entity instanceof EntityLivingBase){
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.wither.getId(), 20, 5));
			}
		}
	}
	
	@Override
	public int onBlockPlaced(World world, int int1, int int2, int int3, int int4, float float1, float float2, float float3, int int5) {
		if(this == ModBlocks.blockTrytementium) {
			world.createExplosion(null, int1, int2, int3, 10.0F, false);
			for (int i = -9; i <= 9; i++) {
				for (int j = -8; j <= 8; j++) {
					for (int k = -8; k <= 8; k++) {
						Block block = world.getBlock(int1+i, int2+j, int3+k);
						Random rand = new Random();
						int isInfested = rand.nextInt(5);
						int isRemoved = rand.nextInt(2);
						if(block == Blocks.grass || block == Blocks.dirt || block == ModBlocks.fluxInfestedSoil) {
							if(ConfigurationHandler.trytementiumBoom) {
								block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);
							}
							if(isInfested <= 1) {
								world.setBlock(int1+i, int2+j, int3+k, ModBlocks.fluxInfestedSoil);
							}
						} else if(block != Blocks.bedrock && ConfigurationHandler.trytementiumBoom) {
							if(isRemoved <= 1 && ConfigurationHandler.trytementiumBoom) {block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);}
						}
					}
				}
			}
			for (int i = -8; i <= 8; i++) {
				for (int j = -9; j <= 9; j++) {
					for (int k = -8; k <= 8; k++) {
						Block block = world.getBlock(int1+i, int2+j, int3+k);
						Random rand = new Random();
						int isInfested = rand.nextInt(5);
						int isRemoved = rand.nextInt(2);
						if(block == Blocks.grass || block == Blocks.dirt || block == ModBlocks.fluxInfestedSoil) {
							if(ConfigurationHandler.trytementiumBoom) {
								block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);
							}
							if(isInfested <= 1) {
								world.setBlock(int1+i, int2+j, int3+k, ModBlocks.fluxInfestedSoil);
							}
						} else if(block != Blocks.bedrock && ConfigurationHandler.trytementiumBoom) {
							if(isRemoved <= 1 && ConfigurationHandler.trytementiumBoom) {block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);}
						}
					}
				}
			}
			for (int i = -8; i <= 8; i++) {
				for (int j = -8; j <= 8; j++) {
					for (int k = -9; k <= 9; k++) {
						Block block = world.getBlock(int1+i, int2+j, int3+k);
						Random rand = new Random();
						int isInfested = rand.nextInt(5);
						int isRemoved = rand.nextInt(2);
						if(block == Blocks.grass || block == Blocks.dirt || block == ModBlocks.fluxInfestedSoil) {
							block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);
							if(ConfigurationHandler.trytementiumBoom) {
								block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);
							}
							if(isInfested <= 1) {
								world.setBlock(int1+i, int2+j, int3+k, ModBlocks.fluxInfestedSoil);
							}
							
						} else if(block != Blocks.bedrock && ConfigurationHandler.trytementiumBoom) {
							if(isRemoved <= 1 && ConfigurationHandler.trytementiumBoom) {block.removedByPlayer(world, null, int1+i, int2+j, int3+k, true);}
						}
					}
				}
			}
			world.scheduleBlockUpdate(int1, int2, int3, this, 1);
		}
		return int5;
	}
}