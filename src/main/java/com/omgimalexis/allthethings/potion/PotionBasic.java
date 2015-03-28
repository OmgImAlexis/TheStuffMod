package com.omgimalexis.allthethings.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

import com.omgimalexis.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PotionBasic extends Potion{
	private static final ResourceLocation icons = new ResourceLocation(Reference.MOD_ID,"/textures/gui/effects.png");
	
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
