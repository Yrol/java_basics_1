/*
 * Rules:
 * - When catching exceptions using custom superclass and subclass exception types, subclass exceptions must be handled first in the catch blocks.
 */

// Defining a custom runtime exception (Unchecked)
class MuseumClosed extends RuntimeException {

}

// Extending the MuseumClosed exception (Unchecked)
class MuseumClosedForLunch extends MuseumClosed {

}

public class Main {
    public static void main(String[] args) {

        /*
         * Subclass and Superclass exception define order
         * - When catching exception using child and parent, the child ones should be
         * defined first.
         */

        // using multiple catch blocks to capture different errors. The subclass
        // exception MuseumClosedForLunch has been defined first.
        try {
            visitMuseum();
        } catch (MuseumClosedForLunch mc) {
            System.out.println("Closed for lunch");
        } catch (MuseumClosed mc) {
            System.out.println("Closed today");
        }

        // INVALID example - the following won't compile since the superclass exception
        // has been defined first. "Unreachable catch block for MuseumClosedForLunch. It
        // is already handled by the catch block for MuseumClosed"
        // try {

        // } catch (MuseumClosed mc) {

        // } catch (MuseumClosedForLunch mc) {

        // }

        // INVALID - since RuntimeException is the parent all the custom exceptions and
        // its been defined first.
        // try {

        // } catch (RuntimeException mc) {

        // } catch (MuseumClosedForLunch mc) {

        // } catch (MuseumClosed mc) {

        // }

        /*
         * Nested exceptions
         */
        System.out.println(calculate());// startnpefinallyfinshed

    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;

        if (b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }

    public static String calculate() {
        String result = "";
        String str = null;

        try {
            try {
                result += "start";
                str.length(); // will throw a NullPointerException
                result += "end"; // unreachable
            } catch (NullPointerException e) {
                result += "npe";
                throw new RuntimeException();
            } finally {
                result += "finally"; // always execute even if the RuntimeException is thrown from the catch block
                throw new Exception(); // causing to execute outer catch block always.
            }
        } catch (Exception e) {
            result += "finished";
        }

        return result;
    }
}
