package com.shnupbups.allthethings.item;

import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.IFluidHandler;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.machine.IEnergyTile;
import com.shnupbups.allthethings.utility.WorldHelper;

public class ItemDebugger extends ItemBasic {
	public ItemDebugger(String name,CreativeTabs tab,int stackSize) {
		super(name,tab,stackSize);
		Reference.incrementItems();
	}

	@Override
	public boolean onItemUse(ItemStack itemstack,EntityPlayer player,World world,int x,int y,int z,int side,float textureX,float textureY,float textureZ) {
		if(!world.isRemote&&world.getTileEntity(x,y,z) instanceof IEnergyHandler) {
			if(player.isSneaking()) {
				IEnergyHandler tile = (IEnergyHandler)world.getTileEntity(x,y,z);
				player.addChatMessage(new ChatComponentText("Energy Stored: "+tile.getEnergyStored(ForgeDirection.UNKNOWN)+"RF"));
				player.addChatMessage(new ChatComponentText("Maximum Energy: "+tile.getMaxEnergyStored(ForgeDirection.UNKNOWN)+"RF"));
				if(tile instanceof IEnergyTile) {
					IEnergyTile rtile = (IEnergyTile)world.getTileEntity(x,y,z);
					EnergyStorage storage = rtile.getStorage();
					player.addChatMessage(new ChatComponentText("Max Extractable: "+storage.getMaxExtract()+"RF"));
					player.addChatMessage(new ChatComponentText("Max Receivable: "+storage.getMaxReceive()+"RF"));
				}
			}
			return true;
		} else if(!world.isRemote&&world.getTileEntity(x,y,z) instanceof IFluidHandler) {
			if(player.isSneaking()) {
				if(((IFluidHandler)world.getTileEntity(x,y,z)).getTankInfo(ForgeDirection.UNKNOWN)[0].fluid!=null&&((IFluidHandler)world.getTileEntity(x,y,z)).getTankInfo(ForgeDirection.UNKNOWN)[0].fluid.getFluid()!=null) {
					player.addChatMessage(new ChatComponentText("Fluid: "+((IFluidHandler)world.getTileEntity(x,y,z)).getTankInfo(ForgeDirection.UNKNOWN)[0].fluid.getLocalizedName()));
					player.addChatMessage(new ChatComponentText("Amount Stored: "+((IFluidHandler)world.getTileEntity(x,y,z)).getTankInfo(ForgeDirection.UNKNOWN)[0].fluid.amount+"mb"));
				}
				player.addChatMessage(new ChatComponentText("Maximum Capacity: "+((IFluidHandler)world.getTileEntity(x,y,z)).getTankInfo(ForgeDirection.UNKNOWN)[0].capacity+"mb"));
			}
			return true;
		} else if(!world.isRemote) {
			int[] coords=WorldHelper.getNearestBlockOfType(world,BlockCrops.class,x,y,z,5);
			if(coords!=null) player.addChatMessage(new ChatComponentText("Nearest crops: X="+coords[0]+" Y="+coords[1]+" Z="+coords[2]));
			else player.addChatMessage(new ChatComponentText("Not found within range 5"));
			new MapGenVillage.Start(world,world.rand,world.getChunkFromBlockCoords(x,z).xPosition,world.getChunkFromBlockCoords(x,z).zPosition,world.getWorldInfo().getTerrainType().getWorldTypeID());
		}
		return false;
	}
}
