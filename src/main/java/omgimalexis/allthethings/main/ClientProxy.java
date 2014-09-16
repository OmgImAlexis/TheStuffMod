package omgimalexis.allthethings.main;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	public static int addArmour(String armour){
		return RenderingRegistry.addNewArmourRendererPrefix(armour);
	}
}
