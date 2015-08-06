package com.shnupbups.allthethings.init;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.entity.EntityLyekstone;
import com.shnupbups.allthethings.entity.EntityPaintball;
import com.shnupbups.allthethings.entity.living.EntityBear;
import com.shnupbups.allthethings.entity.living.EntityFox;
import com.shnupbups.allthethings.entity.living.EntityGrawquat;
import com.shnupbups.allthethings.entity.living.EntityLyekhwrone;
import com.shnupbups.allthethings.entity.living.EntityMouse;
import com.shnupbups.allthethings.entity.living.EntityMummy;
import com.shnupbups.allthethings.entity.living.EntityPanda;
import com.shnupbups.allthethings.entity.living.EntityPirate;
import com.shnupbups.allthethings.entity.living.EntitySenthant;
import com.shnupbups.allthethings.entity.living.EntityTurtle;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void init(){
		registerEntity();
		
		EntityRegistry.addSpawn(EntityMummy.class, 30, 1, 2, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mesa, ModBiomes.bananaGrove);
		EntityRegistry.addSpawn(EntityTurtle.class, 20, 1, 5, EnumCreatureType.waterCreature, BiomeGenBase.beach, BiomeGenBase.ocean, BiomeGenBase.river, BiomeGenBase.swampland);
		EntityRegistry.addSpawn(EntityTurtle.class, 20, 1, 5, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.ocean, BiomeGenBase.river, BiomeGenBase.swampland);
		EntityRegistry.addSpawn(EntityFox.class, 20, 3, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills);
		EntityRegistry.addSpawn(EntityMouse.class, 10, 1, 3, EnumCreatureType.creature, BiomeGenBase.plains);
	}
	
	public static void registerEntity(){
		createEntity(EntityMummy.class, "Mummy", 0xF1EEA6, 0xDEDB7C);
		createEntity(EntityPirate.class, "Pirate", 0x000658, 0x240400);
		createEntity(EntitySenthant.class, "Senthant", 0x4D4DCC, 0x6060FF);
		createEntity(EntityTurtle.class, "Tortoise", 0x007F0E, 0x605824);
		createEntity(EntityBear.class, "Bear", 0xA77400, 0x996800);
		createEntity(EntityPanda.class, "Panda", 0xFFFFFF, 0x000000);
		createEntity(EntityGrawquat.class, "Grawquat", 0x7F3300, 0x9B6038);
		createEntity(EntityLyekhwrone.class, "Lyekhwrone", 0x7F6A00, 0x635200);
		createEntity(EntityFox.class, "Fox", 0xD37630, 0xA02B00);
		createEntity(EntityMouse.class, "Mouse", 0x8A8A8A, 0xFABAB4);
		
		//EntityRegistry.registerModEntity(EntityLyekstone.class, "Lyekstone", EntityRegistry.findGlobalUniqueEntityId(), allthethings.instance, 64, 10, true);
		EntityRegistry.registerModEntity(EntityPaintball.class, "Paintball", EntityRegistry.findGlobalUniqueEntityId(), allthethings.instance, 64, 10, true);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, allthethings.instance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}
