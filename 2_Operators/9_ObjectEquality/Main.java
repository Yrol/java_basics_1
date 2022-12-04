public class Main {

    /*
     * Primitives are compared using == operators.
     * Object values are compared using .equals() operator (internal value of obj).
     * When comparing objects we're comparing the memory address of the object.
     * == operators can be used on objects for comparing the memory address.
     */
    public static void main(String[] args) {

        /*
         * Comparing objects
         */

        // -128 to 127
        Integer myInteger1 = 127;
        Integer myInteger2 = 127;
        System.out.println("myInteger1 == myInteger2 when <= 127:" + (myInteger1 == myInteger2));

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

    }
}
