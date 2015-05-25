package com.shnupbups.allthethings.tileEntity;

import com.shnupbups.allthethings.energy.EnergyBar;
import com.shnupbups.allthethings.energy.IEnergy;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.machine.BlockType;
import com.shnupbups.allthethings.machine.IMachine;
import com.shnupbups.allthethings.utility.LogHelper;
import com.shnupbups.allthethings.utility.OvenRecipes;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityOven extends TileEntity implements ISidedInventory,IEnergy,IMachine {

	private static final int[] slotsTop = new int[]{0,1,2,3,4,5,6,7,8};
	private static final int[] slotsBottom = new int[]{9,10};
	private static final int[] slotsSides = new int[]{0,1,2,3,4,5,6,7,8};
	
	public EnergyBar energyBar = new EnergyBar(50000);
	public int defaultMaxEnergy = 50000;
	public int maxEnergy = 50000;
	public ItemStack[] inventory = new ItemStack[14];
	public int energyUsePerOperate = 1600;
	public int defaultUsePerOperate = 1600;
	public int operateStatus;
	public int operateTime = 160;
	public int defaultTime = 160;
	public int energyInput = 200;
	public int defaultInput = 200;
	public int chanceOfSecondOutput = 0;
	
	public TileEntityOven() {
	}
	
	public void updateEntity() {
		updateUpgrades();
		
		energyBar.setMaxEnergy(maxEnergy);
		if(canOperate()) {
			this.operateStatus += 1;
			if(energyUsePerOperate/operateTime > 0) {
				energyBar.removeEnergy(energyUsePerOperate/operateTime);
			} else {
				energyBar.removeEnergy(energyUsePerOperate);
			}
		}
		
		if(this.operateStatus >= this.operateTime) {
			operate();
			this.operateStatus = 0;
		}
		
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	public void updateUpgrades() {
		operateTime = defaultTime;
		energyUsePerOperate = defaultUsePerOperate;
		chanceOfSecondOutput = 0;
		maxEnergy = defaultMaxEnergy;
		energyInput = defaultInput;
		for (int i = 11; i < 14; i++) {
			if(inventory[i] != null && inventory[i].getItem() != null) {
				if(inventory[i].getItem() == ModItems.speedUpgrade) {
					operateTime /= 2.5;
				} else if(inventory[i].getItem() == ModItems.efficiencyUpgrade) {
					energyUsePerOperate -= 300;
				} else if(inventory[i].getItem() == ModItems.capacityUpgrade) {
					maxEnergy *= 2;
				} else if(inventory[i].getItem() == ModItems.outputUpgrade) {
					chanceOfSecondOutput++;
				} else if(inventory[i].getItem() == ModItems.inputUpgrade) {
					energyInput *= 10;
				}
			}
		}
	}

	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount) {
		if(inventory[slot] != null) {
			ItemStack itemstack;
			
			if(inventory[slot].stackSize <= amount) {
				itemstack = inventory[slot];
				inventory[slot] = null;
				return itemstack;
			} else {
				itemstack = inventory[slot].splitStack(amount);
				
				if(inventory[slot].stackSize == 0) {
					inventory[slot] = null;
				}
				
				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		if(inventory[slot] != null) {
			ItemStack itemstack = inventory[slot];
			inventory[slot] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public String getInventoryName() {
		return "Oven";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		return true;
	}

	@Override
	public void openInventory() {
		
	}

	@Override
	public void closeInventory() {
		
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		markDirty();
		return true;
	}

	@Override
	public boolean canAddEnergyOnSide(ForgeDirection direction) {
		return true;
	}

	@Override
	public boolean canConnect(ForgeDirection direction) {
		return true;
	}

	@Override
	public EnergyBar getEnergyBar() {
		return energyBar;
	}

	@Override
	public void setLastReceivedDirection(ForgeDirection direction) {
		
	}

	@Override
	public int getEnergyTransferRate() {
		return energyInput;
	}

	@Override
	public BlockType getTypeOfBlock() {
		return BlockType.MACHINE;
	}
	
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}
	
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		energyBar.writeToNBT(tag);
		NBTTagList list = new NBTTagList();
		for(int i = 0; i < this.inventory.length; i++) {
			if(this.inventory[i] != null) {
				NBTTagCompound compound1 = new NBTTagCompound();
				compound1.setByte("slot", (byte) i);
				this.inventory[i].writeToNBT(compound1);
				list.appendTag(compound1);
			}
		}
		tag.setTag("inventory", list);
		tag.setInteger("operateStatus", operateStatus);
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		energyBar.readFromNBT(tag);
		NBTTagList list = tag.getTagList("inventory", 10);
		this.inventory = new ItemStack[this.getSizeInventory()];
		for(int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound compound1 = list.getCompoundTagAt(i);
			byte byte0 = compound1.getByte("slot");
			
			if(byte0 >= 0 && byte0 < this.inventory.length) {
				this.inventory[byte0] = ItemStack.loadItemStackFromNBT(compound1);
			}
		}
		operateStatus = tag.getInteger("operateStatus");
	}
	
	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	}
	
	public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		inventory[slot] = itemstack;
		
		if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}
		
		markDirty();
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int side) {
		return side == 0 ? slotsBottom : (side == 1 ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int slot, ItemStack itemstack, int side) {
		return this.isItemValidForSlot(slot, itemstack);
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack itemstack, int side) {
		if(side == 0) return (slot == 9 || slot == 10);
		return false;
	}

	@Override
	public void operate() {
		if(!worldObj.isRemote) {
			if(OvenRecipes.getCookResult(inventory) != null) {
				if(inventory[9] == null){
					if(!(OvenRecipes.getCookResult(inventory).stackSize >= 1)) OvenRecipes.getCookResult(inventory).stackSize = 1;
					setInventorySlotContents(9, OvenRecipes.getCookResult(inventory).copy());
					inventory[9].stackSize = 1;
					if(this.worldObj.rand.nextInt(5) < chanceOfSecondOutput) {
						if(inventory[10] == null){
							setInventorySlotContents(10, OvenRecipes.getCookResult(inventory).copy());
							inventory[10].stackSize = 1;
						} else if(inventory[10].isItemEqual(OvenRecipes.getCookResult(inventory))) {
							inventory[10].stackSize += 1;
						}
					}
					markDirty();
				} else if(inventory[9].isItemEqual(OvenRecipes.getCookResult(inventory))) {
					inventory[9].stackSize += 1;
					if(this.worldObj.rand.nextInt(5) < chanceOfSecondOutput) {
						if(inventory[10] == null){
							setInventorySlotContents(10, OvenRecipes.getCookResult(inventory).copy());
							inventory[10].stackSize = 1;
						} else if(inventory[10].isItemEqual(OvenRecipes.getCookResult(inventory))) {
							inventory[10].stackSize += 1;
						}
					}
					markDirty();
				}
				markDirty();
				
				for (int i = 0; i < 9; i++) {
					if(inventory[i] != null) {
						if(inventory[i].getItem().hasContainerItem(inventory[i])) {
							inventory[i] = new ItemStack(inventory[i].getItem().getContainerItem());
							markDirty();
						} else {
							inventory[i].stackSize--;
							markDirty();
							if(inventory[i].stackSize <= 0) {
								inventory[i] = null;
								markDirty();
							}
						}
						markDirty();
					}
				}
			}
			
			markDirty();
		}
	}

	@Override
	public boolean canOperate() {
		if(inventory[0] == null && inventory[1] == null && inventory[2] == null && inventory[3] == null && inventory[4] == null && inventory[5] == null && inventory[6] == null && inventory[7] == null && inventory[8] == null) {return false;}
		if(OvenRecipes.getCookResult(inventory) == null) {return false;}
		if(!energyBar.canRemoveEnergy(energyUsePerOperate/operateTime)) {return false;}
        if(energyBar.getEnergy() < energyUsePerOperate) {return false;}
		if(inventory[9] == null && inventory[10] == null) {return true;}
		if((inventory[9] != null && !inventory[9].isItemEqual(OvenRecipes.getCookResult(inventory))) || (inventory[10] != null && !inventory[10].isItemEqual(OvenRecipes.getCookResult(inventory)))) {return false;}
		if((inventory[9] != null && inventory[9].stackSize + OvenRecipes.getCookResult(inventory).stackSize > inventory[9].getMaxStackSize() || inventory[10] != null && inventory[10].stackSize +OvenRecipes.getCookResult(inventory).stackSize > inventory[10].getMaxStackSize())) {return false;}
		if(inventory[9] != null) {
			int resultStack = inventory[9].stackSize + OvenRecipes.getCookResult(inventory).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= OvenRecipes.getCookResult(inventory).getMaxStackSize());
		} else {
			int resultStack = inventory[10].stackSize + OvenRecipes.getCookResult(inventory).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= OvenRecipes.getCookResult(inventory).getMaxStackSize());
		}
	}

}
