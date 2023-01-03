class Animal {

    private int age; // Only available to this classes
    private String name;

    protected String country; // Available to the classes (child classes) that extends

    public Animal(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    // Method can be access by all child classes
    protected void getInfo() {
        System.out.println("Age:" + age + " name:" + name + " country:" + country);
    }
}

class Dog extends Animal {
    public Dog(int age, String name, String country) {
        super(age, name, country);
        System.out.println("Dog");
        this.country = "Vietnam"; // Accessing the protected vars
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(2, "Rex", "USA");
        dog.getInfo();
    }
}
