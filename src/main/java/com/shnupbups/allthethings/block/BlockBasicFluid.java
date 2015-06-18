package com.shnupbups.allthethings.block;

import com.shnupbups.allthethings.init.ModDebugTabs;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.ColourHelper;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockBasicFluid extends BlockFluidClassic {
	@SideOnly(Side.CLIENT)
	public IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	public IIcon flowingIcon;

    public Item base;
	
	public BlockBasicFluid(String name, Fluid fluid, Item base) {
		super(fluid, Material.lava);
		this.setBlockName(name);
		if(Reference.DEBUG_MODE) {
			this.setCreativeTab(ModDebugTabs.debug);
		}
        this.base = base;
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

    @Override
    @SideOnly(Side.CLIENT)
    public int getBlockColor() {
        return ColourHelper.getAverageColour(new ResourceLocation(base.getIcon(new ItemStack(base), 0).getIconName()));
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_) {
        return ColourHelper.getAverageColour(new ResourceLocation(base.getIcon(new ItemStack(base), 0).getIconName()));
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        return ColourHelper.getAverageColour(new ResourceLocation(base.getIcon(new ItemStack(base), 0).getIconName()));
    }
}