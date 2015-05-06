package com.shnupbups.allthethings.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.item.material.IMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.lib.Reference;

public class ItemMaterial extends ItemBasic implements IMaterial{
	public MaterialType type;
	public MaterialRarity rarity;
	public MaterialDimension dimension;
	
	private String lore;
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		super(name, tab, stackSize);
		this.type = type;
		this.rarity = rarity;
		this.dimension = dimension;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, tab, 64, type, rarity, dimension);
	}
	
	public ItemMaterial(String name, int stackSize, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, dimension);
	}
	
	public ItemMaterial(String name, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, type, rarity, dimension);
	}
	
	public ItemMaterial(String name, CreativeTabs tab, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, tab, 64, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, int stackSize, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, 64, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, tab, stackSize, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, MaterialType type, MaterialRarity rarity) {
		super(name, tab, stackSize);
		this.type = type;
		this.rarity = rarity;
		this.dimension = MaterialDimension.OVERWORLD;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, MaterialType type, MaterialRarity rarity) {
		this(name, tab, 64, type, rarity);
	}
	
	public ItemMaterial(String name, int stackSize, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity);
	}
	
	public ItemMaterial(String name, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, type, rarity);
	}
	
	public ItemMaterial(String name, CreativeTabs tab, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, tab, 64, type, rarity);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, int stackSize, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, 64, type, rarity);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, tab, stackSize, type, rarity);
		this.lore = lore;
	}
	
	public MaterialType getType(){
		return type;
	}
	
	public MaterialRarity getRarity(){
		return rarity;
	}
	
	public MaterialDimension getDimension(){
		return dimension;
	}
	
	@Override
	public int getColour() {
		// TODO Add automatic texture generation
		return 0xFFFFFF;
	}
	
	public static MaterialType getType(ItemMaterial material){
		return material.type;
	}
	
	public static MaterialRarity getRarity(ItemMaterial material){
		return material.rarity;
	}
	
	public static MaterialDimension getDimension(ItemMaterial material){
		return material.dimension;
	}
	
	public static int getColour(ItemMaterial material){
		// TODO Add automatic texture generation
		return 0xFFFFFF;
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		if(this.lore != null) {
			list.add(lore);
		}
	}
}
