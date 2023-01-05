/*
 * - Basic inheritance example with non-argument constructors.
 * - If no super() is defined, compiler will inject the no-argument constructor automatically.
 */

// Animal class will automatically extends the Java's Object class
class Animal {
    public Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    public Dog() {
        // super(); // Not necessary as Java inject this automatically for the
        // non-argument constructors.
        System.out.println("Dog");
    }
}

class Husky extends Dog {
    public Husky() {
        System.out.println("Husky");
    }
}

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(); // will print [Animal, Dog, Husky] in order since we're calling the parent
                                   // classes.
    }
}
