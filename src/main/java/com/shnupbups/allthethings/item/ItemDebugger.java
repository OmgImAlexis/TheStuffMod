package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.energy.IEnergy;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityBattery;
import com.shnupbups.allthethings.tileEntity.TileEntityCable;
import com.shnupbups.allthethings.tileEntity.TileEntityGenerator;
import com.shnupbups.allthethings.utility.ColourHelper;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemDebugger extends ItemBasic{

	public ItemDebugger(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize);
		Reference.incrementItems();
	}
	
	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float textureX, float textureY, float textureZ) {
        if(world.getTileEntity(x, y, z) instanceof IEnergy) {
			if(!player.isSneaking()) {
				player.addChatMessage(new ChatComponentText("Energy: "+(((IEnergy) world.getTileEntity(x, y, z)).getEnergyBar()).getEnergy()+"W"));
				if(world.getTileEntity(x, y, z) instanceof TileEntityBattery) {
					player.addChatMessage(new ChatComponentText("Output Side: "+(((TileEntityBattery) world.getTileEntity(x, y, z)).outputSide.name())));
				} else if(world.getTileEntity(x, y, z) instanceof TileEntityGenerator) {
					player.addChatMessage(new ChatComponentText("Output Side: "+(((TileEntityGenerator) world.getTileEntity(x, y, z)).outputSide.name())));
				} else if(world.getTileEntity(x, y, z) instanceof TileEntityCable && ((TileEntityCable) world.getTileEntity(x, y, z)).lastRecievedDirection != null) {
					player.addChatMessage(new ChatComponentText("Last Received Side: " + (((TileEntityCable) world.getTileEntity(x, y, z)).lastRecievedDirection.name())));
				}
			} else if(world.getTileEntity(x, y, z) instanceof TileEntityBattery) {
				if(((TileEntityBattery) world.getTileEntity(x, y, z)).outputSide == ForgeDirection.getOrientation(side)) {
					((TileEntityBattery) world.getTileEntity(x, y, z)).outputSide = ForgeDirection.getOrientation(ForgeDirection.OPPOSITES[side]);
				} else {
					((TileEntityBattery) world.getTileEntity(x, y, z)).outputSide = ForgeDirection.getOrientation(side);
				}
				player.addChatMessage(new ChatComponentText("Output Side: "+(((TileEntityBattery) world.getTileEntity(x, y, z)).outputSide.name())));
			} else if(world.getTileEntity(x, y, z) instanceof TileEntityGenerator) {
				if(((TileEntityGenerator) world.getTileEntity(x, y, z)).outputSide == ForgeDirection.getOrientation(side)) {
					((TileEntityGenerator) world.getTileEntity(x, y, z)).outputSide = ForgeDirection.getOrientation(ForgeDirection.OPPOSITES[side]);
				} else {
					((TileEntityGenerator) world.getTileEntity(x, y, z)).outputSide = ForgeDirection.getOrientation(side);
				}
				player.addChatMessage(new ChatComponentText("Output Side: "+(((TileEntityGenerator) world.getTileEntity(x, y, z)).outputSide.name())));
			}
			return true;
		} return false;
	}
}
