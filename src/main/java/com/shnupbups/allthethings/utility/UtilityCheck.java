package com.shnupbups.allthethings.utility;

import java.util.LinkedList;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ChestGenHooks;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;

public class UtilityCheck {
	
	static LinkedList<Block> materialBlocks = new LinkedList<Block>();
	static LinkedList<ItemMaterial> materials = new LinkedList<ItemMaterial>();
	
	public static boolean isItemImpureGem(ItemStack itemstack) {
		if (itemstack.getItem() != null) {
			Item item = itemstack.getItem();
			return isItemImpureGem(item);
		}
		return false;
	}

	public static boolean isItemPureGem(ItemStack itemstack) {
		if (itemstack.getItem() != null) {
			Item item = itemstack.getItem();
			return(item instanceof ItemMaterial && ((ItemMaterial) item).getType() == MaterialType.PUREGEM);
		}
		return false;
	}

	public static boolean isItemImpureGem(Item item) {
		if (item == Items.diamond || item == Items.emerald || item == Items.quartz) {return true;}
		else {return(item instanceof ItemMaterial && ((ItemMaterial) item).getType() == MaterialType.GEM);}
	}
	
	public static boolean isBlockBeaconBase(ItemStack itemstack) {
		if (itemstack.getItem() != null) {
			Block block  = Block.getBlockFromItem(itemstack.getItem());
			return isBlockBeaconBase(block);
		}
		return false;
	}
	
	public static boolean isBlockBeaconBase(Block block) {
		return materialBlocks.contains(block);
	}

	public static String getToolFromMaterial(Material material) {
		if(material == Material.rock) {
			return "pickaxe";
		} else if(material == Material.iron) {
			return "pickaxe";
		} else if(material == Material.leaves) {
			return "shears";
		} else if(material == Material.wood) {
			return "axe";
		}
		return null;
	}

	public static boolean isItemBeaconPayment(ItemStack itemstack) {
		if (itemstack.getItem() != null) {
			Item item  = itemstack.getItem();
			return isItemBeaconPayment(item);
		}
		return false;
	}
	
	public static boolean isItemBeaconPayment(Item item) {
		return materials.contains(item);
	}
	
	public static Block addMaterialBlock(Block block) {
		materialBlocks.add(block);
		return block;
	}
	
	public static void removeMaterialBlock(Block block) {
		materialBlocks.remove(block);
	}

	public static Item addMaterial(ItemMaterial item) {
		materials.add(item);
		return item;
	}
	
	public static void removeMaterial(ItemMaterial item) {
		materials.remove(item);
	}

	public static SoundType getSoundFromMaterial(Material material) {
		if(material == Material.rock) {
			return Block.soundTypeStone;
		} else if(material == Material.iron) {
			return Block.soundTypeMetal;
		} else if(material == Material.leaves || material == Material.grass) {
			return Block.soundTypeGrass;
		} else if(material == Material.wood) {
			return Block.soundTypeWood;
		}
		return Block.soundTypeStone;
	}

	public static int getMaxPowerFromMeta(int meta) {
		// TODO Auto-generated method stub
		return (meta+1) * 100;
	}

	public static int getTransferPowerFromMeta(int meta) {
		// TODO Auto-generated method stub
		return (meta+1) * 100;
	}

	public static Item getDrop(Block block) {
		// TODO Auto-generated method stub
		if(block == ModBlocks.ustherite) return Item.getItemFromBlock(ModBlocks.cobbledUstherite);
		return null;
	}
	
	public static LinkedList getListOfMaterials() {
		return materials;
	}
	
	public static int intValueOfRarity(MaterialRarity rarity) {
		if(rarity == MaterialRarity.EVERYWHERE) return 100;
		else if(rarity == MaterialRarity.COMMON) return 75;
		else if(rarity == MaterialRarity.UNCOMMON) return 50;
		else if(rarity == MaterialRarity.AVERAGE) return 20;
		else if(rarity == MaterialRarity.RARE) return 10;
		else if(rarity == MaterialRarity.SUPERRARE) return 5;
		else if(rarity == MaterialRarity.ULTRARARE) return 2;
		else throw new IllegalArgumentException();
	}
	
	public static int getBaseRarity(ItemMaterial item) {
		if(item.getType() == MaterialType.PUREGEM) return intValueOfRarity(item.getRarity())/4;
		else if(item.getType() == MaterialType.GEM) return intValueOfRarity(item.getRarity())/3;
		else if(item.getType() == MaterialType.ALLOY) return intValueOfRarity(item.getRarity())/2;
		else if(item.getType() == MaterialType.NUGGET) return intValueOfRarity(item.getRarity())*2;
		else return intValueOfRarity(item.getRarity());
	}

	public static String getPrefixFromType(MaterialType type) {
		if(type == MaterialType.ALLOY || type == MaterialType.INGOT) return "ingot";
		else if(type == MaterialType.GEM) return "gem";
		else if(type == MaterialType.PUREGEM) return "gemPure";
		else if(type == MaterialType.CLUSTER) return "cluster";
		else if(type == MaterialType.CUTGEM) return "gemCut";
		else if(type == MaterialType.DUST) return "dust";
		else if(type == MaterialType.MISC) return "misc";
		else if(type == MaterialType.PLATE) return "plate";
		else if(type == MaterialType.SHARD) return "shard";
		else if(type == MaterialType.NUGGET) return "nugget";
		else return null;
	}
}
