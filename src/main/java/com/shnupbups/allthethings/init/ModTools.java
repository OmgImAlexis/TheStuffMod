package com.shnupbups.allthethings.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import com.shnupbups.allthethings.item.ItemBasicAxe;
import com.shnupbups.allthethings.item.ItemBasicHoe;
import com.shnupbups.allthethings.item.ItemBasicPickaxe;
import com.shnupbups.allthethings.item.ItemBasicShovel;
import com.shnupbups.allthethings.item.ItemBasicSword;
import com.shnupbups.allthethings.item.ItemFyrestoneSword;
import com.shnupbups.allthethings.item.ItemVoidiumSword;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {
	public static final ToolMaterial ONYX=EnumHelper.addToolMaterial("ONYX",4,2437,10.0F,3.5F,12);
	public static final ToolMaterial RUBY=EnumHelper.addToolMaterial("RUBY",2,574,8.0F,2.5F,13);
	public static final ToolMaterial SAPPHIRE=EnumHelper.addToolMaterial("SAPPHIRE",2,574,8.0F,2.5F,13);
	public static final ToolMaterial AMBER=EnumHelper.addToolMaterial("AMBER",2,792,8.0F,2.5F,14);
	public static final ToolMaterial JADE=EnumHelper.addToolMaterial("JADE",3,1376,7.0F,3.5F,12);
	public static final ToolMaterial AMETHYST=EnumHelper.addToolMaterial("AMETHYST",3,1574,8.0F,2.5F,13);
	public static final ToolMaterial CITRINE=EnumHelper.addToolMaterial("CITRINE",4,1974,9.0F,3.5F,13);
	public static final ToolMaterial CARNELIAN=EnumHelper.addToolMaterial("CARNELIAN",4,1848,8.5F,3.0F,17);
	public static final ToolMaterial EMERALD=EnumHelper.addToolMaterial("EMERALD",3,642,4.0F,2.0F,25);
	public static final ToolMaterial FYRESTONE=EnumHelper.addToolMaterial("FYRESTONE",3,256,4.0F,2.0F,20);
	public static final ToolMaterial VOIDIUM=EnumHelper.addToolMaterial("VOIDIUM",9001,9001,9001.0F,1.0F,0);
	public static final ItemBasicAxe onyxAxe=new ItemBasicAxe(ONYX,ONYX.name().toLowerCase(),0x3D3D3D);
	public static final ItemBasicPickaxe onyxPickaxe=new ItemBasicPickaxe(ONYX,ONYX.name().toLowerCase(),0x3D3D3D);
	public static final ItemBasicShovel onyxShovel=new ItemBasicShovel(ONYX,ONYX.name().toLowerCase(),0x3D3D3D);
	public static final ItemBasicHoe onyxHoe=new ItemBasicHoe(ONYX,ONYX.name().toLowerCase(),0x3D3D3D);
	public static final ItemBasicSword onyxSword=new ItemBasicSword(ONYX,ONYX.name().toLowerCase(),0x3D3D3D);
	public static final ItemBasicAxe rubyAxe=new ItemBasicAxe(RUBY,RUBY.name().toLowerCase(),0xDD2317);
	public static final ItemBasicPickaxe rubyPickaxe=new ItemBasicPickaxe(RUBY,RUBY.name().toLowerCase(),0xDD2317);
	public static final ItemBasicShovel rubyShovel=new ItemBasicShovel(RUBY,RUBY.name().toLowerCase(),0xDD2317);
	public static final ItemBasicHoe rubyHoe=new ItemBasicHoe(RUBY,RUBY.name().toLowerCase(),0xDD2317);
	public static final ItemBasicSword rubySword=new ItemBasicSword(RUBY,RUBY.name().toLowerCase(),0xDD2317);
	public static final ItemFyrestoneSword fyrestoneSword=new ItemFyrestoneSword(FYRESTONE,FYRESTONE.name().toLowerCase(),0xCC7A00);
	public static final ItemBasicAxe fyrestoneAxe=new ItemBasicAxe(FYRESTONE,FYRESTONE.name().toLowerCase(),0xCC7A00);
	public static final ItemBasicPickaxe fyrestonePickaxe=new ItemBasicPickaxe(FYRESTONE,FYRESTONE.name().toLowerCase(),0xCC7A00);
	public static final ItemBasicShovel fyrestoneShovel=new ItemBasicShovel(FYRESTONE,FYRESTONE.name().toLowerCase(),0xCC7A00);
	public static final ItemBasicHoe fyrestoneHoe=new ItemBasicHoe(FYRESTONE,FYRESTONE.name().toLowerCase(),0xCC7A00);
	public static final ItemVoidiumSword voidiumSword=new ItemVoidiumSword(VOIDIUM,VOIDIUM.name().toLowerCase(),0x0F0F0F);
	public static final ItemBasicAxe voidiumAxe=new ItemBasicAxe(VOIDIUM,VOIDIUM.name().toLowerCase(),0x0F0F0F);
	public static final ItemBasicPickaxe voidiumPickaxe=new ItemBasicPickaxe(VOIDIUM,VOIDIUM.name().toLowerCase(),0x0F0F0F);
	public static final ItemBasicShovel voidiumShovel=new ItemBasicShovel(VOIDIUM,VOIDIUM.name().toLowerCase(),0x0F0F0F);
	public static final ItemBasicHoe voidiumHoe=new ItemBasicHoe(VOIDIUM,VOIDIUM.name().toLowerCase(),0x0F0F0F);

	public static void init() {
		GameRegistry.registerItem(onyxAxe,"onyxAxe");
		GameRegistry.registerItem(onyxPickaxe,"onyxPickaxe");
		GameRegistry.registerItem(onyxShovel,"onyxShovel");
		GameRegistry.registerItem(onyxHoe,"onyxHoe");
		GameRegistry.registerItem(onyxSword,"onyxSword");
		GameRegistry.registerItem(rubyAxe,"rubyAxe");
		GameRegistry.registerItem(rubyPickaxe,"rubyPickaxe");
		GameRegistry.registerItem(rubyShovel,"rubyShovel");
		GameRegistry.registerItem(rubyHoe,"rubyHoe");
		GameRegistry.registerItem(rubySword,"rubySword");
		GameRegistry.registerItem(fyrestoneAxe,"fyrestoneAxe");
		GameRegistry.registerItem(fyrestonePickaxe,"fyrestonePickaxe");
		GameRegistry.registerItem(fyrestoneShovel,"fyrestoneShovel");
		GameRegistry.registerItem(fyrestoneHoe,"fyrestoneHoe");
		GameRegistry.registerItem(fyrestoneSword,"fyrestoneSword");
		GameRegistry.registerItem(voidiumAxe,"voidiumAxe");
		GameRegistry.registerItem(voidiumPickaxe,"voidiumPickaxe");
		GameRegistry.registerItem(voidiumShovel,"voidiumShovel");
		GameRegistry.registerItem(voidiumHoe,"voidiumHoe");
		GameRegistry.registerItem(voidiumSword,"voidiumSword");
		LogHelper.info("Tools initialised successfully!");
	}
}