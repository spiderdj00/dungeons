public class Player {

    String name;
    Integer hitPoints;
    Integer experiencePoints = 0;

    Player(String name, Integer hp){
        this.name = name;
        this.hitPoints = hp;
    }
    @Override
    public String toString() {
        return name +"!" + hitPoints;
    }
}
