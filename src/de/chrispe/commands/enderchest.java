package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.block.EnderChest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class enderchest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length == 1){
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null){
                    player.openInventory(player.getEnderChest());
                    player.sendMessage("§b§l[CloudCraft] §9§lDu hast deine Enderchest geöffnet!");
                player.openInventory(target.getEnderChest());
                player.sendMessage("§b§l[CloudCraft] §9§lDu hast die Enderchest von §e§l" + args[0] + " §9§lgeöffnet!");

                }else
                    player.sendMessage("§b§l[CloudCraft] §e§l" + args[0] +" §9§list nicht online!");

            }else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §e§l/ec [Spieler]§9§l!");

        }else
            System.out.println("§b§l[CloudCraft] §9§lDu kannst keine Enderchest in der Konsole öffnen!");

        return false;
    }
}