package de.chrispe.main;

import de.chrispe.commands.gamemode1;
import de.chrispe.commands.gamemode2;
import de.chrispe.commands.gamemode3;
import de.chrispe.commands.heal;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    private static Main plugin;

    public void onEnable(){
        System.out.println("CCEssentails wurde aktiviert!");
        plugin = this;

        getCommand("gm1").setExecutor(new gamemode1());
        getCommand("gmc").setExecutor(new gamemode1());
        getCommand("gamemode1").setExecutor(new gamemode1());
        getCommand("gm2").setExecutor(new gamemode2());
        getCommand("gma").setExecutor(new gamemode2());
        getCommand("gamemode2").setExecutor(new gamemode2());
        getCommand("gm3").setExecutor(new gamemode3());
        getCommand("gmsp").setExecutor(new gamemode3());
        getCommand("gamemode3").setExecutor(new gamemode3());
        getCommand("heal").setExecutor(new heal());









        }

    public void onDisable(){
        System.out.println("CCEssentail wurde deaktiviert!");
        plugin = this;

    }
}
