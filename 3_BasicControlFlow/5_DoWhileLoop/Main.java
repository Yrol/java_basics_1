public class Main {

    /*
     * Do while is similar to while loop, but guarantees that "do" executes at least
     * once. Hence it'll check the while loop after executing the "do" block.
     */

    public static void main(String[] args) {

        // Ex of a while loop that'll never execute (but the "do" block will execute)
        int a = 0;
        do {
            a++;
        } while (false);

        System.out.println("a=" + a);

        /*
         * Ex of converting a while loop to a do-while loop int x = 20
         */

        // while
        int x = 20;
        while (x > 10)
            x--;
        System.out.println("x=" + x);

        // do-while
        x = 20;
        do {
            x--;
        } while (x > 10);
        System.out.println("x=" + x);

        // Another example
        int y = 10;
        int z = 5;
        while (y < 20) {
            y++;
            z += 2;
            y += 10;
        }

        // loop will execute only once since it adds 10 to "y" within the loop
        // z = 7
        // y = 30

        System.out.println("z=" + z);
        System.out.println("y=" + y);

        // Another example (similar to above)
        y = 10;
        z = 5;
        while (y < 20) {
            y++;
        }

        z += 2;
        y += 10;

        // z =7
        // y = 30

        System.out.println("z=" + z);
        System.out.println("y=" + y);

        // Another example - infinite loop
        int number = 10;
        // while (number > 10) { // won't execute since number is 10 and not greater
        // number--;
        // }

        // do {
        // number--;
        // while (number > 5) { // will cause an infinite loop since number is 10 keep
        // incrementing
        // number += 1;
        // }
        // } while (number < 10);

        // System.out.println("number=" + number); // will not be printed

        // Another example - infinite loop same as above with some minor changes
        number = 10;
        while (number > 10) { // won't execute since number is 10 and not greater initially
            number--;
        }

        do { // will cause an infinite loop after the child loop is executed (since
             // number becomes less than 10)
            number--; // number = 9
            while (number > 5) {
                number -= 2;
            }
        } while (number < 10);

        System.out.println("number=" + number); // will not be printed

    }
}
