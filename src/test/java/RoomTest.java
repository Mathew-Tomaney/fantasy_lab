import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    EvilOrc evilOrc;
    Treasure treasure;
    Barbarian barbarian;

    @Before
    public void before() {
        evilOrc = new EvilOrc();
        treasure = new Treasure("Chest", 200);
        room = new Room("Dungeon", 1, treasure, evilOrc);
        barbarian = new Barbarian("Conan");
        barbarian.addWeapon(Weapons.AXE);
        room.addPlayer(barbarian);
    }

    @Test
    public void hasName(){
        assertEquals("Dungeon", room.getName());
    }

    @Test
    public void roomHasEnemy(){
        assertEquals(10, room.getEnemy().getHealth());
    }

    @Test
    public void roomHasTreasure(){
    assertEquals(200, room.getTreasure().getValue());
    }

    @Test
    public void roomHasPlayer(){
        assertEquals("Conan", room.getPlayer(0).getName());
    }

    @Test
    public void canFight(){
        room.fight();
        assertEquals(true, room.enemyIsDead());
        assertEquals(95, barbarian.getHealth());
    }
}


