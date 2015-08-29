package com.shnupbups.allthethings.block;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicLeaf extends BlockLeaves implements IBlockMod,IShearable {
	int[] field_150128_a;
	@SideOnly(Side.CLIENT)
	protected IIcon[][] field_150129_M=new IIcon[2][];
	private static final String __OBFID="CL_00000263";

	public BlockBasicLeaf(String name,Material material,CreativeTabs tab,int harvest,int hard,boolean notxray) {
		super();
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness=hard;
		this.setLightOpacity(1);
		this.setBlockName(name);
		this.setTickRandomly(true);
		Reference.incrementBlocks();
		this.setStepSound(soundTypeGrass);
	}

	public BlockBasicLeaf(String name,Material material,CreativeTabs tab,int harvest,float hard,boolean notxray) {
		super();
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness=hard;
		this.setLightOpacity(1);
		this.setBlockName(name);
		this.setTickRandomly(true);
		Reference.incrementBlocks();
		this.setStepSound(soundTypeGrass);
	}

	@SideOnly(Side.CLIENT)
	private IIcon blockIconFast;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon=iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		blockIconFast=iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(this.getUnlocalizedName())+"Fast"));
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	public String getTrueUnlocalizedName() {
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")+1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s",Reference.MOD_ID.toLowerCase()+":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	public void breakBlock(World p_149749_1_,int p_149749_2_,int p_149749_3_,int p_149749_4_,Block p_149749_5_,int p_149749_6_) {
		byte b0=1;
		int i1=b0+1;
		if(p_149749_1_.checkChunksExist(p_149749_2_-i1,p_149749_3_-i1,p_149749_4_-i1,p_149749_2_+i1,p_149749_3_+i1,p_149749_4_+i1)) {
			for(int j1=-b0;j1<=b0;++j1) {
				for(int k1=-b0;k1<=b0;++k1) {
					for(int l1=-b0;l1<=b0;++l1) {
						Block block=p_149749_1_.getBlock(p_149749_2_+j1,p_149749_3_+k1,p_149749_4_+l1);
						if(block.isLeaves(p_149749_1_,p_149749_2_+j1,p_149749_3_+k1,p_149749_4_+l1)) {
							block.beginLeavesDecay(p_149749_1_,p_149749_2_+j1,p_149749_3_+k1,p_149749_4_+l1);
						}
					}
				}
			}
		}
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World p_149674_1_,int p_149674_2_,int p_149674_3_,int p_149674_4_,Random p_149674_5_) {
		super.updateTick(p_149674_1_,p_149674_2_,p_149674_3_,p_149674_4_,p_149674_5_);
		/**
		 * if (!p_149674_1_.isRemote)
		 * {
		 * int l = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);
		 * if ((l & 8) != 0 && (l & 4) == 0)
		 * {
		 * byte b0 = 4;
		 * int i1 = b0 + 1;
		 * byte b1 = 32;
		 * int j1 = b1 * b1;
		 * int k1 = b1 / 2;
		 * if (this.field_150128_a == null)
		 * {
		 * this.field_150128_a = new int[b1 * b1 * b1];
		 * }
		 * int l1;
		 * if (p_149674_1_.checkChunksExist(p_149674_2_ - i1, p_149674_3_ - i1, p_149674_4_ - i1,
		 * p_149674_2_ + i1, p_149674_3_ + i1, p_149674_4_ + i1))
		 * {
		 * int i2;
		 * int j2;
		 * for (l1 = -b0; l1 <= b0; ++l1)
		 * {
		 * for (i2 = -b0; i2 <= b0; ++i2)
		 * {
		 * for (j2 = -b0; j2 <= b0; ++j2)
		 * {
		 * Block block = p_149674_1_.getBlock(p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2);
		 * if (!block.canSustainLeaves(p_149674_1_, p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_
		 * + j2))
		 * {
		 * if (block.isLeaves(p_149674_1_, p_149674_2_ + l1, p_149674_3_ + i2, p_149674_4_ + j2))
		 * {
		 * this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -2;
		 * }
		 * else
		 * {
		 * this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -1;
		 * }
		 * }
		 * else
		 * {
		 * this.field_150128_a[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = 0;
		 * }
		 * }
		 * }
		 * }
		 * for (l1 = 1; l1 <= 4; ++l1)
		 * {
		 * for (i2 = -b0; i2 <= b0; ++i2)
		 * {
		 * for (j2 = -b0; j2 <= b0; ++j2)
		 * {
		 * for (int k2 = -b0; k2 <= b0; ++k2)
		 * {
		 * if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1] == l1 - 1)
		 * {
		 * if (this.field_150128_a[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
		 * {
		 * this.field_150128_a[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
		 * }
		 * if (this.field_150128_a[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
		 * {
		 * this.field_150128_a[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
		 * }
		 * if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] == -2)
		 * {
		 * this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] = l1;
		 * }
		 * if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] == -2)
		 * {
		 * this.field_150128_a[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] = l1;
		 * }
		 * if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] == -2)
		 * {
		 * this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] = l1;
		 * }
		 * if (this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] == -2)
		 * {
		 * this.field_150128_a[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] = l1;
		 * }
		 * }
		 * }
		 * }
		 * }
		 * }
		 * }
		 * l1 = this.field_150128_a[k1 * j1 + k1 * b1 + k1];
		 * if (l1 >= 0)
		 * {
		 * p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, l & -9, 4);
		 * }
		 * else
		 * {
		 * this.removeLeaves(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
		 * }
		 * }
		 * }
		 **/
	}

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World p_149734_1_,int p_149734_2_,int p_149734_3_,int p_149734_4_,Random p_149734_5_) {
		if(p_149734_1_.canLightningStrikeAt(p_149734_2_,p_149734_3_+1,p_149734_4_)&&!World.doesBlockHaveSolidTopSurface(p_149734_1_,p_149734_2_,p_149734_3_-1,p_149734_4_)&&p_149734_5_.nextInt(15)==1) {
			double d0=(double)((float)p_149734_2_+p_149734_5_.nextFloat());
			double d1=(double)p_149734_3_-0.05D;
			double d2=(double)((float)p_149734_4_+p_149734_5_.nextFloat());
			p_149734_1_.spawnParticle("dripWater",d0,d1,d2,0.0D,0.0D,0.0D);
		}
	}

	private void removeLeaves(World p_150126_1_,int p_150126_2_,int p_150126_3_,int p_150126_4_) {
		this.dropBlockAsItem(p_150126_1_,p_150126_2_,p_150126_3_,p_150126_4_,p_150126_1_.getBlockMetadata(p_150126_2_,p_150126_3_,p_150126_4_),0);
		p_150126_1_.setBlockToAir(p_150126_2_,p_150126_3_,p_150126_4_);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random p_149745_1_) {
		return p_149745_1_.nextInt(20)==0? 1:0;
	}

	public Item getItemDropped(int p_149650_1_,Random p_149650_2_,int p_149650_3_) {
		if(this==ModBlocks.cherryLeaves) return Item.getItemFromBlock(ModBlocks.cherrySapling);
		else if(this==ModBlocks.rubberLeaves) return Item.getItemFromBlock(ModBlocks.rubberSapling);
		else if(this==ModBlocks.lemonLeaves) return Item.getItemFromBlock(ModBlocks.lemonSapling);
		else if(this==ModBlocks.bananaLeaves) return Item.getItemFromBlock(ModBlocks.bananaSapling);
		else if(this==ModBlocks.ebonyLeaves) return Item.getItemFromBlock(ModBlocks.ebonySapling);
		else if(this==ModBlocks.mapleLeaves) return Item.getItemFromBlock(ModBlocks.mapleSapling);
		else if(this==ModBlocks.oliveLeaves) return Item.getItemFromBlock(ModBlocks.oliveSapling);
		else if(this==ModBlocks.pearLeaves) return Item.getItemFromBlock(ModBlocks.pearSapling);
		else if(this==ModBlocks.mangoLeaves) return Item.getItemFromBlock(ModBlocks.mangoSapling);
		else return null;
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	public void dropBlockAsItemWithChance(World p_149690_1_,int p_149690_2_,int p_149690_3_,int p_149690_4_,int p_149690_5_,float p_149690_6_,int p_149690_7_) {
		super.dropBlockAsItemWithChance(p_149690_1_,p_149690_2_,p_149690_3_,p_149690_4_,p_149690_5_,1.0f,p_149690_7_);
	}

	protected int func_150123_b(int p_150123_1_) {
		return 20;
	}

	/**
	 * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the
	 * coordinates of the
	 * block and l is the block's subtype/damage.
	 */
	public void harvestBlock(World p_149636_1_,EntityPlayer p_149636_2_,int p_149636_3_,int p_149636_4_,int p_149636_5_,int p_149636_6_) {
		{
			super.harvestBlock(p_149636_1_,p_149636_2_,p_149636_3_,p_149636_4_,p_149636_5_,p_149636_6_);
		}
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether or not to render the
	 * shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this
	 * block.
	 */
	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube() {
		return !Minecraft.getMinecraft().gameSettings.fancyGraphics;
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_,int p_149691_2_) {
		if(!Minecraft.getMinecraft().gameSettings.fancyGraphics) return blockIconFast;
		else return blockIcon;
	};

	/**
	 * Returns an item stack containing a single instance of the current block type. 'i' is the
	 * block's subtype/damage
	 * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested
	 * should return null.
	 */
	protected ItemStack createStackedBlock(int p_149644_1_) {
		return new ItemStack(Item.getItemFromBlock(this),1,p_149644_1_&3);
	}

	public String[] func_150125_e() {
		return null;
	}

	@Override
	public boolean isShearable(ItemStack item,IBlockAccess world,int x,int y,int z) {
		return true;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item,IBlockAccess world,int x,int y,int z,int fortune) {
		ArrayList<ItemStack> ret=new ArrayList<ItemStack>();
		ret.add(new ItemStack(this,1,world.getBlockMetadata(x,y,z)&3));
		return ret;
	}

	@Override
	public void beginLeavesDecay(World world,int x,int y,int z) {
		int i2=world.getBlockMetadata(x,y,z);
		if((i2&8)==0) {
			world.setBlockMetadataWithNotify(x,y,z,i2|8,4);
		}
		world.setBlockMetadataWithNotify(x,y,z,world.getBlockMetadata(x,y,z)|8,4);
	}

	@Override
	public boolean isLeaves(IBlockAccess world,int x,int y,int z) {
		return true;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world,int x,int y,int z,int metadata,int fortune) {
		ArrayList<ItemStack> ret=new ArrayList<ItemStack>();
		int chance=this.func_150123_b(metadata);
		if(fortune>0) {
			chance-=2<<fortune;
			if(chance<10) chance=10;
		}
		if(world.rand.nextInt(chance)==0) ret.add(new ItemStack(this.getItemDropped(metadata,world.rand,fortune),1,0));
		chance=20;
		if(fortune>0) {
			chance-=10<<fortune;
			if(chance<2) chance=2;
		}
		this.captureDrops(true);
		this.func_150124_c(world,x,y,z,metadata,chance);
		ret.addAll(this.captureDrops(false));
		return ret;
	}

	@Override
	protected void func_150124_c(World p_150124_1_,int p_150124_2_,int p_150124_3_,int p_150124_4_,int p_150124_5_,int p_150124_6_) {
		if(p_150124_1_.rand.nextInt(p_150124_6_)==0&&this==ModBlocks.cherryLeaves) {
			this.dropBlockAsItem(p_150124_1_,p_150124_2_,p_150124_3_,p_150124_4_,new ItemStack(ModItems.cherry));
		} else if(p_150124_1_.rand.nextInt(p_150124_6_)==0&&this==ModBlocks.lemonLeaves) {
			this.dropBlockAsItem(p_150124_1_,p_150124_2_,p_150124_3_,p_150124_4_,new ItemStack(ModItems.lemon));
		} else if(p_150124_1_.rand.nextInt(50)==0&&this==ModBlocks.bananaLeaves) {
			this.dropBlockAsItem(p_150124_1_,p_150124_2_,p_150124_3_,p_150124_4_,new ItemStack(ModItems.banana,1,new Random().nextInt(3)));
		} else if(p_150124_1_.rand.nextInt(p_150124_6_)==0&&this==ModBlocks.pearLeaves) {
			this.dropBlockAsItem(p_150124_1_,p_150124_2_,p_150124_3_,p_150124_4_,new ItemStack(ModItems.pear));
		} else if(p_150124_1_.rand.nextInt(p_150124_6_)==0&&this==ModBlocks.mangoLeaves) {
			this.dropBlockAsItem(p_150124_1_,p_150124_2_,p_150124_3_,p_150124_4_,new ItemStack(ModItems.mango));
		} else if(p_150124_1_.rand.nextInt(p_150124_6_)==0&&this==ModBlocks.mapleLeaves) {
			this.dropBlockAsItem(p_150124_1_,p_150124_2_,p_150124_3_,p_150124_4_,new ItemStack(ModItems.mapleLeaf));
		}
	}

	@SideOnly(Side.CLIENT)
	public int getRenderColor(int p_149741_1_) {
		return 0xffffff;
	}

	/**
	 * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color.
	 * Note only called
	 * when first determining what to render.
	 */
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess p_149720_1_,int p_149720_2_,int p_149720_3_,int p_149720_4_) {
		return 0xffffff;
	}
}
