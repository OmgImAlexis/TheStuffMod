package com.omgimalexis.allthethings.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements {
	public static final Achievement mineCopper = new Achievement("mineCopper", "mineCopper", -2, 0, ModBlocks.oreCopper, null).initIndependentStat();
	public static final Achievement jeweller = new Achievement("jeweller", "jeweller", 2, 2, ModItems.ring, null).initIndependentStat();
	public static final Achievement pyromaniac = new Achievement("pyromaniac", "pyromaniac", 0, 2, ModItems.fyrestoneRing, jeweller);
	public static final Achievement steveAlmighty = new Achievement("steveAlmighty", "steveAlmighty", 2, 0, ModItems.voidiumRing, jeweller).setSpecial();
	public static final Achievement mineUranium = new Achievement("mineUranium", "mineUranium", -4, 0, ModItems.uranium, null).initIndependentStat();
	public static final Achievement mineGem = new Achievement("mineGem", "mineGem", 0, 0, ModItems.gemRuby, null).initIndependentStat();
	public static final Achievement miles = new Achievement("88Miles", "88Miles", -4, 2, ModItems.plutonium, mineUranium);
	public static final Achievement pink = new Achievement("pink", "pink", 4, 0, ModBlocks.cherryPlanks, null).initIndependentStat();
	public static final Achievement noPlace = new Achievement("noPlace", "noPlace", -4, 4, ModArmour.bootsRuby, null).initIndependentStat();
	public static final Achievement alloy = new Achievement("alloy", "alloy", -2, 2, ModItems.ingotElectrum, mineCopper);
	public static final Achievement marry = new Achievement("marry", "marry", 4, 2, ModItems.diamondRing, jeweller);
	public static final Achievement dirt = new Achievement("dirt", "dirt", -2, 0, Blocks.dirt, AchievementList.openInventory);
	public static final Achievement diamondHoe = new Achievement("diamondHoe", "diamondHoe", -3, 3, Items.diamond_hoe, AchievementList.diamonds).setSpecial();
	
	public static AchievementPage page = new AchievementPage("AllTheThings", mineCopper, pyromaniac, steveAlmighty, mineUranium, mineGem, miles, pink, jeweller, marry, alloy, noPlace);
	
	public static void init(){
		AchievementPage.registerAchievementPage(page);
		
		mineCopper.registerStat();
		jeweller.registerStat();
		pyromaniac.registerStat();
		steveAlmighty.registerStat();
		mineUranium.registerStat();
		mineGem.registerStat();
		miles.registerStat();
		pink.registerStat();
		dirt.registerStat();
		diamondHoe.registerStat();
		marry.registerStat();
		alloy.registerStat();
		noPlace.registerStat();
	}
}
