class Main {

    /*
     * Global variables
     * Default initialization of static primitives outside of main methods.
     */
    static int myIntStatic; // by default value will be: 0
    static String myStringStatic; // by default value will be: null
    static double myDoubleStatic; // by default value will be: 0.0
    static boolean myBooleanStatic; // by default value will be: false

    /*
     * Declaring and initialization of non-static primitives outside of main
     * methods.
     */
    int myNormalInt1;
    int myNormalInt2 = 10;

    public static void main(String[] args) {

        // Static variables can be used within the the static method (public static)
        System.out.println("myIntStatic=" + myIntStatic);
        System.out.println("myStringStatic=" + myStringStatic);
        System.out.println("myDoubleStatic=" + myDoubleStatic);
        System.out.println("myBooleanStatic=" + myBooleanStatic);

        // Non static variables cannot be referenced inside a static method (public
        // static void main)
        // System.out.println(myNormalInt1); // will not compile

        /*
         * Local variable declaration and initialization
         */

        int myNumber1;
        // System.out.println("myNumber1=" + myNumber1); // won't work since the
        // variable has only been declared but not initialized as static variable above
        // outside of class

        // initializing in two lines
        int myNumber2; // declaration with a type (int)
        myNumber2 = 98; // initialization
        System.out.println("myNumber2=" + myNumber2);

        // Single line
        float myFloat = 10.6f;
        System.out.print("myFloat=" + myFloat);

        // declaration of multiple variables in single line
        double myDouble1, myDouble2, myDouble3; // method 1
        // double myDouble4; double myDouble5; // method 2 - this will also work

        double myDouble6 = 56.7, myDouble7 = 67.6; // method 3

        // double myDouble8, double myDouble8; // this will NOT compile

        // int myInt1; myInt2; // doesn't compile

        /*
         * ######### Identifiers #########
         * Identifiers are just names for methods, variables and classes.
         * Rules:
         * - Must begin with letters, dollar sign:$ or underscore:_
         * - Cannot start with numbers
         * - Cannot contain @, *
         * - Cannot use Java reserved keywords
         * - case-sensitive
         */

        // Valid
        char flag;
        int $car;
        double _van;
        String $ticket1;
        float item_price;

        // Invalid
        // int 3D_point;
        // String true
        // String name@project;
        // int game*;

        // Not good practice
        char cHar;
        char chaR;

    }
}