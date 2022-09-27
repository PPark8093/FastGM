package me.ppark.main;

import me.ppark.comand.Commands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    String ver = getDescription().getVersion();

    @Override
    public void onEnable() {
        System.out.println("Ver " + ver);
        getCommand("gm").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        System.out.println("Bye");
    }
}
