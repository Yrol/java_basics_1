/*
 * - The methods of parent class can be overridden using the same signature and the return type.
 * - Parent class methods can be overridden using the "super" keyword and @Override annotation (similar to "this" within classes).
 * - calling super is optional if we do so it'll call the parent class method.
 * - The purpose of overriding is to create a different version / implementation of the existing parent class method.
 * - FINAL methods cannot be overridden (similar to not being able to change final variables)
 * 
 * NOTE: Overriding vs overloading methods
 * - Overriding methods have the same method signature (method name and parameters) and same return type.
 * - Overloaded methods are the same method (name) with different type of: (covered in 7_Methods/12_OverloadedMethods)
 * * parameters
 * * number of parameters
 * * return types
 * * Access modifiers
 */

class Animal {

    private int age;
    private String name;
    private double weight;

    protected String country;
    protected String breed;

    public Animal(int age, String breed, String name, String country) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.country = country;
    }

    protected void getInfo() {
        System.out.println("Age:" + age + " Breed:" + breed + " Name:" + name + " Country:" + country);
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

    protected double getAverageWeight() {
        return 10;
    }

    protected double getAverageHeight() {
        return 50;
    }
}

class Dog extends Animal {
    public Dog(int age, String breed, String name, String country) {
        super(age, breed, name, country);
    }

    /*
     * Overriding methods
     */

    // Implanting a method as a final method and cannot be overridden by child
    // methods. Ex: Husky class
    @Override
    protected final double getAverageHeight() {
        // Using the superclass method return value and adding to that.
        return super.getAverageHeight() + 10;

        // INVALID: The following can be done but it'll call the method itself and go
        // into a recursive call. Always need to use "super".
        // return getAverageHeight() + 10;
    }
}

class Husky extends Dog {
    public Husky(int age, String breed, String name, String country) {
        super(age, breed, name, country);
    }

    /*
     * Overriding methods
     */
    @Override
    protected void eat() {
        super.eat(); // Optional and this will result in calling parent class method.
        System.out.println(this.breed + " mostly eat high protein & moderately high fat food.");

        super.eat(); // super can also be called after any other statement.

        // Calling the parent method without "super" will result in a recursive call, So
        // be careful.
        // eat();
    }

    @Override
    protected double getAverageWeight() {
        return 25;
    }
}

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(2, "Husky", "Pepper", "Siberia");
        husky.getInfo();
        husky.eat();
        System.out.println("Average weight:" + husky.getAverageWeight());
        System.out.println("Average height:" + husky.getAverageHeight()); // 50
    }
}
