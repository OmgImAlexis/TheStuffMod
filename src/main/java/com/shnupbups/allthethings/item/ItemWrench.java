package com.shnupbups.allthethings.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.block.IDismantleable;
import cofh.api.item.IToolHammer;

import com.google.common.collect.Multimap;
import com.shnupbups.allthethings.block.BlockGenerator;
import com.shnupbups.allthethings.tileEntity.TileEntityGenerator;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWrench extends ItemBasic implements IToolHammer {

	public ItemWrench(String name, CreativeTabs tab) {
		super(name, tab, 1);
		this.setMaxDamage(255);
	}

	@Override
	public boolean isUsable(ItemStack item, EntityLivingBase user, int x, int y, int z) {
		return true;
	}

	@Override
	public void toolUsed(ItemStack item, EntityLivingBase user, int x, int y, int z) {
		if(user.worldObj.getBlock(x, y, z) instanceof IDismantleable && ((IDismantleable)user.worldObj.getBlock(x, y, z)).canDismantle((EntityPlayer) user, user.worldObj, x, y, z)) {
			item.damageItem(1, user);
			((IDismantleable)user.worldObj.getBlock(x, y, z)).dismantleBlock((EntityPlayer) user, user.worldObj, x, y, z, true);
		}
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float sx, float sy, float sz) {
		if(!world.isRemote && player.isSneaking() && player.worldObj.getBlock(x, y, z) instanceof IDismantleable && ((IDismantleable)player.worldObj.getBlock(x, y, z)).canDismantle(player, player.worldObj, x, y, z)) {
			stack.damageItem(1, player);
			((IDismantleable)player.worldObj.getBlock(x, y, z)).dismantleBlock(player, player.worldObj, x, y, z, true);
			return true;
		}
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if(!world.isRemote && player.isSneaking()) {
			itemStack.damageItem(1, player);
			return itemStack;
		}
		return itemStack;
	}
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
	
	@Override
    public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
		return true;
    }
	
	@Override
	public Multimap getAttributeModifiers(ItemStack stack){
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 0.5F, 0));
        return multimap;
    }

}
