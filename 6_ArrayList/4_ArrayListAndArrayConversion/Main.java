import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /*
     * - ArrayLists can be converted to arrays. Size can set to any initially.
     * - Arrays can also be converted to ArrayLists
     * - Array to ArrayList conversion returns a FIXED size list and values cannot
     * be added or removed. Only Set is supported (modifying existing values).
     * - Array to ArrayList, after the conversion - if a value is set(modified) in
     * ArrayList it'll affect both Array and ArrayList and likewise if a value is
     * changed in the original array it'll affect both.
     */
    public static void main(String args[]) {

        /*
         * Converting a List to an Array
         * - Using toArray() method.
         */
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        // Using toArray() without type - defaults to type Object
        Object[] namesArray = names.toArray();
        System.out.println(namesArray.length);

        // Converting to a String array
        // Method 1: passing size = 0 initially and will automatically resize since
        // names has more than 3 elements (less performant).
        String[] strArray = names.toArray(new String[0]);

        // Method 2: Passing the exact size to the array using list size() method
        String stringArray[] = names.toArray(new String[names.size()]);

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(strArray));

        /*
         * Converting Array to a List
         */

        // Method 1: NOTE: the following will return a fixed size List.
        String[] petsArray = new String[] { "Dog", "Cat", "Parrot" };
        List<String> petsList = Arrays.asList(petsArray);
        // petsList.add("Rabbit"); // NOT allowed since array conversion returned a
        // fixed size list. Will throw a UnsupportedOperationException.
        System.out.println(petsList);

        // Setting values - Will affect the original Array as well as the List
        petsList.set(0, "Rabbit"); // Valid
        System.out.println(petsList); // [Rabbit, Cat, Parrot]
        System.out.println(Arrays.toString(petsArray)); // [Rabbit, Cat, Parrot]

        // Changing the original array - will affect both Array and ArrayList
        petsArray[2] = "Python";
        System.out.println(petsList); // [Rabbit, Cat, Parrot]
        System.out.println(Arrays.toString(petsArray)); // [Rabbit, Cat, Parrot]

        // Remove - NOT allowed: UnsupportedOperationException
        // petsList.remove("Cat"); // Runtime exception

    }
}
