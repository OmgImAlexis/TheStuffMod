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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;

import com.shnupbups.allthethings.event.MachineEvent;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.machine.ICraftingMachine;
import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.utility.MiscUtility;
import com.shnupbups.allthethings.utility.OvenRecipes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityOven extends TileEntity implements ISidedInventory,IEnergyHandler,ICraftingMachine {
	private static final int[] slotsTop=new int[]{0,1,2,3,4,5,6,7,8};
	private static final int[] slotsBottom=new int[]{9,10};
	private static final int[] slotsSides=new int[]{0,1,2,3,4,5,6,7,8,9,10};
	public EnergyStorage storage=new EnergyStorage(120000);
	public int defaultMaxEnergy=50000;
	public int maxEnergy=50000;
	public ItemStack[] inventory=new ItemStack[14];
	public int energyUseModifier=0;
	public int operateStatus;
	public int operateTimeModifier=0;
	public int energyInput=200;
	public int defaultInput=200;
	public int secondOutputChanceModifier=0;

	public TileEntityOven() {}

	public void updateEntity() {
		updateUpgrades();
		storage.setCapacity(maxEnergy);
		if(canOperate()) {
			this.operateStatus+=1;
			if(getEnergyNeeded()/getTimeNeeded()>0) {
				storage.extractEnergy(getEnergyNeeded()/getTimeNeeded(),false);
			} else {
				storage.extractEnergy(getEnergyNeeded(),false);
			}
		}
		if(this.operateStatus>=getTimeNeeded()&&getTimeNeeded()>0) {
			if((getEnergyNeeded()/getTimeNeeded())*getTimeNeeded()!=getEnergyNeeded()) {
				storage.extractEnergy((getEnergyNeeded()/getTimeNeeded())*getTimeNeeded(),false);
			}
			operate();
			this.operateStatus=0;
		}
		worldObj.markBlockForUpdate(xCoord,yCoord,zCoord);
	}

	public void updateUpgrades() {
		operateTimeModifier=0;
		energyUseModifier=0;
		secondOutputChanceModifier=0;
		maxEnergy=defaultMaxEnergy;
		energyInput=defaultInput;
		for(int i=11;i<14;i++) {
			if(inventory[i]!=null&&inventory[i].getItem()!=null) {
				if(inventory[i].getItem()==ModItems.speedUpgrade) {
					operateTimeModifier++;
				} else if(inventory[i].getItem()==ModItems.efficiencyUpgrade) {
					energyUseModifier++;
				} else if(inventory[i].getItem()==ModItems.capacityUpgrade) {
					maxEnergy*=2;
				} else if(inventory[i].getItem()==ModItems.outputUpgrade) {
					secondOutputChanceModifier++;
				} else if(inventory[i].getItem()==ModItems.inputUpgrade) {
					energyInput*=10;
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
	public ItemStack decrStackSize(int slot,int amount) {
		if(inventory[slot]!=null) {
			ItemStack itemstack;
			if(inventory[slot].stackSize<=amount) {
				itemstack=inventory[slot];
				inventory[slot]=null;
				return itemstack;
			} else {
				itemstack=inventory[slot].splitStack(amount);
				if(inventory[slot].stackSize==0) {
					inventory[slot]=null;
				}
				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		if(inventory[slot]!=null) {
			ItemStack itemstack=inventory[slot];
			inventory[slot]=null;
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
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int slot,ItemStack stack) {
		markDirty();
		return true;
	}

	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}

	public NBTTagCompound getTagCompound() {
		NBTTagCompound tag=new NBTTagCompound();
		super.writeToNBT(tag);
		storage.writeToNBT(tag);
		NBTTagList list=new NBTTagList();
		for(int i=0;i<this.inventory.length;i++) {
			if(this.inventory[i]!=null) {
				NBTTagCompound compound1=new NBTTagCompound();
				compound1.setByte("slot",(byte)i);
				this.inventory[i].writeToNBT(compound1);
				list.appendTag(compound1);
			}
		}
		tag.setTag("inventory",list);
		tag.setInteger("operateStatus",operateStatus);
		return tag;
	}

	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		storage.writeToNBT(tag);
		NBTTagList list=new NBTTagList();
		for(int i=0;i<this.inventory.length;i++) {
			if(this.inventory[i]!=null) {
				NBTTagCompound compound1=new NBTTagCompound();
				compound1.setByte("slot",(byte)i);
				this.inventory[i].writeToNBT(compound1);
				list.appendTag(compound1);
			}
		}
		tag.setTag("inventory",list);
		tag.setInteger("operateStatus",operateStatus);
	}

	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		storage.readFromNBT(tag);
		NBTTagList list=tag.getTagList("inventory",10);
		this.inventory=new ItemStack[this.getSizeInventory()];
		for(int i=0;i<list.tagCount();i++) {
			NBTTagCompound compound1=list.getCompoundTagAt(i);
			byte byte0=compound1.getByte("slot");
			if(byte0>=0&&byte0<this.inventory.length) {
				this.inventory[byte0]=ItemStack.loadItemStackFromNBT(compound1);
			}
		}
		operateStatus=tag.getInteger("operateStatus");
	}

	public Packet getDescriptionPacket() {
		NBTTagCompound tag=new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord,yCoord,zCoord,1,tag);
	}

	public void onDataPacket(NetworkManager manager,S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
	}

	@Override
	public void setInventorySlotContents(int slot,ItemStack itemstack) {
		inventory[slot]=itemstack;
		if(itemstack!=null&&itemstack.stackSize>this.getInventoryStackLimit()) {
			itemstack.stackSize=this.getInventoryStackLimit();
		}
		markDirty();
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int side) {
		return side==0? slotsBottom:(side==1? slotsTop:slotsSides);
	}

	@Override
	public boolean canInsertItem(int slot,ItemStack itemstack,int side) {
		return(slot<9&&this.isItemValidForSlot(slot,itemstack));
	}

	@Override
	public boolean canExtractItem(int slot,ItemStack itemstack,int side) {
		if(side!=1) return(slot==9||slot==10);
		return false;
	}

	@Override
	public void operate() {
		if(!worldObj.isRemote) {
			if(OvenRecipes.getInstance().findMatchingRecipe(this, worldObj) != null) {
				IMachineRecipe recipe = OvenRecipes.getInstance().findMatchingRecipe(this, worldObj);
				boolean canceled = MinecraftForge.EVENT_BUS.post(new MachineEvent.OnOvenEvent.Post(new ItemStack[]{recipe.getRecipeOutput(),recipe.getSecondOutput()}, this));
				if(!canceled) {
					if(inventory[9] == null){
						setInventorySlotContents(9, OvenRecipes.getInstance().findMatchingOutput(this, worldObj).copy());
						inventory[9].stackSize = OvenRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize;
						markDirty();
					} else if(inventory[9].isItemEqual(OvenRecipes.getInstance().findMatchingOutput(this, worldObj))) {
						inventory[9].stackSize = MiscUtility.clamp(inventory[9].stackSize += OvenRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize,1,64);
						markDirty();
					}
				
					if(OvenRecipes.getInstance().findMatchingRecipe(this, worldObj).hasSecondOutput() && worldObj.rand.nextInt(100) <= getSecondOutputChance()) {
						if(inventory[10] == null){
							setInventorySlotContents(10, OvenRecipes.getInstance().findMatchingSecondOutput(this, worldObj).copy());
							inventory[10].stackSize = OvenRecipes.getInstance().findMatchingSecondOutput(this, worldObj).stackSize;
							markDirty();
						} else if(inventory[10].isItemEqual(OvenRecipes.getInstance().findMatchingSecondOutput(this, worldObj))) {
							inventory[10].stackSize = MiscUtility.clamp(inventory[10].stackSize += OvenRecipes.getInstance().findMatchingSecondOutput(this, worldObj).stackSize,1,64);
							markDirty();
						}
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
			}
			markDirty();
		}
	}

	@Override
	public boolean canOperate() {
		if(inventory[0] == null && inventory[1] == null && inventory[2] == null && inventory[3] == null && inventory[4] == null && inventory[5] == null && inventory[6] == null && inventory[7] == null && inventory[8] == null) {return false;}
		if(OvenRecipes.getInstance().findMatchingRecipe(this, worldObj) == null) {return false;}
        if(storage.getEnergyStored() < getEnergyNeeded()) {return false;}
        IMachineRecipe recipe = OvenRecipes.getInstance().findMatchingRecipe(this, worldObj);
        boolean canceled = MinecraftForge.EVENT_BUS.post(new MachineEvent.OnOvenEvent.Pre(new ItemStack[]{recipe.getRecipeOutput(),recipe.getSecondOutput()}, this));
		if(canceled) return false;
		if(inventory[9] == null && inventory[10] == null) {return true;}
		if((inventory[9] != null && !inventory[9].isItemEqual(OvenRecipes.getInstance().findMatchingOutput(this, worldObj)))) {return false;}
		if((inventory[9] != null && inventory[9].stackSize + OvenRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize > inventory[9].getMaxStackSize())) {return false;}
		if(inventory[9] != null) {
			int resultStack = inventory[9].stackSize + OvenRecipes.getInstance().findMatchingOutput(this, worldObj).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= OvenRecipes.getInstance().findMatchingOutput(this, worldObj).getMaxStackSize());
		} else {
			int resultStack=inventory[10].stackSize+OvenRecipes.getInstance().findMatchingSecondOutput(this,worldObj).stackSize;
			return (resultStack<=getInventoryStackLimit())&&(resultStack<=OvenRecipes.getInstance().findMatchingSecondOutput(this,worldObj).getMaxStackSize());
		}
	}

	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		return true;
	}

	@Override
	public int receiveEnergy(ForgeDirection from,int maxReceive,boolean simulate) {
		return storage.receiveEnergy(maxReceive,simulate);
	}

	@Override
	public int extractEnergy(ForgeDirection from,int maxExtract,boolean simulate) {
		return storage.extractEnergy(maxExtract,simulate);
	}

	@Override
	public int getEnergyStored(ForgeDirection from) {
		return storage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}

	/**
	 * Returns the itemstack in the slot specified (Top left is 0, 0). Args: row, column
	 */
	public ItemStack getStackInRowAndColumn(int p_70463_1_,int p_70463_2_) {
		if(p_70463_1_>=0&&p_70463_1_<3) {
			int k=p_70463_1_+p_70463_2_*3;
			return this.getStackInSlot(k);
		} else {
			return null;
		}
	}

	public int getEnergyNeeded() {
		if(OvenRecipes.getInstance().findMatchingRecipe(this,worldObj)!=null) {
			int i=OvenRecipes.getInstance().findMatchingRecipe(this,worldObj).getEnergyUsed();
			for(int j=0;j<energyUseModifier;j++) {
				i/=2;
			}
			return i;
		}
		return 0;
	}

	public int getTimeNeeded() {
		if(OvenRecipes.getInstance().findMatchingRecipe(this,worldObj)!=null) {
			int i=OvenRecipes.getInstance().findMatchingRecipe(this,worldObj).getTimeToCraft();
			for(int j=0;j<operateTimeModifier;j++) {
				i/=2;
			}
			return i;
		}
		return 0;
	}

	@Override
	public int getSecondOutputChance() {
		if(OvenRecipes.getInstance().findMatchingRecipe(this,worldObj)!=null&&OvenRecipes.getInstance().findMatchingRecipe(this,worldObj).hasSecondOutput()) {
			int i=OvenRecipes.getInstance().findMatchingRecipe(this,worldObj).chanceOfSecondOutput();
			for(int j=0;j<secondOutputChanceModifier;j++) {
				i*=2;
			}
			return i;
		}
		return 0;
	}
}
