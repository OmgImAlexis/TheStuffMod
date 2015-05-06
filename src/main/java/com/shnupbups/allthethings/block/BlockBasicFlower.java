package com.shnupbups.allthethings.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicFlower extends BlockFlower {
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
	public BlockBasicFlower(String name, CreativeTabs tab) {
		super(0);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		Reference.incrementBlocks();
		this.setStepSound(Block.soundTypeGrass);
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
	public BlockBasicFlower(String name, CreativeTabs tab, SoundType sound) {
		this(name, tab);
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
	public BlockBasicFlower(String name, CreativeTabs tab, int opacity) {
		this(name, tab);
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
	public BlockBasicFlower(String name, CreativeTabs tab, float light) {
		this(name, tab);
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
	public BlockBasicFlower(String name, CreativeTabs tab, float light, Item drop) {
		this(name, tab, light);
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
	public BlockBasicFlower(String name, CreativeTabs tab, float light, ItemStack drop) {
		this(name, tab, light);
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
	public BlockBasicFlower(String name, CreativeTabs tab, Item drop) {
		this(name, tab);
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
	public BlockBasicFlower(String name, CreativeTabs tab, ItemStack drop) {
		this(name, tab);
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
	public BlockBasicFlower(String name, CreativeTabs tab, Item drop, int min, int max) {
		this(name, tab, drop);
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
	public BlockBasicFlower(String name, CreativeTabs tab, Item drop, int quantity) {
		this(name, tab, drop);
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
		else if(UtilityCheck.getDrop(this) != null) return UtilityCheck.getDrop(this);
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
	
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
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
	
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return blockIcon;
    }
	
}