package com.shnupbups.allthethings.item.material;

public enum MaterialType {
	INGOT,ALLOY,GEM,PUREGEM,CUTGEM,SHARD,DUST,CLUSTER,PLATE,NUGGET,MISC,GEAR;
	public static String getPrefixFromType(MaterialType type) {
		if(type==MaterialType.ALLOY||type==MaterialType.INGOT) return "ingot";
		else if(type==MaterialType.GEM) return "gem";
		else if(type==MaterialType.PUREGEM) return "gemPure";
		else if(type==MaterialType.CLUSTER) return "cluster";
		else if(type==MaterialType.CUTGEM) return "gemCut";
		else if(type==MaterialType.DUST) return "dust";
		else if(type==MaterialType.MISC) return "misc";
		else if(type==MaterialType.PLATE) return "plate";
		else if(type==MaterialType.SHARD) return "shard";
		else if(type==MaterialType.NUGGET) return "nugget";
		else if(type==MaterialType.GEAR) return "gear";
		else throw new IllegalArgumentException();
	}

	public String getPrefixFromType() {
		if(this==MaterialType.ALLOY||this==MaterialType.INGOT) return "ingot";
		else if(this==MaterialType.GEM) return "gem";
		else if(this==MaterialType.PUREGEM) return "gemPure";
		else if(this==MaterialType.CLUSTER) return "cluster";
		else if(this==MaterialType.CUTGEM) return "gemCut";
		else if(this==MaterialType.DUST) return "dust";
		else if(this==MaterialType.MISC) return "misc";
		else if(this==MaterialType.PLATE) return "plate";
		else if(this==MaterialType.SHARD) return "shard";
		else if(this==MaterialType.NUGGET) return "nugget";
		else if(this==MaterialType.GEAR) return "gear";
		else throw new IllegalArgumentException();
	}
}
