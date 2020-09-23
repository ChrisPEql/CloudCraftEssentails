package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemode2 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.hasPermission("cloudcraft.gm2")){
            if(args.length == 0){
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("§b§l[CloudCRaft] §9§lDu bist nun im §e§lAbenteuermodus§9§l!");
                if(args.length == 1){
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null){
                        target.setGameMode(GameMode.ADVENTURE);
                        target.sendMessage("§b§lDu wurdest von §e§l" + player.getName() + " §9§lin den §e§lAbenteuermodus gesetzt!");
                        player.sendMessage("§b§l[CloudCraft] §9§lDu hast §e§l" + target.getName() + " §9§lin den §e§lAbenteuermodus gesetzt!");

                    }else
                        player.sendMessage("§b§l[CloudCraft] §e§l" + target.getName() + " §9§list nicht online!");
                }else
                    player.sendMessage("§b§l[CloudCraft] §9§lBitte benutzze §e§l/gm2 [Spieler]§9§l!");

            }else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §e§l/gm2§9§l!");

        }else
            player.sendMessage("§b§l[CloudCraft] §9§lDafür hast du keine §c§lRechte§9§l!");

        return false;
    }
}
