/*
 * Instance initializer:
 * - Instance initializer is a code block which can be used for initializing variables (similar to static initializer blocks).
 * - Instance initializers are called before the constructors.
 * - Instance initializer isn't a good practice and the same can be achieved using constructors.
 * 
 * Instance initializer and Static initializer rules:
 * - Static initializers will be called first in the order they're specified.
 * - Instance initializers called after the Static initializers in the order they're defined.
 */

/*
 * Example 1
 */
class Person {

    private String name = "John";

    // An Instance Initializer (will print 2nd)
    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    // Static initializer (will print 1st)
    static {
        System.out.println(COUNT);
    }

    // An Instance Initializer (will print 3rd)
    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Person() {
        System.out.println("constructors");
    }
}

/*
 * Example 2
 */

class Demo {
    // Static initializer:1
    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    // Constructor - will be called last in the sequence
    Demo() {
        add(5);
    }

    // Static initializer:2
    static {
        add(4);
    }

    // Instance initializer:1
    {
        add(6);
    }

    // Static initializer:3
    static {
        new Demo(); // this will result in calling the Instance initializers first and then the
                    // instance itself - Demo() { add(5) }
    }

    // Instance initializer:2
    {
        add(8);
    }
}

public class Main {
    public static void main(String[] args) {

        /*
         * Example 1
         */
        new Person();

        /*
         * Example 2:
         * Will result in printing - 2 4 6 8 5 6 8 5
         * [6 8 5] will be printed twice since there's an inner "new Demo()"
         */
        new Demo();
    }
}
