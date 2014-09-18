package omgimalexis.allthethings.init;

import omgimalexis.allthethings.item.ItemBasicArmour;
import omgimalexis.allthethings.main.ClientProxy;
import omgimalexis.allthethings.utility.LogHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModArmour {
	public static ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", 20, new int[]{3, 7, 5, 2}, 13);
	public static ArmorMaterial ONYX = EnumHelper.addArmorMaterial("ONYX", 45, new int[]{4, 9, 6, 4}, 17);
	
	public static final ItemBasicArmour helmetRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 0, "rubyHelmet");
	public static final ItemBasicArmour chestplateRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 1, "rubyChestplate");
	public static final ItemBasicArmour leggingsRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 2, "rubyLeggings");
	public static final ItemBasicArmour bootsRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 3, "rubyBoots");
	public static final ItemBasicArmour helmetOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 0, "onyxHelmet");
	public static final ItemBasicArmour chestplateOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 1, "onyxChestplate");
	public static final ItemBasicArmour leggingsOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 2, "onyxLeggings");
	public static final ItemBasicArmour bootsOnyx = new ItemBasicArmour(ONYX, ClientProxy.addArmour("onyx"), 3, "onyxBoots");
	
	public static void init() {
		GameRegistry.registerItem(helmetRuby, "rubyHelmet");
		GameRegistry.registerItem(chestplateRuby, "rubyChestplate");
		GameRegistry.registerItem(leggingsRuby, "rubyLeggings");
		GameRegistry.registerItem(bootsRuby, "rubyBoots");
		GameRegistry.registerItem(helmetOnyx, "onyxHelmet");
		GameRegistry.registerItem(chestplateOnyx, "onyxChestplate");
		GameRegistry.registerItem(leggingsOnyx, "onyxLeggings");
		GameRegistry.registerItem(bootsOnyx, "onyxBoots");
		
		LogHelper.info("Armour initialized successfully!");
	}
}