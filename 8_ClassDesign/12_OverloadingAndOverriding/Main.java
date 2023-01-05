/*
 * Both overloading and overriding involved in redefining a methods with the same name.
 *  Difference between overloading and overriding methods are:
 * - Overloading methods uses different parameter types (different signature).
 * - Overriding methods uses same parameter and return type (same signature).
 */

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int amount) {
        System.out.println("Bird is eating " + amount + " units of food.");
    }
}

class Eagle extends Bird {

    // An overloaded method "fly" from parent Bird class. Notice the return type
    // change from void to int
    public int fly(int height) {
        System.out.println("Eagle is flying at " + height);
        return height;
    }

    // Although "@Override" annotation isn't used here, this is an Overridden method
    // automatically since it matches exact same signature of "eat" method defined
    // in parent Bird.
    public void eat(int amount) {

    }

}

class Reptile {
    protected boolean hasLegs() {
        return true;
    }

    protected double getWeight() {
        return 2.0;
    }
}

class Snake extends Reptile {

    // Overriding hasLegs in parent
    @Override
    protected boolean hasLegs() {
        return false;
    }

    // Overriding getWeight method in parent with some higher access (protected to
    // public)
    @Override
    public double getWeight() {
        return 10;
    }

    // Attempting to override teh method with lower access - protected to private.
    // The following isn't valid
    // @Override
    // private double getWeight() {
    // return 9;
    // }
}

public class Main {

}
