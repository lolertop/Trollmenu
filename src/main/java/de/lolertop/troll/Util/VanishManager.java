package de.lolertop.troll.Util;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class VanishManager {
    private final Plugin plugin;
    private final List<Player> vanished;

    public VanishManager(Plugin plugin) {
        this.plugin = plugin;
        this.vanished = new ArrayList();
    }

    public List<Player> getVanished() {
        return this.vanished;
    }

    public boolean isvanished(Player player) {
        return this.vanished.contains(player);
    }

    public void setVanished(Player player, boolean bool) {
        if (bool) {
            this.vanished.add(player);
        } else {
            this.vanished.remove(player);
        }

        for (Player onlineplayer : Bukkit.getOnlinePlayers()) {
            if (!player.equals(onlineplayer)) {
                if (bool) {
                    onlineplayer.hidePlayer(player);
                } else {
                    onlineplayer.showPlayer(player);
                }
            }
        }
    }

    public void hideall(Player player) {
        this.vanished.forEach((player1) -> {
            player.hidePlayer(player1);
        });
    }
}

