package com.shnupbups.allthethings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.init.ModMisc;

public class ItemBackpack extends ItemBasic {
	public boolean isOpen=false;

	public ItemBackpack(String name,CreativeTabs tab) {
		super(name,tab,1);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack,World world,EntityPlayer player) {
		if(!world.isRemote) {
			if(!player.isSneaking()) {
				player.openGui(allthethings.instance,ModMisc.backpackID,player.worldObj,(int)player.posX,(int)player.posY,(int)player.posZ);
				/**
				 * if(((GuiBackpack)GuiHandler.getGui(ModMisc.backpackID,
				 * player)).inventory.getStackInSlot(0) != null &&
				 * ((GuiBackpack)GuiHandler.getGui(ModMisc.backpackID,
				 * player)).inventory.getStackInSlot(0).getItem() != null) {
				 * LogHelper.info(((GuiBackpack)GuiHandler.getGui(ModMisc.backpackID,
				 * player)).inventory.getStackInSlot(0).getItem().getUnlocalizedName());
				 * }
				 **/
			}
		}
		return stack;
	}
	/**
	 * public IIcon[] icons = new IIcon[2];
	 * 
	 * @Override
	 * public void registerIcons(IIconRegister reg) {
	 * this.icons[0] = reg.registerIcon(Reference.MOD_ID + ":backpack");
	 * this.icons[1] = reg.registerIcon(Reference.MOD_ID + ":backpackOpen");
	 * }
	 * @Override
	 * public IIcon getIconFromDamage(int meta) {
	 * if(isOpen == true) return icons[1];
	 * else return icons[0];
	 * }
	 **/
}
