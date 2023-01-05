/*
 * super vs super()
 * - Super() call is a statement that call the parent constructor and it needs to be the first line of the constructor.
 * - Super keyword is used to call the members (methods) defined in parent class and it doesn't have to be the first line.
 */

class Animal {

    private int age;
    protected String name;

    public Animal() {

    }

    public Animal(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(int age) {
        super(age);
    }
}

class Rabbit extends Animal {

    // Constructor 1
    public Rabbit() {
        // super; Invalid and compilation error
        // super(); // Valid but not necessary since compiler injects it automatically.
        // this(); Invalid as it causes a recursive (calling the constructor itself
        // indefinitely)
        this(4); // Valid as it calls the Constructor 2 below.

        super.setAge(3); // Valid
        this.setAge(7); // Valid
    }

    // Constructor 2
    public Rabbit(int age) {
        // this(age); // Invalid as "this" calls to itself and it never ends.
        // Compilation error.

        super(); // calls the no argument constructor of Animal class.

        // this(); // Valid - Calling the above no argument constructor 1 (within
        // Rabbit). Needs to be the first line.

        // It is invalid to have both "super()" and "this()" at the same time. since
        // they both need to be in the first line.
        // this();
        // super();

        this.setAge(age); // Referring to the setAge method in parent Animal class.

        this.getName(); // Referring to the overridden method below.
    }

    @Override
    public String getName() {
        return "Rabbit:" + name;
    }

}

class Husky extends Dog {
    public Husky(int age) {
        super(age);
    }
}

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        System.out.println(rabbit.getAge());
    }
}
