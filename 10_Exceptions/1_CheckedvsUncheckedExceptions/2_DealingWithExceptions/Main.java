/*
 * Handling exceptions
 */

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Handling an Unchecked exception (Runtime)
        try {
            int result = devide(a, b);
            System.out.println("result=" + result);
        } catch (ArithmeticException e) {
            e.printStackTrace(); // Printing the stacktrace
            System.out.println("Error dividing:" + e.getMessage());
        }
    }

    private static int devide(int a, int b) {
        return a / b;
    }
}