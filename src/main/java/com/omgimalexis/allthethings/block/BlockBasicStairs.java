package com.omgimalexis.allthethings.block;

import java.util.Random;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.UtilityCheck;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicStairs extends BlockStairs {
	public BlockBasicStairs(String name, CreativeTabs tab, int harvest, int hard, Block block, int meta) {
		super(block, meta);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(block.getMaterial()), harvest);
		this.useNeighborBrightness = true;
		Reference.incrementBlocks();
	}
	
	public BlockBasicStairs(String name, CreativeTabs tab, int harvest, int hard, int opacity, Block block, int meta) {
		this(name, tab, harvest, hard, block, meta);
		this.setLightOpacity(opacity);
	}
	
	public BlockBasicStairs(String name, CreativeTabs tab, int harvest, int hard, float light, Block block, int meta) {
		this(name,  tab, harvest, hard, block, meta);
		this.setLightLevel(light);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	@Override
	public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
	    return UtilityCheck.isBlockBeaconBase(this);
	}
}