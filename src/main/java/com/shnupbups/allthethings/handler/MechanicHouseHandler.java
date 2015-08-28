package com.shnupbups.allthethings.handler;

import java.util.List;
import java.util.Random;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import com.shnupbups.allthethings.world.village.MechanicStructureHouse;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class MechanicHouseHandler implements IVillageCreationHandler {
	@Override
	public PieceWeight getVillagePieceWeight(Random random,int i) {
		return new PieceWeight(MechanicStructureHouse.class,2,i+random.nextInt(2));
	}

	@Override
	public Class<?> getComponentClass() {
		return MechanicStructureHouse.class;
	}

	@Override
	public Object buildComponent(PieceWeight villagePiece,Start startPiece,List pieces,Random random,int p1,int p2,int p3,int p4,int p5) {
		return MechanicStructureHouse.buildComponent(startPiece,pieces,random,p1,p2,p3,p4,p5);
	}
}
