class Main {

    /*
     * Compound Assignment Operators
     * Applies to both sides - left and right.
     * Store the result into left side variable
     * Compound operators assign values immediately while calculating unlike (-- or
     * ++ in unary operators)
     */

    public static void main(String[] args) {
        int x = 3;
        int z = 2;

        x = x * z; // Simple operator NOT a compound operator. Now x = 6
        x *= z; // Compound operator and shorter form of x = x * z

        System.out.println("x=" + x);

        // int a += 5; // won't compile
        long a = 10;
        int b = 4;
        // b = b * a; // won't compile since the result is promoted to long and then try
        // to assign to int.

        // Casting the above to work.
        b = (int) (a * b); // Equals to b *= a
        b *= a;
        System.out.println("b=" + b);

        long c = 4;
        long d = (c = 2); // shorter form of c = 2; d = c;

        // Now "c" will be 2 NOT 4 when we print and will also be 2
        System.out.println("c=" + c + " d=" + d);

        long e = 3;
        long f = 2;
        long h = 1;
        long i = e + 3 * (f = 3) - (h -= 2);
        // 3 + 3 * 3 - (-1) // h = -1; f = 3;
        // 3 + 9 + 1
        // i = 13
        // e = 3
        // f = 3
        // h = -1
        System.out.println("i=" + i);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println("h=" + h);
    }
}
