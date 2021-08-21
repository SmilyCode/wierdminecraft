package smily.plugin.wierdminecraft.craftable.recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import smily.plugin.wierdminecraft.craftable.utils.SwapBase;

public class StonePickaxeRecipe extends SwapBase{

    public static ShapedRecipe setStoneRecipe(){

        ItemStack pickaxe = new ItemStack(Material.STONE_PICKAXE);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "stonepickaxe"), pickaxe)
                .shape("P  "," PS"," SS")
                .setIngredient('P', Material.STICK)
                .setIngredient('S', Material.COBBLESTONE);
    }


    @Override
    public void registerChanged() {
        swapRecipe(Material.STONE_PICKAXE, StonePickaxeRecipe.setStoneRecipe());
    }
}
