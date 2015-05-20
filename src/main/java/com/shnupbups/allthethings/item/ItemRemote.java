package com.shnupbups.allthethings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemRemote extends ItemBasic {

	public int x = 0,y = -1,z = 0,side = 0;
	public float f1 = 0,f2 = 0,f3 = 0;
	
	public ItemRemote(String name, CreativeTabs tab, String lore) {
		super(name, tab, 1, lore);
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float f1, float f2, float f3) {
		if(!world.isRemote && player.isSneaking()) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.side = side;
			this.f1 = f1;
			this.f2 = f2;
			this.f3 = f3;
			player.addChatComponentMessage(new ChatComponentText("Coordinates set: "+x+","+y+","+z));
			return true;
		}
		return false;
    }
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote && !player.isSneaking()) {
			if(x != 0 && y != 0 && z != 0) {
				world.getBlock(x, y, z).onBlockActivated(world, x, y, z, player, side, f1, f2, f3);
			}
		}
		return stack;
	}
}
