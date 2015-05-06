package com.shnupbups.allthethings.energy;

import net.minecraft.nbt.NBTTagCompound;

public class EnergyBar {
	private int maxEnergyLevel = 0;
	private int defaultMaxEnergyLevel;
	private int energyLevel = 0;
	
	public EnergyBar(int max, boolean startWithMax) {
		this.maxEnergyLevel = defaultMaxEnergyLevel = max;
		if(startWithMax) energyLevel = max;
	}
	
	public EnergyBar(int max) {
		this(max, false);
	}
	
	public void addEnergy(int amount) {
		energyLevel += amount;
	}
	
	public void removeEnergy(int amount) {
		energyLevel -= amount;
	}
	
	public void setEnergy(int amount) {
		energyLevel = amount;
	}
	
	public int getEnergy() {
		return energyLevel;
	}
	
	public boolean canAddEnergy(int amount) {
		return (energyLevel + amount) <= maxEnergyLevel;
	}
	
	public boolean canRemoveEnergy(int amount) {
		return (energyLevel - amount) >= 0;
	}
	
	public void setMaxEnergy(int amount) {
		maxEnergyLevel = amount;
	}
	
	public int getMaxEnergy() {
		return maxEnergyLevel;
	}
	
	public void writeToNBT(NBTTagCompound tag) {
		tag.setInteger("energyLevel", energyLevel);
	}
	
	public void readFromNBT(NBTTagCompound tag) {
		this.energyLevel = tag.getInteger("energyLevel");
	}
	
	public int getEnergyScaled(int scale) {
		return energyLevel * scale / maxEnergyLevel;
	}
	
	public int addEnergyWithRemaining(int amount) {
		energyLevel += amount;
		if(energyLevel > maxEnergyLevel) {
			int powerRemaining = energyLevel - maxEnergyLevel;
			energyLevel -= powerRemaining;
			return powerRemaining;
		}
		return 0;
	}
	
	public void resetMaxEnergy() {
		maxEnergyLevel = defaultMaxEnergyLevel;
	}
}
