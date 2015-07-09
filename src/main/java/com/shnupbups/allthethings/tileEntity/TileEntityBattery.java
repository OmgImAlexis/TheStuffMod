package com.shnupbups.allthethings.tileEntity;

import com.shnupbups.allthethings.utility.LogHelper;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.TileEnergyHandler;

public class TileEntityBattery extends TileEnergyHandler {
	
	public TileEntityBattery(int maxPower, int maxTransfer) {
		super();
		this.storage.setMaxExtract(maxTransfer);
		this.storage.setMaxReceive(maxTransfer);
		this.storage.setCapacity(maxPower);
	}
	
	@Override
	public void updateEntity() {
		if ((storage.getEnergyStored() > 0)) {
			for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS){
				TileEntity tile = worldObj.getTileEntity(xCoord + dir.offsetX, yCoord + dir.offsetY, zCoord + dir.offsetZ);
				if (tile != null && tile instanceof IEnergyHandler) {
					storage.extractEnergy(((IEnergyHandler)tile).receiveEnergy(dir.getOpposite(), storage.extractEnergy(storage.getMaxExtract(), true), false), false);
				}
			}
		}
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		storage.readFromNBT(nbt);
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		storage.writeToNBT(nbt);
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		return super.canConnectEnergy(from);
	}

	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {
		return super.receiveEnergy(from, maxReceive, simulate);
	}

	@Override
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {
		return super.extractEnergy(from, maxExtract, simulate);
	}

	@Override
	public int getEnergyStored(ForgeDirection from) {
		return super.getEnergyStored(from);
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {		
		return super.getMaxEnergyStored(from);
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
