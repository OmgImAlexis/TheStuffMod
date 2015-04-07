package com.omgimalexis.allthethings.utility;

public class MiscUtility {

	public static int clamp(int num, int min, int max) {
		if(num < min) num = min;
		else if(num > max) num = max;
		return num;
	}
	
}
