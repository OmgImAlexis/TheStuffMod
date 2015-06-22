package com.shnupbups.allthethings.main;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import com.shnupbups.allthethings.entity.EntityLyekstone;
import com.shnupbups.allthethings.entity.living.EntityBear;
import com.shnupbups.allthethings.entity.living.EntityFox;
import com.shnupbups.allthethings.entity.living.EntityGrawquat;
import com.shnupbups.allthethings.entity.living.EntityLyekhwrone;
import com.shnupbups.allthethings.entity.living.EntityMummy;
import com.shnupbups.allthethings.entity.living.EntityPanda;
import com.shnupbups.allthethings.entity.living.EntityPirate;
import com.shnupbups.allthethings.entity.living.EntitySenthant;
import com.shnupbups.allthethings.entity.living.EntityTurtle;
import com.shnupbups.allthethings.init.ModArmour;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.item.render.CustomItemRenderer;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.model.ModelBear;
import com.shnupbups.allthethings.model.ModelFox;
import com.shnupbups.allthethings.model.ModelGrawquat;
import com.shnupbups.allthethings.model.ModelLyekhwrone;
import com.shnupbups.allthethings.model.ModelPirate;
import com.shnupbups.allthethings.model.ModelSenthant;
import com.shnupbups.allthethings.model.ModelTurtle;
import com.shnupbups.allthethings.render.RenderBear;
import com.shnupbups.allthethings.render.RenderFox;
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
import com.shnupbups.allthethings.tileEntity.render.TileEntityRenderSign;

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
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySign.class, new TileEntityRenderSign());
		
		MinecraftForgeClient.registerItemRenderer(ModArmour.shell, new CustomItemRenderer(new TileEntityRenderShell(), new TileEntityShell()));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class, new RenderMummy(new ModelZombie(), 0.45F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPirate.class, new RenderPirate(new ModelPirate(), 0.55F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySenthant.class, new RenderSenthant(new ModelSenthant(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new RenderTurtle(new ModelTurtle(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanda.class, new RenderPanda(new ModelBear(), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrawquat.class, new RenderGrawquat(new ModelGrawquat(), 0.67F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLyekhwrone.class, new RenderLyekhwrone(new ModelLyekhwrone(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFox.class, new RenderFox(new ModelFox(), 0.35F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLyekstone.class, new RenderSnowball(ModItems.lyekstone));
		
		VillagerRegistry.instance().registerVillagerSkin(56329, new ResourceLocation(Reference.MOD_ID, "textures/entity/villager.png"));
	}

}
