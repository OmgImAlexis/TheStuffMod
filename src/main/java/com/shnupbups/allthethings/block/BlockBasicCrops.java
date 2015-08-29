package com.shnupbups.allthethings.block;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicCrops extends BlockCrops implements IBlockMod,IGrowable {
	public Item drop;
	public int meta;
	public boolean pickable;
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public BlockBasicCrops(String name,Item drop) {
		this(name,drop,8);
	}

	public BlockBasicCrops(String name,Item drop,int meta) {
		this(name,drop,meta,false);
	}

	public BlockBasicCrops(String name) {
		this(name,null,8);
	}

	public BlockBasicCrops(String name,int meta) {
		this(name,null,meta);
	}

	public BlockBasicCrops(String name,Item drop,boolean pickable) {
		this(name,drop,8,pickable);
	}

	public BlockBasicCrops(String name,Item drop,int meta,boolean pickable) {
		super();
		this.setBlockName(name);
		this.drop=drop;
		this.meta=meta;
		this.pickable=pickable;
		Reference.incrementBlocks();
	}

	public BlockBasicCrops(String name,boolean pickable) {
		this(name,null,8,pickable);
	}

	public BlockBasicCrops(String name,int meta,boolean pickable) {
		this(name,null,meta,pickable);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side,int meta) {
		if(meta<this.meta) {
			return icons[meta];
		} else return icons[this.meta-1];
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		this.icons=new IIcon[meta];
		for(int i=0;i<this.meta;++i) {
			this.icons[i]=register.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(this.getUnlocalizedName()))+"Stage"+i);
		}
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")+1);
	}

	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_,int p_149694_2_,int p_149694_3_,int p_149694_4_) {
		return drop;
	}

	public Item getItemDropped(int meta,Random random,int fortune) {
		return drop;
	}

	public void dropBlockAsItemWithChance(World world,int p_149690_2_,int p_149690_3_,int p_149690_4_,int p_149690_5_,float p_149690_6_,int p_149690_7_) {
		super.dropBlockAsItemWithChance(world,p_149690_2_,p_149690_3_,p_149690_4_,p_149690_5_,p_149690_6_,0);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random rand) {
		return 1;
	}

	public boolean func_149851_a(World world,int x,int y,int z,boolean p_149851_5_) {
		return world.getBlockMetadata(x,y,z)!=(this.meta-1);
	}

	public boolean func_149852_a(World world,Random rand,int x,int y,int z) {
		return true;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world,int x,int y,int z,int metadata,int fortune) {
		ArrayList<ItemStack> ret=new ArrayList();
		if(metadata>=meta-1) {
			for(int i=0;i<3+fortune;++i) {
				if(world.rand.nextInt(15)<=metadata) {
					ret.add(new ItemStack(drop,1,0));
				}
			}
		}
		ret.add(new ItemStack(drop,1,0));
		return ret;
	}

	public BlockBasicCrops setDrop(Item drop) {
		this.drop=drop;
		return this;
	}

	@Override
	public boolean onBlockActivated(World world,int x,int y,int z,EntityPlayer player,int side,float posX,float posY,float posZ) {
		if(!world.isRemote) {
			if(pickable&&world.getBlockMetadata(x,y,z)>=meta-1) {
				for(int i=0;i<new Random().nextInt(2)+1;i++) {
					world.spawnEntityInWorld(new EntityItem(world,x,y,z,new ItemStack(drop)));
				}
				world.setBlockMetadataWithNotify(x,y,z,meta-2,0);
				return true;
			} else return false;
		}
		return false;
	}
}
