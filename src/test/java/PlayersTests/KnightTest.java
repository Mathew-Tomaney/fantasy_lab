package PlayersTests;

import Players.Characters.Knight;
import Players.Utilities.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Kevin");
        knight.addWeapon(Weapons.SWORD);
        knight.takeDamage(10);

    }

    @Test
    public void hasName(){
        assertEquals("Kevin", knight.getName());
    }

    @Test
    public void canAttackWithWeapon(){
        assertEquals(10, knight.action());
    }

    @Test
    public void takesReducedDamage(){
        assertEquals(91, knight.getHealth());
    }
}
