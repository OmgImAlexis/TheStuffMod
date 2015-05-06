package com.shnupbups.allthethings.block;

import java.util.List;
import java.util.Random;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;
import com.shnupbups.allthethings.world.WorldGenModTree;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.EnumPlantType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicSapling extends BlockSapling {
	public Block wood;
	public Block leaves;
	
	public BlockBasicSapling(String name, Material material, CreativeTabs tab, int harvest, int hard, Block wood, Block leaves) {
		super();
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		this.wood = wood;
		this.leaves = leaves;
		Reference.incrementBlocks();
		this.setStepSound(soundTypeGrass);
	}
	
	public BlockBasicSapling(String name, Material material, CreativeTabs tab, int harvest, int hard, int opacity, Block wood, Block leaves) {
		this(name, material, tab, harvest, hard, wood, leaves);
		this.setLightOpacity(opacity);
	}
	
	public BlockBasicSapling(String name, Material material, CreativeTabs tab, int harvest, int hard, float light, Block wood, Block leaves) {
		this(name, material, tab, harvest, hard, wood, leaves);
		this.setLightLevel(light);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	public IIcon getIcon(int side, int meta) {
		return blockIcon;
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	public void updateTick(World world, int x, int y, int z, Random random) {
		if (!world.isRemote){
			super.updateTick(world, x, y, z, random);
			if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0){
				this.func_149879_c(world, x, y, z, random);
			}
		}
	}

	//growTree
	public void func_149878_d(World world, int x, int y, int z, Random random){
		if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, random, x, y, z)) return;
		Object object = random.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
		int i1 = 0;
		int j1 = 0;
		boolean flag = false;
		object = new WorldGenModTree(this.wood, this.leaves);
		Block block = Blocks.air;
		if (flag){
			world.setBlock(x + i1, y, z + j1, block, 0, 4);
			world.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
			world.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
			world.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
		}else{
			world.setBlock(x, y, z, block, 0, 4);
		}
		if (!((WorldGenerator)object).generate(world, random, x + i1, y, z + j1)){
			if (flag){
				world.setBlock(x + i1, y, z + j1, this, 0, 4);
				world.setBlock(x + i1 + 1, y, z + j1, this, 0, 4);
				world.setBlock(x + i1, y, z + j1 + 1, this, 0, 4);
				world.setBlock(x + i1 + 1, y, z + j1 + 1, this, 0, 4);
			}else{
				world.setBlock(x, y, z, this, 0, 4);
			}
		}
	}
	
	public boolean func_149851_a(World world, int x, int y, int z, boolean par1){
		return true;
	}

	public boolean func_149852_a(World world, Random random, int x, int y, int z){
		return (double)world.rand.nextFloat() < 0.45D;
	}

	public void func_149853_b(World world, Random random, int x, int y, int z){
		this.func_149879_c(world, x, y, z, random);
	}
	    
	@Override
	public int getRenderColor(int p_149741_1_){
		return 0;
	}
	    
	@Override
	public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
		return 0xffffff;
	}
	    
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
	    p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
	}
	
	protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        if(this == ModBlocks.bananaSapling) return p_149854_1_ == Blocks.grass || p_149854_1_ == Blocks.dirt || p_149854_1_ == Blocks.farmland || p_149854_1_ == Blocks.sand;
        else return p_149854_1_ == Blocks.grass || p_149854_1_ == Blocks.dirt || p_149854_1_ == Blocks.farmland;
    }
	
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
    {
		if(this == ModBlocks.bananaSapling) return EnumPlantType.Desert;
		else return EnumPlantType.Plains;
    }
}