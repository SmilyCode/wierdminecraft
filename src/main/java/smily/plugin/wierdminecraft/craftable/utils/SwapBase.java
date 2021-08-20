package smily.plugin.wierdminecraft.craftable.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.Plugin;

public abstract class SwapBase {
    public static Plugin plugin = Bukkit.getPluginManager().getPlugin("WierdMinecraft");

    public SwapBase(){
        registerChanged();
    }

    public abstract void registerChanged();

    public void swapRecipe(Material swap, Recipe matRecipe){
        Bukkit.removeRecipe(swap.getKey());
        Bukkit.addRecipe(matRecipe);
    }
}
