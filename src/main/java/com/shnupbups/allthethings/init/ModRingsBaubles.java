package com.shnupbups.allthethings.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.shnupbups.allthethings.item.ItemRing;
import com.shnupbups.allthethings.utility.Register;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRingsBaubles {
	public static final ItemRing ring = new ItemRing("ring");
	public static final ItemRing silverRing = new ItemRing("ringSilver");
	
	public static final ItemRing onyxRing = new ItemRing("ringOnyx");
	public static final ItemRing rubyRing = new ItemRing("ringRuby");
	public static final ItemRing sapphireRing = new ItemRing("ringSapphire");
	public static final ItemRing amberRing = new ItemRing("ringAmber");
	public static final ItemRing jadeRing = new ItemRing("ringJade");
	public static final ItemRing citrineRing = new ItemRing("ringCitrine");
	public static final ItemRing amethystRing = new ItemRing("ringAmethyst");
	public static final ItemRing carnelianRing = new ItemRing("ringCarnelian");
	public static final ItemRing amazoniteRing = new ItemRing("ringAmazonite");
	public static final ItemRing garnetRing = new ItemRing("ringGarnet");
	public static final ItemRing kunziteRing = new ItemRing("ringKunzite");
	public static final ItemRing aquamarineRing = new ItemRing("ringAquamarine");
	
	public static final ItemRing diamondRing = new ItemRing("ringDiamond");
	public static final ItemRing emeraldRing = new ItemRing("ringEmerald");
	public static final ItemRing netherQuartzRing = new ItemRing("ringNetherQuartz");
	
	public static final ItemRing voidiumRing = new ItemRing("ringVoidium",true,"§8And You Stuck It On a Ring. It Feels... Powerful. §2RADIOACTIVE");
	public static final ItemRing fyrestoneRing = new ItemRing("ringFyrestone",true);
	
	public static final ItemRing onyxSilverRing = new ItemRing("ringOnyxSilver");
	public static final ItemRing rubySilverRing = new ItemRing("ringRubySilver");
	public static final ItemRing sapphireSilverRing = new ItemRing("ringSapphireSilver");
	public static final ItemRing amberSilverRing = new ItemRing("ringAmberSilver");
	public static final ItemRing jadeSilverRing = new ItemRing("ringJadeSilver");
	public static final ItemRing citrineSilverRing = new ItemRing("ringCitrineSilver");
	public static final ItemRing amethystSilverRing = new ItemRing("ringAmethystSilver");
	public static final ItemRing carnelianSilverRing = new ItemRing("ringCarnelianSilver");
	public static final ItemRing amazoniteSilverRing = new ItemRing("ringAmazoniteSilver");
	public static final ItemRing garnetSilverRing = new ItemRing("ringGarnetSilver");
	public static final ItemRing kunziteSilverRing = new ItemRing("ringKunziteSilver");
	public static final ItemRing aquamarineSilverRing = new ItemRing("ringAquamarineSilver");
	
	public static final ItemRing diamondSilverRing = new ItemRing("ringDiamondSilver");
	public static final ItemRing emeraldSilverRing = new ItemRing("ringEmeraldSilver");
	public static final ItemRing netherQuartzSilverRing = new ItemRing("ringNetherQuartzSilver");
	
	public static final ItemRing voidiumSilverRing = new ItemRing("ringVoidiumSilver",true,"§8And You Stuck It On a Ring. It Feels... Powerful. §2RADIOACTIVE");
	public static final ItemRing fyrestoneSilverRing = new ItemRing("ringFyrestoneSilver",true);
		
	public static void init() {
		// Base Rings
		GameRegistry.registerItem(ring, ring.getTrueUnlocalizedName());
		GameRegistry.registerItem(silverRing, silverRing.getTrueUnlocalizedName());
		
		// Material Rings
		Register.registerRing(onyxRing, onyxSilverRing, onyxRing.getTrueUnlocalizedName(), onyxSilverRing.getTrueUnlocalizedName(), ModItems.gemOnyx);
		Register.registerRing(rubyRing, rubySilverRing, rubyRing.getTrueUnlocalizedName(), rubySilverRing.getTrueUnlocalizedName(), ModItems.gemRuby);
		Register.registerRing(sapphireRing, sapphireSilverRing, sapphireRing.getTrueUnlocalizedName(), sapphireSilverRing.getTrueUnlocalizedName(), ModItems.gemSapphire);
		Register.registerRing(amberRing, amberSilverRing, amberRing.getTrueUnlocalizedName(), amberSilverRing.getTrueUnlocalizedName(), ModItems.gemAmber);
		Register.registerRing(jadeRing, jadeSilverRing, jadeRing.getTrueUnlocalizedName(), jadeSilverRing.getTrueUnlocalizedName(), ModItems.gemJade);
		Register.registerRing(citrineRing, citrineSilverRing, citrineRing.getTrueUnlocalizedName(), citrineSilverRing.getTrueUnlocalizedName(), ModItems.gemCitrine);
		Register.registerRing(amethystRing, amethystSilverRing, amethystRing.getTrueUnlocalizedName(), amethystSilverRing.getTrueUnlocalizedName(), ModItems.gemAmethyst);
		Register.registerRing(carnelianRing, carnelianSilverRing, carnelianRing.getTrueUnlocalizedName(), carnelianSilverRing.getTrueUnlocalizedName(), ModItems.gemCarnelian);
		Register.registerRing(amazoniteRing, amazoniteSilverRing, amazoniteRing.getTrueUnlocalizedName(), amazoniteSilverRing.getTrueUnlocalizedName(), ModItems.gemAmazonite);
		Register.registerRing(garnetRing, garnetSilverRing, garnetRing.getTrueUnlocalizedName(), garnetSilverRing.getTrueUnlocalizedName(), ModItems.gemGarnet);
		Register.registerRing(kunziteRing, kunziteSilverRing, kunziteRing.getTrueUnlocalizedName(), kunziteSilverRing.getTrueUnlocalizedName(), ModItems.gemKunzite);
		Register.registerRing(aquamarineRing, aquamarineSilverRing, aquamarineRing.getTrueUnlocalizedName(), aquamarineSilverRing.getTrueUnlocalizedName(), ModItems.gemAquamarine);
		
		Register.registerRing(diamondRing, diamondSilverRing, diamondRing.getTrueUnlocalizedName(), diamondSilverRing.getTrueUnlocalizedName(), ModItems.gemDiamond);
		Register.registerRing(emeraldRing, emeraldSilverRing, emeraldRing.getTrueUnlocalizedName(), emeraldSilverRing.getTrueUnlocalizedName(), Items.emerald);
		Register.registerRing(netherQuartzRing, netherQuartzSilverRing, netherQuartzRing.getTrueUnlocalizedName(), netherQuartzSilverRing.getTrueUnlocalizedName(), ModItems.gemNetherQuartz);
		
		Register.registerRing(voidiumRing, voidiumSilverRing, voidiumRing.getTrueUnlocalizedName(), voidiumSilverRing.getTrueUnlocalizedName(), ModItems.voidiumCutRadioactiveFocused);
		Register.registerRing(fyrestoneRing, fyrestoneSilverRing, fyrestoneRing.getTrueUnlocalizedName(), fyrestoneSilverRing.getTrueUnlocalizedName(), ModItems.fyrestoneCut);
	
		GameRegistry.addRecipe(new ItemStack(ring), "bbb", "b b", "bbb", 'b', ModItems.goldBand);
		GameRegistry.addRecipe(new ItemStack(silverRing), "bbb", "b b", "bbb", 'b', ModItems.silverBand);
	}
}
