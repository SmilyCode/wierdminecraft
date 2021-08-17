package smily.plugin.wierdminecraft.Craftable;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.Plugin;

public abstract class SwapBase {
    static Plugin plugin = Bukkit.getPluginManager().getPlugin("WierdMinecraft");
    static NamespacedKey pluginKey = new NamespacedKey(plugin, "wierdminecraft");

    SwapBase(){
        registerChanged();
    }

    abstract void registerChanged();

    public static void swapRecipe(Material mat, Recipe recipe){
        Bukkit.removeRecipe(mat.getKey());
        Bukkit.addRecipe(recipe);
    }
}
