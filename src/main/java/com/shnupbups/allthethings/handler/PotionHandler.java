package com.shnupbups.allthethings.handler;

import java.nio.FloatBuffer;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.WorldSettings.GameType;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBTextureEnvCombine;
import org.lwjgl.opengl.ARBTextureEnvDot3;
import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.magic.FluoProperties;
import com.shnupbups.allthethings.utility.MiscUtility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PotionHandler {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		if(event.entityLiving.isPotionActive(ModPotions.bleeding)) {
			if(event.entityLiving.worldObj.rand.nextInt(24-(MiscUtility.clamp(event.entityLiving.getActivePotionEffect(ModPotions.bleeding).getAmplifier()+1,1,20))) == 0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:bleeding"), MiscUtility.clamp(event.entityLiving.getActivePotionEffect(ModPotions.bleeding).getAmplifier()+1,1,5));
				//event.entityLiving.worldObj.spawnParticle("splash", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0D, 1.0D, 1.0D);
			}
		}
		if(event.entityLiving.isPotionActive(ModPotions.leadPoison)) {
			if(event.entityLiving.worldObj.rand.nextInt(120) == 0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:leadPoison"), 2);
				if (event.entityLiving instanceof EntityPlayer) {
					((EntityPlayer)event.entityLiving).addExhaustion(10.0F);
				}
				//event.entityLiving.worldObj.spawnParticle("splash", (event.entityLiving.posX+0.5F)-0.27000001072883606D, (event.entityLiving.posY+0.7F)+0.2199999988079071D, (event.entityLiving.posZ+0.5F), 0.0D, 0.0D, 0.0D);
			}
		}
		if(event.entityLiving.isPotionActive(ModPotions.lessening)) {
			if(event.entityLiving instanceof EntityPlayerMP && ((EntityPlayerMP) event.entityLiving).theItemInWorldManager.getGameType() == GameType.CREATIVE) return;
			else if(event.entityLiving.getHealth() <= 1 || event.entityLiving.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue() <= 2.0) {
				event.entityLiving.attackEntityFrom(new DamageSource("allthethings:lessening"), 9001);
			}
		}
		if(event.entityLiving.isPotionActive(ModPotions.anchorage)) {
			event.entityLiving.motionY=Math.min(event.entityLiving.motionY,  0);
		}
		if(event.entityLiving.isPotionActive(ModPotions.flight) && event.entityLiving instanceof EntityPlayer && ((EntityPlayer)event.entityLiving).capabilities.isCreativeMode != true) {
			if(event.entityLiving.getActivePotionEffect(ModPotions.flight).getDuration()<20) {((EntityPlayer)event.entityLiving).capabilities.allowFlying = false; ((EntityPlayer)event.entityLiving).capabilities.isFlying = false;}
			else ((EntityPlayer)event.entityLiving).capabilities.allowFlying = true;
		} /**else if(event.entityLiving instanceof EntityPlayer) {
			if(((EntityPlayer)event.entityLiving).capabilities.isCreativeMode != true) {((EntityPlayer)event.entityLiving).capabilities.allowFlying = false; ((EntityPlayer)event.entityLiving).capabilities.isFlying = false;}
		}**/
		
		if(event.entityLiving.isPotionActive(ModPotions.monochromacy) && event.entityLiving instanceof EntityPlayer) {
			if(event.entityLiving.getActivePotionEffect(ModPotions.monochromacy).getDuration()<20) {
				event.entityLiving.removePotionEffect(ModPotions.monochromacy.getId());
				if(event.entityLiving.worldObj.isRemote) Minecraft.getMinecraft().renderGlobal.loadRenderers();
			}
		}
		
		if(event.entityLiving.isPotionActive(ModPotions.fluxCorruption)) {
			if(event.entityLiving.worldObj.rand.nextInt(10) <= 1) {
				for (int i = 0; i < event.entityLiving.worldObj.rand.nextInt(100); i++) {
					event.entityLiving.cameraPitch += new Random().nextFloat()*new Random().nextInt(10);
					event.entityLiving.renderYawOffset += new Random().nextFloat()*new Random().nextInt(10);
					event.entityLiving.rotationYawHead += new Random().nextFloat()*new Random().nextInt(10);
					event.entityLiving.rotationPitch += (new Random().nextFloat()*(new Random().nextInt(10)-5));
					event.entityLiving.rotationYaw += (new Random().nextFloat()*(new Random().nextInt(10)-5));
				}
			} 
			
			if(event.entityLiving.worldObj.rand.nextInt(10) <= 1) {
				event.entityLiving.attackEntityFrom(new DamageSource(Reference.MOD_ID+":corruption"), event.entityLiving.worldObj.rand.nextInt(5));
			}
			
			if(event.entityLiving.worldObj.rand.nextInt(10) <= 1) {
				event.entityLiving.posX += (new Random().nextDouble()*(new Random().nextInt(10)-5));
				event.entityLiving.posZ += (new Random().nextDouble()*(new Random().nextInt(10)-5));
			}
		}
		
		if(event.entityLiving instanceof EntityPlayerMP) {
			if(!event.entityLiving.isPotionActive(ModPotions.fluxCorruption)) {
				if(FluoProperties.getFluoLevel((EntityPlayer) event.entityLiving) >= (FluoProperties.getMaxFluoLevel((EntityPlayer) event.entityLiving)*0.9)) {
					((EntityPlayerMP)event.entityLiving).playerNetServerHandler.sendPacket(new S29PacketSoundEffect(Reference.MOD_ID+":corrupt", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0f, 1.0f));
					event.entityLiving.addPotionEffect(new PotionEffect(ModPotions.fluxCorruption.getId(), 100, 3, true));
				} else if(FluoProperties.getFluoLevel((EntityPlayer) event.entityLiving) >= (FluoProperties.getMaxFluoLevel((EntityPlayer) event.entityLiving)*0.8)) {
					((EntityPlayerMP)event.entityLiving).playerNetServerHandler.sendPacket(new S29PacketSoundEffect(Reference.MOD_ID+":corrupt", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0f, 1.0f));
					event.entityLiving.addPotionEffect(new PotionEffect(ModPotions.fluxCorruption.getId(), 100, 2, true));
				} else if(FluoProperties.getFluoLevel((EntityPlayer) event.entityLiving) >= (FluoProperties.getMaxFluoLevel((EntityPlayer) event.entityLiving)*0.7)) {
					((EntityPlayerMP)event.entityLiving).playerNetServerHandler.sendPacket(new S29PacketSoundEffect(Reference.MOD_ID+":corrupt", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0f, 1.0f));
					event.entityLiving.addPotionEffect(new PotionEffect(ModPotions.fluxCorruption.getId(), 100, 1, true));
				} else if(FluoProperties.getFluoLevel((EntityPlayer) event.entityLiving) >= (FluoProperties.getMaxFluoLevel((EntityPlayer) event.entityLiving)*0.6)) {
					((EntityPlayerMP)event.entityLiving).playerNetServerHandler.sendPacket(new S29PacketSoundEffect(Reference.MOD_ID+":corrupt", event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, 1.0f, 1.0f));
					event.entityLiving.addPotionEffect(new PotionEffect(ModPotions.fluxCorruption.getId(), 100, 0, true));
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent event) {
		if(event.entityLiving.isPotionActive(ModPotions.anchorage)) {
			event.entityLiving.motionY=MiscUtility.clamp(event.entityLiving.motionY, -Double.MAX_VALUE, 0);
		}
	}
	
	@SubscribeEvent
	public void onRenderTick(RenderTickEvent event) {
		if(Minecraft.getMinecraft().thePlayer != null) {
		if(event.phase == TickEvent.Phase.START) {
		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_TEXTURE_BIT);
		if(Minecraft.getMinecraft().thePlayer.isPotionActive(ModPotions.monochromacy)) {
			GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, ARBTextureEnvCombine.GL_COMBINE_ARB);
			GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_COMBINE_RGB_ARB, ARBTextureEnvDot3.GL_DOT3_RGB_ARB);
			GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE0_RGB_ARB, GL11.GL_TEXTURE);
			GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND0_RGB_ARB, GL11.GL_SRC_COLOR);
			GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_SOURCE1_RGB_ARB, ARBTextureEnvCombine.GL_CONSTANT_ARB);
			GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, ARBTextureEnvCombine.GL_OPERAND1_RGB_ARB, GL11.GL_SRC_COLOR);
			FloatBuffer bwMapping = BufferUtils.createFloatBuffer(4);
			bwMapping.put(1f).put(1f).put(1f).put(0f).flip();
			GL11.glTexEnv(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_COLOR, bwMapping);
		} else if(Minecraft.getMinecraft().thePlayer.isPotionActive(ModPotions.fluxCorruption)) {
		}
		} else if(event.phase == TickEvent.Phase.END) {
			GL11.glPopAttrib();
			GL11.glPopMatrix();
		}
		}
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onRenderHud(RenderGameOverlayEvent event) {
		GL11.glPushMatrix();
		if(!ConfigurationHandler.monochromeHUD && Minecraft.getMinecraft().thePlayer != null && (Minecraft.getMinecraft().thePlayer.isPotionActive(ModPotions.monochromacy) || Minecraft.getMinecraft().thePlayer.isPotionActive(ModPotions.fluxCorruption))) GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, GL11.GL_MODULATE);
		GL11.glPopMatrix();
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onRenderGui(DrawScreenEvent event) {
		if(!ConfigurationHandler.monochromeGUIs && Minecraft.getMinecraft().thePlayer != null &&  (Minecraft.getMinecraft().thePlayer.isPotionActive(ModPotions.monochromacy) || Minecraft.getMinecraft().thePlayer.isPotionActive(ModPotions.fluxCorruption))) GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, GL11.GL_MODULATE);
	}
}
