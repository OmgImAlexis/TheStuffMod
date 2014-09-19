package omgimalexis.allthethings.item;

import omgimalexis.allthethings.creativetabs.TMCreativeTabs;
import omgimalexis.allthethings.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasicBucket extends ItemBucket {
	public ItemBasicBucket(Block fluid) {
		super(fluid);
		this.maxStackSize = 64;
		this.setCreativeTab(TMCreativeTabs.item);
		this.setNoRepair();
		this.setContainerItem(Items.bucket);
		Reference.incrementItems();
	}
	
	public ItemBasicBucket(Block fluid, String name, CreativeTabs tab, int stackSize) {
		this(fluid);
		this.setUnlocalizedName(name);
		this.maxStackSize = stackSize;
		this.setCreativeTab(tab);
	}
	
	public ItemBasicBucket(Block fluid, String name, CreativeTabs tab) {
		this(fluid, name, tab, 64);
	}
	
	public ItemBasicBucket(Block fluid, String name, int stackSize) {
		this(fluid, name, TMCreativeTabs.item, stackSize);
	}
	
	public ItemBasicBucket(Block fluid, String name) {
		this(fluid, name, TMCreativeTabs.item);
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