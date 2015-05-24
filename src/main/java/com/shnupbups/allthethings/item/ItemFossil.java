package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.lib.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemFossil extends ItemBasic{

	public ItemFossil(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize, "Prehistoric");
		Reference.incrementItems();
	}
	
	public IIcon[] icons = new IIcon[6];

	@Override
	public void registerIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(Reference.MOD_ID + ":fossil");
		this.icons[1] = reg.registerIcon(Reference.MOD_ID + ":fossilClaw");
		this.icons[2] = reg.registerIcon(Reference.MOD_ID + ":fossilFoot");
		this.icons[3] = reg.registerIcon(Reference.MOD_ID + ":fossilPelvis");
		this.icons[4] = reg.registerIcon(Reference.MOD_ID + ":fossilRibs");
		this.icons[5] = reg.registerIcon(Reference.MOD_ID + ":bigBone");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta > 5) meta = 0;
		
		return this.icons[meta];
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 6; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return this.getUnlocalizedName();
		case 1:
			return this.getUnlocalizedName() + "Claw";
		case 2:
			return this.getUnlocalizedName() + "Foot";
		case 3:
			return this.getUnlocalizedName() + "Pelvis";
		case 4:
			return this.getUnlocalizedName() + "Ribs";
		case 5:
			return Reference.MOD_ID+":bigBone";
		default:
			return this.getUnlocalizedName();
		}
	}
}
