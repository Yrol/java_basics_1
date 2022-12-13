import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] pets = { "parrot", "cat", "dog" };

        String[] mammals = null;

        String[] birds = new String[3];

        String[] reptiles = {};

        int[] numbers = new int[3];

        // Accessing the values using index
        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
        // System.out.println(pets[3]); // will cause an out of bound exception

        // changing the value at index 0
        pets[0] = "Python";

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }

        // Printing the array using Arrays.toString
        System.out.println("pets toString:" + Arrays.toString(pets)); // [Python, cat, dog]
        System.out.println("mammals toString:" + Arrays.toString(mammals)); // null
        System.out.println("birds toString:" + Arrays.toString(birds)); // [null, null, null]
        System.out.println("numbers toString:" + Arrays.toString(numbers)); // [0, 0, 0] - since int is a primitive type
        System.out.println("reptiles toString:" + Arrays.toString(reptiles)); // []

        // Invalid: will cause an exception since "<=" will cause the length to go up to
        // 3 and the index range is only 0 - 2
        // for (int i = 0; i <= pets.length; i++) {
        // }

        // populating the numbers array using a loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers" + "[" + i + "]=" + numbers[i]);
        }

        /*
         * Using wrappers
         */

        Integer[] nums = new Integer[3];

        System.out.println("Wrapper Integer: " + Arrays.toString(nums)); // will prinnt - [null, null, null]. Since
                                                                         // Integer is an Object (not primitive)

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 3;
        }

        System.out.println("Wrapper Integer (after populate): " + Arrays.toString(nums));
    }
}
