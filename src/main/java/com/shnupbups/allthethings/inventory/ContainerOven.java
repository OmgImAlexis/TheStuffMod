package com.shnupbups.allthethings.inventory;

import com.shnupbups.allthethings.item.ItemUpgrade;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerOven extends Container {

	public final EntityPlayer player;
	public final World world;
	public final int x;
	public final int y;
	public final int z;
	public TileEntityOven tileentity;
	
	public ContainerOven(EntityPlayer player, World world, int x, int y, int z) {
		this.player = player;
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.tileentity = (TileEntityOven) world.getTileEntity(x, y, z);
		
		this.addSlotToContainer(new Slot(tileentity, 0, 26, 21));
		this.addSlotToContainer(new Slot(tileentity, 1, 44, 21));
		this.addSlotToContainer(new Slot(tileentity, 2, 62, 21));
		this.addSlotToContainer(new Slot(tileentity, 3, 26, 39));
		this.addSlotToContainer(new Slot(tileentity, 4, 44, 39));
		this.addSlotToContainer(new Slot(tileentity, 5, 62, 39));
		this.addSlotToContainer(new Slot(tileentity, 6, 26, 57));
		this.addSlotToContainer(new Slot(tileentity, 7, 44, 57));
		this.addSlotToContainer(new Slot(tileentity, 8, 62, 57));
		this.addSlotToContainer(new SlotOutput(tileentity, 9, 112, 39));
		this.addSlotToContainer(new SlotOutput(tileentity, 10, 135, 39));
		this.addSlotToContainer(new SlotUpgrade(tileentity, 11, 116, 7));
		this.addSlotToContainer(new SlotUpgrade(tileentity, 12, 134, 7));
		this.addSlotToContainer(new SlotUpgrade(tileentity, 13, 152, 7));
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
				
			}
		}
		
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 <= 14) {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            } else {
                if (itemstack.getItem() instanceof ItemUpgrade)
                {
                    if (!this.mergeItemStack(itemstack1, 11, 14, false))
                    {
                        return null;
                    }
                } else {
                    if (!this.mergeItemStack(itemstack1, 0, 9, false))
                    {
                        return null;
                    }
                }
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }

}
