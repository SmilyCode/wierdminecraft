package smily.plugin.wierdminecraft.Craftable;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class LeatherArmorRecipe extends SwapBase{

    public static ShapedRecipe setLeatherHelmetRecipe() {

        ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);

        ShapedRecipe shape = new ShapedRecipe(pluginKey, leatherHelmet);
        shape.shape("DDD", "D D", "   ");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    public static ShapedRecipe setLeatherChestplate() {

        ItemStack leatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        ShapedRecipe shape = new ShapedRecipe(pluginKey, leatherChestplate);
        shape.shape("D D", "DDD", "DDD");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    public static ShapedRecipe setLeatherLeggings() {

        ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);

        ShapedRecipe shape = new ShapedRecipe(pluginKey, leatherLeggings);
        shape.shape("DDD", "D D", "D D");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    public static ShapedRecipe setLeatherBoots() {

        ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);

        ShapedRecipe shape = new ShapedRecipe(pluginKey, leatherBoots);
        shape.shape("D D", "D D", "   ");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    @Override
    void registerChanged() {
        swapRecipe(Material.LEATHER_HELMET, LeatherArmorRecipe.setLeatherHelmetRecipe());
    }
}
