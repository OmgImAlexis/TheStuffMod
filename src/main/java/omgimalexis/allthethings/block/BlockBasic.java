package omgimalexis.allthethings.block;

import java.util.Random;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.lib.Reference;
import omgimalexis.allthethings.utility.UtilityCheck;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasic extends Block {
	public Item itemDropped = Item.getItemFromBlock(this);
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(tab);
		this.blockHardness = hard;
		this.setHarvestLevel(UtilityCheck.getToolFromMaterial(material), harvest);
	}
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, int opacity) {
		this(name, material, tab, harvest, hard);
		this.setLightOpacity(opacity);
	}
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, float light) {
		this(name, material, tab, harvest, hard);
		this.setLightLevel(light);
	}
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, float light, Item drop) {
		this(name, material, tab, harvest, hard, light);
		this.itemDropped = drop;
	}
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, float light, ItemStack drop) {
		this(name, material, tab, harvest, hard, light);
		this.itemDropped = drop.getItem();
	}
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, Item drop) {
		this(name, material, tab, harvest, hard);
		this.itemDropped = drop;
	}
	
	public BlockBasic(String name, Material material, CreativeTabs tab, int harvest, int hard, ItemStack drop) {
		this(name, material, tab, harvest, hard);
		this.itemDropped = drop.getItem();
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	public Item getItemDropped(int metadata, Random random, int fortune) {
		//return this == ModBlocks.rubyOre ? ModItems.ruby : (this == ModBlocks.onyxOre ? ModItems.onyx : (this == ModBlocks.sapphireOre ? ModItems.sapphire : (this == ModBlocks.citrineOre ? ModItems.citrine : (this == ModBlocks.jadeOre ? ModItems.jade : (this == ModBlocks.amethystOre ? ModItems.amethyst : (this == ModBlocks.carnelianOre ? ModItems.carnelian : (this == ModBlocks.amazoniteOre ? ModItems.amazonite : (this == ModBlocks.garnetOre ? ModItems.garnet : (this == ModBlocks.kunziteOre ? ModItems.kunzite : (this == ModBlocks.aquamarineOre ? ModItems.aquamarine : (this == ModBlocks.voidiumOre ? ModItems.voidium : (this == ModBlocks.voidiumBedrockOre ? ModItems.voidium : (this == ModBlocks.fyrestoneOre ? ModItems.fyrestone : (this == ModBlocks.trytementiumOre ? ModItems.trytementium : (this == ModBlocks.iridiumOre ? ModItems.iridium : (this == ModBlocks.uraniumOre ? ModItems.uranium : (this == ModBlocks.topazOre ? ModItems.topaz : (this == ModBlocks.plutoniumOre ? ModItems.plutonium : Item.getItemFromBlock(this)))))))))))))))))));
		return itemDropped;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return this == ModBlocks.fossil ? rand.nextInt(5) : (this == ModBlocks.fossilSkull ? rand.nextInt(5) : 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	@Override
	public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
	    return UtilityCheck.isBlockBeaconBase(this);
	}
}