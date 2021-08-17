package smily.plugin.wierdminecraft.Armor;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class DiamondArmorDeathEventTest {


    @Mock
    Player player;
    DiamondArmorDeathEvent underTest;

    @BeforeEach
    void setUp(){
        underTest = new DiamondArmorDeathEvent();
    }


    @Test
    void checkIfMethodWorked(){
        //given

        ItemStack[] diamondArmor = {new ItemStack(Material.DIAMOND_HELMET)
                , new ItemStack(Material.DIAMOND_CHESTPLATE)
                , new ItemStack(Material.DIAMOND_LEGGINGS)
                , new ItemStack(Material.DIAMOND_BOOTS)};

        //when
        when(player.getInventory().getArmorContents()).thenReturn(diamondArmor);

        boolean checkIf = underTest.checkArmor(player);

        assertThat(checkIf).isEqualTo(true);
    }
}