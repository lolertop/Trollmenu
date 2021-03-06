package de.lolertop.troll.event;

import de.lolertop.troll.Troll;
import de.lolertop.troll.Util.ItemBuilder;
import de.lolertop.troll.Util.VanishManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class Listeners implements Listener {

    @EventHandler
    public void onInvclick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory i = Bukkit.createInventory(null, 9 * 1, "§6§lSpeed");
        Inventory i1 = Bukkit.createInventory(null, 9 * 1, "§3§lVanish");
        if (e.getCurrentItem() == null) return;
        if (e.getView().getTitle() == "§5§lTrollmenu") {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§bSurvival":
                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage(Troll.prefix + "§7Dein Gamemode wurde auf §aSurvival §7gesetzt");
                        p.closeInventory();
                        break;
                    case "§bCreative":
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(Troll.prefix + "§7Dein Gamemode wurde auf §aCreative §7gesetzt");
                        p.closeInventory();
                        break;
                    case "§6Speed":
                        i.setItem(0, (new ItemBuilder(Material.PACKED_ICE)).setDisplayname("§6Speed§8:§7 0").build());
                        i.setItem(1, (new ItemBuilder(Material.FEATHER)).setDisplayname("§6Speed§8:§7 1").build());
                        i.setItem(2, (new ItemBuilder(Material.COAL)).setDisplayname("§6Speed§8:§7 2").build());
                        i.setItem(3, (new ItemBuilder(Material.FIREWORK)).setDisplayname("§6Speed§8:§7 3").build());
                        i.setItem(4, (new ItemBuilder(Material.GOLD_BOOTS)).setDisplayname("§6Speed§8:§7 4").build());
                        i.setItem(5, (new ItemBuilder(Material.SLIME_BALL)).setDisplayname("§6Speed§8:§7 5").build());
                        i.setItem(6, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        i.setItem(7, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        i.setItem(8, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        p.openInventory(i);
                        break;
                    case "§cKickall":
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            all.kickPlayer("§bTROLOLOLOLOL");
                            p.sendMessage(Troll.prefix + "§7Du hast nun alle gekickt");
                        }
                        break;
                    case "§aHeal":
                        p.setHealth(20);
                        p.setFoodLevel(20);
                        p.sendMessage(Troll.prefix + "§7Du wurdest nun §agehealt§7!");
                        break;
                    case "§6§lFly":
                        if (!p.getAllowFlight()) {
                            p.setAllowFlight(true);
                            p.setFlying(true);
                            p.sendMessage(Troll.prefix + "§7Du kannst nun §aFliegen§7!");
                        } else {
                            p.setAllowFlight(false);
                            p.setFlying(false);
                            p.sendMessage(Troll.prefix + "§7Du kannst nun nicht mehr §cFliegen§7!");
                        }
                        break;
                    case "§3Vanish":
                        i1.setItem(0, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
                        i1.setItem(1, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
                        i1.setItem(2, new ItemBuilder(Material.SLIME_BALL).setDisplayname("§bUnsichtbar").build());
                        i1.setItem(3, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
                        i1.setItem(4, new ItemBuilder(Material.SPIDER_EYE).setDisplayname("§bAlle spieler wo in vanish sind sehen").build());
                        i1.setItem(5, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
                        i1.setItem(6, new ItemBuilder(Material.REDSTONE_BLOCK).setDisplayname("§bSichbar").build());
                        i1.setItem(7, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
                        i1.setItem(8, new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname(" ").build());
                        p.openInventory(i1);
                        p.sendMessage(Troll.prefix + "§bVanish beta");
                        break;
                }
            }
        }
    }

    @EventHandler
    public void onInvclick1(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory i = Bukkit.createInventory(null, 9 * 1, "§6§lSpeed");
        if (e.getCurrentItem() == null) return;
        if (e.getView().getTitle() == "§6§lSpeed") {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§6Speed§8:§7 0":
                        if (p.isFlying()) {
                            p.setFlySpeed(0f);
                            p.sendMessage(Troll.prefix + "§7Dein Fly speed wurde auf §a0 §7gesetzt!");
                        } else {
                            p.setWalkSpeed(0f);
                            p.sendMessage(Troll.prefix + "§7Dein Walk speed wurde auf §a0 §7gesetzt!");
                        }
                        break;
                    case "§6Speed§8:§7 1":
                        if (p.isFlying()) {
                            p.setFlySpeed(0.1f);
                            p.sendMessage(Troll.prefix + "§7Dein Fly speed wurde auf §a1 §7gesetzt!");
                        } else {
                            p.setWalkSpeed(0.1f);
                            p.sendMessage(Troll.prefix + "§7Dein Walk speed wurde auf §a1 §7gesetzt!");
                        }
                        break;
                    case "§6Speed§8:§7 2":
                        if (p.isFlying()) {
                            p.setFlySpeed(0.2f);
                            p.sendMessage(Troll.prefix + "§7Dein Fly speed wurde auf §a2 §7gesetzt!");
                        } else {
                            p.setWalkSpeed(0.2f);
                            p.sendMessage(Troll.prefix + "§7Dein Walk speed wurde auf §a2 §7gesetzt!");
                        }
                        break;
                    case "§6Speed§8:§7 3":
                        if (p.isFlying()) {
                            p.setFlySpeed(0.3f);
                            p.sendMessage(Troll.prefix + "§7Dein Fly speed wurde auf §a3 §7gesetzt!");
                        } else {
                            p.setWalkSpeed(0.3f);
                            p.sendMessage(Troll.prefix + "§7Dein Walk speed wurde auf §a3 §7gesetzt!");
                        }
                        break;
                    case "§6Speed§8:§7 4":
                        if (p.isFlying()) {
                            p.setFlySpeed(0.4f);
                            p.sendMessage(Troll.prefix + "§7Dein Fly speed wurde auf §a4 §7gesetzt!");
                        } else {
                            p.setWalkSpeed(0.4f);
                            p.sendMessage(Troll.prefix + "§7Dein Walk speed wurde auf §a4 §7gesetzt!");
                        }
                        break;
                    case "§6Speed§8:§7 5":
                        if (p.isFlying()) {
                            p.setFlySpeed(0.5f);
                            p.sendMessage(Troll.prefix + "§7Dein Fly speed wurde auf §a5 §7gesetzt!");
                        } else {
                            p.setWalkSpeed(0.5f);
                            p.sendMessage(Troll.prefix + "§7Dein Walk speed wurde auf §a5 §7gesetzt!");
                        }
                        break;
                }
            }
        }
    }

    @EventHandler
    public void onInvclick3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getCurrentItem() == null) return;
        if (e.getView().getTitle() == "§3§lVanish") {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§bUnsichtbar":
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            all.hidePlayer(p);
                            p.sendMessage(Troll.prefix + "§7Du bist nun für alle unsichbar!");
                        }
                        break;
                    case "§bAlle spieler wo in vanish sind sehen":
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            p.showPlayer(all);
                            p.sendMessage(Troll.prefix + "§7Du kannst nun alle sehen!");
                        }
                        break;
                    case "§bSichbar":
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            all.showPlayer(p);
                            p.sendMessage(Troll.prefix + "§7Du bist nun für alle sichbar!");
                        }
                        break;
                }
            }
        }
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
    // Wenn der spieler joint soll der gevanished player nicht sichbar sein!
    /*
      if (VanishManager.getManager.getVanished) {

       }
    */
    }
    }