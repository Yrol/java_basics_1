import java.util.Arrays;

public class Main {

        /*
         * - In Java, arrays are row major - the rows are first.
         * - 1D array - One row of data.
         * - 2D arrays - every element in array is an array.
         * - Symmetrical 2D arrays - same number of columns for each row (like a table).
         * - Asymmetrical 2D arrays - different number of columns for each row.
         * - 3D array - 3D array is an array of 2D arrays. Rows of 3D array can vary as
         * 2D arrays.
         * More info:https://www.programiz.com/java-programming/multidimensional-array
         */

        public static void main(String[] args) {

                // 1D array
                int[] myArray = new int[3];

                /*
                 * 2D array
                 */

                // creation
                int[][] my2DArray = new int[2][4]; // 2 rows and 4 columns
                int another2DArray[][] = new int[3][6];
                int[] my2DArrayTwo[] = new int[2][3]; // not a good practice
                // int[][] java = new int[][]; //Invalid as dimension must be provided.
                // int[][] java = new int[][6]; // Invalid as first array (rows) must have
                // dimension.

                // create and initialize 2D Arrays

                // Empty array examples
                int[][] emptyMultiArray1 = new int[][] { {} };
                int[][] emptyMultiArray2 = { {} };

                // Ex1: Asymmetrical 2D array
                String[][] my2DArrayThree = new String[][] {
                                { "One", "Two" }, // 1st row 2 elements
                                { "Three", "4", "5" }, // 2nd row 3 elements
                                { "Six", "Seven", "Eight", null }, // 3rd row 3 elements
                                null // 4th row null
                };

                // Ex2: Symmetrical 2D array (2 rows and 3 columns) - fixed sizes
                int[][] numberTable = new int[2][3];
                numberTable[0][0] = 1; // 1st row 1st column
                numberTable[0][1] = 2; // 1st row 2nd column
                numberTable[0][2] = 3; // 1st row 3rd column
                // numberTable[0][3] = 4; // will cause index out of bound since 3 columns
                // initialized

                /*
                 * 3D array
                 * consist of pages, columns and rows
                 */

                // creation of 3d arrays

                // Invalid scenarios
                // int[][][] tesla = new int[][][]; // Invalid as dimension must be provided.
                // int[][][] tesla = new int[][8][9]; // Invalid as first array must have
                // dimension.

                // Ex1:
                int[][][] my3dArray = new int[3][3][3]; // 3 pages, 3 columns & 3 rows
                my3dArray[0][0][0] = 1; // setting value page 1, row 1, col 1

                // Ex2:
                int oneMore3dArray[][][] = new int[2][2][2]; // 2 pages, 2 columns & 2 rows

                // Ex3:
                int[] another3dArray[][]; // 2 pages, 3 columns & 3 rows

                // create and initialize 3D arrays
                int[][][] my3dArrayTwo = new int[][][] {
                                {
                                                { 1, 2, 3 }, // row 1
                                                { 4, 5, 6 }, // row 2
                                                { 7, 8, 9 } // row 3
                                }, // page 1
                                {
                                                { 10, 11, 12 }, // row 1
                                                { 13, 14, 15 }, // row 2
                                                { 16, 17, 18 } // row 3
                                } // page 2
                };
        }
}
