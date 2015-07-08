package com.shnupbups.allthethings.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import com.shnupbups.allthethings.init.ModDebugTabs;
import com.shnupbups.allthethings.item.ItemBasic;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.ColourHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicFluid extends BlockFluidClassic {
	@SideOnly(Side.CLIENT)
	public IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	public IIcon flowingIcon;

    public int colour = -1;
    public Item base;
    public int meta = 0;
    public Fluid fluid;
	
	public BlockBasicFluid(String name, Fluid fluid, Item base) {
		this(name, fluid);
		this.base = base;
	}
	
	public BlockBasicFluid(String name, Fluid fluid, Item base, int meta) {
		this(name, fluid);
		this.base = base;
		this.meta = meta;
	}
	
	public BlockBasicFluid(String name, Fluid fluid, int colour) {
		this(name, fluid);
		this.colour = colour;
	}
	
	public BlockBasicFluid(String name, Fluid fluid) {
		super(fluid, Material.lava);
		this.setBlockName(name);
		if(Reference.DEBUG_MODE) {
			this.setCreativeTab(ModDebugTabs.debug);
		}
		this.fluid = fluid;
		Reference.incrementBlocks();
	}
    
    @Override
    public IIcon getIcon(int side, int meta) {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
    	stillIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":liquidStill");
        flowingIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":liquidFlowing");
    }
    
    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
            if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
            return super.canDisplace(world, x, y, z);
    }
    
    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
            if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
            return super.displaceIfPossible(world, x, y, z);
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
    
    @Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
    
    public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}
    
    public BlockBasicFluid setBlockColour(int colour) {
    	this.colour = colour;
    	return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getBlockColor() {
    	if(colour == -1 && base != null) {
    		colour = ColourHelper.getAverageColour(base, meta);
    	}
        return colour;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_) {
        return getBlockColor();
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        return getBlockColor();
    }
}