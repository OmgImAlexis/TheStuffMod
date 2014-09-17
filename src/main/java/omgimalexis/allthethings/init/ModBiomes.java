package omgimalexis.allthethings.init;

import omgimalexis.allthethings.biome.BasicBiome;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class ModBiomes {
	public static final BiomeGenBase cherryForest = new BasicBiome(40, "Cherry Forest", 0x7cae9b);
	
	public static void init() {
		BiomeManager.warmBiomes.add(new BiomeEntry(cherryForest, 10));
	}
}
