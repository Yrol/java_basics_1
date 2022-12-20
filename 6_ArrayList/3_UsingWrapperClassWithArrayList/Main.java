import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * - Using primitive wrapper classes (Integer, Double & etc) with ArrayList.
     * - Primitives cannot be used with ArrayLists since they're not classes.
     * - Converting String to wrapper and primitive
     * - Autoboxing: Automatically converts a primitive value to the respective
     * wrapper object.
     * - Unboxing; converting wrapper to a primitive data type.
     */
    public static void main(String args[]) {
        // List<double> doubleList = new ArrayList<>(); // Invalid
        List<Double> doubleList = new ArrayList<>(); // Valid

        /*
         * Autoboxing
         */
        doubleList.add(12.8); // Autoboxing - not assigning a primitive directly.
        doubleList.add(new Double(55.6)); // Not necessary
        doubleList.remove(55.6); // Autoboxing

        /*
         * Unboxing
         */
        double first = doubleList.get(0); // Unboxing to primitive data type.

        System.out.println(doubleList);
        System.out.println(first);

        /*
         * Exam tricks
         */

        // Ex1 - Wrapper, primitives and unboxing null to primitives.
        List<Integer> numbers = new ArrayList();
        numbers.add(null); // Valid since wrappers can be null. Unlike primitives
        System.out.println(numbers);

        // int number = numbers.get(0); unboxing will cause an exception since
        // primitives can't be null.

        // Ex2 - remove integers from an Integer ArrayList
        List<Integer> nums = new ArrayList();
        nums.add(1); // index 0
        nums.add(2); // index 1

        nums.remove(1); // will remove the integer @ index 1. NOT by value 1

        System.out.println(nums);

        // Removing the integer by value
        nums.remove(Integer.valueOf(1));
        // nums.remove(new Integer(1)); // This is also valid
        System.out.println(nums);
    }
}
