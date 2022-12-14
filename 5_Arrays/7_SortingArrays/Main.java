import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*
     * - Java provides many out of the box sort methods.
     * - These methods are called utility (java.util) methods available in Arrays
     * method.
     */
    public static void main(String[] args) {

        // Ex1: Sorting an int array
        int[] numbers = { 5, 10, 2 };

        // Using the sort method
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        // Ex2: Sorting a string numeric array - output will be -> [20, 34, 50, 8]
        // Sorted by ascending order using first number of each (2)0, (3)4, (5)0, (8)
        String[] strNumbers = { "50", "20", "8", "34" };

        Arrays.sort(strNumbers);

        System.out.println(Arrays.toString(strNumbers));

        // Ex3: Sorting a mix string array (numbers and words)
        // Numbers will be sorted first and then words
        String[] strNumWords = { "900", "100", "23", "592", "Zebra", "Alligator" };

        Arrays.sort(strNumWords);

        // Result -> [100, 23, 592, 900, Alligator, Zebra]
        System.out.println(Arrays.toString(strNumWords));
    }
}
