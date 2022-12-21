import java.util.Arrays;

public class Main {

    /*
     * - Array search can be performed using binarySearch available in Arrays helper
     * class
     * Search will return the element index or return false if not found.
     * - The array must sort using first in order to get accurate results.
     */
    public static void main(String[] args) {

        String[] strNum = new String[] { "70", "100", "8", "68" };
        System.out.println(Arrays.toString(strNum));
        System.out.println(Arrays.binarySearch(strNum, "70")); // will return -3
        Arrays.sort(strNum); // sorting the array
        System.out.println(Arrays.toString(strNum)); // [100, 68, 70, 8] - sort in alphabetical order
        System.out.println(Arrays.binarySearch(strNum, "70")); // will return index 2
        System.out.println(Arrays.binarySearch(strNum, "100")); // will return index 0
    }
}
