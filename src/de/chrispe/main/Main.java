package de.chrispe.main;

import de.chrispe.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    private static Main plugin;

    public void onEnable(){
        System.out.println("CCEssentails wurde aktiviert!");
        plugin = this;

        getCommand("gm0").setExecutor(new gamemode0());
        getCommand("gms").setExecutor(new gamemode0());
        getCommand("gamemode0").setExecutor(new gamemode0());
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
        getCommand("setspawn").setExecutor(new setspawn());
        getCommand("spawn").setExecutor(new spawn());
        getCommand("invsee").setExecutor(new invsee());
        getCommand("ec").setExecutor(new enderchest());
        getCommand("tp").setExecutor(new tp());









        }

    public void onDisable(){
        System.out.println("CCEssentail wurde deaktiviert!");
        plugin = this;

    }

    public static Main getPlugin() {
        return plugin;
    }
}
