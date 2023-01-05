/*
 * Abstract methods
 * - Can only be defined in abstract classes.
 * - Cannot be declared as private or final.
 * - Must not provide a method body / implementation in the abstract class which it is declared. This should be done inside the child class.
 * - Implementing an abstract method follows te same rules as overriding methods. Ex: should have the same method signature. Access modifier need to be same or higher.
 * - Abstract methods cannot be declared as final.
 * - Abstract methods cannot be declared as static.
 */

// Abstract class
abstract class Animal {

    // An abstract method
    protected abstract String thermophysiology();

    // Having a body in an abstract method is illegal
    // public abstract void walk(){} // Compilation error

    // Abstract methods cannot be declared as final
    // public final abstract String weight(); // Compilation error.

    // Abstract methods cannot be declared as static
    // public static abstract String weight() // Compilation error

    // Normal method
    protected boolean hasLegs() {
        return true;
    }

}

// Reptile class (child) must implement all the abstract methods in parent
// class.
abstract class Reptile extends Animal {

    // An abstract method
    abstract protected boolean isPoisonous();

    // Implementing the abstract class with lower-level access modifier
    public String thermophysiology() {
        return "Cold-blooded";
    }
}

class Snake extends Reptile {

    @Override
    public boolean hasLegs() {
        return false;
    }

    // implementing the abstract method
    public boolean isPoisonous() {
        return true;
    }

}

public class Main {

    public static void main(String[] args) {
        // Animal animal = new Animal(); Invalid as abstract classes cannot be
        // instantiated - compilation error

        Snake snake = new Snake();
        System.out.println("Is Poisonous? " + snake.isPoisonous());
        System.out.println("Thermophysiology status: " + snake.thermophysiology());
        System.out.println("Has legs? " + snake.hasLegs());
    }
}
