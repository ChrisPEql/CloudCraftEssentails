package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            Player player = (Player) sender;
            if(player.hasPermission("cloudcraft.heal")){
                if(args.length == 0) {
                    player.setHealth(20);
                    player.setFoodLevel(20);
                    player.sendMessage("§b§l[CloudCraft] §9§lDein §c§lLeben §9§lund dein §e§lHunger §9§lwurde aufgefüllt!");
                }else if(args.length == 1){
                        Player target = Bukkit.getPlayer(args[0]);
                        if(target != null){
                            target.setHealth(20);
                            target.setFoodLevel(20);
                            target.sendMessage("§b§l[CloudCraft] §9§lDir wurde dein §c§lLeben §9§lund das §6§lHungerlevel §9§lvon §e§l" + target.getName() + " §9§laufgefüllt!");
                            player.sendMessage("§b§l[CloudCraft] §9§lDu hast das §c§lLeben §9§lund das §6§lHungerlevel §9§lvon §e§l" + target.getName() + " §9§laufgefüllt!");

                        }else
                            player.sendMessage("§b§l[CloudCraft] §6§l" + target.getName() + " §9§list nicht auf dem Server!");
                    }else
                        player.sendMessage("§b§l[CloudCraft] Bitte benutze §6§l/heal [Spieler] §9§loder wenn du nur dich heilen willst dann benutze §6§l/heal §9§l!");

                }else
                    player.sendMessage("§b§l[CloudCraf] §9§lBitte benutze §6§l/heal");

        return false;
    }
}
