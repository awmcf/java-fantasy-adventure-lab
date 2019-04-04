package Characters.MeleeCharacters;

public class Barbarian extends MeleeCharacter {

    public Barbarian(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }
}
