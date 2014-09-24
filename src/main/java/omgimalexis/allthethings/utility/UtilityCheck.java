package omgimalexis.allthethings.utility;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UtilityCheck {
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
		if (block == ModBlocks.blockAmber) {return true;}
		else if (block == ModBlocks.blockAmethyst) {return true;}
		else if (block == ModBlocks.blockCarnelian) {return true;}
		else if (block == ModBlocks.blockCitrine) {return true;}
		else if (block == ModBlocks.blockJade) {return true;}
		else if (block == ModBlocks.blockOnyx) {return true;}
		else if (block == ModBlocks.blockRuby) {return true;}
		else if (block == ModBlocks.blockSapphire) {return true;}
		else if (block == ModBlocks.blockTopaz) {return true;}
		else if (block == ModBlocks.blockVoidium) {return true;}
		else if (block == ModBlocks.blockFyrestone) {return true;}
		else if (block == ModBlocks.blockDiamondGem) {return true;}
		else if (block == ModBlocks.blockNetherQuartzGem) {return true;}
		else if (block == ModBlocks.blockAquamarine) {return true;}
		else if (block == ModBlocks.blockAmazonite) {return true;}
		else if (block == ModBlocks.blockGarnet) {return true;}
		else if (block == ModBlocks.blockKunzite) {return true;}
		else if (block == ModBlocks.blockTin) {return true;}
		else if (block == ModBlocks.blockCopper) {return true;}
		else if (block == ModBlocks.blockSilver) {return true;}
		else if (block == ModBlocks.blockLead) {return true;}
		else if (block == ModBlocks.blockPlatinum) {return true;}
		else if (block == ModBlocks.blockZinc) {return true;}
		else if (block == ModBlocks.blockAluminium) {return true;}
		else if (block == ModBlocks.blockTitanium) {return true;}
		else if (block == ModBlocks.blockIridium) {return true;}
		else if (block == ModBlocks.blockUranium) {return true;}
		else if (block == ModBlocks.blockBronze) {return true;}
		else if (block == ModBlocks.blockSteel) {return true;}
		else if (block == ModBlocks.blockElectrum) {return true;}
		else if (block == ModBlocks.blockBrass) {return true;}
		else if (block == ModBlocks.blockMalagnite) {return true;}
		else if (block == ModBlocks.blockTrytementium) {return true;}
		else if (block == ModBlocks.blockUnobtanium) {return true;}
		else if (block == ModBlocks.blockPlutonium) {return true;}
		else if (block == ModBlocks.blockSolder) {return true;}
		else if (block == ModBlocks.blockInvar) {return true;}
		else if (block == ModBlocks.blockNickel) {return true;}
		else if (block == ModBlocks.blockChromium) {return true;}
		else if (block == ModBlocks.blockCobalt) {return true;}
		else if (block == ModBlocks.blockTungsten) {return true;}
		else if (block == ModBlocks.blockRhodium) {return true;}
		else if (block == ModBlocks.blockGoloid) {return true;}
		else if (block == ModBlocks.blockManganese) {return true;}
		else if (block == ModBlocks.blockSilicon) {return true;}
		else {return false;}
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
}
