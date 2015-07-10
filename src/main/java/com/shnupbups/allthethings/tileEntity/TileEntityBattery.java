package com.shnupbups.allthethings.tileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.TileEnergyHandler;

import com.shnupbups.allthethings.block.BlockBattery;

public class TileEntityBattery extends TileEntity implements IEnergyHandler {
	
	protected EnergyStorage storage = new EnergyStorage(200000,250);

	@Override
	public void readFromNBT(NBTTagCompound nbt) {

		super.readFromNBT(nbt);
		storage.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {

		super.writeToNBT(nbt);
		storage.writeToNBT(nbt);
	}

	/* IEnergyConnection */
	@Override
	public boolean canConnectEnergy(ForgeDirection from) {

		return true;
	}

	/* IEnergyReceiver */
	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {

		return storage.receiveEnergy(maxReceive, simulate);
	}

	/* IEnergyProvider */
	@Override
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {

		return storage.extractEnergy(maxExtract, simulate);
	}

	/* IEnergyReceiver and IEnergyProvider */
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
