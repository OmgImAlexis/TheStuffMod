package com.shnupbups.allthethings.block;

import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityGenerator;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGenerator extends BlockContainer {
	
	@SideOnly(Side.CLIENT)
	private IIcon top; 
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;
	
	private TileEntityGenerator te;
	
	public BlockGenerator(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		this.setStepSound(UtilityCheck.getSoundFromMaterial(material));
		Reference.incrementBlocks();
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		te = new TileEntityGenerator(60000, 200, 100);
		return te;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		this.blockIcon = iconregister.registerIcon(Reference.MOD_ID + ":generator");
		this.top = iconregister.registerIcon(Reference.MOD_ID + ":generatorTop");
		this.bottom = iconregister.registerIcon(Reference.MOD_ID + ":generatorBottom");
	}

	public IIcon getIcon(int side, int meta) {
		  if (te != null && side == te.outputSide.ordinal()) return this.top;
		  else if(te == null && side == 1) return this.top;
		  if (te != null && side == te.outputSide.getOpposite().ordinal()) return this.bottom;
		  else if(te == null && side == 0) return this.bottom;
	      else return this.blockIcon;
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}	
	
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		player.openGui(allthethings.instance, 5, world, x, y, z);
		return true;	
	}
}
