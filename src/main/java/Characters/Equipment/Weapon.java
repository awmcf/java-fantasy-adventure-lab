package Characters.Equipment;

public abstract class Weapon {
    protected String name;
    protected int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
