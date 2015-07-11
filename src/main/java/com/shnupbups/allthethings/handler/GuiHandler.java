package com.shnupbups.allthethings.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.shnupbups.allthethings.gui.GuiBackpack;
import com.shnupbups.allthethings.gui.GuiCompressor;
import com.shnupbups.allthethings.gui.GuiGenerator;
import com.shnupbups.allthethings.gui.GuiOven;
import com.shnupbups.allthethings.gui.GuiPulverizer;
import com.shnupbups.allthethings.init.ModMisc;
import com.shnupbups.allthethings.inventory.ContainerBackpack;
import com.shnupbups.allthethings.inventory.ContainerCompressor;
import com.shnupbups.allthethings.inventory.ContainerGenerator;
import com.shnupbups.allthethings.inventory.ContainerOven;
import com.shnupbups.allthethings.inventory.ContainerPulverizer;
import com.shnupbups.allthethings.inventory.InventoryBackpack;
import com.shnupbups.allthethings.tileEntity.TileEntityCompressor;
import com.shnupbups.allthethings.tileEntity.TileEntityGenerator;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

import cpw.mods.fml.common.network.IGuiHandler;

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
		} else if(tileentity instanceof TileEntityGenerator || ID == 5) {
			return new ContainerGenerator(player, world, x, y, z);
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
		} else if(tileentity instanceof TileEntityGenerator || ID == 5) {
			return new GuiGenerator(player.inventory, (TileEntityGenerator) tileentity);
		}
		return null;
	}

	public static Object getGui(int ID, EntityPlayer player) {
		if(ID == ModMisc.backpackID) {
			return new GuiBackpack(new ContainerBackpack(player, player.inventory, new InventoryBackpack(player.getHeldItem())));
		} return null;
	}
	
}
