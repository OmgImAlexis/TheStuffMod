package com.omgimalexis.allthethings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.omgimalexis.allthethings.creativetabs.ModCreativeTabs;
import com.omgimalexis.allthethings.lib.Reference;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.Optional.Method;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;

public class ItemRing extends ItemBasic implements IBauble {
	
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
		this(name, ModCreativeTabs.jewelry, stackSize);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, boolean hasPower) {
		this(name, ModCreativeTabs.jewelry);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, boolean hasPower, String lore) {
		super(name, ModCreativeTabs.jewelry, 1, lore);
		this.hasPower = hasPower;
	}
	
	public ItemRing(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize);
	}
	
	public ItemRing(String name, CreativeTabs tab) {
		this(name, tab, 1);
	}
	
	public ItemRing(String name, int stackSize) {
		this(name, ModCreativeTabs.jewelry, stackSize);
	}
	
	public ItemRing(String name) {
		this(name, ModCreativeTabs.jewelry);
	}

	@Method(modid="Baubles")
	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Method(modid="Baubles")
	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Method(modid="Baubles")
	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

	@Method(modid="Baubles")
	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if(hasPower) {
			((EntityPlayer) player).addChatMessage(new ChatComponentText("A feeling of ultimate power surges through you."));
			if (!player.worldObj.isRemote) {
				player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
			}
		}
	}

	@Method(modid="Baubles")
	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		if(hasPower) {
			((EntityPlayer) player).addChatMessage(new ChatComponentText("The power immediately leaves."));
			if (!player.worldObj.isRemote) {
				player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
			}
		}
	}

	@Method(modid="Baubles")
	@Override
	public void onWornTick(ItemStack arg0, EntityLivingBase arg1) {
		// Do power
	}
	
	@Method(modid="Baubles")
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(!par2World.isRemote) { 
			InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(par3EntityPlayer);
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
