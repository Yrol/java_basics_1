public class Main {

    /*
     * The + operator will be used for concatenation of Strings.
     * Rules:
     * - If two numbers that means addition.
     * - If one string and the other integer that means concatenation
     * - The expression is always evaluated from left to right
     */

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = new String("Hello2"); // Valid but not necessary

        // String myNumber = 5 + 5; // Invalid won't compile

        // Ex1: concatenation
        int myInt = 5;
        System.out.println("String + int=" + string1 + myInt);

        // Ex2: //left to right, so addition first and then String concat - 3D
        System.out.println(1 + 2 + "D");

        // Ex3: exam type question - will print 64 when going from left to right.
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);
        // left to right rule applies
        // 1 + 2 + 3 = 6
        // 6 + "4" = "64"

        // Ex4: exam type question - will print result=1024 when going from left to
        // right.
        int number = 10;
        int anotherNumber = 20;
        System.out.println("result=" + number + anotherNumber);
        // left to right rule applies
        // "result=" + 10 = "result=10"
        // "result=10" + 20 = "result=1020"

        // to print 30 as result, we need to use brackets
        System.out.println("result=" + (number + anotherNumber));

        // Ex5: concat strings using loops
        String str = "";

        for (int i = 0; i < 10; i++) {
            str += i + " ";
        }

        System.out.println(str);
    }
}
