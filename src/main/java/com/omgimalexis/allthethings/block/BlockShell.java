package com.omgimalexis.allthethings.block;

import java.util.Random;

import com.omgimalexis.allthethings.init.ModArmour;
import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.tileEntity.TileEntityShell;
import com.omgimalexis.allthethings.utility.LogHelper;
import com.omgimalexis.allthethings.utility.UtilityCheck;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockShell extends BlockContainer {

	public TileEntityShell te;
	
	public BlockShell(String name, Material material, int harvest, int hard) {
		super(material);
		this.setBlockName(name);
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		this.blockHardness = hard;
		this.setStepSound(UtilityCheck.getSoundFromMaterial(material));
		Reference.incrementBlocks();
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		te = new TileEntityShell();
		return te;
	}
    
    @Override
    public int getRenderType() {
            return -1;
    }
    
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    public boolean renderAsNormalBlock() {
            return false;
    }
    
    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
    
    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
    	return ModArmour.shell;
    }
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
    	blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
    
    @Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemstack)
    {
    	int l = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) - 0.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }
    
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
        int l = p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_);
        if(l == 0 || l == 2) this.setBlockBounds(0.125F, 0.0F, 0.0F, 0.875F, 0.5625F, 1.0F);
        else this.setBlockBounds(0.0F, 0.0F, 0.125F, 1.0F, 0.5625F, 0.875F);
    }
}
