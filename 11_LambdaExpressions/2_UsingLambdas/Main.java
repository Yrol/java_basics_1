
/*
 * Lambdas are working with functional interfaces (interface with one method)
 */
import java.util.ArrayList;
import java.util.List;

class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String getType() {
        return type;
    }
}

// Functional interface
interface CheckAnimal {
    boolean check(Animal animal);
}

// Functional interface
interface AnotherCheck {
    boolean check(Animal first, Animal second);
}

class CheckCanJump implements CheckAnimal {

    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Dog", true, true));

        /*
         * Lambda expressions using blocks
         * - Blocks must be used when there are multiple statements.
         */

        // block is optional since there's only one statement.
        print(animals, (Animal animal) -> {
            return animal.canSwim();
        });

        // the above can be written as:
        print(animals, animal -> animal.canSwim());

        // Lambda expressions using blocks - bl
        print(animals, (Animal animal) -> {
            // Animal animal = new Animal("Bear", false, true); // Won't compile since
            // variable animal is already in arguments
            System.out.println("Checking animal=" + animal.getType());
            return animal.canJump();
            // return animal; // INVALID since CheckAnimal returns boolean
        });

        /*
         * Example with multiple arguments.
         */

        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);

        // Ex1: single line. Passing fish & rabbit as first and second arguments
        // Will give false since one is true and the other is false (false && false =>
        // false)
        print(fish, rabbit, (first, second) -> first.canJump() && second.canSwim());

        // Ex2: (true && true => true)
        print(rabbit, dog, (first, second) -> first.canJump() && second.canJump());

    }

    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }
        System.out.println("");
    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }
}
