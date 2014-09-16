package omgimalexis.allthethings.entity;

import net.minecraft.entity.EntityList;

import omgimalexis.allthethings.main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class TMEntity {
	
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}
