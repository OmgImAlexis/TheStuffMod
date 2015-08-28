package com.shnupbups.allthethings.event;

import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import cpw.mods.fml.common.eventhandler.Cancelable;

@Cancelable
public class FluoExplosionEvent extends WorldEvent {

	public int x,y,z;
	
	public FluoExplosionEvent(World world, int x, int y, int z) {
		super(world);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Cancelable
	public static class BreakBlocks extends FluoExplosionEvent {
		public BreakBlocks(World world, int x, int y, int z) {
			super(world, x, y, z);
		}
	}

}
