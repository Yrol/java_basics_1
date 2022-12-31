public class Main {

    /*
     * - By default values are passed by copy.
     * - In StringBuilders although the value is passed as copy they are pointing to
     * the same object. Hence, the changes made via methods will affect all the
     * StringBuilder objects.
     */

    public static void main(String[] args) {

        /*
         * Int
         */
        int number = 4;
        System.out.println("Number=" + number); // 4
        newNumber(number);
        System.out.println("Number=" + number); // 4 won't affect the "number"

        /*
         * String
         */
        String name = "John";
        System.out.println("name=" + name); // John
        newName(name);
        System.out.println("name=" + name); // John

        /*
         * StringBuilder
         * 
         */

        StringBuilder game = new StringBuilder();
        game.append("CoD");
        System.out.println("Game=" + game); // CoD
        newGame(game);
        System.out.println("Game=" + game); // CoD 5 (since the copy is pointing to the same SB object)

        // Changing the object value after reassign
        StringBuilder newGame = game;
        System.out.println("newGame=" + newGame);
        newGame.replace(4, 5, "10");
        System.out.println("Game=" + game); // CoD
    }

    public static void newNumber(int number) {
        number = 10;
    }

    public static void newName(String name) {
        name = "Gary";
    }

    // In here "sb" variable will be a copy of "game" variable above. Hence the
    // changes here will reflect both.
    public static void newGame(StringBuilder sb) {
        sb.append(" 5");
    }
}
