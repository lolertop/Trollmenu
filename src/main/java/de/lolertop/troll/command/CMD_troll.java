package de.lolertop.troll.command;

import de.lolertop.troll.Troll;
import de.lolertop.troll.Util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CMD_troll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (!p.hasPermission("System.troll")) {
            p.sendMessage("§bTROLOLOLOLOL!");
            return true;
        }
        Inventory i = Bukkit.createInventory(null , 9*3 , "§5§lTrollmenu");
        if (p.getGameMode() == GameMode.CREATIVE) {
            i.setItem(13, (new ItemBuilder(Material.IRON_SWORD)).setDisplayname("§bSurvival").setLore("§7Setzte dich auf §aSurvival§7!").build());
        } else {
            i.setItem(13, (new ItemBuilder(Material.COMMAND)).setDisplayname("§bCreative").setLore("§7Setzte dich auf §aCreative§7!").build());
        }
        i.setItem(15, (new ItemBuilder(Material.FIREWORK)).setDisplayname("§6Speed").setLore("§7Entscheide wie schnell du §afliegen§7 willst!").build());
        i.setItem(11, (new ItemBuilder(Material.REDSTONE)).setDisplayname("§cKickall").setLore("§7Kick alle §aSpieler§7!").build());
        i.setItem(0, (new ItemBuilder(Material.GRASS)).setDisplayname("§aHeal").setLore("§aHeile §7dich!").build());
        i.setItem(8, (new ItemBuilder(Material.GLASS)).setDisplayname("§3Vanish").setLore("§7Werde für die Spieler §aunsichbar §7oder §aSichbar§7!").build());
        i.setItem(18, (new ItemBuilder(Material.PACKED_ICE)).setDisplayname("§b§lFreeze").setLore("§bFrezze §7einen §aSpieler!").build());
        i.setItem(26, (new ItemBuilder(Material.FEATHER)).setDisplayname("§6§lFly").setLore("§7Fliege in §aSurvival").build());
        i.setItem(14 , new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());

        i.setItem(1, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(2, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(3, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(4, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(5, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(6, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(7, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(9, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(10, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(12, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(14, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(16, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(17, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(19, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(20, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(21, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(22, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(23, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(24, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        i.setItem(25, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
        p.openInventory(i);
        return false;
    }
}
