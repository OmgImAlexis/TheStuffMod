package com.shnupbups.allthethings.tileEntity.render;

import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelSign;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.shnupbups.allthethings.block.BlockBasicSign;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityRenderSign extends TileEntitySpecialRenderer {
	// This file completely replaces the vanilla one, because I don't use a
	// custom Tile Entity for my signs and each Tile Entity can only have
	// one Tile Entity Special Renderer assigned to it.
	// As such, I need handling for both my custom signs and the vanilla one.
	// Plus, because the sign editing GUI is only built with the vanilla sign
	// in mind, I have to have handling to make my custom signs render
	// properly in that GUI. AND I need even more handling because for some
	// ungodly reason, metadatas 2, 4 and 5 don't link the handling the other
	// metadatas use. All to add new bloody SIGNS to the game.
	// The stuff I do for this mod, seriously...
	private static final ResourceLocation vanillaSign=new ResourceLocation("textures/entity/sign.png");
	private final ModelSign field_147514_c=new ModelSign();
	private static final String __OBFID="CL_00000970";

	public void renderTileEntityAt(TileEntitySign p_147500_1_,double p_147500_2_,double p_147500_4_,double p_147500_6_,float p_147500_8_) {
		Block block=p_147500_1_.getBlockType();
		GL11.glPushMatrix();
		float f1=0.6666667F;
		float f3;
		if(block==Blocks.standing_sign||(block instanceof BlockBasicSign&&((BlockBasicSign)block).isStanding&&p_147500_1_.func_145914_a())) {
			// Is either a vanilla standing sign, or it's a custom standing sign that isn't being
			// edited.
			GL11.glTranslatef((float)p_147500_2_+0.5F,(float)p_147500_4_+0.75F*f1,(float)p_147500_6_+0.5F);
			float f2=(float)(p_147500_1_.getBlockMetadata()*360)/16.0F;
			GL11.glRotatef(-f2,0.0F,1.0F,0.0F);
			this.field_147514_c.signStick.showModel=true;
		} else if(block instanceof BlockBasicSign&&((BlockBasicSign)block).isStanding) {
			// Is a custom standing sign that IS being edited
			GL11.glTranslatef((float)p_147500_2_+0.5F,(float)p_147500_4_+0.75F*f1,(float)p_147500_6_+0.5F);
			// These metadatas don't like to play along, for some reason.
			if(p_147500_1_.getBlockMetadata()==5) {
				GL11.glRotatef(90,0.0F,1.0F,0.0F);
			} else if(p_147500_1_.getBlockMetadata()==4) {
				GL11.glRotatef(-90,0.0F,1.0F,0.0F);
			} else if(p_147500_1_.getBlockMetadata()==2) {
				GL11.glRotatef(180,0.0F,1.0F,0.0F);
			}
			this.field_147514_c.signStick.showModel=true;
		} else {
			// Is a wall sign
			int j=p_147500_1_.getBlockMetadata();
			f3=0.0F;
			if(j==2) {
				f3=180.0F;
			}
			if(j==4) {
				f3=90.0F;
			}
			if(j==5) {
				f3=-90.0F;
			}
			GL11.glTranslatef((float)p_147500_2_+0.5F,(float)p_147500_4_+0.75F*f1,(float)p_147500_6_+0.5F);
			GL11.glRotatef(-f3,0.0F,1.0F,0.0F);
			GL11.glTranslatef(0.0F,-0.3125F,-0.4375F);
			this.field_147514_c.signStick.showModel=false;
		}
		if(!(block instanceof BlockBasicSign)) this.bindTexture(vanillaSign);
		else this.bindTexture(new ResourceLocation(((BlockBasicSign)block).teTexture));
		GL11.glPushMatrix();
		GL11.glScalef(f1,-f1,-f1);
		this.field_147514_c.renderSign();
		GL11.glPopMatrix();
		FontRenderer fontrenderer=this.func_147498_b();
		f3=0.016666668F*f1;
		GL11.glTranslatef(0.0F,0.5F*f1,0.07F*f1);
		GL11.glScalef(f3,-f3,f3);
		GL11.glNormal3f(0.0F,0.0F,-1.0F*f3);
		GL11.glDepthMask(false);
		byte b0=0;
		for(int i=0;i<p_147500_1_.signText.length;++i) {
			String s=p_147500_1_.signText[i];
			s=fontrenderer.trimStringToWidth(s,95);
			if(i==p_147500_1_.lineBeingEdited) {
				s="> "+s+" <";
				fontrenderer.drawString(s,-fontrenderer.getStringWidth(s)/2,i*10-p_147500_1_.signText.length*5,b0);
			} else {
				fontrenderer.drawString(s,-fontrenderer.getStringWidth(s)/2,i*10-p_147500_1_.signText.length*5,b0);
			}
		}
		GL11.glDepthMask(true);
		GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
		GL11.glPopMatrix();
	}

	public void renderTileEntityAt(TileEntity p_147500_1_,double p_147500_2_,double p_147500_4_,double p_147500_6_,float p_147500_8_) {
		this.renderTileEntityAt((TileEntitySign)p_147500_1_,p_147500_2_,p_147500_4_,p_147500_6_,p_147500_8_);
	}
}