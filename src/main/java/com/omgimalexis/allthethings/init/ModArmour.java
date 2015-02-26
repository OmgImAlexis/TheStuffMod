package com.omgimalexis.allthethings.init;

import com.omgimalexis.allthethings.item.ItemBasicArmour;
import com.omgimalexis.allthethings.itemblocks.ItemBlockShell;
import com.omgimalexis.allthethings.main.ClientProxy;
import com.omgimalexis.allthethings.utility.LogHelper;

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
	public static ArmorMaterial TRYTEMENTIUM = EnumHelper.addArmorMaterial("TRYTEMENTIUM", 10, new int[]{7, 11, 9, 7}, 50);
	
	// Misc
	public static ArmorMaterial SHELL = EnumHelper.addArmorMaterial("SHELL", 3, new int[]{0, 2, 0, 0}, 0);
	
	public static final ItemBasicArmour helmetRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 0, "rubyHelmet");
	public static final ItemBasicArmour chestplateRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 1, "rubyChestplate");
	public static final ItemBasicArmour leggingsRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 2, "rubyLeggings");
	public static final ItemBasicArmour bootsRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 3, "rubyBoots");
	public static final ItemBasicArmour helmetOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 0, "onyxHelmet");
	public static final ItemBasicArmour chestplateOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 1, "onyxChestplate");
	public static final ItemBasicArmour leggingsOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 2, "onyxLeggings");
	public static final ItemBasicArmour bootsOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 3, "onyxBoots");
	public static final ItemBasicArmour helmetKunzite = new ItemBasicArmour(KUNZITE, ClientProxy.addArmour("kunzite"), 0, "kunziteHelmet");
	public static final ItemBasicArmour chestplateKunzite = new ItemBasicArmour(KUNZITE, ClientProxy.addArmour("kunzite"), 1, "kunziteChestplate");
	public static final ItemBasicArmour leggingsKunzite = new ItemBasicArmour(KUNZITE, ClientProxy.addArmour("kunzite"), 2, "kunziteLeggings");
	public static final ItemBasicArmour bootsKunzite = new ItemBasicArmour(KUNZITE, ClientProxy.addArmour("kunzite"), 3, "kunziteBoots");
	public static final ItemBasicArmour helmetTrytementium = new ItemBasicArmour(TRYTEMENTIUM, ClientProxy.addArmour("trytementium"), 0, "trytementiumHelmet");
	public static final ItemBasicArmour chestplateTrytementium = new ItemBasicArmour(TRYTEMENTIUM, ClientProxy.addArmour("trytementium"), 1, "trytementiumChestplate");
	public static final ItemBasicArmour leggingsTrytementium = new ItemBasicArmour(TRYTEMENTIUM, ClientProxy.addArmour("trytementium"), 2, "trytementiumLeggings");
	public static final ItemBasicArmour bootsTrytementium = new ItemBasicArmour(TRYTEMENTIUM, ClientProxy.addArmour("trytementium"), 3, "trytementiumBoots");
	
	public static final ItemBlockShell shell = new ItemBlockShell(ModBlocks.shell, SHELL, ClientProxy.addArmour("shell"), 1);
	
	public static void init() {
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
		
		GameRegistry.registerItem(shell, "shellItem");
		
		LogHelper.info("Armour initialized successfully!");
	}
}