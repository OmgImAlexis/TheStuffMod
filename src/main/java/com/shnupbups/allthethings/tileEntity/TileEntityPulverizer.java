package com.shnupbups.allthethings.tileEntity;

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
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyReceiver;

import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.machine.ICraftingMachine;
import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.utility.LogHelper;
import com.shnupbups.allthethings.utility.MiscUtility;
import com.shnupbups.allthethings.utility.OvenRecipes;
import com.shnupbups.allthethings.utility.PulverizerRecipes;
import com.shnupbups.allthethings.utility.PulverizingRecipes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityPulverizer extends TileEntity implements ISidedInventory,IEnergyReceiver,ICraftingMachine {

	private static final int[] slotsTop = new int[]{0};
	private static final int[] slotsBottom = new int[]{1,2};
	private static final int[] slotsSides = new int[]{0,1,2};
	
	public EnergyStorage storage = new EnergyStorage(120000);
	public int defaultMaxEnergy = 50000;
	public int maxEnergy = 50000;
	public ItemStack[] inventory = new ItemStack[6];
	public int energyUseModifier = 0;
	public int operateStatus;
	public int operateTimeModifier = 0;
	public int energyInput = 200;
	public int defaultInput = 200;
	public int secondOutputChanceModifier = 0;
	
	public TileEntityPulverizer() {
	}
	
	public void updateEntity() {
		updateUpgrades();
		
		storage.setCapacity(maxEnergy);
		if(canOperate()) {
			this.operateStatus += 1;
			if(getEnergyNeeded()/getTimeNeeded() > 0) {
				storage.extractEnergy(getEnergyNeeded()/getTimeNeeded(), false);
			} else {
				storage.extractEnergy(getEnergyNeeded(), false);
			}
		}
		
		if(this.operateStatus >= getTimeNeeded() && getTimeNeeded() > 0) {
			if((getEnergyNeeded()/getTimeNeeded())*getTimeNeeded() != getEnergyNeeded()) {
				storage.extractEnergy(getEnergyNeeded()-((getEnergyNeeded()/getTimeNeeded())*getTimeNeeded()), false);
			}
			operate();
			this.operateStatus = 0;
		}
		
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	public void updateUpgrades() {
		operateTimeModifier = 0;
		energyUseModifier = 0;
		secondOutputChanceModifier = 0;
		maxEnergy = defaultMaxEnergy;
		energyInput = defaultInput;
		for (int i = 3; i < 6; i++) {
			if(inventory[i] != null && inventory[i].getItem() != null) {
				if(inventory[i].getItem() == ModItems.speedUpgrade) {
					operateTimeModifier++;
				} else if(inventory[i].getItem() == ModItems.efficiencyUpgrade) {
					energyUseModifier++;
				} else if(inventory[i].getItem() == ModItems.capacityUpgrade) {
					maxEnergy *= 2;
				} else if(inventory[i].getItem() == ModItems.outputUpgrade) {
					secondOutputChanceModifier++;
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
		return "Pulverizer";
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
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}
	
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		storage.writeToNBT(tag);
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
		storage.readFromNBT(tag);
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
		return (slot == 0 && this.isItemValidForSlot(slot, itemstack));
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack itemstack, int side) {
		return (slot == 1 || slot == 2);
	}

	@Override
	public void operate() {
		if(!worldObj.isRemote) {
			if(PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj) != null) {
				IMachineRecipe recipe = PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj);
				if(inventory[1] == null){
					setInventorySlotContents(1, PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj).copy());
					inventory[1].stackSize = PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize;
					markDirty();
				} else if(inventory[1].isItemEqual(PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj))) {
					inventory[1].stackSize = MiscUtility.clamp(inventory[1].stackSize += PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize,1,64);
					markDirty();
				}
				
				if(PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj).hasSecondOutput() && worldObj.rand.nextInt(100) <= getSecondOutputChance()) {
					if(inventory[2] == null){
						setInventorySlotContents(2, PulverizerRecipes.getInstance().findMatchingSecondOutput(this, worldObj).copy());
						inventory[2].stackSize = PulverizerRecipes.getInstance().findMatchingSecondOutput(this, worldObj).stackSize;
						markDirty();
					} else if(inventory[2].isItemEqual(PulverizerRecipes.getInstance().findMatchingSecondOutput(this, worldObj))) {
						inventory[2].stackSize = MiscUtility.clamp(inventory[2].stackSize += PulverizerRecipes.getInstance().findMatchingSecondOutput(this, worldObj).stackSize,1,64);;
						markDirty();
					}
				}
				
				markDirty();
			
				if(inventory[0] != null) {
					inventory[0].stackSize -= recipe.getInputs()[0].stackSize;
					markDirty();
					if(inventory[0].stackSize <= 0) {
						inventory[0] = null;
						markDirty();
					}
				}
				markDirty();
			}
		}
		
		markDirty();
	}

	@Override
	public boolean canOperate() {
		if(inventory[0] == null) {return false;}
		if(PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj) == null) {return false;}
        if(storage.getEnergyStored() < getEnergyNeeded()) {return false;}
		if(inventory[1] == null && inventory[2] == null) {return true;}
		if((inventory[1] != null && !inventory[1].isItemEqual(PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj)))) {return false;}
		if((inventory[1] != null && inventory[1].stackSize + PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize > inventory[1].getMaxStackSize())) {return false;}
		if(inventory[1] != null) {
			int resultStack = inventory[1].stackSize + PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= PulverizerRecipes.getInstance().findMatchingOutput(this, worldObj).getMaxStackSize());
		} else {
			int resultStack = inventory[2].stackSize + PulverizerRecipes.getInstance().findMatchingSecondOutput(this, worldObj).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= PulverizerRecipes.getInstance().findMatchingSecondOutput(this, worldObj).getMaxStackSize());
		}
	}

	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		return true;
	}

	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {
		return storage.receiveEnergy(maxReceive, simulate);
	}

	@Override
	public int getEnergyStored(ForgeDirection from) {
		return storage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}

	public int getEnergyNeeded() {
    	if(PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj) != null) {
    		int i = PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj).getEnergyUsed();
    		for(int j = 0; j < energyUseModifier; j++) {
    			i/=2;
    		}
    		return i;
    	} return 0;
    }
    
    public int getTimeNeeded() {
    	if(PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj) != null) {
    		int i = PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj).getTimeToCraft();
    		for(int j = 0; j < operateTimeModifier; j++) {
    			i/=2;
    		}
    		return i;
    	} return 0;
    }

    @Override
	public int getSecondOutputChance() {
		if(PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj) != null && PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj).hasSecondOutput()) {
			int i = PulverizerRecipes.getInstance().findMatchingRecipe(this, worldObj).chanceOfSecondOutput();
    		for(int j = 0; j < secondOutputChanceModifier; j++) {
    			i*=2;
    		}
    		return i;
    	} return 0;
	}

}
