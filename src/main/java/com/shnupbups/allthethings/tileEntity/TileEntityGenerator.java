package com.shnupbups.allthethings.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.common.util.ForgeDirection;

import com.shnupbups.allthethings.energy.EnergyBar;
import com.shnupbups.allthethings.energy.EnergyNet;
import com.shnupbups.allthethings.energy.IEnergy;
import com.shnupbups.allthethings.machine.BlockType;
import com.shnupbups.allthethings.machine.IGenerator;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityGenerator extends TileEntity implements IEnergy,ISidedInventory,IGenerator {

	public ItemStack[] inventory = new ItemStack[1];
	
	private EnergyBar energyBar;
	private int transferRate;
	private int generateRate;
	public boolean isOperating = false;
	public int operateTime = 0;
	public Item currentBurning;
	
	public ForgeDirection outputSide = ForgeDirection.UP;
	
	public TileEntityGenerator() {
		energyBar = new EnergyBar(0, false);
	}
	
	public TileEntityGenerator(int maxPower, int transferRate, int generateRate) {
		this(maxPower, transferRate, generateRate,  false);
	}
	
	public TileEntityGenerator(int maxPower, int transferRate, int generateRate, boolean hasMax) {
		energyBar = new EnergyBar(maxPower, hasMax);
		this.transferRate = transferRate;
		this.generateRate = generateRate;
	}
	
	public void updateEntity() {
		if(outputSide != null && outputSide != ForgeDirection.UNKNOWN) EnergyNet.distributeEnergyToSide(worldObj, xCoord, yCoord, zCoord, outputSide, energyBar);
		
		isOperating = (operateTime > 0);
		
		if(canOperate()) {
			operate();
		} else if(operateTime > 0) {
			operateTime--;
			energyBar.addEnergy(generateRate);
		}
		
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	@Override
	public boolean canAddEnergyOnSide(ForgeDirection direction) {
		return false;
	}

	@Override
	public boolean canConnect(ForgeDirection direction) {
		return (ForgeDirection.VALID_DIRECTIONS[ForgeDirection.OPPOSITES[direction.ordinal()]] == outputSide);
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
		return 200;
	}
	

	@Override
	public BlockType getTypeOfBlock() {
		return BlockType.MACHINE;
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
		tag.setInteger("outputSide", outputSide.ordinal());
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		energyBar.readFromNBT(tag);
		NBTTagList list = tag.getTagList("inventory", 10);
		this.inventory = new ItemStack[this.getSizeInventory()];
		this.outputSide = ForgeDirection.getOrientation(tag.getInteger("outputSide"));
		for(int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound compound1 = list.getCompoundTagAt(i);
			byte byte0 = compound1.getByte("slot");
			
			if(byte0 >= 0 && byte0 < this.inventory.length) {
				this.inventory[byte0] = ItemStack.loadItemStackFromNBT(compound1);
			}
		}
	}
	
	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	}
	
	public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
	}
	
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}

	@Override
	public void operate() {
		operateTime=getAmountFor(inventory[0]);
		currentBurning=inventory[0].getItem();
		if(inventory[0].stackSize <= 1) {inventory[0] = null;}
		else inventory[0].stackSize--;
		markDirty();
	}

	@Override
	public boolean canOperate() {
		if(operateTime <= 0 && energyBar.getEnergy() != energyBar.getMaxEnergy() && inventory[0] != null && inventory[0].getItem() != null) {return getAmountFor(inventory[0]) > 0;}
		else return false;
	}

	@Override
	public int getAmountFor(ItemStack item) {
		return TileEntityFurnace.getItemBurnTime(item)/generateRate;
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
		return "Generator";
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
	public void setInventorySlotContents(int slot, ItemStack itemstack) {		
		if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}
		inventory[slot] = itemstack;
		
		markDirty();
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		return new int[]{0};
	}

	@Override
	public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
		return getAmountFor(p_102007_2_) > 0;
	}

	@Override
	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int scale){
		if(this.operateTime > 0 && currentBurning != null) {
			return this.operateTime * scale / getAmountFor(new ItemStack(currentBurning));
		} return 0;
    }	
}
