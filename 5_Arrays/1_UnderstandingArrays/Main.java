import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
         * Initializing / creating arrays
         */

        // Method 1: an empty array with x number of elements
        int[] one = new int[3];

        // Method 2: array with real values
        int[] two = new int[] { 1, 2, 3, 4 };

        // Method 3: anonymous array (no type on the RHD) - 1
        int[] three = { 10, 89, 90, 90 };

        // Method 4: Creating multiple arrays in a single line
        int[] ids, types;
        ids = new int[] { 1, 4 };

        // Method 5: square bracket placement. Following are valid and both are empty.
        int[] a1;
        int a2[];

        // Array with 0 elements
        int arrayZero[] = {};
        System.out.println("Zero Array length = " + arrayZero.length); // will be 0
        // arrayZero[0] = 1; // Not valid and will cause out of bound exception.

        /*
         * Object arrays
         */

        // Defining object arrays
        String[] pets = { "Dog", "Cat", "Parrot" };
        String[] myPets = pets;
        String otherPets[] = { "Dog", "Cat", "Parrot" };

        // Object equality
        System.out.println("equals:" + pets.equals(myPets)); // true: checking reference equality. Similar to: ==
        System.out.println("==:" + (pets == myPets)); // true: checking the references.
        System.out.println("Arrays.equals:" + Arrays.equals(pets, myPets));// true: check the element of the array are
                                                                           // equal or not (element order matters)

        System.out.println("equals:" + pets.equals(otherPets)); // false: reference won't match
        System.out.println("==:" + (pets == otherPets)); // false: reference won't match
        System.out.println("Arrays.equals:" + Arrays.equals(pets, otherPets)); // true: elements will match

        /*
         * Printing arrays
         */
        System.out.println(Arrays.toString(pets));

        /*
         * Valid scenarios
         */

        // Case 1: Can use arithmetic operations and result will be round up or down to
        // a whole number.
        int[] cars = new int[4 * 5 / 3];
        System.out.println(cars.length); // size will be 6 elements

        int x = 4;
        int y = 4;

        // Case 2: defining the size using arithmetic operations
        double[] c = new double[x * y];

        /*
         * Invalid
         */
        // Array size must be defined using int and must be a whole number (no decimal)
        // double[] a = new double[2.5]; // won't compile

        // Array size must be defined to call array functions such as "length" & etc
        int[] d1;
        // System.out.println(d1.length); // won't compile

        /*
         * Bad practice
         */

        // Single line confusion
        int buses[], vans; // creates an integer array (buses) as well as an integer variable (vans)
    }

}
