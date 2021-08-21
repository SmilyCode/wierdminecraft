package smily.plugin.wierdminecraft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smily.plugin.wierdminecraft.craftable.recipe.DiamondArmorRecipe;
import smily.plugin.wierdminecraft.craftable.recipe.LeatherArmorRecipe;
import smily.plugin.wierdminecraft.craftable.recipe.StonePickaxeRecipe;
import smily.plugin.wierdminecraft.event.DiamondArmorDeathEvent;

@Configuration
public class PluginAnnotationConfiguration {

    @Bean
    public DiamondArmorDeathEvent getDiamondArmorDeathEvent(){
        return new DiamondArmorDeathEvent();
    }

    @Bean
    public StonePickaxeRecipe getStonePickaxeRecipe(){
        return new StonePickaxeRecipe();
    }

    @Bean
    public LeatherArmorRecipe getLeatherArmorRecipe(){
        return new LeatherArmorRecipe();
    }

    @Bean
    public DiamondArmorRecipe getDiamondArmorRecipe(){
        return new DiamondArmorRecipe();
    }
}
