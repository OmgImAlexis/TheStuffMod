package com.shnupbups.allthethings.machine;

/**
 * Provides methods used by all machines
 * 
 * @deprecated Use {@link ICraftingMachine} instead
 * @author Shnupbups
 */
@Deprecated
public interface IMachine {
	public void operate();

	public boolean canOperate();
}
