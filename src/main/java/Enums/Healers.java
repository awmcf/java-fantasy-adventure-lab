package Enums;

public enum Healers {
    POTION(25),
    HERB(10);

    public final int heal;
    Healers(int heal) {
        this.heal = heal;
    }

    public int getHeal() {
        return this.heal;
    }
}
