package com.shnupbups.allthethings.world.village;

import java.util.List;
import java.util.Random;

import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.init.ModMisc;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraftforge.common.ChestGenHooks;

public class VillageStructureHouse extends StructureVillagePieces.House1 {
	//Thanks Tinker's
	private int averageGroundLevel = -1;
	
	public VillageStructureHouse() {}
	
	public VillageStructureHouse(Start villagePiece, int par2, Random rand, StructureBoundingBox bounds, int par5) {
		super();
		this.coordBaseMode = par5;
		this.boundingBox = bounds;
	}
	
	public static VillageStructureHouse buildComponent (Start villagePiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5){
		StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(p1, p2, p3, 0, 0, 0, 7, 6, 7, p4);
		return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(pieces, structureboundingbox) == null ? new VillageStructureHouse(villagePiece, p5, random, structureboundingbox, p4) : null;
    }
	@Override
    public boolean addComponentParts (World world, Random random, StructureBoundingBox sbb)
    {
        if (this.averageGroundLevel < 0)
        {
            this.averageGroundLevel = this.getAverageGroundLevel(world, sbb);

            if (this.averageGroundLevel < 0)
            {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 4, 0);
        }

        /**
         * arguments: (World worldObj, StructureBoundingBox structBB, int minX,
         * int minY, int minZ, int maxX, int maxY, int maxZ, int placeBlockId,
         * int replaceBlockId, boolean alwaysreplace)
         */

        this.fillWithMetadataBlocks(world, sbb, 3, 1, -1, 3, 1, -1, Blocks.stone_stairs, this.getMetadataWithOffset(Blocks.stone_stairs, 3), Blocks.stone_stairs, this.getMetadataWithOffset(Blocks.stone_stairs, 3), false);
        this.fillWithBlocks(world, sbb, 0, 0, 0, 6, 0, 6, Blocks.cobblestone, Blocks.cobblestone, false); // Base
        this.fillWithBlocks(world, sbb, 0, 1, 0, 0, 1, 6, Blocks.cobblestone, Blocks.cobblestone, false);
        this.fillWithBlocks(world, sbb, 0, 1, 0, 6, 1, 0, Blocks.cobblestone, Blocks.cobblestone, false);
        this.fillWithBlocks(world, sbb, 6, 1, 0, 6, 1, 6, Blocks.cobblestone, Blocks.cobblestone, false);
        this.fillWithBlocks(world, sbb, 0, 1, 6, 6, 1, 6, Blocks.cobblestone, Blocks.cobblestone, false);
        this.fillWithBlocks(world, sbb, 1, 1, 1, 5, 1, 5, Blocks.planks, Blocks.planks, false);
        this.fillWithBlocks(world, sbb, 0, 2, 0, 0, 5, 6, Blocks.planks, Blocks.planks, false);
        this.fillWithBlocks(world, sbb, 0, 2, 0, 6, 5, 0, Blocks.planks, Blocks.planks, false);
        this.fillWithBlocks(world, sbb, 6, 2, 0, 6, 5, 6, Blocks.planks, Blocks.planks, false);
        this.fillWithBlocks(world, sbb, 0, 2, 6, 6, 5, 6, Blocks.planks, Blocks.planks, false);
        this.fillWithBlocks(world, sbb, 1, 6, 1, 5, 6, 5, Blocks.planks, Blocks.planks, false);
        this.fillWithBlocks(world, sbb, 0, 6, 0, 0, 6, 6, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 0, 6, 0, 6, 6, 0, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 6, 6, 0, 6, 6, 6, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 0, 6, 6, 6, 6, 6, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 6, 2, 6, 6, 5, 6, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 0, 2, 0, 0, 5, 0, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 6, 2, 0, 6, 5, 0, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 0, 2, 6, 0, 5, 6, Blocks.log, Blocks.log, false);
        this.fillWithBlocks(world, sbb, 2, 3, 6, 4, 3, 6, Blocks.glass_pane, Blocks.glass_pane, false);
        this.fillWithBlocks(world, sbb, 6, 3, 2, 6, 3, 4, Blocks.glass_pane, Blocks.glass_pane, false);
        this.fillWithBlocks(world, sbb, 0, 3, 2, 0, 3, 4, Blocks.glass_pane, Blocks.glass_pane, false);
        this.placeBlockAtCurrentPosition(world, Blocks.torch, 0, 3, 4, 1, sbb);
        this.placeBlockAtCurrentPosition(world, Blocks.crafting_table, 0, 1, 2, 5, sbb);
        this.generateStructureChestContents(world, sbb, random, 5, 2, 5, ModMisc.houseChest.getItems(random), ModMisc.houseChest.getCount(random));
        this.placeDoorAtCurrentPosition(world, sbb, random, 3, 2, 0, this.getMetadataWithOffset(Blocks.wooden_door, 1));

        this.spawnVillagers(world, sbb, 3, 2, 3, random.nextInt(2)+1);

        return true;
        
    }

    /**
     * Returns the villager type to spawn in this component, based on the number
     * of villagers already spawned.
     */
    @Override
    protected int getVillagerType (int par1)
    {
        return 56329;
    }
}
