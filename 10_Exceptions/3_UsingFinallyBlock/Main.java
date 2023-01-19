/*
 * - The finally block executes always regardless of try catch block execution (even if another exception is thrown from the catch block).
 * - The order of the try, catch and finally block as is. (ex: we cannot place finally block at the top and the followed by try catch)
 */

public class Main {
    public static void main(String[] args) {

        String array[] = new String[6];
        try {
            String element = firstToUpperCase(array);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed after catch.");
        }

        array[0] = "delta";
        try {
            String element = firstToUpperCase(array);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed after try.");
        }

        /*
         * Exam tricks
         */
        String str = "";

        try {
            str += "a";
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";

        System.out.println("str=" + str); // acd -> since catch block didn't execute due to any exceptions.

        // The following will execute all blocks since we explicitly throw an exception.
        str = "";

        try {
            str += "a";
            throw new Exception(); // throwing the exception explicitly
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";

        System.out.println("str=" + str); // abcd

        /*
         * Invalid
         */
        // try {

        // } finally {

        // } catch (NullPointerException e) {

        // }

    }

    public static String firstToUpperCase(String array[]) {
        return array[0].toUpperCase();
    }
}
