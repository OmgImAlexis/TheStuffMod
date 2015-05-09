package com.shnupbups.allthethings.handler;

import net.minecraft.init.Blocks;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType;

import com.shnupbups.allthethings.init.ModBlocks;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FlowerHandler {
	//Thanks Botania
	@SubscribeEvent
	public void onWorldDecorate(DecorateBiomeEvent.Decorate event) {		
		if((event.getResult() == Result.ALLOW || event.getResult() == Result.DEFAULT) && event.type == EventType.FLOWERS) {
			for(int i = 0; i < 2; i++) {
				if(event.rand.nextInt(2) == 0) {
					int x = event.chunkX + event.rand.nextInt(16) + 8;
					int z = event.chunkZ + event.rand.nextInt(16) + 8;
					int y = event.world.getTopSolidOrLiquidBlock(x, z);

					int type = event.rand.nextInt(8);
					for(int j = 0; j < 5 * 2; j++) {
						int dist = 1;
						int x1 = x + event.rand.nextInt(dist * 2) - dist;
						int y1 = y + event.rand.nextInt(4) - event.rand.nextInt(4);
						int z1 = z + event.rand.nextInt(dist * 2) - dist;

						if (event.world.isAirBlock(x1, y1, z1) && (!event.world.provider.hasNoSky || y1 < 127) && ModBlocks.marigold.canBlockStay(event.world, x1, y1, z1)) {
							if(type < 1) event.world.setBlock(x1, y1, z1, ModBlocks.marigold, 0, 2);
							else if(type < 2) event.world.setBlock(x1, y1, z1, ModBlocks.petunia, 0, 2);
							else if(type < 3) event.world.setBlock(x1, y1, z1, ModBlocks.lavender, 0, 2);
							else if(type < 4) event.world.setBlock(x1, y1, z1, ModBlocks.pansy, 0, 2);
							else if(type < 7) event.world.setBlock(x1, y1, z1, Blocks.red_flower, event.rand.nextInt(8), 2);
							else event.world.setBlock(x1, y1, z1, Blocks.yellow_flower, 0, 2);
						}
					}
				}
			}
		}
	}
	
}
