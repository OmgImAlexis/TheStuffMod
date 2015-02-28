package com.omgimalexis.allthethings.init;

import cpw.mods.fml.common.Loader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements {
	public static Achievement mineCopper = new Achievement("mineCopper", "mineCopper", -2, 0, ModBlocks.oreCopper, null).initIndependentStat();
	public static Achievement jeweller = new Achievement("jeweller", "jeweller", 2, 2, ModItems.ringForIcon, null).initIndependentStat();
	public static Achievement pyromaniac = new Achievement("pyromaniac", "pyromaniac", 0, 2, ModItems.ringForIcon, jeweller);
	public static Achievement steveAlmighty = new Achievement("steveAlmighty", "steveAlmighty", 2, 0, ModItems.ringForIcon, jeweller).setSpecial();
	public static Achievement mineUranium = new Achievement("mineUranium", "mineUranium", -4, 0, ModItems.uranium, null).initIndependentStat();
	public static Achievement mineGem = new Achievement("mineGem", "mineGem", 0, 0, ModItems.gemRuby, null).initIndependentStat();
	public static Achievement miles = new Achievement("88Miles", "88Miles", -4, 2, ModItems.plutonium, mineUranium);
	public static Achievement pink = new Achievement("pink", "pink", 4, 0, ModBlocks.cherryPlanks, null).initIndependentStat();
	public static Achievement noPlace = new Achievement("noPlace", "noPlace", -2, 2, ModArmour.bootsRuby, null).initIndependentStat();
	public static Achievement marry = new Achievement("marry", "marry", 4, 2, ModItems.ringForIcon, jeweller);
	public static Achievement bones = new Achievement("bones", "bones", -4, 4, Items.bone, null).initIndependentStat();
	public static Achievement alive = new Achievement("alive", "alive", -2, 4, ModItems.fossil, bones);
	public static Achievement machineBlock = new Achievement("machineBlock", "machineBlock", 0, 4, ModBlocks.machineBlock, null).initIndependentStat();
	public static Achievement machine = new Achievement("machine", "machine", 2, 4, ModBlocks.battery, machineBlock);
	public static Achievement alloy = new Achievement("alloy", "alloy", 4, 4, ModItems.ingotElectrum, machine);
	public static Achievement dirt = new Achievement("dirt", "dirt", -2, 0, Blocks.dirt, AchievementList.openInventory);
	public static Achievement diamondHoe = new Achievement("diamondHoe", "diamondHoe", -3, 3, Items.diamond_hoe, AchievementList.diamonds).setSpecial();
	
	public static AchievementPage page = new AchievementPage("AllTheThings", mineCopper, pyromaniac, steveAlmighty, mineUranium, mineGem, miles, pink, jeweller, marry, alloy, noPlace, bones, alive, machineBlock, machine);
	
	public static void init(){
		AchievementPage.registerAchievementPage(page);
		
		if(Loader.isModLoaded("Baubles")) {
			jeweller = new Achievement("jeweller", "jeweller", 2, 2, ModRingsBaubles.ring, null).initIndependentStat();
			pyromaniac = new Achievement("pyromaniac", "pyromaniac", 0, 2, ModRingsBaubles.fyrestoneRing, jeweller);
			steveAlmighty = new Achievement("steveAlmighty", "steveAlmighty", 2, 0, ModRingsBaubles.voidiumRing, jeweller);
			marry = new Achievement("marry", "marry", 4, 2, ModRingsBaubles.diamondRing, jeweller);
		}
		
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
		bones.registerStat();
		alive.registerStat();
		machineBlock.registerStat();
		machine.registerStat();
	}
}
