import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Lucian");
        dwarf.addWeapon(Weapons.MACE);
        dwarf.addWeapon(Weapons.AXE);
    }

    @Test
    public void hasName(){
        assertEquals("Lucian", dwarf.getName());
    }

    @Test
    public void canAttackWithWeapon(){
        assertEquals(5, dwarf.action());
    }

    @Test
    public void canRegenerate(){
        dwarf.action();
        assertEquals(102, dwarf.getHealth());
    }
}
