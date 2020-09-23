package de.chrispe.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemode3 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.hasPermission("cloudcraft.gm3")){
            if(args.length == 0){
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("§b§l[CloudCRaft] §9§lDu bist nun im Gamemode 3!");
                if(args.length == 1){
                   Player target = Bukkit.getPlayer(args[0]);
                   if(target != null){
                       target.setGameMode(GameMode.SPECTATOR);
                       target.sendMessage("§b§lDu wurdest von §e§l" + player.getName() + " §9§lin den §e§lZuschauermodus gesetzt!");
                        player.sendMessage("§b§l[CloudCraft] §9§lDu hast §e§l" + target.getName() + " §9§lin den §e§lZuschauermodus gesetzt!");

                   }else
                        player.sendMessage("§b§l[CloudCraft] §e§l" + target.getName() + " §9§list nicht online!");
                }else
                    player.sendMessage("§b§l[CloudCraft] §9§lBitte benutzze §e§l/gm3 [Spieler]§9§l!");

            }else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §e§l/gm3§9§l!");

        }else
            player.sendMessage("§b§l[CloudCraft] §9§lDafür hast du keine §c§lRechte§9§l!");

        return false;
    }
}
