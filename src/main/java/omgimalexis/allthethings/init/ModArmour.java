package omgimalexis.allthethings.init;

import omgimalexis.allthethings.item.ItemBasicArmour;
import omgimalexis.allthethings.main.ClientProxy;
import omgimalexis.allthethings.utility.LogHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModArmour {
	public static ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", 20, new int[]{3, 7, 5, 2}, 13);
	
	public static final ItemBasicArmour rubyHelmet = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 0, "rubyHelmet");
	public static final ItemBasicArmour rubyChestplate = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 1, "rubyChestplate");
	public static final ItemBasicArmour rubyLeggings = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 2, "rubyLeggings");
	public static final ItemBasicArmour rubyBoots = new ItemBasicArmour(RUBY, ClientProxy.addArmour("ruby"), 3, "rubyBoots");
	
	public static void init() {
		GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
		GameRegistry.registerItem(rubyChestplate, "rubyChestplate");
		GameRegistry.registerItem(rubyLeggings, "rubyLeggings");
		GameRegistry.registerItem(rubyBoots, "rubyBoots");
		
		LogHelper.info("Armour initialized successfully!");
	}
}