package omgimalexis.allthethings.tile_entity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityPipe extends TileEntity {
	public TileEntity createNewTileEntity(World world, int par2) {
		return new TileEntityPipe();
	}

}
