package com.omgimalexis.allthethings.item;

import com.omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import com.omgimalexis.allthethings.init.ModItems;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.UtilityCheck;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasic extends Item {	
	public ItemBasic(String name, CreativeTabs tab, int stackSize) {
		super();
		this.setUnlocalizedName(name);
		this.maxStackSize = stackSize;
		this.setCreativeTab(tab);
		this.setNoRepair();
		Reference.incrementItems();
	}
	
	public ItemBasic(String name, CreativeTabs tab) {
		this(name, tab, 64);
	}
	
	public ItemBasic(String name, int stackSize) {
		this(name, TMCreativeTabs.item, stackSize);
	}
	
	public ItemBasic(String name) {
		this(name, TMCreativeTabs.item);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	/**
	 * Makes Fyrestone set the player on Fire
	 * 
	 **/
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
		if(this == ModItems.fyrestone) {entity.setFire(3);}
	}
	
	@Override
	public boolean isBeaconPayment(ItemStack stack) {
		return UtilityCheck.isItemBeaconPayment(stack);
	}
}