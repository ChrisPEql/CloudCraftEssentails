package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class invsee implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            Player target = Bukkit.getPlayer(args[0]);
            if(args.length == 1){
                if(target != null){
                    if(player.hasPermission("cloudcraft.invsee")){
                        player.openInventory(target.getInventory());
                        player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 3F, 1F);
                        player.sendMessage("§b§l[CloudCraft] §9§lDu hast das Inventar von §e§l" + args[0] + " §9§lgeöffnet!");

                }else
                    player.sendMessage("§b§l[CloudCraft] §9§lDafür hast du keine Rechte!");

            }else
                player.sendMessage("§b§l[CloudCraft] §e§l" + args[0] +" §9§list nicht online!");

            }else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §e§l/invsee [Spieler]§9§l!");

        }else
            System.out.println("§b§l[CloudCraft] §9§lDu kannst nicht in ein Inventar schauen wärend du in der Konsole bist!");

        return false;
    }
}