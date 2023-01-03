/*
 * - super() will be used for calling the parent class.
 * - super() must be the first statement of the constructor's body and cannot be used afterwards.
 * - super() must used - when arguments are expected in the parent class constructor and no non-argument constructor is defined.
 */

class Animal {
    public Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    public Dog(int age) {
        System.out.println("Dog");
    }
}

class Husky extends Dog {
    public Husky(int age) {
        super(age); // require as Animal doesn't have a non-argument constructor
        System.out.println("Husky");

        // super() must be the first statement with the the constructor's body. The
        // following won't compile.
        // System.out.println("Husky");
        // super();

    }
}

// extending the a non-argument constructor class
class Cat extends Animal {

}

/*
 * Invalid scenarios
 */

// Attempting to extend a parent class which has argument constructor- ex1
// class Shepherd extends Dog {} // Doesn't compile

// Attempting to extend a parent class which has argument constructor- ex2.
// Compilation error.
// class Shepherd extends Dog {
// public Shepherd(){

// }
// }

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(2);
    }
}
