package omgimalexis.allthethings.tile_entity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityPipe extends TileEntity {
	
	/**
	 * UP, DOWN, NORTH, EAST SOUTH WEST
	 */
	
	public ForgeDirection[] connections = new ForgeDirection[6];
	
	public TileEntityPipe() {
		
	}
	
	public void updateEntity() {
		this.updateConnections();
	}
	
	public void updateConnections() {
		if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof TileEntityPipe) connections[0] = ForgeDirection.UP;
		else connections[0] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntityPipe) connections[0] = ForgeDirection.DOWN;
		else connections[1] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof TileEntityPipe) connections[0] = ForgeDirection.NORTH;
		else connections[2] = null;
		if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof TileEntityPipe) connections[0] = ForgeDirection.EAST;
		else connections[3] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof TileEntityPipe) connections[0] = ForgeDirection.SOUTH;
		else connections[4] = null;
		if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntityPipe) connections[0] = ForgeDirection.WEST;
		else connections[5] = null;
	}
}
