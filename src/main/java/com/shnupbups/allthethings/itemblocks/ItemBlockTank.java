package com.shnupbups.allthethings.itemblocks;

import java.util.List;

import org.apache.commons.lang3.text.WordUtils;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidTank;

import com.shnupbups.allthethings.block.BlockTank;
import com.shnupbups.allthethings.magic.EssenceType;

public class ItemBlockTank extends ItemBlock {

	public final BlockTank block;
	
	public ItemBlockTank(Block block) {
		super(block);
		this.block = (BlockTank) block;
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		FluidTank tank = new FluidTank(block.maxStorage);
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("tankdata")) {
			NBTTagCompound nbt = stack.getTagCompound().getCompoundTag("tankdata");
			tank.readFromNBT(nbt);
			list.add("Amount: "+tank.getFluidAmount()+"mb/"+tank.getCapacity()+"mb");
		} else {
			list.add("Amount: 0mb/"+tank.getCapacity()+"mb");
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
