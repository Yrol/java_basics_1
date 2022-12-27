import java.util.Arrays;

public class Main {
    /*
     * Variable arguments are simply an array of arguments.
     * It can be written as: public static void printNames(String... names){}
     * The main method also accepts multiple arguments and can be written in 2 ways.
     * - main(String[] args)
     * - main(String... args)
     */
    // public static void main(String[] args) {}

    // Another way of writing the main method
    public static void main(String... args) {

        // the printNames method can be called in multiple ways
        // No need to pass values as an array
        printNames(); // will return an empty array
        printNames(null, null); // will return [null, null]
        printNames("James");
        printNames("Ryan", "Roland", "Diego");
        printNames(new String[] { "Messi", "Roberto" }); // not necessary

        // Not valid
        // printNames(23, 345); // Type must match

        // printAnimals("Cat", "Dog"); not valid when NOT using variable arguments
        printAnimals(new String[] { "Dolphin", "Whale", "Deer" });
    }

    // Example variable argument - type 1
    public static void printNames(String... names) {
        System.out.println(Arrays.toString(names));
    }

    // Method that accepts multiple arguments using traditional array
    public static void printAnimals(String[] animals) {
        System.out.println(Arrays.toString(animals));
    }
}
