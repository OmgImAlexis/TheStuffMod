package com.omgimalexis.allthethings.main;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.tileEntity.TileEntityBattery;
import com.omgimalexis.allthethings.tileEntity.TileEntityPipe;
import com.omgimalexis.allthethings.tileEntity.render.TileEntityRenderPipe;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class ClientProxy extends CommonProxy {

	public static int addArmour(String armour) {
		return RenderingRegistry.addNewArmourRendererPrefix(armour);
	}

	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
		
		VillagerRegistry.instance().registerVillagerSkin(56329, new ResourceLocation(Reference.MOD_ID, "textures/entity/villager.png"));
	}

}
