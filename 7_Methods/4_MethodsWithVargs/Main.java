import java.util.Arrays;

public class Main {

    /*
     * - Variable Arguments (Varargs)
     * - Underneath Java creates an array to hold Varargs values
     * - Similar to what's discussed in 5_Arrays/8_VariableArguments/Main.java
     * - Varargs parameter needs to be the last of the params list, means we can
     * have only one Varargs per method.
     * - Varargs can be ignored when calling the method (without passing a value)
     */

    // Ex1: method with Varargs
    static void jump1(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    // Ex2: with an int array as return type
    static int[] jump2(int... nums) {
        return nums;
    }

    // Ex2: method with normal arguments and Varargs
    static void jump3(String str, int... numbers) {
        System.out.println("length=" + numbers.length);
    }

    // Ex3: Invalid as Varargs must be the last param of the method
    // void jump4(int... numbers, int myNum) {} // Won't compile

    // Ex4: Invalid as there can be only one Varargs per method
    // void jump5(int... start, int... end){} // won't compile

    public static void main(String[] args) {
        jump1(); // will print an empty array (length 0)
        jump1(null); // will return null - NOT a null array

        // Calling method without passing a value for Varargs
        jump3("Toyota"); // ignoring the "numbers" param

        // calling Varargs param with array of values: method 1
        jump3("Nissan", 1, 2, 45, 69);

        // calling Varargs param with array of values: method 2
        jump3(null, new int[] { 2, 56, 98, 90 }); // redundant

        // Varargs with null: method 3 - will cause null pointer exception since trying
        // to access array.length
        // jump3(null, null); // runtime exception

        // Varargs with an uninitialized array
        int[] a;
        // jump3(null, a); // doesn't compile as array "a" isn't initialized

    }
}
