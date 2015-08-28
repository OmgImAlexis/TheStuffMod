package com.shnupbups.allthethings.item.material;

public interface IMaterial {
	public MaterialDimension getDimension();

	public MaterialRarity getRarity();

	public MaterialType getType();

	public int getColour();
}
