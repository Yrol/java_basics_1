public class Main {

    /*
     * Used for replacing simple if-else statement
     * The first operand must be a boolean expression while the second and third can
     * be anything that returns
     */
    public static void main(String[] args) {

        int x = 10;
        int y;

        if (x > 5) {
            y = 2 * x;
        } else {
            y = 4 * x;
        }

        System.out.println("y=" + y);

        // Writing the above using ternary
        y = x > 5 ? (2 * x) : (4 * x);
        System.out.println("y=" + y);

        // Not the same data type
        System.out.println(y > 5 ? 10 : "Test"); // . will work since no assignment
        // int myInt = y > 5 ? 10 : "Test"; // will not work since trying to assign
        // String to int

        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;
        System.out.println("a=" + a);// 2
        System.out.println("b=" + b);// 1
        System.out.println("c=" + c);// 1 (since we've post ++)

        int d = 1;
        int e = 2;
        int f = 3;

        if (d < 10) { // this will execute
            f = d++ < 1 ? e++ : f++; // d = 2, f = 3 (f will be 3 since f = f++ will result in the same value and not
                                     // increment), e = 2

            /*
             * f will be 3 since
             * f = f++ will always be the same value which is 3.
             */
        } else {
            f = (d + e) < 2 ? d++ : e++;
        }

        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
    }
}
