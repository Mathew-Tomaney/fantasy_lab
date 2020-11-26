import org.junit.Before;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Chest", 500);
    }
}
