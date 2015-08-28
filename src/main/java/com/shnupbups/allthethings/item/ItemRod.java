package com.shnupbups.allthethings.item;

import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.init.ModMisc;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.magic.EssenceType;
import com.shnupbups.allthethings.magic.ItemMagic;
import com.shnupbups.allthethings.utility.RodHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRod extends ItemMagic {
	public ItemRod(String name,CreativeTabs tab) {
		super(name,tab,1);
		this.setMaxDamage(512);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack,World world,EntityPlayer player) {
		if(!world.isRemote) {
			if(player.isSneaking()) {
				player.openGui(allthethings.instance,ModMisc.rodID,player.worldObj,(int)player.posX,(int)player.posY,(int)player.posZ);
			} else {
				if(RodHelper.doPower(stack,world,player)) {
					if(world.rand.nextInt(10)<=1) {
						this.getProperties(player).addFluo(1,false,true);
					}
				}
			}
		}
		return stack;
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return RodHelper.getName(stack);
	}

	@Override
	@SuppressWarnings({"rawtypes","unchecked"})
	public void addInformation(ItemStack stack,EntityPlayer player,List list,boolean bool) {
		list.add("Harnesses the Power of Essences");
		list.add("Current Power: "+RodHelper.getPowerName(stack,player.getEntityWorld(),player));
		super.addInformation(stack,player,list,bool);
	}

	public IIcon[] icons=new IIcon[4];

	@Override
	public void registerIcons(IIconRegister reg) {
		this.icons[0]=reg.registerIcon(Reference.MOD_ID+":rod");
		this.icons[1]=reg.registerIcon(Reference.MOD_ID+":essence0");
		this.icons[2]=reg.registerIcon(Reference.MOD_ID+":essence1");
		this.icons[3]=reg.registerIcon(Reference.MOD_ID+":blank");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(ItemStack stack,int pass) {
		if(pass==0) {
			return icons[0];
		} else if(pass<=2) {
			if(RodHelper.getEssence(stack,pass-1)!=null) {
				return icons[pass];
			}
		}
		return icons[3];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}

	public int getRenderPasses(int metadata) {
		return 3;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack,int pass) {
		if(pass!=0) {
			EssenceType type=RodHelper.getEssence(stack,pass-1);
			if(type!=null) {
				return type.getColour();
			}
		}
		return super.getColorFromItemStack(stack,pass);
	}

	@Override
	public boolean renderFluoInHUD() {
		return true;
	}
}
