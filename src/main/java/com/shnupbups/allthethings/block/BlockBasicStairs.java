package com.shnupbups.allthethings.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

public class BlockBasicStairs extends BlockStairs implements IBlockMod {
	public BlockBasicStairs(String name,CreativeTabs tab,int harvest,int hard,Block block,int meta) {
		super(block,meta);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness=hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(block.getMaterial()),harvest);
		this.useNeighborBrightness=true;
		this.setStepSound(UtilityCheck.getSoundFromMaterial(block.getMaterial()));
		Reference.incrementBlocks();
	}

	public BlockBasicStairs(String name,CreativeTabs tab,int harvest,int hard,int opacity,Block block,int meta) {
		this(name,tab,harvest,hard,block,meta);
		this.setLightOpacity(opacity);
	}

	public BlockBasicStairs(String name,CreativeTabs tab,int harvest,int hard,float light,Block block,int meta) {
		this(name,tab,harvest,hard,block,meta);
		this.setLightLevel(light);
	}

	public BlockBasicStairs(String name,CreativeTabs tab,int harvest,int hard,Block block) {
		this(name,tab,harvest,hard,block,0);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")+1);
	}

	@Override
	public boolean isBeaconBase(IBlockAccess world,int x,int y,int z,int beaconX,int beaconY,int beaconZ) {
		return UtilityCheck.isBlockBeaconBase(this);
	}
}