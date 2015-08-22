package com.shnupbups.allthethings.utility;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import org.apache.commons.lang3.text.WordUtils;

import com.shnupbups.allthethings.entity.magic.EntitySpellPotion;
import com.shnupbups.allthethings.init.ModAchievements;
import com.shnupbups.allthethings.init.ModCustomRecipes;
import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.inventory.InventoryRod;
import com.shnupbups.allthethings.item.ItemEssence;
import com.shnupbups.allthethings.item.ItemRod;
import com.shnupbups.allthethings.magic.EssenceType;

public class RodHelper {

	/**
	 * Executes an Essensular Rod's power based upon ItemStack.<br>
	 * Pulls NBT data from stack, reads items it contains, reads THEIR nbt, and runs power based on EssenceTypes.
	 * 
	 * @param stack
	 * @param world
	 * @param player
	 * @return If the power exists and was successfully executed.
	 */
	public static boolean doPower(ItemStack stack, World world, EntityPlayer player) {
		ModCustomRecipes.init();
		if(stack.getItem() != null && stack.getItem() instanceof ItemRod) {
			if(stack.getTagCompound() != null) {
				ItemStack essence0 = null, essence1 = null;
			
				NBTTagList inventory = stack.getTagCompound().getTagList("inventory", Constants.NBT.TAG_COMPOUND);
				for (int i = 0; i < inventory.tagCount(); ++i) {
					NBTTagCompound item = (NBTTagCompound) inventory.getCompoundTagAt(i);
					byte slot = item.getByte("slot");

					if(slot == 0) essence0 = ItemStack.loadItemStackFromNBT(item);
					else if(slot == 1) essence1 = ItemStack.loadItemStackFromNBT(item);
				}
			
				if(essence0 != null && essence0.getItem() != null) {
					if(essence0.getItem() instanceof ItemEssence) {
						if(essence1 != null && essence1.getItem() != null && essence1 != essence0) {
							if(essence1.getItem() instanceof ItemEssence) {
								EssenceType essence0type = EssenceType.getFromId(essence0.getTagCompound().getInteger("id"));
								EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
								//Execute based on both 0 & 1
								boolean succeed = doPower(essence0type, essence1type, world, player);
								if(succeed) {
									InventoryRod iinventory = new InventoryRod(stack);
									ItemStack stack0 = iinventory.getStackInSlot(0).copy();
									stack0.damageItem(1, player);
									iinventory.setInventorySlotContents(0, stack0);
									ItemStack stack1 = iinventory.getStackInSlot(1).copy();
									stack1.damageItem(1, player);
									iinventory.setInventorySlotContents(1, stack1);
									stack.damageItem(1, player);
								} else {
									succeed = doPower(essence1type, essence0type, world, player);
									if(succeed) {
										InventoryRod iinventory = new InventoryRod(stack);
										ItemStack stack0 = iinventory.getStackInSlot(0).copy();
										stack0.damageItem(1, player);
										iinventory.setInventorySlotContents(0, stack0);
										ItemStack stack1 = iinventory.getStackInSlot(1).copy();
										stack1.damageItem(1, player);
										iinventory.setInventorySlotContents(1, stack1);
										stack.damageItem(1, player);
									}
								} return succeed;
							}
						} else {
							EssenceType essence0type = EssenceType.getFromId(essence0.getTagCompound().getInteger("id"));
							//Execute based on just 0
							boolean succeed = doPower(essence0type, world, player);
							if(succeed) {
								InventoryRod iinventory = new InventoryRod(stack);
								ItemStack stack0 = iinventory.getStackInSlot(0).copy();
								stack0.damageItem(1, player);
								iinventory.setInventorySlotContents(0, stack0);
								stack.damageItem(1, player);
							} return succeed;
						}
					} else if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
						if(essence1.getItem() instanceof ItemEssence) {
							EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
							//Execute based on just 1
							boolean succeed = doPower(essence1type, world, player);
							if(succeed) {
								InventoryRod iinventory = new InventoryRod(stack);
								ItemStack stack1 = iinventory.getStackInSlot(1).copy();
								stack1.damageItem(1, player);
								iinventory.setInventorySlotContents(0, stack1);
								stack.damageItem(1, player);
							} return succeed;
						}
					}
				} else if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
					if(essence1.getItem() instanceof ItemEssence) {
						EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
						//Execute based on just 1
						boolean succeed = doPower(essence1type, world, player);
						if(succeed) {
							InventoryRod iinventory = new InventoryRod(stack);
							ItemStack stack1 = iinventory.getStackInSlot(1).copy();
							stack1.damageItem(1, player);
							iinventory.setInventorySlotContents(0, stack1);
							stack.damageItem(1, player);
						} return succeed;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Executes an Essensular Rod's power based upon EssenceTypes directly.
	 * 
	 * @param type
	 * @param type1
	 * @param world
	 * @param player
	 * @return If the power exists and was successfully executed.
	 */
	public static boolean doPower(EssenceType type, EssenceType type1, World world, EntityPlayer player) {
		switch(type) {
		case ACHIEVEMENT:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					player.addStat(AchievementList.ghast, 1);
					return true;
				case ACHIEVEMENT:
					player.addStat(ModAchievements.achievement, 1);
					return true;
				case ADVENTURE:
					player.addStat(AchievementList.field_150961_L, 1);
					return true;
				case CREATION:
					player.addStat(AchievementList.buildWorkBench, 1);
					return true;
				case EARTH:
					player.addStat(ModAchievements.dirt, 1);
					return true;
				case ENDER:
					player.addStat(AchievementList.theEnd, 1);
					return true;
				case FINALITY:
					player.addStat(AchievementList.field_150965_K, 1);
					return true;
				case FIRE:
					player.addStat(ModAchievements.pyromaniac, 1);
					return true;
				case GREED:
					player.addStat(ModAchievements.mineGem, 1);
					return true;
				case HARM:
					player.addStat(AchievementList.buildSword, 1);
					return true;
				case HELL:
					player.addStat(AchievementList.portal, 1);
					return true;
				case LIFE:
					player.addStat(ModAchievements.alive, 1);
					return true;
				case LOVE:
					player.addStat(AchievementList.field_150962_H, 1);
					return true;
				case LUCK:
					player.addStat(AchievementList.overkill, 1);
					return true;
				case MECHANISM:
					player.addStat(ModAchievements.machine, 1);
					return true;
				case METAL:
					player.addStat(AchievementList.acquireIron, 1);
					return true;
				case NONSENSE:
					player.addStat(AchievementList.flyPig, 1);
					return true;
				case POWER:
					player.addStat(ModAchievements.steveAlmighty, 1);
					return true;
				case RADIATION:
					player.addStat(ModAchievements.mineUranium, 1);
					return true;
				case REDUNDANCY:
					player.addStat(AchievementList.openInventory, 1);
					return true;
				case TASTE:
					player.addStat(AchievementList.makeBread, 1);
					return true;
				case TRANSPORT:
					player.addStat(AchievementList.onARail, 1);
					return true;
				case UTILITY:
					player.addStat(AchievementList.buildPickaxe, 1);
					return true;
				case VICTORY:
					player.addStat(AchievementList.theEnd2, 1);
					return true;
				case WASTE:
					player.addStat(ModAchievements.diamondHoe, 1);
					return true;
				case WOOD:
					player.addStat(AchievementList.mineWood, 1);
					return true;
				case WORTH:
					player.addStat(AchievementList.diamonds, 1);
					return true;
				default:
					return false;
				}
			}
		case TIME:
			if(type1!=null) {
				switch(type1) {
				case DARKNESS:
					world.setWorldTime(13000);
					return true;
				case LIGHT:
					world.setWorldTime(1000);
					return true;
				default:
					return false;
				}
			}
		case WATER:
			if(type1 != null) {
				switch(type1) {
				case AIR:
					player.setAir(300);
					return true;
				case SPEED:
					if(player.isInWater() || player.isInsideOfMaterial(Material.water)) {
						double d0 = player.posY;
			            player.moveEntity(player.motionX, player.motionY, player.motionZ);
			            player.motionY += 0.02D;
			            player.motionX /= 0.800000011920929D;
			            player.motionY /= 0.800000011920929D;
			            player.motionZ /= 0.800000011920929D;
			        }
					return true;
				default:
					return false;
				}
			}
		case WEATHER:
			if(type1 != null) {
				switch(type1) {
				case ANIMAL: {
					MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
					if(mop != null) {
						if(world.rand.nextInt(2) < 1) {
							EntityWolf wolf = new EntityWolf(world);
							wolf.setTamed(true);
							wolf.setPosition(mop.blockX, mop.blockY+20, mop.blockZ);
							world.spawnEntityInWorld(wolf);
						} else {
							EntityOcelot ocelot = new EntityOcelot(world);
							ocelot.setTamed(true);
							ocelot.setTameSkin(world.rand.nextInt(3)+1);
							ocelot.setPosition(mop.blockX, mop.blockY+10, mop.blockZ);
							world.spawnEntityInWorld(ocelot);
							ocelot.tasks.taskEntries.clear();
							ocelot.setVelocity(0, -50, 0);
							ocelot.attackEntityFrom(DamageSource.fall, 9001.0f);
						}
					}
					return true;
				}
				case ELECTRICITY: {
					MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
					if(mop != null) {
						world.addWeatherEffect(new EntityLightningBolt(world, mop.blockX, mop.blockY, mop.blockZ));
					}
					return true;
				}
				case WATER:
					world.getWorldInfo().setRaining(true);
					return true;
				default:
					return false;
				}
			}
		case MAGIC:
			if(type1!=null){
				EntitySpellPotion spell = new EntitySpellPotion(world, player);
				switch(type1) {
				case MEDICINE:
					spell.setEffect(new PotionEffect(Potion.heal.getId(), 3));
					world.spawnEntityInWorld(spell);
					return true;
				case HARM:
					spell.setEffect(new PotionEffect(Potion.harm.getId(), 3));
					world.spawnEntityInWorld(spell);
					return true;
				case PROTECTION:
					spell.setEffect(new PotionEffect(Potion.resistance.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case DARKNESS:
					spell.setEffect(new PotionEffect(Potion.blindness.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case HUNGER:
					spell.setEffect(new PotionEffect(Potion.hunger.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case FLIGHT:
					spell.setEffect(new PotionEffect(ModPotions.flight.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case POISON:
					spell.setEffect(new PotionEffect(Potion.poison.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case TRANSPARENCY:
					spell.setEffect(new PotionEffect(Potion.invisibility.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case RADIATION:
					spell.setEffect(new PotionEffect(ModPotions.radioactivity.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case BLOOD:
					spell.setEffect(new PotionEffect(ModPotions.bleeding.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case SIGHT:
					spell.setEffect(new PotionEffect(Potion.nightVision.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case SPEED:
					spell.setEffect(new PotionEffect(Potion.moveSpeed.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case SICKNESS:
					spell.setEffect(new PotionEffect(Potion.confusion.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				case BLOODTHIRST:
					spell.setEffect(new PotionEffect(Potion.damageBoost.getId(), 200));
					world.spawnEntityInWorld(spell);
					return true;
				default:
					return false;
				}
			}
		default:
			return false;
		}
	}
	
	/**
	 * Executes an Essensular Rod's power based upon a single EssenceType.
	 * 
	 * @param type
	 * @param world
	 * @param player
	 * @return If the power exists and was successfully executed.
	 */
	public static boolean doPower(EssenceType type, World world, EntityPlayer player) {
		return doPower(type, null, world, player);
	}
	
	public static String getPowerName(ItemStack stack, World world, EntityPlayer player) {
		if(stack.getItem() != null && stack.getItem() instanceof ItemRod) {
			if(stack.getTagCompound() != null) {
				ItemStack essence0 = null, essence1 = null;
			
				NBTTagList inventory = stack.getTagCompound().getTagList("inventory", Constants.NBT.TAG_COMPOUND);
				for (int i = 0; i < inventory.tagCount(); ++i) {
					NBTTagCompound item = (NBTTagCompound) inventory.getCompoundTagAt(i);
					byte slot = item.getByte("slot");

					if(slot == 0) essence0 = ItemStack.loadItemStackFromNBT(item);
					else if(slot == 1) essence1 = ItemStack.loadItemStackFromNBT(item);
				}
			
				if(essence0 != null && essence0.getItem() != null) {
					if(essence0.getItem() instanceof ItemEssence) {
						if(essence1 != null && essence1.getItem() != null && essence1 != essence0) {
							if(essence1.getItem() instanceof ItemEssence) {
								EssenceType essence0type = EssenceType.getFromId(essence0.getTagCompound().getInteger("id"));
								EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
								String name = getPowerName(essence0type, essence1type, world, player);
								if(name == null || name == "None") {
									name = getPowerName(essence1type, essence0type, world, player);
								} return name;
							}
						} else {
							EssenceType essence0type = EssenceType.getFromId(essence0.getTagCompound().getInteger("id"));
							return getPowerName(essence0type, world, player);
						}
					} else if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
						if(essence1.getItem() instanceof ItemEssence) {
							EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
							return getPowerName(essence1type, world, player);
						}
					}
				} else if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
					if(essence1.getItem() instanceof ItemEssence) {
						EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
						return getPowerName(essence1type, world, player);
					}
				}
			}
		}
		return "None";
	}
	
	public static String getPowerName(EssenceType type, EssenceType type1, World world, EntityPlayer player) {
		switch(type) {
		case ACHIEVEMENT:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					return "Achievement Get: "+AchievementList.ghast.func_150951_e().getUnformattedText();
				case ACHIEVEMENT:
					return "Achievement Get: "+ModAchievements.achievement.func_150951_e().getUnformattedText();
				case ADVENTURE:
					return "Achievement Get: "+AchievementList.field_150961_L.func_150951_e().getUnformattedText();
				case CREATION:
					return "Achievement Get: "+AchievementList.buildWorkBench.func_150951_e().getUnformattedText();
				case EARTH:
					return "Achievement Get: "+ModAchievements.dirt.func_150951_e().getUnformattedText();
				case ENDER:
					return "Achievement Get: "+AchievementList.theEnd.func_150951_e().getUnformattedText();
				case FINALITY:
					return "Achievement Get: "+AchievementList.field_150965_K.func_150951_e().getUnformattedText();
				case FIRE:
					return "Achievement Get: "+ModAchievements.pyromaniac.func_150951_e().getUnformattedText();
				case GREED:
					return "Achievement Get: "+ModAchievements.mineGem.func_150951_e().getUnformattedText();
				case HARM:
					return "Achievement Get: "+AchievementList.buildSword.func_150951_e().getUnformattedText();
				case HELL:
					return "Achievement Get: "+AchievementList.portal.func_150951_e().getUnformattedText();
				case LIFE:
					return "Achievement Get: "+ModAchievements.alive.func_150951_e().getUnformattedText();
				case LOVE:
					return "Achievement Get: "+AchievementList.field_150962_H.func_150951_e().getUnformattedText();
				case LUCK:
					return "Achievement Get: "+AchievementList.overkill.func_150951_e().getUnformattedText();
				case MECHANISM:
					return "Achievement Get: "+ModAchievements.machine.func_150951_e().getUnformattedText();
				case METAL:
					return "Achievement Get: "+AchievementList.acquireIron.func_150951_e().getUnformattedText();
				case NONSENSE:
					return "Achievement Get: "+AchievementList.flyPig.func_150951_e().getUnformattedText();
				case POWER:
					return "Achievement Get: "+ModAchievements.steveAlmighty.func_150951_e().getUnformattedText();
				case RADIATION:
					return "Achievement Get: "+ModAchievements.mineUranium.func_150951_e().getUnformattedText();
				case REDUNDANCY:
					return "Achievement Get: "+AchievementList.openInventory.func_150951_e().getUnformattedText();
				case TASTE:
					return "Achievement Get: "+AchievementList.makeBread.func_150951_e().getUnformattedText();
				case TRANSPORT:
					return "Achievement Get: "+AchievementList.onARail.func_150951_e().getUnformattedText();
				case UTILITY:
					return "Achievement Get: "+AchievementList.buildPickaxe.func_150951_e().getUnformattedText();
				case VICTORY:
					return "Achievement Get: "+AchievementList.theEnd2.func_150951_e().getUnformattedText();
				case WASTE:
					return "Achievement Get: "+ModAchievements.diamondHoe.func_150951_e().getUnformattedText();
				case WOOD:
					return "Achievement Get: "+AchievementList.mineWood.func_150951_e().getUnformattedText();
				case WORTH:
					return "Achievement Get: "+AchievementList.diamonds.func_150951_e().getUnformattedText();
				default:
					return "None";
				}
			}
		case TIME:
			if(type1!=null) {
				switch(type1) {
				case DARKNESS:
					return "Moonrising";
				case LIGHT:
					return "Daybreaking";
				default:
					return "None";
				}
			}
		case WATER:
			if(type1 != null) {
				switch(type1) {
				case AIR:
					return "Water Breathing";
				case SPEED:
					return "Depth Striding";
				default:
					return "None";
				}
			}
		case WEATHER:
			if(type1 != null) {
				switch(type1) {
				case ANIMAL:
					return "Raining Cats and Dogs";
				case ELECTRICITY:
					return "Lightning";
				case WATER:
					return "Raining";
				default:
					return "None";
				}
			}
		default:
			return "None";
		}
	}
	
	public static String getPowerName(EssenceType type, World world, EntityPlayer player) {
		return getPowerName(type, null, world, player);
	}

	public static String getName(ItemStack stack) {
		if(stack.getItem() != null && stack.getItem() instanceof ItemRod) {
			if(stack.getTagCompound() != null) {
				ItemStack essence0 = null, essence1 = null;
			
				NBTTagList inventory = stack.getTagCompound().getTagList("inventory", Constants.NBT.TAG_COMPOUND);
				for (int i = 0; i < inventory.tagCount(); ++i) {
					NBTTagCompound item = (NBTTagCompound) inventory.getCompoundTagAt(i);
					byte slot = item.getByte("slot");

					if(slot == 0) essence0 = ItemStack.loadItemStackFromNBT(item);
					else if(slot == 1) essence1 = ItemStack.loadItemStackFromNBT(item);
				}
			
				if(essence0 != null && essence0.getItem() != null) {
					if(essence0.getItem() instanceof ItemEssence && essence0.hasTagCompound()) {
						if(essence1 != null && essence1.getItem() != null && essence1 != essence0) {
							if(essence1.getItem() instanceof ItemEssence && essence1.hasTagCompound()) {
								String essence0name = "ERROR!";
								String essence1name = "ERROR!";
								if(EssenceType.getFromId(essence0.getTagCompound().getInteger("id")) != null) {
									essence0name = WordUtils.capitalizeFully(EssenceType.getFromId(essence0.getTagCompound().getInteger("id")).getPrefixName());
								}
								if(EssenceType.getFromId(essence1.getTagCompound().getInteger("id")) != null) {
									essence1name = WordUtils.capitalizeFully(EssenceType.getFromId(essence1.getTagCompound().getInteger("id")).name());
								}
								return "Rod of the "+essence0name+" "+essence1name;
							}
						}
						String essence0name = "ERROR!";
						if(EssenceType.getFromId(essence0.getTagCompound().getInteger("id")) != null) {
							essence0name = WordUtils.capitalizeFully(EssenceType.getFromId(essence0.getTagCompound().getInteger("id")).name());
						}
						return "Rod of "+essence0name;
					}
				}
				
				if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
					if(essence1.getItem() instanceof ItemEssence && essence1.hasTagCompound()) {
						String essence1name = "ERROR!";
						if(EssenceType.getFromId(essence1.getTagCompound().getInteger("id")) != null) {
							essence1name = WordUtils.capitalizeFully(EssenceType.getFromId(essence1.getTagCompound().getInteger("id")).name());
						}
						return "Rod of "+essence1name;
					}
				}
			}
		}
		return "Essensular Rod";
	}
	
	public static EssenceType getEssence(ItemStack stack, int slot) {
		if(stack.getItem() != null && stack.getItem() instanceof ItemRod) {
			if(stack.getTagCompound() != null) {
				ItemStack essence = null;
			
				NBTTagList inventory = stack.getTagCompound().getTagList("inventory", Constants.NBT.TAG_COMPOUND);
				for (int i = 0; i < inventory.tagCount(); ++i) {
					NBTTagCompound item = (NBTTagCompound) inventory.getCompoundTagAt(i);
					if(slot == item.getByte("slot")) {
						essence = ItemStack.loadItemStackFromNBT(item);
					}
				}
			
				if(essence != null && essence.getItem() != null) {
					if(essence.getItem() instanceof ItemEssence && essence.hasTagCompound()) {
						return EssenceType.getFromId(essence.getTagCompound().getInteger("id"));
					}
				}
			}
		}
		return null;
	}
}
