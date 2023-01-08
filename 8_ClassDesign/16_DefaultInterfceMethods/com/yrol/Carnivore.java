package com.yrol;

public interface Carnivore {

    // default method
    default void eatMeat() {
        System.out.println("Eating meat.");
    }
}
