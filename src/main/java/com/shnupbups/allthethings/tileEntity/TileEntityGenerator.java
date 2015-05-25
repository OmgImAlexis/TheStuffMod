package com.shnupbups.allthethings.tileEntity;

import com.shnupbups.allthethings.energy.EnergyBar;
import com.shnupbups.allthethings.energy.EnergyNet;
import com.shnupbups.allthethings.energy.IEnergy;
import com.shnupbups.allthethings.machine.BlockType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityGenerator extends TileEntity implements IEnergy {

	private EnergyBar energyBar;
	private int transferRate;
	private int generateRate;
	
	public ForgeDirection outputSide;
	
	public TileEntityGenerator(int maxPower, int transferRate, int generateRate) {
		this(maxPower, transferRate, generateRate,  false);
	}
	
	public TileEntityGenerator(int maxPower, int transferRate, int generateRate, boolean hasMax) {
		energyBar = new EnergyBar(maxPower, hasMax);
		this.transferRate = transferRate;
		this.generateRate = generateRate;
		if(outputSide == null) outputSide = ForgeDirection.UP;
	}
	
	public void updateEntity() {
		EnergyNet.distributeEnergyToSide(worldObj, xCoord, yCoord, zCoord, outputSide, energyBar);
		energyBar.addEnergy(generateRate);
		
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
		return 9001;
	}
	

	@Override
	public BlockType getTypeOfBlock() {
		return BlockType.MACHINE;
	}
	
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		energyBar.writeToNBT(tag);
		tag.setInteger("outputSide", outputSide.ordinal());
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		energyBar.readFromNBT(tag);
		outputSide = ForgeDirection.getOrientation(tag.getInteger("outputSide"));
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
