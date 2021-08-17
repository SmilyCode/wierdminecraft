package smily.plugin.wierdminecraft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class PluginContext {
    static ApplicationContext context = new AnnotationConfigApplicationContext(PluginAnnotationConfiguration.class);
}
