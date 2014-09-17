package omgimalexis.allthethings.block;

import omgimalexis.allthethings.tile_entity.TileEntityPipe;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPipe extends BlockContainer {
	public BlockPipe() {
		super(Material.ground);
		
		float pixel = 1f/16f;
		this.setBlockBounds(11*pixel/2, 11*pixel/2, 11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2);
		this.useNeighborBrightness = true;
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;

	}

	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityPipe();
	}
}
