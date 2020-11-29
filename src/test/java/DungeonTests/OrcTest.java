package DungeonTests;

import Dungeon.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc();
    }
    @Test
    public void canAttackPlayer(){
        assertEquals(5, orc.attackPlayer());
    }
    @Test
    public void hasHealth(){
        assertEquals(10, orc.getHealth());
    }
}

