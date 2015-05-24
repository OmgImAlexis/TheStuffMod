package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBasicPickaxe extends ItemPickaxe {
	IIcon[] icon;
	int colour = 0xFFFFFF;
	
	public ItemBasicPickaxe(ToolMaterial material, String name, int colour) {
		super(material);
		this.maxStackSize = 1;
		this.setCreativeTab(ModCreativeTabs.tool);
		this.setUnlocalizedName(name + "Pickaxe");
		Reference.incrementItems();
		this.colour = colour;
	}
	
	public ItemBasicPickaxe(ToolMaterial material, String name, int colour, CreativeTabs tab) {
		this(material, name, colour);
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
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamageForRenderPass(int meta, int pass) {
		return pass == 0 ? icon[0] : icon[1];
	}
	
	public int getColour() {
		return colour;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		if(pass == 1) return this.getColour();
		else return super.getColorFromItemStack(stack, pass);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {
		icon = new IIcon[2];
		icon[0] = register.registerIcon(Reference.MOD_ID+":pickaxeHandle");
		icon[1] = register.registerIcon(Reference.MOD_ID+":pickaxe");
	}
}