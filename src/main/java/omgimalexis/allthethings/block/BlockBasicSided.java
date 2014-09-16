//None of this is working, just ignore it.

package omgimalexis.allthethings.block;

import java.util.Random;

import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.utility.UtilityCheck;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicSided extends BlockBasic {
	private boolean front;
	private boolean left;
	private boolean right;
	private boolean back;
	private boolean top;
	private boolean bottom;
	
	public BlockBasicSided(String name, Material material, CreativeTabs tab, int harvest, int hard, boolean front, boolean left, boolean right, boolean back, boolean top, boolean bottom) {
		super(name, material, tab, harvest, hard);
		this.front = front;
		this.left = left;
		this.right = right;
		this.back = back;
		this.top = top;
		this.bottom = bottom;
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@SideOnly(Side.CLIENT)
	public static IIcon frontIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon leftIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon rightIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon backIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		frontIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Front");
		leftIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Left");
		rightIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Right");
		backIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Back");
		topIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Top");
		bottomIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Bottom");
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getTopIcon(int meta) {
		if(top) return topIcon;
		else return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getLeftIcon(int meta) {
		if(left) return leftIcon;
		else return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getRightIcon(int meta) {
		if(right) return rightIcon;
		else return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getFrontIcon(int meta) {
		if(front) return frontIcon;
		else return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getBackIcon(int meta) {
		if(back) return backIcon;
		else return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getBottomIcon(int meta) {
		if(bottom) return bottomIcon;
		else return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
    /**public IIcon getIcon(int side, int meta) {
        int k = meta & 12;
        int l = meta & 3;
        return k == 0 && (side == 1 || side == 0) ? this.getTopIcon(l) : (k == 4 && (side == 5 || side == 4) ? this.getTopIcon(l) : (k == 8 && (side == 2 || side == 3) ? this.getTopIcon(l) : this.getFrontIcon(l)));
    }**/
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if(side == 0 && this.bottom) return getBottomIcon(meta);
		else if(side == 1 && this.top) return getTopIcon(meta);
		if(side == 2 && this.front) return getFrontIcon(meta);
		else if(side == 3 && this.back) return getBackIcon(meta);
		if(side == 4 && this.left) return getLeftIcon(meta);
		else if(side == 5 && this.right) return getRightIcon(meta);
		else return blockIcon;
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	@Override
	public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
	    return UtilityCheck.isBlockBeaconBase(this);
	}
	
	public int getRenderType() {
		return 31;
	}
}