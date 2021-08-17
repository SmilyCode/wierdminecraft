package smily.plugin.wierdminecraft.event;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;


public class DiamondArmorDeathEvent implements Listener {
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
    public void doEvent(InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {

            Player player = (Player) event.getWhoClicked();

            if (player.getGameMode().equals(GameMode.SURVIVAL)){
                if (event.getClickedInventory().getType().equals(player.getInventory().getType())) {
                    if (checkArmor(player)) {
                        player.setHealth(0d);
                    }
                }
            }
        }
    }
}
