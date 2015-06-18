package com.shnupbups.allthethings.block;

import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.ColourHelper;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMaterial extends BlockBasic {

    public Item base;

    public BlockMaterial(String name, Material material, CreativeTabs tab, int harvest, int hard, Item base) {
        super(name, material, tab, harvest, hard);
        this.base = base;
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

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        if(base instanceof ItemMaterial) {
            if(((ItemMaterial) base).getType() == MaterialType.INGOT || ((ItemMaterial) base).getType() == MaterialType.ALLOY) {
                blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":blockMetal");
            } else if(((ItemMaterial) base).getType() == MaterialType.GEM) {
                blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":blockGem");
            }
        } else {
            blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":blockMetal");
        }
    }
}
