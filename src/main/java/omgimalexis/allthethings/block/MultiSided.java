package omgimalexis.allthethings.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import omgimalexis.allthethings.lib.Strings;

public class MultiSided extends Block {

	public IIcon Bottom;
	public IIcon Top;
	public IIcon Front;
	public IIcon Back;
	public IIcon Left;
	public IIcon Right;

	protected MultiSided(Material material) {
		super(material);
	}

	public void registerBlockIcons(IIconRegister icon) {
		Bottom = icon.registerIcon(Strings.MODID + ":Side0");
		Top = icon.registerIcon(Strings.MODID + ":Side1");
		Front = icon.registerIcon(Strings.MODID + ":Side2");
		Back = icon.registerIcon("gold_block");
		Left = icon.registerIcon("iron_block");
		Right = icon.registerIcon(Strings.MODID + ":Side5");
	}

	public IIcon getIcon(int side, int meta) {
		if (side == 0) {
			return Bottom;
		} else if (side == 1) {
			return Top;
		} else if (side == 2) {
			return Back;
		}
		return Left;
	}

}
