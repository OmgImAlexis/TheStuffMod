package com.shnupbups.allthethings.item.material;

public enum MaterialRarity {
	EVERYWHERE,COMMON,UNCOMMON,AVERAGE,RARE,SUPERRARE,ULTRARARE;

	public static int intValueOfRarity(MaterialRarity rarity) {
		if(rarity == MaterialRarity.EVERYWHERE) return 100;
		else if(rarity == MaterialRarity.COMMON) return 75;
		else if(rarity == MaterialRarity.UNCOMMON) return 50;
		else if(rarity == MaterialRarity.AVERAGE) return 20;
		else if(rarity == MaterialRarity.RARE) return 10;
		else if(rarity == MaterialRarity.SUPERRARE) return 5;
		else if(rarity == MaterialRarity.ULTRARARE) return 2;
		else throw new IllegalArgumentException();
	}
	
	public int intValueOfRarity() {
		if(this == MaterialRarity.EVERYWHERE) return 100;
		else if(this == MaterialRarity.COMMON) return 75;
		else if(this == MaterialRarity.UNCOMMON) return 50;
		else if(this == MaterialRarity.AVERAGE) return 20;
		else if(this == MaterialRarity.RARE) return 10;
		else if(this == MaterialRarity.SUPERRARE) return 5;
		else if(this == MaterialRarity.ULTRARARE) return 2;
		else throw new IllegalArgumentException();
	}
}
