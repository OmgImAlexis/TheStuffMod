package com.shnupbups.allthethings.utility;

import java.awt.Color;

public class MiscUtility {

	public static int clamp(int num, int min, int max) {
		if(num < min) num = min;
		else if(num > max) num = max;
		return num;
	}

	public static String toCamelcase(String in) {
		return (in.substring(0,1).toUpperCase())+(in.substring(1).toLowerCase());
	}	
}
