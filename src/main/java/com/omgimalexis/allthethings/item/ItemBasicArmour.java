package com.omgimalexis.allthethings.item;

import com.omgimalexis.allthethings.init.ModArmour;
import com.omgimalexis.allthethings.init.ModCreativeTabs;
import com.omgimalexis.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBasicArmour extends ItemArmor{

	public String materialName;
	
	public ItemBasicArmour(ArmorMaterial material, int render, int type, String name) {
		super(material, render, type);
		this.setUnlocalizedName(name);
		this.setCreativeTab(ModCreativeTabs.tool);
		Reference.incrementItems();
		materialName = material.name().toLowerCase();
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ModArmour.helmetRuby || stack.getItem() == ModArmour.chestplateRuby || stack.getItem() == ModArmour.bootsRuby || stack.getItem() == ModArmour.helmetOnyx || stack.getItem() == ModArmour.chestplateOnyx || stack.getItem() == ModArmour.bootsOnyx || stack.getItem() == ModArmour.helmetKunzite || stack.getItem() == ModArmour.chestplateKunzite || stack.getItem() == ModArmour.bootsKunzite || stack.getItem() == ModArmour.helmetTrytementium || stack.getItem() == ModArmour.chestplateTrytementium || stack.getItem() == ModArmour.bootsTrytementium) {
			return Reference.MOD_ID + ":textures/models/armor/"+materialName+"Armour1.png";
		} else if (stack.getItem() == ModArmour.leggingsRuby || stack.getItem() == ModArmour.leggingsOnyx || stack.getItem() == ModArmour.leggingsKunzite || stack.getItem() == ModArmour.leggingsTrytementium) {
			return Reference.MOD_ID + ":textures/models/armor/"+materialName+"Armour2.png";
		} else {
			return null;
		}
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
