package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.lib.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class ItemBanana extends ItemBasicFood {

	public ItemBanana(String name, CreativeTabs tab, int stackSize, int heal, float saturation) {
		super(name, tab, stackSize, heal, saturation, false, false);
	}
	
	public IIcon[] icons = new IIcon[3];

	@Override
	public void registerIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(Reference.MOD_ID + ":banana3");
		this.icons[1] = reg.registerIcon(Reference.MOD_ID + ":banana2");
		this.icons[2] = reg.registerIcon(Reference.MOD_ID + ":banana");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta > 2) meta = 0;
		
		return this.icons[meta];
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 3; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return Reference.MOD_ID + ":banana3";
		case 1:
			return Reference.MOD_ID + ":banana2";
		case 2:
			return Reference.MOD_ID + ":banana";
		default:
			return this.getUnlocalizedName();
		}
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack){
        if(this.getDamage(itemStack) == 2) {return new ItemStack(ModBlocks.bananaPeel, 1);}
        else if(this.getDamage(itemStack) == 1) {return new ItemStack(ModBlocks.bananaPeel, 2);}
        else return new ItemStack(ModBlocks.bananaPeel, 3);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack){
        return true;
    }
    
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
    	return false;
    }
    
    @Override
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
		--stack.stackSize;
        player.getFoodStats().func_151686_a(this, stack);
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, world, player);
        EntityItem entityitem = player.dropPlayerItemWithRandomChoice(new ItemStack(ModBlocks.bananaPeel), false);
        entityitem.delayBeforeCanPickup = 0;
		if(stack.getItemDamage() < 2) {
			return new ItemStack(stack.getItem(), 1, stack.getItemDamage()+1);
		} else return null;
	}
}
