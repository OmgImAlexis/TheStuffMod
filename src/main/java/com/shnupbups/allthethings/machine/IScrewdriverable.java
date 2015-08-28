package com.shnupbups.allthethings.machine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * An interface allowing for blocks to be configured more
 * with a screwdriver than with a regular instance of
 * IToolHammer. Usually has the ability to change things
 * while a player is sneaking rather than dismantling a block.
 * 
 * @author Shnupbups
 */
public interface IScrewdriverable {
	/**
	 * Checks if the block can be altered with a screwdriver given its current situation.<br>
	 * The stack is the currently held stack of the player, so it would generically be the
	 * screwdriver.
	 * 
	 * @param world
	 * @param player
	 * @param x
	 * @param y
	 * @param z
	 * @param stack
	 * @return Whether the block can be altered with a screwdriver.
	 */
	public boolean canBeScrewdrivered(World world,EntityPlayer player,int x,int y,int z,ItemStack stack);

	/**
	 * Alters the block with a screwdriver given its current situation.<br>
	 * The stack is the currently held stack of the player, so it would generically be the
	 * screwdriver.
	 * 
	 * @param world
	 * @param player
	 * @param x
	 * @param y
	 * @param z
	 * @param stack
	 * @return Whether the block was successfully altered with the screwdriver.
	 */
	public boolean onScrewdrivered(World world,EntityPlayer player,int x,int y,int z,ItemStack stack);
}
