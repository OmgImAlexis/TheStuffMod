package com.shnupbups.allthethings.magic;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class FluoProperties implements IExtendedEntityProperties {

	public static String propertyName = "FluoProperties";
	
	public final EntityPlayer player;
	
	public FluoProperties(EntityPlayer player) {
		this.player = player;
		
		this.player.getDataWatcher().addObject(23, 0);
		this.player.getDataWatcher().addObject(24, 1000);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("FluoLevel", player.getDataWatcher().getWatchableObjectInt(23));
		properties.setInteger("MaxFluoLevel", player.getDataWatcher().getWatchableObjectInt(24));
		compound.setTag(propertyName, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(propertyName);
		if(properties.hasKey("FluoLevel")) {
			player.getDataWatcher().updateObject(23, properties.getInteger("FluoLevel"));
		}
		if(properties.hasKey("MaxFluoLevel")) {
			player.getDataWatcher().updateObject(24, properties.getInteger("MaxFluoLevel"));
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
		return player.getDataWatcher().getWatchableObjectInt(23);
	}
	
	public void setFluoLevel(int amount) {
		player.getDataWatcher().updateObject(23, Math.min(Math.max(amount, 0), getMaxFluoLevel()));
	}
	
	public int getMaxFluoLevel() {
		return player.getDataWatcher().getWatchableObjectInt(24);
	}
	
	public void setMaxFluoLevel(int amount) {
		player.getDataWatcher().updateObject(24, amount);
		setFluoLevel(player, getFluoLevel());
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
		setFluoLevel(player, getFluoLevel(player));
	}
	
	public boolean subtractFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return addFluo(-amount, simulate, evenIf);
		
		int currLevel = getFluoLevel();
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
		
		int currLevel = getFluoLevel();
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
		
		int currLevel = getFluoLevel();
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
		
		int currLevel = getFluoLevel();
		int addAmount = amount;
		boolean can = true;
		if(amount <= getMaxFluoLevel()-currLevel) {
			currLevel+=amount;
		} else {
			can = false;
			addAmount = currLevel;
			currLevel = getMaxFluoLevel();
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return can;
	}
	
	public int getLeftoverAddFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return getLeftoverSubtractFluo(-amount, simulate, evenIf);
		
		int currLevel = getFluoLevel();
		int addAmount = amount;
		boolean can = true;
		if(amount <= getMaxFluoLevel()-currLevel) {
			currLevel+=amount;
		} else {
			can = false;
			addAmount = currLevel;
			currLevel = getMaxFluoLevel();
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return currLevel;
	}
	
	public int getAmountAddFluo(int amount, boolean simulate, boolean evenIf) {
		if(amount < 0) return getAmountSubtractFluo(-amount, simulate, evenIf);
		
		int currLevel = getFluoLevel();
		int addAmount = amount;
		boolean can = true;
		if(amount <= getMaxFluoLevel()-currLevel) {
			currLevel+=amount;
		} else {
			can = false;
			addAmount = currLevel;
			currLevel = getMaxFluoLevel();
		}
		
		if(!simulate && (can || evenIf)) setFluoLevel(currLevel);
		
		return addAmount;
	}
	
	public void subtractMaxFluo(int amount, boolean simulate) {
		if(amount < 0) addMaxFluo(-amount, simulate);
		else {
		int currLevel = getMaxFluoLevel();
		int subAmount = amount;
		currLevel-=amount;
		
		if(!simulate) setMaxFluoLevel(currLevel);
		}
	}
	
	public int getLeftoverSubtractMaxFluo(int amount, boolean simulate) {
		if(amount < 0) return getLeftoverAddMaxFluo(-amount, simulate);
		
		int currLevel = getMaxFluoLevel();
		int subAmount = amount;
		currLevel-=amount;
		
		if(!simulate) setMaxFluoLevel(currLevel);
		
		return currLevel;
	}
	
	public int getAmountSubtractMaxFluo(int amount, boolean simulate) {
		if(amount < 0) return getAmountAddMaxFluo(-amount, simulate);
		
		int currLevel = getMaxFluoLevel();
		int subAmount = amount;
		currLevel-=amount;
		
		if(!simulate) setMaxFluoLevel(currLevel);
		
		return subAmount;
	}
	
	public void addMaxFluo(int amount, boolean simulate) {
		if(amount < 0) subtractMaxFluo(-amount, simulate);
		else {
		
		int currLevel = getMaxFluoLevel();
		int addAmount = amount;
		currLevel+=amount;
		
		if(!simulate) setMaxFluoLevel(currLevel);
		}
	}
	
	public int getLeftoverAddMaxFluo(int amount, boolean simulate) {
		if(amount < 0) return getLeftoverSubtractMaxFluo(-amount, simulate);
		
		int currLevel = getMaxFluoLevel();
		int addAmount = amount;
		currLevel+=amount;
		
		if(!simulate) setMaxFluoLevel(currLevel);
		
		return currLevel;
	}
	
	public int getAmountAddMaxFluo(int amount, boolean simulate) {
		if(amount < 0) return getAmountSubtractMaxFluo(-amount, simulate);
		
		int currLevel = getMaxFluoLevel();
		int addAmount = amount;
		currLevel+=amount;
		
		if(!simulate) setMaxFluoLevel(currLevel);
		
		return addAmount;
	}
}
