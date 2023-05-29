import java.util.Arrays;

public class Dungeon {

    String name;
    Room[] rooms;

    Dungeon(String name) {
        this.name = name;

        rooms = new Room[3];

        rooms[0] = new Room(new Monster("Baa", 100, 1));
        rooms[1] = new Room(new Monster("Boo", 200, 10));
        rooms[2] = new Room(new Monster("Bla", 500, 20));
    }

    @Override
    public String toString() {
        return name + Arrays.toString(rooms);
    }
}
