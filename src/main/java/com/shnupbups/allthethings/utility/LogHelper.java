package com.shnupbups.allthethings.utility;

import org.apache.logging.log4j.Level;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.common.FMLLog;

public class LogHelper {
	public static void log(Level logLevel,Object object) {
		FMLLog.log(Reference.MOD_NAME,logLevel,String.valueOf(object));
	}

	public static Object all(Object object) {
		log(Level.ALL,object);
		return object;
	}

	public static Object debug(Object object) {
		log(Level.DEBUG,object);
		return object;
	}

	public static Object error(Object object) {
		log(Level.ERROR,object);
		return object;
	}

	public static Object fatal(Object object) {
		log(Level.FATAL,object);
		return object;
	}

	public static Object info(Object object) {
		log(Level.INFO,object);
		return object;
	}

	public static Object off(Object object) {
		log(Level.OFF,object);
		return object;
	}

	public static Object trace(Object object) {
		log(Level.TRACE,object);
		return object;
	}

	public static Object warn(Object object) {
		log(Level.WARN,object);
		return object;
	}
}
