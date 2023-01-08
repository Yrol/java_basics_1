package com.yrol;

abstract class Animal {
    protected abstract String thermophysiology();
}

// Implementing the static methods
class Rabbit extends Animal implements Hop {

    public String thermophysiology() {
        return "Warm-blooded";
    }

    // Using the static interface method from the Hop interface.
    public void printRabbitDetails() {
        System.out.println("Rabbit average jump height is:" + Hop.averageJumpHeight());
    }
}

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        System.out.println("Thermophysiology:" + rabbit.thermophysiology());
        rabbit.printRabbitDetails();
    }
}
