package Characters.MeleeCharacters;

public class Dwarf extends MeleeCharacter {

    public Dwarf(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }
}
