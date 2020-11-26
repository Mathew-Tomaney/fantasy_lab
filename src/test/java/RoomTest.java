import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    EvilOrc evilOrc;
    Treasure treasure;

    @Before
    public void before() {
        evilOrc = new EvilOrc();
        treasure = new Treasure("Chest", 200);
        room = new Room("Dungeon", 1, treasure, evilOrc);
    }

    @Test
    public void hasName(){
        assertEquals("Dungeon", room.getName());
    }

    @Test
    public void roomHasEnemy(){
        assertEquals(, );

    }

}


