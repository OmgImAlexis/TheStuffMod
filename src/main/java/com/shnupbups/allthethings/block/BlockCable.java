package com.shnupbups.allthethings.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cofh.api.block.IDismantleable;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityCable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCable extends Block implements IDismantleable {

	float pixel = 1f / 16f;
	
	public int maxStorage = 2000;
	public int maxTransfer = 1000;
	
	public BlockCable(String name, CreativeTabs tab) {
		super(Material.cloth);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		Reference.incrementBlocks();
	}
	
	public BlockCable(String name, CreativeTabs tab, int maxStorage, int maxTransfer) {
		this(name, tab);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		TileEntityCable pipe = (TileEntityCable) world.getTileEntity(x, y, z);

		if (pipe != null) {
			float minX = 11 * pixel / 2 - (pipe.connections[5] != null ? (11 * pixel / 2) : 0);
			float minY = 11 * pixel / 2 - (pipe.connections[1] != null ? (11 * pixel / 2) : 0);
			float minZ = 11 * pixel / 2 - (pipe.connections[2] != null ? (11 * pixel / 2) : 0);
			float maxZ = 1 - 11 * pixel / 2 + (pipe.connections[4] != null ? (11 * pixel / 2) : 0);
			float maxY = 1 - 11 * pixel / 2 + (pipe.connections[0] != null ? (11 * pixel / 2) : 0);
			float maxX = 1 - 11 * pixel / 2 + (pipe.connections[3] != null ? (11 * pixel / 2) : 0);

			this.setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);
		}

		return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		TileEntityCable pipe = (TileEntityCable) world.getTileEntity(x, y, z);

		if (pipe != null) {
			float minX = 11 * pixel / 2 - (pipe.connections[5] != null ? (11 * pixel / 2) : 0);
			float minY = 11 * pixel / 2 - (pipe.connections[1] != null ? (11 * pixel / 2) : 0);
			float minZ = 11 * pixel / 2 - (pipe.connections[2] != null ? (11 * pixel / 2) : 0);
			float maxZ = 1 - 11 * pixel / 2 + (pipe.connections[4] != null ? (11 * pixel / 2) : 0);
			float maxY = 1 - 11 * pixel / 2 + (pipe.connections[0] != null ? (11 * pixel / 2) : 0);
			float maxX = 1 - 11 * pixel / 2 + (pipe.connections[3] != null ? (11 * pixel / 2) : 0);

			this.setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);
		}
	}

	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityCable();
	}
	
	public boolean hasTileEntity(int meta) {
		return true;
	}
	
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
	
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
	}

	@Override
	public ArrayList<ItemStack> dismantleBlock(EntityPlayer player, World world, int x, int y, int z, boolean returnDrops) {
		this.breakBlock(world, x, y, z, this, world.getBlockMetadata(x, y, z));
		world.setBlockToAir(x, y, z);
		ArrayList returnList = new ArrayList<ItemStack>();
		returnList.add(new ItemStack(this));
		return returnList;
	}

	@Override
	public boolean canDismantle(EntityPlayer player, World world, int x, int y, int z) {
		return true;
	}

	// For break particles
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
}
