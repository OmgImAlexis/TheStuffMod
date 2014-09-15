package omgimalexis.allthethings.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import omgimalexis.allthethings.gui.GuiTutFurnace;
import omgimalexis.allthethings.inventory.ContainerTutFurnace;
import omgimalexis.allthethings.tile_entity.TileEntityDarkMatterFurnace;

import cpw.mods.fml.common.network.IGuiHandler;

public class TMGuiHandler implements IGuiHandler {

	public TMGuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityDarkMatterFurnace tileEntityFurnace = (TileEntityDarkMatterFurnace) world.getTileEntity(x, y, z);
			return new ContainerTutFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityDarkMatterFurnace tileEntityTestContainer = (TileEntityDarkMatterFurnace) world.getTileEntity(x, y, z);
			return new GuiTutFurnace(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}
