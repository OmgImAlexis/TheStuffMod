package com.shnupbups.allthethings.item;

import com.google.common.collect.Multimap;
import com.shnupbups.allthethings.block.BlockColoured;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class ItemPaintbrush extends ItemBasic {
	public ItemPaintbrush(String name, CreativeTabs tab, int stackSize) {
		super(name, tab, stackSize, "Temporary Recipe, will change next PR.");
		this.setHasSubtypes(true);
	}
	
	public IIcon[] icons = new IIcon[2];

	@Override
	public void registerIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(Reference.MOD_ID + ":paintbrush");
		this.icons[1] = reg.registerIcon(Reference.MOD_ID + ":paintbrushPaint");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamageForRenderPass(int meta, int pass) {
		return pass == 0 ? icons[0] : icons[1];
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 16; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return Reference.MOD_ID + ":paintbrushWhite";
		case 1:
			return Reference.MOD_ID + ":paintbrushOrange";
		case 2:
			return Reference.MOD_ID + ":paintbrushMagenta";
		case 3:
			return Reference.MOD_ID + ":paintbrushLightBlue";
		case 4:
			return Reference.MOD_ID + ":paintbrushYellow";
		case 5:
			return Reference.MOD_ID + ":paintbrushLime";
		case 6:
			return Reference.MOD_ID + ":paintbrushPink";
		case 7:
			return Reference.MOD_ID + ":paintbrushGrey";
		case 8:
			return Reference.MOD_ID + ":paintbrushLightGrey";
		case 9:
			return Reference.MOD_ID + ":paintbrushCyan";
		case 10:
			return Reference.MOD_ID + ":paintbrushPurple";
		case 11:
			return Reference.MOD_ID + ":paintbrushBlue";
		case 12:
			return Reference.MOD_ID + ":paintbrushBrown";
		case 13:
			return Reference.MOD_ID + ":paintbrushGreen";
		case 14:
			return Reference.MOD_ID + ":paintbrushRed";
		case 15:
			return Reference.MOD_ID + ":paintbrushBlack";
		default:
			return this.getUnlocalizedName();
		}
	}
	
	
	@Override
	public Multimap getAttributeModifiers(ItemStack stack){
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 1.0F, 0));
        return multimap;
    }
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack){
        return new ItemStack(ModItems.paintbrush);
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
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float textureX, float textureY, float textureZ) {
    	if(!world.isRemote) {
    		if(world.getBlock(x, y, z) instanceof BlockColoured || world.getBlock(x, y, z) instanceof BlockColored || world.getBlock(x, y, z) instanceof BlockStainedGlass || world.getBlock(x, y, z) instanceof BlockStainedGlassPane) {
    			if(world.getBlockMetadata(x, y, z) != this.getDamage(itemstack)) {
    				world.setBlockMetadataWithNotify(x, y, z, this.getDamage(itemstack), 2);
    				player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getContainerItem(itemstack));
        			return true;
    			} else return false;
    		} else if(world.getBlock(x, y, z) instanceof BlockHardenedClay) {
    			world.setBlock(x, y, z, Blocks.stained_hardened_clay, this.getDamage(itemstack), 2);
    			player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getContainerItem(itemstack));
    			return true;
    		} else if(world.getBlock(x, y, z) instanceof BlockGlass) {
    			world.setBlock(x, y, z, Blocks.stained_glass, this.getDamage(itemstack), 2);
    			player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getContainerItem(itemstack));
    			return true;
    		} else if(world.getBlock(x, y, z) == Blocks.glass_pane) {
    			world.setBlock(x, y, z, Blocks.stained_glass_pane, this.getDamage(itemstack), 2);
    			player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getContainerItem(itemstack));
    			return true;
    		} else if(world.getBlock(x, y, z) instanceof BlockWood || UtilityCheck.isOreDictMatch(new ItemStack(world.getBlock(x, y, z)), "plankWood")) {
    			world.setBlock(x, y, z, ModBlocks.woodColoured, this.getDamage(itemstack), 2);
    			player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getContainerItem(itemstack));
    			return true;
    		} else if(world.getBlock(x, y, z) == Blocks.brick_block) {
    			world.setBlock(x, y, z, ModBlocks.brickColoured, this.getDamage(itemstack), 2);
    			player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getContainerItem(itemstack));
    			return true;
    		}
    	}
    	return false;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		if(pass == 1) {
			return UtilityCheck.getColourForMeta(stack.getItemDamage());
		} return super.getColorFromItemStack(stack, pass);
	}
}
