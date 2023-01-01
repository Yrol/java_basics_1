/*
    * - Constructor is a special method with the same as the class name.
    * - Constructor doesn't have a return type.
    * - COnstructors can have 0 to as many arguments.
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

public class Main {

    public static void main(String[] args) {

        // Using the default constructor
        Dog dog = new Dog();
        dog.printColor();

        // Using the constructor with one argument
        dog = new Dog("Black");
        dog.printColor();

        Cat cat = new Cat(10);
        cat.printHeight(); // 0 since the value is only initialized.
        cat.printLength(); // 0 since the value is only initialized.
    }
}
