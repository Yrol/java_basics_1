import java.util.ArrayList;

public class Main {

    /*
     * - In Java constant variables use the final modifier
     * - These variables are not meant to change during the execution of the
     * program.
     * Final variables cannot be reassigned with another.
     */

    private static final int SIZE = 10;

    private static final ArrayList<String> GAMES = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(SIZE);

        // Invalid operations as final cannot be reassigned to another object.
        // SIZE = 10; // doesn't compile
        // SIZE = SIZE; // doesn't compile

        final String brand = "Nokia";
        // brand = "Samsung"; // Invalid

        // Valid since we're not reassigning but calling methods on a final variable
        GAMES.add("Call of Duty");
        GAMES.remove(0);

        // Invalid
        // GAMES = new ArrayList<>(); // Won't compile
    }

}
