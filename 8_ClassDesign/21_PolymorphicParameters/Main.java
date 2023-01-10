class Animal {

    protected String name;
    protected int age;

    public Animal() {
        System.out.println("Animal constructor called.");
    }

    public Animal(int age) {
        this.age = age;
    }

    protected void printDetails() {
        System.out.println("Animal details");
    }

    protected void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    protected void printDetails() {
        System.out.println("Dog name:" + this.name + ". Dog age:" + this.age);
    }

}

class Cat extends Animal {

    @Override
    protected void printDetails() {
        System.out.println("Cat name:" + this.name);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(3); // Will not call the animal constructor
        dog.setName("Rex");

        Cat cat = new Cat(); // Will call the Animal default constructor
        cat.setName("Tom");

        // Using polymorphic parameters with a static method to print details of an
        // animal
        printDetails(dog);
        printDetails(cat);

        // Using return type
        Animal simba = createAnimal("Cat", "Simba", 0);
        printDetails(simba);

    }

    public static void printDetails(Animal animal) {
        animal.printDetails(); // Will call the overridden printDetails (if any) if child class is provided as
                               // a param
    }

    public static Animal createAnimal(String type, String name, int age) {
        if (type.equals("Cat") || type.equals("cat")) {
            Animal cat = new Cat(); // Upcasting
            cat.setName(name);
            return cat;
        }

        Animal dog = new Dog(age); // Upcasting
        dog.setName(name);
        return dog;
    }
}