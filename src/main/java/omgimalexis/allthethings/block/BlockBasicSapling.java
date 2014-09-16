package omgimalexis.allthethings.block;

import java.util.List;
import java.util.Random;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.utility.UtilityCheck;
import omgimalexis.allthethings.world.WorldGenCherryTree;
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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicSapling extends BlockSapling {
	public BlockBasicSapling(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super();
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
	}
	
	public BlockBasicSapling(String name, Material material, CreativeTabs tab, int harvest, int hard, int opacity) {
		this(name, material, tab, harvest, hard);
		this.setLightOpacity(opacity);
	}
	
	public BlockBasicSapling(String name, Material material, CreativeTabs tab, int harvest, int hard, float light) {
		this(name, material, tab, harvest, hard);
		this.setLightLevel(light);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
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
	        if (!world.isRemote)
	        {
	            super.updateTick(world, x, y, z, random);

	            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0)
	            {
	                this.func_149879_c(world, x, y, z, random);
	            }
	        }
	    }

	    //growTree
	    public void func_149878_d(World world, int x, int y, int z, Random random)
	    {
	        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, random, x, y, z)) return;
	        Object object = random.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
	        int i1 = 0;
	        int j1 = 0;
	        boolean flag = false;
	        object = new WorldGenCherryTree(ModBlocks.cherryWood, ModBlocks.cherryLeaves);

	        Block block = Blocks.air;

	        if (flag)
	        {
	            world.setBlock(x + i1, y, z + j1, block, 0, 4);
	            world.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
	            world.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
	            world.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
	        }
	        else
	        {
	            world.setBlock(x, y, z, block, 0, 4);
	        }

	        if (!((WorldGenerator)object).generate(world, random, x + i1, y, z + j1))
	        {
	            if (flag)
	            {
	                world.setBlock(x + i1, y, z + j1, this, 0, 4);
	                world.setBlock(x + i1 + 1, y, z + j1, this, 0, 4);
	                world.setBlock(x + i1, y, z + j1 + 1, this, 0, 4);
	                world.setBlock(x + i1 + 1, y, z + j1 + 1, this, 0, 4);
	            }
	            else
	            {
	                world.setBlock(x, y, z, this, 0, 4);
	            }
	        }
	    }

	    public boolean func_149851_a(World world, int x, int y, int z, boolean par1)
	    {
	        return true;
	    }

	    public boolean func_149852_a(World world, Random random, int x, int y, int z)
	    {
	        return (double)world.rand.nextFloat() < 0.45D;
	    }

	    public void func_149853_b(World world, Random random, int x, int y, int z)
	    {
	        this.func_149879_c(world, x, y, z, random);
	    }
	    
	    @Override
		public int getRenderColor(int p_149741_1_)
	    {
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
	}