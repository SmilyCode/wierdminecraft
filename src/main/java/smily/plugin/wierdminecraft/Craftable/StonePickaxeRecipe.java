package smily.plugin.wierdminecraft.Craftable;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class StonePickaxeRecipe extends SwapBase{
    static Plugin plugins = Bukkit.getPluginManager().getPlugin("WierdMinecraft");

    public static ShapedRecipe setStoneRecipe(){

        ItemStack pickaxe = new ItemStack(Material.STONE_PICKAXE);

        ShapedRecipe shape = new ShapedRecipe(pluginKey, pickaxe);
        shape.shape("P  "," PS"," SS");
        shape.setIngredient('P', Material.STICK);
        shape.setIngredient('S', Material.COBBLESTONE);

        return shape;
    }

    @Override
    void registerChanged() {
        swapRecipe(Material.STONE_PICKAXE, StonePickaxeRecipe.setStoneRecipe());

    }
}
