package omgimalexis.allthethings.item;

import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasic extends Item {
	public ItemBasic() {
		super();
		this.maxStackSize = 64;
		this.setCreativeTab(TMCreativeTabs.tabMisc);
		this.setNoRepair();
	}
	
	public ItemBasic(String name, CreativeTabs tab, int stackSize) {
		this();
		this.setUnlocalizedName(name);
		this.maxStackSize = stackSize;
		this.setCreativeTab(tab);
	}
	
	public ItemBasic(String name, CreativeTabs tab) {
		this(name, tab, 64);
	}
	
	public ItemBasic(String name, int stackSize) {
		this(name, TMCreativeTabs.tabMisc, stackSize);
	}
	
	public ItemBasic(String name) {
		this(name, TMCreativeTabs.tabMisc);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	/**
	 * Makes Fyrestone set the player on Fire
	 * 
	 **/
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
		if(this == ModItems.fyrestone) {entity.setFire(3);}
	}
}