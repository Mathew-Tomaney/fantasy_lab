import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Barry");
        barbarian.addWeapon(Weapons.AXE);
        barbarian.addWeapon(Weapons.MACE);
    }

    @Test
    public void hasName(){
        assertEquals("Barry", barbarian.getName());
    }

    @Test
    public void canAttackWithWeapon(){
        assertEquals(30, barbarian.action());
    }

    @Test
    public void canSwapWeapon(){
        barbarian.swap(1);
        assertEquals(15, barbarian.action());
    }


}
