package com.shnupbups.allthethings.item;

import java.lang.reflect.Method;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;
import com.shnupbups.allthethings.utility.LogHelper;

public class ItemAgitator extends ItemBasic {
	public ItemAgitator(String name,CreativeTabs tab) {
		super(name,tab,1);
	}

	public boolean onItemUse(ItemStack itemStack,EntityPlayer player,World world,int x,int y,int z,int side,float f1,float f2,float f3) {
		if(world.isRemote) {
			List list=world.getEntitiesWithinAABBExcludingEntity(player,AxisAlignedBB.getBoundingBox(player.posX-20,player.posY-20,player.posZ-20,player.posX+20,player.posY+20,player.posZ+20));
			for(int i=0;i<list.size();i++) {
				if(list.get(i) instanceof EntityCreeper) {
					((EntityCreeper)list.get(i)).func_146079_cb();
				} else if(list.get(i) instanceof EntityPigZombie) {
					Method method;
					try {
						method=EntityPigZombie.class.getMethod("becomeAngryAt",new Class[]{Entity.class});
						method.setAccessible(true);
						method.invoke(((EntityPigZombie)list.get(i)),player);
					} catch(Exception e1) {
						((EntityPigZombie)list.get(i)).attackEntityFrom(new EntityDamageSource("player",player),0);
						LogHelper.warn("ERROR IN REFLECTION OF PIGZOMBIE CLASS");
						LogHelper.warn(e1.getMessage());
					}
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack,World world,EntityPlayer player) {
		if(!world.isRemote) {
			List list=world.getEntitiesWithinAABBExcludingEntity(player,AxisAlignedBB.getBoundingBox(player.posX-20,player.posY-20,player.posZ-20,player.posX+20,player.posY+20,player.posZ+20));
			for(int i=0;i<list.size();i++) {
				if(list.get(i) instanceof EntityCreeper) {
					((EntityCreeper)list.get(i)).func_146079_cb();
				}
			}
		}
		return itemStack;
	}
}
