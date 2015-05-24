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
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityCable extends TileEntity implements IEnergy {

	private ForgeDirection lastRecievedDirection;
	private EnergyBar energyBar;
	private int transfer;
	
	public ForgeDirection[] connections = new ForgeDirection[6];
	
	public TileEntityCable(int amount, int transfer) {
		energyBar = new EnergyBar(amount);
		this.transfer = transfer;
	}
	
	public void updateEntity() {
		EnergyNet.distributeEnergyToSurrounding(worldObj, xCoord, yCoord, zCoord, lastRecievedDirection, energyBar);
		updateConnections();
	}
	
	@Override
	public boolean canAddEnergyOnSide(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canConnect(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}
	
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord+1, yCoord+1, zCoord+1);
	}

	@Override
	public EnergyBar getEnergyBar() {
		// TODO Auto-generated method stub
		return energyBar;
	}

	@Override
	public void setLastRecievedDirection(ForgeDirection direction) {
		// TODO Auto-generated method stub
		this.lastRecievedDirection = direction;
	}

	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	}
	
	public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
	}
	
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		energyBar.writeToNBT(tag);
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		energyBar.readFromNBT(tag);
	}
	
	@Override
	public int getEnergyTransferRate() {
		if(transfer == 0) return 1000;
		return transfer;
	}

	@Override
	public BlockType getTypeOfBlock() {
		// TODO Auto-generated method stub
		return BlockType.CABLE;
	}
	
	public void updateConnections() {
		if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof IEnergy && ((IEnergy) this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord)).canConnect(ForgeDirection.UP)) connections[0] = ForgeDirection.UP;
		else connections[0] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof IEnergy && ((IEnergy) this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord)).canConnect(ForgeDirection.DOWN)) connections[1] = ForgeDirection.DOWN;
		else connections[1] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof IEnergy && ((IEnergy) this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1)).canConnect(ForgeDirection.NORTH)) connections[2] = ForgeDirection.NORTH;
		else connections[2] = null;
		if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof IEnergy && ((IEnergy) this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord)).canConnect(ForgeDirection.EAST)) connections[3] = ForgeDirection.EAST;
		else connections[3] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof IEnergy && ((IEnergy) this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1)).canConnect(ForgeDirection.SOUTH)) connections[4] = ForgeDirection.SOUTH;
		else connections[4] = null;
		if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof IEnergy && ((IEnergy) this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord)).canConnect(ForgeDirection.WEST)) connections[5] = ForgeDirection.WEST;
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

}
