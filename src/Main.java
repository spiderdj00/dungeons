class Main {

    public static void main(String[] args) {
        System.out.println("Starting game!");

        Dungeon myDungeon = new Dungeon("koko");
        System.out.println(myDungeon);

        Player myPlayer = new Player("gaga", 350);
        System.out.println(myPlayer);

        Fight myFight = new Fight(myDungeon.rooms[0].monster, myPlayer);
        System.out.println(myFight);

        while(myFight.nextStep()) {
            System.out.println(myFight);
        }


    }
}