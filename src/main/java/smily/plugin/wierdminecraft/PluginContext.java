package smily.plugin.wierdminecraft;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class PluginContext {
    public static ApplicationContext context = new AnnotationConfigApplicationContext(PluginAnnotationConfiguration.class);
    public static Plugin plugin = Bukkit.getPluginManager().getPlugin("WierdMinecraft");
}
