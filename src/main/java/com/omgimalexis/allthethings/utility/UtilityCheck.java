package com.omgimalexis.allthethings.utility;

import java.util.LinkedList;

import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UtilityCheck {
	
	static LinkedList<Block> materialBlocks = new LinkedList<Block>();
	static LinkedList<Item> materials = new LinkedList<Item>();
	
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
			if (item == ModItems.gemPureAmber) {return true;}
			else if (item == ModItems.gemPureAmethyst) {return true;}
			else if (item == ModItems.gemPureCarnelian) {return true;}
			else if (item == ModItems.gemPureCitrine) {return true;}
			else if (item == ModItems.gemPureJade) {return true;}
			else if (item == ModItems.gemPureOnyx) {return true;}
			else if (item == ModItems.gemPureRuby) {return true;}
			else if (item == ModItems.gemPureSapphire) {return true;}
			else if (item == ModItems.gemPureVoidiumRadioactiveFocused) {return true;}
			else if (item == ModItems.gemPureDiamond) {return true;}
			else if (item == ModItems.gemPureEmerald) {return true;}
			else {return false;}
		}
		return false;
	}

	public static boolean isItemImpureGem(Item item) {
		if (item == ModItems.gemAmber) {return true;}
		else if (item == ModItems.gemAmethyst) {return true;}
		else if (item == ModItems.gemCarnelian) {return true;}
		else if (item == ModItems.gemCitrine) {return true;}
		else if (item == ModItems.gemJade) {return true;}
		else if (item == ModItems.gemOnyx) {return true;}
		else if (item == ModItems.gemRuby) {return true;}
		else if (item == ModItems.gemSapphire) {return true;}
		else if (item == ModItems.gemTopaz) {return true;}
		else if (item == ModItems.voidiumRadioactiveFocused) {return true;}
		else if (item == ModItems.fyrestoneGem) {return true;}
		else if (item == Items.diamond) {return true;}
		else if (item == Items.emerald) {return true;}
		else {return false;}
	}
	
	public static boolean isBlockBeaconBase(ItemStack itemstack) {
		if (itemstack.getItem() != null) {
			Block block  = Block.getBlockFromItem(itemstack.getItem());
			return isBlockBeaconBase(block);
		}
		return false;
	}
	
	public static boolean isBlockBeaconBase(Block block) {
		for(int i = 0; i < materialBlocks.size(); i++) {
			if(block == materialBlocks.get(i)) {return true;}
		}
		return false;
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
		for(int i = 0; i < materials.size(); i++) {
			if(item == materials.get(i)) return true;
		}
		return false;
	}
	
	public static Block addMaterialBlock(Block block) {
		materialBlocks.add(block);
		return block;
	}
	
	public static void removeMaterialBlock(Block block) {
		materialBlocks.remove(block);
	}

	public static Item addMaterial(Item item) {
		materials.add(item);
		return item;
	}
	
	public static void removeMaterial(Item item) {
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
}
