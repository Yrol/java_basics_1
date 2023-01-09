/*
 * Polymorphism - an object can take many forms. Means:
 * - Java object can be accessed using the same type of object or using its superclass type.
 * - Or using a reference that implements an interface or through a superclass.
 * - Through casting:
 * - A class will polymorphic when it can be assigned to multiple types.
 * 
 * More on upcast and downcast: 
 * - https://www.geeksforgeeks.org/upcasting-vs-downcasting-in-java/
 * - https://www.youtube.com/watch?v=HpuH7n9VOYk
 */

package com.yrol;

abstract class Animal {
    protected void genus() {
        System.out.println("Canis");
    }
}

class Dog extends Animal implements HasTail {

    // Overriding HasTail method
    public double getLength() {
        return 2;
    }
}

class Cat extends Animal implements HasTail {

    @Override
    public double getLength() {
        return 2;
    }

    @Override
    protected void genus() {
        System.out.println("Felis");
    }

}

class Bird {

}

class Eagle extends Bird {

}

class Husky extends Dog implements CanRun {

    @Override
    public void runSpeed(double speed) {
        System.out.println("Husky can run at:" + speed);
    }

    // child method available only to child not to parent.
    public void huskyOnlyMethod() {
        System.out.println("Husky only method");
    }
}

public class Main {

    public static void main(String[] args) {
        Husky husky = new Husky();

        // Upcasting (as Dog is a superclass of Husky)
        Dog dog = husky; // Another reference to husky
        dog.genus();
        // dog.huskyOnlyMethod(); // Compile error as trying to access child class only
        // method.

        // Using interfaces
        HasTail hasTail = husky; // Another reference to husky
        System.out.println("Has tail:" + hasTail.getLength());

        // Using interfaces
        CanRun canRun = husky; // Another reference to husky
        canRun.runSpeed(5);

        Object object = husky; // Another reference to husky

        /*
         * Upcasting - taking an object and cast it to one of its superclass / parent
         * class type. Upcasting can be done implicitly (no casting is needed, although
         * Can be done optionally).
         */
        Animal animal = husky; // Another reference to husky
        animal.genus(); // will print Canis

        // animal.huskyOnlyMethod(); // Compile error. Can only be accessed

        // Invalid
        // Dog shepherd = new Animal(); // Won't compile as Dog is child class of Animal

        /*
         * Downcasting - taking an object and cast it to one of its child class types.
         */
        // Explicit casting: ex2 - since compile error with - Child c = new Parent();
        Animal myDog = new Dog();
        // Dog rottweiler = myDog; // Won't compile
        Dog rottweiler = (Dog) myDog;

        // Down casting: ex2 - Explicit casting
        Husky myHusky = (Husky) animal;
        myHusky.huskyOnlyMethod();

        // Ex3: trying with objects in different hierarchies
        Animal cat = new Cat();
        // Cat myCat = cat; Doesn't compile - cannot convert Animal to Cat
        Cat myCat = (Cat) cat;

        // Dog newDog = cat; // Doesn't compile - Since different children of Animal
        // class
        Dog newDog = (Dog) cat;

        /*
         * Referencing polymorphic with non-polymorphic classes
         */
        Bird bird = new Bird();
        Object birdObject = bird;
        Eagle eagle = new Eagle();

        birdObject = eagle;
        bird = eagle; // Up-casting
        eagle = (Eagle) bird; // down casting
    }
}
