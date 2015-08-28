package com.shnupbups.allthethings.block;

import java.util.ArrayList;
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
import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.tileEntity.TileEntityGenerator;
import com.shnupbups.allthethings.utility.UtilityCheck;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGenerator extends BlockContainer implements IDismantleable {
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;
	public int maxStorage=80000;
	public int maxTransfer=500;
	public int generateRate=100;

	public BlockGenerator(String name,Material material,CreativeTabs tab,int harvest,int hard) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness=hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material),harvest);
		this.setStepSound(UtilityCheck.getSoundFromMaterial(material));
		Reference.incrementBlocks();
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_,int p_149915_2_) {
		return new TileEntityGenerator();
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		this.blockIcon=iconregister.registerIcon(Reference.MOD_ID+":generator");
		this.top=iconregister.registerIcon(Reference.MOD_ID+":generatorTop");
		this.bottom=iconregister.registerIcon(Reference.MOD_ID+":generatorBottom");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess world,int x,int y,int z,int side) {
		if(world.getTileEntity(x,y,z)!=null&&((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide!=null&&side==((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide.ordinal()) return this.top;
		else if(world.getTileEntity(x,y,z)==null&&side==1) return this.top;
		if(world.getTileEntity(x,y,z)!=null&&((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide!=null&&side==((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide.getOpposite().ordinal()) return this.bottom;
		else if(world.getTileEntity(x,y,z)==null&&side==0) return this.bottom;
		else return this.blockIcon;
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")+1);
	}

	public void onBlockPlacedBy(World world,int x,int y,int z,EntityLivingBase entity,ItemStack stack) {
		if(stack.hasTagCompound()&&stack.getTagCompound().hasKey("tiledata")&&world.getTileEntity(x,y,z)!=null) {
			TileEntityGenerator tile=new TileEntityGenerator();
			tile.readFromNBT(stack.getTagCompound().getCompoundTag("tiledata"));
			world.setTileEntity(x,y,z,tile);
		}
	}

	public boolean onBlockActivated(World world,int x,int y,int z,EntityPlayer player,int side,float par7,float par8,float par9) {
		if(player.getHeldItem()!=null&&player.getHeldItem().getItem()!=null&&player.getHeldItem().getItem() instanceof IToolHammer) {
			if(((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide==ForgeDirection.getOrientation(side)) {
				((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide=ForgeDirection.getOrientation(ForgeDirection.OPPOSITES[side]);
			} else {
				((TileEntityGenerator)world.getTileEntity(x,y,z)).outputSide=ForgeDirection.getOrientation(side);
			}
		} else {
			player.openGui(allthethings.instance,5,world,x,y,z);
		}
		world.getTileEntity(x,y,z).markDirty();
		return true;
	}

	@Override
	public ArrayList<ItemStack> dismantleBlock(EntityPlayer player,World world,int x,int y,int z,boolean returnDrops) {
		ArrayList returnList=new ArrayList<ItemStack>();
		ItemStack drop=new ItemStack(this);
		drop.setTagCompound(new NBTTagCompound());
		drop.getTagCompound().setTag("tiledata",(((TileEntityGenerator)world.getTileEntity(x,y,z)).getTagCompound()));
		returnList.add(drop);
		this.breakBlock(world,x,y,z,this,world.getBlockMetadata(x,y,z));
		world.setBlockToAir(x,y,z);
		return returnList;
	}

	@Override
	public boolean canDismantle(EntityPlayer player,World world,int x,int y,int z) {
		return true;
	}
}
