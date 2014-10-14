package omgimalexis.allthethings.handler;

import net.minecraft.util.ChatComponentText;
import omgimalexis.allthethings.lib.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class PlayerLogin {
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.addChatMessage(new ChatComponentText("[AllTheThings] "+Reference.BLOCKS_ADDED+" blocks added"));
		event.player.addChatMessage(new ChatComponentText("[AllTheThings] "+Reference.ITEMS_ADDED+" items added"));
	}
}
