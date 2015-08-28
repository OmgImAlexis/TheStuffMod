package com.shnupbups.allthethings.item;

import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.apache.commons.lang3.text.WordUtils;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.magic.EssenceType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEssence extends ItemBasic {
	public ItemEssence(String name,CreativeTabs tab,int stackSize) {
		super(name,tab,stackSize);
		this.setMaxDamage(16);
	}

	@Override
	@SuppressWarnings({"rawtypes","unchecked"})
	public void addInformation(ItemStack stack,EntityPlayer player,List list,boolean bool) {
		if(stack.stackTagCompound!=null) {
			int id=stack.stackTagCompound.getInteger("id");
			list.add("ID: "+id);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack,int pass) {
		if(stack.stackTagCompound!=null&&stack.stackTagCompound.getInteger("id")<EssenceType.values().length) return EssenceType.getFromId(stack.stackTagCompound.getInteger("id")).getColour();
		else return 0x000000;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon=iconRegister.registerIcon(Reference.MOD_ID+":essence");
	}

	@Override
	public void getSubItems(Item item,CreativeTabs creativeTab,List subItems) {
		ItemStack stack;
		for(int i=0;i<EssenceType.values().length;i++) {
			stack=new ItemStack(this);
			stack.stackTagCompound=new NBTTagCompound();
			stack.stackTagCompound.setInteger("id",i);
			subItems.add(stack);
		}
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		if(stack.stackTagCompound!=null&&stack.stackTagCompound.getInteger("id")<EssenceType.values().length) {
			return "Essence of "+WordUtils.capitalizeFully(EssenceType.getFromId(stack.getTagCompound().getInteger("id")).name());
		} else {
			return "ERROR";
		}
	}

	@Override
	public boolean hasEffect(ItemStack stack,int pass) {
		return false;
	}
}
