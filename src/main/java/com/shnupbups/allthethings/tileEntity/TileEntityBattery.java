package com.shnupbups.allthethings.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyReceiver;
import cofh.api.item.IToolHammer;

import com.shnupbups.allthethings.block.BlockBattery;
import com.shnupbups.allthethings.utility.MiscUtility;

public class TileEntityBattery extends TileEntity implements IEnergyHandler {
	
	public EnergyStorage storage = new EnergyStorage(Integer.MAX_VALUE,0);
	
	public boolean[] outputSides = new boolean[6]; {
		outputSides[1] = true;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		outputSides = MiscUtility.intToBoolean(nbt.getIntArray("outputSides"));
		storage.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setIntArray("outputSides", MiscUtility.booleanToInt(outputSides));
		storage.writeToNBT(nbt);
	}

	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		return true;
	}

	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {
		if(outputSides[from.ordinal()] == false) return storage.receiveEnergy(maxReceive, simulate);
		else return 0;
	}

	@Override
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {
		if(outputSides[from.ordinal()] == true) return storage.extractEnergy(maxExtract, simulate);
		else return 0;
	}

	@Override
	public int getEnergyStored(ForgeDirection from) {
		return storage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}
	
	@Override
	public void updateEntity() {
		storage.setCapacity(((BlockBattery)this.getBlockType()).maxStorage);
		storage.setMaxTransfer(((BlockBattery)this.getBlockType()).maxTransfer);
		if(storage.getMaxEnergyStored() == -1) storage.setMaxReceive(0);
		if (storage.getEnergyStored() > 0) {
			for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS){
				if(outputSides[dir.ordinal()] == true) {
					TileEntity tile = worldObj.getTileEntity(xCoord + dir.offsetX, yCoord + dir.offsetY, zCoord + dir.offsetZ);
					if (tile != null && tile instanceof IEnergyReceiver) {
						storage.extractEnergy(((IEnergyReceiver)tile).receiveEnergy(dir.getOpposite(), storage.extractEnergy(storage.getMaxExtract(), true), false), false);
					}
				}
			}
		} else if(storage.getMaxEnergyStored() == -1) {
			for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS){
				if(outputSides[dir.ordinal()] == true) {
					TileEntity tile = worldObj.getTileEntity(xCoord + dir.offsetX, yCoord + dir.offsetY, zCoord + dir.offsetZ);
					if (tile != null && tile instanceof IEnergyReceiver) {
						((IEnergyReceiver)tile).receiveEnergy(dir.getOpposite(), Integer.MAX_VALUE, false);
					}
				}
			}
		}
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		storage.writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	}
	
	@Override
	public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
		storage.readFromNBT(packet.func_148857_g());
	}
}
