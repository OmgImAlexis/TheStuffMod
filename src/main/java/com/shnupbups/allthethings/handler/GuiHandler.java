package com.shnupbups.allthethings.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.shnupbups.allthethings.gui.GuiCompressor;
import com.shnupbups.allthethings.gui.GuiCrusher;
import com.shnupbups.allthethings.gui.GuiOven;
import com.shnupbups.allthethings.gui.GuiPulverizer;
import com.shnupbups.allthethings.inventory.ContainerCompressor;
import com.shnupbups.allthethings.inventory.ContainerCrusher;
import com.shnupbups.allthethings.inventory.ContainerOven;
import com.shnupbups.allthethings.inventory.ContainerPulverizer;
import com.shnupbups.allthethings.tileEntity.TileEntityCompressor;
import com.shnupbups.allthethings.tileEntity.TileEntityCrusher;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public GuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
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

}
