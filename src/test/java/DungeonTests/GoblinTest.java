package DungeonTests;

import Dungeon.Enemies.Goblin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

    Goblin goblin;

    @Before
    public void before(){
        goblin = new Goblin();
    }
    @Test
    public void canAttackPlayer(){
        assertEquals(5, goblin.attackPlayer());
    }
    @Test
    public void hasHealth(){
        assertEquals(10, goblin.getHealth());
    }
}

