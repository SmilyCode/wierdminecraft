package smily.plugin.wierdminecraft.craftable.recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import smily.plugin.wierdminecraft.craftable.utils.SwapBase;

public class DiamondArmorRecipe extends SwapBase {

    public static ShapedRecipe setDiamondHelmetUp() {

        ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);

        return new ShapedRecipe(new NamespacedKey(plugin, "diamondhelmet1"), diamondHelmet)
                .shape("LLL", "L L", "   ")
                .setIngredient('L', Material.LEATHER);
    }

    public static ShapedRecipe setDiamondHelmetDown() {

        ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);

        return new ShapedRecipe(new NamespacedKey(plugin, "diamondhelmet2"), diamondHelmet)
                .shape("   ", "LLL", "L L")
                .setIngredient('L', Material.LEATHER);
    }

    public static ShapedRecipe setDiamondChestplate() {

        ItemStack diamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);

        return new ShapedRecipe(new NamespacedKey(plugin, "diamondchestplate"), diamondChestplate)
                .shape("L L", "LLL", "LLL")
                .setIngredient('L', Material.LEATHER);
    }

    public static ShapedRecipe setDiamondLeggings() {

        ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);

        return new ShapedRecipe(new NamespacedKey(plugin, "diamondleggings"), diamondLeggings)
                .shape("LLL", "L L", "L L")
                .setIngredient('L', Material.LEATHER);
    }

    public static ShapedRecipe setDiamondBootsUp() {

        ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);

        return new ShapedRecipe(new NamespacedKey(plugin, "diamondboots1"), diamondBoots)
                .shape("L L", "L L", "   ")
                .setIngredient('L', Material.LEATHER);
    }

    public static ShapedRecipe setDiamondBootsDown() {

        ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);

        return new ShapedRecipe(new NamespacedKey(plugin, "diamondboots2"), diamondBoots)
                .shape("   ", "L L", "L L")
                .setIngredient('L', Material.LEATHER);
    }

    @Override
    public void registerChanged() {
        swapRecipe(Material.LEATHER_HELMET, DiamondArmorRecipe.setDiamondHelmetUp());
        swapRecipe(Material.LEATHER_HELMET, DiamondArmorRecipe.setDiamondHelmetDown());
        swapRecipe(Material.LEATHER_CHESTPLATE, DiamondArmorRecipe.setDiamondChestplate());
        swapRecipe(Material.LEATHER_LEGGINGS, DiamondArmorRecipe.setDiamondLeggings());
        swapRecipe(Material.LEATHER_BOOTS, DiamondArmorRecipe.setDiamondBootsUp());
        swapRecipe(Material.LEATHER_BOOTS, DiamondArmorRecipe.setDiamondBootsDown());
    }
}


