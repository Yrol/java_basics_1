public class Main {
    public static void main(String[] args) {

        /*
         * charAt, indexOf, length, substring
         */

        /*
         * Substring
         */
        /*
         * p : 0
         * r : 1
         * o : 2
         * g : 3
         * r : 4
         * a : 5
         * m : 6
         * m : 7
         * i : 8
         * n : 9
         * g : 10
         */

        // Ex1:
        StringBuilder sb = new StringBuilder("programming");
        // from first "g" to the "mi". Note: "mi" index is excluded -> "gram"
        String subStr = sb.substring(sb.indexOf("g"), sb.indexOf("mi")); // returns a new String
        int len = sb.length(); // 11 characters in total
        char ch = sb.charAt(5); // a
        System.out.println(subStr + " " + len + " " + ch);

        // Ex2: Invalid - start index must be less than end index
        sb = new StringBuilder("programming");
        // System.out.println(sb.substring(3, 1)); // will throw IndexOutOfBounds
        // exception

        // Ex3: Using the same value for start and end index will return nothing
        System.out.println(sb.substring(2, 2));

        /*
         * append
         */
        // Can append any primitive type
        StringBuilder sb1 = new StringBuilder().append(1).append("L");
        sb1.append("-").append(true);
        System.out.println(sb1);

        // insert - inserting chars at specific Index (NOT replacing the existing)
        StringBuilder sb2 = new StringBuilder("programming");
        sb2.insert(7, "-");
        sb2.insert(2, 2);
        System.out.println(sb2); // pr2ogram-ming

        /*
         * delete - from start(included) to end(excluded) index
         */
        /*
         * p : 0
         * r : 1
         * o : 2
         * g : 3
         * r : 4
         * a : 5
         * m : 6
         * m : 7
         * i : 8
         * n : 9
         * g : 10
         */

        // Ex1:
        sb2 = new StringBuilder("programming");
        sb2.delete(4, 9);
        System.out.println(sb2);

        // Ex2: Invalid - start index must be less than end index
        // sb2.delete(2, 1); // will throw IndexOutOfBounds exception

        // Ex3: using same index for start and end will not change anything
        System.out.println(sb2.delete(2, 2));

        /*
         * Reverse
         */
        StringBuilder sb3 = new StringBuilder("ABC123");
        sb3.reverse();
        System.out.println(sb3); // 321CBA

        String myString = sb3.toString();
        myString = myString.toLowerCase();
        System.out.println(myString);
    }
}
