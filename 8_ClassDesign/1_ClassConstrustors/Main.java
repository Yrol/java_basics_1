/*
    * - Constructor is a special method with the same as the class name.
    * - Constructor doesn't have a return type.
    * - Constructors can have 0 to as many arguments.
    * - Constructors are mostly used for instantiating instance variables.
    * - A Java file can have multiple classes and only one class can be public.
    */

class Dog {

    private String color;

    // default constructor Constructor setting the color to brown
    public Dog() {
        color = "Brown";
    }

    public Dog(String color) {
        // "this" keyword is required since we're dealing with method param and class
        // variable color both are the same
        this.color = color;
    }

    public void printColor() {
        // "this" keyword is optional in this case
        System.out.println(this.color);
    }

    // NOT a constructors since it has return type.
    public void Dog() {
    }

}

class Cat {
    private int height;
    private int length;

    public Cat(int height) {
        height = this.height;
    }

    public void printHeight() {
        System.out.println(this.height);
    }

    public void printLength() {
        System.out.println(this.length);
    }
}

/*
 * Class with private constructors
 * - This class cannot be instantiate EXTERNALLY. It can only be called
 * internally
 * - Mostly used in utility methods with static methods.
 */

class Car {

    private String type;

    private Car() {
        type = "Light Vehicle";
    }

    public Car(String type) {
        // Calling the private constructor above
        this();
    }

    public static void type() {
        Car car = new Car();
        System.out.println(car.type);
    }

    public void getName() {
        System.out.println(type);
    }
}

public class Main {

    public static void main(String[] args) {

        // Using a constructor with no arguments
        Dog dog = new Dog();
        dog.printColor();

        // Using the constructor with one argument
        dog = new Dog("Black");
        dog.printColor();

        Cat cat = new Cat(10);
        cat.printHeight(); // 0 since the value is only initialized.
        cat.printLength(); // 0 since the value is only initialized.

        // Attempting to use private constructor
        // Car car = new Car(); Doesn't compile
        Car.type();

        // Valid since this constructor isn't private and it calls a private constructor
        // inside it
        Car car = new Car("Small Category");
        car.getName();
    }
}
