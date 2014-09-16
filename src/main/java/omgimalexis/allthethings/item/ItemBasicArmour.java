package omgimalexis.allthethings.item;

import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.init.ModArmour;
import omgimalexis.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBasicArmour extends ItemArmor{

	public ItemBasicArmour(ArmorMaterial material, int render, int type, String name) {
		super(material, render, type);
		this.setUnlocalizedName(name);
		this.setCreativeTab(TMCreativeTabs.tool);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ModArmour.rubyHelmet || stack.getItem() == ModArmour.rubyChestplate || stack.getItem() == ModArmour.rubyBoots) {
			return Reference.MOD_ID + ":textures/models/armor/rubyArmour1.png";
		} else if (stack.getItem() == ModArmour.rubyLeggings) {
			return Reference.MOD_ID + ":textures/models/armor/rubyArmour2.png";
		} else {
			return null;
		}
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
