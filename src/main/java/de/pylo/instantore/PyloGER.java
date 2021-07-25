package de.pylo.instantore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PyloGER extends JavaPlugin {

    public static String prefix = "§8[§b§lInstant-Ore§8] ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(prefix + "§7the plugin has been §aactivated§8.");
        // Plugin Events
        Bukkit.getPluginManager().registerEvents(new InstantOre(), this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(prefix + "§7the plugin has been §cdeactivated§8.");
    }
}
