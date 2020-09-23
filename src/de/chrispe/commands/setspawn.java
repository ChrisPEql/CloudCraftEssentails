package de.chrispe.commands;

import de.chrispe.main.Main;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class setspawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("cloudcraft.setspawn")){
                if(args.length == 0){

                    FileConfiguration config = Main.getPlugin().getConfig();
                    config.set("Spawn.World", player.getWorld().getName());
                    config.set("Spawn.X", player.getLocation().getX());
                    config.set("Spawn.Y", player.getLocation().getY());
                    config.set("Spawn.Z", player.getLocation().getZ());
                    config.set("Spawn.Yaw", player.getLocation().getYaw());
                    config.set("Spawn.Pitch", player.getLocation().getPitch());
                    Main.getPlugin().saveConfig();
                    player.sendMessage("§b§l[CloudCraft] §9§lDer Spawn wurde gesetzt!");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 31F, 1F);
                    player.sendTitle("", "§9§lSpawn gesetzt!");

                }else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §e§l/setspawn§9§l!");

            }else
                player.sendMessage("§b§l[CloudCraft] §9§lDafür hast du keine §c§lRechte§9§l!");


        }else
            System.out.println("§b§l[CloudCraft] §9§lDu kannst den Spawn nicht in der Konsole festlegen!");

            return false;
    }
}