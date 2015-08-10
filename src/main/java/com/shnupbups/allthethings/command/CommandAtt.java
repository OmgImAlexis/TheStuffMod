package com.shnupbups.allthethings.command;

import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;

import java.util.ArrayList;
import java.util.List;

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
					sender.addChatMessage(new ChatComponentText("/att explode <power> [player] OR /att explode <power> [x] [y] [z] - creates an explosion of power <power> at user who typed command, [player] or [x],[y],[z]."));
				}
			} else if(args.length == 1) {
				if(args[0].equals("help")) {
					sender.addChatMessage(new ChatComponentText("/att help - gives help and usage of the att command"));
					sender.addChatMessage(new ChatComponentText("/att amount <block/item> - prints amount of <blocks/items> added by the mod (may not be accurate)"));
					
					if (UtilityCheck.isOp(sender)) {
						sender.addChatMessage(new ChatComponentText("/att tpx <id> [player] - teleports [player] or user who typed command to dimension id <id>"));
						sender.addChatMessage(new ChatComponentText("/att spawn [player] - teleports [player] or user who typed command to worldspawn"));
						sender.addChatMessage(new ChatComponentText("/att bed <bedowner> [player] - teleports [player] or user who typed command to bed of <bedowner>"));
						sender.addChatMessage(new ChatComponentText("/att explode <power> [player] OR /att explode <power> [x] [y] [z] - creates an explosion of power <power> at user who typed command, [player] or [x],[y],[z]."));
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
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument: '"+args[0]+"'. "+getCommandUsage(sender)));
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
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument: '"+args[0]+"'. "+getCommandUsage(sender)));
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
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument: '"+args[0]+"'. "+getCommandUsage(sender)));
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
						sender.addChatMessage(new ChatComponentText("One of your arguments is not a number"));
					}
				} else {
					sender.addChatMessage(new ChatComponentText("Invalid argument: '"+args[0]+"'. "+getCommandUsage(sender)));
				}
			} else {
				sender.addChatMessage(new ChatComponentText("Invalid or too many arguments. "+getCommandUsage(sender)));
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
