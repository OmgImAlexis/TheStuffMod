package com.omgimalexis.allthethings.item;

import java.util.List;

import com.google.common.collect.Multimap;
import com.omgimalexis.allthethings.creativetabs.ModCreativeTabs;
import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.init.ModItems;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.utility.UtilityCheck;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasic extends Item {
	private String lore;
	
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
		this(name, ModCreativeTabs.item, stackSize);
	}
	
	public ItemBasic(String name) {
		this(name, ModCreativeTabs.item);
	}
	
	public ItemBasic(String name, CreativeTabs tab, String lore) {
		this(name, tab, 64);
		this.lore = lore;
	}
	
	public ItemBasic(String name, int stackSize, String lore) {
		this(name, ModCreativeTabs.item, stackSize);
		this.lore = lore;
	}
	
	public ItemBasic(String name, String lore) {
		this(name, ModCreativeTabs.item, 64);
		this.lore = lore;
	}
	
	public ItemBasic(String name, CreativeTabs tab, int stackSize, String lore) {
		this(name, tab, stackSize);
		this.lore = lore;
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
		if(ConfigurationHandler.beaconFood == false) return false;
		return UtilityCheck.isItemBeaconPayment(stack);
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		if(this.lore != null) {
			list.add(lore);
		}
	}
	
	@Override
	public Multimap getAttributeModifiers(ItemStack stack){
		if(this == ModItems.paintbrush) {
			Multimap multimap = super.getAttributeModifiers(stack);
			multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 1.0F, 0));
			return multimap;
		}
        return super.getAttributeModifiers(stack);
    }
}