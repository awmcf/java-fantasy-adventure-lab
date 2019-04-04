package Characters;

import Enums.Weapons;

import java.util.ArrayList;

public abstract class Character {
    protected String name;
    protected int healthPoints;
    protected ArrayList<Weapons> equipment;

    public Character(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.equipment = new ArrayList<Weapons>();
    }
}
