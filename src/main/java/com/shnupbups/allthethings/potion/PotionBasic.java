package com.shnupbups.allthethings.potion;

import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBasic extends Potion{
	private static final ResourceLocation icons = new ResourceLocation(Reference.MOD_ID,"/textures/gui/icons.png");
	
	public PotionBasic(int par1, boolean par2, int par3) {
		super(par1, par2, par3);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasStatusIcon() {
	    Minecraft.getMinecraft().renderEngine.bindTexture(icons);
	    return true;
	}
	
	public Potion setIconIndex(int par1, int par2) {
		super.setIconIndex(par1, par2);
		return this;
	}
}
