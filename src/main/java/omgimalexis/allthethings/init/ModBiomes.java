package omgimalexis.allthethings.init;

import omgimalexis.allthethings.biome.BiomeCherryForest;
import omgimalexis.allthethings.biome.BiomeRubberPlains;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class ModBiomes {
	public static final BiomeGenBase cherryForest = new BiomeCherryForest(40, "Cherry Forest", 0x7cae9b);
	public static final BiomeGenBase rubberPlains = new BiomeRubberPlains(40, "Rubber-Oak Plains", 0x89FFF1);
	
	public static void init() {
		BiomeManager.warmBiomes.add(new BiomeEntry(cherryForest, 10));
		BiomeManager.warmBiomes.add(new BiomeEntry(rubberPlains, 6));
	}
}
