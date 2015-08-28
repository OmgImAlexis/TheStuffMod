package com.shnupbups.allthethings.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasic extends Block {
	public Item itemDropped;
	public int minDropped = 1;
	public int maxDropped = 1;

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard) {
		super(material);
		setBlockName(name);
		setCreativeTab(tab);
		blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material),harvest);
		setStepSound(UtilityCheck.getSoundFromMaterial(material));
		Reference.incrementBlocks();
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param light */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,float light) {
		this(name,material,tab,harvest,hard);
		setLightLevel(light);
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param light
	 * @param drop */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,float light,Item drop) {
		this(name,material,tab,harvest,hard,light);
		itemDropped = drop;
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param light
	 * @param drop */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,float light,ItemStack drop) {
		this(name,material,tab,harvest,hard,light);
		itemDropped = drop.getItem();
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param opacity */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,int opacity) {
		this(name,material,tab,harvest,hard);
		setLightOpacity(opacity);
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,Item drop) {
		this(name,material,tab,harvest,hard);
		itemDropped = drop;
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop
	 * @param quantity */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,Item drop,int quantity) {
		this(name,material,tab,harvest,hard,drop);
		minDropped = quantity;
		maxDropped = quantity;
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop
	 * @param min
	 * @param max */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,Item drop,int min,int max) {
		this(name,material,tab,harvest,hard,drop);
		minDropped = min;
		maxDropped = max;
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param drop */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,ItemStack drop) {
		this(name,material,tab,harvest,hard);
		itemDropped = drop.getItem();
	}

	/** Define a new Basic Block.
	 *
	 * @param name
	 * @param material
	 * @param tab
	 * @param harvest
	 * @param hard
	 * @param sound */
	public BlockBasic(String name,Material material,CreativeTabs tab,int harvest,int hard,SoundType sound) {
		this(name,material,tab,harvest,hard);
		setStepSound(sound);
	}

	/** Gets the item dropped.
	 *
	 * @param metadata
	 * @param random
	 * @param fortune
	 * @return Item drop */
	@Override
	public Item getItemDropped(int metadata,Random random,int fortune) {
		if(itemDropped != null) return itemDropped;
		else if(UtilityCheck.getDrop(this) != null) return UtilityCheck.getDrop(this);
		else return Item.getItemFromBlock(this);
	}

	/** Gets the unlocalized name for registering
	 *
	 * @return String trueUnlocalizedName */
	public String getTrueUnlocalizedName() {
		return getUnlocalizedName().substring(getUnlocalizedName().indexOf(":") + 1);
	}

	/** Gets the unlocalized name.
	 *
	 * @return String name */
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	/** Gets the unlocalized name, unwrapped.
	 *
	 * @param unlocalizedName
	 * @return String unwrappedUnlocalizedName */
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	/** Gets whether or not the block can be used to form a beacon's pyramid.
	 *
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param beaconX
	 * @param beaconY
	 * @param beaconZ
	 * @return boolean isBeaconBase */
	@Override
	public boolean isBeaconBase(IBlockAccess world,int x,int y,int z,int beaconX,int beaconY,int beaconZ) {
		if(ConfigurationHandler.beaconBase == false) return false;
		return UtilityCheck.isBlockBeaconBase(this);
	}

	@Override
	public void onEntityCollidedWithBlock(World world,int x,int y,int z,Entity entity) {
		if(this == ModBlocks.fluxInfestedSoil) {
			if(entity instanceof EntityLivingBase) {
				((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.wither.getId(),20,5));
			}
		}
	}

	@Override
	public void onEntityWalking(World world,int x,int y,int z,Entity entity) {
		if(this == ModBlocks.fluxInfestedSoil) {
			if(entity instanceof EntityLivingBase) {
				((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.wither.getId(),20,5));
			}
		}
	}

	/** Gets the amount of items dropped.
	 *
	 * @param rand
	 * @return int amount */
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt((maxDropped - minDropped) + 1) + minDropped;
	}

	@Override
	public int quantityDroppedWithBonus(int p_149679_1_,Random p_149679_2_) {
		if(p_149679_1_ > 0 && Item.getItemFromBlock(this) != getItemDropped(0,p_149679_2_,p_149679_1_)) {
			int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;
			if(j < 0) {
				j = 0;
			}
			return this.quantityDropped(p_149679_2_) * (j + 1);
		} else return this.quantityDropped(p_149679_2_);
	}

	/** Registers the texture
	 *
	 * @param iconRegister */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(getUnlocalizedName())));
	}

	@Override
	public void updateTick(World world,int int1,int int2,int int3,Random random) {
		if(this == ModBlocks.blockTrytementium) {
			this.removedByPlayer(world,null,int1,int2,int3,true);
		}
	}
}