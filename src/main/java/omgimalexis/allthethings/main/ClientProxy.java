package omgimalexis.allthethings.main;

import net.minecraft.client.renderer.entity.RenderSnowball;
import omgimalexis.allthethings.entity.EntityGrenade;
import omgimalexis.allthethings.entity.EntityTutMob;
import omgimalexis.allthethings.item.TMItem;
import omgimalexis.allthethings.model.ModelTutMob;
import omgimalexis.allthethings.render.RenderTutMob;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityTutMob.class, new RenderTutMob(new ModelTutMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(TMItem.tutGrenade));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
