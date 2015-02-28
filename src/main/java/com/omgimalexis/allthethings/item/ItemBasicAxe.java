package com.omgimalexis.allthethings.item;

import com.omgimalexis.allthethings.init.ModCreativeTabs;
import com.omgimalexis.allthethings.lib.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasicAxe extends ItemAxe {
	public ItemBasicAxe(ToolMaterial material, String name) {
		super(material);
		this.maxStackSize = 1;
		this.setCreativeTab(ModCreativeTabs.tool);
		this.setUnlocalizedName(name + "Axe");
		Reference.incrementItems();
	}
	
	public ItemBasicAxe(ToolMaterial material, String name, CreativeTabs tab) {
		this(material, name);
		this.setCreativeTab(tab);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}