package com.shnupbups.allthethings.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidContainerItem;
import cofh.api.block.IDismantleable;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityTank;
import com.shnupbups.allthethings.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTank extends BlockContainer implements IDismantleable {
	
	public int maxStorage = 10000;
	
	public BlockTank(String name, CreativeTabs tab) {
		super(Material.glass);
		setCreativeTab(tab);
		setHardness(1.5F);
		setBlockName(name);
		Reference.incrementBlocks();
	}
	
	public BlockTank(String name, CreativeTabs tab, int maxStorage) {
		this(name, tab);
		this.maxStorage = maxStorage;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTank();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
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
		ArrayList returnList = new ArrayList<ItemStack>();
		ItemStack drop = new ItemStack(this);
		if(((TileEntityTank) world.getTileEntity(x, y, z)).tank.getFluidAmount() > 0) {
			drop.setTagCompound(new NBTTagCompound());
			drop.getTagCompound().setTag("tankdata", (((TileEntityTank) world.getTileEntity(x, y, z)).tank.writeToNBT(new NBTTagCompound())));
		}
		returnList.add(drop);
		this.breakBlockNoSpill(world, x, y, z, this, world.getBlockMetadata(x, y, z));
		world.setBlockToAir(x, y, z);
		return returnList;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("tankdata") && world.getTileEntity(x, y, z) != null) {
			TileEntityTank tank = new TileEntityTank();
			tank.readFromNBT(stack.getTagCompound().getCompoundTag("tankdata"));
			world.setTileEntity(x, y, z, tank);
		}
	}

	@Override
	public boolean canDismantle(EntityPlayer player, World world, int x, int y, int z) {
		return true;
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
		TileEntityTank tile = (TileEntityTank) world.getTileEntity(x, y, z);
		
		if (tile != null) {
			if(tile.tank != null && tile.tank.getFluid() != null && tile.tank.getFluid().amount >= 1000 && tile.tank.getFluid().getFluid() != null && tile.tank.getFluid().getFluid().getBlock() != null) {
				Block fluid = tile.tank.getFluid().getFluid().getBlock();
				super.breakBlock(world, x, y, z, block, meta);
				world.setBlock(x, y, z, fluid, 0, 3);
			} else {
				super.breakBlock(world, x, y, z, block, meta);
			}
			world.func_147453_f(x, y, z, block);
		} else {
			super.breakBlock(world, x, y, z, block, meta);
		}
	}
	
	public void breakBlockNoSpill(World world, int x, int y, int z, Block block, int meta) {
		TileEntityTank tile = (TileEntityTank) world.getTileEntity(x, y, z);
		
		if (tile != null) {
			super.breakBlock(world, x, y, z, block, meta);
			world.func_147453_f(x, y, z, block);
		} else {
			super.breakBlock(world, x, y, z, block, meta);
		}
	}
	
	@SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 1;
    }
	
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
		if (super.onBlockActivated(world, i, j, k, entityplayer, par6, par7, par8, par9)) {
			return true;
		}

		ItemStack current = entityplayer.inventory.getCurrentItem();

		if (current != null) {
			TileEntity tile = world.getTileEntity(i, j, k);

			if (tile instanceof TileEntityTank) {
				TileEntityTank tank = (TileEntityTank) tile;
				// Handle FluidContainerRegistry
				if (FluidContainerRegistry.isContainer(current)) {
					FluidStack liquid = FluidContainerRegistry.getFluidForFilledItem(current);
					// Handle filled containers
					if (liquid != null) {
						int qty = tank.fill(ForgeDirection.UNKNOWN, liquid, true);

						if (qty != 0 && !entityplayer.capabilities.isCreativeMode) {
							if (current.stackSize > 1) {
								if (!entityplayer.inventory.addItemStackToInventory(FluidContainerRegistry.drainFluidContainer(current))) {
									entityplayer.dropPlayerItemWithRandomChoice(FluidContainerRegistry.drainFluidContainer(current), false);
								}

								if(entityplayer.getHeldItem().getItem().hasContainerItem(entityplayer.getHeldItem())){
									entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, entityplayer.getHeldItem().getItem().getContainerItem(entityplayer.getHeldItem()));
								} else {
									entityplayer.getHeldItem().stackSize--;
									if(entityplayer.getHeldItem().stackSize < 1) {
										entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, null);
									}
								}
							} else {
								entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, FluidContainerRegistry.drainFluidContainer(current));
							}
						}

						return true;

						// Handle empty containers
					} else {
						FluidStack available = tank.getTankInfo(ForgeDirection.UNKNOWN)[0].fluid;

						if (available != null) {
							ItemStack filled = FluidContainerRegistry.fillFluidContainer(available, current);

							liquid = FluidContainerRegistry.getFluidForFilledItem(filled);

							if (liquid != null) {
								if (!entityplayer.capabilities.isCreativeMode) {
									if (current.stackSize > 1) {
										if(entityplayer.getHeldItem().getItem().hasContainerItem(entityplayer.getHeldItem())){
											entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, entityplayer.getHeldItem().getItem().getContainerItem(entityplayer.getHeldItem()));
										} else if (!entityplayer.inventory.addItemStackToInventory(filled)) {
											return false;
										} else {
											entityplayer.getHeldItem().stackSize--;
											if(entityplayer.getHeldItem().stackSize < 1) {
												entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, null);
											}
										}
									} else {
										if(entityplayer.getHeldItem().getItem().hasContainerItem(entityplayer.getHeldItem())) {
											entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, entityplayer.getHeldItem().getItem().getContainerItem(entityplayer.getHeldItem()));
										} else {
											entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, null);
										}
										entityplayer.inventory.addItemStackToInventory(filled);
									}
								}

								tank.drain(ForgeDirection.UNKNOWN, liquid.amount, true);

								return true;
							}
						}
					}
				} else if (current.getItem() instanceof IFluidContainerItem) {
					if (current.stackSize != 1) {
						return false;
					}

					if (!world.isRemote) {
						IFluidContainerItem container = (IFluidContainerItem) current.getItem();
						FluidStack liquid = container.getFluid(current);
						FluidStack tankLiquid = tank.getTankInfo(ForgeDirection.UNKNOWN)[0].fluid;
						boolean mustDrain = liquid == null || liquid.amount == 0;
						boolean mustFill = tankLiquid == null || tankLiquid.amount == 0;
						if (mustDrain && mustFill) {
							// Both are empty, do nothing
						} else if (mustDrain || !entityplayer.isSneaking()) {
							liquid = tank.drain(ForgeDirection.UNKNOWN, 1000, false);
							int qtyToFill = container.fill(current, liquid, true);
							tank.drain(ForgeDirection.UNKNOWN, qtyToFill, true);
						} else if (mustFill || entityplayer.isSneaking()) {
							if (liquid.amount > 0) {
								int qty = tank.fill(ForgeDirection.UNKNOWN, liquid, false);
								tank.fill(ForgeDirection.UNKNOWN, container.drain(current, qty, true), true);
							}
						}
					}

					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		if (world.getBlock(x, y, z) == this) {
			return false;
		} else {
			return super.shouldSideBeRendered(world, x, y, z, side);
		}
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
		ItemStack drop = new ItemStack(this);
		if(((TileEntityTank) world.getTileEntity(x, y, z)).tank.getFluidAmount() > 0) {
			drop.setTagCompound(new NBTTagCompound());
			drop.getTagCompound().setTag("tankdata", (((TileEntityTank) world.getTileEntity(x, y, z)).tank.writeToNBT(new NBTTagCompound())));
		}
		return drop;
	}
}
