package omgimalexis.allthethings.init;

import omgimalexis.allthethings.item.ItemBasicAxe;
import omgimalexis.allthethings.item.ItemBasicHoe;
import omgimalexis.allthethings.item.ItemBasicPickaxe;
import omgimalexis.allthethings.item.ItemBasicShovel;
import omgimalexis.allthethings.item.ItemBasicSword;
import omgimalexis.allthethings.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {
	public static final ToolMaterial ONYX = EnumHelper.addToolMaterial("ONYX", 4, 2437, 10.0F, 3.5F, 12);
	public static final ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 574, 8.0F, 2.5F, 13);
	public static final ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 574, 8.0F, 2.5F, 13);
	public static final ToolMaterial AMBER = EnumHelper.addToolMaterial("AMBER", 2, 792, 8.0F, 2.5F, 14);
	public static final ToolMaterial JADE = EnumHelper.addToolMaterial("JADE", 3, 1376, 7.0F, 3.5F, 12);
	public static final ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 3, 1574, 8.0F, 2.5F, 13);
	public static final ToolMaterial CITRINE = EnumHelper.addToolMaterial("CITRINE", 4, 1974, 9.0F, 3.5F, 13);
	public static final ToolMaterial CARNELIAN = EnumHelper.addToolMaterial("CARNELIAN", 4, 1848, 8.5F, 3.0F, 17);
	public static final ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 642, 4.0F, 2.0F, 25);
	
	public static final ItemBasicAxe onyxAxe = new ItemBasicAxe(ONYX, "onyx");
	public static final ItemBasicPickaxe onyxPickaxe = new ItemBasicPickaxe(ONYX, "onyx");
	public static final ItemBasicShovel onyxShovel = new ItemBasicShovel(ONYX, "onyx");
	public static final ItemBasicHoe onyxHoe = new ItemBasicHoe(ONYX, "onyx");
	public static final ItemBasicSword onyxSword = new ItemBasicSword(ONYX, "onyx");
	
	public static final ItemBasicAxe rubyAxe = new ItemBasicAxe(RUBY, "ruby");
	public static final ItemBasicPickaxe rubyPickaxe = new ItemBasicPickaxe(RUBY, "ruby");
	public static final ItemBasicShovel rubyShovel = new ItemBasicShovel(RUBY, "ruby");
	public static final ItemBasicHoe rubyHoe = new ItemBasicHoe(RUBY, "ruby");
	public static final ItemBasicSword rubySword = new ItemBasicSword(RUBY, "ruby");
	
	public static void init() {
		GameRegistry.registerItem(onyxAxe, "onyxAxe");
		GameRegistry.registerItem(onyxPickaxe, "onyxPickaxe");
		GameRegistry.registerItem(onyxShovel, "onyxShovel");
		GameRegistry.registerItem(onyxHoe, "onyxHoe");
		GameRegistry.registerItem(onyxSword, "onyxSword");
		
		GameRegistry.registerItem(rubyAxe, "rubyAxe");
		GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
		GameRegistry.registerItem(rubyShovel, "rubyShovel");
		GameRegistry.registerItem(rubyHoe, "rubyHoe");
		GameRegistry.registerItem(rubySword, "rubySword");
		
		LogHelper.info("Tools initialised successfully!");
	}
}