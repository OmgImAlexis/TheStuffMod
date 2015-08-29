package com.shnupbups.allthethings.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicSlab extends BlockSlab implements IBlockMod {
	private Block blockSuper;
	private boolean doubleSlab;
	private BlockSlab singleSlab;

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,Block block,int meta,boolean isDouble) {
		super(isDouble,material);
		this.setBlockName(name);
		if(!isDouble) this.setCreativeTab(tab);
		this.blockHardness=hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material),harvest);
		this.useNeighborBrightness=true;
		this.blockSuper=block;
		this.doubleSlab=isDouble;
		this.setStepSound(UtilityCheck.getSoundFromMaterial(material));
		Reference.incrementBlocks();
	}

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,Block block,int meta,boolean isDouble,BlockSlab single) {
		this(name,material,tab,harvest,hard,block,meta,isDouble);
		this.singleSlab=single;
	}

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,Block block) {
		this(name,material,tab,harvest,hard,block,false);
	}

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,Block block,boolean isDouble) {
		this(name,material,tab,harvest,hard,block,0,isDouble);
	}

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,Block block,boolean isDouble,BlockSlab single) {
		this(name,material,tab,harvest,hard,block,isDouble);
		this.singleSlab=single;
	}

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,int opacity,Block block,int meta,boolean isDouble) {
		this(name,material,tab,harvest,hard,block,meta,isDouble);
		this.setLightOpacity(opacity);
	}

	public BlockBasicSlab(String name,Material material,CreativeTabs tab,int harvest,int hard,float light,Block block,int meta,boolean isDouble) {
		this(name,material,tab,harvest,hard,block,meta,isDouble);
		this.setLightLevel(light);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon=iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(blockSuper.getUnlocalizedName())));
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

	@Override
	public int quantityDropped(Random rand) {
		if(this.doubleSlab) return 2;
		else return 1;
	}

	@Override
	public Item getItemDropped(int meta,Random rand,int fortune) {
		if(this.doubleSlab) return Item.getItemFromBlock(singleSlab);
		else return Item.getItemFromBlock(this);
	}

	/**
	 * Gets the unlocalized name based on metadata.
	 * Args: meta
	 */
	@Override
	public String func_150002_b(int p_150002_1_) {
		return this.getUnlocalizedName();
	}
}