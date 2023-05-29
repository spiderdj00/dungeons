import java.util.Random;

public class Fight {

    Monster monster;
    Player player;

    public Fight(Monster monster, Player player) {
        this.monster = monster;
        this.player = player;
    }

    public boolean nextStep() {
        monster.hitPoints = monster.hitPoints - rollDice();
        player.hitPoints = player.hitPoints - rollDice();

        if(monster.hitPoints <= 0) {
            System.out.println("Player won!");
            return false;
        }

        if (player.hitPoints <= 0) {
            System.out.println("Monster won!");
            return false;
        }

        return true;
    }

    Integer rollDice() {
        Random dice = new Random();
        return dice.nextInt(9);
    }

    @Override
    public String toString() {
        return "Fight{" + "monster=" + monster + ", player=" + player + '}';
    }
}
