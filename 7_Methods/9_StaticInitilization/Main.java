import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * - Static initializers are called when class is first used.
     * - A class can have multiple static initializers however, the best practice is
     * to have one.
     * - Initializer will be called in an order (as they're defined).
     */

    private static final int SIZE;

    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final List<String> NAMES = new ArrayList<>();
    // private static final int four; // Won't compile as not initialized here or
    // within a static block below.

    // Static initializer - 1
    static {
        System.out.println("First static init");
        int rows = 5;
        int cols = 4;

        // Assigning SIZE variable inside the initializer block. This can only be done
        // inside an initializer.
        SIZE = rows * cols;
    }

    // Static initializer - 2
    static {
        System.out.println("Second static init");
        one = 1;
        two = 2;

        // Can reassign since "one" isn't a final variable
        one = three;

        // Invalid as "two" and "three" is already assigned above.
        // three = 3; // doesn't compile
        // two = 2; // doesn't compile

    }

    // Static initializer - 3
    static {
        System.out.println("Third static init");
        NAMES.add("John");
        NAMES.add("James");

    }

    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
