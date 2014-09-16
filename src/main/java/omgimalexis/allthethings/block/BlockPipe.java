package omgimalexis.allthethings.block;

import omgimalexis.allthethings.tile_entity.TileEntityPipe;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPipe extends BlockContainer {
	public BlockPipe() {
		super(Material.ground);
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

	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityPipe();
	}
}
