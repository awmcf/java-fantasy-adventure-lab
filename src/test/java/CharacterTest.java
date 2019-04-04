import Characters.MeleeCharacters.Barbarian;
import Characters.MeleeCharacters.Dwarf;
import Characters.MeleeCharacters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    Barbarian barbarian;
    Dwarf dwarf;
    Knight knight;


    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 50);
        dwarf = new Dwarf("Gimli", 75);
        knight = new Knight("Heath Ledger", 100);
    }

    @Test
    public void canGetBarbarianName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canGetDwarfName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGetKnightName() {
        assertEquals("Heath Ledger", knight.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(50, barbarian.getHealthPoints());
        assertEquals(75, dwarf.getHealthPoints());
        assertEquals(100, knight.getHealthPoints());
    }

}
