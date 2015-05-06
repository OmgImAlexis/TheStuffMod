package com.shnupbups.allthethings.item;

import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBasicSeedFood extends ItemSeedFood {

public boolean drink = false;
	
	public ItemBasicSeedFood(String name, CreativeTabs tab, int stackSize, int heal, float saturation, boolean drink, Block seed) {
		super(heal, saturation, seed, Blocks.farmland);
		this.setUnlocalizedName(name);
		this.maxStackSize = stackSize;
		this.setCreativeTab(tab);
		Reference.incrementItems();
		this.drink = drink;
	}
	
	public ItemBasicSeedFood(String name, CreativeTabs tab, int heal, float saturation, Block seed) {
		this(name, tab, 64, heal, saturation, false, seed);
	}
	
	public ItemBasicSeedFood(String name, CreativeTabs tab, int stackSize, int heal, float saturation, Block seed) {
		this(name, tab, stackSize, heal, saturation, false, seed);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	public EnumAction getItemUseAction(ItemStack p_77661_1_){
        if(drink) return EnumAction.drink;
        else return EnumAction.eat;
    }
	
	@Override
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
		--stack.stackSize;
        player.getFoodStats().func_151686_a(this, stack);
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, world, player);
		return stack;
	}

}
