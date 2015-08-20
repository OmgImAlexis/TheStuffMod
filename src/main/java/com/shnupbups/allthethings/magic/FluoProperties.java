package com.shnupbups.allthethings.magic;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class FluoProperties implements IExtendedEntityProperties {

	public static String propertyName = "FluoProperties";
	
	public final EntityPlayer player;
	public int fluoLevel;
	public int maxFluoLevel;
	
	public FluoProperties(EntityPlayer player) {
		this.player = player;
		this.fluoLevel = 0;
		this.maxFluoLevel = 100;
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("FluoLevel", fluoLevel);
		properties.setInteger("MaxFluoLevel", maxFluoLevel);
		compound.setTag(propertyName, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(propertyName);
		if(properties.hasKey("FluoLevel")) {
			fluoLevel = properties.getInteger("FluoLevel");
		}
		if(properties.hasKey("MaxFluoLevel")) {
			maxFluoLevel = properties.getInteger("MaxFluoLevel");
		}
	}

	@Override
	public void init(Entity entity, World world) {
		// Unneeded?
	}
	
	public static void register(EntityPlayer player) {
		player.registerExtendedProperties("FluoProperties", new FluoProperties(player));
	}

	public static FluoProperties get(EntityPlayer player) {
		return (FluoProperties) player.getExtendedProperties("FluoProperties");
	}
	
	public int getFluoLevel() {
		return fluoLevel;
	}
	
	public void setFluoLevel(int amount) {
		fluoLevel = amount;
	}
	
	public int getMaxFluoLevel() {
		return maxFluoLevel;
	}
	
	public void setMaxFluoLevel(int amount) {
		maxFluoLevel = amount;
	}
	
	public EntityPlayer getPlayer() {
		return player;
	}
	
	public static int getFluoLevel(EntityPlayer player) {
		return ((FluoProperties) player.getExtendedProperties("FluoProperties")).getFluoLevel();
	}
	
	public static void setFluoLevel(EntityPlayer player, int amount) {
		((FluoProperties) player.getExtendedProperties("FluoProperties")).setFluoLevel(amount);
	}
	
	public static int getMaxFluoLevel(EntityPlayer player) {
		return ((FluoProperties) player.getExtendedProperties("FluoProperties")).getMaxFluoLevel();
	}
	
	public static void setMaxFluoLevel(EntityPlayer player, int amount) {
		((FluoProperties) player.getExtendedProperties("FluoProperties")).setMaxFluoLevel(amount);
	}
	
	public boolean subtractFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return addFluo(-amount, simulate, evenIf);
		
		int currLevel = fluoLevel;
		int subAmount = amount;
		boolean can = true;
		if(amount <= currLevel) {
			currLevel-=amount;
		} else {
			can = false;
			subAmount = currLevel;
			currLevel = 0;
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return can;
	}
	
	public int getLeftoverSubtractFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return getLeftoverAddFluo(-amount, simulate, evenIf);
		
		int currLevel = fluoLevel;
		int subAmount = amount;
		boolean can = true;
		if(amount <= currLevel) {
			currLevel-=amount;
		} else {
			can = false;
			subAmount = currLevel;
			currLevel = 0;
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return currLevel;
	}
	
	public int getAmountSubtractFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return getAmountAddFluo(-amount, simulate, evenIf);
		
		int currLevel = fluoLevel;
		int subAmount = amount;
		boolean can = true;
		if(amount <= currLevel) {
			currLevel-=amount;
		} else {
			can = false;
			subAmount = currLevel;
			currLevel = 0;
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return subAmount;
	}
	
	public boolean addFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return subtractFluo(-amount, simulate, evenIf);
		
		int currLevel = fluoLevel;
		int addAmount = amount;
		boolean can = true;
		if(amount <= maxFluoLevel-currLevel) {
			currLevel+=amount;
		} else {
			can = false;
			addAmount = currLevel;
			currLevel = 0;
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return can;
	}
	
	public int getLeftoverAddFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return getLeftoverSubtractFluo(-amount, simulate, evenIf);
		
		int currLevel = fluoLevel;
		int addAmount = amount;
		boolean can = true;
		if(amount <= maxFluoLevel-currLevel) {
			currLevel+=amount;
		} else {
			can = false;
			addAmount = currLevel;
			currLevel = 0;
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return currLevel;
	}
	
	public int getAmountAddFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return getAmountSubtractFluo(-amount, simulate, evenIf);
		
		int currLevel = fluoLevel;
		int addAmount = amount;
		boolean can = true;
		if(amount <= maxFluoLevel-currLevel) {
			currLevel+=amount;
		} else {
			can = false;
			addAmount = currLevel;
			currLevel = 0;
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return addAmount;
	}
}
