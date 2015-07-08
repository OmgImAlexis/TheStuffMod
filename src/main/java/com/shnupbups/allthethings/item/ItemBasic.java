package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

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
	
	public String getTextureString() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1);
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
		if(this == ModItems.fyrestone) {entity.setFire(3);}
		else if(this == ModItems.ingotLead) {if(new Random().nextInt(200) <= 2) {((EntityLivingBase) entity).addPotionEffect(new PotionEffect(ModPotions.leadPoison.getId(), 10, 0));}}
		else if(this == ModItems.crymeretye) {((EntityLivingBase) entity).addPotionEffect(new PotionEffect(ModPotions.lessening.getId(), 2, 5));}
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
}