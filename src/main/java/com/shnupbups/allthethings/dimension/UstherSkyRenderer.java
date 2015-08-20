package com.shnupbups.allthethings.dimension;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.IRenderHandler;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class UstherSkyRenderer extends IRenderHandler{

	private int starGLCallList;
	private int glSkyList;
	private int glSkyList2;
	public UstherSkyRenderer()
	{
	  RenderGlobal renderGlobal = Minecraft.getMinecraft().renderGlobal;
	  //this.glSkyList2 = (this.glSkyList = (this.starGLCallList = ReflectionHelper.getPrivateValue(RenderGlobal.class, renderGlobal, "starGLCallList")) + 1) + 1;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        TextureManager renderEngine = Minecraft.getMinecraft().getTextureManager();

        GL11.glDisable(GL11.GL_TEXTURE_2D);
        Vec3 vec3 = world.getSkyColor(player, partialTicks);
        float skyRed = (float) vec3.xCoord;
        float skyGreen = (float) vec3.yCoord;
        float skyBlue = (float) vec3.zCoord;
        float f6;

        boolean anaglyph = Minecraft.getMinecraft().gameSettings.anaglyph;
        if (anaglyph) {
            float f4 = (skyRed * 30.0F + skyGreen * 59.0F + skyBlue * 11.0F) / 100.0F;
            float f5 = (skyRed * 30.0F + skyGreen * 70.0F) / 100.0F;
            f6 = (skyRed * 30.0F + skyBlue * 70.0F) / 100.0F;
            skyRed = f4;
            skyGreen = f5;
            skyBlue = f6;
        }

        GL11.glColor3f(skyRed, skyGreen, skyBlue);
        Tessellator tessellator = Tessellator.instance;
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_FOG);
        GL11.glColor3f(skyRed, skyGreen, skyBlue);
        GL11.glCallList(glSkyList);
        GL11.glDisable(GL11.GL_FOG);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        RenderHelper.disableStandardItemLighting();
        float[] sunsetColors = world.provider.calcSunriseSunsetColors(world.getCelestialAngle(partialTicks), partialTicks);
        float f7;
        float f8;
        float f9;
        float f10;

        if (sunsetColors != null) {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glShadeModel(GL11.GL_SMOOTH);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            f6 = sunsetColors[0];
            f7 = sunsetColors[1];
            f8 = sunsetColors[2];
            float f11;

            if (anaglyph) {
                f9 = (f6 * 30.0F + f7 * 59.0F + f8 * 11.0F) / 100.0F;
                f10 = (f6 * 30.0F + f7 * 70.0F) / 100.0F;
                f11 = (f6 * 30.0F + f8 * 70.0F) / 100.0F;
                f6 = f9;
                f7 = f10;
                f8 = f11;
            }

            tessellator.startDrawing(6);
            tessellator.setColorRGBA_F(f6, f7, f8, sunsetColors[3]);
            tessellator.addVertex(0.0D, 100.0D, 0.0D);
            byte b0 = 16;
            tessellator.setColorRGBA_F(sunsetColors[0], sunsetColors[1], sunsetColors[2], 0.0F);

            for (int j = 0; j <= b0; ++j) {
                f11 = j * (float) Math.PI * 2.0F / b0;
                float f12 = MathHelper.sin(f11);
                float f13 = MathHelper.cos(f11);
                tessellator.addVertex((f12 * 120.0F), (f13 * 120.0F), (-f13 * 40.0F * sunsetColors[3]));
            }

            tessellator.draw();
            GL11.glPopMatrix();
            GL11.glShadeModel(GL11.GL_FLAT);
        }

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.glBlendFunc(770, 1, 1, 0);
        GL11.glPushMatrix();

        float f11 = 1.0F - world.getRainStrength(partialTicks);
        ResourceLocation sun = new ResourceLocation(Reference.MOD_ID+":textures/misc/sun.png");
        ResourceLocation moon = new ResourceLocation(Reference.MOD_ID+":textures/misc/moon.png");
        
        GL11.glColor4f(1.0F, 1.0F, 1.0F, f11);
        GL11.glTranslatef(0.0F, 0.0F, 0.0F);
        GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(world.getCelestialAngle(partialTicks) * 360.0F, 1.0F, 0.0F, 0.0F);
        float f12 = 30.0F;
        renderEngine.bindTexture(sun);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((-f12), 100.0D, (-f12), 0.0D, 0.0D);
        tessellator.addVertexWithUV(f12, 100.0D, (-f12), 1.0D, 0.0D);
        tessellator.addVertexWithUV(f12, 100.0D, f12, 1.0D, 1.0D);
        tessellator.addVertexWithUV((-f12), 100.0D, f12, 0.0D, 1.0D);
        tessellator.draw();
        f12 = 20.0F;
        float f14, f15, f16, f17;
        renderEngine.bindTexture(moon);
        f14 = 0.0f;
        f15 = 0.0f;
        f16 = 1.0f;
        f17 = 1.0f;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((-f12), -100.0D, f12, f16, f17);
        tessellator.addVertexWithUV(f12, -100.0D, f12, f14, f17);
        tessellator.addVertexWithUV(f12, -100.0D, (-f12), f14, f15);
        tessellator.addVertexWithUV((-f12), -100.0D, (-f12), f16, f15);
        tessellator.draw();
        
        GL11.glDisable(GL11.GL_TEXTURE_2D);

        float f18 = world.getStarBrightness(partialTicks) * f11;

        if (f18 > 0.0F) {
            GL11.glColor4f(f18, f18, f18, f18);
            GL11.glCallList(starGLCallList);
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_FOG);
        GL11.glPopMatrix();
        GL11.glDisable(GL11.GL_TEXTURE_2D);

        GL11.glColor3f(0.0F, 0.0F, 0.0F);
        double d0 = player.getPosition(partialTicks).yCoord - world.getHorizon();

        if (d0 < 0.0D) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12.0F, 0.0F);
            GL11.glCallList(glSkyList2);
            GL11.glPopMatrix();
            f8 = 1.0F;
            f9 = -((float) (d0 + 65.0D));
            f10 = -f8;
            tessellator.startDrawingQuads();
            tessellator.setColorRGBA_I(0, 255);
            tessellator.addVertex((-f8), f9, f8);
            tessellator.addVertex(f8, f9, f8);
            tessellator.addVertex(f8, f10, f8);
            tessellator.addVertex((-f8), f10, f8);
            tessellator.addVertex((-f8), f10, (-f8));
            tessellator.addVertex(f8, f10, (-f8));
            tessellator.addVertex(f8, f9, (-f8));
            tessellator.addVertex((-f8), f9, (-f8));
            tessellator.addVertex(f8, f10, (-f8));
            tessellator.addVertex(f8, f10, f8);
            tessellator.addVertex(f8, f9, f8);
            tessellator.addVertex(f8, f9, (-f8));
            tessellator.addVertex((-f8), f9, (-f8));
            tessellator.addVertex((-f8), f9, f8);
            tessellator.addVertex((-f8), f10, f8);
            tessellator.addVertex((-f8), f10, (-f8));
            tessellator.addVertex((-f8), f10, (-f8));
            tessellator.addVertex((-f8), f10, f8);
            tessellator.addVertex(f8, f10, f8);
            tessellator.addVertex(f8, f10, (-f8));
            tessellator.draw();
        }

        if (world.provider.isSkyColored()) {
            GL11.glColor3f(skyRed * 0.2F + 0.04F, skyGreen * 0.2F + 0.04F, skyBlue * 0.6F + 0.1F);
        } else {
            GL11.glColor3f(skyRed, skyGreen, skyBlue);
        }

        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, -((float) (d0 - 16.0D)), 0.0F);
        GL11.glCallList(glSkyList2);
        GL11.glPopMatrix();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDepthMask(true);
	}

}
