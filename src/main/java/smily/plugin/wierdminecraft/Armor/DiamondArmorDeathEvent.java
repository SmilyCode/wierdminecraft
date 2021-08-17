package smily.plugin.wierdminecraft.Armor;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
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
            }else{
                return false;
            }
        }

        return armorMeter == 4;

    }

    @EventHandler
    void deathEvent(InventoryCloseEvent event) {
        Player player = (Player) event.getPlayer();

        if (player.getOpenInventory().getType() == InventoryType.PLAYER) {
            if (checkArmor(player)) {
                player.setHealth(0d);
            }
        }
    }
}
