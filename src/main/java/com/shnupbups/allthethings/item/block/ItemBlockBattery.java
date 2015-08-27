package com.shnupbups.allthethings.item.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidTank;
import cofh.api.energy.EnergyStorage;

import com.shnupbups.allthethings.block.BlockBattery;

public class ItemBlockBattery extends ItemBlock {

	public final BlockBattery block;
	
	public ItemBlockBattery(Block block) {
		super(block);
		this.block = (BlockBattery) block;
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		EnergyStorage rf = new EnergyStorage(block.maxStorage);
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("tiledata")) {
			NBTTagCompound nbt = stack.getTagCompound().getCompoundTag("tiledata");
			rf.readFromNBT(nbt);
			list.add("Energy: "+rf.getEnergyStored()+"RF/"+rf.getMaxEnergyStored()+"RF");
		} else {
			list.add("Energy: 0RF/"+rf.getMaxEnergyStored()+"RF");
		}
		super.addInformation(stack, player, list, bool);
	}
	
	@Override
    public String getItemStackDisplayName(ItemStack stack) {
        if (stack.stackTagCompound != null && stack.getTagCompound().hasKey("tankdata")) {
        	FluidTank tank = new FluidTank(block.maxStorage);
        	NBTTagCompound nbt = stack.getTagCompound().getCompoundTag("tankdata");
        	tank.readFromNBT(nbt);
            return tank.getFluid().getLocalizedName()+" "+super.getItemStackDisplayName(stack);
        } return super.getItemStackDisplayName(stack);
    }
}
