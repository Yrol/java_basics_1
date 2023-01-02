
/*
 * Example of recursive constructor
 * - We can't have two constructors calling each other using the keyword "this()".
 */
class Cat {

    private String name;

    // The following won't compile
    // public Cat() {
    // this("Tom");
    // }

    // public Cat(String name) {
    // this();
    // this.name = name;
    // }
}

/*
 * Example of using this & this()
 */

class Dog {

    private String name;

    public Dog() {
        this("Tommy");
    }

    public Dog(String theName) {
        String name = "Jimmy";
        name = "Tommy";
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getName());
    }
}
