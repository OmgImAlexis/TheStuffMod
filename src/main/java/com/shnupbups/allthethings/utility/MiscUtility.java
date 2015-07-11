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
	
	public static boolean[] intToBoolean(int[] array) {
		boolean[] returnArray = new boolean[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array[i] <= 0) returnArray[i] = false;
			else returnArray[i] = true;
		}
		return returnArray;
	}
	
	public static int[] booleanToInt(boolean[] array) {
		int[] returnArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array[i] == false) returnArray[i] = 0;
			else returnArray[i] = 1;
		}
		return returnArray;
	}
}
