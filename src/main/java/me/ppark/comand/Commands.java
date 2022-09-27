package me.ppark.comand;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] strings) {
        if (string.equalsIgnoreCase("gm")) {
            if (commandSender instanceof Player) {
                if (commandSender.isOp()) {
                    Player p = (Player) commandSender;
                    String PName = p.getName();
                    if (strings.length == 1) {
                        if (strings[0].equalsIgnoreCase("0")) {
                            p.setGameMode(GameMode.SURVIVAL);
                            p.sendMessage(ChatColor.GRAY + PName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Survival");
                            return true;
                        } else if (strings[0].equalsIgnoreCase("1")) {
                            p.setGameMode(GameMode.CREATIVE);
                            p.sendMessage(ChatColor.GRAY + PName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Creative");
                            return true;
                        } else if (strings[0].equalsIgnoreCase("2")) {
                            p.setGameMode(GameMode.ADVENTURE);
                            p.sendMessage(ChatColor.GRAY + PName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Adventure");
                            return true;
                        } else if (strings[0].equalsIgnoreCase("3")) {
                            p.setGameMode(GameMode.SPECTATOR);
                            p.sendMessage(ChatColor.GRAY + PName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Spectator");
                            return true;
                        } else {
                            return false;
                        }
                    } else if (strings.length == 2) {
                        String GMode = strings[0];
                        Player target = Bukkit.getPlayer(strings[1]);
                        String TName = target.getName();
                        if (strings[0].equalsIgnoreCase("0")) {
                            target.setGameMode(GameMode.SURVIVAL);
                            p.sendMessage(ChatColor.GRAY + TName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Survival");
                            return true;
                        } else if (strings[0].equalsIgnoreCase("1")) {
                            target.setGameMode(GameMode.CREATIVE);
                            p.sendMessage(ChatColor.GRAY + TName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Creative");
                            return true;
                        } else if (strings[0].equalsIgnoreCase("2")) {
                            target.setGameMode(GameMode.ADVENTURE);
                            p.sendMessage(ChatColor.GRAY + TName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Adventure");
                            return true;
                        } else if (strings[0].equalsIgnoreCase("3")) {
                            target.setGameMode(GameMode.SPECTATOR);
                            p.sendMessage(ChatColor.GRAY + TName + "'s "
                                    + "GameMode : " + ChatColor.GREEN + "Spectator");
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
