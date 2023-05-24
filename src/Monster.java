public class Monster {

    String name;
    Integer hitPoints;
    Integer level;

    Monster(String name, Integer hitPoints, Integer level) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.level = level;
    }

    @Override
     public String toString() {
        return name +"!" + hitPoints + "!" + level;
    }
}
