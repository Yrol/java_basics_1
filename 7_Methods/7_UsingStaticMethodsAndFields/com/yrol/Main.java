package com.yrol;

/*
 * - Static methods and variables are being used mostly in helper methods.
 * - Methods can be called directly without instantiating instance objects.
 * - The object state in static is shared among the instances of the caller classes.
 * - An instance method or variable cannot be called within a static method DIRECTLY (vise-versa is true)
 */

public class Main {
    public static void main(String[] args) {
        // Using an instance variable (not necessary although it works)
        Dog husky = new Dog();
        System.out.println(husky.count); // will get a warning since we're accessing static method via an instance

        // Calling directly (proper way)
        System.out.println(Dog.count); // 0

        // Again using an instance variable (not necessary although it works)
        Dog anotherDog = new Dog();
        anotherDog.increamentCounter(); // +1

        Dog.increamentCounter(); // +1

        System.out.println(Dog.count); // 2

        /*
         * Shared example 1
         * Attempting to set to null
         */
        husky = null;
        anotherDog = null;

        // The following will still print 2 since static are shared
        System.out.println(Dog.count);
        System.out.println(husky.count);
        System.out.println(anotherDog.count);

        /*
         * Shared example 2
         */

        Dog.count = 10;
        Dog newDog = new Dog();
        Dog dog2 = new Dog();
        newDog.count = 5;

        // will print 5 since static Dog count is shared among all instances
        System.out.println(Dog.count);
        System.out.println(newDog.count);
        System.out.println(dog2.count);

        newDog.count = 11;

        // will print 11 since static Dog count is shared among all instances
        System.out.println(Dog.count);
    }
}
