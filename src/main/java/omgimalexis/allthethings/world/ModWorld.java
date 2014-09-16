package omgimalexis.allthethings.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorld {
	public static void init(){
		initialiseWorldGen();
	}
	
	public static void initialiseWorldGen(){
		registerWorldGen(new ModWorldGenOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
}
