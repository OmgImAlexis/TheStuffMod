package com.omgimalexis.allthethings.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.omgimalexis.allthethings.creativetabs.ModCreativeTabs;
import com.omgimalexis.allthethings.item.ItemBasic;
import com.omgimalexis.allthethings.utility.Register;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRings {
	public static final ItemBasic ring = new ItemBasic("ring", ModCreativeTabs.jewelry);
	public static final ItemBasic silverRing = new ItemBasic("ringSilver", ModCreativeTabs.jewelry);
	
	public static final ItemBasic onyxRing = new ItemBasic("ringOnyx", ModCreativeTabs.jewelry);
	public static final ItemBasic rubyRing = new ItemBasic("ringRuby", ModCreativeTabs.jewelry);
	public static final ItemBasic sapphireRing = new ItemBasic("ringSapphire", ModCreativeTabs.jewelry);
	public static final ItemBasic amberRing = new ItemBasic("ringAmber", ModCreativeTabs.jewelry);
	public static final ItemBasic jadeRing = new ItemBasic("ringJade", ModCreativeTabs.jewelry);
	public static final ItemBasic citrineRing = new ItemBasic("ringCitrine", ModCreativeTabs.jewelry);
	public static final ItemBasic amethystRing = new ItemBasic("ringAmethyst", ModCreativeTabs.jewelry);
	public static final ItemBasic carnelianRing = new ItemBasic("ringCarnelian", ModCreativeTabs.jewelry);
	public static final ItemBasic amazoniteRing = new ItemBasic("ringAmazonite", ModCreativeTabs.jewelry);
	public static final ItemBasic garnetRing = new ItemBasic("ringGarnet", ModCreativeTabs.jewelry);
	public static final ItemBasic kunziteRing = new ItemBasic("ringKunzite", ModCreativeTabs.jewelry);
	public static final ItemBasic aquamarineRing = new ItemBasic("ringAquamarine", ModCreativeTabs.jewelry);
	
	public static final ItemBasic diamondRing = new ItemBasic("ringDiamond", ModCreativeTabs.jewelry);
	public static final ItemBasic emeraldRing = new ItemBasic("ringEmerald", ModCreativeTabs.jewelry);
	public static final ItemBasic netherQuartzRing = new ItemBasic("ringNetherQuartz", ModCreativeTabs.jewelry);
	
	public static final ItemBasic voidiumRing = new ItemBasic("ringVoidium", ModCreativeTabs.jewelry);
	public static final ItemBasic fyrestoneRing = new ItemBasic("ringFyrestone", ModCreativeTabs.jewelry, "§8And You Stuck It On a Ring. It Feels... Powerful. §2RADIOACTIVE");
	
	public static final ItemBasic onyxSilverRing = new ItemBasic("ringOnyxSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic rubySilverRing = new ItemBasic("ringRubySilver", ModCreativeTabs.jewelry);
	public static final ItemBasic sapphireSilverRing = new ItemBasic("ringSapphireSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic amberSilverRing = new ItemBasic("ringAmberSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic jadeSilverRing = new ItemBasic("ringJadeSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic citrineSilverRing = new ItemBasic("ringCitrineSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic amethystSilverRing = new ItemBasic("ringAmethystSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic carnelianSilverRing = new ItemBasic("ringCarnelianSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic amazoniteSilverRing = new ItemBasic("ringAmazoniteSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic garnetSilverRing = new ItemBasic("ringGarnetSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic kunziteSilverRing = new ItemBasic("ringKunziteSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic aquamarineSilverRing = new ItemBasic("ringAquamarineSilver", ModCreativeTabs.jewelry);
	
	public static final ItemBasic diamondSilverRing = new ItemBasic("ringDiamondSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic emeraldSilverRing = new ItemBasic("ringEmeraldSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic netherQuartzSilverRing = new ItemBasic("ringNetherQuartzSilver", ModCreativeTabs.jewelry);
	
	public static final ItemBasic voidiumSilverRing = new ItemBasic("ringVoidiumSilver", ModCreativeTabs.jewelry);
	public static final ItemBasic fyrestoneSilverRing = new ItemBasic("ringFyrestoneSilver", ModCreativeTabs.jewelry, "§8And You Stuck It On a Ring. It Feels... Powerful. §2RADIOACTIVE");
		
	public static void init() {
		// Base Rings
		GameRegistry.registerItem(ring, ring.getUnlocalizedName());
		GameRegistry.registerItem(silverRing, silverRing.getUnlocalizedName());
		
		// Material Rings
		Register.registerRing(onyxRing, onyxSilverRing, onyxRing.getUnlocalizedName(), onyxSilverRing.getUnlocalizedName(), ModItems.gemOnyx);
		Register.registerRing(rubyRing, rubySilverRing, rubyRing.getUnlocalizedName(), rubySilverRing.getUnlocalizedName(), ModItems.gemRuby);
		Register.registerRing(sapphireRing, sapphireSilverRing, sapphireRing.getUnlocalizedName(), sapphireSilverRing.getUnlocalizedName(), ModItems.gemSapphire);
		Register.registerRing(amberRing, amberSilverRing, amberRing.getUnlocalizedName(), amberSilverRing.getUnlocalizedName(), ModItems.gemAmber);
		Register.registerRing(jadeRing, jadeSilverRing, jadeRing.getUnlocalizedName(), jadeSilverRing.getUnlocalizedName(), ModItems.gemJade);
		Register.registerRing(citrineRing, citrineSilverRing, citrineRing.getUnlocalizedName(), citrineSilverRing.getUnlocalizedName(), ModItems.gemCitrine);
		Register.registerRing(amethystRing, amethystSilverRing, amethystRing.getUnlocalizedName(), amethystSilverRing.getUnlocalizedName(), ModItems.gemAmethyst);
		Register.registerRing(carnelianRing, carnelianSilverRing, carnelianRing.getUnlocalizedName(), carnelianSilverRing.getUnlocalizedName(), ModItems.gemCarnelian);
		Register.registerRing(amazoniteRing, amazoniteSilverRing, amazoniteRing.getUnlocalizedName(), amazoniteSilverRing.getUnlocalizedName(), ModItems.gemAmazonite);
		Register.registerRing(garnetRing, garnetSilverRing, garnetRing.getUnlocalizedName(), garnetSilverRing.getUnlocalizedName(), ModItems.gemGarnet);
		Register.registerRing(kunziteRing, kunziteSilverRing, kunziteRing.getUnlocalizedName(), kunziteSilverRing.getUnlocalizedName(), ModItems.gemKunzite);
		Register.registerRing(aquamarineRing, aquamarineSilverRing, aquamarineRing.getUnlocalizedName(), aquamarineSilverRing.getUnlocalizedName(), ModItems.gemAquamarine);
		
		Register.registerRing(diamondRing, diamondSilverRing, diamondRing.getUnlocalizedName(), diamondSilverRing.getUnlocalizedName(), ModItems.gemDiamond);
		Register.registerRing(emeraldRing, emeraldSilverRing, emeraldRing.getUnlocalizedName(), emeraldSilverRing.getUnlocalizedName(), Items.emerald);
		Register.registerRing(netherQuartzRing, netherQuartzSilverRing, netherQuartzRing.getUnlocalizedName(), netherQuartzSilverRing.getUnlocalizedName(), ModItems.gemNetherQuartz);
		
		Register.registerRing(voidiumRing, voidiumSilverRing, voidiumRing.getUnlocalizedName(), voidiumSilverRing.getUnlocalizedName(), ModItems.voidiumCutRadioactiveFocused);
		Register.registerRing(fyrestoneRing, fyrestoneSilverRing, fyrestoneRing.getUnlocalizedName(), fyrestoneSilverRing.getUnlocalizedName(), ModItems.fyrestoneCut);
		
		GameRegistry.addRecipe(new ItemStack(ring), "bbb", "b b", "bbb", 'b', ModItems.goldBand);
		GameRegistry.addRecipe(new ItemStack(silverRing), "bbb", "b b", "bbb", 'b', ModItems.silverBand);
	}
}
