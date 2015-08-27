package com.shnupbups.allthethings.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.block.IDismantleable;
import cofh.api.item.IToolHammer;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityBattery;
import com.shnupbups.allthethings.tileEntity.TileEntityCompressor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBattery extends BlockContainer implements IDismantleable {
	
	public int maxStorage = 200000;
	public int maxTransfer = 500;

	public BlockBattery(String name, CreativeTabs tab) {
		super(Material.rock);
		setCreativeTab(tab);
		setHardness(3.5F);
		setBlockName(name);
		Reference.incrementBlocks();
	}
	
	public BlockBattery(String name, CreativeTabs tab, int maxStorage, int maxTransfer) {
		this(name, tab);
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
	public IIcon topIconOutput;
	public IIcon bottomIconOutput;
	public IIcon sideIconFull;
	public IIcon sideIcon87;
	public IIcon sideIcon75;
	public IIcon sideIcon62;
	public IIcon sideIcon50;
	public IIcon sideIcon37;
	public IIcon sideIcon25;
	public IIcon sideIcon12;
	public IIcon sideIconEmpty;
	public IIcon sideIconOutput;
	
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
		sideIconOutput = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Output")));
		topIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Top")));
		bottomIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"Bottom")));
		topIconOutput = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"TopOutput")));
		bottomIconOutput = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()+"BottomOutput")));
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        switch(side) {
        	case 0:return bottomIcon;
        	case 1:return topIconOutput;
        	case 3-5:return sideIconEmpty;
        }
        return sideIconEmpty;
    }
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side){
        TileEntityBattery tileentity = ((TileEntityBattery)world.getTileEntity(x, y, z));

        if(side == 0) {
        	if(tileentity != null && tileentity.outputSides[side] == true) return bottomIconOutput;
        	else return bottomIcon;
        } else if(side == 1) {
        	if(tileentity != null && tileentity.outputSides[side] == true) return topIconOutput;
        	else return topIcon;
        } else {
        	if(tileentity != null && tileentity.outputSides[side] == true) {
        		return sideIconOutput;
        	} else if(tileentity != null && ((tileentity.getEnergyStored(ForgeDirection.UNKNOWN)*100)/tileentity.getMaxEnergyStored(ForgeDirection.UNKNOWN)) == 0) {
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
        }
    }
	
	public IIcon getIcon(int side, int power, boolean output) {
		if(side == 0) {
        	if(output) return bottomIconOutput;
        	else return bottomIcon;
        } else if(side == 1) {
        	if(output) return topIconOutput;
        	else return topIcon;
        } else {
        	if(output) {
        		return sideIconOutput;
        	} else if((power*100)/this.maxStorage == 0) {
        		return sideIconEmpty;
        	} else if((power*100)/this.maxStorage <= 14) {
        		return sideIcon12;
        	} else if((power*100)/this.maxStorage <= 28) {
        		return sideIcon25;
        	} else if((power*100)/this.maxStorage <= 42) {
        		return sideIcon37;
        	} else if((power*100)/this.maxStorage <= 56) {
        		return sideIcon50;
        	} else if((power*100)/this.maxStorage <= 70) {
        		return sideIcon62;
        	} else if((power*100)/this.maxStorage <= 84) {
        		return sideIcon75;
        	} else if((power*100)/this.maxStorage <= 99) {
        		return sideIcon87;
        	} else return sideIconFull;
        }
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
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("tiledata") && world.getTileEntity(x, y, z) != null) {
			TileEntityBattery tile = new TileEntityBattery();
			tile.readFromNBT(stack.getTagCompound().getCompoundTag("tiledata"));
			world.setTileEntity(x, y, z, tile);
		}
	}

	@Override
	public ArrayList<ItemStack> dismantleBlock(EntityPlayer player, World world, int x, int y, int z, boolean returnDrops) {
		ArrayList returnList = new ArrayList<ItemStack>();
		ItemStack drop = new ItemStack(this);
		drop.setTagCompound(new NBTTagCompound());
		drop.getTagCompound().setTag("tiledata", (((TileEntityBattery) world.getTileEntity(x, y, z)).getTagCompound()));
		returnList.add(drop);
		this.breakBlock(world, x, y, z, this, world.getBlockMetadata(x, y, z));
		world.setBlockToAir(x, y, z);
		return returnList;
	}

	@Override
	public boolean canDismantle(EntityPlayer player, World world, int x, int y, int z) {
		return true;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9) {
		if(player.getHeldItem() != null && player.getHeldItem().getItem() != null && player.getHeldItem().getItem() instanceof IToolHammer) {
			((TileEntityBattery) world.getTileEntity(x, y, z)).outputSides[side] = !((TileEntityBattery) world.getTileEntity(x, y, z)).outputSides[side];
			world.markBlockForUpdate(x, y, z);
		}
		return false;
	}
}
