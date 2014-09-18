package omgimalexis.allthethings.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public class BlockCable extends Block {

	public int powerLevel;
	
	public BlockCable() {
		super(Material.rock);
	}
	
	public void setPowerLevel (int powerLevel) {
		this.powerLevel = powerLevel;
	}
	
	public int getPowerLevel() {
		
	}

}
