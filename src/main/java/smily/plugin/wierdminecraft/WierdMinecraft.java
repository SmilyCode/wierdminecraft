package smily.plugin.wierdminecraft;

import org.bukkit.plugin.java.JavaPlugin;
import smily.plugin.wierdminecraft.event.DiamondArmorDeathEvent;
import smily.plugin.wierdminecraft.Craftable.StonePickaxeRecipe;

public final class WierdMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Getting your wierd minecraft ready..");

        new StonePickaxeRecipe();

        getServer().getPluginManager().registerEvents(new DiamondArmorDeathEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
