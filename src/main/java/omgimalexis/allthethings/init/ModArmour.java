package omgimalexis.allthethings.init;

import omgimalexis.allthethings.item.ItemBasicArmour;
import omgimalexis.allthethings.main.ClientProxy;
import omgimalexis.allthethings.utility.LogHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModArmour {
	public static ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", 20, new int[]{3, 7, 5, 2}, 13);
	
	public static final ItemBasicArmour helmetRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 0, "rubyHelmet");
	public static final ItemBasicArmour chestplateRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 1, "rubyChestplate");
	public static final ItemBasicArmour leggingsRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 2, "rubyLeggings");
	public static final ItemBasicArmour bootsRuby = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 3, "rubyBoots");
	
	public static void init() {
		GameRegistry.registerItem(helmetRuby, "rubyHelmet");
		GameRegistry.registerItem(chestplateRuby, "rubyChestplate");
		GameRegistry.registerItem(leggingsRuby, "rubyLeggings");
		GameRegistry.registerItem(bootsRuby, "rubyBoots");
		
		LogHelper.info("Armour initialized successfully!");
	}
}