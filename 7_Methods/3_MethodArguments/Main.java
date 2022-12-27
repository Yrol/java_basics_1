public class Main {

    /*
     * A method can have zero or more arguments.
     * Method params are separated by commas.
     * Method body is required
     */

    // Ex1: Method with zero arguments
    int getInt() {
        return 0;
    }

    // Ex2: Method with one arguments
    static int getInt2(int num) {
        return num++;
    }

    // Ex3: Method with 2 arguments (dyadic)
    static int getInt3(int a, int b) {
        return a + b;
    }

    // Ex4: Method with 3 arguments (triadic)
    static int getInt4(int a, int b, int c) {
        return a + b / c;
    }

    // Ex5: Invalid: need to be separated by commas
    // double getDouble(double a; double b){} // Won't compile

    // Ex6: Invalid method body is required
    // void myMethod(); Missing method bod doesn't compile

    public static void main(String[] args) {
        System.out.println(getInt2(7)); // will return 7 since post ++
    }
}
