package omgimalexis.allthethings.block;

import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.utility.UtilityCheck;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockBasicLog extends BlockRotatedPillar {	
	public BlockBasicLog(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
		Reference.incrementBlocks();
		this.setStepSound(soundTypeWood);
	}
	
	public BlockBasicLog(String name, Material material, CreativeTabs tab, int harvest, int hard, int opacity) {
		this(name, material, tab, harvest, hard);
		this.setLightOpacity(opacity);
	}
	
	public BlockBasicLog(String name, Material material, CreativeTabs tab, int harvest, int hard, float light) {
		this(name, material, tab, harvest, hard);
		this.setLightLevel(light);
	}
	
	@SideOnly(Side.CLIENT)
	private static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	private static IIcon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
        sideIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        topIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Top");
	}
	
	@Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }
    
    @Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int p_150163_1_) {
        return sideIcon;
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int p_150161_1_) {
        return topIcon;
    }
}
