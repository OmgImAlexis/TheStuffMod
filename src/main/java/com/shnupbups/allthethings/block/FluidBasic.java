package com.shnupbups.allthethings.block;

import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import com.shnupbups.allthethings.lib.Reference;

public class FluidBasic extends Fluid {
	public FluidBasic(String fluidName) {
		super(fluidName);
	}

	public FluidBasic(String fluidName,int temperature,int viscosity,int density,int luminosity) {
		this(fluidName);
		this.setTemperature(temperature);
		this.setViscosity(viscosity);
		this.setDensity(density);
		this.setLuminosity(luminosity);
	}

	public IIcon getStillIcon() {
		return ((BlockBasicFluid)this.getBlock()).stillIcon;
	}

	public IIcon getFlowingIcon() {
		return ((BlockBasicFluid)this.getBlock()).flowingIcon;
	}

	public int getColor() {
		return ((BlockBasicFluid)this.getBlock()).getBlockColor();
	}

	public String getLocalizedName(FluidStack stack) {
		return StatCollector.translateToLocal(this.getUnlocalizedName());
	}

	public String getUnlocalizedName() {
		return Reference.MOD_ID+":"+this.unlocalizedName;
	}
}
