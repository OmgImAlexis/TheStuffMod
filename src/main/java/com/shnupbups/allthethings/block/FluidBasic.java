package com.shnupbups.allthethings.block;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import java.util.Locale;

public class FluidBasic extends Fluid {
    public FluidBasic(String fluidName) {
        super(fluidName);
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
