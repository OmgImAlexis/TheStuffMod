package com.shnupbups.allthethings.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.google.common.collect.Multimap;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.lib.Reference;

public class ItemPaintbrush extends ItemBasic {
	public ItemPaintbrush(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize, "Temporary Recipe, will change next PR.");
		Reference.incrementItems();
	}
	
	public IIcon[] icons = new IIcon[16];

	@Override
	public void registerIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(Reference.MOD_ID + ":paintbrushWhite");
		this.icons[1] = reg.registerIcon(Reference.MOD_ID + ":paintbrushOrange");
		this.icons[2] = reg.registerIcon(Reference.MOD_ID + ":paintbrushMagenta");
		this.icons[3] = reg.registerIcon(Reference.MOD_ID + ":paintbrushLightBlue");
		this.icons[4] = reg.registerIcon(Reference.MOD_ID + ":paintbrushYellow");
		this.icons[5] = reg.registerIcon(Reference.MOD_ID + ":paintbrushLime");
		this.icons[6] = reg.registerIcon(Reference.MOD_ID + ":paintbrushPink");
		this.icons[7] = reg.registerIcon(Reference.MOD_ID + ":paintbrushGrey");
		this.icons[8] = reg.registerIcon(Reference.MOD_ID + ":paintbrushLightGrey");
		this.icons[9] = reg.registerIcon(Reference.MOD_ID + ":paintbrushCyan");
		this.icons[10] = reg.registerIcon(Reference.MOD_ID + ":paintbrushPurple");
		this.icons[11] = reg.registerIcon(Reference.MOD_ID + ":paintbrushBlue");
		this.icons[12] = reg.registerIcon(Reference.MOD_ID + ":paintbrushBrown");
		this.icons[13] = reg.registerIcon(Reference.MOD_ID + ":paintbrushGreen");
		this.icons[14] = reg.registerIcon(Reference.MOD_ID + ":paintbrushRed");
		this.icons[15] = reg.registerIcon(Reference.MOD_ID + ":paintbrushBlack");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta > 15) meta = 0;
		
		return this.icons[meta];
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 16; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return Reference.MOD_ID + ":paintbrushWhite";
		case 1:
			return Reference.MOD_ID + ":paintbrushOrange";
		case 2:
			return Reference.MOD_ID + ":paintbrushMagenta";
		case 3:
			return Reference.MOD_ID + ":paintbrushLightBlue";
		case 4:
			return Reference.MOD_ID + ":paintbrushYellow";
		case 5:
			return Reference.MOD_ID + ":paintbrushLime";
		case 6:
			return Reference.MOD_ID + ":paintbrushPink";
		case 7:
			return Reference.MOD_ID + ":paintbrushGrey";
		case 8:
			return Reference.MOD_ID + ":paintbrushLightGrey";
		case 9:
			return Reference.MOD_ID + ":paintbrushCyan";
		case 10:
			return Reference.MOD_ID + ":paintbrushPurple";
		case 11:
			return Reference.MOD_ID + ":paintbrushBlue";
		case 12:
			return Reference.MOD_ID + ":paintbrushBrown";
		case 13:
			return Reference.MOD_ID + ":paintbrushGreen";
		case 14:
			return Reference.MOD_ID + ":paintbrushRed";
		case 15:
			return Reference.MOD_ID + ":paintbrushBlack";
		default:
			return this.getUnlocalizedName();
		}
	}
	
	
	@Override
	public Multimap getAttributeModifiers(ItemStack stack){
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 1.0F, 0));
        return multimap;
    }
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack){
        return new ItemStack(ModItems.paintbrush);
    }

    @Override
    public boolean hasContainerItem(){
        return true;
    }
    
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
    	return false;
    }
}
