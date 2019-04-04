package Characters.MeleeCharacters;

public class Knight extends MeleeCharacter {

    public Knight(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }
}
