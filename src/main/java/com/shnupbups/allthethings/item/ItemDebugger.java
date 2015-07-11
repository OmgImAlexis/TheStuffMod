package com.shnupbups.allthethings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.IEnergyHandler;

import com.shnupbups.allthethings.lib.Reference;

public class ItemDebugger extends ItemBasic{

	public ItemDebugger(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize);
		Reference.incrementItems();
	}
	
	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float textureX, float textureY, float textureZ) {
        if(!world.isRemote && world.getTileEntity(x, y, z) instanceof IEnergyHandler) {
			if(player.isSneaking()) {
				player.addChatMessage(new ChatComponentText("Energy Stored: "+((IEnergyHandler)world.getTileEntity(x, y, z)).getEnergyStored(ForgeDirection.UNKNOWN)+"RF"));
				player.addChatMessage(new ChatComponentText("Maximum Energy: "+((IEnergyHandler)world.getTileEntity(x, y, z)).getMaxEnergyStored(ForgeDirection.UNKNOWN)+"RF"));
			}
			return true;
		} return false;
	}
}
