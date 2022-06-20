package de.lolertop.troll.event;

import de.lolertop.troll.Troll;
import de.lolertop.troll.Util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import java.util.Iterator;

public class Listeners implements Listener {

    public void onInteract(InventoryClickEvent e) {
        Inventory i = Bukkit.createInventory(null, 9, "§6Speed");
        Inventory i1 = Bukkit.createInventory(null, 9, "§3§lFreeze");
        Inventory i2 = Bukkit.createInventory(null, 9, "§3Vanish");
        Inventory i5 = Bukkit.createInventory(null, 9, "§6Seite§8: §72");
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§5§lTrollmenu") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§bCreative":
                            p.setGameMode(GameMode.CREATIVE);
                            p.closeInventory();
                            p.sendTitle("§5§lTrollmenu", "§7Du bist nun in §aCreative§7!");
                            break;
                        case "§b§lFreeze":
                            i2.setItem(0, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(1, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(2, (new ItemBuilder(Material.REDSTONE)).setDisplayname("§3Sichbar").build());
                            i2.setItem(3, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(4, (new ItemBuilder(Material.SPIDER_EYE)).setDisplayname("§7alle §aSpieler §7sehen wo in §3Vanish §7sind").build());
                            i2.setItem(5, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(6, (new ItemBuilder(Material.SLIME_BALL)).setDisplayname("§bUnsichbar").build());
                            i2.setItem(7, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(8, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            p.openInventory(i2);
                            p.sendMessage(Troll.prefix + "§cWird noch gemacht! §3Vanish §bBETA");
                            break;
                        case "§bSurvival":
                            p.setGameMode(GameMode.SURVIVAL);
                            p.closeInventory();
                            p.sendTitle("§5§lTrollmenu", "§7Du bist nun in §aSurvival§7!");
                            break;
                        case "§6Speed":
                            i.setItem(0, (new ItemBuilder(Material.PACKED_ICE)).setDisplayname("§6Speed§8:§7 0").build());
                            i.setItem(1, (new ItemBuilder(Material.FEATHER)).setDisplayname("§6Speed§8:§7 1").build());
                            i.setItem(2, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i.setItem(3, (new ItemBuilder(Material.COAL)).setDisplayname("§6Speed§8:§7 2").build());
                            i.setItem(4, (new ItemBuilder(Material.FIREWORK)).setDisplayname("§6Speed§8:§7 3").build());
                            i.setItem(5, (new ItemBuilder(Material.GOLD_BOOTS)).setDisplayname("§6Speed§8:§7 4").build());
                            i.setItem(6, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i.setItem(7, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i.setItem(8, (new ItemBuilder(Material.PAPER)).setDisplayname("§6Seite§8: §72").build());
                            p.openInventory(i);
                            break;
                        case "§3Vanish":
                            i2.setItem(0, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(1, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(2, (new ItemBuilder(Material.REDSTONE)).setDisplayname("§3Sichbar").build());
                            i2.setItem(3, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(4, (new ItemBuilder(Material.SPIDER_EYE)).setDisplayname("§7alle §aSpieler §7sehen wo in §3Vanish §7sind").build());
                            i2.setItem(5, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(6, (new ItemBuilder(Material.SLIME_BALL)).setDisplayname("§bUnsichbar").build());
                            i2.setItem(7, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            i2.setItem(8, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                            p.openInventory(i2);
                            p.sendMessage(Troll.prefix + "§cWird noch gemacht! §3Vanish §bBETA");
                            break;
                        case "§6§lFly":
                            if (!p.getAllowFlight()) {
                                p.setAllowFlight(true);
                                p.setFlying(true);
                                p.sendMessage(Troll.prefix + "§7Du kannst nun §aFliegen§7!");
                            } else {
                                p.setAllowFlight(false);
                                p.setFlying(false);
                                p.sendMessage(Troll.prefix + "§7Du kannst nun §4nicht §7mehr §cFliegen§7!");
                            }

                            p.closeInventory();
                            break;
                        case "§cKickall":
                            for (Player all : Bukkit.getOnlinePlayers()) {
                                p.sendMessage(Troll.prefix + "§7Du hast alle Spieler gekickt!");
                                all.kickPlayer("§5§lTroll\n§7Der Spieler §a" + p.getPlayer().getName() + " §7hat euch gekickt!\n§bTROLOLOLOLOLOL");
                                p.closeInventory();
                            }
                            break;
                        case "§aHeal":
                            p.setHealth(20);
                            p.setFoodLevel(20);
                            p.sendTitle("§5§lTrollmenu", "§7Du wurdest §aGehealt§7!");
                            break;
                        case "§3§lFreeze":
                            /*
                            ItemStack itemStack = new ItemStack(Material.PACKED_ICE);
                            ItemMeta itemMeta = itemStack.getItemMeta();
                            itemMeta.setDisplayName("§b§lFreeze");
                            itemMeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
                            ArrayList<String> lore = new ArrayList();
                            lore.add(" ");
                            lore.add("§3Freeze §7einen §aSpieler");
                            lore.add("§7Geh zu dem Spieler und mach auf ihn rechtsklick!");
                            lore.add(" ");
                            itemMeta.setLore(lore);
                            itemStack.setItemMeta(itemMeta);
                            p.sendMessage(Troll.prefix + "§7Du hast nun denn §bFreeze §7item!");
                            p.sendMessage(Troll.prefix + "§cDas ist noch nicht fertig");
                            p.getInventory().addItem(new ItemStack[]{itemStack});
                            p.closeInventory();
                            */
                            break;
                    }
                }
            }
        }
    }
    @EventHandler
    public void oninvclick(InventoryClickEvent e) {
        Inventory i = Bukkit.createInventory((InventoryHolder)null, 9, "§6Speed");
        Inventory i2 = Bukkit.createInventory((InventoryHolder)null, 9, "§6Seite§8: §72");
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§6Speed") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                            case "§6Speed§8:§7 0":
                                p.setFlySpeed(0.0F);
                                p.closeInventory();
                                p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 0");
                                break;
                            case "§6Speed§8:§7 1":
                                p.setFlySpeed(0.1F);
                                p.closeInventory();
                                p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 1");
                                break;
                            case "§6Speed§8:§7 2":
                                p.setFlySpeed(0.2F);
                                p.closeInventory();
                                p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 2");
                                break;
                            case "§6Speed§8:§7 3":
                            p.setFlySpeed(0.3F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 3");
                                break;
                            case "§6Speed§8:§7 4":
                                p.setFlySpeed(0.4F);
                                p.closeInventory();
                                p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 4");
                                break;
                        case "§6Seite§8: §72":
                        i2.setItem(0, (new ItemBuilder(Material.SLIME_BALL)).setDisplayname("§6Speed§8:§7 5").build());
                        i2.setItem(1, (new ItemBuilder(Material.FEATHER)).setDisplayname("§6Speed§8:§7 6").build());
                        i2.setItem(2, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        i2.setItem(3, (new ItemBuilder(Material.COAL)).setDisplayname("§6Speed§8:§7 7").build());
                        i2.setItem(4, (new ItemBuilder(Material.FIREWORK)).setDisplayname("§6Speed§8:§7 8").build());
                        i2.setItem(5, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        i2.setItem(6, (new ItemBuilder(Material.GOLD_BOOTS)).setDisplayname("§6Speed§8:§7 9").build());
                        i2.setItem(7, (new ItemBuilder(Material.FIREBALL)).setDisplayname("§6Speed§8:§7 10").build());
                        i2.setItem(8, (new ItemBuilder(Material.STAINED_GLASS_PANE)).setDisplayname(" ").build());
                        p.openInventory(i2);
                        break;
                        }
                        }
                    }
        }
    }
    @EventHandler
    public void oninvclick1(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§6Seite§8: §72") {
                Player p = (Player)e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§6Speed§8:§7 5":
                            p.setFlySpeed(0.5F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 5");
                            break;
                        case "§6Speed§8:§7 6":
                            p.setFlySpeed(0.6F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 6");
                            break;
                        case "§6Speed§8:§7 7":
                            p.setFlySpeed(0.7F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 7");
                            break;
                        case "§6Speed§8:§7 8":
                            p.setFlySpeed(0.8F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 8");
                            break;
                        case "§6Speed§8:§7 9":
                            p.setFlySpeed(0.9F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 9");
                            break;
                        case "§6Speed§8:§7 10":
                            p.setFlySpeed(1.0F);
                            p.closeInventory();
                            p.sendMessage(Troll.prefix + "§7Du bist nun in §6Speed§8:§7 10");
                    }
                }
            }

        }
    }
    @EventHandler
    public void oninvclick2(InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            if (e.getView().getTitle() == "§3Vanish") {
                Player p = (Player) e.getWhoClicked();
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    switch (e.getCurrentItem().getItemMeta().getDisplayName()) {
                            case "§7alle §aSpieler §7sehen wo in §3Vanish §7sind":
                                for (Player all : Bukkit.getOnlinePlayers()) {
                                    p.showPlayer(all);
                                    p.sendTitle("§5§lTrollmenu", "§7Du kannst nun alle §aSpieler §7sehen wo in §3Vanish §7sind");
                                }
                                break;
                            case "§bUnsichbar":
                                for (Player all : Bukkit.getOnlinePlayers()) {
                                    all.hidePlayer(p);
                                    p.sendTitle("§5§lTrollmenu", "§7Du bist nun §bUnsichbar§7!");
                                }
                                break;
                            case "§3Sichbar":
                                for (Player all : Bukkit.getOnlinePlayers()) {
                                    all.showPlayer(p);
                                    p.sendTitle("§5§lTrollmenu", "§7Du bist nun §3Sichbar§7!");
                                }
                                break;
                        }
                        }
                    }
                }
            }
        }