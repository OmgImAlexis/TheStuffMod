package com.omgimalexis.allthethings.main;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import com.omgimalexis.allthethings.tileEntity.TileEntityBattery;
import com.omgimalexis.allthethings.tileEntity.TileEntityPipe;
import com.omgimalexis.allthethings.tileEntity.render.TileEntityRenderPipe;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

	public static int addArmour(String armour) {
		return RenderingRegistry.addNewArmourRendererPrefix(armour);
	}

	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
	}

}
