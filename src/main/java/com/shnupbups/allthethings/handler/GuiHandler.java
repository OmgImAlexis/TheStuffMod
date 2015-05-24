package com.shnupbups.allthethings.handler;

import com.shnupbups.allthethings.gui.*;
import com.shnupbups.allthethings.init.ModMisc;
import com.shnupbups.allthethings.inventory.*;
import com.shnupbups.allthethings.tileEntity.TileEntityCompressor;
import com.shnupbups.allthethings.tileEntity.TileEntityCrusher;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	public GuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ModMisc.backpackID) {
			return new ContainerBackpack(player, player.inventory, new InventoryBackpack(player.getHeldItem()));
		}
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if(tileentity instanceof TileEntityCompressor || ID == 1) {
			return new ContainerCompressor(player, world, x, y, z);
		} else if(tileentity instanceof TileEntityOven || ID == 2) {
			return new ContainerOven(player, world, x, y, z);
		} else if(tileentity instanceof TileEntityPulverizer || ID == 3) {
			return new ContainerPulverizer(player, world, x, y, z);
		} else if(tileentity instanceof TileEntityCrusher || ID == 4) {
			if(((TileEntityCrusher)tileentity).isMaster()) return new ContainerCrusher(player, world, x, y, z);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ModMisc.backpackID) {
			return new GuiBackpack(new ContainerBackpack(player, player.inventory, new InventoryBackpack(player.getHeldItem())));
		}
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if(tileentity instanceof TileEntityCompressor || ID == 1) {
			return new GuiCompressor(player.inventory, (TileEntityCompressor) tileentity);
		} else if(tileentity instanceof TileEntityOven || ID == 2) {
			return new GuiOven(player.inventory, (TileEntityOven) tileentity);
		} else if(tileentity instanceof TileEntityPulverizer || ID == 3) {
			return new GuiPulverizer(player.inventory, (TileEntityPulverizer) tileentity);
		} else if(tileentity instanceof TileEntityCrusher || ID == 4) {
			if(((TileEntityCrusher)tileentity).isMaster()) return new GuiCrusher(player.inventory, (TileEntityCrusher) tileentity);
		}
		return null;
	}

	public static Object getGui(int ID, EntityPlayer player) {
		if(ID == ModMisc.backpackID) {
			return new GuiBackpack(new ContainerBackpack(player, player.inventory, new InventoryBackpack(player.getHeldItem())));
		} return null;
	}
	
}
