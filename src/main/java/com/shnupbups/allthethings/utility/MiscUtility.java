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

	public static float clamp(float num, float min, float max) {
		if(num < min) num = min;
		else if(num > max) num = max;
		return num;
	}

	public static double clamp(double num, double min, double max) {
		if(num < min) num = min;
		else if(num > max) num = max;
		return num;
	}
	
	public static int scale(int scale, int base, int max) {
		return base * scale / max;
	}
	
	public static int scale(int base, int max) {
		return scale(100, base, max);
	}
}
