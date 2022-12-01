class Main {

    /*
     * Unary operator is an operator applied to one operand
     */

    public static void main(String[] args) {
        int x = +3; // + is redundant
        double y = -x; // - is redundant
        System.out.println("x=" + x + " y=" + y);

        x = +x; // 1 * 3
        y = -y; // -1 * 3
        System.out.println("x=" + x + " y=" + y);

        // boolean myBoolean = -true; // won't compile

        /*
         * Pre and post operators
         * ++ and -- operators have higher order than (+,-,*,/, .....)
         */

        // Post - Assign x to g first and then increment x
        x = 3;
        int g = x++;
        System.out.println("g=" + g + " x=" + x);

        // Pre - Increment x first and then assign x to g
        x = 3;
        g = ++x;
        System.out.println("g=" + g + " x=" + x);

        int count = 0;
        System.out.println("count=" + count); // 0
        System.out.println("++count=" + count++); // print 0 and then increment by 1
        System.out.println("count=" + count); // 1
        System.out.println("++count=" + ++count); // increment by 1 (count == 2 now) and then print
        System.out.println("count--" + count--); // print existing count (2) value and then minus 1

        // exam type question 1
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // 4 * 5 / e-- + --e;
        // 4 * 5 / 4 + --e; // e-- is 4 because its post -- and now "e" becomes 3.
        // 4 * 5 / 4 + 2; // --e is 2 because from above line "e" became 3 and since its
        // pre -- it'll be used first
        // 20 / 4 + 2
        // 5 + 2 = 7
        System.out.println("e=" + e + " f=" + f);

        // exam type question 2
        int k = 6;
        int h = 2;
        int i = ++h + --k * 3 + 2 * k++ - h-- % --k;
        // 3 + 5 * 3 + 2 * k++ - h-- % --k; // h = 3 and k = 5
        // 3 + 5 * 3 + 2 * 5 - 3 % --k; // h = 2 and k = 6
        // 3 + 5 * 3 + 2 * 5 - 3 % 5; // h = 2 and k = 5
        // 3 + 15 + 10 - 3
        // 18 + 7 = 25
        System.out.println("k=" + k + " h=" + h + " i=" + i);

        // Pre increment operator - the operator will increment the original value first
        // and then will be return

        // Post increment operator - the original value will be returned first and then
        // value will be incremented

        /*
         * Negation operator (invert the boolean value)
         */
        boolean a = true;
        boolean b = !a;
        System.out.println("a=" + a + " b=" + b);

        b = !b;
        System.out.println("b=" + b);

        // int myInt = !5; // won't compile

    }
}
