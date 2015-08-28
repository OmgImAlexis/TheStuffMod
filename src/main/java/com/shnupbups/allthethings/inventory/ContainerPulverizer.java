package com.shnupbups.allthethings.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.shnupbups.allthethings.item.ItemUpgrade;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

public class ContainerPulverizer extends Container {
	public final EntityPlayer player;
	public final World world;
	public final int x;
	public final int y;
	public final int z;
	public TileEntityPulverizer tileentity;

	public ContainerPulverizer(EntityPlayer player,World world,int x,int y,int z) {
		this.player=player;
		this.world=world;
		this.x=x;
		this.y=y;
		this.z=z;
		this.tileentity=(TileEntityPulverizer)world.getTileEntity(x,y,z);
		this.addSlotToContainer(new Slot(tileentity,0,53,39));
		this.addSlotToContainer(new SlotOutput(tileentity,1,103,39));
		this.addSlotToContainer(new SlotOutput(tileentity,2,126,39));
		this.addSlotToContainer(new SlotUpgrade(tileentity,3,116,7));
		this.addSlotToContainer(new SlotUpgrade(tileentity,4,134,7));
		this.addSlotToContainer(new SlotUpgrade(tileentity,5,152,7));
		for(int i=0;i<3;i++) {
			for(int j=0;j<9;j++) {
				this.addSlotToContainer(new Slot(player.inventory,j+i*9+9,8+j*18,84+i*18));
			}
		}
		for(int i=0;i<9;i++) {
			this.addSlotToContainer(new Slot(player.inventory,i,8+i*18,142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		return true;
	}

	public ItemStack transferStackInSlot(EntityPlayer player,int num) {
		ItemStack itemstack=null;
		Slot slot=(Slot)this.inventorySlots.get(num);
		if(slot!=null&&slot.getHasStack()) {
			ItemStack itemstack1=slot.getStack();
			itemstack=itemstack1.copy();
			if(num<=5) {
				if(!this.mergeItemStack(itemstack1,6,41,true)) {
					return null;
				}
				slot.onSlotChange(itemstack1,itemstack);
			} else {
				if(itemstack.getItem() instanceof ItemUpgrade) {
					if(!this.mergeItemStack(itemstack1,3,6,false)) {
						return null;
					}
				} else {
					if(!this.mergeItemStack(itemstack1,0,1,false)) {
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
}
