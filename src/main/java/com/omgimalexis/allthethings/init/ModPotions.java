package com.omgimalexis.allthethings.init;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;

import com.omgimalexis.allthethings.handler.PotionHandler;
import com.omgimalexis.allthethings.potion.PotionBasic;
import com.omgimalexis.allthethings.potion.PotionLessening;

public class ModPotions {
	public static Potion bleeding;
	public static Potion leadPoison;
	public static Potion fluxCorruption;
	public static Potion radioactivity;
	public static Potion lessening;
	
	public static void preInit() {
		Potion[] potionTypes = null;

		for (Field f : Potion.class.getDeclaredFields()) {
			f.setAccessible(true);
			try {
				if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

					potionTypes = (Potion[])f.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			} catch (Exception e) {
				System.err.println("Severe error, please report this to the mod author:");
				System.err.println(e);
			}
		}
	}
	
	public static void init() {
		bleeding = (new PotionBasic(32, false, 0)).setIconIndex(0,0).setPotionName("potion.bleeding");
		leadPoison = (new PotionBasic(33, false, 0)).setIconIndex(1,0).setPotionName("potion.leadPoison");
		fluxCorruption = (new PotionBasic(34, false, 0)).setIconIndex(2,0).setPotionName("potion.fluxCorruption");
		radioactivity = (new PotionBasic(35, false, 0)).setIconIndex(3,0).setPotionName("potion.radioactivity");
		lessening = (new PotionLessening(36, false, 0)).setIconIndex(4,0).setPotionName("potion.lessening");
	}

}
