import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvilOrcTest {

    EvilOrc evilOrc;

    @Before
    public void before(){
        evilOrc = new EvilOrc();
    }
    @Test
    public void canAttackPlayer(){
        assertEquals(5, evilOrc.attackPlayer());
    }
    @Test
    public void hasHealth(){
        assertEquals(10, evilOrc.getHealth());
    }
}

