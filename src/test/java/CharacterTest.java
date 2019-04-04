import Characters.Cleric;
import Characters.MeleeCharacters.Barbarian;
import Characters.MeleeCharacters.Dwarf;
import Characters.MeleeCharacters.Knight;
import Characters.RangedCharacters.Warlock;
import Characters.RangedCharacters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    Barbarian barbarian;
    Dwarf dwarf;
    Knight knight;
    Warlock warlock;
    Wizard wizard;
    Cleric cleric;


    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 50);
        dwarf = new Dwarf("Gimli", 75);
        knight = new Knight("Heath Ledger", 100);
        warlock = new Warlock("Hagrid", 90);
        wizard = new Wizard("Harry", 60);
        cleric = new Cleric("Jay", 55);
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
        assertEquals(90, warlock.getHealthPoints());
        assertEquals(60, wizard.getHealthPoints());
        assertEquals(55, cleric.getHealthPoints());
    }

    @Test
    public void canGetRangedCharactersAndClericsName() {
        assertEquals("Hagrid", warlock.getName());
        assertEquals("Harry", wizard.getName());
        assertEquals("Jay", cleric.getName());
    }

//    @Test
//    public void canGetEquipment() {
//        assertEquals();
//    }

}
