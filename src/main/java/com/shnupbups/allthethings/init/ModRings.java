package com.shnupbups.allthethings.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.shnupbups.allthethings.item.ItemBasic;
import com.shnupbups.allthethings.utility.Register;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRings {
	public static final ItemBasic ring=new ItemBasic("ring",ModCreativeTabs.tool);
	public static final ItemBasic silverRing=new ItemBasic("ringSilver",ModCreativeTabs.tool);
	public static final ItemBasic onyxRing=new ItemBasic("ringOnyx",ModCreativeTabs.tool);
	public static final ItemBasic rubyRing=new ItemBasic("ringRuby",ModCreativeTabs.tool);
	public static final ItemBasic sapphireRing=new ItemBasic("ringSapphire",ModCreativeTabs.tool);
	public static final ItemBasic amberRing=new ItemBasic("ringAmber",ModCreativeTabs.tool);
	public static final ItemBasic jadeRing=new ItemBasic("ringJade",ModCreativeTabs.tool);
	public static final ItemBasic citrineRing=new ItemBasic("ringCitrine",ModCreativeTabs.tool);
	public static final ItemBasic amethystRing=new ItemBasic("ringAmethyst",ModCreativeTabs.tool);
	public static final ItemBasic carnelianRing=new ItemBasic("ringCarnelian",ModCreativeTabs.tool);
	public static final ItemBasic amazoniteRing=new ItemBasic("ringAmazonite",ModCreativeTabs.tool);
	public static final ItemBasic garnetRing=new ItemBasic("ringGarnet",ModCreativeTabs.tool);
	public static final ItemBasic kunziteRing=new ItemBasic("ringKunzite",ModCreativeTabs.tool);
	public static final ItemBasic aquamarineRing=new ItemBasic("ringAquamarine",ModCreativeTabs.tool);
	public static final ItemBasic diamondRing=new ItemBasic("ringDiamond",ModCreativeTabs.tool);
	public static final ItemBasic emeraldRing=new ItemBasic("ringEmerald",ModCreativeTabs.tool);
	public static final ItemBasic netherQuartzRing=new ItemBasic("ringNetherQuartz",ModCreativeTabs.tool);
	public static final ItemBasic voidiumRing=new ItemBasic("ringVoidium",ModCreativeTabs.tool,"§8And You Stuck It On a Ring. It Feels... Powerful. §2RADIOACTIVE");
	public static final ItemBasic fyrestoneRing=new ItemBasic("ringFyrestone",ModCreativeTabs.tool);
	public static final ItemBasic onyxSilverRing=new ItemBasic("ringOnyxSilver",ModCreativeTabs.tool);
	public static final ItemBasic rubySilverRing=new ItemBasic("ringRubySilver",ModCreativeTabs.tool);
	public static final ItemBasic sapphireSilverRing=new ItemBasic("ringSapphireSilver",ModCreativeTabs.tool);
	public static final ItemBasic amberSilverRing=new ItemBasic("ringAmberSilver",ModCreativeTabs.tool);
	public static final ItemBasic jadeSilverRing=new ItemBasic("ringJadeSilver",ModCreativeTabs.tool);
	public static final ItemBasic citrineSilverRing=new ItemBasic("ringCitrineSilver",ModCreativeTabs.tool);
	public static final ItemBasic amethystSilverRing=new ItemBasic("ringAmethystSilver",ModCreativeTabs.tool);
	public static final ItemBasic carnelianSilverRing=new ItemBasic("ringCarnelianSilver",ModCreativeTabs.tool);
	public static final ItemBasic amazoniteSilverRing=new ItemBasic("ringAmazoniteSilver",ModCreativeTabs.tool);
	public static final ItemBasic garnetSilverRing=new ItemBasic("ringGarnetSilver",ModCreativeTabs.tool);
	public static final ItemBasic kunziteSilverRing=new ItemBasic("ringKunziteSilver",ModCreativeTabs.tool);
	public static final ItemBasic aquamarineSilverRing=new ItemBasic("ringAquamarineSilver",ModCreativeTabs.tool);
	public static final ItemBasic diamondSilverRing=new ItemBasic("ringDiamondSilver",ModCreativeTabs.tool);
	public static final ItemBasic emeraldSilverRing=new ItemBasic("ringEmeraldSilver",ModCreativeTabs.tool);
	public static final ItemBasic netherQuartzSilverRing=new ItemBasic("ringNetherQuartzSilver",ModCreativeTabs.tool);
	public static final ItemBasic voidiumSilverRing=new ItemBasic("ringVoidiumSilver",ModCreativeTabs.tool,"§8And You Stuck It On a Ring. It Feels... Powerful. §2RADIOACTIVE");
	public static final ItemBasic fyrestoneSilverRing=new ItemBasic("ringFyrestoneSilver",ModCreativeTabs.tool);

	public static void init() {
		// Base Rings
		GameRegistry.registerItem(ring,ring.getTrueUnlocalizedName());
		GameRegistry.registerItem(silverRing,silverRing.getTrueUnlocalizedName());
		// Material Rings
		Register.registerRing(onyxRing,onyxSilverRing,onyxRing.getTrueUnlocalizedName(),onyxSilverRing.getTrueUnlocalizedName(),ModItems.gemOnyx);
		Register.registerRing(rubyRing,rubySilverRing,rubyRing.getTrueUnlocalizedName(),rubySilverRing.getTrueUnlocalizedName(),ModItems.gemRuby);
		Register.registerRing(sapphireRing,sapphireSilverRing,sapphireRing.getTrueUnlocalizedName(),sapphireSilverRing.getTrueUnlocalizedName(),ModItems.gemSapphire);
		Register.registerRing(amberRing,amberSilverRing,amberRing.getTrueUnlocalizedName(),amberSilverRing.getTrueUnlocalizedName(),ModItems.gemAmber);
		Register.registerRing(jadeRing,jadeSilverRing,jadeRing.getTrueUnlocalizedName(),jadeSilverRing.getTrueUnlocalizedName(),ModItems.gemJade);
		Register.registerRing(citrineRing,citrineSilverRing,citrineRing.getTrueUnlocalizedName(),citrineSilverRing.getTrueUnlocalizedName(),ModItems.gemCitrine);
		Register.registerRing(amethystRing,amethystSilverRing,amethystRing.getTrueUnlocalizedName(),amethystSilverRing.getTrueUnlocalizedName(),ModItems.gemAmethyst);
		Register.registerRing(carnelianRing,carnelianSilverRing,carnelianRing.getTrueUnlocalizedName(),carnelianSilverRing.getTrueUnlocalizedName(),ModItems.gemCarnelian);
		Register.registerRing(amazoniteRing,amazoniteSilverRing,amazoniteRing.getTrueUnlocalizedName(),amazoniteSilverRing.getTrueUnlocalizedName(),ModItems.gemAmazonite);
		Register.registerRing(garnetRing,garnetSilverRing,garnetRing.getTrueUnlocalizedName(),garnetSilverRing.getTrueUnlocalizedName(),ModItems.gemGarnet);
		Register.registerRing(kunziteRing,kunziteSilverRing,kunziteRing.getTrueUnlocalizedName(),kunziteSilverRing.getTrueUnlocalizedName(),ModItems.gemKunzite);
		Register.registerRing(aquamarineRing,aquamarineSilverRing,aquamarineRing.getTrueUnlocalizedName(),aquamarineSilverRing.getTrueUnlocalizedName(),ModItems.gemAquamarine);
		Register.registerRing(diamondRing,diamondSilverRing,diamondRing.getTrueUnlocalizedName(),diamondSilverRing.getTrueUnlocalizedName(),ModItems.gemDiamond);
		Register.registerRing(emeraldRing,emeraldSilverRing,emeraldRing.getTrueUnlocalizedName(),emeraldSilverRing.getTrueUnlocalizedName(),Items.emerald);
		Register.registerRing(netherQuartzRing,netherQuartzSilverRing,netherQuartzRing.getTrueUnlocalizedName(),netherQuartzSilverRing.getTrueUnlocalizedName(),ModItems.gemNetherQuartz);
		Register.registerRing(voidiumRing,voidiumSilverRing,voidiumRing.getTrueUnlocalizedName(),voidiumSilverRing.getTrueUnlocalizedName(),ModItems.voidiumCutRadioactiveFocused);
		Register.registerRing(fyrestoneRing,fyrestoneSilverRing,fyrestoneRing.getTrueUnlocalizedName(),fyrestoneSilverRing.getTrueUnlocalizedName(),ModItems.fyrestoneCut);
		GameRegistry.addRecipe(new ItemStack(ring),"bbb","b b","bbb",'b',ModItems.goldBand);
		GameRegistry.addRecipe(new ItemStack(silverRing),"bbb","b b","bbb",'b',ModItems.silverBand);
	}
}
