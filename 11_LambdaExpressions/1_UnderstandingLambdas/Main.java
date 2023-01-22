/*
 * - A lambda expression is a short block of code which takes in parameters and returns a value.
 * - Lambdas are working with functional interfaces (interface with one method).
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

interface CheckAnimal {
    boolean check(Animal animal);
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

        // Without lambda (using a dedicated interface to filter "can jump")
        print(animals, new CheckCanJump());

        // With lambda (not using a dedicated interface to filter "can swim" )
        print(animals, animal -> animal.canSwim());

        // Using lambda to filter animal that cannot swim - using a block of code
        print(animals, animal -> !animal.canSwim());

    }

    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }
        System.out.println("");
    }
}
