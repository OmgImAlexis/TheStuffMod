package com.shnupbups.allthethings.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.item.ItemBackpack;

public class InventoryBackpack implements IInventory {
	public static final int size=ConfigurationHandler.backpackSlots;
	public ItemStack[] inventory=new ItemStack[size];
	public final ItemStack invItem;

	public InventoryBackpack(ItemStack stack) {
		this.invItem=stack;
		if(!stack.hasTagCompound()) {
			stack.setTagCompound(new NBTTagCompound());
		}
		readFromNBT(stack.getTagCompound());
	}

	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		if(slot<inventory.length) {
			return inventory[slot];
		}
		return null;
	}

	@Override
	public ItemStack decrStackSize(int slot,int amount) {
		ItemStack stack=getStackInSlot(slot);
		if(stack!=null) {
			if(stack.stackSize>amount) {
				stack=stack.splitStack(amount);
				markDirty();
			} else {
				setInventorySlotContents(slot,null);
			}
		}
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack stack=getStackInSlot(slot);
		if(stack!=null) {
			setInventorySlotContents(slot,null);
		}
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot,ItemStack itemstack) {
		if(slot<inventory.length) {
			inventory[slot]=itemstack;
			if(itemstack!=null&&itemstack.stackSize>this.getInventoryStackLimit()) {
				itemstack.stackSize=this.getInventoryStackLimit();
			}
			markDirty();
		}
	}

	@Override
	public String getInventoryName() {
		return "Backpack";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void markDirty() {
		for(int i=0;i<getSizeInventory();++i) {
			if(getStackInSlot(i)!=null&&getStackInSlot(i).stackSize==0) {
				inventory[i]=null;
			}
		}
		writeToNBT(invItem.getTagCompound());
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return player.getHeldItem()==invItem;
	}

	@Override
	public void openInventory() {
		((ItemBackpack)invItem.getItem()).isOpen=true;
	}

	@Override
	public void closeInventory() {
		((ItemBackpack)invItem.getItem()).isOpen=false;
	}

	@Override
	public boolean isItemValidForSlot(int slot,ItemStack stack) {
		return !(stack.getItem() instanceof ItemBackpack);
	}

	public void readFromNBT(NBTTagCompound compound) {
		NBTTagList items=compound.getTagList("inventory",Constants.NBT.TAG_COMPOUND);
		for(int i=0;i<items.tagCount();++i) {
			NBTTagCompound item=(NBTTagCompound)items.getCompoundTagAt(i);
			byte slot=item.getByte("slot");
			if(slot>=0&&slot<getSizeInventory()) {
				inventory[slot]=ItemStack.loadItemStackFromNBT(item);
			}
		}
	}

	public void writeToNBT(NBTTagCompound tagcompound) {
		NBTTagList items=new NBTTagList();
		for(int i=0;i<getSizeInventory();++i) {
			if(getStackInSlot(i)!=null) {
				NBTTagCompound item=new NBTTagCompound();
				item.setInteger("slot",i);
				getStackInSlot(i).writeToNBT(item);
				items.appendTag(item);
			}
		}
		tagcompound.setTag("inventory",items);
	}
}
