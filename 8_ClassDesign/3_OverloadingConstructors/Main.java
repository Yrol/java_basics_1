/*
 * - A class can have multiple constructors.
 * - A constructor can be overloaded using different parameters (similar to method overloads).
 * - A constructor inside another can be called using the keyword "this()".
 */

class Dog {

    private String name;
    private String breed;
    private double weight;

    // Constructor 1
    public Dog(String name) {

        // Method 1: setting variable values individually
        // this.name = name;
        // breed = "Husky";
        // weight = 25.4;

        /*
         * Method 2:
         * Calling the Constructor 2 within Constructor 1 using "this()".
         * this() MUST be the first statement within the body of this constructor.
         */
        // System.out.println("constructor 1"); // Will cause the following line not to
        // work
        this(name, "Husky");
        System.out.println("Constructor 1");
    }

    // Constructor 2
    public Dog(String name, String breed) {
        // Method 1:
        // this.name = name;
        // this.breed = breed;
        // weight = 30;

        /*
         * Method 2:
         * Calling the Constructor 3 using "this()"
         */
        this(name, breed, 30);
        System.out.println("Constructor 2");
    }

    // Constructor 3
    public Dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("Constructor 3");
    }

    public void printInfo() {
        System.out.println("Name=" + this.name + " Breed=" + this.breed + " Weight=" + this.weight);
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Shaky");
        dog1.printInfo();

        Dog dog2 = new Dog("Tommy", "Chow Chow");
        dog2.printInfo();

        Dog dog3 = new Dog("Jimmy", "Shepard", 55);
        dog3.printInfo();
    }
}
