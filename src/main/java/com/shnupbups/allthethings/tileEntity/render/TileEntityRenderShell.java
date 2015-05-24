package com.shnupbups.allthethings.tileEntity.render;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.model.ModelShell;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class TileEntityRenderShell extends TileEntitySpecialRenderer {

	private final ModelShell model;
	
	public TileEntityRenderShell() {
		this.model = new ModelShell();
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
		World world = te.getWorldObj();
		int dir;
		if(world != null) {
			dir = world.getBlockMetadata(te.xCoord, te.yCoord, te.zCoord);
		} else dir = 0;
		
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        ResourceLocation textures = (new ResourceLocation(Reference.MOD_ID + ":textures/entity/turtle.png")); 
        Minecraft.getMinecraft().renderEngine.bindTexture(textures);
                   
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(dir * (-90F), 0F, 1F, 0F);
        this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
	}
}
