import java.util.Arrays;

public class Main {

    /*
     * - Overloaded methods are the same method (name) with different type of:
     * * parameters
     * * number of parameters
     * * return types
     * * Access modifiers
     * 
     * examples - StringBuilder.append(), Arrays.toString() & etc.
     * 
     */

    public void walk(int miles) {

    }

    public void walk(short feet) {

    }

    // With default access modifier and 2 params
    void walk(int miles, short feet) {

    }

    /*
     * Invalid scenarios with parameters
     */

    // Ex1: with same type of arguments (float in this case)
    public void walk(float miles) {

    }
    // public int walk(float km) {} // Doesn't compile although the return type is
    // different (int).

    // public static void walk(float miles) {} // Doesn't compile even if its static

    public void walk(Float miles) { // Valid
    }

    public void walk(float[] miles) { // valid
    }

    // Ex2:
    public void walk(int[] miles) {
    }
    // public void walk(int... miles){} // Doesn't compile

    public boolean walk() {
        return false;
    }

    public static void main(String[] args) {

        /*
         * Run examples
         */
        run(25);
        run(null); // Will call "run(Integer miles)" since type Integer can be assigned null
        run(9L); // Will call "run(double miles)" since Long is 64bit and type double is the only
                 // type with 64bit in size - will become 9.0.

        /*
         * Jump examples
         */
        jump("25");
        jump(25); // Auto promoted to type Object since we don't have any jump method that accepts
                  // integers
    }

    /*
     * Run
     */
    public static void run(int miles) {

    }

    public static void run(double miles) {
        System.out.println(miles);
    }

    public static void run(Integer miles) {

    }

    /*
     * Jump
     */
    public static void jump(Object distance) {

    }

    public static void jump(String distance) {

    }
}
