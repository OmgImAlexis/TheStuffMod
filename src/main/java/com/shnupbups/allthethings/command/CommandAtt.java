package com.shnupbups.allthethings.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.ChunkProviderServer;
import net.minecraftforge.common.DimensionManager;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.magic.FluoProperties;
import com.shnupbups.allthethings.utility.UtilityCheck;
import com.shnupbups.allthethings.utility.WorldHelper;
import com.shnupbups.allthethings.utility.WorldHelper.BlockArea;

public class CommandAtt extends CommandBase implements ICommand{

	private final List aliases;
	
	public CommandAtt() {
		aliases = new ArrayList();
		aliases.add("allthethings");
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "att";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		// TODO Auto-generated method stub
		return "For usage, type /att help";
	}

	@Override
	public List getCommandAliases() {
		// TODO Auto-generated method stub
		return this.aliases;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		World world = sender.getEntityWorld();
		
		if(!world.isRemote) {
			if(args.length == 0) {
				sender.addChatMessage(new ChatComponentText("/att help - gives help and usage of the att command"));
				sender.addChatMessage(new ChatComponentText("/att amount <block/item> - prints amount of <blocks/items> added by the mod"));
				
				if (UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("/att tpx <id> [player] - teleports [player] or user who typed command to dimension id <id>"));
					sender.addChatMessage(new ChatComponentText("/att spawn [player] - teleports [player] or user who typed command to worldspawn"));
					sender.addChatMessage(new ChatComponentText("/att bed <bedowner> [player] - teleports [player] or user who typed command to bed of <bedowner>"));
					sender.addChatMessage(new ChatComponentText("/att explode <power> [player] OR /att explode <power> [x] [y] [z] - creates an explosion of power <power> at user who typed command, [player] or [x],[y],[z]"));
					sender.addChatMessage(new ChatComponentText("/att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow] [percent] - fills area between <x1>,<y1>,<z1> and <x2>,<y2>,<z2> with <block>, and metadata [meta]. Will replace existing blocks by default, or if [replace] is true. Area will only be filled as a hollow box is [hollow] is true. If [percent] is defined, it will place blocks with a [percent]% chance"));
					sender.addChatMessage(new ChatComponentText("/att fluo <set|add|subtract> <amount> [player] - <set|add|subtract> <amount> fluo from [player] or play who typed command's total"));
				} else {
					sender.addChatMessage(new ChatComponentText("Other commands require op privileges."));
				}
			} else if(args.length == 1) {
				if(args[0].equals("help")) {
					sender.addChatMessage(new ChatComponentText("/att help - gives help and usage of the att command"));
					sender.addChatMessage(new ChatComponentText("/att amount <block/item> - prints amount of <blocks/items> added by the mod (may not be accurate)"));
					
					if (UtilityCheck.isOp(sender)) {
						sender.addChatMessage(new ChatComponentText("/att tpx <id> [player] - teleports [player] or user who typed command to dimension id <id>"));
						sender.addChatMessage(new ChatComponentText("/att spawn [player] - teleports [player] or user who typed command to worldspawn"));
						sender.addChatMessage(new ChatComponentText("/att bed <bedowner> [player] - teleports [player] or user who typed command to bed of <bedowner>"));
						sender.addChatMessage(new ChatComponentText("/att explode <power> [player] OR /att explode <power> [x] [y] [z] - creates an explosion of power <power> at user who typed command, [player] or [x],[y],[z]"));
						sender.addChatMessage(new ChatComponentText("/att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow] [percent] - fills area between <x1>,<y1>,<z1> and <x2>,<y2>,<z2> with <block>, and metadata [meta]. Will replace existing blocks by default, or if [replace] is true. Area will only be filled as a hollow box is [hollow] is true. If [percent] is defined, it will place blocks with a [percent]% chance"));
						sender.addChatMessage(new ChatComponentText("/att fluo <set|add|subtract> <amount> [player] - <set|add|subtract> <amount> fluo from [player] or play who typed command's total"));
					} else {
						sender.addChatMessage(new ChatComponentText("Other commands require op privileges."));
					}
				} else if(args[0].equals("amount")) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att amount <block/item>"));
				} else if(args[0].equals("tpx") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att tpx <id> [player]"));
				} else if(args[0].equals("bed") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att bed <bedowner> [player]"));
				} else if(args[0].equals("explode") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att explode <power> [player] OR /att explode <power> [x] [y] [z]"));
				} else if(args[0].equals("spawn") && UtilityCheck.isOp(sender)) {
					try {
						this.getCommandSenderAsPlayer(sender).setPositionAndUpdate(this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posX, this.getCommandSenderAsPlayer(sender).worldObj.getHeightValue(this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posX, this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posZ), this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posZ);
						sender.addChatMessage(new ChatComponentText("Teleported "+sender.getCommandSenderName()+" to world spawn"));
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Must specify player to teleport"));
					}
				} else if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow]"));
				} else if(args[0].equals("fluo") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fluo <set|add|subtract> <amount> [player]"));
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 2) {
				if(args[0].equals("amount")) {
					if(args[1].equals("block")) {
						sender.addChatMessage(new ChatComponentText(Reference.BLOCKS_ADDED+" blocks added"));
					} else if(args[1].equals("item")) {
						sender.addChatMessage(new ChatComponentText(Reference.ITEMS_ADDED+" items added"));
					} else {
						sender.addChatMessage(new ChatComponentText("USAGE: /att amount <block/item>"));
					}
				} else if(args[0].equals("tpx") && UtilityCheck.isOp(sender)) {
					try {
						if(!DimensionManager.isDimensionRegistered(Integer.parseInt(args[1]))) {
							sender.addChatMessage(new ChatComponentText("Dimension id "+args[1]+" does not exist"));
						} else {
							MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension(this.getCommandSenderAsPlayer(sender), Integer.parseInt(args[1]));
							this.getCommandSenderAsPlayer(sender).timeUntilPortal = 10;
							sender.addChatMessage(new ChatComponentText("Teleported "+sender.getCommandSenderName()+" to dimension id "+args[1]));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Must specify player to teleport"));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText(args[1]+" is not a number"));
					}
				} else if(args[0].equals("explode") && UtilityCheck.isOp(sender)) {
					try {
						sender.getEntityWorld().createExplosion(getCommandSenderAsPlayer(sender), sender.getPlayerCoordinates().posX, sender.getPlayerCoordinates().posY, sender.getPlayerCoordinates().posZ, Float.parseFloat(args[1]), true);
						sender.addChatMessage(new ChatComponentText("Explosion created at player "+sender.getCommandSenderName()));
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Must specify player or coordinates of explosion"));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText(args[1]+" is not a number"));
					}
				} else if(args[0].equals("bed") && UtilityCheck.isOp(sender)) {
					try {
						EntityPlayerMP bedowner = getPlayer(sender, args[1]);
						try {
							this.getCommandSenderAsPlayer(sender).setPositionAndUpdate(bedowner.getBedLocation(this.getCommandSenderAsPlayer(sender).dimension).posX, bedowner.getBedLocation(this.getCommandSenderAsPlayer(sender).dimension).posY+1, bedowner.getBedLocation(this.getCommandSenderAsPlayer(sender).dimension).posZ);
							sender.addChatMessage(new ChatComponentText("Teleported "+sender.getCommandSenderName()+" to the bed of "+args[1]));
						} catch(PlayerNotFoundException exc) {
							sender.addChatMessage(new ChatComponentText("Must specify player to teleport"));
						} catch(NullPointerException exc) {
							sender.addChatMessage(new ChatComponentText(args[1]+" does not have a bed"));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Player not found: "+args[1]));
					}
				} else if(args[0].equals("spawn") && UtilityCheck.isOp(sender)) {
					try {
						getPlayer(sender, args[1]).setPositionAndUpdate(getPlayer(sender, args[1]).worldObj.getSpawnPoint().posX, getPlayer(sender, args[1]).worldObj.getHeightValue(getPlayer(sender, args[1]).worldObj.getSpawnPoint().posX, getPlayer(sender, args[1]).worldObj.getSpawnPoint().posZ), getPlayer(sender, args[1]).worldObj.getSpawnPoint().posZ);
						sender.addChatMessage(new ChatComponentText("Teleported "+args[1]+" to world spawn"));
						getPlayer(sender, args[1]).addChatMessage(new ChatComponentText(sender.getCommandSenderName()+": Teleported "+args[1]+" to world spawn"));
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Player not found: "+args[1]));
					}
				} else if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow]"));
				} else if(args[0].equals("fluo") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fluo <set|add|subtract> <amount> [player]"));
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 3) {
				if(args[0].equals("tpx") && UtilityCheck.isOp(sender)) {
					try {
						if(!DimensionManager.isDimensionRegistered(Integer.parseInt(args[1]))) {
							sender.addChatMessage(new ChatComponentText("Dimension id "+args[1]+" does not exist"));
						} else {
							MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension(getPlayer(sender, args[2]), Integer.parseInt(args[1]));
							getPlayer(sender, args[2]).timeUntilPortal = 10;
							sender.addChatMessage(new ChatComponentText("Teleported "+args[2]+" to dimension id "+args[1]));
							getPlayer(sender, args[2]).addChatMessage(new ChatComponentText(sender.getCommandSenderName()+": Teleported "+args[2]+" to dimension id "+args[1]));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Player not found: "+args[2]));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText(args[1]+" is not a number"));
					}
				} else if(args[0].equals("explode") && UtilityCheck.isOp(sender)) {
					try {
						EntityPlayerMP explodeat = getPlayer(sender, args[2]);
						try {
							sender.getEntityWorld().createExplosion(getCommandSenderAsPlayer(sender), explodeat.getPlayerCoordinates().posX, explodeat.getPlayerCoordinates().posY, explodeat.getPlayerCoordinates().posZ, Float.parseFloat(args[1]), true);
							sender.addChatMessage(new ChatComponentText("Explosion created at player "+args[2]));
							explodeat.addChatMessage(new ChatComponentText(sender.getCommandSenderName()+": Explosion created at player "+args[2]));
						} catch(PlayerNotFoundException exc) {
							sender.getEntityWorld().createExplosion(explodeat, explodeat.getPlayerCoordinates().posX, explodeat.getPlayerCoordinates().posY, explodeat.getPlayerCoordinates().posZ, Float.parseFloat(args[1]), true);
							sender.addChatMessage(new ChatComponentText("Explosion created at player "+args[2]));
						} catch(NumberFormatException exc) {
							sender.addChatMessage(new ChatComponentText(args[1]+" is not a number"));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Player not found: "+args[2]));
					}
				} else if(args[0].equals("bed") && UtilityCheck.isOp(sender)) {
					try {
						EntityPlayerMP bedowner = getPlayer(sender, args[1]);
						try {
							getPlayer(sender, args[2]).setPositionAndUpdate(bedowner.getBedLocation(getPlayer(sender, args[2]).dimension).posX, bedowner.getBedLocation(getPlayer(sender, args[2]).dimension).posY+1, bedowner.getBedLocation(getPlayer(sender, args[2]).dimension).posZ);
							sender.addChatMessage(new ChatComponentText("Teleported "+args[2]+" to the bed of "+args[1]));
							getPlayer(sender, args[2]).addChatMessage(new ChatComponentText(sender.getCommandSenderName()+": Teleported "+args[2]+" to the bed of "+args[1]));
						} catch(PlayerNotFoundException exc) {
							sender.addChatMessage(new ChatComponentText("Player not found: "+args[2]));
						} catch(NullPointerException exc) {
							sender.addChatMessage(new ChatComponentText(args[1]+" does not have a bed"));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Player not found: "+args[1]));
					}
				} else if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow]"));
				} else if(args[0].equals("fluo") && UtilityCheck.isOp(sender)) {
					try {
						if(args[1].equals("set")) {
							FluoProperties.get(this.getCommandSenderAsPlayer(sender)).setFluoLevel(Integer.parseInt(args[2]));
							sender.addChatMessage(new ChatComponentText("Set Fluo level to "+args[2]+" (or closest valid amount)"));
						} else if(args[1].equals("add")) {
							FluoProperties.get(this.getCommandSenderAsPlayer(sender)).addFluo(Integer.parseInt(args[2]), false, true);
							sender.addChatMessage(new ChatComponentText("Added "+args[2]+" (or closest valid amount) to Fluo level"));
						} else if(args[1].equals("subtract")) {
							FluoProperties.get(this.getCommandSenderAsPlayer(sender)).subtractFluo(Integer.parseInt(args[2]), false, true);
							sender.addChatMessage(new ChatComponentText("Subtracted "+args[2]+" (or closest valid amount) from Fluo level"));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Must specify player"));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText(args[2]+" is not a number"));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 4) {
				if(args[0].equals("fluo") && UtilityCheck.isOp(sender)) {
					try {
						if(args[1].equals("set")) {
							FluoProperties.get(getPlayer(sender, args[3])).setFluoLevel(Integer.parseInt(args[2]));
							sender.addChatMessage(new ChatComponentText("Set Fluo level  of "+args[3]+" to "+args[2]+" (or closest valid amount)"));
						} else if(args[1].equals("add")) {
							FluoProperties.get(getPlayer(sender, args[3])).addFluo(Integer.parseInt(args[2]), false, true);
							sender.addChatMessage(new ChatComponentText("Added "+args[2]+" (or closest valid amount) to Fluo level of "+args[3]));
						} else if(args[1].equals("subtract")) {
							FluoProperties.get(getPlayer(sender, args[3])).subtractFluo(Integer.parseInt(args[2]), false, true);
							sender.addChatMessage(new ChatComponentText("Subtracted "+args[2]+" (or closest valid amount) from Fluo level of "+args[3]));
						}
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Player not found: "+args[3]));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText(args[2]+" is not a number"));
					}
				} else if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow]"));
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 5) {
				if(args[0].equals("explode") && UtilityCheck.isOp(sender)) {
					try {
						sender.getEntityWorld().createExplosion(getCommandSenderAsPlayer(sender), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]), Float.parseFloat(args[1]), true);
						sender.addChatMessage(new ChatComponentText("Explosion created at coordinates "+args[2]+","+args[3]+","+args[4]));
					} catch(PlayerNotFoundException exc) {
						sender.getEntityWorld().createExplosion(null, Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]), Float.parseFloat(args[1]), true);
						sender.addChatMessage(new ChatComponentText("Explosion created at coordinates "+args[2]+","+args[3]+","+args[4]));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number. "+exc.getMessage()));
					}
				} else if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow]"));
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 8) {
				if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					try {
						BlockArea area = new BlockArea(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
						area.fillWithBlock(sender.getEntityWorld(), this.getBlockByText(sender, args[7]));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number. "+exc.getMessage()));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 9) {
				if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					try {
						BlockArea area = new BlockArea(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
						area.fillWithBlock(sender.getEntityWorld(), this.getBlockByText(sender, args[7]), Integer.parseInt(args[8]));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number. "+exc.getMessage()));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 10) {
				if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					try {
						BlockArea area = new BlockArea(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
						area.fillWithBlock(sender.getEntityWorld(), this.getBlockByText(sender, args[7]), Integer.parseInt(args[8]), Boolean.parseBoolean(args[9]));
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number. "+exc.getMessage()));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 11) {
				if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					try {
						BlockArea area = new BlockArea(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
						if(Boolean.parseBoolean(args[10])) {
							area.fillWithBlockHollow(sender.getEntityWorld(), this.getBlockByText(sender, args[7]), Integer.parseInt(args[8]), Boolean.parseBoolean(args[9]));
						} else {
							area.fillWithBlock(sender.getEntityWorld(), this.getBlockByText(sender, args[7]), Integer.parseInt(args[8]), Boolean.parseBoolean(args[9]));
						}
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number. "+exc.getMessage()));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else if(args.length == 12) {
				if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					try {
						BlockArea area = new BlockArea(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
						if(Boolean.parseBoolean(args[10])) {
							area.fillWithBlockChanceHollow(sender.getEntityWorld(), this.getBlockByText(sender, args[7]), Integer.parseInt(args[8]), Boolean.parseBoolean(args[9]), Integer.parseInt(args[11]));
						} else {
							area.fillWithBlockChance(sender.getEntityWorld(), this.getBlockByText(sender, args[7]), Integer.parseInt(args[8]), Boolean.parseBoolean(args[9]), Integer.parseInt(args[11]));
						}
					} catch(NumberFormatException exc) {
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number. "+exc.getMessage()));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument (or too many parameters!): '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else {
				if(args[0].equals("amount")) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att amount <block/item>"));
				} else if(args[0].equals("tpx") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att tpx <id> [player]"));
				} else if(args[0].equals("bed") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att bed <bedowner> [player]"));
				} else if(args[0].equals("explode") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att explode <power> [player] OR /att explode <power> [x] [y] [z]"));
				} else if(args[0].equals("spawn") && UtilityCheck.isOp(sender)) {
					try {
						this.getCommandSenderAsPlayer(sender).setPositionAndUpdate(this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posX, this.getCommandSenderAsPlayer(sender).worldObj.getHeightValue(this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posX, this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posZ), this.getCommandSenderAsPlayer(sender).worldObj.getSpawnPoint().posZ);
						sender.addChatMessage(new ChatComponentText("Teleported "+sender.getCommandSenderName()+" to world spawn"));
					} catch(PlayerNotFoundException exc) {
						sender.addChatMessage(new ChatComponentText("Must specify player to teleport"));
					}
				} else if(args[0].equals("fill") && UtilityCheck.isOp(sender)) {
					sender.addChatMessage(new ChatComponentText("USAGE: /att fill <x1> <y1> <z1> <x2> <y2> <z2> <block> [meta] [replace] [hollow]"));
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument: '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			}
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args) {
		List options = new ArrayList();
		if (args.length == 1) {
			if(UtilityCheck.isOp(sender)) return getListOfStringsMatchingLastWord(args, new String[] {"help", "amount", "tpx", "spawn", "bed", "explode"});
			else return getListOfStringsMatchingLastWord(args, new String[] {"help", "amount"});
		} else if(args.length == 2){
			if(args[0].equals("amount")) {
				return getListOfStringsMatchingLastWord(args, new String[] {"block", "item"});
			} else if(args[0].equals("spawn") && UtilityCheck.isOp(sender)) {
				return getListOfStringsMatchingLastWord(args, this.getListOfPlayerUsernames());
			} else if(args[0].equals("bed") && UtilityCheck.isOp(sender)) {
				return getListOfStringsMatchingLastWord(args, this.getListOfPlayerUsernames());
			} else if(args[0].equals("tpx") && UtilityCheck.isOp(sender)) {
				String[] list = new String[DimensionManager.getIDs(true).length];
				for (int i = 0; i < DimensionManager.getIDs(true).length; i++) {
					list[i] = DimensionManager.getIDs(true)[i].toString();
				}
				return getListOfStringsMatchingLastWord(args, list);
			}
		} else if(args.length == 3){
			if(args[0].equals("bed") && UtilityCheck.isOp(sender)) {
				return getListOfStringsMatchingLastWord(args, this.getListOfPlayerUsernames());
			} else if(args[0].equals("tpx") && UtilityCheck.isOp(sender)) {
				return getListOfStringsMatchingLastWord(args, this.getListOfPlayerUsernames());
			} else if(args[0].equals("explode") && UtilityCheck.isOp(sender)) {
				return getListOfStringsMatchingLastWord(args, this.getListOfPlayerUsernames());
			}
		}
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected String[] getListOfPlayerUsernames()
    {
        return MinecraftServer.getServer().getAllUsernames();
    }

}
