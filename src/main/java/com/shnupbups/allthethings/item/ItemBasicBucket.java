package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBasicBucket extends ItemBucket {
	public IIcon[] icon;
	
	public int colour = 0xFFFFFF;
	
	public ItemBasicBucket(Block fluid) {
		super(fluid);
		this.maxStackSize = 1;
		this.setCreativeTab(ModCreativeTabs.liquid);
		this.setNoRepair();
		this.setContainerItem(Items.bucket);
		Reference.incrementItems();
	}
	
	public ItemBasicBucket(String name, Block fluid, CreativeTabs tab, int stackSize, int colour) {
		this(fluid);
		this.setUnlocalizedName(name);
		this.maxStackSize = stackSize;
		this.setCreativeTab(tab);
		this.colour = colour;
	}
	
	public ItemBasicBucket(String name, Block fluid, CreativeTabs tab, int colour) {
		this(name, fluid, tab, 1, colour);
	}
	
	public ItemBasicBucket(String name, Block fluid, int stackSize, int colour) {
		this(name, fluid, ModCreativeTabs.item, stackSize, colour);
	}
	
	public ItemBasicBucket(String name, Block fluid, int colour) {
		this(name, fluid, ModCreativeTabs.item, colour);
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
		icon[0] = register.registerIcon(Reference.MOD_ID+":bucketBg");
		icon[1] = register.registerIcon(Reference.MOD_ID+":bucketOverlay");
	}
}