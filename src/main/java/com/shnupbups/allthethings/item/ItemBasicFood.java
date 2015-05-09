package com.shnupbups.allthethings.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasicFood extends ItemFood {

	public boolean drink = false;
	
	public ItemBasicFood(String name, CreativeTabs tab, int stackSize, int heal, float saturation, boolean dogFood, boolean drink) {
		super(heal, saturation, dogFood);
		this.setUnlocalizedName(name);
		this.maxStackSize = stackSize;
		this.setCreativeTab(tab);
		Reference.incrementItems();
		this.drink = drink;
	}
	
	public ItemBasicFood(String name, CreativeTabs tab, int heal, float saturation, boolean dogFood) {
		this(name, tab, 64, heal, saturation, dogFood, false);
	}
	
	public ItemBasicFood(String name, CreativeTabs tab, int stackSize, int heal, float saturation, boolean dogFood) {
		this(name, tab, stackSize, heal, saturation, dogFood, false);
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
	
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
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
        if(this == ModItems.rawGrawquat || this == ModItems.cookedGrawquat) {
        	player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 2000, 5));
        	if(this == ModItems.rawGrawquat) {
        		player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), 2000, 5));
        	}
        }
        
		if(this == ModItems.appleJuice || this == ModItems.lemonJuice || this == ModItems.lemonade || this == ModItems.bananaSmoothie) return new ItemStack(Items.glass_bottle);
		else if(this == ModItems.vegetableStew || this == ModItems.shellSoup) return new ItemStack(Items.bowl);
		else if(this == ModItems.strawberryJam) return new ItemStack(ModItems.glassJar);
		else return stack;
	}
}
