package com.omgimalexis.allthethings.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

import com.omgimalexis.allthethings.handler.ConfigurationHandler;
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
		Reference.incrementBlocks();
	}
	
	/**
	 * Define a new Basic Block.
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 */
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, SoundType sound) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		Reference.incrementBlocks();
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
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	/**
	 * Gets the item dropped.
	 * @param metadata
	 * @param random
	 * @param fortune
	 * @return Item drop
	 */
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
}