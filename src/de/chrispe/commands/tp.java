package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Player target = Bukkit.getPlayer(args[0]);
        if(target != null){
        if(player.hasPermission("cloudcraft.tp")){
        player.teleport(target.getLocation());
        player.sendMessage("§b§l[CloudCraft] §9§lDu hast dich zu §e§l" + args[0] + " §9§lteleportiert");
        target.teleport(player.getLocation());
        player.sendMessage("§b§l[CloudCraft] §9§lDu hast §e§l" + args[0] + " §9§lzu dir teleportiert!");
        target.sendMessage("§b§l[CloudCraft] §e§l" + player.getName() + " §9§lhat dich zu sich teleportiert!");

        }else
            player.sendMessage("§b§l[CloudCraft] §9§lFür diesen Befehl hast du keine Rechte!");

        }else
            player.sendMessage("§b§l[CloudCraft] §e§l" + args[0] + " §9§list nicht online!");

        return false;
    }
}