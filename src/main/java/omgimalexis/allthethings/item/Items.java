package omgimalexis.allthethings.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import omgimalexis.allthethings.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items extends net.minecraft.init.Items {

	public static void mainRegistry() {
		initialiseItem();
		registerItem();
	}

	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);

	public static ArmorMaterial tutArmorMaterial = EnumHelper.addArmorMaterial("Tutorial Armor Material", 33, new int[] { 2, 5, 4, 2 }, 10);

	// Tools
	public static Item ruby_pickaxe;
	public static Item ruby_axe;
	public static Item riny_sword;
	public static Item ruby_hoe;
	public static Item ruby_spade;
	public static Item sapphire_pickaxe;
	public static Item sapphire_axe;
	public static Item sapphire_sword;
	public static Item sapphire_hoe;
	public static Item sapphire_spade;

	// Weapons/Armour
	public static Item ruby_helmet;
	public static Item ruby_plate;
	public static Item ruby_pants;
	public static Item ruby_boots;
	public static Item sapphire_helmet;
	public static Item sapphire_plate;
	public static Item sapphire_pants;
	public static Item sapphire_boots;

	// Ingots
	public static Item adamantIngot;
	public static Item blueriteIngot;
	public static Item bronzeIngot;
	public static Item lunarIngot;
	public static Item mithrilIngot;
	public static Item runiteIngot;
	public static Item silverIngot;
	public static Item steelIngot;

	// Dusts
	public static Item adamaniteDust;
	public static Item blueriteDust;
	public static Item bronzeDust;
	public static Item coalDust;
	public static Item copperDust;
	public static Item daeyaltDust;
	public static Item diamondDust;
	public static Item goldDust;
	public static Item ironDust;
	public static Item lunarDust;
	public static Item mithrilDust;
	public static Item rubyDust;
	public static Item runiteDust;
	public static Item sapphireDust;
	public static Item silverDust;
	public static Item steelDust;
	public static Item tinDust;

	// Others
	public static Item opal;
	public static Item rubyGem;

	public static void initialiseItem() {

		// Tools
		ruby_axe = new ItemAxe(tutMaterial).setUnlocalizedName("ruby_axe");
		ruby_hoe = new ItemHoe(tutMaterial).setUnlocalizedName("ruby_hoe");
		ruby_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName("ruby_pickaxe");
		ruby_spade = new ItemSpade(tutMaterial).setUnlocalizedName("ruby_spade");
		sapphire_axe = new ItemAxe(tutMaterial).setUnlocalizedName("sapphire_axe");
		sapphire_hoe = new ItemHoe(tutMaterial).setUnlocalizedName("sapphire_hoe");
		sapphire_pickaxe = new ItemPickaxe(tutMaterial).setUnlocalizedName("sapphire_pickaxe");
		sapphire_spade = new ItemSpade(tutMaterial).setUnlocalizedName("sapphire_spade");

		// Weapons/Armour
//		ruby_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_boots.getUnlocalizedName()), 0).setUnlocalizedName("ruby_boots");
//		ruby_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_helmet.getUnlocalizedName()), 0).setUnlocalizedName("ruby_helmet");
//		ruby_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_pants.getUnlocalizedName()), 0).setUnlocalizedName("ruby_pants");
//		ruby_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(ruby_plate.getUnlocalizedName()), 0).setUnlocalizedName("ruby_plate");
//		sapphire_boots = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_boots.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_boots");
//		sapphire_helmet = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_helmet.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_helmet");
//		sapphire_pants = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_pants.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_pants");
//		sapphire_plate = new ItemArmor(tutArmorMaterial, MainRegistry.proxy.addArmor(sapphire_plate.getUnlocalizedName()), 0).setUnlocalizedName("sapphire_plate");

		// Items

	}

	public static void registerItem() {
		GameRegistry.registerItem(ruby_axe, ruby_axe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_hoe, ruby_hoe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_pickaxe, ruby_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(ruby_spade, ruby_spade.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_axe, sapphire_axe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_hoe, sapphire_hoe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_pickaxe, sapphire_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(sapphire_spade, sapphire_spade.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_boots, ruby_boots.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_helmet, ruby_helmet.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_pants, ruby_pants.getUnlocalizedName());
//		GameRegistry.registerItem(ruby_plate, ruby_plate.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_boots, sapphire_boots.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_helmet, sapphire_helmet.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_pants, sapphire_pants.getUnlocalizedName());
//		GameRegistry.registerItem(sapphire_plate, sapphire_plate.getUnlocalizedName());
	}

}
