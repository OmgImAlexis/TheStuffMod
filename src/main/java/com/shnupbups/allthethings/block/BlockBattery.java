package com.shnupbups.allthethings.block;

import com.shnupbups.allthethings.energy.IEnergy;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityBattery;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class BlockBattery extends BlockContainer {
	
	public int maxStorage = 200000;
	public int maxTransfer = 500;

	public BlockBattery(String name) {
		super(Material.rock);
		setHardness(3.5F);
		setBlockName(name);
		Reference.incrementBlocks();
	}
	
	public BlockBattery(String name, int maxStorage, int maxTransfer) {
		this(name);
		this.maxStorage = maxStorage;
		this.maxTransfer = maxTransfer;
	}

	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityBattery();
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		TileEntityBattery tileEntity = (TileEntityBattery) world.getTileEntity(x, y, z);
		tileEntity.updateEntity();
		world.scheduleBlockUpdate(x, y, z, this, 1);
	}
	
	@Override
	public int onBlockPlaced(World world, int int1, int int2, int int3, int int4, float float1, float float2, float float3, int int5) {
		world.scheduleBlockUpdate(int1, int2, int3, this, 1);
		return int5;
	}
	
	public IIcon topIcon;
	public IIcon bottomIcon;
	public IIcon sideIconFull;
	public IIcon sideIcon87;
	public IIcon sideIcon75;
	public IIcon sideIcon62;
	public IIcon sideIcon50;
	public IIcon sideIcon37;
	public IIcon sideIcon25;
	public IIcon sideIcon12;
	public IIcon sideIconEmpty;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		sideIconFull = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Full")));
		sideIcon87 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"87")));
		sideIcon75 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"75")));
		sideIcon62 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"62")));
		sideIcon50 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"50")));
		sideIcon37 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"37")));
		sideIcon25 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"25")));
		sideIcon12 = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"12")));
		sideIconEmpty = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Empty")));
		topIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Top")));
		bottomIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Bottom")));
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side){
        TileEntityBattery tileentity = ((TileEntityBattery)world.getTileEntity(x, y, z));

        if(side == 0) {
        	return bottomIcon;
        } else if(side == 1) {
        	return topIcon;
        } else if(side == 2) {
        	if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) == 0) {
        		return sideIconEmpty;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 14) {
        		return sideIcon12;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 28) {
        		return sideIcon25;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 42) {
        		return sideIcon37;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 56) {
        		return sideIcon50;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 70) {
        		return sideIcon62;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 84) {
        		return sideIcon75;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 99) {
        		return sideIcon87;
        	} else return sideIconFull;
        } else if(side == 3) {
        	if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) == 0) {
        		return sideIconEmpty;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 12) {
        		return sideIcon12;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 25) {
        		return sideIcon25;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 37) {
        		return sideIcon37;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 50) {
        		return sideIcon50;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 62) {
        		return sideIcon62;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 75) {
        		return sideIcon75;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 87) {
        		return sideIcon87;
        	} else return sideIconFull;
        } else if(side == 4) {
        	if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) == 0) {
        		return sideIconEmpty;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 12) {
        		return sideIcon12;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 25) {
        		return sideIcon25;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 37) {
        		return sideIcon37;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 50) {
        		return sideIcon50;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 62) {
        		return sideIcon62;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 75) {
        		return sideIcon75;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 87) {
        		return sideIcon87;
        	} else return sideIconFull;
        } else if(side == 5) {
        	if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) == 0) {
        		return sideIconEmpty;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 12) {
        		return sideIcon12;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 25) {
        		return sideIcon25;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 37) {
        		return sideIcon37;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 50) {
        		return sideIcon50;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 62) {
        		return sideIcon62;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 75) {
        		return sideIcon75;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) <= 87) {
        		return sideIcon87;
        	} else return sideIconFull;
        } return sideIconEmpty;
    }
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}
	
}
