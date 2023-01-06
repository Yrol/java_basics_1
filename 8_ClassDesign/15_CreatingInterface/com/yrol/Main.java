/*
 * - Interface can contain constants and by default they're public, static and final. They cannot be change once declared in the interface.
 * - Interfaces can have methods by default they are public and abstract (automatically) and CANNOT be protected or private.
 * - Methods inside interfaces cannot have body (same as in abstract classes).
 * - The annotation @Override is optional to declare.
 */

package com.yrol;

abstract class Animal {

    // Abstract methods
    protected abstract String thermophysiology();

    protected boolean hasLegs() {
        return true;
    }
}

/*
 * Example 1:
 * - Implementing the HasTail interface as well as extending the Animal abstract
 * class.
 * - Notice we're not implementing the getTailLength method in Reptile abstract
 * class but in Snake class. It's not needed to implement the interface methods
 * in Reptile abstract class since interface methods are also abstract by
 * default.
 */
abstract class Reptile extends Animal implements HasTail {

    public String thermophysiology() {
        return "Cold blooded";
    }
}

class PitViper extends Reptile {

    // Overriding the getTailLength method
    @Override
    public int getTailLength() {
        return 0;
    }

    // Attempting without the access modifier: Invalid
    // int getTailLength(){ return 0; } // Compilation error
}

/*
 * Example 2:
 * - Overriding the getTailLength method in both Dog and Husky classes.
 * - Implementing multiple interface HasTail and CanRun.
 */
abstract class Dog extends Animal implements HasTail, CanRun {

    public String thermophysiology() {
        return "Warm blooded";
    }

    // Implementing getTailLength
    public int getTailLength() {
        return 10;
    }
}

class Husky extends Dog {

    // Implementing getTailLength
    public int getTailLength() {
        return 20;
    }

    // implementing the runSpeed in CanRun interface
    @Override
    public void runSpeed(int speed) {
        System.out.println("Husky can run at:" + speed + " kmph.");
    }
}

// Example class that implements an intermediate interface
class Barbet extends Dog implements RunAndSwim {

    public void runSpeed(int speed) {
        System.out.println("Barbet can run at:" + speed + " kmph.");
    }

    public void swimSpeed(int speed) {
        System.out.println("Barbet can swim at:" + speed + " kmph.");
    }

}

public class Main {
    public static void main(String[] args) {
        PitViper pitViper = new PitViper();
        System.out.println(pitViper.getTailLength()); // will print 0

        Husky husky = new Husky();
        System.out.println(husky.getTailLength()); // will print 20
        husky.runSpeed(10);

        Barbet barbet = new Barbet();
        barbet.runSpeed(10);
        barbet.swimSpeed(5);
    }
}
