/*
 * - Default interfaces can only be created within interfaces (not within abstract or normal classes).
 * - Default methods must be marked using the default keyword and they must contain a body (unlike normal interface methods).
 * - Default methods must be public and cannot be marked as private or protected.
 * - Default methods are NOT static final or abstract and can be overridden by the classes that implement it.
 */

package com.yrol;

abstract class Animal {
    // Abstract methods
    protected abstract String thermophysiology();
}

/*
 * Implementing the interfaces which contain default methods
 * - It is optional to override the default methods defined in the interfaces
 */
class Bear extends Animal implements Carnivore, Hebivore {

    // Overriding the eatPlant method in Hebivore interface.
    // @Override
    // public void eatPlant() {
    // System.out.println("Bear eating plants.");
    // }

    // void eatPlant(){} // Doesn't compile as access modifier public is required

    public String thermophysiology() {
        return "Warm-blooded";
    }
}

/*
 * Duplicate default method issue example
 * - The following will not compile since both Run and Walk interfaces have the
 * getSpeed method in common.
 */
// class Dog extends Animal implements Run, Walk {} // Doesn't compile

// Doesn't compile even if we try to override the common method getSpeed()
// class Dog extends Animal implements Run, Walk { public int getSpeed(); } //
// Doesn't compile

// Solution:
// Resolving the Duplicate default method issue by extending the interface in
// another.
class Dog extends Animal implements Run2 {

    // Optionally we can override the getSpeed() method
    public int getSpeed() {
        return 20;
    }

    public String thermophysiology() {
        return "Warm-blooded";
    }
}

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear();
        bear.eatMeat(); // Eating meat.
        bear.eatPlant(); // Bear eating plants. (will print the overridden values)

        Dog dog = new Dog();
        dog.getSpeed(); // 20 (overridden value)

    }
}
