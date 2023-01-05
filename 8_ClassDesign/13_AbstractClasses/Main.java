/*
 * Abstract classes
 * - The purpose of abstract classes is to make sure the core functionality remains unchanged but can be extended.
 * - Classes that are abstract CANNOT be instantiated (cannot create instances).
 * - Abstract methods - will ensure the child methods will implement the abstract methods.
 * - Abstract classes or methods cannot be final.
 */

// Invalid - abstract classes cannot be final
// abstract final class Animal {} // Compilation error

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
