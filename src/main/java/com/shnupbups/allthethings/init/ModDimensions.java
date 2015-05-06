package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.dimension.Dimension;
import com.shnupbups.allthethings.dimension.WorldProviderUsther;
import com.shnupbups.allthethings.handler.ConfigurationHandler;
import com.shnupbups.allthethings.utility.Register;

public class ModDimensions {
	public static final Dimension usther = new Dimension(ConfigurationHandler.ustherID);
	
	public static void init() {
		Register.registerDimension(usther, WorldProviderUsther.class);
	}
}
