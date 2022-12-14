import java.util.Arrays;

public class Main {

    /*
     * - Foreach loop also know as enhanced for loop.
     * - More convenance than traditional for loop as it doesn't need index.
     */
    public static void main(String[] args) {

        /*
         * Non object arrays
         */

        String[] names = { "Jimmy", "John", "Tom", "Anthony" };

        // traditional for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name:" + names[i]);
        }

        // Using Foreach loop to achieve the same above
        // "name" is a local variable within the loop.
        for (String name : names) {
            name = name + " Dorsey"; // will
            System.out.println("Name:" + name);
        }

        // String array values won't be affected after modify it within above foreach.
        // Since not objects
        System.out.println("After the loop: " + Arrays.toString(names));

        /*
         * Object arrays
         */

        // Example of foreach with object (references).
        // When we iterate objects its passed by reference, hence if we modify it within
        // the array it'll reflect outside the loop.
        StringBuilder[] builders = { new StringBuilder("Thomas"), new StringBuilder("Ryan") };

        // Object without modification
        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        // Object with modifications
        for (StringBuilder builder : builders) {
            builder.append(" Elton");
            System.out.println(builder);
        }

        // StringBuilder object array has been modified.
        System.out.println("After the loop:" + Arrays.toString(builders));

        /*
         * Exam tricks
         */
        String pets = "Parrot";

        // for(String pet: pets) {} // doesn't compile since string

        // Valid and print each character of the string
        for (char petChar : pets.toCharArray()) {
            System.out.println(petChar);
        }

    }
}
