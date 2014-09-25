package omgimalexis.allthethings.block;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.tile_entity.TileEntityBattery;

public class BlockBattery extends BlockContainer {

	public BlockBattery() {
		super(Material.rock);
		setHardness(3.5F);
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (!world.isRemote) {
			TileEntityBattery tileEntity = (TileEntityBattery) world.getTileEntity(x, y, z);
			tileEntity.increasePowerLevel(50);

			player.addChatMessage(new ChatComponentText("This is a chat box."));
			player.addChatMessage(new ChatComponentText("" + tileEntity.getPowerLevel()));
		}
		return true;
	}

	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityBattery();
	}
	
}
