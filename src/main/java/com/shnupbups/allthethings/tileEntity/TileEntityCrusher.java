package com.shnupbups.allthethings.tileEntity;

import com.shnupbups.allthethings.energy.EnergyBar;
import com.shnupbups.allthethings.energy.IEnergy;
import com.shnupbups.allthethings.init.ModItems;
import com.shnupbups.allthethings.machine.BlockType;
import com.shnupbups.allthethings.machine.IMachine;
import com.shnupbups.allthethings.utility.CrushingRecipes;
import com.shnupbups.allthethings.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityCrusher extends TileEntity implements ISidedInventory,IMachine,IEnergy {
	private boolean hasMaster = false, isMaster = false;
	private int masterX, masterY, masterZ;
	
	private static final int[] slotsTop = new int[]{0};
	private static final int[] slotsBottom = new int[]{1,2};
	private static final int[] slotsSides = new int[]{0};
	
	public EnergyBar energyBar = new EnergyBar(100000);
	public int defaultMaxEnergy = 100000;
	public int maxEnergy = 100000;
	public ItemStack[] inventory = new ItemStack[6];
	public int energyUsePerOperate = 3200;
	public int defaultUsePerOperate = 3200;
	public boolean isOperating;
	public int operateStatus;
	public int operateTime = 160;
	public int defaultTime = 160;
	public int energyInput = 200;
	public int defaultInput = 200;
	public int chanceOfSecondOutput = 2;
	
	@Override
	public void updateEntity() {
	    super.updateEntity();
	    if (!worldObj.isRemote) {
	        if (hasMaster()) { 
	        	LogHelper.info(getMasterX()+","+getMasterY()+","+getMasterZ());
	            if (isMaster()) {
	            	updateUpgrades();

	        		energyBar.setMaxEnergy(maxEnergy);
	        		boolean modified = isOperating;
	        		this.isOperating = canOperate();
	        		if(this.isOperating) {
	        			this.operateStatus += 1;
	        			if(energyUsePerOperate/operateTime > 0) {
	        				energyBar.removeEnergy(energyUsePerOperate/operateTime);
	        			} else {
	        				energyBar.removeEnergy(energyUsePerOperate);
	        			}
	        		} else {
	        			this.operateStatus = 0;
	        		}
	        		
	        		if(this.operateStatus >= this.operateTime) {
	        			operate();
	        			this.operateStatus = 0;
	        		}
	            }
	        } else {
	            // Constantly check if structure is formed until it is.
	            if (checkMultiBlockForm()) {
	            	resetStructure();
	                setupStructure();
	            } else {
	            	reset();
	            }
	        }
	    }
	    
	    worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	public void updateUpgrades() {
		operateTime = defaultTime;
		energyUsePerOperate = defaultUsePerOperate;
		chanceOfSecondOutput = 0;
		maxEnergy = defaultMaxEnergy;
		energyInput = defaultInput;
		for (int i = 3; i < 6; i++) {
			if(inventory[i] != null && inventory[i].getItem() != null) {
				if(inventory[i].getItem() == ModItems.speedUpgrade) {
					operateTime /= 2.5;
				} else if(inventory[i].getItem() == ModItems.efficiencyUpgrade) {
					energyUsePerOperate -= 300;
				} else if(inventory[i].getItem() == ModItems.capacityUpgrade) {
					maxEnergy *= 2;
				} else if(inventory[i].getItem() == ModItems.outputUpgrade) {
					chanceOfSecondOutput++;
				} else if(inventory[i].getItem() == ModItems.inputUpgrade) {
					energyInput *= 10;
				}
			}
		}
	}

    @Override
    public void writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        data.setInteger("masterX", masterX);
        data.setInteger("masterY", masterY);
        data.setInteger("masterZ", masterZ);
        data.setBoolean("hasMaster", hasMaster);
        data.setBoolean("isMaster", isMaster);
        if (hasMaster() && isMaster()) {
        	energyBar.writeToNBT(data);
    		NBTTagList list = new NBTTagList();
    		for(int i = 0; i < this.inventory.length; i++) {
    			if(this.inventory[i] != null) {
    				NBTTagCompound compound1 = new NBTTagCompound();
    				compound1.setByte("slot", (byte) i);
    				this.inventory[i].writeToNBT(compound1);
    				list.appendTag(compound1);
    			}
    		}
    		data.setTag("inventory", list);
    		data.setInteger("operateStatus", operateStatus);
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        masterX = data.getInteger("masterX");
        masterY = data.getInteger("masterY");
        masterZ = data.getInteger("masterZ");
        hasMaster = data.getBoolean("hasMaster");
        isMaster = data.getBoolean("isMaster");
        if (hasMaster() && isMaster()) {
        	energyBar.readFromNBT(data);
    		NBTTagList list = data.getTagList("inventory", 10);
    		this.inventory = new ItemStack[this.getSizeInventory()];
    		for(int i = 0; i < list.tagCount(); i++) {
    			NBTTagCompound compound1 = list.getCompoundTagAt(i);
    			byte byte0 = compound1.getByte("slot");
    			
    			if(byte0 >= 0 && byte0 < this.inventory.length) {
    				this.inventory[byte0] = ItemStack.loadItemStackFromNBT(compound1);
    			}
    		}
    		operateStatus = data.getInteger("operateStatus");
        }
    }
    
    public boolean checkMultiBlockForm() {
        int i = 0;
        // Scan a 3x3x3 area, starting with the bottom left corner
        for (int x = xCoord - 1; x <= xCoord + 1; x++)
            for (int y = yCoord - 1; y <= yCoord + 1; y++)
                for (int z = zCoord; z <= zCoord + 2; z++) {
                	if(worldObj.blockExists(x, y, z)) {
                		TileEntity tile = worldObj.getTileEntity(x, y, z);
                        // Make sure tile isn't null, is an instance of the same Tile, and isn't already a part of a multiblock
                        if (tile != null && (tile instanceof TileEntityCrusher)) {
                            if (this.isMaster()) {
                                if (((TileEntityCrusher)tile).hasMaster())
                                    i++;
                            } else if (!((TileEntityCrusher)tile).hasMaster()) {
                                i++;
                            }
                        }
                	} else return false;
                 }
         // check if there are 26 blocks present ((3*3*3) - 1) and check that center block is empty
         return i > 25 && worldObj.isAirBlock(xCoord, yCoord, zCoord+1);
    }
    
    public void setupStructure() {
    	for (int x = xCoord - 1; x <= xCoord + 1; x++) {
            for (int y = yCoord - 1; y <= yCoord + 1; y++) {
                for (int z = zCoord; z <= zCoord + 2; z++) {
                    TileEntity tile = worldObj.getTileEntity(x, y, z);
                    // Check if block is bottom center block
                    boolean master = (x == xCoord-1 && y == yCoord+1 && z == zCoord);
                    if (tile != null && (tile instanceof TileEntityCrusher)) {
                        ((TileEntityCrusher) tile).setMasterCoords(xCoord-1, yCoord+1, zCoord);
                        ((TileEntityCrusher) tile).setHasMaster(true);
                        ((TileEntityCrusher) tile).setIsMaster(master);
                    }
                }
            }
        }
    }
    
    public void reset() {
        masterX = 0;
        masterY = 0;
        masterZ = 0;
        hasMaster = false;
        isMaster = false;
    }

    public boolean checkForMaster() {
        TileEntity tile = worldObj.getTileEntity(masterX, masterY, masterZ);
        return (tile != null && (tile instanceof TileEntityCrusher));
    }
    
    public void resetStructure() {
        for (int x = xCoord - 1; x < xCoord + 1; x++) {
            for (int y = yCoord; y < yCoord + 2; y++) {
                for (int z = zCoord - 1; z < zCoord + 1; z++) {
                    TileEntity tile = worldObj.getTileEntity(x, y, z);
                    if (tile != null && (tile instanceof TileEntityCrusher))
                        ((TileEntityCrusher) tile).reset();
                }
            }
        }
    }

    public boolean hasMaster() {
        return hasMaster;
    }

    public boolean isMaster() {
        return isMaster;
    }

    public int getMasterX() {
        return masterX;
    }

    public int getMasterY() {
        return masterY;
    }

    public int getMasterZ() {
        return masterZ;
    }

    public void setHasMaster(boolean bool) {
        hasMaster = bool;
    }

    public void setIsMaster(boolean bool) {
        isMaster = bool;
    }

    public void setMasterCoords(int x, int y, int z) {
        masterX = x;
        masterY = y;
        masterZ = z;
    }
	
	@Override
	public boolean canAddEnergyOnSide(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canConnect(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return true;
	}

	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	}
	
	public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		if(hasMaster() && !isMaster()) {
			((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).inventory[slot] = itemstack;
			
			if(itemstack != null && itemstack.stackSize > ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).getInventoryStackLimit()) {
				itemstack.stackSize = ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).getInventoryStackLimit();
			}
			
			((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).markDirty();
		} else {
			inventory[slot] = itemstack;
			
			if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
				itemstack.stackSize = this.getInventoryStackLimit();
			}
			
			markDirty();
		}
	}
	
	@Override
	public EnergyBar getEnergyBar() {
		if(hasMaster() && !isMaster()) return ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).energyBar;
		else return energyBar;
	}
	
	@Override
	public int getEnergyTransferRate() {
		if(hasMaster() && !isMaster()) return ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).energyInput;
		else return energyInput;
	}

	@Override
	public BlockType getTypeOfBlock() {
		return BlockType.MACHINE;
	}
	
	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return Double.MAX_VALUE;
	}

	@Override
	public void setLastRecievedDirection(ForgeDirection direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSizeInventory() {
		if(hasMaster() && !isMaster()) return ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).inventory.length;
		else if(hasMaster()) return inventory.length;
		else return 0;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_) {
		if(hasMaster() && !isMaster()) return ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).inventory[p_70301_1_];
		else if(hasMaster()) return inventory[p_70301_1_];
		else return null;
	}

	@Override
	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
		if(hasMaster() && !isMaster()) {((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).inventory[p_70298_1_].stackSize-=p_70298_2_; return inventory[p_70298_1_];}
		else if(hasMaster()) {inventory[p_70298_1_].stackSize-=p_70298_2_; return inventory[p_70298_1_];}
		else return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
		if(hasMaster() && !isMaster()) return ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).inventory[p_70304_1_];
		else if(hasMaster()) return inventory[p_70304_1_];
		else return null;
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return "Crusher";
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		if(((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).checkMultiBlockForm()) this.setHasMaster(false);
		return hasMaster && ((TileEntityCrusher)this.worldObj.getTileEntity(masterX, masterY, masterZ)).checkMultiBlockForm();
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void operate() {
		if(CrushingRecipes.getPulverizeResult(inventory[0]) != null) {
			if(inventory[1] == null){
				if(!(CrushingRecipes.getPulverizeResult(inventory[0]).stackSize >= 1)) CrushingRecipes.getPulverizeResult(inventory[0]).stackSize = 1;
				setInventorySlotContents(1, CrushingRecipes.getPulverizeResult(inventory[0]).copy());
				inventory[1].stackSize = CrushingRecipes.getPulverizeResult(inventory[0]).stackSize;
				if(this.worldObj.rand.nextInt(5) < chanceOfSecondOutput) {
					if(inventory[2] == null){
						setInventorySlotContents(2, CrushingRecipes.getPulverizeResult(inventory[0]).copy());
						inventory[2].stackSize += CrushingRecipes.getPulverizeAmount(inventory[0]);
					} else if(inventory[2].isItemEqual(CrushingRecipes.getPulverizeResult(inventory[0]))) {
						inventory[2].stackSize += CrushingRecipes.getPulverizeAmount(inventory[0]);
					}
				}
				markDirty();
			} else if(inventory[1].isItemEqual(CrushingRecipes.getPulverizeResult(inventory[0]))) {
				inventory[1].stackSize += CrushingRecipes.getPulverizeAmount(inventory[0]);
				if(this.worldObj.rand.nextInt(5) < chanceOfSecondOutput) {
					if(inventory[2] == null){
						setInventorySlotContents(2, CrushingRecipes.getPulverizeResult(inventory[0]).copy());
						inventory[2].stackSize += CrushingRecipes.getPulverizeAmount(inventory[0]);
					} else if(inventory[2].isItemEqual(CrushingRecipes.getPulverizeResult(inventory[0]))) {
						inventory[2].stackSize += CrushingRecipes.getPulverizeAmount(inventory[0]);
					}
				}
				markDirty();
			}
			markDirty();
			
			if(inventory[0] != null) {
				inventory[0].stackSize -= CrushingRecipes.getStackSizeToDecrease(inventory[0]);
				markDirty();
				if(inventory[0].stackSize <= 0) {
					inventory[0] = null;
					markDirty();
				}
			}
		}
		isOperating = false;
		
		markDirty();
	}

	@Override
	public boolean canOperate() {
		if(inventory[0] == null) {return false;}
		if(CrushingRecipes.getPulverizeResult(inventory[0]) == null) {return false;}
		if(!energyBar.canRemoveEnergy(energyUsePerOperate)) {return false;}
		if(inventory[1] == null && inventory[2] == null) {return true;}
		if((inventory[1] != null && !inventory[1].isItemEqual(CrushingRecipes.getPulverizeResult(inventory[0]))) || (inventory[2] != null && !inventory[2].isItemEqual(CrushingRecipes.getPulverizeResult(inventory[0])))) {return false;}
		if((inventory[1] != null && inventory[1].stackSize + CrushingRecipes.getPulverizeResult(inventory[0]).stackSize > inventory[1].getMaxStackSize()) || inventory[2] != null && inventory[2].stackSize + CrushingRecipes.getPulverizeResult(inventory[0]).stackSize > inventory[2].getMaxStackSize()) {return false;}
		if(inventory[1] != null) {
			int resultStack = inventory[1].stackSize + CrushingRecipes.getPulverizeResult(inventory[0]).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= CrushingRecipes.getPulverizeResult(inventory[0]).getMaxStackSize());
		} else {
			int resultStack = inventory[2].stackSize + CrushingRecipes.getPulverizeResult(inventory[0]).stackSize;
			return (resultStack <= getInventoryStackLimit()) && (resultStack <= CrushingRecipes.getPulverizeResult(inventory[0]).getMaxStackSize());
		}
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_,
			int p_102007_3_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_,
			int p_102008_3_) {
		// TODO Auto-generated method stub
		return false;
	}

}
