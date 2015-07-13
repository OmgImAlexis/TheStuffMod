package com.shnupbups.allthethings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import baubles.common.lib.PlayerHandler;

import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.Optional.Method;

@Optional.Interface(iface="baubles.api.IBauble", modid="Baubles", striprefs=true)
public class ItemRing extends ItemBasic implements baubles.api.IBauble {
	
	private boolean hasPower = false;

	public ItemRing(String name, CreativeTabs tab, int stackSize, boolean hasPower) {
		super(name, tab, stackSize);
		this.hasPower = hasPower;
		Reference.incrementItems();
	}
	
	public ItemRing(String name, CreativeTabs tab, boolean hasPower) {
		this(name, tab, 1);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, int stackSize, boolean hasPower) {
		this(name, ModCreativeTabs.tool, stackSize);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, boolean hasPower) {
		this(name, ModCreativeTabs.tool);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, boolean hasPower, String lore) {
		super(name, ModCreativeTabs.tool, 1, lore);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize);
	}
	
	public ItemRing(String name, CreativeTabs tab) {
		this(name, tab, 1);
	}
	
	public ItemRing(String name, int stackSize) {
		this(name, ModCreativeTabs.tool, stackSize);
	}
	
	public ItemRing(String name) {
		this(name, ModCreativeTabs.tool);
	}

	@Method(modid="Baubles")
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Method(modid="Baubles")
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Method(modid="Baubles")
	public baubles.api.BaubleType getBaubleType(ItemStack itemstack) {
		return baubles.api.BaubleType.RING;
	}

	@Method(modid="Baubles")
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if(this.hasPower && !player.worldObj.isRemote) {
			((EntityPlayer) player).addChatMessage(new ChatComponentText("A feeling of ultimate power surges through you."));
		}
	}

	@Method(modid="Baubles")
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		if(this.hasPower && !player.worldObj.isRemote) {
			((EntityPlayer) player).addChatMessage(new ChatComponentText("The power immediately leaves."));
		}
	}

	@Method(modid="Baubles")
	public void onWornTick(ItemStack arg0, EntityLivingBase arg1) {
		// Do power
	}
	
	@Method(modid="Baubles")
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(!par2World.isRemote) { 
			baubles.common.container.InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(par3EntityPlayer);
			for(int i = 0; i < baubles.getSizeInventory(); i++)
				if(baubles.getStackInSlot(i) == null && baubles.isItemValidForSlot(i, par1ItemStack)) {
					baubles.setInventorySlotContents(i, par1ItemStack.copy());
					if(!par3EntityPlayer.capabilities.isCreativeMode){
						par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.currentItem, null);
					}
					onEquipped(par1ItemStack, par3EntityPlayer);
					break;
				}
		}

		return par1ItemStack;	
	}
}
