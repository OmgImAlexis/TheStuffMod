package omgimalexis.allthethings.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import omgimalexis.allthethings.block.Blocks;

public class DarkMatterFurnaceRecipes {
	private static final DarkMatterFurnaceRecipes smeltingBase = new DarkMatterFurnaceRecipes();
	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private static final String __OBFID = "CL_00000085";

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static DarkMatterFurnaceRecipes smelting() {
		return smeltingBase;
	}

	private DarkMatterFurnaceRecipes() {
		this.addRecipie(Blocks.iron_block, new ItemStack(Blocks.compressed_iron_block), 1.0F);
		this.addRecipie(Blocks.gold_block, new ItemStack(Blocks.compressed_gold_block), 1.0F);
		this.addRecipie(Blocks.emerald_block, new ItemStack(Blocks.compressed_emerald_block), 1.0F);
		this.addRecipie(Blocks.ruby_block, new ItemStack(Blocks.compressed_ruby_block), 1.0F);
		this.addRecipie(Blocks.sapphire_block, new ItemStack(Blocks.compressed_sapphire_block), 1.0F);
		this.addRecipie(Blocks.diamond_block, new ItemStack(Blocks.compressed_diamond_block), 1.0F);
	}

	public void addRecipie(Block block, ItemStack itemStack, float experience) {
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