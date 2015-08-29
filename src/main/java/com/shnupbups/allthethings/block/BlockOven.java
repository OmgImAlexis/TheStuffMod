package com.shnupbups.allthethings.block;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cofh.api.block.IDismantleable;
import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOven extends BlockContainer implements IBlockMod,IDismantleable {
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;
	private final Random random=new Random();

	public BlockOven(String name) {
		super(Material.rock);
		setBlockName(name);
		setCreativeTab(ModCreativeTabs.block);
		setHardness(3.5F);
		Reference.incrementBlocks();
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")+1);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		this.blockIcon=iconregister.registerIcon(Reference.MOD_ID+":compressor");
		this.front=iconregister.registerIcon(Reference.MOD_ID+":ovenFront");
		this.top=iconregister.registerIcon(Reference.MOD_ID+":ovenTop");
		this.bottom=iconregister.registerIcon(Reference.MOD_ID+":compressorBottom");
	}

	public IIcon getIcon(int side,int meta) {
		if(side==1) return this.top;
		else if(side==0) return this.bottom;
		else if(meta==2&&side==2) return this.front;
		else if(meta==3&&side==5) return this.front;
		else if(meta==0&&side==3) return this.front;
		else if(meta==1&&side==4) return this.front;
		else return this.blockIcon;
	}

	public boolean onBlockActivated(World world,int x,int y,int z,EntityPlayer player,int par6,float par7,float par8,float par9) {
		player.openGui(allthethings.instance,2,world,x,y,z);
		return true;
	}

	public Item getItemDropped(int par1,Random random,int par3) {
		return Item.getItemFromBlock(ModBlocks.oven);
	}

	public Item getItem(World world,int par2,int par3,int par4) {
		return Item.getItemFromBlock(ModBlocks.oven);
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing
	 * the block.
	 */
	public TileEntity createNewTileEntity(World world,int par2) {
		return new TileEntityOven();
	}

	@SideOnly(Side.CLIENT)
	public void onBlockAdded(World world,int x,int y,int z) {
		super.onBlockAdded(world,x,y,z);
		this.direction(world,x,y,z);
	}

	private void direction(World world,int x,int y,int z) {
		if(!world.isRemote) {
			Block direction=world.getBlock(x,y,z-1);
			Block direction1=world.getBlock(x,y,z+1);
			Block direction2=world.getBlock(x-1,y,z);
			Block direction3=world.getBlock(x+1,y,z);
			byte byte0=3;
			if(direction.func_149730_j()&&direction.func_149730_j()) {
				byte0=3;
			}
			if(direction1.func_149730_j()&&direction1.func_149730_j()) {
				byte0=2;
			}
			if(direction2.func_149730_j()&&direction2.func_149730_j()) {
				byte0=5;
			}
			if(direction3.func_149730_j()&&direction3.func_149730_j()) {
				byte0=4;
			}
			world.setBlockMetadataWithNotify(x,y,z,byte0,2);
		}
	}

	public void onBlockPlacedBy(World world,int x,int y,int z,EntityLivingBase entity,ItemStack stack) {
		int whichDirectionFacing=MathHelper.floor_double((double)(entity.rotationYaw*4.0F/360.0F)+2.5D)&3;
		world.setBlockMetadataWithNotify(x,y,z,whichDirectionFacing,2);
		if(stack.hasTagCompound()&&stack.getTagCompound().hasKey("tiledata")&&world.getTileEntity(x,y,z)!=null) {
			TileEntityOven tile=new TileEntityOven();
			tile.readFromNBT(stack.getTagCompound().getCompoundTag("tiledata"));
			world.setTileEntity(x,y,z,tile);
		}
	}

	@Override
	public void breakBlock(World world,int x,int y,int z,Block block,int meta) {
		TileEntityOven tileentitytutfurnace=(TileEntityOven)world.getTileEntity(x,y,z);
		if(tileentitytutfurnace!=null) {
			for(int i=0;i<tileentitytutfurnace.getSizeInventory();++i) {
				ItemStack itemstack=tileentitytutfurnace.getStackInSlot(i);
				if(itemstack!=null) {
					float f=this.random.nextFloat()*0.6F+0.1F;
					float f1=this.random.nextFloat()*0.6F+0.1F;
					float f2=this.random.nextFloat()*0.6F+0.1F;
					while(itemstack.stackSize>0) {
						int j=this.random.nextInt(21)+10;
						if(j>itemstack.stackSize) {
							j=itemstack.stackSize;
						}
						itemstack.stackSize-=j;
						EntityItem entityItems=new EntityItem(world,(double)((float)x+f),(double)((float)y+f1),(double)((float)z+f2),new ItemStack(itemstack.getItem(),j,itemstack.getItemDamage()));
						if(itemstack.hasTagCompound()) {
							entityItems.getEntityItem().setTagCompound(((NBTTagCompound)itemstack.getTagCompound().copy()));
						}
						float f3=0.025F;
						entityItems.motionX=(double)((float)this.random.nextGaussian()*f3);
						entityItems.motionY=(double)((float)this.random.nextGaussian()*f3+0.1F);
						entityItems.motionZ=(double)((float)this.random.nextGaussian()*f3);
						world.spawnEntityInWorld(entityItems);
					}
				}
			}
			world.func_147453_f(x,y,z,block);
		}
		super.breakBlock(world,x,y,z,block,meta);
		world.removeTileEntity(x,y,z);
	}

	public void breakBlockNoDrops(World world,int x,int y,int z,Block block,int meta) {
		TileEntityOven tileentitytutfurnace=(TileEntityOven)world.getTileEntity(x,y,z);
		if(tileentitytutfurnace!=null) {
			world.func_147453_f(x,y,z,block);
		}
		super.breakBlock(world,x,y,z,block,meta);
		world.removeTileEntity(x,y,z);
	}

	@Override
	public ArrayList<ItemStack> dismantleBlock(EntityPlayer player,World world,int x,int y,int z,boolean returnDrops) {
		ArrayList returnList=new ArrayList<ItemStack>();
		ItemStack drop=new ItemStack(this);
		drop.setTagCompound(new NBTTagCompound());
		drop.getTagCompound().setTag("tiledata",(((TileEntityOven)world.getTileEntity(x,y,z)).getTagCompound()));
		returnList.add(drop);
		this.breakBlockNoDrops(world,x,y,z,this,world.getBlockMetadata(x,y,z));
		world.setBlockToAir(x,y,z);
		return returnList;
	}

	@Override
	public boolean canDismantle(EntityPlayer player,World world,int x,int y,int z) {
		return true;
	}
}
