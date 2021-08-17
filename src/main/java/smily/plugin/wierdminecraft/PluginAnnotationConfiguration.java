package smily.plugin.wierdminecraft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smily.plugin.wierdminecraft.event.DiamondArmorDeathEvent;

@Configuration
public class PluginAnnotationConfiguration {

    @Bean
    public DiamondArmorDeathEvent getDiamondArmorDeathEvent(){
        return new DiamondArmorDeathEvent();
    }
}
