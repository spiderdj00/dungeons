public class Room {

    Monster monster;

    Room(Monster monster) {
      this.monster = monster;
    }

    @Override
    public String toString() {
        return "Room: " + monster;
    }
}
