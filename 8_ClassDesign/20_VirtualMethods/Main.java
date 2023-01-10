/*
 * - Virtual methods are the methods that will be executed / determined during runtime.
 * - In Java, the overridden method will be called (during upcasting) even if the original method is in parent class.
 */

class Animal {

    protected void printDetails() {
        System.out.println("Animal Class");
    }

    protected void printHeight() {
        System.out.println("Average height is:" + 5 + "cm");
    }
}

class Rabbit extends Animal {

    @Override
    protected void printDetails() {
        System.out.println("Rabbit");
    }
}

public class Main {
    public static void main(String[] args) {

        // Upcasting Rabbit to Animal
        Animal animal = new Rabbit();
        animal.printDetails(); // Will execute the overridden version of Rabbit.
        animal.printHeight(); // Will print the superclass (Animal) version since not overridden
    }
}
