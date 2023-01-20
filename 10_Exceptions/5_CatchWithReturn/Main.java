/*
 * The return functions:
 * When the value is not returned outside of the try catch block:
 *  + The value must be returned at least inside try block or finally block (inside both is also valid).
 *  + Returning the value only inside catch block is NOT valid (unless not returned outside of the try catch block). 
 * 
 */

public class Main {
    public static void main(String[] args) {
        // Notice the return value is printed last after all the messages inside try,
        // catch and final blocks ae printed.
        System.out.println(calculate1()); // ErrorFinally0
        System.out.println(calculate2()); // ErrorFinally1
        System.out.println(calculate3()); // Finally0
    }

    public static int calculate1() {

        /*
         * Returning inside try, catch and finally
         * In this case since it reaches all 3 blocks (try, catch and finally), the
         * return value in finally block will be returned. Hence the output will be:
         * ErrorFinally0
         */
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
            return 1;
        } finally {
            System.out.println("Finally");
            return 0;
        }
    }

    /*
     * Tricky one
     * - It reaches all 3 blocks however, only try and catch blocks consist of
     * return statements and therefore the return value in catch will be returned.
     * - Output: ErrorFinally1
     */
    public static int calculate2() {
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
            return 1;
        } finally {
            System.out.println("Finally");
        }
    }

    /*
     * This will reach try and finally block (no exceptions scenario) and since
     * these 2 blocks consist of return statements, the return on finally block will
     * take the precedence. Output: Finally0
     */
    public static int calculate3() {
        try {
            return 10 / 1;
        } catch (ArithmeticException e) {
            System.out.println("Error");
            return 1;
        } finally {
            System.out.println("Finally");
            return 0;
        }
    }
}
