package smily.plugin.wierdminecraft.event;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import smily.plugin.wierdminecraft.PluginContext;

import java.util.*;


public class DiamondArmorDeathEvent implements Listener {
    ItemStack[] diamondArmor = {
            new ItemStack(Material.DIAMOND_HELMET),
            new ItemStack(Material.DIAMOND_CHESTPLATE),
            new ItemStack(Material.DIAMOND_LEGGINGS),
            new ItemStack(Material.DIAMOND_BOOTS)
    };
    boolean flag;

    boolean checkArmor(Player player){
        boolean[] test = new boolean[4];

        for (int i = 0; i < player.getInventory().getArmorContents().length; i++) {
            test[i] = Arrays.asList(player.getInventory().getArmorContents()).contains(diamondArmor[i]);
        }

        return test[0] && test[1] && test[2] && test[3];
    }

    @EventHandler
    public void inventoryClickEvent(InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {

            Player player = (Player) event.getWhoClicked();

            if (player.getGameMode().equals(GameMode.SURVIVAL)){
                Bukkit.getScheduler().scheduleSyncDelayedTask(PluginContext.plugin, () -> {
                    if (checkArmor(player)) {
                        flag = true;
                        player.setHealth(0d);
                    }
                }, 5);
            }
        }
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e){
        Player player = e.getPlayer();

        if (isDiamondArmor(e.getItem())) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                Bukkit.getScheduler().scheduleSyncDelayedTask(PluginContext.plugin, () -> {
                    if (checkArmor(player)) {
                        flag = true;
                        player.setHealth(0d);
                    }
                }, 5);
            }
        }
    }

    private boolean isDiamondArmor(ItemStack item){
        if (item != null) {
            return Arrays.asList(diamondArmor).contains(item);
        } else {
            return false;
        }
    }

    @EventHandler
    public void deathEvent (PlayerDeathEvent e){
        if (flag) {
            e.setDeathMessage(e.getEntity().getDisplayName() + " jadi ayam penyet gara-gara diamond armor.");
            flag = false;
        }
    }
}
