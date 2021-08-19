package smily.plugin.wierdminecraft.event;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import smily.plugin.wierdminecraft.PluginContext;

import java.util.stream.Stream;


public class DiamondArmorDeathEvent implements Listener {

    Material[] diamondArmor =
            {Material.DIAMOND_BOOTS
            , Material.DIAMOND_HELMET
            , Material.DIAMOND_CHESTPLATE
            , Material.DIAMOND_LEGGINGS};

    boolean checkArmor(Player player){
        int armorMeter = 0;

        for (ItemStack item : player.getInventory().getArmorContents()){
            if(item != null) {
                if (item.getType().equals(Material.DIAMOND_HELMET)) {
                    armorMeter++;
                } else if (item.getType().equals(Material.DIAMOND_CHESTPLATE)) {
                    armorMeter++;
                } else if (item.getType().equals(Material.DIAMOND_LEGGINGS)) {
                    armorMeter++;
                } else if (item.getType().equals(Material.DIAMOND_BOOTS)) {
                    armorMeter++;
                } else {
                    return false;
                }
            }else {
                return false;
            }
        }

        return armorMeter == 4;

    }

    @EventHandler
    public void inventoryClickEvent(InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {

            Player player = (Player) event.getWhoClicked();

            if (player.getGameMode().equals(GameMode.SURVIVAL)){
                Bukkit.getScheduler().scheduleSyncDelayedTask(PluginContext.plugin, () -> {
                    if (checkArmor(player)) {
                        player.setHealth(0d);
                        player.sendMessage("You Die");
                    }
                }, 5);

                if (event.getClick().equals(ClickType.RIGHT)) {
                    if (player.getOpenInventory().getType().equals(InventoryType.PLAYER)) {
                        if (checkArmor(player)) {
                            player.setHealth(0d);
                            player.sendMessage("You Die");
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e){
        Player player = e.getPlayer();
        if (e.getHand().equals()) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                Bukkit.getScheduler().scheduleSyncDelayedTask(PluginContext.plugin, () -> {
                    if (checkArmor(player)) {
                        player.setHealth(0d);
                        player.sendMessage("You Die");
                    }
                }, 5);
            }
        }
    }
}
