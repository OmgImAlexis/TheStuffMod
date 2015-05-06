package com.shnupbups.allthethings.main;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import com.shnupbups.allthethings.entity.EntityBear;
import com.shnupbups.allthethings.entity.EntityGrawquat;
import com.shnupbups.allthethings.entity.EntityLyekhwrone;
import com.shnupbups.allthethings.entity.EntityMummy;
import com.shnupbups.allthethings.entity.EntityPanda;
import com.shnupbups.allthethings.entity.EntityPirate;
import com.shnupbups.allthethings.entity.EntitySenthant;
import com.shnupbups.allthethings.entity.EntityTurtle;
import com.shnupbups.allthethings.init.ModArmour;
import com.shnupbups.allthethings.item.render.CustomItemRenderer;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.model.ModelBear;
import com.shnupbups.allthethings.model.ModelGrawquat;
import com.shnupbups.allthethings.model.ModelLyekhwrone;
import com.shnupbups.allthethings.model.ModelPirate;
import com.shnupbups.allthethings.model.ModelSenthant;
import com.shnupbups.allthethings.model.ModelTurtle;
import com.shnupbups.allthethings.render.RenderBear;
import com.shnupbups.allthethings.render.RenderGrawquat;
import com.shnupbups.allthethings.render.RenderLyekhwrone;
import com.shnupbups.allthethings.render.RenderMummy;
import com.shnupbups.allthethings.render.RenderPanda;
import com.shnupbups.allthethings.render.RenderPirate;
import com.shnupbups.allthethings.render.RenderSenthant;
import com.shnupbups.allthethings.render.RenderTurtle;
import com.shnupbups.allthethings.tileEntity.TileEntityCable;
import com.shnupbups.allthethings.tileEntity.TileEntityPipe;
import com.shnupbups.allthethings.tileEntity.TileEntityShell;
import com.shnupbups.allthethings.tileEntity.render.TileEntityRenderCable;
import com.shnupbups.allthethings.tileEntity.render.TileEntityRenderPipe;
import com.shnupbups.allthethings.tileEntity.render.TileEntityRenderShell;

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
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCable.class, new TileEntityRenderCable());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityShell.class, new TileEntityRenderShell());
		
		MinecraftForgeClient.registerItemRenderer(ModArmour.shell, new CustomItemRenderer(new TileEntityRenderShell(), new TileEntityShell()));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class, new RenderMummy(new ModelZombie(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityPirate.class, new RenderPirate(new ModelPirate(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntitySenthant.class, new RenderSenthant(new ModelSenthant(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new RenderTurtle(new ModelTurtle(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityPanda.class, new RenderPanda(new ModelBear(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityGrawquat.class, new RenderGrawquat(new ModelGrawquat(), 0));;
		RenderingRegistry.registerEntityRenderingHandler(EntityLyekhwrone.class, new RenderLyekhwrone(new ModelLyekhwrone(), 0));;
		
		VillagerRegistry.instance().registerVillagerSkin(56329, new ResourceLocation(Reference.MOD_ID, "textures/entity/villager.png"));
	}

}
