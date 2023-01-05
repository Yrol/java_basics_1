/*
 * Abstract classes
 * - The purpose of abstract classes is to make sure core functionality remains unchanged but can be extended.
 * - Classes that are abstract CANNOT be instantiated (cannot create instances).
 * - Abstract methods - will ensure the child methods will implement the abstract methods.
 */

// Abstract class
abstract class Animal {

    protected boolean hasLegs() {
        return true;
    }
}

class Reptile extends Animal {

    protected boolean isPoisonous() {
        return false;
    }
}

class Snake extends Reptile {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean isPoisonous() {
        return false;
    }

}

public class Main {
    // Animal animal = new Animal(); Invalid as abstract classes cannot be
    // instantiated - compilation error
}
