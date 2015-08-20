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
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import org.apache.commons.lang3.text.WordUtils;

import com.shnupbups.allthethings.init.ModAchievements;
import com.shnupbups.allthethings.init.ModCustomRecipes;
import com.shnupbups.allthethings.inventory.InventoryRod;
import com.shnupbups.allthethings.item.ItemEssence;
import com.shnupbups.allthethings.item.ItemRod;
import com.shnupbups.allthethings.magic.EssenceType;

public class RodHelper {

	public static void doPower(ItemStack stack, World world, EntityPlayer player) {
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
								doPower(essence0type, essence1type, world, player);
								InventoryRod iinventory = new InventoryRod(stack);
								ItemStack stack0 = iinventory.getStackInSlot(0).copy();
								stack0.damageItem(1, player);
								iinventory.setInventorySlotContents(0, stack0);
								ItemStack stack1 = iinventory.getStackInSlot(1).copy();
								stack1.damageItem(1, player);
								iinventory.setInventorySlotContents(1, stack1);
								stack.damageItem(1, player);
							}
						} else {
							EssenceType essence0type = EssenceType.getFromId(essence0.getTagCompound().getInteger("id"));
							//Execute based on just 0
							doPower(essence0type, world, player);
							InventoryRod iinventory = new InventoryRod(stack);
							ItemStack stack0 = iinventory.getStackInSlot(0).copy();
							stack0.damageItem(1, player);
							iinventory.setInventorySlotContents(0, stack0);
							stack.damageItem(1, player);
						}
					} else if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
						if(essence1.getItem() instanceof ItemEssence) {
							EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
							//Execute based on just 1
							doPower(essence1type, world, player);
							InventoryRod iinventory = new InventoryRod(stack);
							ItemStack stack1 = iinventory.getStackInSlot(1).copy();
							stack1.damageItem(1, player);
							iinventory.setInventorySlotContents(0, stack1);
							stack.damageItem(1, player);
						}
					}
				} else if(essence1 != null && essence1.getItem() != null  && essence1 != essence0) {
					if(essence1.getItem() instanceof ItemEssence) {
						EssenceType essence1type = EssenceType.getFromId(essence1.getTagCompound().getInteger("id"));
						//Execute based on just 1
						doPower(essence1type, world, player);
						InventoryRod iinventory = new InventoryRod(stack);
						ItemStack stack1 = iinventory.getStackInSlot(1).copy();
						stack1.damageItem(1, player);
						iinventory.setInventorySlotContents(0, stack1);
						stack.damageItem(1, player);
					}
				}
			}
		}
	}
	
	public static void doPower(EssenceType type, EssenceType type1, World world, EntityPlayer player) {
		switch(type) {
		case ACCURACY: 
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					break;
				case ACHIEVEMENT:
					break;
				case ADVENTURE:
					break;
				case AFTERLIFE:
					break;
				case AIR:
					break;
				case ALIEN:
					break;
				case ANGER:
					break;
				case ANIMAL:
					break;
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					break;
				case DARKNESS:
					break;
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					break;
				case ELECTRICITY:
					break;
				case EMPTINESS:
					break;
				case ENDER:
					break;
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					break;
				case FIRE:
					break;
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					break;
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					break;
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					break;
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					break;
				case LIGHT:
					break;
				case LOVE:
					break;
				case LUCK:
					break;
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					break;
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					break;
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					break;
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					break;
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					break;
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					break;
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					break;
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					break;
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					break;
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					break;
				case VICTORY:
					break;
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					break;
				case WATER:
					break;
				case WEATHER:
					break;
				case WOOD:
					break;
				case WORSHIP:
					break;
				case WORTH:
					break;
				default:
					break;	
				}
			}
		case ACHIEVEMENT:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					player.addStat(AchievementList.ghast, 1);
				case ACHIEVEMENT:
					player.addStat(ModAchievements.achievement, 1);
				case ADVENTURE:
					player.addStat(AchievementList.field_150961_L, 1);
				case AFTERLIFE:
					break;
				case AIR:
					break;
				case ALIEN:
					break;
				case ANGER:
					break;
				case ANIMAL:
					break;
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					player.addStat(AchievementList.buildWorkBench, 1);
				case DARKNESS:
					break;
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					player.addStat(ModAchievements.dirt, 1);
				case ELECTRICITY:
					break;
				case EMPTINESS:
					break;
				case ENDER:
					player.addStat(AchievementList.theEnd, 1);
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					player.addStat(AchievementList.field_150965_K, 1);
				case FIRE:
					player.addStat(ModAchievements.pyromaniac, 1);
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					player.addStat(ModAchievements.mineGem, 1);
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					player.addStat(AchievementList.buildSword, 1);
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					player.addStat(AchievementList.portal, 1);
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					player.addStat(ModAchievements.alive, 1);
				case LIGHT:
					break;
				case LOVE:
					break;
				case LUCK:
					player.addStat(AchievementList.overkill, 1);
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					player.addStat(ModAchievements.machine, 1);
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					player.addStat(AchievementList.acquireIron, 1);
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					player.addStat(AchievementList.flyPig, 1);
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					player.addStat(ModAchievements.steveAlmighty, 1);
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					player.addStat(ModAchievements.mineUranium, 1);
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					player.addStat(AchievementList.openInventory, 1);
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					break;
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					player.addStat(AchievementList.makeBread, 1);
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					player.addStat(AchievementList.onARail, 1);
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					player.addStat(AchievementList.buildPickaxe, 1);
				case VICTORY:
					player.addStat(AchievementList.theEnd2, 1);
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					player.addStat(ModAchievements.diamondHoe, 1);
				case WATER:
					break;
				case WEATHER:
					break;
				case WOOD:
					player.addStat(AchievementList.mineWood, 1);
				case WORSHIP:
					break;
				case WORTH:
					player.addStat(AchievementList.diamonds, 1);
				default:
					break;
				}
			}
		case ADVENTURE:
			break;
		case AFTERLIFE:
			break;
		case AIR:
			break;
		case ALIEN:
			break;
		case ANGER:
			break;
		case ANIMAL:
			break;
		case ANNOYANCE:
			break;
		case ARROGANCE:
			break;
		case ARTISTRY:
			break;
		case ASCENSION:
			break;
		case ATTRACTION:
			break;
		case AUTOMATION:
			break;
		case BALANCE:
			break;
		case BEAST:
			break;
		case BELONGING:
			break;
		case BETRAYAL:
			break;
		case BLOOD:
			break;
		case BLOODTHIRST:
			break;
		case CHANGE:
			break;
		case CHAOS:
			break;
		case CHEATING:
			break;
		case CLOTH:
			break;
		case COLD:
			break;
		case COLLECTION:
			break;
		case CONSUMPTION:
			break;
		case CONTINUUM:
			break;
		case CORRUPTION:
			break;
		case CREATION:
			break;
		case DARKNESS:
			break;
		case DEATH:
			break;
		case DECEPTION:
			break;
		case DEMAND:
			break;
		case DEPRESSION:
			break;
		case DESIRE:
			break;
		case DESTRUCTION:
			break;
		case DIRECTION:
			break;
		case DISCOVERY:
			break;
		case DISGUST:
			break;
		case EARTH:
			break;
		case ELECTRICITY:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					break;
				case ACHIEVEMENT:
					break;
				case ADVENTURE:
					break;
				case AFTERLIFE:
					break;
				case AIR:
					break;
				case ALIEN:
					break;
				case ANGER:
					break;
				case ANIMAL:
					break;
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					break;
				case DARKNESS:
					break;
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					break;
				case ELECTRICITY:
					break;
				case EMPTINESS:
					break;
				case ENDER:
					break;
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					break;
				case FIRE:
					break;
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					break;
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					break;
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					break;
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					break;
				case LIGHT:
					break;
				case LOVE:
					break;
				case LUCK:
					break;
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					break;
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					break;
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					break;
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					break;
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					break;
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					break;
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					break;
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					break;
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					break;
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					break;
				case VICTORY:
					break;
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					break;
				case WATER:
					break;
				case WEATHER:
					MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
					if(mop != null) {
						world.addWeatherEffect(new EntityLightningBolt(world, mop.blockX, mop.blockY, mop.blockZ));
					}
				case WOOD:
					break;
				case WORSHIP:
					break;
				case WORTH:
					break;
				default:
					break;
				}
			}
		case EMPTINESS:
			break;
		case ENDER:
			break;
		case ENVY:
			break;
		case ERUPTION:
			break;
		case EXCHANGE:
			break;
		case EXCITEMENT:
			break;
		case EXPERIMENT:
			break;
		case FINALITY:
			break;
		case FIRE:
			break;
		case FLESH:
			break;
		case FLIGHT:
			break;
		case FRAGILITY:
			break;
		case FRIGHT:
			break;
		case GODLINESS:
			break;
		case GREED:
			break;
		case GRIEF:
			break;
		case HAPPINESS:
			break;
		case HARM:
			break;
		case HATRED:
			break;
		case HEARING:
			break;
		case HELL:
			break;
		case HOLINESS:
			break;
		case HUMANITY:
			break;
		case HUNGER:
			break;
		case IMBALANCE:
			break;
		case INFINITY:
			break;
		case INSIGNIFICANCE:
			break;
		case INSTABILITY:
			break;
		case INSUFFICIENCY:
			break;
		case INTRICACY:
			break;
		case INTUITION:
			break;
		case KNOWLEDGE:
			break;
		case LAZINESS:
			break;
		case LIABILITY:
			break;
		case LIFE:
			break;
		case LIGHT:
			break;
		case LOVE:
			break;
		case LUCK:
			break;
		case LUST:
			break;
		case MAGIC:
			break;
		case MAGMA:
			break;
		case MAGNETISM:
			break;
		case MANIA:
			break;
		case MASCULINITY:
			break;
		case MECHANISM:
			break;
		case MEDICINE:
			break;
		case MEMORY:
			break;
		case METAL:
			break;
		case MISTAKE:
			break;
		case MOVEMENT:
			break;
		case NATURE:
			break;
		case NOISE:
			break;
		case NONSENSE:
			break;
		case ORDER:
			break;
		case PEACE:
			break;
		case PLANT:
			break;
		case POISON:
			break;
		case POVERTY:
			break;
		case POWER:
			break;
		case PROPHECY:
			break;
		case PROTECTION:
			break;
		case PURITY:
			break;
		case RADIATION:
			if(type1!=null) {
				switch(type1) {
				case ACCURACY:
					break;
				case ACHIEVEMENT:
					break;
				case ADVENTURE:
					break;
				case AFTERLIFE:
					break;
				case AIR:
					break;
				case ALIEN:
					break;
				case ANGER:
					break;
				case ANIMAL:
					break;
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					break;
				case DARKNESS:
					break;
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					break;
				case ELECTRICITY:
					break;
				case EMPTINESS:
					break;
				case ENDER:
					break;
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					break;
				case FIRE:
					break;
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					break;
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					break;
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					break;
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					break;
				case LIGHT:
					break;
				case LOVE:
					break;
				case LUCK:
					break;
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					break;
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					break;
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					break;
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					break;
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					break;
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					break;
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					break;
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					break;
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					break;
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					break;
				case VICTORY:
					break;
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					break;
				case WATER:
					break;
				case WEATHER:
					break;
				case WOOD:
					break;
				case WORSHIP:
					break;
				case WORTH:
					break;
				default:
					break;
				}
			}
		case RARITY:
			break;
		case RECENCY:
			break;
		case REDEMPTION:
			break;
		case REDUNDANCY:
			break;
		case REVERSAL:
			break;
		case ROCK:
			break;
		case SACRIFICE:
			break;
		case SCENT:
			break;
		case SECRECY:
			break;
		case SENSE:
			break;
		case SICKNESS:
			break;
		case SIGHT:
			break;
		case SILENCE:
			break;
		case SKY:
			break;
		case SLIME:
			break;
		case SORROW:
			break;
		case SOUL:
			break;
		case SPACE:
			break;
		case SPEED:
			break;
		case STABILITY:
			break;
		case STEALTH:
			break;
		case STUPIDITY:
			break;
		case SUPERNATURE:
			break;
		case TASTE:
			break;
		case TEDIUM:
			break;
		case TELEPORTATION:
			break;
		case THOUGHT:
			break;
		case TIME:
			if(type1!=null) {
				switch(type1) {
				case ACCURACY:
					break;
				case ACHIEVEMENT:
					break;
				case ADVENTURE:
					break;
				case AFTERLIFE:
					break;
				case AIR:
					break;
				case ALIEN:
					break;
				case ANGER:
					break;
				case ANIMAL:
					break;
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					break;
				case DARKNESS:
					world.setWorldTime(13000);
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					break;
				case ELECTRICITY:
					break;
				case EMPTINESS:
					break;
				case ENDER:
					break;
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					break;
				case FIRE:
					break;
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					break;
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					break;
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					break;
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					break;
				case LIGHT:
					world.setWorldTime(1000);
				case LOVE:
					break;
				case LUCK:
					break;
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					break;
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					break;
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					break;
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					break;
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					break;
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					break;
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					break;
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					break;
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					break;
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					break;
				case VICTORY:
					break;
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					break;
				case WATER:
					break;
				case WEATHER:
					break;
				case WOOD:
					break;
				case WORSHIP:
					break;
				case WORTH:
					break;
				default:
					break;
				}
			}
		case TOUCH:
			break;
		case TRANSPARENCY:
			break;
		case TRANSPORT:
			break;
		case UNDEAD:
			break;
		case UNDERGROUND:
			break;
		case UNKNOWN:
			break;
		case UNREALITY:
			break;
		case USTHER:
			break;
		case UTILITY:
			break;
		case VICTORY:
			break;
		case VOID:
			break;
		case WARMTH:
			break;
		case WASTE:
			break;
		case WATER:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					break;
				case ACHIEVEMENT:
					break;
				case ADVENTURE:
					break;
				case AFTERLIFE:
					break;
				case AIR:
					player.setAir(300);
				case ALIEN:
					break;
				case ANGER:
					break;
				case ANIMAL:
					break;
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					break;
				case DARKNESS:
					break;
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					break;
				case ELECTRICITY:
					break;
				case EMPTINESS:
					break;
				case ENDER:
					break;
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					break;
				case FIRE:
					break;
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					break;
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					break;
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					break;
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					break;
				case LIGHT:
					break;
				case LOVE:
					break;
				case LUCK:
					break;
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					break;
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					break;
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					break;
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					break;
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					break;
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					break;
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					if(player.isInWater() || player.isInsideOfMaterial(Material.water)) {
						double d0 = player.posY;
			            player.moveEntity(player.motionX, player.motionY, player.motionZ);
			            player.motionY += 0.02D;
			            player.motionX /= 0.800000011920929D;
			            player.motionY /= 0.800000011920929D;
			            player.motionZ /= 0.800000011920929D;
			        }
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					break;
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					break;
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					break;
				case VICTORY:
					break;
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					break;
				case WATER:
					break;
				case WEATHER:
					break;
				case WOOD:
					break;
				case WORSHIP:
					break;
				case WORTH:
					break;
				default:
					break;
				}
			}
		case WEATHER:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					break;
				case ACHIEVEMENT:
					break;
				case ADVENTURE:
					break;
				case AFTERLIFE:
					break;
				case AIR:
					break;
				case ALIEN:
					break;
				case ANGER:
					break;
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
				}
				case ANNOYANCE:
					break;
				case ARROGANCE:
					break;
				case ARTISTRY:
					break;
				case ASCENSION:
					break;
				case ATTRACTION:
					break;
				case AUTOMATION:
					break;
				case BALANCE:
					break;
				case BEAST:
					break;
				case BELONGING:
					break;
				case BETRAYAL:
					break;
				case BLOOD:
					break;
				case BLOODTHIRST:
					break;
				case CHANGE:
					break;
				case CHAOS:
					break;
				case CHEATING:
					break;
				case CLOTH:
					break;
				case COLD:
					break;
				case COLLECTION:
					break;
				case CONSUMPTION:
					break;
				case CONTINUUM:
					break;
				case CORRUPTION:
					break;
				case CREATION:
					break;
				case DARKNESS:
					break;
				case DEATH:
					break;
				case DECEPTION:
					break;
				case DEMAND:
					break;
				case DEPRESSION:
					break;
				case DESIRE:
					break;
				case DESTRUCTION:
					break;
				case DIRECTION:
					break;
				case DISCOVERY:
					break;
				case DISGUST:
					break;
				case EARTH:
					break;
				case ELECTRICITY: {
					MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
					if(mop != null) {
						world.addWeatherEffect(new EntityLightningBolt(world, mop.blockX, mop.blockY, mop.blockZ));
					}
				}
				case EMPTINESS:
					break;
				case ENDER:
					break;
				case ENVY:
					break;
				case ERUPTION:
					break;
				case EXCHANGE:
					break;
				case EXCITEMENT:
					break;
				case EXPERIMENT:
					break;
				case FINALITY:
					break;
				case FIRE:
					break;
				case FLESH:
					break;
				case FLIGHT:
					break;
				case FRAGILITY:
					break;
				case FRIGHT:
					break;
				case GODLINESS:
					break;
				case GREED:
					break;
				case GRIEF:
					break;
				case HAPPINESS:
					break;
				case HARM:
					break;
				case HATRED:
					break;
				case HEARING:
					break;
				case HELL:
					break;
				case HOLINESS:
					break;
				case HUMANITY:
					break;
				case HUNGER:
					break;
				case IMBALANCE:
					break;
				case INFINITY:
					break;
				case INSIGNIFICANCE:
					break;
				case INSTABILITY:
					break;
				case INSUFFICIENCY:
					break;
				case INTRICACY:
					break;
				case INTUITION:
					break;
				case KNOWLEDGE:
					break;
				case LAZINESS:
					break;
				case LIABILITY:
					break;
				case LIFE:
					break;
				case LIGHT:
					break;
				case LOVE:
					break;
				case LUCK:
					break;
				case LUST:
					break;
				case MAGIC:
					break;
				case MAGMA:
					break;
				case MAGNETISM:
					break;
				case MANIA:
					break;
				case MASCULINITY:
					break;
				case MECHANISM:
					break;
				case MEDICINE:
					break;
				case MEMORY:
					break;
				case METAL:
					break;
				case MISTAKE:
					break;
				case MOVEMENT:
					break;
				case NATURE:
					break;
				case NOISE:
					break;
				case NONSENSE:
					break;
				case ORDER:
					break;
				case PEACE:
					break;
				case PLANT:
					break;
				case POISON:
					break;
				case POVERTY:
					break;
				case POWER:
					break;
				case PROPHECY:
					break;
				case PROTECTION:
					break;
				case PURITY:
					break;
				case RADIATION:
					break;
				case RARITY:
					break;
				case RECENCY:
					break;
				case REDEMPTION:
					break;
				case REDUNDANCY:
					break;
				case REVERSAL:
					break;
				case ROCK:
					break;
				case SACRIFICE:
					break;
				case SCENT:
					break;
				case SECRECY:
					break;
				case SENSE:
					break;
				case SICKNESS:
					break;
				case SIGHT:
					break;
				case SILENCE:
					break;
				case SKY:
					break;
				case SLIME:
					break;
				case SORROW:
					break;
				case SOUL:
					break;
				case SPACE:
					break;
				case SPEED:
					break;
				case STABILITY:
					break;
				case STEALTH:
					break;
				case STUPIDITY:
					break;
				case SUPERNATURE:
					break;
				case TASTE:
					break;
				case TEDIUM:
					break;
				case TELEPORTATION:
					break;
				case THOUGHT:
					break;
				case TIME:
					break;
				case TOUCH:
					break;
				case TRANSPARENCY:
					break;
				case TRANSPORT:
					break;
				case UNDEAD:
					break;
				case UNDERGROUND:
					break;
				case UNKNOWN:
					break;
				case UNREALITY:
					break;
				case USTHER:
					break;
				case UTILITY:
					break;
				case VICTORY:
					break;
				case VOID:
					break;
				case WARMTH:
					break;
				case WASTE:
					break;
				case WATER:
					world.getWorldInfo().setRaining(true);
				case WEATHER:
					break;
				case WOOD:
					break;
				case WORSHIP:
					break;
				case WORTH:
					break;
				default:
					break;
				}
			}
		case WOOD:
			break;
		case WORSHIP:
			break;
		case WORTH:
			break;
		default:
			break;
		}
	}
	
	public static void doPower(EssenceType type, World world, EntityPlayer player) {
		doPower(type, null, world, player);
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
								return getPowerName(essence0type, essence1type, world, player);
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
		case ACCURACY: 
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					return "None";
				case ACHIEVEMENT:
					return "None";
				case ADVENTURE:
					return "None";
				case AFTERLIFE:
					return "None";
				case AIR:
					return "None";
				case ALIEN:
					return "None";
				case ANGER:
					return "None";
				case ANIMAL:
					return "None";
				case ANNOYANCE:
					return "None";
				case ARROGANCE:
					return "None";
				case ARTISTRY:
					return "None";
				case ASCENSION:
					return "None";
				case ATTRACTION:
					return "None";
				case AUTOMATION:
					return "None";
				case BALANCE:
					return "None";
				case BEAST:
					return "None";
				case BELONGING:
					return "None";
				case BETRAYAL:
					return "None";
				case BLOOD:
					return "None";
				case BLOODTHIRST:
					return "None";
				case CHANGE:
					return "None";
				case CHAOS:
					return "None";
				case CHEATING:
					return "None";
				case CLOTH:
					return "None";
				case COLD:
					return "None";
				case COLLECTION:
					return "None";
				case CONSUMPTION:
					return "None";
				case CONTINUUM:
					return "None";
				case CORRUPTION:
					return "None";
				case CREATION:
					return "None";
				case DARKNESS:
					return "None";
				case DEATH:
					return "None";
				case DECEPTION:
					return "None";
				case DEMAND:
					return "None";
				case DEPRESSION:
					return "None";
				case DESIRE:
					return "None";
				case DESTRUCTION:
					return "None";
				case DIRECTION:
					return "None";
				case DISCOVERY:
					return "None";
				case DISGUST:
					return "None";
				case EARTH:
					return "None";
				case ELECTRICITY:
					return "None";
				case EMPTINESS:
					return "None";
				case ENDER:
					return "None";
				case ENVY:
					return "None";
				case ERUPTION:
					return "None";
				case EXCHANGE:
					return "None";
				case EXCITEMENT:
					return "None";
				case EXPERIMENT:
					return "None";
				case FINALITY:
					return "None";
				case FIRE:
					return "None";
				case FLESH:
					return "None";
				case FLIGHT:
					return "None";
				case FRAGILITY:
					return "None";
				case FRIGHT:
					return "None";
				case GODLINESS:
					return "None";
				case GREED:
					return "None";
				case GRIEF:
					return "None";
				case HAPPINESS:
					return "None";
				case HARM:
					return "None";
				case HATRED:
					return "None";
				case HEARING:
					return "None";
				case HELL:
					return "None";
				case HOLINESS:
					return "None";
				case HUMANITY:
					return "None";
				case HUNGER:
					return "None";
				case IMBALANCE:
					return "None";
				case INFINITY:
					return "None";
				case INSIGNIFICANCE:
					return "None";
				case INSTABILITY:
					return "None";
				case INSUFFICIENCY:
					return "None";
				case INTRICACY:
					return "None";
				case INTUITION:
					return "None";
				case KNOWLEDGE:
					return "None";
				case LAZINESS:
					return "None";
				case LIABILITY:
					return "None";
				case LIFE:
					return "None";
				case LIGHT:
					return "None";
				case LOVE:
					return "None";
				case LUCK:
					return "None";
				case LUST:
					return "None";
				case MAGIC:
					return "None";
				case MAGMA:
					return "None";
				case MAGNETISM:
					return "None";
				case MANIA:
					return "None";
				case MASCULINITY:
					return "None";
				case MECHANISM:
					return "None";
				case MEDICINE:
					return "None";
				case MEMORY:
					return "None";
				case METAL:
					return "None";
				case MISTAKE:
					return "None";
				case MOVEMENT:
					return "None";
				case NATURE:
					return "None";
				case NOISE:
					return "None";
				case NONSENSE:
					return "None";
				case ORDER:
					return "None";
				case PEACE:
					return "None";
				case PLANT:
					return "None";
				case POISON:
					return "None";
				case POVERTY:
					return "None";
				case POWER:
					return "None";
				case PROPHECY:
					return "None";
				case PROTECTION:
					return "None";
				case PURITY:
					return "None";
				case RADIATION:
					return "None";
				case RARITY:
					return "None";
				case RECENCY:
					return "None";
				case REDEMPTION:
					return "None";
				case REDUNDANCY:
					return "None";
				case REVERSAL:
					return "None";
				case ROCK:
					return "None";
				case SACRIFICE:
					return "None";
				case SCENT:
					return "None";
				case SECRECY:
					return "None";
				case SENSE:
					return "None";
				case SICKNESS:
					return "None";
				case SIGHT:
					return "None";
				case SILENCE:
					return "None";
				case SKY:
					return "None";
				case SLIME:
					return "None";
				case SORROW:
					return "None";
				case SOUL:
					return "None";
				case SPACE:
					return "None";
				case SPEED:
					return "None";
				case STABILITY:
					return "None";
				case STEALTH:
					return "None";
				case STUPIDITY:
					return "None";
				case SUPERNATURE:
					return "None";
				case TASTE:
					return "None";
				case TEDIUM:
					return "None";
				case TELEPORTATION:
					return "None";
				case THOUGHT:
					return "None";
				case TIME:
					return "None";
				case TOUCH:
					return "None";
				case TRANSPARENCY:
					return "None";
				case TRANSPORT:
					return "None";
				case UNDEAD:
					return "None";
				case UNDERGROUND:
					return "None";
				case UNKNOWN:
					return "None";
				case UNREALITY:
					return "None";
				case USTHER:
					return "None";
				case UTILITY:
					return "None";
				case VICTORY:
					return "None";
				case VOID:
					return "None";
				case WARMTH:
					return "None";
				case WASTE:
					return "None";
				case WATER:
					return "None";
				case WEATHER:
					return "None";
				case WOOD:
					return "None";
				case WORSHIP:
					return "None";
				case WORTH:
					return "None";
				default:
					return "None";	
				}
			}
		case ACHIEVEMENT:
			return "None";
		case ADVENTURE:
			return "None";
		case AFTERLIFE:
			return "None";
		case AIR:
			return "None";
		case ALIEN:
			return "None";
		case ANGER:
			return "None";
		case ANIMAL:
			return "None";
		case ANNOYANCE:
			return "None";
		case ARROGANCE:
			return "None";
		case ARTISTRY:
			return "None";
		case ASCENSION:
			return "None";
		case ATTRACTION:
			return "None";
		case AUTOMATION:
			return "None";
		case BALANCE:
			return "None";
		case BEAST:
			return "None";
		case BELONGING:
			return "None";
		case BETRAYAL:
			return "None";
		case BLOOD:
			return "None";
		case BLOODTHIRST:
			return "None";
		case CHANGE:
			return "None";
		case CHAOS:
			return "None";
		case CHEATING:
			return "None";
		case CLOTH:
			return "None";
		case COLD:
			return "None";
		case COLLECTION:
			return "None";
		case CONSUMPTION:
			return "None";
		case CONTINUUM:
			return "None";
		case CORRUPTION:
			return "None";
		case CREATION:
			return "None";
		case DARKNESS:
			return "None";
		case DEATH:
			return "None";
		case DECEPTION:
			return "None";
		case DEMAND:
			return "None";
		case DEPRESSION:
			return "None";
		case DESIRE:
			return "None";
		case DESTRUCTION:
			return "None";
		case DIRECTION:
			return "None";
		case DISCOVERY:
			return "None";
		case DISGUST:
			return "None";
		case EARTH:
			return "None";
		case ELECTRICITY:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					return "None";
				case ACHIEVEMENT:
					return "None";
				case ADVENTURE:
					return "None";
				case AFTERLIFE:
					return "None";
				case AIR:
					return "None";
				case ALIEN:
					return "None";
				case ANGER:
					return "None";
				case ANIMAL:
					return "None";
				case ANNOYANCE:
					return "None";
				case ARROGANCE:
					return "None";
				case ARTISTRY:
					return "None";
				case ASCENSION:
					return "None";
				case ATTRACTION:
					return "None";
				case AUTOMATION:
					return "None";
				case BALANCE:
					return "None";
				case BEAST:
					return "None";
				case BELONGING:
					return "None";
				case BETRAYAL:
					return "None";
				case BLOOD:
					return "None";
				case BLOODTHIRST:
					return "None";
				case CHANGE:
					return "None";
				case CHAOS:
					return "None";
				case CHEATING:
					return "None";
				case CLOTH:
					return "None";
				case COLD:
					return "None";
				case COLLECTION:
					return "None";
				case CONSUMPTION:
					return "None";
				case CONTINUUM:
					return "None";
				case CORRUPTION:
					return "None";
				case CREATION:
					return "None";
				case DARKNESS:
					return "None";
				case DEATH:
					return "None";
				case DECEPTION:
					return "None";
				case DEMAND:
					return "None";
				case DEPRESSION:
					return "None";
				case DESIRE:
					return "None";
				case DESTRUCTION:
					return "None";
				case DIRECTION:
					return "None";
				case DISCOVERY:
					return "None";
				case DISGUST:
					return "None";
				case EARTH:
					return "None";
				case ELECTRICITY:
					return "None";
				case EMPTINESS:
					return "None";
				case ENDER:
					return "None";
				case ENVY:
					return "None";
				case ERUPTION:
					return "None";
				case EXCHANGE:
					return "None";
				case EXCITEMENT:
					return "None";
				case EXPERIMENT:
					return "None";
				case FINALITY:
					return "None";
				case FIRE:
					return "None";
				case FLESH:
					return "None";
				case FLIGHT:
					return "None";
				case FRAGILITY:
					return "None";
				case FRIGHT:
					return "None";
				case GODLINESS:
					return "None";
				case GREED:
					return "None";
				case GRIEF:
					return "None";
				case HAPPINESS:
					return "None";
				case HARM:
					return "None";
				case HATRED:
					return "None";
				case HEARING:
					return "None";
				case HELL:
					return "None";
				case HOLINESS:
					return "None";
				case HUMANITY:
					return "None";
				case HUNGER:
					return "None";
				case IMBALANCE:
					return "None";
				case INFINITY:
					return "None";
				case INSIGNIFICANCE:
					return "None";
				case INSTABILITY:
					return "None";
				case INSUFFICIENCY:
					return "None";
				case INTRICACY:
					return "None";
				case INTUITION:
					return "None";
				case KNOWLEDGE:
					return "None";
				case LAZINESS:
					return "None";
				case LIABILITY:
					return "None";
				case LIFE:
					return "None";
				case LIGHT:
					return "None";
				case LOVE:
					return "None";
				case LUCK:
					return "None";
				case LUST:
					return "None";
				case MAGIC:
					return "None";
				case MAGMA:
					return "None";
				case MAGNETISM:
					return "None";
				case MANIA:
					return "None";
				case MASCULINITY:
					return "None";
				case MECHANISM:
					return "None";
				case MEDICINE:
					return "None";
				case MEMORY:
					return "None";
				case METAL:
					return "None";
				case MISTAKE:
					return "None";
				case MOVEMENT:
					return "None";
				case NATURE:
					return "None";
				case NOISE:
					return "None";
				case NONSENSE:
					return "None";
				case ORDER:
					return "None";
				case PEACE:
					return "None";
				case PLANT:
					return "None";
				case POISON:
					return "None";
				case POVERTY:
					return "None";
				case POWER:
					return "None";
				case PROPHECY:
					return "None";
				case PROTECTION:
					return "None";
				case PURITY:
					return "None";
				case RADIATION:
					return "None";
				case RARITY:
					return "None";
				case RECENCY:
					return "None";
				case REDEMPTION:
					return "None";
				case REDUNDANCY:
					return "None";
				case REVERSAL:
					return "None";
				case ROCK:
					return "None";
				case SACRIFICE:
					return "None";
				case SCENT:
					return "None";
				case SECRECY:
					return "None";
				case SENSE:
					return "None";
				case SICKNESS:
					return "None";
				case SIGHT:
					return "None";
				case SILENCE:
					return "None";
				case SKY:
					return "None";
				case SLIME:
					return "None";
				case SORROW:
					return "None";
				case SOUL:
					return "None";
				case SPACE:
					return "None";
				case SPEED:
					return "None";
				case STABILITY:
					return "None";
				case STEALTH:
					return "None";
				case STUPIDITY:
					return "None";
				case SUPERNATURE:
					return "None";
				case TASTE:
					return "None";
				case TEDIUM:
					return "None";
				case TELEPORTATION:
					return "None";
				case THOUGHT:
					return "None";
				case TIME:
					return "None";
				case TOUCH:
					return "None";
				case TRANSPARENCY:
					return "None";
				case TRANSPORT:
					return "None";
				case UNDEAD:
					return "None";
				case UNDERGROUND:
					return "None";
				case UNKNOWN:
					return "None";
				case UNREALITY:
					return "None";
				case USTHER:
					return "None";
				case UTILITY:
					return "None";
				case VICTORY:
					return "None";
				case VOID:
					return "None";
				case WARMTH:
					return "None";
				case WASTE:
					return "None";
				case WATER:
					return "None";
				case WEATHER:
					return "Lightning";
				case WOOD:
					return "None";
				case WORSHIP:
					return "None";
				case WORTH:
					return "None";
				default:
					return "None";
				}
			}
		case EMPTINESS:
			return "None";
		case ENDER:
			return "None";
		case ENVY:
			return "None";
		case ERUPTION:
			return "None";
		case EXCHANGE:
			return "None";
		case EXCITEMENT:
			return "None";
		case EXPERIMENT:
			return "None";
		case FINALITY:
			return "None";
		case FIRE:
			return "None";
		case FLESH:
			return "None";
		case FLIGHT:
			return "None";
		case FRAGILITY:
			return "None";
		case FRIGHT:
			return "None";
		case GODLINESS:
			return "None";
		case GREED:
			return "None";
		case GRIEF:
			return "None";
		case HAPPINESS:
			return "None";
		case HARM:
			return "None";
		case HATRED:
			return "None";
		case HEARING:
			return "None";
		case HELL:
			return "None";
		case HOLINESS:
			return "None";
		case HUMANITY:
			return "None";
		case HUNGER:
			return "None";
		case IMBALANCE:
			return "None";
		case INFINITY:
			return "None";
		case INSIGNIFICANCE:
			return "None";
		case INSTABILITY:
			return "None";
		case INSUFFICIENCY:
			return "None";
		case INTRICACY:
			return "None";
		case INTUITION:
			return "None";
		case KNOWLEDGE:
			return "None";
		case LAZINESS:
			return "None";
		case LIABILITY:
			return "None";
		case LIFE:
			return "None";
		case LIGHT:
			return "None";
		case LOVE:
			return "None";
		case LUCK:
			return "None";
		case LUST:
			return "None";
		case MAGIC:
			return "None";
		case MAGMA:
			return "None";
		case MAGNETISM:
			return "None";
		case MANIA:
			return "None";
		case MASCULINITY:
			return "None";
		case MECHANISM:
			return "None";
		case MEDICINE:
			return "None";
		case MEMORY:
			return "None";
		case METAL:
			return "None";
		case MISTAKE:
			return "None";
		case MOVEMENT:
			return "None";
		case NATURE:
			return "None";
		case NOISE:
			return "None";
		case NONSENSE:
			return "None";
		case ORDER:
			return "None";
		case PEACE:
			return "None";
		case PLANT:
			return "None";
		case POISON:
			return "None";
		case POVERTY:
			return "None";
		case POWER:
			return "None";
		case PROPHECY:
			return "None";
		case PROTECTION:
			return "None";
		case PURITY:
			return "None";
		case RADIATION:
			return "None";
		case RARITY:
			return "None";
		case RECENCY:
			return "None";
		case REDEMPTION:
			return "None";
		case REDUNDANCY:
			return "None";
		case REVERSAL:
			return "None";
		case ROCK:
			return "None";
		case SACRIFICE:
			return "None";
		case SCENT:
			return "None";
		case SECRECY:
			return "None";
		case SENSE:
			return "None";
		case SICKNESS:
			return "None";
		case SIGHT:
			return "None";
		case SILENCE:
			return "None";
		case SKY:
			return "None";
		case SLIME:
			return "None";
		case SORROW:
			return "None";
		case SOUL:
			return "None";
		case SPACE:
			return "None";
		case SPEED:
			return "None";
		case STABILITY:
			return "None";
		case STEALTH:
			return "None";
		case STUPIDITY:
			return "None";
		case SUPERNATURE:
			return "None";
		case TASTE:
			return "None";
		case TEDIUM:
			return "None";
		case TELEPORTATION:
			return "None";
		case THOUGHT:
			return "None";
		case TIME:
			return "None";
		case TOUCH:
			return "None";
		case TRANSPARENCY:
			return "None";
		case TRANSPORT:
			return "None";
		case UNDEAD:
			return "None";
		case UNDERGROUND:
			return "None";
		case UNKNOWN:
			return "None";
		case UNREALITY:
			return "None";
		case USTHER:
			return "None";
		case UTILITY:
			return "None";
		case VICTORY:
			return "None";
		case VOID:
			return "None";
		case WARMTH:
			return "None";
		case WASTE:
			return "None";
		case WATER:
			return "None";
		case WEATHER:
			if(type1 != null) {
				switch(type1) {
				case ACCURACY:
					return "None";
				case ACHIEVEMENT:
					return "None";
				case ADVENTURE:
					return "None";
				case AFTERLIFE:
					return "None";
				case AIR:
					return "None";
				case ALIEN:
					return "None";
				case ANGER:
					return "None";
				case ANIMAL:
					return "Cats and Dogs";
				case ANNOYANCE:
					return "None";
				case ARROGANCE:
					return "None";
				case ARTISTRY:
					return "None";
				case ASCENSION:
					return "None";
				case ATTRACTION:
					return "None";
				case AUTOMATION:
					return "None";
				case BALANCE:
					return "None";
				case BEAST:
					return "None";
				case BELONGING:
					return "None";
				case BETRAYAL:
					return "None";
				case BLOOD:
					return "None";
				case BLOODTHIRST:
					return "None";
				case CHANGE:
					return "None";
				case CHAOS:
					return "None";
				case CHEATING:
					return "None";
				case CLOTH:
					return "None";
				case COLD:
					return "None";
				case COLLECTION:
					return "None";
				case CONSUMPTION:
					return "None";
				case CONTINUUM:
					return "None";
				case CORRUPTION:
					return "None";
				case CREATION:
					return "None";
				case DARKNESS:
					return "None";
				case DEATH:
					return "None";
				case DECEPTION:
					return "None";
				case DEMAND:
					return "None";
				case DEPRESSION:
					return "None";
				case DESIRE:
					return "None";
				case DESTRUCTION:
					return "None";
				case DIRECTION:
					return "None";
				case DISCOVERY:
					return "None";
				case DISGUST:
					return "None";
				case EARTH:
					return "None";
				case ELECTRICITY:
					return "Lightning";
				case EMPTINESS:
					return "None";
				case ENDER:
					return "None";
				case ENVY:
					return "None";
				case ERUPTION:
					return "None";
				case EXCHANGE:
					return "None";
				case EXCITEMENT:
					return "None";
				case EXPERIMENT:
					return "None";
				case FINALITY:
					return "None";
				case FIRE:
					return "None";
				case FLESH:
					return "None";
				case FLIGHT:
					return "None";
				case FRAGILITY:
					return "None";
				case FRIGHT:
					return "None";
				case GODLINESS:
					return "None";
				case GREED:
					return "None";
				case GRIEF:
					return "None";
				case HAPPINESS:
					return "None";
				case HARM:
					return "None";
				case HATRED:
					return "None";
				case HEARING:
					return "None";
				case HELL:
					return "None";
				case HOLINESS:
					return "None";
				case HUMANITY:
					return "None";
				case HUNGER:
					return "None";
				case IMBALANCE:
					return "None";
				case INFINITY:
					return "None";
				case INSIGNIFICANCE:
					return "None";
				case INSTABILITY:
					return "None";
				case INSUFFICIENCY:
					return "None";
				case INTRICACY:
					return "None";
				case INTUITION:
					return "None";
				case KNOWLEDGE:
					return "None";
				case LAZINESS:
					return "None";
				case LIABILITY:
					return "None";
				case LIFE:
					return "None";
				case LIGHT:
					return "None";
				case LOVE:
					return "None";
				case LUCK:
					return "None";
				case LUST:
					return "None";
				case MAGIC:
					return "None";
				case MAGMA:
					return "None";
				case MAGNETISM:
					return "None";
				case MANIA:
					return "None";
				case MASCULINITY:
					return "None";
				case MECHANISM:
					return "None";
				case MEDICINE:
					return "None";
				case MEMORY:
					return "None";
				case METAL:
					return "None";
				case MISTAKE:
					return "None";
				case MOVEMENT:
					return "None";
				case NATURE:
					return "None";
				case NOISE:
					return "None";
				case NONSENSE:
					return "None";
				case ORDER:
					return "None";
				case PEACE:
					return "None";
				case PLANT:
					return "None";
				case POISON:
					return "None";
				case POVERTY:
					return "None";
				case POWER:
					return "None";
				case PROPHECY:
					return "None";
				case PROTECTION:
					return "None";
				case PURITY:
					return "None";
				case RADIATION:
					return "None";
				case RARITY:
					return "None";
				case RECENCY:
					return "None";
				case REDEMPTION:
					return "None";
				case REDUNDANCY:
					return "None";
				case REVERSAL:
					return "None";
				case ROCK:
					return "None";
				case SACRIFICE:
					return "None";
				case SCENT:
					return "None";
				case SECRECY:
					return "None";
				case SENSE:
					return "None";
				case SICKNESS:
					return "None";
				case SIGHT:
					return "None";
				case SILENCE:
					return "None";
				case SKY:
					return "None";
				case SLIME:
					return "None";
				case SORROW:
					return "None";
				case SOUL:
					return "None";
				case SPACE:
					return "None";
				case SPEED:
					return "None";
				case STABILITY:
					return "None";
				case STEALTH:
					return "None";
				case STUPIDITY:
					return "None";
				case SUPERNATURE:
					return "None";
				case TASTE:
					return "None";
				case TEDIUM:
					return "None";
				case TELEPORTATION:
					return "None";
				case THOUGHT:
					return "None";
				case TIME:
					return "None";
				case TOUCH:
					return "None";
				case TRANSPARENCY:
					return "None";
				case TRANSPORT:
					return "None";
				case UNDEAD:
					return "None";
				case UNDERGROUND:
					return "None";
				case UNKNOWN:
					return "None";
				case UNREALITY:
					return "None";
				case USTHER:
					return "None";
				case UTILITY:
					return "None";
				case VICTORY:
					return "None";
				case VOID:
					return "None";
				case WARMTH:
					return "None";
				case WASTE:
					return "None";
				case WATER:
					return "Rain";
				case WEATHER:
					return "None";
				case WOOD:
					return "None";
				case WORSHIP:
					return "None";
				case WORTH:
					return "None";
				default:
					return "None";
				}
			}
		case WOOD:
			return "None";
		case WORSHIP:
			return "None";
		case WORTH:
			return "None";
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
