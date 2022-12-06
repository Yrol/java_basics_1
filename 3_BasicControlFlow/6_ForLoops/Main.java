public class Main {
    public static void main(String[] args) {

        // simple for loop
        for (int i = 0; i < 10; i++) { // instead of i++ we can also do i+=1 or ++a
            System.out.println("i=" + i);
        }

        int a;
        for (a = 0; a < 5; a++) {
            // final value of "a" will be 4
            System.out.println(a + " ");
        }
        System.out.println("After for loop a=" + a); // a == 5

        // using different types (long, double, float & etc)
        for (double j = 0; j < 5.5; j += 0.5) {
            System.out.println("j=" + j);
        }

        // infinite for loop
        // for (;;) {
        // System.out.println("Hello");
        // }

        /*
         * Multiple initialization
         */

        // Example 1: using &&
        // as long as the boolean statement:(x < 5 && y < 10) is true the loop will
        // execute
        // z is not used although its legal to add multiple initializers
        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }

        // Example 2: using ||
        // "e" & "f" will increment until the boolean statement becomes false
        // g is not used although its legal to add multiple initializers
        int e = 0;
        for (int f = 0, g = 4; e < 5 || f < 10; e++, f++) {
            System.out.println("e=" + e);
            System.out.println("f=" + f);
        }

        /*
         * Invalid for loops
         */

        // Example 1: won't compile since variable "h" is already declared (duplicate)

        // int h = 10;
        // for (int i = 0, h = 0; e < 10 || h < 10; e++, h--) {}

        // Example 2: incompatible types

        // Won't compile since we're trying to use multiple types (long & int)
        // for(long z = 0, int d = 4; z < 10; z++, d++){}
    }
}
