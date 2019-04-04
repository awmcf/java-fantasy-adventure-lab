package Enums;

public enum Weapons {
    AXE(20),
    SWORD(30),
    CATTLEPROD(10);

    public final int damage;
    Weapons(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}



