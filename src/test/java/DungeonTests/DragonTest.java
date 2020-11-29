package DungeonTests;
import Dungeon.Enemies.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon(500, 30, 10);
    }

//    manually tested this by supplying hard values instead of the randomly generated number.
//    @Test
//    public void canAttackPlayer(){
//        assertEquals(20, dragon.attackPlayer());
//    }
    @Test
    public void hasHealth(){
        assertEquals(500, dragon.getHealth());
    }
    @Test
    public void hasArmour(){
    dragon.reduceHealth(30);
    assertEquals(480, dragon.getHealth());
    }
}
