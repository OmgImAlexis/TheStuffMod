package com.shnupbups.allthethings.energy;

import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class EnergyNet {

	public static void distributeEnergyToSurrounding(World world, int x, int y, int z, ForgeDirection lastDirection, EnergyBar energyBar) {
		distributeEnergyToSurroundingWithLoss(world, x, y, z, lastDirection, energyBar, 0);
	}
	
	public static void distributeEnergyToSurrounding(World world, int x, int y, int z, EnergyBar energyBar) {
		distributeEnergyToSurroundingWithLoss(world, x, y, z, ForgeDirection.UNKNOWN, energyBar, 0);
	}
	
	public static void distributeEnergyToSide(World world, int x, int y, int z, ForgeDirection direction, EnergyBar energyBar) {
		if(world.getTileEntity(x + direction.offsetX, y + direction.offsetY, z + direction.offsetZ) instanceof IEnergy) {
			//LogHelper.info("Getting Ready to Distribute...");
			IEnergy energyTileOnSide = (IEnergy) world.getTileEntity(x + direction.offsetX, y + direction.offsetY, z + direction.offsetZ);
			IEnergy thisEnergyTile = (IEnergy) world.getTileEntity(x, y, z);
			ForgeDirection invertedSide = ForgeDirection.getOrientation(ForgeDirection.OPPOSITES[direction.ordinal()]);
			if(thisEnergyTile.canConnect(invertedSide) && energyTileOnSide.canAddEnergyOnSide(invertedSide)) {
				//LogHelper.info("Found Place to Distribute...");
				if(energyBar.getEnergy() - thisEnergyTile.getEnergyTransferRate() >= 0) {
					//LogHelper.info("Distribution Confirmed...");
					if(energyTileOnSide.getEnergyBar().canAddEnergy(thisEnergyTile.getEnergyTransferRate())) {
						//LogHelper.info("Distributing...");
						energyTileOnSide.getEnergyBar().addEnergy(thisEnergyTile.getEnergyTransferRate());
						energyBar.removeEnergy(thisEnergyTile.getEnergyTransferRate());
					} else {
						//LogHelper.info("Distributing... (Less than 0)");
						int remaining = energyTileOnSide.getEnergyBar().addEnergyWithRemaining(thisEnergyTile.getEnergyTransferRate());
						energyBar.removeEnergy(thisEnergyTile.getEnergyTransferRate() - remaining);
					}
					//LogHelper.info("Distributed.");
					energyTileOnSide.setLastReceivedDirection(invertedSide);
				} else {
					//LogHelper.info("Distribution Confirmed... (Less than 0)");
					if(energyTileOnSide.getEnergyBar().canAddEnergy(energyBar.getEnergy())) {
						//LogHelper.info("Distributing...");
						energyTileOnSide.getEnergyBar().addEnergy(energyBar.getEnergy());
						energyBar.removeEnergy(energyBar.getEnergy());
					} else {
						//LogHelper.info("Distributing... (Less than 0)");
						int remaining = energyTileOnSide.getEnergyBar().addEnergyWithRemaining(energyBar.getEnergy());
						energyBar.removeEnergy(energyBar.getEnergy() - remaining);
					}
					//LogHelper.info("Distributed.");
					energyTileOnSide.setLastReceivedDirection(invertedSide);
				}
			}
		}
	}
	
	public static void distributeEnergyToSurroundingWithLoss(World world, int x, int y, int z, ForgeDirection lastDirection, EnergyBar energyBar, int loss) {
		int sides = 0;
		boolean sidesCanOutput[] = new boolean[6];
		for(ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
			if(world.getTileEntity(x + direction.offsetX, y + direction.offsetY, z + direction.offsetZ) instanceof IEnergy) {
				IEnergy energyTileNextToIt = (IEnergy) world.getTileEntity(x + direction.offsetX, y + direction.offsetY, z + direction.offsetZ);
				IEnergy thisEnergyTile = (IEnergy) world.getTileEntity(x, y, z);
				ForgeDirection invertedSide = ForgeDirection.VALID_DIRECTIONS[ForgeDirection.OPPOSITES[direction.ordinal()]];
				if(thisEnergyTile != null && energyTileNextToIt != null) {
					if(thisEnergyTile.canConnect(invertedSide) && energyTileNextToIt.canAddEnergyOnSide(invertedSide) && direction != lastDirection) {
						sidesCanOutput[direction.ordinal()] = true;
						sides++;
					}
				}
			}
		}
		
		for(ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
			if(sidesCanOutput[direction.ordinal()] && direction != lastDirection) {
				IEnergy energyTile = (IEnergy) world.getTileEntity(x + direction.offsetX, y + direction.offsetY, z + direction.offsetZ);
				if(energyBar.getEnergy() - energyTile.getEnergyTransferRate() / sides >= 0) {
					if(energyTile.getEnergyBar().canAddEnergy(energyTile.getEnergyTransferRate() / sides - loss)) {
						energyTile.getEnergyBar().addEnergy(energyTile.getEnergyTransferRate() / sides - loss);
						energyBar.removeEnergy(energyTile.getEnergyTransferRate() / sides);
					} else {
						int remaining = energyTile.getEnergyBar().addEnergyWithRemaining(energyTile.getEnergyTransferRate() / sides - loss);
						energyBar.removeEnergy(energyTile.getEnergyTransferRate() / sides - remaining);
					}
					energyTile.setLastReceivedDirection(ForgeDirection.VALID_DIRECTIONS[ForgeDirection.OPPOSITES[direction.ordinal()]]);
				} else {
					if(energyTile.getEnergyBar().canAddEnergy(energyBar.getEnergy() / sides - loss)) {
						energyTile.getEnergyBar().addEnergy(energyBar.getEnergy() / sides - loss);
						energyBar.removeEnergy(energyBar.getEnergy() / sides);
					} else {
						int remaining = energyTile.getEnergyBar().addEnergyWithRemaining(energyBar.getEnergy() / sides - loss);
						energyBar.removeEnergy(energyBar.getEnergy() / sides - remaining);
					}
					energyTile.setLastReceivedDirection(ForgeDirection.VALID_DIRECTIONS[ForgeDirection.OPPOSITES[direction.ordinal()]]);
				}
			}
		}
	}
}
