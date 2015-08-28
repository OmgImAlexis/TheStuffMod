package com.shnupbups.allthethings.event;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import com.shnupbups.allthethings.tileEntity.TileEntityCompressor;
import com.shnupbups.allthethings.tileEntity.TileEntityGenerator;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;
import com.shnupbups.allthethings.tileEntity.TileEntityPulverizer;

import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;

public abstract class MachineEvent extends Event {

	public final ItemStack[] crafting;
    public final IInventory input;
    
	public MachineEvent(ItemStack[] crafting, IInventory input) {
		super();
		this.crafting = crafting;
		this.input = input;
	}
	
	@Cancelable
	public static class OnOvenEvent extends MachineEvent {
		public OnOvenEvent(ItemStack[] crafting, TileEntityOven input) {
			super(crafting, input);
		}
		
		@Cancelable
		public static class Pre extends OnOvenEvent {
			public Pre(ItemStack[] crafting, TileEntityOven input) {
				super(crafting, input);
			}
		}
		
		@Cancelable
		public static class Post extends OnOvenEvent {
			public Post(ItemStack[] crafting, TileEntityOven input) {
				super(crafting, input);
			}
		}
	}
	
	@Cancelable
	public static class OnCompressEvent extends MachineEvent {
		public OnCompressEvent(ItemStack[] crafting, TileEntityCompressor input) {
			super(crafting, input);
		}
		
		@Cancelable
		public static class Pre extends OnCompressEvent {
			public Pre(ItemStack[] crafting, TileEntityCompressor input) {
				super(crafting, input);
			}
		}
		
		@Cancelable
		public static class Post extends OnCompressEvent {
			public Post(ItemStack[] crafting, TileEntityCompressor input) {
				super(crafting, input);
			}
		}
	}
	
	@Cancelable
	public static class OnPulverizeEvent extends MachineEvent {
		public OnPulverizeEvent(ItemStack[] crafting, TileEntityPulverizer input) {
			super(crafting, input);
		}
		
		@Cancelable
		public static class Pre extends OnPulverizeEvent {
			public Pre(ItemStack[] crafting, TileEntityPulverizer input) {
				super(crafting, input);
			}
		}
		
		@Cancelable
		public static class Post extends OnPulverizeEvent {
			public Post(ItemStack[] crafting, TileEntityPulverizer input) {
				super(crafting, input);
			}
		}
	}
	
	@Cancelable
	public static class OnGenerateEvent extends MachineEvent {
		public OnGenerateEvent(ItemStack[] crafting, TileEntityGenerator input) {
			super(crafting, input);
		}
		
		@Cancelable
		public static class Pre extends OnGenerateEvent {
			public Pre(ItemStack[] crafting, TileEntityGenerator input) {
				super(crafting, input);
			}
		}
		
		@Cancelable
		public static class Post extends OnGenerateEvent {
			public Post(ItemStack[] crafting, TileEntityGenerator input) {
				super(crafting, input);
			}
		}
	}

}
