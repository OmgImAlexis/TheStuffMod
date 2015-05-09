package com.shnupbups.allthethings.itemblocks;

import com.shnupbups.allthethings.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockBananaSkin extends ItemBlock {

	public ItemBlockBananaSkin(Block p_i45328_1_) {
		super(p_i45328_1_);
		// TODO Auto-generated constructor stub
	}
	
	 public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
	 {
	 		 ModBlocks.ustherPortal.func_150000_e(world, i, j + 1, k);
	 		 return true;
	 }

}
