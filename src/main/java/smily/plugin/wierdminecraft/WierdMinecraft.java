package smily.plugin.wierdminecraft;

import org.bukkit.plugin.java.JavaPlugin;
import smily.plugin.wierdminecraft.event.DiamondArmorDeathEvent;

public final class WierdMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Getting your wierd minecraft ready..");

        DiamondArmorDeathEvent diamondArmorDeathEvent = PluginContext.context.getBean(DiamondArmorDeathEvent.class);

        getServer().getPluginManager().registerEvents(diamondArmorDeathEvent, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
