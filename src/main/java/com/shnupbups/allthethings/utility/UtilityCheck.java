package com.shnupbups.allthethings.utility;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModBlocksPreItems;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialType;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.LinkedList;

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
	
	public static boolean isOp(ICommandSender sender) {
		return (sender.canCommandSenderUseCommand(3, "gamemode") || !(sender instanceof EntityPlayer));
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
		} else if(material == Material.leaves || material == Material.grass || material == Material.plants) {
			return Block.soundTypeGrass;
		} else if(material == Material.wood) {
			return Block.soundTypeWood;
		}
		return Block.soundTypeStone;
	}

	public static Item getDrop(Block block) {
		if(block == ModBlocks.ustherite) return Item.getItemFromBlock(ModBlocks.cobbledUstherite);
		else if(block == ModBlocksPreItems.copperSign || block == ModBlocksPreItems.copperSignWall) return ModItems.copperSign;
		else if(block == ModBlocksPreItems.ironSign || block == ModBlocksPreItems.ironSignWall) return ModItems.ironSign;
		else if(block == ModBlocksPreItems.goldSign || block == ModBlocksPreItems.goldSignWall) return ModItems.goldSign;
		else if(block == ModBlocksPreItems.silverSign || block == ModBlocksPreItems.silverSignWall) return ModItems.silverSign;
		return null;
	}
	
	public static LinkedList getListOfMaterials() {
		return materials;
	}
	
	public static int getBaseRarity(ItemMaterial item) {
		if(item.getType() == MaterialType.PUREGEM) return item.getRarity().intValueOfRarity()/4;
		else if(item.getType() == MaterialType.GEM) return item.getRarity().intValueOfRarity()/3;
		else if(item.getType() == MaterialType.ALLOY || item.getType() == MaterialType.PLATE) return item.getRarity().intValueOfRarity()/2;
		else if(item.getType() == MaterialType.NUGGET) return item.getRarity().intValueOfRarity()*2;
		else return item.getRarity().intValueOfRarity();
	}
	
	public static boolean isOreDictMatch(ItemStack stack, String oreDict) {
		for(int i = 0; i < OreDictionary.getOres(oreDict).size(); i++) {
			if(OreDictionary.getOres(oreDict).get(i).getItem() == stack.getItem()) return true;
		}
		return false;
	}
}
