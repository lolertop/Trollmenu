package de.lolertop.troll;

import de.lolertop.troll.Util.VanishManager;
import de.lolertop.troll.command.CMD_troll;
import de.lolertop.troll.event.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Troll extends JavaPlugin {

    public static String prefix = "§5Troll §8| §7";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§7------------------------------");
        Bukkit.getConsoleSender().sendMessage("§7Name: §c§lTrollmenu");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7Plugin: §aOnline");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7Es gibt Fehler schreib mir mein discord: lolertop#9891");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7Author: §clolertop");
        Bukkit.getConsoleSender().sendMessage("§7------------------------------");

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Listeners() , this);

        getCommand("troll").setExecutor(new CMD_troll());
        getCommand("trollmenu").setExecutor(new CMD_troll());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
