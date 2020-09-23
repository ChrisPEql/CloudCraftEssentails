package de.chrispe.commands;

import de.chrispe.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class spawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length == 0){

                FileConfiguration config = Main.getPlugin().getConfig();
                World world = Bukkit.getWorld(config.getString("Spawn.World"));
                double x = config.getDouble("Spawn.X");
                double y = config.getDouble("Spawn.Y");
                double z = config.getDouble("Spawn.Z");
                float yaw = (float) config.getDouble("Spawn.Yaw");
                float pitch = (float) config.getDouble("Spawn.Pitch");
                Location location  = new Location(world, x, y, z, yaw, pitch);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 3F, 1F);
                player.sendTitle("", "§9§lWillkommen am Spawn!");
                player.teleport(location);

            }else
                player.sendMessage("§b§l[CloudCraft] §9§lBitte benutze §e§l/spawn§9§l!");

        }else
            System.out.println("§b§l[CloudCraft] §9§lDu kannst dich nicht in der Konsole zum Spawn teleportieren!");

        return false;
    }
}