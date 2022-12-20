import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
     * - Searching an ArrayList is similar to searching an array.
     * - Rule: List must be sorted first in order to get proper results.
     * - Same Binary Search (as arrays) will be applied for search.
     * - Binary Search will return the index of the element.
     */
    public static void main(String args[]) {

        // Ex1: String number list
        List<String> numList = new ArrayList<>();
        numList.add("500");
        numList.add("10");
        numList.add("9");
        numList.add("50");
        numList.add("40");

        System.out.println(numList); // [500, 10, 9, 50, 40]

        int index = Collections.binarySearch(numList, "10");
        System.out.println(index); // will return -1, which is false / not found.

        Collections.sort(numList);
        index = Collections.binarySearch(numList, "10");
        System.out.println(numList); // [10, 40, 50, 500, 9] - alphabetical order
        System.out.println(index); // 0: The value 10 is located at 0th element

        // Ex2: Integer number list
        List<Integer> intNumList = Arrays.asList(10, 5, 79, 55, 120, 89);
        System.out.println(intNumList);
        index = Collections.binarySearch(intNumList, 5);
        System.out.println(index);// will return -1, which is false / not found.
        Collections.sort(intNumList);
        System.out.println(intNumList); // [5, 10, 55, 79, 89, 120]
        index = Collections.binarySearch(intNumList, 5);
        System.out.println(index); // 0: The value 5 is located at 0th element
    }
}
