package com.omgimalexis.allthethings.init;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.omgimalexis.allthethings.handler.ConfigurationHandler;
import com.omgimalexis.allthethings.world.BerryBushGen;

import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId == -1) {
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		} else if(world.provider.dimensionId == 0) {
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		} else if(world.provider.dimensionId == 1) {
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		} else if(world.provider.dimensionId == ConfigurationHandler.ustherID) {
			generateUsther(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int i, int j) {
		for(int k = 0; k < 20; k++) {
			int voidiumOreXCoord = i + random.nextInt(16);
			int voidiumOreYCoord = random.nextInt(200);
			int voidiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreVoidium, 4, Blocks.end_stone)).generate(world, random, voidiumOreXCoord, voidiumOreYCoord, voidiumOreZCoord);
		}
	}

	private void generateSurface(World world, Random random, int i, int j) {
		for(int k = 0; k < 10; k++) {
			int onyxOreXCoord = i + random.nextInt(16);
			int onyxOreYCoord = random.nextInt(16);
			int onyxOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreOnyx, 3)).generate(world, random, onyxOreXCoord, onyxOreYCoord, onyxOreZCoord);
		}
		for(int l = 0; l < 40; l++) {
			int rubyOreXCoord = i + random.nextInt(16);
			int rubyOreYCoord = random.nextInt(32);
			int rubyOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreRuby, 3)).generate(world, random, rubyOreXCoord, rubyOreYCoord, rubyOreZCoord);
		}
		for(int m = 0; m < 20; m++) {
			int citrineOreXCoord = i + random.nextInt(16);
			int citrineOreYCoord = random.nextInt(24);
			int citrineOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreCitrine, 3)).generate(world, random, citrineOreXCoord, citrineOreYCoord, citrineOreZCoord);
		}
		for(int o = 0; o < 30; o++) {
			int jadeOreXCoord = i + random.nextInt(16);
			int jadeOreYCoord = random.nextInt(24);
			int jadeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreJade, 3)).generate(world, random, jadeOreXCoord, jadeOreYCoord, jadeOreZCoord);
		}
		for(int p = 0; p < 40; p++) {
			int sapphireOreXCoord = i + random.nextInt(16);
			int sapphireOreYCoord = random.nextInt(32);
			int sapphireOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreSapphire, 3)).generate(world, random, sapphireOreXCoord, sapphireOreYCoord, sapphireOreZCoord);
		}
		for(int q = 0; q < 30; q++) {
			int amethystOreXCoord = i + random.nextInt(16);
			int amethystOreYCoord = random.nextInt(24);
			int amethystOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreAmethyst, 3)).generate(world, random, amethystOreXCoord, amethystOreYCoord, amethystOreZCoord);
		}
		for(int r = 0; r < 20; r++) {
			int carnelianOreXCoord = i + random.nextInt(16);
			int carnelianOreYCoord = random.nextInt(24);
			int carnelianOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreCarnelian, 3)).generate(world, random, carnelianOreXCoord, carnelianOreYCoord, carnelianOreZCoord);
		}
		for(int r = 0; r < 40; r++) {
			int topazOreXCoord = i + random.nextInt(16);
			int topazOreYCoord = random.nextInt(24);
			int topazOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreTopaz, 3)).generate(world, random, topazOreXCoord, topazOreYCoord, topazOreZCoord);
		}
		for(int q = 0; q < 5; q++) {
			int voidiumBedrockOreXCoord = i + random.nextInt(16);
			int voidiumBedrockOreYCoord = random.nextInt(6);
			int voidiumBedrockOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreVoidiumBedrock, 3)).generate(world, random, voidiumBedrockOreXCoord, voidiumBedrockOreYCoord, voidiumBedrockOreZCoord);
		}
		if(ConfigurationHandler.emeraldSpawn) {
			for(int l = 0; l < 40; l++) {
				int emeraldOreXCoord = i + random.nextInt(16);
				int emeraldOreYCoord = random.nextInt(32);
				int emeraldOreZCoord = j + random.nextInt(16);
				(new WorldGenMinable(Blocks.emerald_ore, 3)).generate(world, random, emeraldOreXCoord, emeraldOreYCoord, emeraldOreZCoord);
			}
		}
		for(int l = 0; l < 15; l++) {
			int uraniumOreXCoord = i + random.nextInt(16);
			int uraniumOreYCoord = random.nextInt(64);
			int uraniumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreUranium, 3)).generate(world, random, uraniumOreXCoord, uraniumOreYCoord, uraniumOreZCoord);
		}
		for(int l = 0; l < 15; l++) {
			int iridiumOreXCoord = i + random.nextInt(16);
			int iridiumOreYCoord = random.nextInt(32);
			int iridiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreIridium, 3)).generate(world, random, iridiumOreXCoord, iridiumOreYCoord, iridiumOreZCoord);
		}
		for(int l = 0; l < 40; l++) {
			int copperOreXCoord = i + random.nextInt(16);
			int copperOreYCoord = random.nextInt(128);
			int copperOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreCopper, 6)).generate(world, random, copperOreXCoord, copperOreYCoord, copperOreZCoord);
		}
		for(int l = 0; l < 30; l++) {
			int tinOreXCoord = i + random.nextInt(16);
			int tinOreYCoord = random.nextInt(64);
			int tinOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreTin, 5)).generate(world, random, tinOreXCoord, tinOreYCoord, tinOreZCoord);
		}
		for(int l = 0; l < 30; l++) {
			int leadOreXCoord = i + random.nextInt(16);
			int leadOreYCoord = random.nextInt(64);
			int leadOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreLead, 4)).generate(world, random, leadOreXCoord, leadOreYCoord, leadOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int silverOreXCoord = i + random.nextInt(16);
			int silverOreYCoord = random.nextInt(32);
			int silverOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreSilver, 3)).generate(world, random, silverOreXCoord, silverOreYCoord, silverOreZCoord);
		}
		for(int l = 0; l < 15; l++) {
			int platinumOreXCoord = i + random.nextInt(16);
			int platinumOreYCoord = random.nextInt(32);
			int platinumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.orePlatinum, 3)).generate(world, random, platinumOreXCoord, platinumOreYCoord, platinumOreZCoord);
		}
		for(int l = 0; l < 10; l++) {
			int malagniteOreXCoord = i + random.nextInt(16);
			int malagniteOreYCoord = random.nextInt(16);
			int malagniteOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreMalagnite, 5)).generate(world, random, malagniteOreXCoord, malagniteOreYCoord, malagniteOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int titaniumOreXCoord = i + random.nextInt(16);
			int titaniumOreYCoord = random.nextInt(32);
			int titaniumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreTitanium, 4)).generate(world, random, titaniumOreXCoord, titaniumOreYCoord, titaniumOreZCoord);
		}
		for(int l = 0; l < 30; l++) {
			int aluminiumOreXCoord = i + random.nextInt(16);
			int aluminiumOreYCoord = random.nextInt(64);
			int aluminiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreAluminium, 5)).generate(world, random, aluminiumOreXCoord, aluminiumOreYCoord, aluminiumOreZCoord);
		}
		for(int l = 0; l < 25; l++) {
			int zincOreXCoord = i + random.nextInt(16);
			int zincOreYCoord = random.nextInt(64);
			int zincOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreZinc, 4)).generate(world, random, zincOreXCoord, zincOreYCoord, zincOreZCoord);
		}
		for(int l = 0; l < 10; l++) {
			int plutoniumOreXCoord = i + random.nextInt(16);
			int plutoniumOreYCoord = random.nextInt(32);
			int plutoniumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.orePlutonium, 3)).generate(world, random, plutoniumOreXCoord, plutoniumOreYCoord, plutoniumOreZCoord);
		}
		for(int l = 0; l < 30; l++) {
			int nickelOreXCoord = i + random.nextInt(16);
			int nickelOreYCoord = random.nextInt(64);
			int nickelOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreNickel, 5)).generate(world, random, nickelOreXCoord, nickelOreYCoord, nickelOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int chromiumOreXCoord = i + random.nextInt(16);
			int chromiumOreYCoord = random.nextInt(32);
			int chromiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreChromium, 3)).generate(world, random, chromiumOreXCoord, chromiumOreYCoord, chromiumOreZCoord);
		}
		for(int l = 0; l < 10; l++) {
			int cobaltOreXCoord = i + random.nextInt(16);
			int cobaltOreYCoord = random.nextInt(32);
			int cobaltOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreCobalt, 3)).generate(world, random, cobaltOreXCoord, cobaltOreYCoord, cobaltOreZCoord);
		}
		for(int l = 0; l < 25; l++) {
			int tungstenOreXCoord = i + random.nextInt(16);
			int tungstenOreYCoord = random.nextInt(32);
			int tungstenOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreTungsten, 3)).generate(world, random, tungstenOreXCoord, tungstenOreYCoord, tungstenOreZCoord);
		}
		for(int l = 0; l < 10; l++) {
			int rhodiumOreXCoord = i + random.nextInt(16);
			int rhodiumOreYCoord = random.nextInt(16);
			int rhodiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreRhodium, 5)).generate(world, random, rhodiumOreXCoord, rhodiumOreYCoord, rhodiumOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int manganeseOreXCoord = i + random.nextInt(16);
			int manganeseOreYCoord = random.nextInt(32);
			int manganeseOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreManganese, 4)).generate(world, random, manganeseOreXCoord, manganeseOreYCoord, manganeseOreZCoord);
		}
		for(int l = 0; l < 30; l++) {
			int siliconOreXCoord = i + random.nextInt(16);
			int siliconOreYCoord = random.nextInt(64);
			int siliconOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreSilicon, 5)).generate(world, random, siliconOreXCoord ,siliconOreYCoord, siliconOreZCoord);
		}
		for(int l = 0; l < 10; l++) {
			int fossilXCoord = i + random.nextInt(16);
			int fossilYCoord = random.nextInt(16);
			int fossilZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.fossil, 3)).generate(world, random, fossilXCoord, fossilYCoord, fossilZCoord);
		}
		for(int l = 0; l < 10; l++) {
			int fossilSkullXCoord = i + random.nextInt(16);
			int fossilSkullYCoord = random.nextInt(8);
			int fossilSkullZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.fossilSkull, 3)).generate(world, random, fossilSkullXCoord, fossilSkullYCoord, fossilSkullZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int adamaniteOreXCoord = i + random.nextInt(16);
			int adamaniteOreYCoord = random.nextInt(32);
			int adamaniteOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreAdamanite, 3)).generate(world, random, adamaniteOreXCoord, adamaniteOreYCoord, adamaniteOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int bluriteOreXCoord = i + random.nextInt(16);
			int bluriteOreYCoord = random.nextInt(32);
			int bluriteOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreBlurite, 3)).generate(world, random, bluriteOreXCoord, bluriteOreYCoord, bluriteOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int daeyaltOreXCoord = i + random.nextInt(16);
			int daeyaltOreYCoord = random.nextInt(32);
			int daeyaltOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreDaeyalt, 3)).generate(world, random, daeyaltOreXCoord, daeyaltOreYCoord, daeyaltOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int lunarOreXCoord = i + random.nextInt(16);
			int lunarOreYCoord = random.nextInt(32);
			int lunarOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreLunar, 3)).generate(world, random, lunarOreXCoord, lunarOreYCoord, lunarOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int mithrilOreXCoord = i + random.nextInt(16);
			int mithrilOreYCoord = random.nextInt(32);
			int mithrilOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreMithril, 3)).generate(world, random, mithrilOreXCoord, mithrilOreYCoord, mithrilOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int opalOreXCoord = i + random.nextInt(16);
			int opalOreYCoord = random.nextInt(32);
			int opalOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreOpal, 3)).generate(world, random, opalOreXCoord, opalOreYCoord, opalOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int quartzOreXCoord = i + random.nextInt(16);
			int quartzOreYCoord = random.nextInt(32);
			int quartzOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreQuartz, 3)).generate(world, random, quartzOreXCoord, quartzOreYCoord, quartzOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int rubiumOreXCoord = i + random.nextInt(16);
			int rubiumOreYCoord = random.nextInt(32);
			int rubiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreRubium, 3)).generate(world, random, rubiumOreXCoord, rubiumOreYCoord, rubiumOreZCoord);
		}
		for(int l = 0; l < 20; l++) {
			int runiteOreXCoord = i + random.nextInt(16);
			int runiteOreYCoord = random.nextInt(32);
			int runiteOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreRunite, 3)).generate(world, random, runiteOreXCoord, runiteOreYCoord, runiteOreZCoord);
		}
		
		for(int l = 0; l < random.nextInt(3); l++) {
			int xPos = i + random.nextInt(16);
            int yPos = 128;
            int zPos = j + random.nextInt(16);
            int berryType = random.nextInt(4);
            if(berryType < 1) new BerryBushGen(ModBlocks.strawberryBush, 1, 10, true).generate(world, random, xPos, yPos, zPos);
            else if(berryType < 2) new BerryBushGen(ModBlocks.raspberryBush, 1, 10, true).generate(world, random, xPos, yPos, zPos);
            else if(berryType < 3) new BerryBushGen(ModBlocks.blueberryBush, 1, 10, true).generate(world, random, xPos, yPos, zPos);
            else if(berryType < 4) new BerryBushGen(ModBlocks.blackberryBush, 1, 10, true).generate(world, random, xPos, yPos, zPos);
		}
		
		for(int l = 0; l < random.nextInt(3); l++) {
			int xPos = i + random.nextInt(16);
            int yPos = 128;
            int zPos = j + random.nextInt(16);
            int cropType = random.nextInt(5);
            if(cropType < 2) new BerryBushGen(ModBlocksPreItems.lettuceCrop, random.nextInt(7), 3, true).generate(world, random, xPos, yPos, zPos);
            else if(cropType < 4) new BerryBushGen(ModBlocksPreItems.tomatoCrop, random.nextInt(7), 3, true).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
		for(int r = 0; r < 30; r++) {
			int fyrestoneOreXCoord = i + random.nextInt(16);
			int fyrestoneOreYCoord = random.nextInt(128);
			int fyrestoneOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreFyrestone, 4, Blocks.netherrack)).generate(world, random, fyrestoneOreXCoord, fyrestoneOreYCoord, fyrestoneOreZCoord);
		}
		for(int r = 0; r < 10; r++) {
			int trytementiumOreXCoord = i + random.nextInt(16);
			int trytementiumOreYCoord = random.nextInt(128);
			int trytementiumOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreTrytementium, 3, Blocks.netherrack)).generate(world, random, trytementiumOreXCoord, trytementiumOreYCoord, trytementiumOreZCoord);
		}
	}
	
	private void generateUsther(World world, Random random, int i, int j) {
		for(int z = 0; z < 20; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(200);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreCrymeretye, 3, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		for(int z = 0; z < 20; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(200);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreMuktaphlyte, 3, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		for(int z = 0; z < 20; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(200);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreJonjronyphyll, 3, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		for(int z = 0; z < 20; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(200);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreKraktachnar, 3, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		for(int z = 0; z < 20; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(200);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreXaldriodythidyte, 3, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		for(int z = 0; z < 50; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(16);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreGraeconthylynium, 10, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		for(int z = 0; z < 60; z++) {
			int crymeretyeOreXCoord = i + random.nextInt(16);
			int crymeretyeOreYCoord = random.nextInt(16);
			int crymeretyeOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.oreSchulbradethenairdivite, 7, ModBlocks.ustherite)).generate(world, random, crymeretyeOreXCoord, crymeretyeOreYCoord, crymeretyeOreZCoord);
		}
		
		for(int l = 0; l < random.nextInt(3); l++) {
			int xPos = i + random.nextInt(16);
            int yPos = 128;
            int zPos = j + random.nextInt(16);
            int cropType = random.nextInt(3);
            if(cropType < 2) new BerryBushGen(ModBlocks.physhroom, 0, 3, true).generate(world, random, xPos, yPos, zPos);
		}
	}
}
