import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
     * - Sorting an ArrayList is similar to sorting an Array.
     * - ArrayList is keeping the same order as we're entering it.
     * - For sorting we need to use the utility method from Collection class
     * (similar to Arrays class for the array).
     */
    public static void main(String args[]) {

        /*
         * Ex1: Using a String list
         * Sort will result in sorting the list elements alphabetically
         */
        List<String> numList = new ArrayList<>();
        numList.add("500");
        numList.add("10");
        numList.add("9");
        numList.add("50");
        numList.add("40");

        System.out.println(numList);

        Collections.sort(numList);

        System.out.println(numList); // [10, 40, 50, 500, 9] - Sorted alphabetically since in String format

        /*
         * Ex2: Using an Integer list
         * Creating a List using an Array
         */
        List<Integer> numberList = Arrays.asList(5, 4, 8, 10, 11, 3);
        Collections.sort(numberList);
        System.out.println(numberList); // [3, 4, 5, 8, 10, 11]

    }
}
