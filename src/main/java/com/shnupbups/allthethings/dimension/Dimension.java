package com.shnupbups.allthethings.dimension;

public class Dimension {

	public int id;
	public boolean alwaysLoaded;
	
	public Dimension(int id) {
		this(id, false);
	}
	
	public Dimension(int id, boolean alwaysLoaded) {
		this.id = id;
		this.alwaysLoaded = alwaysLoaded;
	}
}
