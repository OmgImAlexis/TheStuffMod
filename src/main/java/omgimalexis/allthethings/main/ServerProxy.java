package omgimalexis.allthethings.main;


import omgimalexis.allthethings.handler.TMGuiHandler;
import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.tile_entity.TileEntityCompressor;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy extends CommonProxy{

	public void registerRenderThings() {

	}

	public int addArmor(String armour) {
		return RenderingRegistry.addNewArmourRendererPrefix(armour);
	}
}
