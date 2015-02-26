package com.omgimalexis.allthethings.tileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

import com.omgimalexis.allthethings.energy.EnergyBar;
import com.omgimalexis.allthethings.energy.EnergyNet;
import com.omgimalexis.allthethings.energy.IEnergy;
import com.omgimalexis.allthethings.machine.BlockType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityBattery extends TileEntity implements IEnergy {

	private EnergyBar energyBar;
	private int transferRate;
	
	public ForgeDirection outputSide;
	
	public TileEntityBattery() {
		this(0, 0, false);
	}
	
	public TileEntityBattery(int maxPower, int transferRate) {
		this(maxPower, transferRate, false);
	}
	
	public TileEntityBattery(int maxPower, int transferRate, boolean startWithMax) {
		energyBar = new EnergyBar(maxPower, startWithMax);
		this.transferRate = transferRate;
		if(outputSide == null) outputSide = ForgeDirection.UP;
	}
	
	public void updateEntity() {
		EnergyNet.distributeEnergyToSide(worldObj, xCoord, yCoord, zCoord, outputSide, energyBar);
		
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	@Override
	public boolean canAddEnergyOnSide(ForgeDirection direction) {
		return direction != outputSide;
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
	public void setLastRecievedDirection(ForgeDirection direction) {
	}

	@Override
	public int getEnergyTransferRate() {
		return 500;
	}

	@Override
	public BlockType getTypeOfBlock() {
		return BlockType.MACHINE;
	}
	
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		energyBar.writeToNBT(tag);
		tag.setInteger("outputSide", outputSide.ordinal());
		tag.setInteger("transferRate", transferRate);
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		energyBar.readFromNBT(tag);
		transferRate = tag.getInteger("transferRate");
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
	
}
