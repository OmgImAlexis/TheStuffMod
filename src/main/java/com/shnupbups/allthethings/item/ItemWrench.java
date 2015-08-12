package com.shnupbups.allthethings.item;

import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cofh.api.block.IDismantleable;
import cofh.api.item.IToolHammer;

import com.google.common.collect.Multimap;

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

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		if(!GuiScreen.isShiftKeyDown()) {
			list.add("Hold Shift For Details");
		} else {
			list.add("Shift-RClick to Dismantle Blocks");
			list.add("RClick to Modify Sides");
		}
	}
	
}
