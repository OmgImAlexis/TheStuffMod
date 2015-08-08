package com.shnupbups.allthethings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.shnupbups.allthethings.entity.EntityPaintball;
import com.shnupbups.allthethings.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPaintballGun extends ItemBasic {

	public ItemPaintballGun(String name, CreativeTabs tab) {
		super(name, tab, 1);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		boolean flag = player.capabilities.isCreativeMode;
		
		int meta = 0;

        if (player.inventory.hasItem(ModItems.paintball))
        {
        	for (int i = 0; i < player.inventory.mainInventory.length; ++i)
            {
                if (player.inventory.mainInventory[i] != null && player.inventory.mainInventory[i].getItem() == ModItems.paintball)
                {
                    meta = player.inventory.getStackInSlot(i).getItemDamage();
                    break;
                }
            }
            EntityPaintball entitypaintball = new EntityPaintball(world, player);

            stack.damageItem(1, player);
            world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) * 0.5F);

            if(!flag)
            {
                player.inventory.consumeInventoryItem(ModItems.paintball);
            }

            if (!world.isRemote)
            {
            	if(meta < 16) entitypaintball.setColour(meta);
            	else entitypaintball.setColour(world.rand.nextInt(15));
                world.spawnEntityInWorld(entitypaintball);
            }
        } return stack;
    }

	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
