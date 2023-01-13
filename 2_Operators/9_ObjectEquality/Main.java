public class Main {

    /*
     * - Primitives are compared using == operators.
     * - Object values are compared using .equals() operator (internal value of obj)
     * - When comparing Integer with int using == operator, the Integer(wrapper)
     * will be converted to primitive. Hence values will be compared always instead
     * of memory location.
     */
    public static void main(String[] args) {

        /*
         * Comparing objects
         */

        // -128 to 127
        Integer myInteger1 = 127; // similar to: Integer myInteger1 = Integer.valueOf(127)
        Integer myInteger2 = 127;
        System.out.println("myInteger1 == myInteger2 when <= 127:" + (myInteger1 == myInteger2)); // true

        // checking the memory location which'll be same for both since <= 127
        System.out.println("myInteger1 memory location:" + System.identityHashCode(myInteger1));
        System.out.println("myInteger2 memory location:" + System.identityHashCode(myInteger2));

        // Greater than 127
        // Integers > 127 will be created as new objects whereas the integers from -128
        // to 127 will be selected from the existing pool of memory locations of Integer
        // class. This is related to valueOf Integer function.
        System.out.println("128 == 128:" + (128 == 128));
        myInteger1 = 128;
        myInteger2 = 128;
        System.out.println("myInteger1=" + myInteger1);
        System.out.println("myInteger2=" + myInteger2);
        System.out.println("myInteger1 == myInteger2 when > 127:" + (myInteger1 == myInteger2));

        // checking the memory location which'll NOT be the same for both since > 127
        System.out.println("myInteger1 memory location:" + System.identityHashCode(myInteger1));
        System.out.println("myInteger2 memory location:" + System.identityHashCode(myInteger2));

        /*
         * Creating integer as new object regardless -128 to 127 or greater described
         * above.
         */
        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        // will return false since the memory locations (object references) are not the
        // same.
        System.out.println("int1 == int2:" + (int1 == int2)); // false
        System.out.println("int1 == int3:" + (int1 == int3)); // false
        System.out.println("int2 == int3:" + (int2 == int3)); // false

        // checking the memory location of the above
        System.out.println("int1 memory location:" + System.identityHashCode(int1));
        System.out.println("int2 memory location:" + System.identityHashCode(int2));
        System.out.println("int3 memory location:" + System.identityHashCode(int3));

        // Using .equals()
        // Comparing the object values (the internal value) instead of object references
        System.out.println("int1 equals(int2):" + (int1.equals(int2))); // true
        System.out.println("int1 equals(int3):" + (int1.equals(int3))); // true
        System.out.println("int2 equals(int3):" + (int2.equals(int3))); // true

        /*
         * Integer(wrapper) vs int(primitive)
         * - Integer will be converted to primitive and the values of left ang right
         * side will be compared always instead of memory location (unlike wrappers).
         */

        // Ex1:
        int myInt = 5;
        Integer myInteger = 5;
        System.out.println("myInt==myInteger:" + (myInt == myInteger)); // true

        // Memory location will be the same since within -128 to 127
        System.out.println("myInt memory location:" + System.identityHashCode(myInt));
        System.out.println("myInteger memory location:" + System.identityHashCode(myInteger));

        // Ex2:
        // Regardless of -128 to 127, the following will be true since it compares
        // values instead of memory locations.
        int myInt2 = 130;
        Integer myInteger3 = 130;
        System.out.println("myInt2==myInteger3:" + (myInt2 == myInteger3)); // true

        // Memory location will be DIFFERENT since NOT within -128 to 127 range
        System.out.println("myInt2 memory location:" + System.identityHashCode(myInt2));
        System.out.println("myInteger3 memory location:" + System.identityHashCode(myInteger3));

        /*
         * Strings
         */

        // both myString1 and myString2 will have the same value.
        String myString1 = "James";
        String myString2 = "James";
        String myString3 = new String("James");
        System.out.println("myString1 equals(myString2):" + myString1.equals(myString2)); // true (comparing object
                                                                                          // value)
        System.out.println("myString1 == myString2:" + (myString1 == myString2)); // true (comparing memory locations)
        System.out.println("myString1 == myString3:" + (myString1 == myString3)); // false (comparing memory locations)
        System.out.println("myString1 equals(myString3):" + myString1.equals(myString3)); // true (comparing object
                                                                                          // value)

        System.out.println("myString1 memory location:" + System.identityHashCode(myString1));
        System.out.println("myString2 memory location:" + System.identityHashCode(myString2));
        System.out.println("myString3 memory location:" + System.identityHashCode(myString3));
    }
}
