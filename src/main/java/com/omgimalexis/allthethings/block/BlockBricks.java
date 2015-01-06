package com.omgimalexis.allthethings.block;

import java.util.List;

import com.omgimalexis.allthethings.handler.PlayerLogin;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.lib.Strings;
import com.omgimalexis.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockBricks extends BlockBasic {
	public int meta;
	public String name;
	
	private IIcon[] blockIcons;
	
	public BlockBricks(String name, Material material, CreativeTabs tab, int harvest, int hard, int meta) {
		super(name, material, tab, harvest, hard);
		
		this.meta = meta;
		this.name = name;
	}
	
	@SideOnly(Side.CLIENT)
    private IIcon[] icons;
   
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
	{
    	icons = new IIcon[meta+1];
         
          for(int i = 0; i < icons.length; i++)
          {
        	  icons[i] = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + Strings.brickNames[i]);
          }
	}
   
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
	{
    	return icons[meta];
	}
	
	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < meta+1; ix++) {
			subItems.add(new ItemStack(item, 1, ix));
		}
	}
}
