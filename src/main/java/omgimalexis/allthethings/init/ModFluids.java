package omgimalexis.allthethings.init;

import omgimalexis.allthethings.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
	public static final Fluid moltenIronFluid = new Fluid("moltenIron").setTemperature(1300).setViscosity(6000).setDensity(3000).setLuminosity(12);
	
	public static void init() {
		FluidRegistry.registerFluid(moltenIronFluid);
		
		LogHelper.info("Fluids initialized successfully!");
	}
}
