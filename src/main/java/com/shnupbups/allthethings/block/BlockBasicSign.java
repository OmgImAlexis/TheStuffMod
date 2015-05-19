package com.shnupbups.allthethings.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicSign extends BlockSign{

	public Item drop;
	public Block texture;
	public boolean isStanding;
	public String teTexture;
	
	public BlockBasicSign(String name, Item drop, String teTexture, Material material, CreativeTabs tab, int harvest, int hard, boolean standing) {
		super(TileEntitySign.class, standing);
		isStanding = standing;
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		this.setStepSound(UtilityCheck.getSoundFromMaterial(material));
		this.drop = drop;
		this.teTexture = Reference.MOD_ID + ":textures/entity/"+teTexture+"Sign.png";
		Reference.incrementBlocks();
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return texture.getBlockTextureFromSide(p_149691_1_);
    }
	
	/**
	 * Gets the unlocalized name.
	 * @return String name
	 */
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return drop;
    }
	
	@SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return drop;
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
	 * Gets the unlocalized name for registering
	 * @return String trueUnlocalizedName
	 */
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}
	
	public void setTextureBase(Block block) {
		this.texture = block;
	}

}
