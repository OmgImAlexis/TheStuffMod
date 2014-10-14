package com.omgimalexis.allthethings.tileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBattery extends TileEntity {
	private static int powerLevel = 0;

	public void decreasePowerLevel(int powerUsage) {
		this.powerLevel = powerLevel - powerUsage;
	}

	public void increasePowerLevel(int powerGained) {
		this.powerLevel = powerLevel + powerGained;
	}

	public int getPowerLevel() {
		return this.powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	public void readFromNBT(NBTTagCompound tagCompound) {
		super.readFromNBT(tagCompound);
		this.powerLevel = tagCompound.getInteger("powerLevel");
	}

	public void writeToNBT(NBTTagCompound tagCompound) {
		super.writeToNBT(tagCompound);
		tagCompound.setInteger("powerLevel", this.powerLevel);
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound tileTag = new NBTTagCompound();
		this.writeToNBT(tileTag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tileTag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.func_148857_g());
	}
}
