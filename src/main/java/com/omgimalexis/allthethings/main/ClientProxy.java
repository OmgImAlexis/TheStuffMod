package com.omgimalexis.allthethings.main;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import com.omgimalexis.allthethings.entity.EntityMummy;
import com.omgimalexis.allthethings.entity.EntityPirate;
import com.omgimalexis.allthethings.entity.EntityTurtle;
import com.omgimalexis.allthethings.init.ModBlocks;
import com.omgimalexis.allthethings.item.render.CustomItemRenderer;
import com.omgimalexis.allthethings.lib.Reference;
import com.omgimalexis.allthethings.model.ModelPirate;
import com.omgimalexis.allthethings.model.ModelTurtle;
import com.omgimalexis.allthethings.render.RenderMummy;
import com.omgimalexis.allthethings.render.RenderPirate;
import com.omgimalexis.allthethings.render.RenderTurtle;
import com.omgimalexis.allthethings.tileEntity.TileEntityPipe;
import com.omgimalexis.allthethings.tileEntity.TileEntityShell;
import com.omgimalexis.allthethings.tileEntity.render.TileEntityRenderPipe;
import com.omgimalexis.allthethings.tileEntity.render.TileEntityRenderShell;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class ClientProxy extends CommonProxy {

	public static int addArmour(String armour) {
		return RenderingRegistry.addNewArmourRendererPrefix(armour);
	}

	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityShell.class, new TileEntityRenderShell());
		
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.shell), new CustomItemRenderer(new TileEntityRenderShell(), new TileEntityShell()));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class, new RenderMummy(new ModelZombie(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityPirate.class, new RenderPirate(new ModelPirate(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new RenderTurtle(new ModelTurtle(), 0));;
		
		VillagerRegistry.instance().registerVillagerSkin(56329, new ResourceLocation(Reference.MOD_ID, "textures/entity/villager.png"));
	}

}
