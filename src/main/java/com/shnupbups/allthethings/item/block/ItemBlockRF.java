package com.shnupbups.allthethings.item.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cofh.api.energy.EnergyStorage;

public class ItemBlockRF extends ItemBlock {
	public ItemBlockRF(Block block) {
		super(block);
	}

	@Override
	@SuppressWarnings({"rawtypes","unchecked"})
	public void addInformation(ItemStack stack,EntityPlayer player,List list,boolean bool) {
		EnergyStorage rf=new EnergyStorage(Integer.MAX_VALUE);
		if(stack.hasTagCompound()&&stack.getTagCompound().hasKey("tiledata")) {
			NBTTagCompound nbt=stack.getTagCompound().getCompoundTag("tiledata");
			rf.readFromNBT(nbt);
			list.add("Energy: "+rf.getEnergyStored()+"RF");
		} else {
			list.add("Energy: 0RF");
		}
		super.addInformation(stack,player,list,bool);
	}
}
