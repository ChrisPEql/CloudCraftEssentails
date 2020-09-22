package de.chrispe.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class gamemode1 implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            System.out.println("Hello :3");
        return false;
    }
}
