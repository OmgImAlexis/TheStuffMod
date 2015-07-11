package com.shnupbups.allthethings.tileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyReceiver;

import com.shnupbups.allthethings.block.BlockCable;
import com.shnupbups.allthethings.energy.IEnergy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityCable extends TileEntity implements IEnergyHandler {

	public EnergyStorage storage = new EnergyStorage(Integer.MAX_VALUE,0);
	
	public ForgeDirection[] connections = new ForgeDirection[6];
	
	public void updateEntity() {
		storage.setCapacity(((BlockCable)this.getBlockType()).maxStorage);
		storage.setMaxTransfer(((BlockCable)this.getBlockType()).maxTransfer);
		if(storage.getMaxEnergyStored() == -1) storage.setMaxReceive(0);
		if (storage.getEnergyStored() > 0) {
			for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS){
				TileEntity tile = worldObj.getTileEntity(xCoord + dir.offsetX, yCoord + dir.offsetY, zCoord + dir.offsetZ);
				if (tile != null && tile instanceof IEnergyReceiver) {
					storage.extractEnergy(((IEnergyReceiver)tile).receiveEnergy(dir.getOpposite(), storage.extractEnergy(storage.getMaxExtract(), true), false), false);
				}
			}
		}
		updateConnections();
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}
	
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord+1, yCoord+1, zCoord+1);
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
	
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		storage.writeToNBT(tag);
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		storage.readFromNBT(tag);
	}
	
	public void updateConnections() {
		if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof IEnergyReceiver && ((IEnergyReceiver) this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord)).canConnectEnergy(ForgeDirection.DOWN)) connections[0] = ForgeDirection.UP;
		else connections[0] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof IEnergyReceiver && ((IEnergyReceiver) this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord)).canConnectEnergy(ForgeDirection.UP)) connections[1] = ForgeDirection.DOWN;
		else connections[1] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof IEnergyReceiver && ((IEnergyReceiver) this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1)).canConnectEnergy(ForgeDirection.SOUTH)) connections[2] = ForgeDirection.NORTH;
		else connections[2] = null;
		if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof IEnergyReceiver && ((IEnergyReceiver) this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord)).canConnectEnergy(ForgeDirection.WEST)) connections[3] = ForgeDirection.EAST;
		else connections[3] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof IEnergyReceiver && ((IEnergyReceiver) this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1)).canConnectEnergy(ForgeDirection.NORTH)) connections[4] = ForgeDirection.SOUTH;
		else connections[4] = null;
		if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof IEnergyReceiver && ((IEnergyReceiver) this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord)).canConnectEnergy(ForgeDirection.EAST)) connections[5] = ForgeDirection.WEST;
		else connections[5] = null;
	}
	
	public boolean onlyOneOpposite(ForgeDirection[] directions) {
		ForgeDirection mainDirection = null;
		boolean isOpposite = false;
		
		for (int i = 0; i < directions.length; i++) {
			if (mainDirection == null && directions[i] != null) mainDirection = directions[i];
			
			if (directions[i] != null && mainDirection != directions[i]) {
				if (!isOpposite(mainDirection, directions[i])) return false;
				else isOpposite = true;
			}
		}
		
		return isOpposite;
	}
	
	public boolean isOpposite (ForgeDirection firstDirection, ForgeDirection secondDirection) {
		if ((firstDirection.equals(ForgeDirection.NORTH) && secondDirection.equals(ForgeDirection.SOUTH)) || (firstDirection.equals(ForgeDirection.SOUTH) && secondDirection.equals(ForgeDirection.NORTH))) return true;
		if ((firstDirection.equals(ForgeDirection.EAST) && secondDirection.equals(ForgeDirection.WEST)) || (firstDirection.equals(ForgeDirection.WEST) && secondDirection.equals(ForgeDirection.EAST))) return true;
		if ((firstDirection.equals(ForgeDirection.DOWN) && secondDirection.equals(ForgeDirection.UP)) || (firstDirection.equals(ForgeDirection.UP) && secondDirection.equals(ForgeDirection.DOWN))) return true;
		
		return false;
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
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {
		return storage.extractEnergy(maxExtract, simulate);
	}

	@Override
	public int getEnergyStored(ForgeDirection from) {
		return storage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}

}
