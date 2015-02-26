package com.omgimalexis.allthethings.init;

import com.omgimalexis.allthethings.dimension.Dimension;
import com.omgimalexis.allthethings.dimension.WorldProviderUsther;
import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.utility.Register;

public class ModDimensions {
	public static final Dimension usther = new Dimension(ConfigurationHandler.ustherID);
	
	public static void init() {
		Register.registerDimension(usther, WorldProviderUsther.class);
	}
}
