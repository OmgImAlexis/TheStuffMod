package com.omgimalexis.allthethings.lib;

public class Reference {
	public static final String MOD_ID = "allthethings";
	public static final String MOD_NAME = "AllTheThings";
	public static final String VERSION = "1.7.10-1.1.0.0pre2";
	public static final String CLIENT_PROXY_CLASS = "com.omgimalexis.allthethings.main.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.omgimalexis.allthethings.main.CommonProxy";
	public static final String GUI_FACTORY_CLASS = "com.omgimalexis.allthethings.gui.GuiFactory";
	
	public static int BLOCKS_ADDED = 0;
	public static int ITEMS_ADDED = 0;
	
	//MAKE SURE to set to false for release!
	public static final Boolean DEBUG_MODE = false;
	
	public static void incrementBlocks() {
		BLOCKS_ADDED++;
	}
	
	public static void incrementItems() {
		ITEMS_ADDED++;
	}
}
