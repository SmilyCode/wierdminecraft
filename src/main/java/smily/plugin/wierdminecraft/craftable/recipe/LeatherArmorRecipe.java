package smily.plugin.wierdminecraft.craftable.recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import smily.plugin.wierdminecraft.craftable.utils.SwapBase;

public class LeatherArmorRecipe extends SwapBase{

    public static ShapedRecipe setLeatherHelmetRecipe() {

        ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);

        ShapedRecipe shape = new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherhelmet"), leatherHelmet);
        shape.shape("DDD", "D D", "   ");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    public static ShapedRecipe setLeatherChestplate() {

        ItemStack leatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        ShapedRecipe shape = new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherchestplate"), leatherChestplate);
        shape.shape("D D", "DDD", "DDD");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    public static ShapedRecipe setLeatherLeggings() {

        ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);

        ShapedRecipe shape = new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherleggings"), leatherLeggings);
        shape.shape("DDD", "D D", "D D");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    public static ShapedRecipe setLeatherBoots() {

        ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);

        ShapedRecipe shape = new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherboots"), leatherBoots);
        shape.shape("D D", "D D", "   ");
        shape.setIngredient('D', Material.DIAMOND);

        return shape;
    }

    @Override
    public void registerChanged() {
        swapRecipe(Material.DIAMOND_HELMET, LeatherArmorRecipe.setLeatherHelmetRecipe());
        swapRecipe(Material.DIAMOND_CHESTPLATE, LeatherArmorRecipe.setLeatherChestplate());
        swapRecipe(Material.DIAMOND_LEGGINGS, LeatherArmorRecipe.setLeatherLeggings());
        swapRecipe(Material.DIAMOND_BOOTS, LeatherArmorRecipe.setLeatherBoots());

    }
}
