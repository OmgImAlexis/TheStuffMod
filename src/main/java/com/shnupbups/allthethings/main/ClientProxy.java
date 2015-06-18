package com.shnupbups.allthethings.main;

import com.shnupbups.allthethings.entity.EntityLyekstone;
import com.shnupbups.allthethings.entity.living.*;
import com.shnupbups.allthethings.init.ModArmour;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.item.render.CustomItemRenderer;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.model.*;
import com.shnupbups.allthethings.render.*;
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
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class, new RenderMummy(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPirate.class, new RenderPirate(new ModelPirate(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySenthant.class, new RenderSenthant(new ModelSenthant(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new RenderTurtle(new ModelTurtle(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanda.class, new RenderPanda(new ModelBear(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrawquat.class, new RenderGrawquat(new ModelGrawquat(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLyekhwrone.class, new RenderLyekhwrone(new ModelLyekhwrone(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFox.class, new RenderFox(new ModelWolf(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLyekstone.class, new RenderSnowball(ModItems.lyekstone));
		
		VillagerRegistry.instance().registerVillagerSkin(56329, new ResourceLocation(Reference.MOD_ID, "textures/entity/villager.png"));
	}

}
