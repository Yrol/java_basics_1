public class Main {
    public static void main(String[] args) {

        int spaceOnHdd = 5;

        while (spaceOnHdd > 0) {
            spaceOnHdd--;
            System.out.println("spaceOnHdd=" + spaceOnHdd);
        }

        /*
         * Endless loop
         */

        // Ex: 1
        // int x = 2;
        // int y = 5;
        // while (x < 10) {
        // y++;
        // }
        // System.out.println("x=" + x + "y=" + y);

        // Ex: 2
        // int g = 0
        // while(true) {
        // g++;
        // }

        /*
         * While loop that'll never execute
         */
        // Ex: 1
        int a = 5;
        int b = 7;

        while (a > 6) { // will not execute since "a" is not greater than 6 to begin with
            b += 2;
            a++;
        }

        a = a > 6 ? a++ : b--; // executing b--
        // a = b-- -> 7 (since post ++)
        // b = b-- -> 6
        System.out.println("a=" + a + ", b=" + b + ", a + b=" + (a + b));

        // Ex: 2
        // int m = 25;
        // while (false) {
        // m++;
        // }
    }
}
