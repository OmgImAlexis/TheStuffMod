package com.shnupbups.allthethings.machine;

public interface ICraftingMachine {
	/**
	 * Finishes a crafting operation. Check if {@link #canOperate()} before running!
	 * 
	 * @author Shnupbups
	 */
	public void operate();

	/**
	 * Check if a crafting operation can occur. If it returns true, run {@link #operate()} after
	 * {@link #getTimeNeeded()} ticks.
	 * 
	 * @return If an operation can occur.
	 * @author Shnupbups
	 */
	public boolean canOperate();

	/**
	 * Calculates the amount of energy that should be spent whilst operating, factoring in
	 * upgrades as well as the amount set within the recipe the machine is set to craft.
	 * Should be checked against stored RF in {@link #canOperate()}. <br>
	 * <br>
	 * <b>Note: </b> this is NOT the RF taken per tick, but rather the total RF used
	 * throughout the crafting operation. RF per tick should be calculated using this and
	 * {@link #getTimeNeeded()}.
	 * 
	 * @return Energy needed to complete an operation.
	 * @author Shnupbups
	 */
	public int getEnergyNeeded();

	/**
	 * Calculates the amount of time, in ticks, that should be spent operating, factoring in
	 * upgrades as well as the time set within the recipe the machine is set to craft.
	 * Should be used in conjunction with {@link #getEnergyNeeded()} to find RF per tick.
	 * 
	 * @return Ticks needed to complete an operation.
	 * @author Shnupbups
	 */
	public int getTimeNeeded();

	/**
	 * Calculates the percentage chance of the second output of a recipe (if it exists)
	 * being produced, factoring in upgrades as well as the percentage set within the recipe
	 * the machine is set to craft.
	 * 
	 * @return Percentage chance of producing second output.
	 * @author Shnupbups
	 */
	public int getSecondOutputChance();
}
