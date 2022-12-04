class Main {

    /*
     * The arithmetic operators are (mathematical): plus +, minus -, multiply* ,
     * division/, modulus %
     * 
     * Arithmetic operators also include unary operators: increment ++, decrement --
     * 
     * Uses the BODMAS rules: B – Brackets, O – Order of powers or roots, D –
     * Division, M – Multiplication A – Addition, and S – Subtraction. Then solve
     * left to right
     */

    public static void main(String[] args) {

        int result = 3 - 2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3 // result when solve from left to right
        // 5 + 3
        // 8
        System.out.println(result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 4 * 2 + 10 // multiply first
        // 2 + 1 - 8 + 10 // left to right: 2 + 1
        // 3 - 8 + 10 // left to right: 3 - 8
        // -5 + 10 // left to right
        // 5
        System.out.println("result=" + result);

        /*
         * Unary operators
         */

        int a = 4;
        int b = 3 - 2 * --a; // since --a prefix we first need to -1 from "a" (a = a - 1) and then multiply.

        // b = 3 - (2 * 3) // multiply first
        // b = 3 - 6 // left to right
        // b = -3
        // a = 3

        // a will become 3 since --a (similar to: a = a - 1)
        System.out.println("a=" + a + " b=" + b);

        a = 4;
        b = 3 - 2 * a--; // first multiply and then do (a = a - 1)

        // b = 3 - 8
        // b = -5
        // a = 3
        System.out.println("a=" + a + " b=" + b);

        long c = 2;
        long d = 4 + 3 * c++; // multiply and then increment c

        // d = 4 + (3 * 2)
        // d = 4 + 6
        // d = 10
        // c = 3
        System.out.println("c=" + c + " d=" + d);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        // 10 - (3 * 3) - (4 / 4) // from this point, solve left to right.
        // 10 - 3 * 3 - 1
        // 10 - 9 - 1
        // 0
        System.out.println("result=" + result);

        int i = 10;
        int j = 3;

        // Modulus is the remainder of division
        int k = i % j;
        int e = 10 % 2;

        // k = 10 / 3 = 3 | 3 * 3 = 9 | 10 - 9 = 1
        // e = 10 / 2 = 5 | 5 * 2 = 10 | 10 - 10 = 0

        System.out.println("k=" + k + " e=" + e);

        int f = 12;
        int g = 5;
        int h = 2;
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;

        // (12 / 2) - (10 % 7) - (2 * 12) % 5 - (2 * 3); // solving from left to right.
        // *, /, % takes same precedence.
        // 6 - 3 - (4 % 5) - 6
        // 6 - 3 - 4 - 6 // the 4 % 5 = 4 (always result in left value is right is
        // greater than left value)
        // 3 - 4 - 6
        // -1 - 6
        // -7
        System.out.println("m=" + m);

    }
}