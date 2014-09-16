package omgimalexis.allthethings.tile_entity.render;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import omgimalexis.allthethings.lib.Reference;

import org.lwjgl.opengl.GL11;

public class TileEntityRenderPipe extends TileEntitySpecialRenderer {

	ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/models/pipes/pipe.png");
	float pixel = 1F / 16F;
	float texturePixel = 1F / 32F;

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double translationX, double translationY, double translationZ, float par5) {
		GL11.glTranslated(translationX, translationY, translationZ);
		this.bindTexture(texture);
		drawCore(tileEntity);
	}

	public void drawCore(TileEntity tileEntity) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.draw();
		{
			tessellator.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 11*pixel/2, 5*texturePixel, 5*texturePixel);
			tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 11*pixel/2, 5*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 11*pixel/2, 0*texturePixel, 0*texturePixel);
			tessellator.addVertexWithUV(11*pixel/2, 11*pixel/2, 11*pixel/2, 0*texturePixel, 5*texturePixel);
		}
	}
}
