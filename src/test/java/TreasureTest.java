import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Chest", 200);
    }
    @Test
    public void treasureHasDescription(){
        assertEquals("Chest", treasure.getDescription());
    }
    @Test
    public void treasureHasValue(){
        assertEquals(200, treasure.getValue());
    }
}
