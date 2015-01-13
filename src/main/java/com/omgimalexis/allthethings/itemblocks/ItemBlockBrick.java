package com.omgimalexis.allthethings.itemblocks;

import com.omgimalexis.allthethings.block.BlockBricks;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockBrick extends ItemBlockWithMetadata {
	
	public ItemBlockBrick(Block block) {
		super(block, block);
	}
	
	public IIcon[] icons = new IIcon[16];
	
	@Override
	public void registerIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(Reference.MOD_ID + ":paintbrushWhite");
		this.icons[1] = reg.registerIcon(Reference.MOD_ID + ":paintbrushOrange");
		this.icons[2] = reg.registerIcon(Reference.MOD_ID + ":paintbrushMagenta");
		this.icons[3] = reg.registerIcon(Reference.MOD_ID + ":paintbrushLightBlue");
		this.icons[4] = reg.registerIcon(Reference.MOD_ID + ":paintbrushYellow");
		this.icons[5] = reg.registerIcon(Reference.MOD_ID + ":paintbrushLime");
		this.icons[6] = reg.registerIcon(Reference.MOD_ID + ":paintbrushPink");
		this.icons[7] = reg.registerIcon(Reference.MOD_ID + ":paintbrushGrey");
		this.icons[8] = reg.registerIcon(Reference.MOD_ID + ":paintbrushLightGrey");
		this.icons[9] = reg.registerIcon(Reference.MOD_ID + ":paintbrushCyan");
		this.icons[10] = reg.registerIcon(Reference.MOD_ID + ":paintbrushPurple");
		this.icons[11] = reg.registerIcon(Reference.MOD_ID + ":paintbrushBlue");
		this.icons[12] = reg.registerIcon(Reference.MOD_ID + ":paintbrushBrown");
		this.icons[13] = reg.registerIcon(Reference.MOD_ID + ":paintbrushGreen");
		this.icons[14] = reg.registerIcon(Reference.MOD_ID + ":paintbrushRed");
		this.icons[15] = reg.registerIcon(Reference.MOD_ID + ":paintbrushBlack");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta > 15) meta = 0;
		
		return this.icons[meta];
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch(stack.getItemDamage()) {
		case 0:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[0]));
		case 1:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[1]));
		case 2:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[2]));
		case 3:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[3]));
		case 4:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[4]));
		case 5:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[5]));
		case 6:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[6]));
		case 7:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[7]));
		case 8:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[8]));
		case 9:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[9]));
		case 10:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[10]));
		case 11:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[11]));
		case 12:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[12]));
		case 13:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[13]));
		case 14:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[14]));
		case 15:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(Strings.brickNames[15]));
		default:
			return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		}
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
