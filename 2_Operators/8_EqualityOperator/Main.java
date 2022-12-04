public class Main {

    /*
     * Equality operator: == and !=
     * Comparing two operands and return boolean
     * Can be used for comparing primitives(int, long, double, float & etc),
     * booleans and object (String & ect)
     */

    public static void main(String[] args) {

        // Ex:1
        int a = 5;
        int b = 3;
        boolean c = a == b; // false
        boolean d = a != b; // true
        System.out.println("c=" + c);
        System.out.println("d=" + d);

        // Ex:2
        // boolean g = true == 0; // won't compile
        // boolean h = false != "test"; // won't compile

        // Ex:3
        double myDouble = 5.0;
        float myFloat = 4.0f;
        boolean x = myDouble != myFloat;
        System.out.println("x=" + x);
        myFloat = 5.0f;
        x = myFloat == myDouble;
        System.out.println("x=" + x);

        // Ex:4 - Using equality operator (!=) and assignment operator (=)
        boolean q = false;
        boolean r = false;
        boolean s = (r != true) && (q = true); // the second part (q = true) of the conditional operator (&&) will
                                               // execute since (r != true) is true and "q" will become true
        System.out.println("q=" + q);
        System.out.println("r=" + r);
        System.out.println("s=" + s);
    }
}
