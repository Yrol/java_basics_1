class Main {

    /*
     * All wrappers start with Capital letters. Ex: Integer, String, Double & etc
     */

    public static void main(String[] args) {

        int myInt = 10;

        /*
         * - Integer class will wrap the primitive integer value.
         * - Integer can hold null values where as int cannot.
         * - Boxing: assigning a primitive value to a wrapper as below.
         * - Autoboxing: Automatically converts a primitive value to the respective
         * wrapper object.
         */

        // Deprecated
        Integer myInteger1 = new Integer(10);

        Integer myInteger2 = Integer.valueOf(10);

        // can also pass integers in string format
        Integer myInteger3 = Integer.valueOf("20");

        // Assigning a primitive directly
        Integer myInteger4 = 20;

        // Similar rules apply as primitive assignments
        // Integer myInteger4 = 20.5; // won't compile
        // Float myFloat = 56.8;

        Float myFloat = 56.8f; // Valid
        // Double myDouble1 = 56.8f; // Invalid, although this is valid in primitive as
        // below (since these are classes and primitives are not).
        double myDouble1 = 56.8f;

        // Holding null values
        Integer myInteger5 = null;

        // Invalid
        // int myiInt2 = null; // won't compile

        System.out.println("myiInteger1=" + myInteger1);
        System.out.println("myiInteger2=" + myInteger2);
        System.out.println("myiInteger3=" + myInteger3);
        System.out.println("myiInteger4=" + myInteger4);
        System.out.println("myInteger5=" + myInteger5);

        /*
         * Unboxing: converting a wrapper to a primitive as shown below
         */

        int myInt3 = myInteger2;

        // Invalid since primitives cannot contain null values
        // int myInt4 = myInteger5; // will throw a NullPointerException

        System.out.println("myInt3=" + myInt3);

        printSum(23, 45); // autoboxing (assigning integers / primitives to wrappers and then do addition)

        printSum(myInteger3, myInteger3); // NOT autoboxing since we're passing wrappers

    }

    private static void printSum(Integer first, Integer second) {
        System.out.println("sum=" + (first + second));
    }
}