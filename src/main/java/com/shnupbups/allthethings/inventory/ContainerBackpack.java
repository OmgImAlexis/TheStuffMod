package com.shnupbups.allthethings.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import com.shnupbups.allthethings.item.ItemBackpack;

public class ContainerBackpack extends Container {
	public final InventoryBackpack inventory;
	private static final int INV_START=(InventoryBackpack.size/3)*3,
			INV_END=INV_START+26,HOTBAR_START=INV_END+1,
			HOTBAR_END=HOTBAR_START+8;

	public ContainerBackpack(EntityPlayer player,InventoryPlayer inventoryPlayer,InventoryBackpack backpack) {
		this.inventory=backpack;
		inventory.openInventory();
		for(int i=0;i<3;++i) {
			for(int j=0;j<(InventoryBackpack.size)/3;j++) {
				this.addSlotToContainer(new SlotBackpack(this.inventory,j+i*((InventoryBackpack.size)/3),(89-(((InventoryBackpack.size/3)*18)/2))+(18*j),18+(18*i)));
			}
		}
		for(int i=0;i<3;++i) {
			for(int j=0;j<9;++j) {
				this.addSlotToContainer(new Slot(inventoryPlayer,j+i*9+9,8+j*18,84+i*18));
			}
		}
		for(int i=0;i<9;++i) {
			this.addSlotToContainer(new Slot(inventoryPlayer,i,8+i*18,142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return inventory.isUseableByPlayer(player);
	}

	public ItemStack transferStackInSlot(EntityPlayer player,int num) {
		ItemStack itemstack=null;
		Slot slot=(Slot)this.inventorySlots.get(num);
		if(slot!=null&&slot.getHasStack()) {
			ItemStack itemstack1=slot.getStack();
			itemstack=itemstack1.copy();
			if(num<INV_START) {
				if(!this.mergeItemStack(itemstack1,INV_START,HOTBAR_END+1,true)) {
					return null;
				}
				slot.onSlotChange(itemstack1,itemstack);
			} else if(!(itemstack1.getItem() instanceof ItemBackpack)) {
				if(num>=INV_START&&num<HOTBAR_START) {
					if(!this.mergeItemStack(itemstack1,0,INV_START+1,false)&&!this.mergeItemStack(itemstack1,HOTBAR_START,HOTBAR_END+1,false)) {
						return null;
					}
				} else if(num>=HOTBAR_START&&num<HOTBAR_END+1) {
					if(!this.mergeItemStack(itemstack1,0,INV_START+1,false)&&!this.mergeItemStack(itemstack1,INV_START,INV_END+1,false)) {
						return null;
					}
				}
			}
			if(itemstack1.stackSize==0) {
				slot.putStack((ItemStack)null);
			} else {
				slot.onSlotChanged();
			}
			if(itemstack1.stackSize==itemstack.stackSize) {
				return null;
			}
			slot.onPickupFromSlot(player,itemstack1);
		}
		return itemstack;
	}

	@Override
	public ItemStack slotClick(int slot,int button,int flag,EntityPlayer player) {
		if(slot>=0&&getSlot(slot)!=null&&getSlot(slot).getStack()==player.getHeldItem()) {
			return null;
		}
		return super.slotClick(slot,button,flag,player);
	}

	public void onContainerClosed(EntityPlayer p_75134_1_) {
		super.onContainerClosed(p_75134_1_);
		inventory.closeInventory();
	}
}
