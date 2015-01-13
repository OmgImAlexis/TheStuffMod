package com.omgimalexis.allthethings.block;

import com.omgimalexis.allthethings.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCable extends Block {

	public BlockCable() {
		super(Material.cloth);
		Reference.incrementBlocks();
	}

}
