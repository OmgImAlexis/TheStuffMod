package com.shnupbups.allthethings.utility;

public class MiscUtility {
	public static int clamp(int num,int min,int max) {
		return Math.min(Math.max(num,min),max);
	}

	public static float clamp(float num,float min,float max) {
		return Math.min(Math.max(num,min),max);
	}

	public static double clamp(double num,double min,double max) {
		return Math.min(Math.max(num,min),max);
	}

	public static int scale(int scale,int base,int max) {
		return base*scale/max;
	}

	public static int scale(int base,int max) {
		return scale(100,base,max);
	}

	public static boolean[] intToBoolean(int[] array) {
		boolean[] returnArray=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i]<=0) returnArray[i]=false;
			else returnArray[i]=true;
		}
		return returnArray;
	}

	public static int[] booleanToInt(boolean[] array) {
		int[] returnArray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i]==false) returnArray[i]=0;
			else returnArray[i]=1;
		}
		return returnArray;
	}

	public static boolean isWithinRange(int check,int of,int range) {
		for(int i=-range;i<=range;i++) {
			if(check+i==of) {
				return true;
			}
		}
		return false;
	}

	public static boolean isWithinRange(float check,float of,int range) {
		for(int i=-range;i<=range;i++) {
			if(check+i==of) {
				return true;
			}
		}
		return false;
	}

	public static boolean isWithinRange(double check,double of,int range) {
		for(int i=-range;i<=range;i++) {
			if(check+i==of) {
				return true;
			}
		}
		return false;
	}
}
