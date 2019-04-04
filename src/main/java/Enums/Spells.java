package Enums;

public enum Spells {
    FIREBALL(25),
    LIGHTNINGSTRIKE(30);

    public final int damage;

    Spells(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}