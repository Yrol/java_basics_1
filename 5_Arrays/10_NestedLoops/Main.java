import java.util.Arrays;

public class Main {

    /*
     * Nested loops are used for iterate over multidimensional arrays
     */
    public static void main(String args[]) {

        // Simple nested loop
        for (int hours = 1; hours <= 6; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                // System.out.println(hours + ":" + minutes);
            }
        }

        int[][] myArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Following will print the array objects (not the actual array values)
        System.out.println("myArray length=" + myArray.length);
        System.out.println(Arrays.toString(myArray));

        // print multidimensional arrays using for loop

        // Ex1: printing the entire array with labels
        OUTER: for (int[] rowArray : myArray) {
            INNER: for (int i = 0; i < rowArray.length; i++) {
                System.out.print(rowArray[i] + " ");
            }

            System.out.println();
        }

        // Ex2: printing with conditions and continue (will print 1,3,5,7 & 9)
        OUTER: for (int[] rowArray : myArray) {
            INNER: for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    continue INNER;
                }
                System.out.print(rowArray[i]);
            }
            System.out.println();
        }

        // Ex3: printing with conditions and break (will print 1, an empty line & 7)
        OUTER: for (int[] rowArray : myArray) {
            INNER: for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    // break; will break loop it belongs which is INNER
                    break INNER;
                }

                System.out.print(rowArray[i] + " ");
            }

            System.out.println("");
        }

        System.out.println();

        // Ex4: using do-while loop nested
        int x = 10;
        OUTER: while (x > 0) {
            INNER: do { // executes at least once after the OUTER while loop is executed.
                // executed until x == 5
                x -= 1;
            } while (x > 5);
            x--;
            System.out.println(x);
        }
    }
}
