package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.item.ItemBasicArmour;
import com.shnupbups.allthethings.itemblocks.ItemBlockShell;
import com.shnupbups.allthethings.main.ClientProxy;
import com.shnupbups.allthethings.main.CommonProxy;
import com.shnupbups.allthethings.utility.LogHelper;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModArmour {
	/** Name, Durability (base), Damage Reduction amounts, Enchantability
	 *  CLOTH(5, new int[]{1, 3, 2, 1}, 15),
        CHAIN(15, new int[]{2, 5, 4, 1}, 12),
        IRON(15, new int[]{2, 6, 5, 2}, 9),
        GOLD(7, new int[]{2, 5, 3, 1}, 25),
        DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */
	
	// Tier 1
	public static ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", 20, new int[]{3, 7, 5, 2}, 13);
	public static ArmorMaterial SAPPHIRE = EnumHelper.addArmorMaterial("SAPPHIRE", 25, new int[]{3, 7, 5, 2}, 10);
	public static ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALD", 25, new int[]{3, 6, 4, 2}, 13);
	
	// Tier 2
	public static ArmorMaterial AMBER = EnumHelper.addArmorMaterial("AMBER", 25, new int[]{3, 8, 5, 3}, 15);
	
	// Tier 3
	public static ArmorMaterial KUNZITE = EnumHelper.addArmorMaterial("KUNZITE", 30, new int[]{3, 8, 5, 3}, 15);
	public static ArmorMaterial AMAZONITE = EnumHelper.addArmorMaterial("AMAZONITE", 30, new int[]{3, 8, 5, 3}, 20);
	
	// Tier 4
	public static ArmorMaterial ONYX = EnumHelper.addArmorMaterial("ONYX", 45, new int[]{4, 9, 6, 4}, 17);
	
	// Tier 5
	public static ArmorMaterial TRYTEMENTIUM = EnumHelper.addArmorMaterial("TRYTEMENTIUM", 10, new int[]{5, 9, 7, 4}, 50);
	
	// Misc
	public static ArmorMaterial SHELL = EnumHelper.addArmorMaterial("SHELL", 5, new int[]{0, 2, 0, 0}, 0);
	public static ArmorMaterial BANDAGE = EnumHelper.addArmorMaterial("BANDAGE", 3, new int[]{1, 3, 2, 1}, 0);
	
	public static final ItemBasicArmour helmetRuby = new ItemBasicArmour(RUBY, 0, "rubyHelmet");
	public static final ItemBasicArmour chestplateRuby = new ItemBasicArmour(RUBY, 1, "rubyChestplate");
	public static final ItemBasicArmour leggingsRuby = new ItemBasicArmour(RUBY, 2, "rubyLeggings");
	public static final ItemBasicArmour bootsRuby = new ItemBasicArmour(RUBY, 3, "rubyBoots");
	public static final ItemBasicArmour helmetOnyx = new ItemBasicArmour(ONYX, 0, "onyxHelmet");
	public static final ItemBasicArmour chestplateOnyx = new ItemBasicArmour(ONYX, 1, "onyxChestplate");
	public static final ItemBasicArmour leggingsOnyx = new ItemBasicArmour(ONYX, 2, "onyxLeggings");
	public static final ItemBasicArmour bootsOnyx = new ItemBasicArmour(ONYX, 3, "onyxBoots");
	public static final ItemBasicArmour helmetKunzite = new ItemBasicArmour(KUNZITE, 0, "kunziteHelmet");
	public static final ItemBasicArmour chestplateKunzite = new ItemBasicArmour(KUNZITE, 1, "kunziteChestplate");
	public static final ItemBasicArmour leggingsKunzite = new ItemBasicArmour(KUNZITE, 2, "kunziteLeggings");
	public static final ItemBasicArmour bootsKunzite = new ItemBasicArmour(KUNZITE, 3, "kunziteBoots");
	public static final ItemBasicArmour helmetTrytementium = new ItemBasicArmour(TRYTEMENTIUM, 0, "trytementiumHelmet");
	public static final ItemBasicArmour chestplateTrytementium = new ItemBasicArmour(TRYTEMENTIUM, 1, "trytementiumChestplate");
	public static final ItemBasicArmour leggingsTrytementium = new ItemBasicArmour(TRYTEMENTIUM, 2, "trytementiumLeggings");
	public static final ItemBasicArmour bootsTrytementium = new ItemBasicArmour(TRYTEMENTIUM, 3, "trytementiumBoots");
	
	public static final ItemBasicArmour helmetBandage = new ItemBasicArmour(BANDAGE, 0, "bandageHelmet");
	public static final ItemBasicArmour chestplateBandage = new ItemBasicArmour(BANDAGE, 1, "bandageChestplate");
	public static final ItemBasicArmour leggingsBandage = new ItemBasicArmour(BANDAGE, 2, "bandageLeggings");
	public static final ItemBasicArmour bootsBandage = new ItemBasicArmour(BANDAGE, 3, "bandageBoots");
	
	public static final ItemBlockShell shell = new ItemBlockShell(ModBlocks.shell, SHELL, 1);
	
	public static void init() {
		RUBY.customCraftingMaterial = ModItems.gemRuby;
		ONYX.customCraftingMaterial = ModItems.gemOnyx;
		TRYTEMENTIUM.customCraftingMaterial = ModItems.trytementium;
		BANDAGE.customCraftingMaterial = ModItems.bandage;
		
		GameRegistry.registerItem(helmetRuby, "rubyHelmet");
		GameRegistry.registerItem(chestplateRuby, "rubyChestplate");
		GameRegistry.registerItem(leggingsRuby, "rubyLeggings");
		GameRegistry.registerItem(bootsRuby, "rubyBoots");
		GameRegistry.registerItem(helmetOnyx, "onyxHelmet");
		GameRegistry.registerItem(chestplateOnyx, "onyxChestplate");
		GameRegistry.registerItem(leggingsOnyx, "onyxLeggings");
		GameRegistry.registerItem(bootsOnyx, "onyxBoots");
		GameRegistry.registerItem(helmetKunzite, "kunziteHelmet");
		GameRegistry.registerItem(chestplateKunzite, "kunziteChestplate");
		GameRegistry.registerItem(leggingsKunzite, "kunziteLeggings");
		GameRegistry.registerItem(bootsKunzite, "kunziteBoots");
		GameRegistry.registerItem(helmetTrytementium, "trytementiumHelmet");
		GameRegistry.registerItem(chestplateTrytementium, "trytementiumChestplate");
		GameRegistry.registerItem(leggingsTrytementium, "trytementiumLeggings");
		GameRegistry.registerItem(bootsTrytementium, "trytementiumBoots");
		
		GameRegistry.registerItem(helmetBandage, helmetBandage.getUnlocalizedName());
		GameRegistry.registerItem(chestplateBandage, chestplateBandage.getUnlocalizedName());
		GameRegistry.registerItem(leggingsBandage, leggingsBandage.getUnlocalizedName());
		GameRegistry.registerItem(bootsBandage, bootsBandage.getUnlocalizedName());
		
		GameRegistry.registerItem(shell, "shellItem");
		
		LogHelper.info("Armour initialized successfully!");
	}
}