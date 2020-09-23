package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemode3 implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("cloudcraft.gamemode3")) {
            if (args.length == 0) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("§b§l[CloudCraft] §9§lDu bist nun im §b§l§nZuschauermodus!");
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    target.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage("§b§l[CloudCraft] §9§lDu hast §b§l§n" + target.getName() + " §9§lin den §b§l§nZuschauermodus §9§lversetzt!");
                } else
                    player.sendMessage("§b§l[CloudCraft] §b§l§n" + args[0] + "  §9§list nicht auf dem Server!");
            } else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §6§l/gm3 [Spieler]!");
        } else
            player.sendMessage("§b§l[CloudCraft] §9§lDu hast keine Rechte für §6§l/gm3 !");


        return false;


        }
    }