package Rooms;

public abstract class Room {
    private String name;
    private String size;

    public Room(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }
}
