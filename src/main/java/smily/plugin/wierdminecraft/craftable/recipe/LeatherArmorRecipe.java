package smily.plugin.wierdminecraft.craftable.recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import smily.plugin.wierdminecraft.craftable.utils.SwapBase;

public class LeatherArmorRecipe extends SwapBase{

    public static ShapedRecipe setLeatherHelmetRecipeUp() {

        ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherhelmet1"), leatherHelmet)
                .shape("DDD", "D D", "   ")
                .setIngredient('D', Material.DIAMOND);
    }

    public static ShapedRecipe setLeatherHelmetRecipeDown() {

        ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherhelmet2"), leatherHelmet)
                .shape( "   ", "DDD", "D D")
                .setIngredient('D', Material.DIAMOND);
    }

    public static ShapedRecipe setLeatherChestplate() {

        ItemStack leatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherchestplate"), leatherChestplate)
                .shape("D D", "DDD", "DDD")
                .setIngredient('D', Material.DIAMOND);
    }

    public static ShapedRecipe setLeatherLeggings() {

        ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherleggings"), leatherLeggings)
                .shape("DDD", "D D", "D D")
                .setIngredient('D', Material.DIAMOND);
    }

    public static ShapedRecipe setLeatherBootsUp() {

        ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherboots1"), leatherBoots)
                .shape("D D", "D D", "   ")
                .setIngredient('D', Material.DIAMOND);
    }

    public static ShapedRecipe setLeatherBootsDown() {

        ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);

        return new ShapedRecipe(new NamespacedKey(SwapBase.plugin, "leatherboots2"), leatherBoots)
                .shape("   ","D D", "D D")
                .setIngredient('D', Material.DIAMOND);
    }

    @Override
    public void registerChanged() {
        swapRecipe(Material.DIAMOND_HELMET, LeatherArmorRecipe.setLeatherHelmetRecipeUp());
        swapRecipe(Material.DIAMOND_HELMET, LeatherArmorRecipe.setLeatherHelmetRecipeDown());
        swapRecipe(Material.DIAMOND_CHESTPLATE, LeatherArmorRecipe.setLeatherChestplate());
        swapRecipe(Material.DIAMOND_LEGGINGS, LeatherArmorRecipe.setLeatherLeggings());
        swapRecipe(Material.DIAMOND_BOOTS, LeatherArmorRecipe.setLeatherBootsUp());
        swapRecipe(Material.DIAMOND_BOOTS, LeatherArmorRecipe.setLeatherBootsDown());

    }
}
