package omgimalexis.allthethings.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import omgimalexis.allthethings.init.ModBlocks;

public class CompressorRecipes {
	private static final CompressorRecipes smeltingBase = new CompressorRecipes();
	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private static final String __OBFID = "CL_00000085";

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static CompressorRecipes smelting() {
		return smeltingBase;
	}

	private CompressorRecipes() {
		this.addRecipe(Blocks.iron_block, new ItemStack(ModBlocks.compressedIronBlock), 1.0F);
		this.addRecipe(Blocks.gold_block, new ItemStack(ModBlocks.compressedGoldBlock), 1.0F);
		this.addRecipe(Blocks.emerald_block, new ItemStack(ModBlocks.compressedEmeraldBlock), 1.0F);
		this.addRecipe(ModBlocks.blockRuby, new ItemStack(ModBlocks.compressedRubyBlock), 1.0F);
		this.addRecipe(ModBlocks.blockSapphire, new ItemStack(ModBlocks.compressedSapphireBlock), 1.0F);
		this.addRecipe(Blocks.diamond_block, new ItemStack(ModBlocks.compressedDiamondBlock), 1.0F);
	}

	public void addRecipe(Block block, ItemStack itemStack, float experience) {
		this.addLists(Item.getItemFromBlock(block), itemStack, experience);
	}

	public void addLists(Item item, ItemStack itemStack, float experience) {
		this.putLists(new ItemStack(item, 1, 32767), itemStack, experience);
	}

	public void putLists(ItemStack itemStack, ItemStack itemStack2, float experience) {
		this.smeltingList.put(itemStack, itemStack2);
		this.experienceList.put(itemStack2, Float.valueOf(experience));
	}

	/**
	 * Returns the smelting result of an item.
	 */
	public ItemStack getSmeltingResult(ItemStack itemStack) {
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;

		do {
			if (!iterator.hasNext()) {
				return null;
			}

			entry = (Entry) iterator.next();
		} while (!this.canBeSmelted(itemStack, (ItemStack) entry.getKey()));

		return (ItemStack) entry.getValue();
	}

	private boolean canBeSmelted(ItemStack itemStack, ItemStack itemStack2) {
		return itemStack2.getItem() == itemStack.getItem() && (itemStack2.getItemDamage() == 32767 || itemStack2.getItemDamage() == itemStack.getItemDamage());
	}

	public Map getSmeltingList() {
		return this.smeltingList;
	}

	public float giveExperience(ItemStack itemStack) {
		float ret = itemStack.getItem().getSmeltingExperience(itemStack);
		if (ret != -1)
			return ret;

		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;

		do {
			if (!iterator.hasNext()) {
				return 0.0F;
			}

			entry = (Entry) iterator.next();
		} while (!this.canBeSmelted(itemStack, (ItemStack) entry.getKey()));

		return ((Float) entry.getValue()).floatValue();
	}
}