package com.shnupbups.allthethings.utility;

import com.shnupbups.allthethings.block.BlockBasic;
import com.shnupbups.allthethings.block.BlockBasicFluid;
import com.shnupbups.allthethings.block.BlockMaterial;
import com.shnupbups.allthethings.block.FluidBasic;
import com.shnupbups.allthethings.dimension.Dimension;
import com.shnupbups.allthethings.handler.BucketHandler;
import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.init.ModRings;
import com.shnupbups.allthethings.init.ModRingsBaubles;
import com.shnupbups.allthethings.item.ItemBasic;
import com.shnupbups.allthethings.item.ItemBasicBucket;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Register {
	private static ItemBasic item;
	private static BlockBasic block;
	private static BlockBasic ore;
	
	/**
	 * A function that creates everything for us!
	 * Only problem is, it's very buggy and should not ever be used until it's better.
	 * Best to leave it alone for now.
	 * @param itemname
	 * @param blockname
	 * @param orename
	 * @param blockhard
	 * @param blocklevel
	 * @param blockmaterial
	 * @param orehard
	 * @param orelevel
	 * @param orematerial
	 * @param oredropitem
	 */
	/**public static void addMaterial(String itemname, String blockname, String orename, int blockhard, int blocklevel, Material blockmaterial, int orehard, int orelevel, Material orematerial, boolean oredropitem) {
		item = new ItemBasic(itemname,TMCreativeTabs.item);
		block = new BlockBasic(blockname, blockmaterial, TMCreativeTabs.block, blocklevel, blockhard);
		ore = new BlockBasic(orename, orematerial, TMCreativeTabs.block, orelevel, orehard);
		
		GameRegistry.registerItem(item, itemname);
		GameRegistry.registerBlock(block, blockname);
		GameRegistry.registerBlock(ore, orename);
		OreDictionary.registerOre(itemname, item);
		GameRegistry.addSmelting(ore, new ItemStack(item), 5);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(block), true, new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), itemname}));
		GameRegistry.addShapelessRecipe(new ItemStack(item, 9), new ItemStack(block));
	}*/
	
	public static ItemBucket registerBucket(ItemBasicBucket bucket, String name, Fluid fluid, Block block) {
		GameRegistry.registerItem(bucket, name);
		FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, 1000), new ItemStack(bucket), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(block, bucket);
		return bucket;
	}
	
	public static ItemBucket registerBucket(ItemBasicBucket bucket) {
		return registerBucket(bucket, bucket.getTrueUnlocalizedName(), bucket.fluid.fluid, bucket.fluid);
	}

	public static void registerRing(Item ring, Item ring2, String name, String name2, Item material) {
		GameRegistry.registerItem(ring, name);
		GameRegistry.registerItem(ring2, name2);
		if(Loader.isModLoaded("Baubles")) {
			GameRegistry.addShapelessRecipe(new ItemStack(ring), ModRingsBaubles.ring, material);
			GameRegistry.addShapelessRecipe(new ItemStack(ring2), ModRingsBaubles.silverRing, material);
		} else {
			GameRegistry.addShapelessRecipe(new ItemStack(ring), ModRings.ring, material);
			GameRegistry.addShapelessRecipe(new ItemStack(ring2), ModRings.silverRing, material);
		}
	}
	
	public static Block registerMaterialBlock(Block block, String name, Item base) {
		GameRegistry.registerBlock(block, name);
		GameRegistry.addRecipe(new ItemStack(block), "mmm", "mmm", "mmm", 'm', base);
		GameRegistry.addShapelessRecipe(new ItemStack(base, 9), block);
		UtilityCheck.addMaterialBlock(block);
		return block;
	}
	
	public static Block registerMaterialBlock(Block block, String name, Item base, String oreDictBase) {
		GameRegistry.registerBlock(block, name);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(block), "mmm", "mmm", "mmm", 'm', oreDictBase));
		GameRegistry.addRecipe(new ItemStack(block), "mmm", "mmm", "mmm", 'm', base);
		GameRegistry.addShapelessRecipe(new ItemStack(base, 9), block);
		UtilityCheck.addMaterialBlock(block);
		return block;
	}
	
	public static Item registerMaterialNugget(ItemMaterial nugget, String name, Item base) {
		registerMaterial(nugget, name);
		GameRegistry.addRecipe(new ItemStack(base), "mmm", "mmm", "mmm", 'm', nugget);
		GameRegistry.addShapelessRecipe(new ItemStack(nugget, 9), base);
		return nugget;
	}
	
	public static Item registerMaterial(ItemMaterial material, String name) {
		GameRegistry.registerItem(material, name);
		UtilityCheck.addMaterial(material);
		return material;
	}
	
	public static ItemMaterial[] registerNewMetal(String name, int colour, MaterialRarity rarity, MaterialDimension dimension) {
		ItemMaterial[] returnList = new ItemMaterial[6];
		returnList[0] = new ItemMaterial(MaterialType.INGOT.getPrefixFromType()+name, ModCreativeTabs.item, 64, MaterialType.INGOT, rarity, colour, dimension);
		returnList[1] = new ItemMaterial(MaterialType.DUST.getPrefixFromType()+name, ModCreativeTabs.dust, 64, MaterialType.DUST, rarity, colour, dimension);
		returnList[2] = new ItemMaterial(MaterialType.CLUSTER.getPrefixFromType()+name, ModCreativeTabs.dust, 64, MaterialType.CLUSTER, rarity, colour, dimension);
		returnList[3] = new ItemMaterial(MaterialType.NUGGET.getPrefixFromType()+name, ModCreativeTabs.plate, 64, MaterialType.NUGGET, rarity, colour, dimension);
		returnList[4] = new ItemMaterial(MaterialType.PLATE.getPrefixFromType()+name, ModCreativeTabs.plate, 64, MaterialType.PLATE, rarity, colour, dimension);
		returnList[5] = new ItemMaterial(MaterialType.GEAR.getPrefixFromType()+name, ModCreativeTabs.gear, 64, MaterialType.GEAR, rarity, colour, dimension);
		registerMaterial(returnList[0], returnList[0].getTrueUnlocalizedName());
		registerMaterial(returnList[1], returnList[1].getTrueUnlocalizedName());
		GameRegistry.addSmelting(returnList[1], new ItemStack(returnList[0]), 5);
		registerMaterial(returnList[2], returnList[2].getTrueUnlocalizedName());
		registerMaterialNugget(returnList[3], returnList[3].getTrueUnlocalizedName(), returnList[0]);
		registerMaterial(returnList[4], returnList[4].getTrueUnlocalizedName());
		registerMaterial(returnList[5], returnList[5].getTrueUnlocalizedName());
		return returnList;
	}
	
	/**
	 * Registers a new material completely, returning everything it registered
	 * 
	 * For ingot:
	 * 0: base
	 * 1: dust
	 * 2: cluster
	 * 3: nugget
	 * 4: plate
	 * 5: gear
	 * 6: ore
	 * 7: block
	 * 8: fluid
	 * 9: fluid block
	 * 10: bucket
	 * 
	 * For alloys:
	 * 0: base
	 * 1: dust
	 * 2: cluster
	 * 3: nugget
	 * 4: plate
	 * 5: gear
	 * 6: block
	 * 7: fluid
	 * 8: fluid block
	 * 9: bucket
	 * 
	 * For gems:
	 * 0: base
	 * 1: dust
	 * 2: cluster
	 * 3: shard
	 * 4: pure
	 * 5: ore
	 * 6: block
	 * 7: fluid
	 * 8: fluid block
	 * 9: bucket
	 * 
	 * For misc:
	 * 0: base
	 * 1: dust
	 * 2: ore
	 * 3: block
	 * 4: fluid
	 * 5: fluid block
	 * 6: bucket
	 * 
	 * NO OTHER TYPE SHOULD BE USED AS BASETYPE!
	 * IF IT DOES HAPPEN, HOWEVER IT WILL BE TREATED AS MISC
	 * 
	 * 'Disabled' parameter is a boolean array. Indexes set
	 * to 'true' set the corresponding indexes that would
	 * normally be returned, to null.
	 * 
	 * 'HasCustomTexture' parameter is another boolean array.
	 * Indexes set to true turn off generated textures for
	 * the coresponding item/block based on return index.
	 * 
	 * 'UseInstead' parameter is an object array. Indexes
	 * not set to 'null' will replace their corresponding
	 * item/block if you want special behaviour. (e.g. lore,
	 * set player on fire etc.) DO NOT USE ANYTHING THAT
	 * ISN'T AN INSTANCE OF BLOCK OR ITEM!
	 * 
	 * 'BlockValues' parameter is an integer array. Indexes
	 * are set in this fashion:
	 * 0: material block harvest level
	 * 1: material block hardness
	 * 2: ore harvest level
	 * 3: ore hardness
	 * 4: ore drop index (coresponds to return index)
	 * 5: ore drop amount min
	 * 6: ore drop amount max
	 * 
	 * 'FluidValues' parameter is an integer array. Indexes
	 * are set in this fashion:
	 * 0: fluid temperature
	 * 1: fluid viscosity
	 * 2: fluid density
	 * 3: fluid luminosity
	 * 
	 * 'ItemBlocks' parameter is an itemblock array. Indexes
	 * not set to 'null' will be used as itemblocks for their
	 * coresponding item based on return index. Useless for
	 * blocks.
	 * 
	 * WARNING: CURRENTLY IN TESTING! DO NOT REPLACE ENTIRE
	 * CODE WITH THIS JUST YET!
	 * 
	 * @param name
	 * @param colour
	 * @param baseType
	 * @param rarity
	 * @param dimension
	 * @param disabled
	 * @param hasCustomTexture
	 * @return
	 */
	public static Object[] registerNewMaterial(String name, int colour, MaterialType baseType, MaterialRarity rarity, MaterialDimension dimension, boolean[] disabled, boolean[] hasCustomTexture, Object[] useInstead, int[] blockValues, int[] fluidValues, ItemBlock[] itemBlocks) {
		for (int i = 0; i < useInstead.length; i++) {
			if(!(useInstead[i] instanceof Block || useInstead[i] instanceof Item) && useInstead[i] != null) {
				throw new IllegalArgumentException("Error in registering material '"+name+"': useInstead index "+i+" was not a block, nor an item");
			}
		}
		if(baseType == MaterialType.INGOT) {
			Object[] returnList = new Object[11];
			if(disabled[0] == false && useInstead[0] == null && hasCustomTexture[0] == false) {
				returnList[0] = new ItemMaterial(MaterialType.INGOT.getPrefixFromType()+name, ModCreativeTabs.item, 64, MaterialType.INGOT, rarity, colour, dimension);
			} else if(disabled[0] == false && useInstead[0] == null && hasCustomTexture[0] == true) {
				returnList[0] = new ItemMaterial(MaterialType.INGOT.getPrefixFromType()+name, ModCreativeTabs.item, 64, MaterialType.INGOT, rarity, dimension);
			} else if(disabled[0] == false && useInstead[0] != null) {
				returnList[0] = useInstead[0];
			} else if(disabled[0] == true) {
				returnList[0] = null;
			}
			registerMaterial(((ItemMaterial)returnList[0]), ((ItemMaterial)returnList[0]).getTrueUnlocalizedName());
			if(disabled[1] == false && useInstead[1] == null && hasCustomTexture[1] == false) {
				returnList[1] = new ItemMaterial(MaterialType.DUST.getPrefixFromType()+name, ModCreativeTabs.dust, 64, MaterialType.DUST, rarity, colour, dimension);
			} else if(disabled[1] == false && useInstead[1] == null && hasCustomTexture[1] == true) {
				returnList[1] = new ItemMaterial(MaterialType.DUST.getPrefixFromType()+name, ModCreativeTabs.dust, 64, MaterialType.DUST, rarity, dimension);
			} else if(disabled[1] == false && useInstead[1] != null) {
				returnList[1] = useInstead[1];
			} else if(disabled[1] == true) {
				returnList[1] = null;
			}
			registerMaterial(((ItemMaterial)returnList[1]), ((ItemMaterial)returnList[1]).getTrueUnlocalizedName());
			GameRegistry.addSmelting(((ItemMaterial)returnList[1]), new ItemStack(((ItemMaterial)returnList[0])), 5);
			if(disabled[2] == false && useInstead[2] == null && hasCustomTexture[2] == false) {
				returnList[2] = new ItemMaterial(MaterialType.CLUSTER.getPrefixFromType()+name, ModCreativeTabs.dust, 64, MaterialType.CLUSTER, rarity, colour, dimension);
			} else if(disabled[2] == false && useInstead[2] == null && hasCustomTexture[2] == true) {
				returnList[2] = new ItemMaterial(MaterialType.CLUSTER.getPrefixFromType()+name, ModCreativeTabs.dust, 64, MaterialType.CLUSTER, rarity, dimension);
			} else if(disabled[2] == false && useInstead[2] != null) {
				returnList[2] = useInstead[2];
			} else if(disabled[2] == true) {
				returnList[2] = null;
			}
			registerMaterial(((ItemMaterial)returnList[2]), ((ItemMaterial)returnList[2]).getTrueUnlocalizedName());
			if(disabled[3] == false && useInstead[3] == null && hasCustomTexture[3] == false) {
				returnList[3] = new ItemMaterial(MaterialType.NUGGET.getPrefixFromType()+name, ModCreativeTabs.plate, 64, MaterialType.NUGGET, rarity, colour, dimension);
			} else if(disabled[3] == false && useInstead[3] == null && hasCustomTexture[3] == true) {
				returnList[3] = new ItemMaterial(MaterialType.NUGGET.getPrefixFromType()+name, ModCreativeTabs.plate, 64, MaterialType.NUGGET, rarity, dimension);
			} else if(disabled[3] == false && useInstead[3] != null) {
				returnList[3] = useInstead[3];
			} else if(disabled[3] == true) {
				returnList[3] = null;
			}
			registerMaterialNugget(((ItemMaterial)returnList[3]), ((ItemMaterial)returnList[3]).getTrueUnlocalizedName(), ((ItemMaterial)returnList[0]));
			if(disabled[4] == false && useInstead[4] == null && hasCustomTexture[4] == false) {
				returnList[4] = new ItemMaterial(MaterialType.PLATE.getPrefixFromType()+name, ModCreativeTabs.plate, 64, MaterialType.PLATE, rarity, colour, dimension);
			} else if(disabled[4] == false && useInstead[4] == null && hasCustomTexture[4] == true) {
				returnList[4] = new ItemMaterial(MaterialType.PLATE.getPrefixFromType()+name, ModCreativeTabs.plate, 64, MaterialType.PLATE, rarity, dimension);
			} else if(disabled[4] == false && useInstead[4] != null) {
				returnList[4] = useInstead[4];
			} else if(disabled[4] == true) {
				returnList[4] = null;
			}
			registerMaterial(((ItemMaterial)returnList[4]), ((ItemMaterial)returnList[4]).getTrueUnlocalizedName());
			if(disabled[5] == false && useInstead[5] == null && hasCustomTexture[5] == false) {
				returnList[5] = new ItemMaterial(MaterialType.GEAR.getPrefixFromType()+name, ModCreativeTabs.gear, 64, MaterialType.GEAR, rarity, colour, dimension);
			} else if(disabled[5] == false && useInstead[5] == null && hasCustomTexture[5] == true) {
				returnList[5] = new ItemMaterial(MaterialType.GEAR.getPrefixFromType()+name, ModCreativeTabs.gear, 64, MaterialType.GEAR, rarity, dimension);
			} else if(disabled[5] == false && useInstead[5] != null) {
				returnList[5] = useInstead[5];
			} else if(disabled[5] == true) {
				returnList[5] = null;
			}
			registerMaterial(((ItemMaterial)returnList[5]), ((ItemMaterial)returnList[5]).getTrueUnlocalizedName());
			if(disabled[6] == false && useInstead[6] == null && blockValues[4] == 6 && blockValues[5] == 1 && blockValues[6] == 1) {
				returnList[6] = new BlockBasic("ore"+name, Material.rock, ModCreativeTabs.block, blockValues[2], blockValues[3]);
			} else if(disabled[6] == false && useInstead[6] == null) {
				returnList[6] = new BlockBasic("ore"+name, Material.rock, ModCreativeTabs.block, blockValues[2], blockValues[3], new ItemStack((Item) returnList[blockValues[4]]));
			} else if(disabled[6] == false && useInstead[6] != null) {
				returnList[6] = useInstead[6];
			} else if(disabled[6] == true) {
				returnList[6] = null;
			}
			GameRegistry.registerBlock(((Block) returnList[6]), ((BlockBasic) returnList[6]).getTrueUnlocalizedName());
			GameRegistry.addSmelting(((Block)returnList[6]), new ItemStack(((ItemMaterial)returnList[0])), 5);
			if(disabled[7] == false && useInstead[7] == null) {
				returnList[7] = new BlockMaterial("block"+name, Material.iron, ModCreativeTabs.block, blockValues[0], blockValues[1], colour, baseType);
			} else if(disabled[7] == false && useInstead[7] != null) {
				returnList[7] = useInstead[7];
			} else if(disabled[7] == true) {
				returnList[7] = null;
			}
			registerMaterialBlock(((BlockMaterial)returnList[7]), ((BlockMaterial)returnList[7]).getTrueUnlocalizedName(), ((ItemMaterial)returnList[0]));
			if(disabled[8] == false && useInstead[8] == null) {
				returnList[8] = new FluidBasic("molten"+name+"Fluid", fluidValues[0], fluidValues[1], fluidValues[2], fluidValues[3]);
			} else if(disabled[8] == false && useInstead[8] != null) {
				returnList[8] = useInstead[8];
			} else if(disabled[8] == true) {
				returnList[8] = null;
			}
			FluidRegistry.registerFluid((Fluid) returnList[8]);
			if(disabled[9] == false && useInstead[9] == null) {
				returnList[9] = new BlockBasicFluid("molten"+name, ((Fluid)returnList[8]), colour);
			} else if(disabled[9] == false && useInstead[9] != null) {
				returnList[9] = useInstead[9];
			} else if(disabled[9] == true) {
				returnList[9] = null;
			}
			GameRegistry.registerBlock((Block) returnList[9], ((BlockBasicFluid) returnList[9]).getTrueUnlocalizedName());
			if(disabled[10] == false && useInstead[10] == null) {
				returnList[10] = new ItemBasicBucket("molten"+name+"Bucket", ((Block)returnList[9]), ModCreativeTabs.liquid, colour);
			} else if(disabled[10] == false && useInstead[10] != null) {
				returnList[10] = useInstead[10];
			} else if(disabled[10] == true) {
				returnList[10] = null;
			}
			Register.registerBucket((ItemBasicBucket) returnList[10]);
			
			return returnList;
		}
		return null;
		
	}
	
	public static Dimension registerDimension(Dimension dimension, Class worldprovider) {
		DimensionManager.registerProviderType(dimension.id, worldprovider, dimension.alwaysLoaded);
		DimensionManager.registerDimension(dimension.id, dimension.id);
		return dimension;
	}
	
	public static void registerPaintingRecipes(Block inBlock, Block outBlock) {
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 1, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 2, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 3, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 4, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 5, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 6, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 7, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(outBlock, 8, i), new ItemStack(ModItems.paintbrushColoured, 1, i), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock), new ItemStack(inBlock));
		}
	}

	public static void registerPaintingRecipes(String oreDict, Block outBlock) {
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 1, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 2, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 3, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict, oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 4, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict, oreDict, oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 5, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict, oreDict, oreDict, oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 6, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict, oreDict, oreDict, oreDict, oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 7, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict, oreDict, oreDict, oreDict, oreDict, oreDict));
		}
		for (int i = 0; i <= 15; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(outBlock, 8, i), new ItemStack(ModItems.paintbrushColoured, 1, i), oreDict, oreDict, oreDict, oreDict, oreDict, oreDict, oreDict, oreDict));
		}
	}
}
