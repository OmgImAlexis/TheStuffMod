package omgimalexis.allthethings.main;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import omgimalexis.allthethings.tile_entity.TileEntityPipe;
import omgimalexis.allthethings.tile_entity.render.TileEntityRenderPipe;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public static int addArmour(String armour) {
		return RenderingRegistry.addNewArmourRendererPrefix(armour);
	}

	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
	}

}
