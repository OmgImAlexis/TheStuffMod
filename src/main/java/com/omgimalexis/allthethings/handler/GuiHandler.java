package com.omgimalexis.allthethings.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.omgimalexis.allthethings.gui.GuiCompressor;
import com.omgimalexis.allthethings.gui.GuiCrusher;
import com.omgimalexis.allthethings.gui.GuiOven;
import com.omgimalexis.allthethings.gui.GuiPulverizer;
import com.omgimalexis.allthethings.inventory.ContainerCompressor;
import com.omgimalexis.allthethings.inventory.ContainerCrusher;
import com.omgimalexis.allthethings.inventory.ContainerOven;
import com.omgimalexis.allthethings.inventory.ContainerPulverizer;
import com.omgimalexis.allthethings.tileEntity.TileEntityCompressor;
import com.omgimalexis.allthethings.tileEntity.TileEntityCrusher;
import com.omgimalexis.allthethings.tileEntity.TileEntityOven;
import com.omgimalexis.allthethings.tileEntity.TileEntityPulverizer;

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
