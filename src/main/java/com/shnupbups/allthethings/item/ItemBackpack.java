package com.shnupbups.allthethings.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.gui.GuiBackpack;
import com.shnupbups.allthethings.handler.GuiHandler;
import com.shnupbups.allthethings.init.ModMisc;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBackpack extends ItemBasic {
	
	public ItemBackpack(String name, CreativeTabs tab) {
		super(name, tab, 1);
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			if (!player.isSneaking()) {
				player.openGui(allthethings.instance, ModMisc.backpackID, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
				/**if(((GuiBackpack)GuiHandler.getGui(ModMisc.backpackID, player)).inventory.getStackInSlot(0) != null && ((GuiBackpack)GuiHandler.getGui(ModMisc.backpackID, player)).inventory.getStackInSlot(0).getItem() != null) {
					LogHelper.info(((GuiBackpack)GuiHandler.getGui(ModMisc.backpackID, player)).inventory.getStackInSlot(0).getItem().getUnlocalizedName());
				}**/
			}
		}
		return stack;
	}

}
